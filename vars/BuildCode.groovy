def call(String project, String version){
  sh "docker build -t "${project}:"${version}" . "
}
