def call (string nodejsgoal){
  if ("$nodejsgoal" == "build"){
    sh "echo building application"
    sh "npm install"
  }
  else if ("$nodejsgoal" == "test"){
    sh "echo testing app for bugs"
    sh "npm run sonar"
  }
  else if ("$nodejsgoal" == "backup"){
    sh "echo backing up artifact in nexus"
    sh "npm publish"
  }
}
