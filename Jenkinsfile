pipeline {
    agent any
	
	tools {
	 gradle 'gradle'
	}

    stages {
        stage('Compile Stage') {
            steps {
			 echo 'Compiling and building the projectt.'
            }
        }
        stage('Testing stage') {
            steps {
			echo 'Testing the project'
            }
        }
        stage('Deployment Stage') {
            steps {
			 echo 'Deploying the project'
            }
        }
    }
}