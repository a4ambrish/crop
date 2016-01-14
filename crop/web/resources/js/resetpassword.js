/**
 * 
 */

function convertPassword() {
    alert("checking password at reset password");

    alert(document.getElementById('pwd1').value);
    var password = document.getElementById('pwd1');
    var confPassword = document.getElementById('pwd2');

    var i = 0;
    if (password.value == confPassword.value) {
        if (password.value == "" && confPassword.value == "") {
            i = 1;
            document.getElementById('pwderr').innerHTML = "Password: Validation Error: Password Fields should not be left blank";
        } else {
            if (!validatePassword(password.value)) {
                document.getElementById('pwderr').innerHTML = "Password: Validation Error: use at least 1 special symbol, 1 Lower case letter,1 Upper case Letter and 1 digit, and length must be 7 to 15";
                i = 2;
            }
        }

    }
    else {
        document.getElementById('pwderr').innerHTML = "Password: Validation Error: Password And Confirm Password Does Not Match";
        i = 3;
    }
    alert("i= " + i);
    if (i == 0) {
        document.getElementById('message').style.display = 'none';
        password.value = calcMD5(password.value);
        confPassword.value = password.value;

    } else {
        document.getElementById('message').style.display = 'block';
        password.value = "";
        confPassword.value = "";
    }
    //alert("password validated i= "+i);
}