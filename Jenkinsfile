pipeline {
    agent any

	tools {
		maven 'Maven 3.8.6'
		jdk 'jdk11.0.5'
	}

    stages {

      stage('Build') {
         steps {
            sh "mvn clean install"
         }
      }
        stage('Build image') {
         steps {
               sh "echo ToDo"
//             sh "docker image build -t springboot-devops-sample:0.1 ."
//              sh "docker push ..."
         }
      }

       stage('Deploy build on kubernetes') {
        steps {
            sh "kubectl --kubeconfig /Users/tiagoencarnacao/.kube/config apply -f Kubernetes/app_service.yaml"
            sh "kubectl --kubeconfig /Users/tiagoencarnacao/.kube/config apply -f Kubernetes/app_deployment.yaml"
        }
      }
    }
}