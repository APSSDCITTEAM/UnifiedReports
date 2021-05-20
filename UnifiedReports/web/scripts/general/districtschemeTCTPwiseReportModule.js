var app = angular.module('districtSchemetctpwiseReportModule', [])
.controller('FormController', [ '$http', '$scope', function($http, $scope) {
	var self = this;
	  
	
	 $http.post('/unifiedReports/report/getDistrictSchemesTCTPReport').then(function(response)
 			{
     	     	
         $scope.data1 = response.data;
         if($scope.data1.successful) {     
        	
        	 $scope.districtschemetctpwisecount = $scope.data1.responseObject.districtschemetctp;

        	 
        	 if( $scope.districtschemetctpwisecount.length == 0)  
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
   
	    
	 
	 $scope.getDistrictSchemeTCTPwiseData = function(data){
		 var obj={
				 district_id : data.district_id,
				 scheme_id : data.scheme_id,
				 program_id : data.program_id,
				 tpid : data.tpid,
				 tcid : data.tcid,
				 year : data.year
		 }
		 console.log(obj);
		 $http.post('/unifiedReports/report/getDistrictSchemeTCTPwiseData', obj).then(function(response)
     			{
         	         	   
             $scope.data1 = response.data;
             if($scope.data1.successful) {
             	 
             	$scope.schemetctpWiseDetails =  $scope.data1.responseObject;
             	 if($scope.schemetctpWiseDetails.length == 0)  
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
     	    var fileName = "District Scheme-TC-TP wise Report .xls"; 
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

