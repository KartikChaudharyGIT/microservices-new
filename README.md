# SpringBoot Microservices

This repository contains the implementation of various concepts related to SpringBoot Microservices. It focuses on building scalable and loosely coupled microservices using the SpringBoot framework.

## Contents

1. [Introduction](#introduction)
2. [Microservices](#microservices)
3. [REST Controllers](#rest-controllers)
4. [Backend Services](#backend-services)
5. [API Gateway](#api-gateway)
6. [Eureka Discovery Server](#eureka-discovery-server)
7. [Apache Kafka](#apache-kafka)
8. [Event Driven Architecture](#event-driven-architecture)
9. [Swagger for API Documentation](#swagger-for-api-documentation)
10. [Prometheus](#Prometheus-using-Spring-Boot-Actuator)

## Introduction

Microservices architecture is an architectural style that structures an application as a collection of small, independent services that can be developed, deployed, and scaled independently. SpringBoot provides a convenient and powerful way to build microservices using Java.

This repository explores various concepts and best practices related to SpringBoot Microservices, including the implementation of REST controllers and backend services. It also incorporates additional components like API Gateway, Eureka Discovery Server, Apache Kafka, and Event Driven Architecture.

## Microservices

Microservices are small, self-contained services that can be independently developed, deployed, and scaled. Each microservice focuses on a specific business capability and communicates with other microservices using lightweight protocols like HTTP or messaging queues.

In this repository, you will find examples and code snippets showcasing the design and implementation of microservices using SpringBoot.

## REST Controllers

REST (Representational State Transfer) controllers are responsible for handling incoming HTTP requests and returning appropriate responses. They serve as the entry points for external clients to interact with microservices.

This repository provides examples of how to create REST controllers using SpringBoot. It covers topics such as handling different HTTP methods (GET, POST, PUT, DELETE), request parameter validation, error handling, and serialization/deserialization of JSON payloads.

## Backend Services

Backend services refer to the functionality and logic that support the core business capabilities of an application. They handle business logic, data processing, and integration with external systems or databases.

In this repository, you will find examples of implementing backend services using SpringBoot. It covers concepts such as data persistence with databases, integration with third-party APIs, asynchronous processing, and event-driven architectures.

## API Gateway

API Gateway acts as an entry point for all incoming API requests. It provides a centralized endpoint for clients to access multiple microservices. The API Gateway handles routing, authentication, and other cross-cutting concerns.

This repository includes an implementation of an API Gateway using SpringBoot. It showcases how to configure routing rules, authentication, rate limiting, and request/response transformations.

## Eureka Discovery Server

Eureka Discovery Server is a service registry that allows microservices to dynamically register and discover each other. It helps in locating and load balancing requests across multiple instances of a microservice.

In this repository, you will find an example of setting up a Eureka Discovery Server using SpringBoot. It demonstrates how microservices can register themselves with the server and how other microservices can discover and consume those services.

## Apache Kafka

Apache Kafka is a distributed streaming platform that allows for the building of scalable, fault-tolerant, and real-time event-driven applications. It provides a high-throughput, low-latency messaging system for microservices communication.

This repository includes examples of integrating Apache Kafka with SpringBoot microservices. It covers topics such as producing and consuming messages, event sourcing, and implementing publish-subscribe patterns.

## Event Driven Architecture

Event Driven Architecture (EDA) is an architectural pattern in which microservices communicate with each other through events. Events are asynchronous messages that represent significant occurrences or state changes in the system.

This repository showcases the implementation of an Event Driven Architecture using SpringBoot and Apache Kafka. It demonstrates how microservices can communicate and react to events, enabling loose coupling and scalability.

## Swagger for API Documentation

Swagger is an open-source tool that simplifies the process of designing, building, documenting, and consuming RESTful APIs. It provides a user-friendly interface to explore and interact with APIs.

In this repository, you will find examples of integrating Swagger and OpenAPI documentation with SpringBoot microservices for API documentation. It shows how to annotate REST controllers with Swagger annotations to generate interactive API documentation.

## Prometheus using Spring Boot Actuator

Spring Boot Actuator provides production-ready features for Spring Boot application. It will help us check and manage our application in the production environment. Monitoring our production environment is critical especially when we have multiple services and each service is critical for the overall system functionality and performance.

Prometheus is one way of solving this problem. It is a time-series database, which stores a sequence of data points, across time. It’s generally used to store metrics and performance data from your applications. And this allows you to perform time-series analysis of metrics.
