<script
        src="https://code.jquery.com/jquery-3.4.1.js"
        integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
        crossorigin="anonymous"></script>
<h3>Login</h3>
<table>
    <tr>
        <td>User Name:</td>
        <td><input type="text" id="username" name="username" style="width: 200px"></td>
    </tr>
    <tr>
        <td>Password:</td>
        <td><input type="password" id="password" style="width: 200px"></td>
    </tr>
    <tr><td></td>
        <td><input type="button" onclick="fire_ajax_submit()" value="Login"></td>
    </tr>
</table>
<script>
    function fire_ajax_submit() {
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;
                var ara = {"username": username, "password": password}



        $.ajax({
            type: "GET",
            contentType: "application/json",
            url: "/login",
            data: JSON.stringify(ara),
            dataType: 'json',
            cache: false,
            timeout: 600000,
            success: function (data) {

                alert(data)


            },
            error: function (e) {

                alert(e)

            }
        });

    }
</script>