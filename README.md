# MECCG-spring
 Middle-Earth Collectible Card Game implemented in SpringBoot server

## Technological Stack

### Frontend
- **Framework**: React
- **State Management**: Redux
- **Real-time Communication**: WebSockets
- **Hosting**: Vercel

### Backend
- **Framework**: SpringBoot
- **Game State Management**: ConcurrentHashMap
- **Database**: PostgreSQL
- **Hosting**: Railway.app

### Development and Deployment
- **Version Control**: GitHub
- **Task Management**: GitHub Projects
- **CI/CD**: GitHub Actions
- **Quality Gate**: SonarCloud

## Features
- Multiplayer gameplay with real-time updates.
- Persistent game state using PostgreSQL.
- Interactive UI built with React and Redux.
- Fan-made cards inspired by Middle-earth lore. TODO: REFERENCE

## Project Setup

### Prerequisites
- **Java 21** or higher
- **Node.js** (LTS version recommended)
- **PostgreSQL** (latest stable version)

### Clone the Repository
```bash
git clone https://github.com/eru-manifestation/MECCG-spring.git
cd MECCG-spring
```

### Install Dependencies
#### Backend
```bash
cd backend
mvn clean install
```

#### Frontend
```bash
cd frontend
npm install
```

## Running Commands

### Backend

#### Run Backend with Maven
To start the backend application using Maven, navigate to the `backend` directory and execute:

```bash
cd backend
mvn spring-boot:run
```

#### Test Backend with Maven
To run tests for the backend application using Maven, navigate to the `backend` directory and execute:

```bash
cd backend
mvn test
```

### Frontend

#### Run Frontend
To start the frontend application, navigate to the `frontend` directory and execute:
```bash
cd frontend
npm start
```

#### Test Frontend
To run tests for the frontend application, navigate to the `frontend` directory and execute:
```bash
cd frontend
npm test
```

## Contributing
We welcome contributions! Please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes and push them to your fork.
4. Open a pull request with a detailed description of your changes.

## License
This project is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International. See the `LICENSE` file for details.


# Disclaimer
This is a fan-made, non-commercial game inspired by Middle-earth Collectible Card Game by Iron Crown Enterprises.  
We do not claim ownership of any original characters, names, or trademarks.  
This project is for entertainment purposes only and will never be monetized.
