var app = angular.module('Foo', []);

// Controller Part

app.controller('FooController', function($scope, $http) {

	$scope.foos = [];

	$scope.fooForm = {
		fooId : -1,
		fooCode : "",
		fooName : ""
	};

	_loadFoos();

	function _loadFoos() {
		$http({
			method : 'GET',
			url : '/api/Foos'
		}).then(function(response) {
			$scope.foos = response.data;
		});

	}

	$scope.clearForm = function() {
		_clearFormData();
	}

	$scope.editFoo = function(foo) {
		$scope.fooForm.fooId = foo.fooid;
		$scope.fooForm.fooCode = foo.foocode;
		$scope.fooForm.fooName = foo.fooname;
	};

	$scope.submitFoo = function() {
		var method = "POST";
		var url = "/api/Foo/updateFoo";
		$http({
			method : method,
			url : url,
			data : angular.toJson($scope.fooForm),
			headers : {
				'Content-Type' : 'application/json'
			}
		}).then(_success, _error);
	};

	$scope.deleteFoo = function(foo) {
		$http({
			method : 'DELETE',
			url : '/api/Foo/delete/' + foo.fooid
		}).then(_success, _error);
		_loadFoos();
	};

	function _success(response) {
		_loadFoos();
		_clearFormData();
	}

	function _clearFormData() {
		$scope.fooForm.fooId = -1;
		$scope.fooForm.fooCode = "";
		$scope.fooForm.fooName = "";
	}

	function _error(response) {
		var data = response.data;
		var status = response.status;
		var header = response.header;
		var config = response.config;
		alert("Error: " + status + ":" + data);
	}

});