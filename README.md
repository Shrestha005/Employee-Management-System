# Employee Management System

<h1 align="center">Employee Management System</h1>
<p align="center">
  A Java Swing and MySQL-based desktop application to manage employee records with ease.
</p>

---

## 🚀 Features

- 🆕 Add new employees with details like name, email, phone, etc.
- 👁️ View the complete employee list with real-time database fetch.
- ✏️ Update employee information.
- ❌ Remove employee records securely.
- 🎨 Interactive GUI built using Java Swing.
- 💾 Persistent storage using MySQL database.

---

## 🛠️ Tech Stack & Their Roles

| Technology               | Role in Project                                                                      |
|--------------------------|---------------------------------------------------------------------------------------|
| **Java**                 | Main programming language to develop application logic.                              |
| **Java Swing**           | Builds the graphical user interface (forms, buttons, windows).                       |
| **JDBC (Java Database Connectivity)** | Handles communication between Java and MySQL database.              |
| **MySQL**                | Stores and manages all employee data persistently.                                   |
| **ImageIO & ClassLoader**| Loads image assets like splash screens and icons in the GUI.                         |

---

## 💻 How to Run Locally

### 1. Clone the Repository

```bash
git clone https://github.com/Shrestha005/Employee-Management-System
cd Employee-Management-System
````

### 2. Setup MySQL Database

* Open your MySQL Workbench or terminal and create a database named `ems` (or your preferred name).
* Create the `employee` table using:

```sql
CREATE TABLE employee (
    empID VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100),
    phone VARCHAR(15),
    email VARCHAR(100),
    education VARCHAR(50),
    designation VARCHAR(50),
    address VARCHAR(255),
    aadhar VARCHAR(20)
);
```

### 3. Configure DB Credentials

* Open `conn.java` and replace with your MySQL username and password:

```java
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "your_password");
```

### 4. Compile & Run

Use terminal or any IDE (like IntelliJ, Eclipse, NetBeans):

```bash
javac employee/management/system/*.java
java employee.management.system.Splash
```



![image alt](https://github.com/Shrestha005/Employee-Management-System/blob/5d6e98d94076db2cb577190df4c4aa0e074e8b57/1.jpg)


![image alt](https://github.com/Shrestha005/Employee-Management-System/blob/5d6e98d94076db2cb577190df4c4aa0e074e8b57/2.jpg)


![image alt](https://github.com/Shrestha005/Employee-Management-System/blob/ebbc9363f5e55c042270546b369c53ce8175d86d/3.jpg)


![image alt](https://github.com/Shrestha005/Employee-Management-System/blob/ebbc9363f5e55c042270546b369c53ce8175d86d/4.jpg)


![image alt](https://github.com/Shrestha005/Employee-Management-System/blob/ebbc9363f5e55c042270546b369c53ce8175d86d/5.jpg)


![image alt](https://github.com/Shrestha005/Employee-Management-System/blob/ebbc9363f5e55c042270546b369c53ce8175d86d/6.jpg)


![image alt](https://github.com/Shrestha005/Employee-Management-System/blob/ebbc9363f5e55c042270546b369c53ce8175d86d/7.jpg)
