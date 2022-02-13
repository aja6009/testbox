pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], descriptipn: '') 
        booleanParam(name: 'executeTests', defaultVault: true, description: '')
    }
    
    stages {
        stage('BUILD') {
            steps {
                echo 'IT WILL BUILD'
            }
        }
        stage('Test') {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                echo 'IT will test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'IT will deploy'
                echo "deploy version ${perams.VERSION}"
            }
        }
    }
}    
