pipeline {
    agent any
    tools {
        maven 'maven_3.9'
    }
    stages {
        stage("pull") {
            steps {
                git url: 'https://github.com/danieln-tmp/kalkulator_java.git', branch: 'master'
            }
        }
        stage("build") {
            steps {
                sh 'mvn clean package'
            }
        }
    }
    post {
        success {
            archiveArtifacts 'target/*.jar'
        }
    }
}
