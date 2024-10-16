# Simple Java Client-Server

A simple Java client-server application that demonstrates basic socket programming for communication between a client and a server.


## Overview

This project consists of two main components: a server and a client. The server listens for incoming connections, while the client connects to the server, sends a message, and receives a response.

### How It Works

1. The server starts and waits for a client connection.
2. The client connects to the server and sends a message.
3. The server receives the message, processes it, and sends a response back to the client.
4. The client displays the response from the server.

## Features

- Basic socket communication
- Simple message exchange between client and server
- Easy to understand and modify

## Getting Started

To run this project, you need to have the Java Development Kit (JDK) installed on your machine.

1. Run `Server.java` to start the server.
2. Run `Client.java` to create a new client that connects to the server.

### Example Output

- **Server Console**:
  
  ```bash
  Server is listening on port 1234
  Client connected!
  Received from client: Hello, Server!
### Prerequisites

- Java 8 or higher
- An IDE or text editor (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code)

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/YOUR_USERNAME/Simple-Java-Client-Server.git
   cd Simple-Java-Client-Server
