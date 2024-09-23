#!/user/bin/env groovy
import comn.example.Docker


def call(String username, String password, String repo, String appname){
    return new Docker(this).buildImage(username, password, repo, appname)
}