#!/user/bin/env groovy

def call(username, password, repo, appname){
    echo 'building docker image'
    sh """
        echo ${password} | docker login -u ${username} --password-stdin
        docker build -t ${repo}/${appname}:jma-${params.VERSION} .
        docker push ${repo}/${appname}:jma-${params.VERSION}
    """
}