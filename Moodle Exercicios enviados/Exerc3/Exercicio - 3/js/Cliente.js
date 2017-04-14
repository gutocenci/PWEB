function Nome(field){
	nome = field.value;
    if(nome.length <2){
   		document.getElementById("msgnome").innerHTML = "<font color='red'>Nome invalido</font>";
	}
    else
    {
    	document.getElementById("msgnome").innerHTML = "Nome valido";
    }
}

function validacaoEmail(field) {
	usuario = field.value.substring(0, field.value.indexOf("@"));
	
	dominio = field.value.substring(field.value.indexOf("@") + 1,field.value.length);
	
	if ((usuario.length >= 1) && (dominio.length >= 3)
			&& (usuario.search("@") == -1) && (dominio.search("@") == -1)
			&& (usuario.search(" ") == -1) && (dominio.search(" ") == -1)
			&& (dominio.search(".") != -1) && (dominio.indexOf(".") >= 1)
			&& (dominio.lastIndexOf(".") < dominio.length - 1)) {
		document.getElementById("msgemail").innerHTML = "E-mail valido";
	} else {
		document.getElementById("msgemail").innerHTML = "<font color='red'>Email invalido </font>";
		
	}
}

 function validaData(field) {
      var RegExPattern = /^((((0?[1-9]|[12]\d|3[01])[\.\-\/](0?[13578]|1[02])      [\.\-\/]((1[6-9]|[2-9]\d)?\d{2}))|((0?[1-9]|[12]\d|30)[\.\-\/](0?[13456789]|1[012])[\.\-\/]((1[6-9]|[2-9]\d)?\d{2}))|((0?[1-9]|1\d|2[0-8])[\.\-\/]0?2[\.\-\/]((1[6-9]|[2-9]\d)?\d{2}))|(29[\.\-\/]0?2[\.\-\/]((1[6-9]|[2-9]\d)?(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00)|00)))|(((0[1-9]|[12]\d|3[01])(0[13578]|1[02])((1[6-9]|[2-9]\d)?\d{2}))|((0[1-9]|[12]\d|30)(0[13456789]|1[012])((1[6-9]|[2-9]\d)?\d{2}))|((0[1-9]|1\d|2[0-8])02((1[6-9]|[2-9]\d)?\d{2}))|(2902((1[6-9]|[2-9]\d)?(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00)|00))))$/;

     if (!((field.value.match(RegExPattern)) && (field.value!=''))) {
          document.getElementById("msgdata").innerHTML = "<font color='red'>Data inválida </font>";
   id.focus();
        }
       else{
       		document.getElementById("msgdata").innerHTML = "Data valida";
    	}
}
	
function Login(field){
	campo = field.value;
    if(campo.length <4){
   		document.getElementById("msglogin").innerHTML = "<font color='red'>Login invalido</font>";
	}
    else
    {
    	document.getElementById("msglogin").innerHTML = "Login valido";
    }
}

function Senha(field){
	campo = field.value;
    if(campo.length <4){
   		document.getElementById("msgenha").innerHTML = "<font color='red'>Senha invalida</font>";
	}
    else
    {
    	document.getElementById("msgenha").innerHTML = "Senha valida";
    }
}