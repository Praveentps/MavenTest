pipeline{

	agent { docker 'maven:3.5-alpine'}

stages{
	stage('Checkout'){
	steps{
	echo "Hello world!!"
	git 'https://github.com/Praveentps/MavenTest.git'	
	archiveArtifacts artifacts: 'target/*.jar', fingerprint: true	
	}
		
		
	}
	
	stage('Build'){
	
		steps{
		sh 'mvn clean package'
		}
	}
	stage('Deploy'){
	
		steps{
		input 'Do you wish do deploy'
		echo 'deplyoing'	
			
		}
	}
}

}
