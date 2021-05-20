var app = angular.module('districtSchemegenderwiseReportModule', [])
.controller('FormController', [ '$http', '$scope', function($http, $scope) {
	var self = this;
	  
	
	 $http.post('/unifiedReports/report/getDistrictSchemesGenderReport').then(function(response)
 			{
     	     	
         $scope.data1 = response.data;
         if($scope.data1.successful) {     
        	
        	 $scope.districtschemegenderwisecount = $scope.data1.responseObject.districtschemegender;

        	 
        	 if( $scope.districtschemegenderwisecount.length == 0)  
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
   
	    
	 
	 $scope.getDistrictSchemegenderwiseData = function(data){
		 var obj={
				 district_id : data.district_id,
				 scheme_id : data.scheme_id,
				 program_id : data.program_id,
				gender : data.gender,
				year : data.year
		 }
		 console.log(obj);
		 $http.post('/unifiedReports/report/getDistrictSchemegenderwiseData', obj).then(function(response)
     			{
         	         	   
             $scope.data1 = response.data;
             if($scope.data1.successful) {
             	 
             	$scope.schemegenderWiseDetails =  $scope.data1.responseObject;
             	 if($scope.schemegenderWiseDetails.length == 0)  
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
     	    var fileName = "District Scheme Gender wise Report .xls"; 
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

