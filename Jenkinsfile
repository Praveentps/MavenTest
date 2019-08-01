pipeline{

	agent { docker 'maven:3.5-alpine'}

stages{
	stage('Checkout'){
	steps{
	echo "Hello world!!"
	git 'https://github.com/Praveentps/MavenTest.git'	
	//archiveArtifacts artifacts: 'target/*.jar', fingerprint: true	
	}
		
		
	}
	
	stage('Build'){
	
		steps{
		sh 'mvn clean package'
		}
	}
	stage('Deploy'){
	
		steps{
		//input 'Do you wish do deploy'
		echo 'deplyoing'	
		//sh "nohup java -jar target/MvnTest-0.0.1-SNAPSHOT.jar &"	

		}
	}
}

	       //post {
      //	 always {
     //     mail to:"praveen.talawar1992@gmail.com",
    //        subject:"STATUS FOR PROJECT: ${currentBuild.fullDisplayName}",
   //         body: "RESULT: ${currentBuild.result}"  
  //     }
  //  }
}
