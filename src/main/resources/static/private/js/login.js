const formLogin = document.getElementById("formLogin");

formLogin.addEventListener('submit', function(evt){
    evt.preventDefault();
    const username = $("#username").val();
    const password = $("#password").val();
    
    $.ajax({
		url: 'login',
		type: 'POST',
		data: {
			"username": username,
			"password": password
		},
		dataType: 'json',
		success: function (response) {
			const isLogin = response.isLogin;
			if(!isLogin) {
				alert("Usuario/Password incorrecto");
			} else {
				window.location="/orders";
			}
			
		}
	});
})