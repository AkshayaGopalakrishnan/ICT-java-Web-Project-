E-Banking System
Overview
The E-Banking System is a web-based application designed for bank employees to manage customer accounts and transactions. The key features include:

Login System: Allows employees to securely access the system.
Customer Management: Employees can create new customers, modify existing customer details, and perform transactions.
Transaction History: View detailed transaction records for individual customers.
The project is built using Java with Eclipse EE and follows the MVC architecture. It runs on Apache Tomcat and interacts with a MySQL database.

Setup Instructions
Prerequisites
Eclipse IDE for Java EE Developers
Apache Tomcat 9.x
MySQL or compatible database
Steps to Setup
Clone the Repository:

bash
Copy code
git clone https://github.com/your-repo/ebanking-system.git
Import the Project into Eclipse:

Open Eclipse EE.
Go to File -> Import -> Existing Projects into Workspace.
Select the project folder and click Finish.
Configure Apache Tomcat:

In Eclipse, add Tomcat 9.x as your server.
Set up the project to run on Tomcat.
Database Setup:

Create the required tables in your MySQL database using the schema provided in the project.
Update the database connection settings in the DAO layer (com.smartbank.dao).
Run the Application:

Right-click on the project in Eclipse.
Select Run As -> Run on Server.
Access the app at http://localhost:8080/ebanking/login.
