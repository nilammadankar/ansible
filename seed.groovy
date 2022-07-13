job('new1') {
    steps {
        shell('echo hello world')
    }
}
job('new2') {
    steps {
        shell('echo welcome')
    }
}
job('new3') {
    steps {
        shell('echo seed job activity')
    }
}
