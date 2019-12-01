<html>
<body>

<form action="calc" method="POST">
    <label for="number1"><b>Enter number1: </b></label>
    <input type="number" placeholder="0" name="number1" required>
    <p></p>
    <input type="radio" name="action" value="+" required> +
    <input type="radio" name="action" value="-" required> -
    <input type="radio" name="action" value="/" required> /
    <input type="radio" name="action" value="x" required> x
    <p></p>
    <label for="number2"><b>Enter number2: </b></label>
    <input type="number" placeholder="0" name="number2" required>
    <p></p>
    <input type="submit" value="Equals"></input>
</form>
</body>
</html>