#!/user/bin/env groovy
package com.example

class Docker implements Serializable {
    def script

    Docker(script) {
        this.script = script
    }

    def dockerLogin(String username, String password){
        script.echo "login to dockerhub"
        script.sh "echo ${password} | docker login -u ${username} --password-stdin"
    }

    def dockerBuild(String repo, String appname, String version){
        script.echo 'building docker image'
        script.sh "docker build -t  ${repo}/${appname}:${version} ."
    }

    def dockerPush(String repo, String appname, String version){
        script.echo "pushing image"
        script.sh "docker push ${repo}/${appname}:${version}"
    }

}