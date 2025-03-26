pipeline {
    agent any

    stages {
        stage('Clone from GitHub') {
            steps {
                git 'https://github.com/madhuk54/test.git'
            }
        }

        stage('Compile Java') {
            steps {
                bat 'javac Stu.java'  
            }
        }

        stage('Run Java Program') {
            steps {
                bat 'java Stu' 
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed. Check logs for errors.'
        }
    }
}

