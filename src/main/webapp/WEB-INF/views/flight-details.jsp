<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Flight to Departure</title>
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
        crossorigin="anonymous"
    />

</head>
<body>
    <div class="container-xl">
        <h1>check details of your flight here</h1>
        <table class="table">
            <div class="card">
              <thead class="table-light card-body">
                <tr>
                  <th scope="col">Date of travel</th>
                  <th scope="col">Route</th>
                  <th scope="col">Flight number</th>
                  <th scope="col">Departure Time</th>
                  <th scope="col">Arrival Time</th>
                  <th scope="col">Gate</th>
                  <th scope="col">status</th>
                </tr>
              </thead>
            </div>
          <tbody>
            <c:forEach var="flight" items="${flights}">
              <tr>
                    <td>
                      <%
                        java.util.Date today = new java.util.Date();
                        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
                      %>
                      <%= formatter.format(today) %>
                    </td>
                    <td>${flight.getSrc()} <----> ${flight.getDes()}</td>
                    <td>${flight.getFlightNo()}</td>
                    <td>${flight.getDeparture()}</td>
                    <td>${flight.getArrival()} </td>
                    <td>${flightToGate.get(flight.getFlightNo())} </td>
                    <td> -- </td>
                  </tr>
                </div>
              </div>
            </c:forEach>
          </tbody>
          <tfoot>
                <tr>
                   <td colspan='6'>Add</td>
                   <td><a class="btn" href="add-flight">+</a></td>
                </tr>
          </tfoot>
        </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</body>
</html>