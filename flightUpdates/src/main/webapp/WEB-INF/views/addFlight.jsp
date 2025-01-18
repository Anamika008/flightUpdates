
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Flight Status</title>
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

        <!---------Bootstrap----------------->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>

    <div class="container" style="margin: 2% auto;">
        <div class="row">
            <div class="card">
                <div class="card-header">
                    <h5>Add Flight Details</h5>
                </div>

                <div class="card-body">
                    <form action="${pageContext.request.contextPath}/add-flight" method="post" >
                        <input type="text" placeholder="Enter Flight number..." name="flightNo"/>
                        <input type="text" placeholder="Departure from..." name="from"/>
                        <input type="text" placeholder="Destination..." name="to"/>
                        <input type="date" id="date" name="depDate"/>
                        <input type="time" name="depTime">
                        <br>
                        <button class="btn btn-primary btn-lg">Add</button>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>