def hasSCM() {
    try {
        scm
        return true;
    } catch (Exception e) {
        return false
    }
}
node {
    stage('scm') {
        if (hasSCM()) {
            echo "SCM is NOT NULL"
            checkout scm
            echo "${scm.repositories[0].getURIs()}"
        } else {
            echo "SCM is NULL"
        }
        echo env.GIT_URL
        echo env.GIT_BRANCH
    }
    stage('Hello') {
        echo 'Hello World'
    }
    stage('Goodbye') {
        echo 'Goodbye cruel world!!!'
    }
}
