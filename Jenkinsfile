pipeline{

    environment{
    DATE=new Date().format('yy.M')
    TAG = "${DATE}.${BUILD_NUMBER}"

}

tools{
    maven 'maven'
}

agent any
stages{
    stage("Build"){
        steps{
            sh "mvn -version"
            sh "mvn clean install -DskipTests"
        }
    }

     stage("Build Docker"){
        steps{
           script{
               docker.build("10.1.12.73:5000/arifPaySingleDebitMultipleCreditApi:${TAG}")
           }
        }
    }
    stage("Push Docker Image to Local Registry"){
        steps{
           script{
               docker.withRegistry("http://10.1.12.73:5000"){
                   docker.image("10.1.12.73:5000/arifPaySingleDebitMultipleCreditApi:${TAG}").push()
                   docker.image("10.1.12.73:5000/arifPaySingleDebitMultipleCreditApi:${TAG}").push("latest")
               }
           }
        }
    }
    stage("Deliver for development"){
        when{
            branch "origin/develop"
        }
                 steps{
                    sshagent(['enat-remedy-production']) {
//                     10.1.22.72 10.1.12.70
                    sh 'ssh -o StrictHostKeyChecking=no -l  administrator 10.1.12.70      "docker stop arifPaySingleDebitMultipleCreditApi | true;     docker rm arifPaySingleDebitMultipleCreditApi | true;     docker run -v   -p 6001:8080 -e   -d --restart=always --name arifPaySingleDebitMultipleCreditApi 10.1.12.73:5000/arifPaySingleDebitMultipleCreditApi:${TAG}"'
                }


        }
    }

      stage("Deploy for production"){
        when{
            branch "main"
        }

           steps{
                    sshagent(['enat-remedy-production']) {
                    sh 'ssh -o StrictHostKeyChecking=no -l  administrator 10.1.12.70      "docker stop arifPaySingleDebitMultipleCreditApi | true;     docker rm arifPaySingleDebitMultipleCreditApi | true;     docker run -v   -p 6001:8080  -e "SPRING_PROFILES_ACTIVE=live" -d --restart=always  --name arifPaySingleDebitMultipleCreditApi 10.1.12.73:5000/arifPaySingleDebitMultipleCreditApi:${TAG}"'
                }
            }


    }
}

post{
    always{
        cleanWs()
    }
    failure {
        sh """
        curl -X POST -H "Content-Type: application/json" -d '{"value1":"${JOB_NAME}","value2":"${BUILD_NUMBER}","value3":"Failed"}' https://maker.ifttt.com/trigger/Build_Notification/with/key/c9HE9K84X22YKOKsCiNivz
        """
    }
    success {
        sh """
        curl -X POST -H "Content-Type: application/json" -d '{"value1":"${JOB_NAME}","value2":"${BUILD_NUMBER}","value3":"Successful"}' https://maker.ifttt.com/trigger/Build_Notification/with/key/c9HE9K84X22YKOKsCiNivz
        """
    }

}
}
