pipeline{

	agent { docker 'maven:3.5-alpine'}

stages{
	stage('Checkout'){
	steps{
	echo "Hello world!!"
	git 'https://github.com/Praveentps/MavenTest.git'	
	}
		
		
	}
	
	stage('Build'){
	
		steps{
		sh 'mvn clean package'
		}
	}
}

}
