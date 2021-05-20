var formModule = angular.module('formModule', [])
.controller('formController', [ '$http', '$scope', function($http, $scope) {
		var self = this;
		$scope.login = function(user) {
	        $http.post('/unifiedReports/auth/login', user).then(function(response) {
				$scope.data = response.data;
				if($scope.data.successful) {
					console.log($scope.data.responseObject.loginData);
					setSessionValue("userName", $scope.data.responseObject.loginData.userName);
					setSessionValue("context", $scope.data.responseObject.loginData.context);
					setSessionValue("roleid", $scope.data.responseObject.loginData.roleid);
					if($scope.data.responseObject.loginData.roleid == 1)
						{
						Andromeda.showLoginHome();
						}     
					      
				
				} else {                 
					       
					var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>Unauthorized to access!</div>";
					jQuery("#errorDiv").html(message);
				}
			}, function(errResponse) {
				console.error('Error ...');
			});
	    };   
} ]);   
   