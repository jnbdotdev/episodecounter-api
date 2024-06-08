# Episode Counter API

This is a simple RESTful API built with Node.js and Express.js to keep track of your favorite TV shows and their episodes.

## Features

- **Authentication**: User authentication with JWT tokens.
- **CRUD Operations**: Perform CRUD (Create, Read, Update, Delete) operations on TV shows and their episodes.
- **Data Validation**: Input validation using Joi.
- **MongoDB Integration**: MongoDB is used as the database to store user information, TV shows, and episodes.
- **Testing**: Unit tests are implemented with Jest.

## Installation

1. Clone the repository:

```bash
git clone https://github.com/jnbdotdev/episodecounter-api.git
```

2. Navigate into the project directory:

```bash
cd episodecounter-api
```

3. Install dependencies:

```bash
npm install
```

4. Set up environment variables by creating a `.env` file in the root directory. You can use `.env.example` as a template.

5. Start the server:

```bash
npm start
```

## Usage

Once the server is running, you can interact with the API using tools like Postman or curl. Here are some example endpoints:

- `POST /api/auth/register`: Register a new user.
- `POST /api/auth/login`: Log in as an existing user and receive a JWT token.
- `GET /api/shows`: Retrieve all TV shows.
- `POST /api/shows`: Add a new TV show.
- `GET /api/shows/:id`: Retrieve a specific TV show by ID.
- `PUT /api/shows/:id`: Update a TV show.
- `DELETE /api/shows/:id`: Delete a TV show.
- `GET /api/shows/:showId/episodes`: Retrieve all episodes of a TV show.
- `POST /api/shows/:showId/episodes`: Add a new episode to a TV show.
- `GET /api/shows/:showId/episodes/:episodeId`: Retrieve a specific episode by ID.
- `PUT /api/shows/:showId/episodes/:episodeId`: Update an episode.
- `DELETE /api/shows/:showId/episodes/:episodeId`: Delete an episode.

For detailed information on each endpoint and their request/response formats, refer to the [API documentation](API_DOCUMENTATION.md).

## Testing

Run tests using Jest:

```bash
npm test
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
