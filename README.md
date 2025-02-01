# ** 📌 Spring Boot CRUD Application - Task Management**

## 📖 Project Overview
This is a **Spring Boot CRUD Application** that provides a REST API to manage `Task` entities. It includes functionalities for creating, reading, updating, and deleting tasks. The application follows **modern Spring Boot best practices** and includes **testing with MockMvc**.

## 🛠️ Tech Stack
- **Spring Boot 3+**
- **Spring Data JPA** (Hibernate)
- **Spring Web** (REST API)
- **H2 Database** (In-memory for testing)
- **JUnit 5 & MockMvc** (Unit testing)
- **Lombok** (Simplifies boilerplate code)
- **Spring Boot DevTools** (Hot reload)

## 📌 Features
- ✅ Create a new task
- ✅ Retrieve all tasks
- ✅ Retrieve a single task by ID
- ✅ Update a task
- ✅ Delete a task

## 🚀 Installation & Setup
### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/jaeri/task-management.git
cd task-management
```

### **2️⃣ Build the Project**
Make sure you have **JDK 17+** and **Maven** installed.
```sh
mvn clean install
```

### **3️⃣ Run the Application**
```sh
mvn spring-boot:run
```
The server will start at: `http://localhost:8080`

## 📂 Project Structure
```plaintext
📦 src/main/java/com/example/taskapp
 ┣ 📂 controller     # REST Controllers
 ┣ 📂 service        # Business Logic
 ┣ 📂 repository     # Database Layer (Spring Data JPA)
 ┣ 📂 model          # Entity (Task.java)
 ┣ 📂 dto            # Data Transfer Objects
 ┣ 📜 Application.java  # Main Class

📦 src/test/java/com/example/taskapp
 ┣ 📜 TaskControllerTest.java  # Unit Tests
```

## 📌 API Endpoints
| Method | Endpoint      | Description             |
| ------ | ------------- | ----------------------- |
| GET    | `/tasks`      | Get all tasks           |
| GET    | `/tasks/{id}` | Get task by ID          |
| POST   | `/tasks`      | Create a new task       |
| PUT    | `/tasks/{id}` | Update an existing task |
| DELETE | `/tasks/{id}` | Delete a task           |

### **Example Request (POST /tasks)**
```json
{
  "title": "New Task",
  "description": "Description of the task",
  "status": "IN_PROGRESS"
}
```

## 🛠️ Dependencies (Maven)
```xml
<dependencies>
    <!-- Spring Boot Starter Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Boot Starter JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- H2 Database for Testing -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Lombok -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <scope>provided</scope>
    </dependency>

    <!-- Spring Boot Starter Test (JUnit & MockMvc) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## 🧪 Running Tests
To execute tests using MockMvc:
```sh
mvn test
```

## ✨ Author
Created by **[Jaeri Dias]** 🚀
