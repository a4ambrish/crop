/**
 * 
 */
function validatePassword(password){
	var regex=/^(?=.*[0-9])(?=.*[!@#$%^&*])(?=.*[A-Z])(?=.*[a-z])[a-zA-Z0-9!@#$%^&*]{6,16}$/;
	//alert(password);
	if (regex.test(password)){
		//alert('password is ok');
		return true;
	}
	else{
		//alert("Invalid Password");
		return false;
	}
	
}
function convertPassword() {
	//alert("checking password");
	var password = document.getElementById('pwd1');
	var confPassword = document.getElementById('pwd2');
	
	var i=0;
	if (password.value == confPassword.value) {
		if(password.value == "" && confPassword.value==""){
			i=1;
			document.getElementById('pwderr').innerHTML="Password: Validation Error: Password Fields should not be left blank";
		}else{
		if (!validatePassword(password.value)){
			document.getElementById('pwderr').innerHTML="Password: Validation Error: use at least 1 special symbol, 1 Lower case letter,1 Upper case Letter and 1 digit, and length must be 7 to 15";
		i=2;
		}
		}
		
	}
	else{
		document.getElementById('pwderr').innerHTML="Password: Validation Error: Password And Confirm Password Does Not Match";
		i=3;
	}
	//alert("i= "+i);
	if(i==0){
		document.getElementById('message').style.display='none';
		password.value = calcMD5(password.value);
		confPassword.value = password.value;
		
		}else{
			document.getElementById('message').style.display='block';
			password.value = "";
			confPassword.value = "";
		}
	//alert("password validated i= "+i);
}

function hideId(){
	var iduploaded=document.getElementById("iduploaded");
	if(iduploaded==true){
	document.getElementById("idrow").style.display="none";
	document.getElementById("idsuccess").style.display="block";
	}
}
function validateID(){
	var count=0;
	var id=document.getElementById("selectIDProof_input");
	var idnum=document.getElementById("txtIDNum");
	if(id.value=='-1'){
		id.style.border="1px solid red";
		count++;
	}
	if(idnum.value==''){
		idnum.style.border="1px solid red";
		count++;
	}
	if(count>0){
		return false;
	}else{
		return true;
	}
	
}
function showCheckBox(){
	//alert('checkbox function called');
	var line1=document.getElementById("txtAdrsln12").value;
	var line2=document.getElementById("txtAdrsln22").value;
	var city=document.getElementById("txtCity2_input").value;
	var state=document.getElementById("txtState2_input").value;
	var country=document.getElementById("txtCountry2").value;
	var pin=document.getElementById("txtPin2").value;
	//alert("line1 = "+line1+" city "+city+" state "+state+" country "+country+" pin "+pin);
	if((pin!="" && country!="") && ((state!="-1" && city!="-1") && line1!="")){
		$('#checkbox').show();
	}else{
		$('#checkbox').hide();
	}
}

function sameAddress(){
	var ischecked= $('#chkAddrs_input').is(':checked');
	if(ischecked){
	document.getElementById("txtAdrsln1").value=document.getElementById("txtAdrsln12").value;
	document.getElementById("txtAdrsln2").value=document.getElementById("txtAdrsln22").value;	
//	var e= document.getElementById("txtState_input");
//	var val=e.selectedIndex;
//	alert("selected index= "+val+" value = "+e.options[e.selectedIndex].value);
	document.getElementById("txtState_input").selectedIndex=document.getElementById("txtState2_input").selectedIndex;
	
	document.getElementById("txtState_input").options[document.getElementById("txtState_input").selectedIndex].selected = 'selected';
	
	alert(document.getElementById("txtState_input").options[document.getElementById("txtState_input").selectedIndex].selected );
	alert(document.getElementById("txtState_input").options[document.getElementById("txtState_input").selectedIndex].value);
	document.getElementById("txtCity_input").innerHTML=document.getElementById("txtCity2_input").innerHTML;
	
	
	
	
	alert('copied'+document.getElementById("txtCity2_input").innerHTML);
	document.getElementById("txtCountry").value=document.getElementById("txtCountry2").value;
	document.getElementById("txtPin").value=document.getElementById("txtPin2").value;
	document.getElementById("txtAdrsln1").readOnly=true;
	document.getElementById("txtAdrsln2").readOnly=true;
	document.getElementById("txtCity_input").readOnly=true;
	document.getElementById("txtState_input").readOnly=true;
	document.getElementById("txtCountry").readOnly=true;
	document.getElementById("txtPin").readOnly=true;
	}
	else{
		document.getElementById("txtAdrsln1").readOnly=false;
		document.getElementById("txtAdrsln2").readOnly=false;
		document.getElementById("txtCity_input").readOnly=false;
		document.getElementById("txtState_input").readOnly=false;
		document.getElementById("txtCountry").readOnly=false;
		document.getElementById("txtPin").readOnly=false;
	}
}