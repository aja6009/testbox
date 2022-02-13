pipeline {
    agent any
    def gv
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '') 
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    
    stages {
        stage('init') {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage('BUILD') {
            steps {
                script {
                    gv.buildAPP()
                }
            }
        }   
        stage('Test') {
            when {
                expression {
                    params.executeTests
                }
            }   
            steps {
                script {
                    gv.testAPP()
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    gv.deployAPP()
                }
            }
        }
    }
}    
