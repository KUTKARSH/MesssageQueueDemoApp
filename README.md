# MessageQueueDemoApp

A simple application developed using **Spring Boot** and **RabbitMQ**, following the **Publish-Subscribe (Pub-Sub)** messaging model.

---

## 📌 Overview

This demo showcases a basic setup of message publishing and consuming using RabbitMQ. It exposes:

- ✅ One endpoint for **publishing messages**
- ✅ One endpoint for **consuming messages**

---

## 🛠️ Tech Stack

- **Java**
- **Spring Boot**
- **RabbitMQ**

---

## 🚀 How It Works

1. The **Publisher Endpoint** sends messages to a RabbitMQ exchange.
2. The **Consumer Endpoint** listens to a queue bound to the exchange and processes incoming messages.

---

## 🔧 Setup Instructions

1. Make sure RabbitMQ is running locally (default port `5672`)
2. Build and run the Spring Boot application
3. Use Postman/cURL to test the publisher endpoint
4. Monitor consumer logs for incoming messages


---

## ✉️ Sample Endpoints

- **POST** `/publish`  
  Publishes a message to the exchange.

- **GET** `/consume` *(if applicable for manual trigger)*  
  Fetches or logs consumed messages.

---

## ✅ Purpose

This app serves as a **starter template** or **learning project** for integrating messaging queues into Spring-based microservices.

---

> Feel free to fork, extend, and explore more advanced messaging patterns like fanout, direct, topic, and dead-letter queues.
