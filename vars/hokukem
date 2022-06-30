def call (string mavengoal){

if ("${mavengoal}" == "build")
{
sh "mvn clean package"
}
else if ("${mavengoal}" == "test")
{
sh "mvn sonar:sonar"
}
 else if ("${mavengoal}" == "backup")
 {
 sh "mvn deploy"
 }
 }
 
