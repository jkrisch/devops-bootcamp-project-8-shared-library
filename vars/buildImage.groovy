#!/user/bin/env groovy
import com.example.Docker


def call(String username, String password, String repo, String appname){
    return new Docker(this).buildImage(username, password, repo, appname)
}