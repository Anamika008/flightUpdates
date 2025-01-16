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
    <link rel="stylesheet" href="/CSS/flight-form.css" />
  </head>
  <body>
    <div class="container body-style">
      <h1>Sign Up</h1>
      <form class="form" action="/add-passenger" method="post">
        <div class="container mb-3">
          <div class="row">
            <div class="col-4"><label for="mobile">Contact No.: </label></div>
            <div class="col-6"><input type="text" name="mobile" /></div>
          </div>
        </div>

        <div class="container mb-3">
          <div class="row">
            <div class="col-4">
              <label for="email">Email Id: </label>
            </div>
            <div class="col-6">
              <input type="email" name="email" />
            </div>
          </div>
        </div>

        <div class="container mb-3">
          <div class="row">
            <div class="col-4"><label for="password">Password</label></div>
            <div class="col-6">
              <input class="" type="text" name="password" />
            </div>
          </div>
        </div>

        <div class="container mb-3">
          <div class="row">
            <div class="col-4">
              <label for="password">Confirm Password</label>
            </div>
            <div class="col-6">
              <input class="" type="text" name="password" />
            </div>
          </div>
        </div>

        <div class="container mb-3">
          <div class="row">
            <div class="col-2">
              <button type="submit">submit</button>
            </div>
          </div>
        </div>
      </form>
    </div>
  </body>
</html>
