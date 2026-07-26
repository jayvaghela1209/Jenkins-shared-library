def call(String projectName, String ImageTag, String dockerHubUser){
  withCredentials([
                    usernamePassword('credentialsId':'DockerHubCred',
                    passwordVariable:'dockerHubPass',
                    usernameVariable:'dockerHubUser')]){
                    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }                        
                    sh "docker push ${dockerHubUser}/${projectName}:${ImageTag}"
                
}
