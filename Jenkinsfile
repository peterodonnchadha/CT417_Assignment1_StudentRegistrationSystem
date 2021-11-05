pipeline {
    agent any
	
	tools {
	 gradle 'gradle'
	}

    stages {
        stage('Compile Stage') {
            steps {
			 echo 'Compiling and building the projectt.'
<<<<<<< HEAD
		         bat "gradlew compileJava"
=======
			 bat "gradlew compileJava"
>>>>>>> c73a06d (new commit)
            }
        }
        stage('Testing stage') {
            steps {
			echo 'Testing the project'
<<<<<<< HEAD
		        bat "gradlew test"// --tests StudentTest"
=======
			bat "gradlew compileJava"
>>>>>>> c73a06d (new commit)
            }
        }
        stage('Deployment Stage') {
            steps {
			 echo 'Deploying the project'
<<<<<<< HEAD
		         bat "gradle war"
=======
			 bat "gradle war"
>>>>>>> c73a06d (new commit)
            }
        }
    }
}
