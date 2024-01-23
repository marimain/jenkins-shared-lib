#!/usr/bin/env groovy

def call(String name = 'human') {
   pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'echo ruby --version'
            }
        }
    }
}
}