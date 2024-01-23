#!/usr/bin/env groovy

def call(String name = 'human') {
  bat "Hello, ${name}."
}