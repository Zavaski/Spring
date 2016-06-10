angular.module("listaTelefonica", ["ngMessages"]);
		angular.module("listaTelefonica").controller("listaTelefonicaCtrl", function($scope){
				$scope.app = "Lista Telefonica";
				$scope.contatos = [
				{nome: "Pedro", telefone: "99888-8888", data: new Date(), operadora: {nome: "Oi", codigo:"34"}},
				{nome: "Ana", telefone: "9988-33333", data: new Date(), operadora: {nome: "Oi", codigo:"34"}},
				{nome: "Maria", telefone: "9985-55555", data: new Date(), operadora: {nome: "Oi", codigo:"34"}}
			];						
				$scope.operadoras = [
						{nome: "Oi", codigo: 14, categoria: "Celular", preco: 2},
						{nome: "Vivo", codigo: 15, categoria: "Celular", preco: 1},
						{nome: "Tim", codigo: 41, categoria: "Celular", preco: 3},
						{nome: "GVT", codigo: 25, categoria: "Fixo", preco: 1},
						{nome: "Embratel", codigo: 21, categoria: "Fixo" , preco: 4}

				];
				$scope.adicionarContato = function (contato) {
				$scope.contatos.push((contato));
				delete $scope.contato;
				$scope.contatoForm.$setPristine();
				};
				$scope.apagarContatos = function (contatos) { 
					$scope.contatos = contatos.filter(function (contato){
						if(!contato.selecionado) return contato;
				});
			};
				$scope.isContatoSelecionado = function(contatos){
					return contatos.some(function (contato){
						return contato.selecionado;
					});
				};
				$scope.ordernarPor = function(campo){
					$scope.criterioDeOrdenacao = campo;
					$scope.direcaoDaOrdenacao = !$scope.direcaoDaOrdenacao;
				};
});