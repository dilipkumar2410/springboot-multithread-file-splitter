# ⚡ Spring Boot Multithread File Splitter

> A high-performance Spring Boot REST API that splits a large text file containing 1 million lines into 50 smaller files using Java Multithreading.

---

## 🧰 Tech Stack

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Multithreading](https://img.shields.io/badge/Java-Multithreading-blue?style=for-the-badge)
![REST API](https://img.shields.io/badge/REST-API-orange?style=for-the-badge)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

---

## 📌 Features

- Split a text file with **1,000,000 lines**
- Generate **50 output files**
- Process files using **Java Multithreading**
- Parallel writing for faster execution
- REST API to trigger the process
- Clean folder-based output generation
- Tested successfully using Postman

---

## 📐 Architecture

```text
Client Request
   ↓
Postman
   ↓
Controller
   ↓
Service Layer
   ↓
Thread Pool Executor
   ↓
50 Threads Writing Files Simultaneously
   ↓
Output Folder
```

---

## 🚀 What I Learned

* Java Multithreading Concepts
* Thread Pool Execution
* File Handling in Java
* Spring Boot REST API Development
* Postman API Testing
* Solving Real-Time Tasks Under Pressure

---

## 👤 Author

**Dilip Kumar**

* GitHub: https://github.com/dilipkumar2410
* LinkedIn: https://linkedin.com/in/dilipkumar2410
* Email: [dilipkumar.coder@gmail.com](mailto:dilipkumar.coder@gmail.com)
