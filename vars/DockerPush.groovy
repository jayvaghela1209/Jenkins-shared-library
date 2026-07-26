def call(String Project, String ImageTag, String dockerHubuser){
    withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariale: 'dockerhubPass', usernmeVariable: 'dockerHubUser')]){
        sh "docker login -u ${dockerHubUser} -p ${dockerhubPass}"
    }
    sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
