def call(String project, String ImageTag, String dockerHubUser){
  sh "docker build -t ${dockerHubUser}/${project}:${ImageTag} . "
}
