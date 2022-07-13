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
//         stage ('SonarAnalizando') {
//             environment {
//                 scannerHome = tool 'SONAR_SCANNER'
//             }
//             steps {
//                 withSonarQubeEnv('SONAR_LOCAL'){
//                     bat "${scannerHome}/bin/sonar-scanner -e -Dsonar.projectKey=Sistema -Dsonar.host.url=http://localhost:9000 -Dsonar.login=42c823daf7d563807c28131efb4f958371c4f66d -Dsonar.java.binaries=target"
//                 }
//             }
//         }
    }
}

