---

> ✅ **Before pushing this to GitHub**, make sure:
>
> * All 7 images (`1.jpg` to `7.jpg`) are placed in a folder called `screenshots/` inside your project directory.
> * You commit both the `README.md` and the `screenshots/` folder to GitHub.

---

### ✅ Copy the following and paste it into your `README.md`:

````md
# Employee Management System

<h1 align="center">Employee Management System</h1>
<p align="center">
  A Java Swing and MySQL-based desktop application to manage employee records with ease.
</p>

<p align="center">
  <img src="screenshots/3.jpg" alt="Main Dashboard" width="600"/>
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

---

## 📸 Project Screenshots

### Splash Screen

![Splash Screen](screenshots/1.jpg)

### Login Page

![Login Page](screenshots/2.jpg)

### Home Dashboard

![Home Dashboard](screenshots/3.jpg)

### Add Employee Form

![Add Employee](screenshots/4.jpg)

### View Employee Page

![View Employee](screenshots/5.jpg)

### Remove Employee Page

![Remove Employee](screenshots/6.jpg)

### Confirmation Message

![Confirmation Message](screenshots/7.jpg)


Once you’ve done this, follow these steps in Git Bash / terminal from inside your project folder:

```bash
mkdir screenshots
# Then manually copy all your 1.jpg to 7.jpg into the screenshots folder
git add screenshots/ README.md
git commit -m "Added screenshots and final README"
git push
