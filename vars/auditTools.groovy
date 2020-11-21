def call() {
    node {
      bat '''
        git version
        cf --version
      '''
    }
}
