pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choice: ['1.1.0', '1.2.0', '1.3.0'], descriptipn: '') 
        booleanParam(name: 'executeTests', defaultVault: true, description: '')
    }
    
    stages {
        stage('BUILD') {
            step {
                echo 'IT WILL BUILD'
            }
        }
        stage ('Test') {
            when {
                expression {
                    params.executeTests
                }
            }
            step {
                echo 'IT will test'
            }
        }
        stage ('Deploy') {
            step {
                echo 'IT will deploy'
                echo "deploy version ${perams.VERSION}"
            }
        }
    }
}    
