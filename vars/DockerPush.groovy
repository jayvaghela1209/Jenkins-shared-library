def call(String projectName, String imageTag) {
    withCredentials([
        usernamePassword(
            credentialsId: 'DockerHubCred',
            usernameVariable: 'DOCKER_USER',
            passwordVariable: 'DOCKER_PASS'
        )
    ]) {

        sh "echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin"

        sh "docker push ${DOCKER_USER}/${projectName}:${imageTag}"
    }
}
