pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/muntinovaa/MicroservicesBackend.git'
                sh './mvnw clean compile'
                // bat '.\\mvnw clean compile'
            }
        }
        stage('Publish') {
            steps {
                sh './mvnw package'
                // bat '.\\mvnw package'
            }
            post {
                success {
                    archiveArtifacts 'target/*.war'
                }
            }
        }
    }
}