function validatePassword(password) {
    var regex = /^(?=.*[0-9])(?=.*[!@#$%^&*])(?=.*[A-Z])(?=.*[a-z])[a-zA-Z0-9!@#$%^&*]{6,16}$/;
    // alert(password);
    if (regex.test(password)) {
        // alert('password is ok');
        return true;
    } else {
        // alert("Invalid Password");
        return false;
    }

}
function convertPassword() {
    //alert("checking password convertPassword ");
    var oldPassword = document.getElementById('pwd');
    var password = document.getElementById('pwd1');
    var confPassword = document.getElementById('pwd2');
    var random = document.getElementById('random');
    //alert(random.value);

    var i = 0;
    if (password.value == confPassword.value) {

        if (!validatePassword(oldPassword.value)
                || !validatePassword(password.value)) {
            document.getElementById('pwderr').innerHTML = "Password: Validation Error: use at least 1 special symbol, 1 Lower case letter,1 Upper case Letter and 1 digit, and length must be 7 to 15";
            i = 1;
        }

    } else {
        i = 2;
        document.getElementById('pwderr').innerHTML = "Password: Validation Error: Password do not match";
    }
    if (i == 0) {
        oldPassword.value = calcMD5(calcMD5(oldPassword.value) + random.value);
        password.value = calcMD5(password.value);
        confPassword.value = password.value;
        random.value = "";
        return true;
    } else {
        document.getElementById('message').style.display = 'block';
        oldPassword.value = "";
        password.value = "";
        confPassword.value = "";
        return false;
    }
    // alert("password validated i= "+i);
}
