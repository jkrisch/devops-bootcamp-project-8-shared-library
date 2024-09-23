#!/user/bin/env groovy
package com.example

class Docker implements Serializable {
    def script

    Docker(script) {
        this.script = script
    }

    def dockerLogin(String username, String password, ){
        script.echo "login to dockerhub"
        scrip.sh "echo ${password} | docker login -u ${username} --password-stdin"
    }

    def dockerBuild(String repo, String appname, String version){
        script.echo 'building docker image'
        script.sh "docker build -t  ${repo}/${appname}:jma-${version} ."
    }

    def dockerPush(String repo, String appname, String version){
        script.echo "pushing image"
        scrip.sh "docker push ${repo}/${appname}:jma-${version}"
    }

}