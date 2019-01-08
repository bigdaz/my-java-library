pipeline {
    agent { docker { image 'gradle:5.1' } }
    stages {
        stage('build') {
            steps {
                sh 'gradle assemble'
            }
        }
        parallel {
          stage('test') {
              steps {
                  sh 'gradle test'
              }
          }
          stage('test') {
              steps {
                  sh 'gradle help'
              }
          }
        }
    }
}
