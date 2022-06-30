def call (stringname "mavengoal"){
  if (${"mavengoal"} == "build")
  {
    sh "mvn package"
  }
  else if (${"mavengoal"} == "code quality")
  {
    sh "mvn sonar:sonar"
  }
  else if (${"mavengoal"} == "backup")
  {
           sh "mvn deploy"
  }
           
}
