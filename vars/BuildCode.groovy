def call(String project, String imageTag, String dockerHubUser) {
    sh "docker build -t ${dockerHubUser}/${project}:${imageTag} ."
    sh "docker images"
    echo "dockerHubUser = ${env.dockerHubUser}"
}
