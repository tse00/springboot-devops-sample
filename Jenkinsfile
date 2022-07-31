pipeline {
    agent any

	tools {
		maven 'default'
		jdk 'default'
	}

    stages {

      stage('Build') {
         steps {
            sh "mvn clean install"
         }
      }
/*       stage('Build and Push Image') {
         steps {
            sh "docker image build -t ${REPOSITORY_TAG} ."
         }
      }

      stage('Deploy build on kubernetes') {
        steps {
            sh "kubectl apply -f Kubernetes/app_service.yaml"
            sh "kubectl apply -f Kubernetes/app_deployment.yaml"
        }
      } */
    }
}