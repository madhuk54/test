pipeline {
    agent any  
     environment {
     JAVA_HOME = "C:\\Program Files\\Java\\jdk-21"
        PATH = "${JAVA_HOME}\\bin;${env.PATH}"
     }
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
}
