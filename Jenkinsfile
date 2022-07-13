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
        stage ('SonarAnalizando') {
            withSonarQubeEnv('sonarqube') {
                bat mvn sonar:sonar \
                       -Dsonar.projectKey=MinaEmpreendedora2 \
                       -Dsonar.host.url=http://localhost:9000 \
                       -Dsonar.login=abdcac6d28f9187f0f329fad9d2991339683dbf4
            }
        }
    }
}

