  📚 Library Management System (Spring Boot)

A comprehensive backend Library Management System developed using Spring Boot, designed to manage books, users, librarians, borrowing, returns, fines, and reservations with JWT-based authentication and role-based authorization.

This project follows real-world backend architecture and enterprise-level coding practices.

⚙️ Feature Implementation
🔐 Authentication & Authorization

Implemented JWT-based authentication using Spring Security.

Generated JWT tokens on successful login and validated them for every secured request.

Applied role-based authorization (Admin, Librarian, User) at API level.

👤 User Management

User registration and login.

View and update user profile.

Role-based access for Users, Librarians, and Admin.

📖 Book Management

Add new books (Admin/Librarian).

Update book details.

Delete books.

Search books by:

Title

Author

Category

ISBN

🔄 Borrow & Return Management

Users can borrow available books.

Track borrowed books with due dates.

Return books and update availability.

Prevent borrowing if book is not available.

⏳ Fine Management

Automatically calculate fine for late returns.

View fine details for each user.

Admin can manage fine rules.

📌 Reservation System

Users can reserve books if currently unavailable.

Notify users when reserved book becomes available.

🧑‍💼 Librarian Management

Add / update / remove librarians.

Librarians manage daily library operations.

View borrowing history.

💾 Database Design

Relational database using MySQL / PostgreSQL

Entities:

User

Book

Librarian

Borrow

Return

Fine

Reservation

🛠️ Tech Stack
Technology	Used
Backend	Spring Boot
Security	Spring Security + JWT
Database	MySQL / PostgreSQL
ORM	Hibernate / JPA
Build Tool	Maven
API	RESTful APIs
Testing	Postman
🚀 How to Run the Project

Clone the repository:

git clone https://github.com/your-username/Library_managnment_System2.git


Import into Eclipse / IntelliJ as Maven project.

Configure application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=root
spring.datasource.password=yourpassword


Run the application:

Run as → Spring Boot App


Test APIs using Postman.

🎯 Project Highlights (For Resume)

Developed a real-time Library Management System using Spring Boot.

Implemented JWT authentication & role-based access control.

Designed REST APIs for book, user, borrow, fine, and reservation modules.

Followed layered architecture (Controller, Service, Repository).

Used Hibernate JPA for database operations.

📌 Future Enhancements

Email notifications.

Frontend using React/Angular.

PDF reports.

Admin dashboard.

Portfolio

Recruiters view 💼
