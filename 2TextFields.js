function checkForPassword() {
	var targetField =
document.getElementById("passwordField");
 if (targetField.value.length === 0) {
			alert("Please enter your Password");
	targetField.focus();	
	return false;
	}
else if(targetField.value.length > 16) {
			alert("Password cannot be more than 16 characters long");
	targetField.focus();	
	return false;
	}
	else if(targetField.value.length <= 7) {
			alert("Password must be more than 8 characters long");
	targetField.focus();	
	return false;
	}
	else {
  alert("Thanks your password will be saved!!!");
}
}