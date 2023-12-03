pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/muntinovaa/MicroservicesBackend.git'
                sh './mvnw clean install'

            }
        }

    }
}