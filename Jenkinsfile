pipeline{

agent any
 
stages{
  
  
 
stage('SCM-Checkout'){
 
 steps{
      

git 'https://github.com/aminthabti95/devdev'

  }
   
 }
  stage('Build'){
  
steps{
  
 echo 'excecuting gradle'
   withGradle(){

   sh'./gradlew -v'
     sh './gradlew clean '
sh './gradlew assemble'
 

 }
  }
 
 }
 
 
 
 
  
}
}

