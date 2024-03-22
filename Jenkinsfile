node {
    stage("Accesing git") {
        checkout([$class: 'GitSCM'],
            branches: [[name: '$BRANCH']],
                userRemoteConfig
        )
    }
}