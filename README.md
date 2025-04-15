# iRacing API Quarkus

A Quarkus-based RESTful API for interacting with the iRacing service, providing race tracking and statistics.

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Features

- **Race Tracking System**: Automatically tracks race changes for members
  - Scheduled hourly checks
  - Detects new races, wins, and top 5 finishes
- **REST API endpoints** for:
  - Member tracking management
  - Race statistics retrieval 
  - League information
  - Championship data
- **Authentication** with iRacing via cookie management

## Getting Started

### Prerequisites

- JDK 11+
- Maven 3.8+
- An iRacing account for authentication

### Installation

1. Clone the repository
   ```
   git clone https://github.com/yourusername/iracing-api-quarkus.git
   cd iracing-api-quarkus
   ```

2. Build the project
   ```
   ./mvnw package
   ```

3. Run the application
   ```
   java -jar target/quarkus-app/quarkus-run.jar
   ```

### Development Mode

For development with live coding:

```
./mvnw quarkus:dev
```

This gives you access to the Dev UI at http://localhost:8080/q/dev/

## API Endpoints

### Race Tracking

- `POST /race-tracking/track/{custId}/{displayName}` - Start tracking a member
- `DELETE /race-tracking/untrack/{custId}` - Stop tracking a member
- `GET /race-tracking/tracked-members` - Get all tracked members
- `GET /race-tracking/recent-changes` - Get recent race changes
- `POST /race-tracking/check-changes` - Manually trigger a check for race changes

### iRacing API

- Authentication and session management
- Member stats and career information
- Race results and statistics
- League and championship data

## Project Structure

- `com.basilus.iracing.manager.resource` - REST endpoints
- `com.basilus.iracing.manager.service` - Business logic and API client
- `com.basilus.iracing.manager.model` - Data models and response objects

## Running with Configurations

### Native Executable

```
./mvnw package -Dnative
```

### Docker

```
./mvnw package -Dquarkus.container-image.build=true
```

## Contributing

1. Fork the project
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Built with [Quarkus](https://quarkus.io/), the Supersonic Subatomic Java Framework
- Uses the official iRacing API
