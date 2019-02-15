node {
    stage('scm') {
        echo "${scm.repositories[0].getURIs()}"
        echo env.GIT_URL
        echo env.GIT_BRANCH
        //checkout scm 
        // Made a change touch    
    }
    stage('Hello') {
        echo 'Hello World'
    }
    stage('Goodbye') {
        echo 'Goodbye cruel world!!!'
    }
}
