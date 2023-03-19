# springbootwebapi
Deploying a Spring Boot REST API in Azure
This repository contains instructions and resources for deploying a Spring Boot REST API in Azure using Azure App Service.

## Prerequisites
Before you begin, you will need the following:

An Azure account
A Java development environment with Spring Boot installed
A database for storing data (e.g., Azure SQL Database, H2)
## Deploying the Spring Boot REST API in Azure

To deploy the Spring Boot REST API in Azure, follow these steps:

1. Create an Azure App Service for deploying the Spring Boot REST API.
2. Upload the Spring Boot application as a JAR file to the Azure App Service.
3. Configure the Azure App Service by setting environment variables and enabling HTTPS.
4. Test the Spring Boot REST API by sending HTTP requests to the API endpoint. i.e., https://domain_name/live

Detailed instructions for each of these steps can be found in the **`deployment-instructions.md`** file in this repository.

## Resources
This repository contains the following resources:

* **`deployment-instructions.md`**: step-by-step instructions for deploying the Spring Boot REST API in Azure.
* **`architecture-diagram.png`**: an architecture diagram showing the components involved in the deployment.
* **`/src`**: a sample Spring Boot application that can be used for testing db connection and deployment.


License
This project is licensed under the MIT License. See the LICENSE file for details.
