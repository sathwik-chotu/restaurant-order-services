# 🍽️ Restaurant & Order Management System  
### Microservices Architecture using Spring Boot

---

## 📌 Project Overview

This project is a **Microservices-based Restaurant and Order Management System** built using Spring Boot.

The system is divided into two independent services:

- 🏬 **Restaurant Service**
- 📦 **Order Service**

Each service runs independently on different ports and communicates via REST APIs.

This project demonstrates:
- Microservices architecture
- Inter-service communication
- RESTful API design
- Database integration
- Swagger API documentation

---

## 🏗️ Architecture

```
Client
   ↓
Order Service (Port: 9999)
   ↓
Restaurant Service (Port: 8888)
   ↓
Database
```

- The **Order Service** fetches restaurant details from the Restaurant Service.
- Services are loosely coupled and independently deployable.

---

## 🛠️ Tech Stack

- ☕ Java
- 🌱 Spring Boot
- 🌐 REST APIs
- 📦 Maven
- 🗄️ MySQL / H2 (whichever you used)
- 📘 Swagger (OpenAPI)
- 🔁 RestTemplate (for inter-service communication)

---

## 🚀 Services & Ports

| Service | Port | Description |
|----------|------|-------------|
| Restaurant Service | 8888 | Manages restaurant details |
| Order Service | 9999 | Manages orders & communicates with Restaurant Service |

---

## 📚 API Documentation (Swagger)

After starting the services:

- Restaurant Service Swagger:  
  `http://localhost:8888/swagger-ui/index.html`

- Order Service Swagger:  
  `http://localhost:9999/swagger-ui/index.html`

---

## 📌 Restaurant Service APIs

- `GET /restaurants` → Get all restaurants  
- `GET /restaurants/{id}` → Get restaurant by ID  
- `POST /restaurants` → Add new restaurant  

---

## 📌 Order Service APIs

- `POST /orders` → Create new order  
- `GET /orders/{id}` → Get order by ID  
- Fetches restaurant details from Restaurant Service  

---

## ⚙️ How to Run the Project

### 1️⃣ Clone the repository

```bash
git clone https://github.com/sathwik-chotu/restaurant-order-services.git
cd restaurant-order-services
```

### 2️⃣ Start Restaurant Service

```bash
cd restaurantservice
mvn spring-boot:run
```

### 3️⃣ Start Order Service (in new terminal)

```bash
cd orderservice
mvn spring-boot:run
```

### 4️⃣ Test using Swagger UI

Open in browser:

- http://localhost:8888/swagger-ui/index.html
- http://localhost:9999/swagger-ui/index.html

---

## 🎯 Key Features

✔ Independent microservices  
✔ RESTful communication between services  
✔ Swagger API documentation  
✔ Clean layered architecture (Controller → Service → Repository)  
✔ Database persistence  

---

## 📈 Future Improvements

- Add API Gateway
- Add Eureka Service Registry
- Add Docker & Docker Compose
- Add Authentication (JWT)
- Deploy to cloud (AWS / Azure)

---

## 👨‍💻 Author

**Sathwik Reddy**

---

## ⭐ Conclusion

This project demonstrates a real-world implementation of microservices architecture using Spring Boot, focusing on scalability, modularity, and service-to-service communication.

---
