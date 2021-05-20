var app = angular.module('degreecollegewiseplacedReportModule', [])
.controller('FormController', [ '$http', '$scope', function($http, $scope) {
	var self = this;
	  
	
	 $http.post('/unifiedReports/report/getDegreeCollegeWiseReport').then(function(response)
 			{
     	     	
         $scope.data1 = response.data;
         if($scope.data1.successful) {     
        	
        	 $scope.degreecollegewisecount = $scope.data1.responseObject.degeecollege;

        	 
        	 if( $scope.degreecollegewisecount.length == 0)  
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
   
	    
	 
	 $scope.getDegreeCollegewisePlacedData = function(data){
		 var obj={
				 district_id : data.district_id,
				 college_id : data.collegeid,      
				 program_id : data.program_id,
				year : data.year
		 }
		 console.log(obj);
		 $http.post('/unifiedReports/report/getDegreeCollegewisePlacedData', obj).then(function(response)
     			{
         	         	   
             $scope.data1 = response.data;
             if($scope.data1.successful) {
             	 
             	$scope.collegewiseplacedDetails =  $scope.data1.responseObject;
             	 if($scope.collegewiseplacedDetails.length == 0)  
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
     	    var fileName = "Degree College Wise Placed Report .xls"; 
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

