pipeline {
    agent { docker { image 'gradle:5.1' } }
    stages {
        stage('build') {
            steps {
                sh 'gradle --version'
            }
        }
    }
}
