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
/*        stage('Build and Push Image') {
         steps {
            sh "docker image build -t ${REPOSITORY_TAG} ."
         }
      } */

      stage('Deploy build on kubernetes') {
        steps {
            sh "kubectl apply -f Kubernetes/app_service.yaml"
            sh "kubectl apply -f Kubernetes/app_deployment.yaml"
        }
      }
    }
}