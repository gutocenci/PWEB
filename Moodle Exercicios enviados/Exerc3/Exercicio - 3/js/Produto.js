function validacaoprodutos(field) {
	var nomeprod = CProdutos.nomeprod.value;
	var marca = CProdutos.marca.value;
	var tipo = CProdutos.tipo.value;
	var qtde = CProdutos.qtde.value;
	var preco = CProdutos.preco.value;
	
	if (nomeprod == "") {
		alert('D� o nome do produto');
		return true;
	}
	
	if (marca == "") {
		alert('Preencha o campo com marca de produto');
		return true;
	}
	
	if (tipo == "") {
		alert('Informe tipo de produto');
		return true;
	}
	
	if (qtde == "") {
		alert('Digite a quantidade do produto');
		return true;
	}
	
	if (preco == "") {
		alert('Informe o pre�o do produto');
		return true;
	}
}