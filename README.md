# E-Banking System

## Overview

The **E-Banking System** is a web-based application designed for bank employees to manage customer accounts and transactions. Key features include:
- **Login System**: Employees can securely log in.
- **Customer Management**: Employees can create new customers, modify customer details, and perform transactions.
- **Transaction History**: View detailed transaction records for each customer.

The project is developed using **Java** in **Eclipse EE**, follows the **MVC architecture**, and is deployed on **Apache Tomcat**. It connects to a **MySQL** database for storing and retrieving customer, account, and transaction data.

## Setup Instructions

### Prerequisites

- **Eclipse IDE for Java EE Developers**
- **Apache Tomcat 9.x**
- **MySQL** (or compatible database)

### Steps to Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/AkshayaGopalakrishnan/ICT-java-Web-Project-.git
   ```

2. **Import the Project into Eclipse**:
   - Open **Eclipse EE**.
   - Navigate to `File -> Import -> Existing Projects into Workspace`.
   - Select the project folder and click **Finish**.

3. **Configure Apache Tomcat**:
   - In **Eclipse**, add **Tomcat 9.x** as your server.
   - Assign the project to run on the Tomcat server.

4. **Database Setup**:
   - Create the required tables in your **MySQL** database using the provided schema.
   - Update the database connection settings in the `com.smartbank.dao` package to match your environment.

5. **Run the Application**:
   - Right-click the project in Eclipse.
   - Choose `Run As -> Run on Server`.
   - Access the application by navigating to `http://localhost:8080/ebanking/login` in your browser.

---
