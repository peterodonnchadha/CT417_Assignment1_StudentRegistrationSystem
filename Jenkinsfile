pipeline {
    agent any
	
	tools {
	 gradle 'gradle'
	}

    stages {
        stage('Compile Stage') {
            steps {
			 echo 'Compiling and building the projectt.'
		     bat "gradlew compileJava"

            }
        }
        stage('Testing stage') {
            steps {
			echo 'Testing the project'
		     bat "gradlew test" //--tests StudentTest"
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
