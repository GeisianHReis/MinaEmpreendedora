pipeline {
    agent any
    stages {
        stage ('BUildBackend') {
            steps {
                bat 'mvn clean package -DskipTests=true'
            }
        }
        stage ('Testesunitarios') {
            steps {
                bat 'mvn test'
            }
        }
        stage ('Testesunitarios') {
        environment{
            scannerHome = tool 'SONAR_SCANNER'
        }
            steps {
                bat "${scannerHome}/bin/sonar-scanner -e   -Dsonar.projectKey=TesteRede -Dsonar.host.url=http://localhost:9000 -Dsonar.login=1772dd9fb130ab1afb9879f986c0f3702bb3a6f8 -Dsonar.java.binaries=target"
            }
        }
    }
}