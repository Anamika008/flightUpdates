<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Add flight details</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css"
    />

    <link rel="stylesheet" href="/CSS/flight-form.css" />
  </head>
  <body>
    <div class="container body-style">
      <h1>Flight Number</h1>
      <form action="/update/${flightNo}" method="post">
        <div class="container">
          <div class="row">
            <div class="col-11"><h4>Time</h4></div>
            <div class="col-1">
              <i class="fas fa-chevron-down toggle-content" onclick="showContent(event)" ></i>
            </div>
          </div>

          <div class="row collapse p-3">
            <div class="col-6">Arrival : <input type="time" name="arrivalTime" /></div>
            <div class="col-6">Departure : <input type="time" name="departureTime"/></div>
          </div>
        </div>

        <div class="container">
          <div class="row">
            <div class="col-11"><h4>Gate</h4></div>
            <div class="col-1">
              <i class="fas fa-chevron-down toggle-content" onclick="showContent(event)" ></i>
            </div>
          </div>

          <div class="row collapse p-3">
            <div class="col-6">Gate No. :</div>
            <div class="col-6"><input type="text" name="gate"/></div>
          </div>
        </div>

        <div class="container">
          <div class="row">
            <div class="col-9"></div>
            <div class="col-3">
              <button class="btn-primary" type="submit">SUBMIT</button>
            </div>
          </div>
        </div>
      </form>
    </div>
    <script src="/JS/index.js"></script>
  </body>
</html>
