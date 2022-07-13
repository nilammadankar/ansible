node {  
    stage('git pull') { 
        steps {
            git 'https://github.com/nilammadankar/ansible.git'    
        } 
    }
    stage('Test') { 
        steps {
            echo 'new pipeline >> file12'
        } 
    }
    stage('Deploy') { 
        steps {
            echo 'online session >> file12'
        }
         
    }
}