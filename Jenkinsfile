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
//                  bat "${scannerHome}/bin/sonar-scanner -e -Dsonar.projectKey=Sistema -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_3dc201658d3754a24051a42c72d080e6619f5ea0 -Dsonar.java.binaries=target"
//             }
//         }
    }
}


