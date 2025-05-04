# 📲 Notification System — Live WebSocket Notifications

A **live notification system** built using **Spring WebSocket** to provide real-time notifications for clients. This project uses **Spring Boot** and **WebSocket** for bi-directional communication between server and client.

---

## 🚀 Features

- 🔔 Real-time notifications via WebSocket  
- 🛠 Built with **Spring Boot 3.4+** and **Java 21**  
- 🌐 STOMP (Simple Text Oriented Messaging Protocol) over WebSocket for communication  
- 🔒 Configurable WebSocket endpoints  
- 📦 Built with Maven  

---

## 🛠 Technologies

- Java 21  
- Spring Boot 3.4.5  
- Spring WebSocket  
- Thymeleaf for front-end rendering  
- Maven for dependency management  

---

## 📦 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-username/notification-sys.git
cd notification-sys
```

### 2. Build the project

```bash
mvn clean install
```

### 3. Run the application

```bash
mvn spring-boot:run
```
Once the application is up and running, the WebSocket server will be accessible, and clients can start receiving real-time notifications from the admin.

## 🧑‍💻 API Endpoints

**POST** `/app/sendMessage`:  
Sends a message to all connected clients over WebSocket.

**Example**:  
`POST /app/sendMessage`  
**Payload**: `{ "message": "Hello, world!" }`

This message will be sent to the `/topic/notifications` destination for all connected clients to receive.

---

## 🧑‍💻 WebSocket Configurations

The WebSocket configuration is set up in the `WebSocketConfig` class. Here's how it's structured:

- **STOMP Endpoint**:  
  The `/ws` endpoint is configured for WebSocket connections.

- **Message Broker**:  
  The message broker is configured to send messages to the `/topic/notifications` destination.

---

## ⚙️ Configuration

- **WebSocket Endpoint**: `/ws`  
  This is the endpoint clients connect to for WebSocket communication.

- **Application Destination Prefix**: `/app`  
  All messages sent from the client to the server should be prefixed with `/app`.

- **Topic Destination Prefix**: `/topic/notifications`  
  Clients can subscribe to this topic to receive real-time notifications.

---

## 🧑‍💻 Author

**Mokhtar Lahjaily**

---

## 🌐 Resources

- [Spring WebSocket Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#websocket)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)

