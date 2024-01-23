def info(message) {
    echo "INFO: ${message}"
    mail to: 'hehaibo@hotmail.com', subject: "branchcheck plugin build", body: 'This is a mail from branch check library for info'
}

def warning(message) {
    echo "WARNING: ${message}"
}