var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
	
	$scope.manutencoes = new Object();
	$scope.salvar = function() {
		$http.post("http://localhost:8080/postagem/post3", {
			'id' : $scope.id,
			'titulo' : $scope.titulo,
			'texto' : $scope.texto,
			'data' : $scope.data
		})
	};
	$scope.buscarTodos = function() {
		$http.get("http://localhost:8080/postagem/getAll3").then(function(resposta) {
			$scope.manutencoes = resposta.data;
		});
	}
	$scope.buscarTodos();
});
