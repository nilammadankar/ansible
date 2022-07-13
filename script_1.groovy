node {  
    stage('git clone') { 
       git 'https://github.com/nilammadankar/ansible.git'
    }
    stage('Build') { 
       sh 'touch nnn.txt'
    }
    stage('test') { 
       sh 'echo scripted pipeline >> nnn.txt' 
    }
}
