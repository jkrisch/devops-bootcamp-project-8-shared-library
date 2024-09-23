#!/user/bin/env groovy
import com.example.Docker


def call(String repo, String appname, String version){
    return new Docker(this).dockerBuild(repo, appname, version)
}