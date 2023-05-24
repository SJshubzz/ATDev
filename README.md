# ATDev

**please Check main branch**

this code is written for internship
Retrieve all students:
GET http://localhost:8082/api/students
Retrieve a specific student by ID:
GET http://localhost:8082/api/students/1

Create a new student:
POST http://localhost:8082/api/students
Request body: JSON representation of the student
{
    "id": 2,
        "name": "shubham",
        "age": 25,
        "grade": "A",
        "address": "pune"
}

Update an existing student:
PUT http://localhost:8082/api/students/2
Request body: JSON representation of the updated student
{
    "id": 2,
        "name": "shubham",
        "age": 25,
        "grade": "A",
        "address": "pune"
}

Delete a student:
DELETE http://localhost:8082/api/students/2
