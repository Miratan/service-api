app.controller('homeController', function($scope) {
//	$scope.headingTitle = "User List";
});

app.controller('usersController', function($scope) {
	$scope.headingTitle = "User List";
});

app.controller('rolesController', function($scope) {
	$scope.headingTitle = "Roles List";
});

app.controller('formProfessionalController', function($scope, $http, $q,
		$timeout) {
	$scope.headingTitle = "Quero ser um profissional";
	
	$scope.choices = [{id: 'choice1'}];
	  
	$scope.addNewChoice = function() {
		var newItemNo = $scope.choices.length+1;
		$scope.choices.push({'id':'choice'+newItemNo});
	};
    
	$scope.removeChoice = function() {
		var lastItem = $scope.choices.length-1;
		$scope.choices.splice(lastItem);
	};
	
	
	var loadData = $q.defer();
	$http.get('/service').success(function(result) {
		loadData.resolve(result);
	});
	loadData.promise.then(function(result) {
		$scope.items = result;
	});

	$scope.submit = function() {
		var data = $scope.form;
		console.log(data);
		
		var defer = $q.defer();
		$http.post('/', data).success(function(result) {
			defer.resolve(result);
		});
		defer.promise.then(function(result) {
			$scope.result = result.message;
		});

		$scope.form = '';
		$timeout(function() {
			$scope.result = '';
		}, 3000);

	};

});

app.controller('listProfessionalController', function($scope, $http, $q, $timeout) {

	$scope.isLoading = true;
	
	$scope.headingTitle = "Escolha o profissional que iremos notificá-lo para entrar em contato o mais breve possível com você!";
	$scope.searchServiceTitle = "Qual serviço procura?";
	$scope.listProfessionalsAvailable = "Profissionais disponíveis para o serviço";
	
	var loadService = $q.defer();
	$http.get('/service').success(function(result) {
		loadService.resolve(result);
	});
	loadService.promise.then(function(result) {
		$scope.services = result;
		$scope.isLoading = false;
	});
	
	$scope.update = function() {
		$scope.isLoading = true;
		console.log($scope.form.serviceType);
	   
		$scope.isEnabled = $scope.form.serviceType != undefined ? true : false;
	   
		var loadData = $q.defer();
		$http.get('/list').success(function(result) {
			loadData.resolve(result);
		});
		loadData.promise.then(function(result) {
			$scope.items = result;
			$scope.isLoading = false;
		});
	}
	

});