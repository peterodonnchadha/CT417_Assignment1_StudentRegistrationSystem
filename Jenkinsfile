pipeline {
    agent any
	
	tools {
	 gradle 'gradle'
	}

    stages {
        stage('Compile Stage') {
            steps {
			 echo 'Compiling and building the projectt.'
		         bat "gradle compileJava"
            }
        }
        stage('Testing stage') {
            steps {
			echo 'Testing the project'
		        bat "gradle compileJava"
            }
        }
        stage('Deployment Stage') {
            steps {
			 echo 'Deploying the project'
		         bat "gradle war"
            }
        }
    }
}
