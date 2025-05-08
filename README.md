Write RESTful API with springboot3, use JPA to save it to H2database table user
1. POST /api/v1/users
Request body example:
{
“name”: “tom”,
“birth” : “2020-01-01”,
“gender”: “male”,
“role”: “user“
}
Response http status code: 201
Response body:
{
“id”: “123”
}
2. GET /api/v1/users/{id}
Get the detail information which saved by POST endpoint
