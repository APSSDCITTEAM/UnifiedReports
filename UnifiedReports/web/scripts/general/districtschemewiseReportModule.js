var app = angular.module('districtSchemewiseReportModule', [])
.controller('FormController', [ '$http', '$scope', function($http, $scope) {
	var self = this;
	  
	
	 $http.post('/unifiedReports/report/getDistrictSchemesReport').then(function(response)
 			{
     	     	
         $scope.data1 = response.data;
         if($scope.data1.successful) {     
        	
        	 $scope.districtschemewisecount = $scope.data1.responseObject.districtscheme;

        	 
        	 if( $scope.districtschemewisecount.length == 0)  
				{  
					       
					$("#errorDiv").show();
					$("#CompanyWiseDiv").hide();  
 					$("#placedDetailsDiv").hide();

					
				}  
			else{  
				$("#errorDiv").hide();
				$("#CompanyWiseDiv").show();
				$("#placedDetailsDiv").hide();

			}    
         }
     }, function(errResponse) {
         console.error('Error while fetching notes');
     }); 
   
	    
	 
	 $scope.getDistrictSchemewiseData = function(data){
		 var obj={
				 district_id : data.district_id,
				 scheme_id : data.scheme_id,
				 program_id : data.program_id,
				 year : data.year
		 }
		 console.log(obj);
		 $http.post('/unifiedReports/report/getDistrictSchemewiseData', obj).then(function(response)
     			{
         	         	   
             $scope.data1 = response.data;
             if($scope.data1.successful) {
             	 
             	$scope.schemeWiseDetails =  $scope.data1.responseObject;
             	 if($scope.schemeWiseDetails.length == 0)  
 				{  
 					  
 					$("#errorDiv").show();
 					$("#CompanyWiseDiv").hide();   					
 					$("#placedDetailsDiv").hide();
 					
 				}  
 			else{  
 				$("#errorDiv").hide();
 				$("#CompanyWiseDiv").hide();
				$("#placedDetailsDiv").show();

 			}    
             	
             }
         }, function(errResponse) {
             console.error('Error while fetching notes');
         }); 
	 }
	 
	
        $scope.exportToExcel = function()
     	{
     		var blob = new Blob([document.getElementById('placedDetailsDiv').innerHTML], { 
     	        type: "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8" 
     	    }); 
     	    var fileName = "District Scheme Wise Report.xls"; 
     	    saveAs(blob, fileName);   
     	};
     	$scope.toggleRegisteredStudents = function()
     	{
     		$("#registeredStudentsSearchRow").toggle();
     	};
	
	$scope.toggle = function(id)    
	{
		$("#" + id).toggle();   
	};    
	
} ]);

