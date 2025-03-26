pipeline {
    agent any  

    stages {
        stage('Clone from GitHub') {
            steps {
                git branch: 'main', url: 'https://github.com/madhuk54/test.git'
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
            echo 'Pipeline execution completed successfully!'
        }
        failure {
            echo 'Pipeline execution failed!'
        }
    }
}
