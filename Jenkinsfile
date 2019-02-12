node {
    stage('Hello') {
        echo 'Hello World'
    }
    stage('Goodbye') {
        distributedBuild {
            buildTool = "${tool('Gradle521')}/bin/gradle"
            buildToolArgs = '--continue'
        }
    }
}
