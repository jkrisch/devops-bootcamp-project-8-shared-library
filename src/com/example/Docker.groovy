#!/user/bin/env groovy
package com.example

class Docker implements Serializable {
    def script

    Docker(script) {
        this.script = script
    }

    def buildImage(String username, String password, String repo, String appname, String version){
        script.echo 'building docker image'
        script.sh """
            echo ${password} | docker login -u ${username} --password-stdin
            docker build -t  ${repo}/${appname}:jma-${version} .
            docker push ${repo}/${appname}:jma-${version}
        """
    }
}