node {  
    stage('git pull') { 
        steps {
            git 'https://github.com/nilammadankar/ansible.git'    
        } 
    }
    stage('Test') { 
        steps {
            sh 'echo new pipeline >> file12'
        } 
    }
    stage('Deploy') { 
        steps {
            sh 'echo online session >> file12'
        }
         
    }
}