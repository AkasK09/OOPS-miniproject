# 🏥 Document Management System

A comprehensive Java-based mini project that manages patient appointments and sends automated reminders. This system demonstrates all core Java concepts from 5 units including OOP, Exception Handling, Generics, Multithreading, Networking, JDBC, and GUI programming.

---

## ⚙️ Features

- ✅ **Add and Manage Patients** - Store patient information (ID, name, age, contact)
- ✅ **Add and Manage Doctors** - Store doctor information (ID, name, specialization)
- ✅ **Schedule Appointments** - Book appointments with date/time
- ✅ **Automated Reminders** - Background threads send reminders before appointments
- ✅ **File Logging** - All appointments logged to file with timestamps
- ✅ **Database Integration** - MySQL connectivity via JDBC
- ✅ **Graphical User Interface** - User-friendly Swing GUI
- ✅ **Client-Server Architecture** - Optional networking using sockets
- ✅ **Exception Handling** - Custom exceptions for invalid appointments
- ✅ **Generic Data Management** - Type-safe collections using generics

---

## 🗂️ Folder Structure

```
PatientAppointmentReminderSystem/
├── src/
│   ├── unit1_basics/
│   │   ├── Patient.java
│   │   ├── Doctor.java
│   │   └── Appointment.java
│   ├── unit2_exceptions_streams/
│   │   ├── InvalidAppointmentException.java
│   │   └── AppointmentLogger.java
│   ├── unit3_generics_threads/
│   │   ├── DataManager.java
│   │   └── ReminderThread.java
│   ├── unit4_networking_jdbc/
│   │   ├── DatabaseManager.java
│   │   ├── AppointmentServer.java
│   │   └── AppointmentClient.java
│   └── unit5_gui/
│       └── AppointmentGUI.java
├── lib/
│   └── mysql-connector-j-8.x.x.jar
├── data/
│   └── appointments.log
├── AppLauncher.java
└── README.md
```

---

## 🔧 Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **MySQL Database** (version 5.7 or higher)
- **MySQL Connector/J** (JDBC Driver)
- **IDE**: VS Code, IntelliJ IDEA, Eclipse, or any Java IDE

---

## 📦 Setup Instructions

### 1. Database Setup

Create a MySQL database and table:

```sql
CREATE DATABASE hospital_db;

USE hospital_db;

CREATE TABLE appointments (
    appointment_id INT PRIMARY KEY,
    patient_name VARCHAR(100),
    doctor_name VARCHAR(100),
    appointment_time DATETIME,
    status VARCHAR(50)
);

CREATE TABLE patients (
    patient_id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    contact VARCHAR(20)
);

CREATE TABLE doctors (
    doctor_id INT PRIMARY KEY,
    name VARCHAR(100),
    specialization VARCHAR(100)
);
```

### 2. Download MySQL Connector

1. Download `mysql-connector-j-8.x.x.jar` from [MySQL Official Site](https://dev.mysql.com/downloads/connector/j/)
2. Place it in the `lib/` folder

### 3. Configure Database Connection

Update database credentials in `DatabaseManager.java`:

```java
private static final String URL = "jdbc:mysql://localhost:3306/hospital_db";
private static final String USER = "root";
private static final String PASSWORD = "your_password";
```

---

## 🚀 How to Run

### Using VS Code

1. **Create folder structure**:
   ```bash
   mkdir -p src/unit1_basics src/unit2_exceptions_streams src/unit3_generics_threads src/unit4_networking_jdbc src/unit5_gui lib data
   ```

2. **Compile all files**:
   ```bash
   javac -d bin -cp "lib/*" src/**/*.java AppLauncher.java
   ```

3. **Run the application**:
   ```bash
   # Windows
   java -cp "bin;lib/*" AppLauncher

   # Linux/Mac
   java -cp "bin:lib/*" AppLauncher
   ```

### Using IntelliJ IDEA

1. Open the project folder
2. Add `mysql-connector-j.jar` to project libraries (File → Project Structure → Libraries)
3. Run `AppLauncher.java`

### Using Eclipse

1. Import as existing Java project
2. Add `mysql-connector-j.jar` to Build Path (Right-click project → Build Path → Add External JARs)
3. Run `AppLauncher.java`

---

## 🧠 Concepts Covered

| Unit | Concept | Implementation |
|------|---------|----------------|
| **I** | Classes & Objects | `Patient`, `Doctor`, `Appointment` classes |
| **I** | Constructors | Parameterized constructors in all model classes |
| **I** | Encapsulation | Private fields with getters/setters |
| **I** | Inheritance | (Can extend with PatientRecord hierarchy) |
| **II** | Exception Handling | `InvalidAppointmentException` custom exception |
| **II** | File I/O | `AppointmentLogger` - BufferedReader/Writer |
| **II** | Try-Catch-Finally | Exception handling throughout |
| **III** | Generics | `DataManager<T>` - generic collection manager |
| **III** | Multithreading | `ReminderThread` - extends Thread |
| **III** | Thread Synchronization | Shared resource management |
| **IV** | JDBC | `DatabaseManager` - CRUD operations |
| **IV** | Networking | `AppointmentServer` & `AppointmentClient` |
| **IV** | Sockets | Client-Server communication |
| **V** | Swing GUI | `AppointmentGUI` - JFrame, JPanel, JButton, etc. |
| **V** | Event Handling | ActionListener for button clicks |
| **V** | Layout Managers | BorderLayout, GridLayout |

---

## 📚 Usage Guide

### Adding a Patient

```java
Patient patient = new Patient(1, "John Doe", 30, "123-456-7890");
patientManager.add(patient);
```

### Scheduling an Appointment

```java
LocalDateTime appointmentTime = LocalDateTime.of(2025, 11, 15, 10, 30);
Appointment appointment = new Appointment(1, patient, doctor, appointmentTime);
appointmentManager.add(appointment);
```

### Starting Reminder Thread

```java
ReminderThread reminder = new ReminderThread(appointment, 30); // 30 minutes before
reminder.start();
```

### Viewing Logs

```java
AppointmentLogger.readLogs();
```

---

## 🌐 Client-Server Mode (Optional)

### Start Server:
```bash
java -cp "bin;lib/*" unit4_networking_jdbc.AppointmentServer
```

### Start Client:
```bash
java -cp "bin;lib/*" unit4_networking_jdbc.AppointmentClient
```

Server listens on port 5000 and handles multiple client connections for appointment queries.

---

## 🎯 Key Learning Outcomes

✅ **OOP Principles** - Encapsulation, abstraction, and modularity  
✅ **Exception Safety** - Robust error handling and custom exceptions  
✅ **Type Safety** - Using generics for reusable code  
✅ **Concurrent Programming** - Background reminder threads  
✅ **Database Connectivity** - JDBC operations (INSERT, SELECT, UPDATE)  
✅ **Network Programming** - Socket-based client-server communication  
✅ **GUI Development** - Interactive Swing interface  
✅ **File Operations** - Persistent logging system  

---

## 🐛 Troubleshooting

| Issue | Solution |
|-------|----------|
| `ClassNotFoundException: com.mysql.cj.jdbc.Driver` | Ensure `mysql-connector-j.jar` is in classpath |
| Database connection fails | Check MySQL service is running and credentials are correct |
| Port 5000 already in use | Change port in `AppointmentServer.java` |
| Compilation errors | Verify folder structure matches package declarations |

---

## 📝 Sample Output

```
===== PATIENT APPOINTMENT SYSTEM =====

1. Add Patient
2. Add Doctor
3. Schedule Appointment
4. View All Appointments
5. View Logs
6. Exit

Enter choice: 3

[Reminder] Appointment for John Doe with Dr. Smith in 30 minutes!
[LOG] Appointment scheduled: ID=1, Patient=John Doe, Time=2025-11-15 10:30
```

---

## 🔮 Future Enhancements

- SMS/Email integration for reminders
- Appointment cancellation and rescheduling
- Doctor availability checking
- Patient medical history tracking
- Export appointments to PDF
- Web-based dashboard using servlets

---

## 📄 License

This project is for educational purposes. Free to use and modify.

---

## 👨‍💻 Author

Created as a comprehensive Java learning project covering all 5 units of core Java programming.

---

## 🤝 Contributing

Feel free to fork, improve, and submit pull requests! Suggestions for enhancements are welcome.

---

**Happy Coding! 🚀**
