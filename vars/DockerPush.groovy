def call(String projectName, String ImageTag, String UserName){
  withCredentials([
                    usernamePassword('credentialsId':'DockerHubCred',
                    passwordVariable:'dockerHubPass',
                        usernameVariable:'dockerHubUser')]){
                        sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                        sh "docker image tag ${projectName}:${ImageTag} ${Username}/${projectName}:${ImageTag}"
                        sh "docker push ${env.dockerHubUser}/${projectName}:${ImageTag}"
                }
}
