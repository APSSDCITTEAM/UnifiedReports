var jobModule = angular.module('batchModule2',['ngMap','ngSanitize']);
jobModule.controller('FormController',['$scope','$http',function($scope, $http) {
	
	
 $http.post('/unifiedReports/report/getJobApplicants').then(function(response)
		 {
	 
	 console.log(response.data);
	 $scope.data = response.data;
	 console.log("data:"+$scope.data);
		
		if ($scope.data.successful) {			
				
			$scope.CompanyWiseApplicantsCount = $scope.data.responseObject;
			
			if($scope.CompanyWiseApplicantsCount == 0){
				
				$("#errorDiv").show();
				$("#CompanyWiseDiv").hide();
				$("#CompanyWiseApplicantsDiv").hide();
				$("#DateApplicantsDiv").hide();
				
			}
			else{
				$("#errorDiv").hide();
				$("#CompanyWiseDiv").show();
				$("#CompanyWiseApplicantsDiv").hide();
				$("#DateApplicantsDiv").hide();
				
				
			}
							
		}
		 
		 });
 
 $scope.showDateswiseApplicants = function(data)
 {
	 
	 var dateSearch = $("#dateSearch").val();
	 $scope.dateWise = dateSearch;
	 
	 var jobid = Andromeda.getSessionValue("jobid");
	
	 var company = Andromeda.getSessionValue("company");
	 $scope.company = company;
	 var obj = {
			 
			 jobid : jobid,
			 dateSearch : dateSearch.split("-").reverse().join("-")
	 }
	 $http.post('/unifiedReports/report/showDateswiseApplicants',obj).then(function(response)
			 {
		 
		 console.log(response.data);
		 $scope.data = response.data;
		
			if ($scope.data.successful) {			
				
				$scope.DateWiseApplicants = $scope.data.responseObject;
				
				if($scope.DateWiseApplicants == 0){
					
					$("#errorDiv").show();
					$("#CompanyWiseDiv").hide();
					$("#CompanyWiseApplicantsDiv").hide();
					$("#DateApplicantsDiv").hide();
					
				}
				else{
					$("#errorDiv").hide();
					$("#CompanyWiseDiv").hide();
					$("#CompanyWiseApplicantsDiv").hide();
					$("#DateApplicantsDiv").show();
					
				}
								
			}
			 
			 });
	 
 }   
        
 $scope.getApplicantDetails = function(data)
 {
	 console.log(data.id);
	 Andromeda.setSessionValue("jobid",data.id);
	 Andromeda.setSessionValue("company",data.company);
	
	 $scope.company = data.company;
	 $http.post('/unifiedReports/report/getApplicantDetails',data.id).then(function(response)
			 {
		 
		 
		 $scope.data = response.data;
		
			
			if ($scope.data.successful) {			
					
				$scope.CompanyWiseApplicants = $scope.data.responseObject;
				//$scope.correctDate = $scope.CompanyWiseApplicants['date'].split("-").reverse().join("-")
				if($scope.CompanyWiseApplicants == 0){
					
					$("#errorDiv").show();
					$("#CompanyWiseDiv").hide();
					$("#CompanyWiseApplicantsDiv").hide();
					$("#DateApplicantsDiv").hide();
					
				}
				else{
					$("#errorDiv").hide();
					$("#CompanyWiseDiv").hide();
					$("#CompanyWiseApplicantsDiv").show();
					$("#DateApplicantsDiv").hide();
					
				}
								
			}
			 
			 });
	 
 }
    $scope.toggleRegisteredStudents = function()
	{
		$("#registeredStudentsSearchRow").toggle();
	};
 $scope.exportRegisteredStudentsDatatoExcel = function()
	{
		var blob = new Blob([document.getElementById('CompanyWiseApplicantsDiv').innerHTML], { 
	        type: "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8" 
	    }); 
	    var fileName = "Job Applicants.xls"; 
	    saveAs(blob, fileName); 
	};
 
	
	 $scope.exportDateWiseStudentsDatatoExcel = function()
		{
			var blob = new Blob([document.getElementById('DateApplicantsDiv').innerHTML], { 
		        type: "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8" 
		    }); 
		    var fileName = "Date Wise Applicants.xls"; 
		    saveAs(blob, fileName); 
		};

 
}]);