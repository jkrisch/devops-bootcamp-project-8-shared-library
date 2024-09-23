# Jenkins Shared Library

## the standard folder structure of a shared library repo is:

### /vars
* The vars folder contains the functions that we call from the Jenkinsilfe
* Each function is its own Groovy file (but you can also cummulate those into one file)

### /src
* Helper code is container in here (like utility)

### /resources
* Use external libraries
* non groovy files (sql, ps1, etc.)