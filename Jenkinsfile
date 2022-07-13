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
        stage ('Sonar analise') {
            environment {
                scannerHome = tool 'SonarScanner'
            }
            steps {
                withSonarQubeEnv('sonarqube') {
                    bat "${scannerHome}/bin/sonar-scanner -e -Dsonar.projectKey=MinaEmpreendedora -Dsonar.host.url=http://localhost:9000 -Dsonar.login=ef05a4241d370d7f85c82415025f8631ce716e48 -Dsonar.java.binaries=target -Dsonar.coverage.exclusions=**/.mvn/**,**src/test/**,**/model/**,**Application.java"
                }
            }
        }
    }
}


