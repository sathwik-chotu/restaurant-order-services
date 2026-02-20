# 🍽️ Restaurant & Order Management System  
### Microservices Architecture using Spring Boot

---

## 📌 Project Overview

This project is a **Microservices-based Restaurant and Order Management System** built using Spring Boot.

The system consists of two independent microservices:

- 🏬 Restaurant Service
- 📦 Order Service

Each service runs independently on different ports and communicates using REST APIs.

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
Order Service (Port: 8888)
   ↓
Restaurant Service (Port: 9999)
   ↓
Database
```

- The **Order Service** communicates with the Restaurant Service to fetch restaurant details.
- Services are loosely coupled and independently deployable.

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- REST APIs
- Maven
- MySQL / H2
- Swagger (OpenAPI)
- RestTemplate (for inter-service communication)

---

## 🚀 Services & Ports

| Service | Port | Description |
|----------|------|-------------|
| Order Service | 8888 | Handles order creation & retrieval |
| Restaurant Service | 9999 | Manages restaurant data |

---

## 📚 API Documentation (Swagger)

After starting the services:

- Order Service Swagger:  
  http://localhost:8888/swagger-ui/index.html

- Restaurant Service Swagger:  
  http://localhost:9999/swagger-ui/index.html

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

### 2️⃣ Start Order Service

```bash
cd orderservice
mvn spring-boot:run
```

### 3️⃣ Start Restaurant Service (in new terminal)

```bash
cd restaurantservice
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
- Add JWT Authentication
- Deploy to cloud (AWS / Azure)

---

## 👨‍💻 Author

**Sathwik Reddy**

---

## ⭐ Conclusion

This project demonstrates a real-world implementation of microservices architecture using Spring Boot, focusing on scalability, modularity, and service-to-service communication.
