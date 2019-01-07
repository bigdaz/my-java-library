pipeline {
    agent { docker { image 'gradle:5.1' } }
    stages {
        stage('build') {
            steps {
                sh 'gradle assemble'
            }
        }
        stage('test') {
            steps {
                sh 'gradle test'
            }
        }
    }
}
