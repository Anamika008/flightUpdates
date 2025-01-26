<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Add Passenger Details</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="/CSS/user.css" />
  </head>
  <body>
    <h1>${userName}</h1>
    <h1>${userContact}</h1>

    <!-- There are some feature or we can say authorization for user that they can do -->

    <div class="center-container">
      <div class="container">
        <div class="row justify-content-center align-items-center">
          <div class="card">
            My Bookings
            <a href="/CSS/user.css" class="stretched-link">
              <!-- stretched-link : expand the clickable area to the parent container -->
            </a>
          </div>
          <div class="card">
            Book your Journey <a href="book-flight" class="stretched-link"></a>
          </div>
          <div class="card">
            Add Passenger <a href="add-passenger" class="stretched-link"></a>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
