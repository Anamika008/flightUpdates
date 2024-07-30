<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Flight Status</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
          crossorigin="anonymous" />

    <style>
        .container {
            margin: 2% auto;
        }
    </style>
</head>
<body>

<%-------------------------Navigation----------------------------%>
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="/">
                    <img src="https://s6web-prod.goindigo.in/content/dam/s6web/in/en/assets/logo/IndiGo_logo_2x.png" alt=""
                         width="120" height="40" class="d-inline-block align-text-top">
                </a>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/flight-status">My Flight Status</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/add-flight">Add Flight</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/update-flight-status">update status of flight</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/cancel-flight">cancel flight</a>
                        </li>

                    </ul>
                </div>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/book-flight">Book Flight</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

<%---------------------List of Flights---------------------------------%>
    <div class="container">
        <div class="card">
            <div class="card-body">
                <table class="table table-hover">

                    <tr class="table-header">
                        <th>Flight No.</th>
                        <th>Origin</th>
                        <th>Destination</th>
                        <th>Departure Time</th>
                        <th>Status</th>
                    </tr>


                    <c:forEach var="flight" items="${flights}">
                        <tr>
                            <td>${flight.flightNo}</td>
                            <td>${flight.from}</td>
                            <td>${flight.to}</td>
                            <td>${flight.depTime}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${flight.depDate eq currentDate && flight.depTime lt currentTime}">
                                        Delay
                                    </c:when>
                                    <c:otherwise>
                                        On time
                                    </c:otherwise>
                                </c:choose>
                            </td>

                        </tr>
                    </c:forEach>

<%--
<%--                            <c:choose>--%>
<%--                                <c:when test="${flight.depTime lt currentTime}">--%>
<%--                                    Delay--%>
<%--                                </c:when>--%>
<%--                                <c:otherwise>--%>
<%--                                    On time--%>
<%--                                </c:otherwise>--%>
<%--                            </c:choose>--%>


                </table>
                </div>
            </div>
        </div>
        <script
                src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
                crossorigin="anonymous">
        </script>
    </body>
</html>