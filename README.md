# 🍽️ Restaurant & Order Management System  
### Microservices Architecture using Spring Boot

---

## 📌 Project Overview

This project is a **Microservices-based Restaurant and Order Management System** built using Spring Boot.

The system consists of two independent services:

- 🏬 **Restaurant Service**
- 📦 **Order Service**

Each service runs independently on different ports and communicates via REST APIs.  
The Order Service fetches restaurant details from the Restaurant Service to process orders.

This project demonstrates:

- Microservices architecture
- Inter-service communication
- RESTful API development
- Database integration
- Swagger API documentation

---

## 🏗️ Architecture Diagram

![Architecture Diagram](![Uploading RestaurantOrderArchitecture.png…]()
)

### 🔎 Architecture Flow

```
Client
   ↓
Order Service (Port: 8888)
   ↓
Restaurant Service (Port: 9999)
   ↓
Database
```

- The **Order Service** calls the Restaurant Service using REST APIs.
- Services are loosely coupled and independently deployable.
- Each service follows layered architecture (Controller → Service → Repository).

---

## 🛠️ Tech Stack

- ☕ Java
- 🌱 Spring Boot
- 🌐 REST APIs
- 📦 Maven
- 🗄️ MySQL / H2 Database
- 📘 Swagger (OpenAPI)
- 🔁 RestTemplate (Inter-service communication)

---

## 🚀 Services & Ports

| Service | Port | Description |
|----------|------|-------------|
| Order Service | 8888 | Handles order creation & retrieval |
| Restaurant Service | 9999 | Manages restaurant data |

---

## 📚 API Documentation (Swagger)

After starting the services:

- **Order Service Swagger**  
  http://localhost:8888/swagger-ui/index.html

- **Restaurant Service Swagger**  
  http://localhost:9999/swagger-ui/index.html

---

## 📷 Screenshots

### 📦 Order Service – Swagger UI (Port 8888)

![Order Swagger](screenshots/order-swagger.png)

---

### 🏬 Restaurant Service – Swagger UI (Port 9999)

![Restaurant Swagger](screenshots/restaurant-swagger.png)

---

## 📌 Restaurant Service APIs

- `GET /restaurants` → Get all restaurants  
- `GET /restaurants/{id}` → Get restaurant by ID  
- `POST /restaurants` → Add new restaurant  

---

## 📌 Order Service APIs

- `POST /orders` → Create new order  
- `GET /orders/{id}` → Get order by ID  
- Retrieves restaurant details from Restaurant Service  

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

### 3️⃣ Start Restaurant Service (in a new terminal)

```bash
cd restaurantservice
mvn spring-boot:run
```

### 4️⃣ Test APIs using Swagger

Open in browser:

- http://localhost:8888/swagger-ui/index.html
- http://localhost:9999/swagger-ui/index.html

---

## 🎯 Key Features

✔ Independent microservices  
✔ REST-based service-to-service communication  
✔ Swagger API documentation  
✔ Clean layered architecture  
✔ Database persistence  
✔ Modular and scalable design  

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

This project demonstrates a real-world implementation of microservices architecture using Spring Boot, focusing on scalability, modularity, and independent service deployment.
