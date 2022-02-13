
def buildAPP() {
    echo 'build the project'
}

def testAPP() {
    echo 'build the project'
}

def deployAPP() {
    echo 'build the project'
    sh "deploy version ${params.VERSION}"
}

return this
