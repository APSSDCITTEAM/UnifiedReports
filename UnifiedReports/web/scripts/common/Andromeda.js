var Andromeda = {

	showPage : function(path, targetDiv) {
		var jqxhr = jQuery.post(path, function(data) {
			jQuery("#" + targetDiv).html(data);
		});
	},

	showHomePage : function() {
		var path = "/unifiedReports/html/general/Home.html";
		Andromeda.showPage(path, "indexDiv");
	},
	
	
	showApplicants : function() {
		var path = "/unifiedReports/html/general/JobApplicants.html";  
		Andromeda.showPage(path, "replaceDiv");
	},	   
	     
	showPlacedData : function() {   
		var path = "/unifiedReports/html/general/PlacedData.html";
		Andromeda.showPage(path, "loginHomeDiv");
	},
	
	showPlacementsPage : function() {
		var path = "/unifiedReports/html/general/Placements.html";   
		Andromeda.showPage(path, "replaceDiv");
	},
	showPlacedReport : function() {
		var path = "/unifiedReports/html/general/PlacedReport.html";
		Andromeda.showPage(path, "replaceDiv");
	},
	showJobs : function() {
		var path = "/unifiedReports/html/general/JobsReport.html";
		Andromeda.showPage(path, "replaceDiv");
	},
	
	
	
	showSlidePage : function() {
		var path = "/unifiedReports/html/general/Slideshow.html";
		Andromeda.showPage(path, "replaceDiv");
	},
	
	
	showSchemewiseReport : function() {
		var path = "/unifiedReports/html/general/DistrictSchemeWiseReport.html";
		Andromeda.showPage(path, "replaceDiv");
	},
	
	showSchemeTCTPwiseReport : function() {
		var path = "/unifiedReports/html/general/DistrictSchemeTCTPWiseReport.html";
		Andromeda.showPage(path, "replaceDiv");
	},
	
	showSchemeSectorwiseReport : function() {
		var path = "/unifiedReports/html/general/DistrictSchemeSectorWiseReport.html";
		Andromeda.showPage(path, "replaceDiv");
	},
	
	showSchemeGenderwiseReport : function() {
		var path = "/unifiedReports/html/general/DistrictSchemeGenderWiseReport.html";
		Andromeda.showPage(path, "replaceDiv");
	},
	
	showSchemeGenderCategorywiseReport : function() {
		var path = "/unifiedReports/html/general/DistrictSchemeGenderCategoryWiseReport.html";
		Andromeda.showPage(path, "replaceDiv");
	},
	
	showDegreecollegewiseReport : function() {
		var path = "/unifiedReports/html/general/DegreeCollegeWisePlacedReport.html";
		Andromeda.showPage(path, "replaceDiv");
	},
	
	
	
	
	      
	
	showLoginPage : function() {
		var path = "/unifiedReports/html/general/Login.html";
		Andromeda.showPage(path, "replaceDiv");
	},
	
	showLoginHome : function() {
		var path = "/unifiedReports/html/general/LoginHome.html";
		Andromeda.showPage(path, "indexDiv");
	},
	
	
	showRedirectedPage : function() {
		window.open('http://202.65.133.69:8181/report', '_newtab');
		// window.location.href = "http://202.65.133.69:8181/report";
	},

	home : function() {
		window.location.reload();
	},

	setSessionValue : function(key, value) {
		sessionStorage.setItem(key, value);
	},

	getSessionValue : function(key) {
		return sessionStorage.getItem(key);
	},

	removeSessionValue : function(key) {
		sessionStorage.removeItem(key);
	},

	showError : function(errorMessage) {
		var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"
				+ errorMessage + "</div>";
		jQuery("#errorDiv").html(message);
	},

	logout : function() {
		var username = Andromeda.getSessionValue("username") || "";
		Andromeda.setSessionValue("username", null);
		Andromeda.setSessionValue("context", null);
		Andromeda.setSessionValue("collegeid", null);
		var data = {
			username : username
		};
		Andromeda.post('/andromeda/security/logout', data);
		Andromeda.showHomePage();
	},

	post : function(url, data) {
		var responseData = null;

		jQuery.ajax({
			url : url,
			type : 'post',
			data : JSON.stringify(data), // Stringified Json Object
			dataType : 'json',
			async : false, // Cross-domain requests and dataType: "jsonp"
							// requests do not support synchronous operation
			cache : false, // This will force requested pages not to be cached
							// by the browser
			processData : false, // To avoid making query String instead of
									// JSON
			contentType : "application/json; charset=utf-8",
			success : function(data) {
				responseData = data;
			}
		});   
		return responseData;
	},   

	isUserLoggedIn: function() {
		var username = Andromeda.getSessionValue("userName");
		var context = Andromeda.getSessionValue("context");
		var roleid = Andromeda.getSessionValue("roleid");      
		var login = {  
			userName : username,   
			context : context,
			roleid : roleid,
		     };   
		var responseData = Andromeda.post('auth/loggedin', login) ;
		return responseData;     
	},


	showModulesPage: function(userName) {
		var object = 
		{
			userName: userName
		};
	 var data = Andromeda.post('/andromeda/modules', object);
			Andromeda.showModules(data);
	},
	
	loadModule: function(userName,moduleId,moduleUrl) {
		Andromeda.setSessionValue("userName",userName);
		Andromeda.setSessionValue("moduleId",moduleId);
		jQuery("#amdContainerDiv").load(moduleUrl);
	},
	
	loadLink: function(path) {
		var targetDiv = "amdContentDiv";
		Andromeda.showPage(path, targetDiv);
	},
	
	showLinks: function(data) {
		var linksDataString = "No links present";
		if ((data) && (data.links) && (data.links.length > 0))
		{
				//var moduleString = "<div id='sidebar' class='well sidebar-nav'>";
				var moduleString = "";	
			for(var i=0; i<data.links.length; i++)
			{
				var serviceId = data.links[i].id || "No ID";
				var serviceName = data.links[i].name || "No Name";
				var serviceDescription = data.links[i].description || "No Description";
				var serviceUrl = data.links[i].url || "No Url";
				var serviceFunction = data.links[i].functionName || "No Function";
				//var moduleTestUrl = data.modules[i].testUrl;
				//var userName = Andromeda.getSessionId("username");
				//"Andromeda.loadLink('" + serviceUrl + "')
				moduleString += "<li class='left-menu-item cursor-pointer'	onClick='"+serviceFunction+"'><a>"+serviceDescription+"</a></li>";		
			}
			linksDataString = moduleString;
		}
		jQuery("#amdContentDiv").html(linksDataString);
	},
	
	loadServices: function(){
	var userName = Andromeda.getSessionValue("userName");
	var moduleId = Andromeda.getSessionValue("moduleId");
		var path = "/andromeda/moduleServices/"+userName+"/"+moduleId;
		var jqxhr = Andromeda.post(path,'');
		Andromeda.showLinks(jqxhr);
	},
	
	showModules: function(data) {
		var modulesDataString = "No modules present";
	
		if ((data) && (data.modules) && (data.modules.length > 0))
		{
			modulesDataString = "<div class=\"row\">";
			for(var i=0; i<data.modules.length; i++)
			{
				var moduleId = data.modules[i].id || "No ID";
				var moduleName = data.modules[i].name || "No Name";
				var moduleDescription = data.modules[i].description || "No Description";
				var moduleUrl = data.modules[i].url || "No Url";
				var moduleTestUrl = data.modules[i].testUrl;
				var userName = Andromeda.getSessionValue("userName");
				var moduleString = "<div class=\"col-md-3 amdModuleDiv\" onClick=\"Andromeda.loadModule('" + userName + "'," +moduleId+ ",'"+ moduleUrl +"');\">";
				moduleString += "<div class=\"amdModule\" id=\"amdModule"+i+"\"><table border=\"0\"><tr>";
				if(moduleName=='SDC'){
					moduleString += "<td><div class=\"amdModuleIcon\"><span style=\"font-size:40px;color:green;\" class=\"glyphicon glyphicon-blackboard\"></div></td>";
				} else if(moduleName=='ESDM'){
					moduleString += "<td><div class=\"amdModuleIcon\"><img src='andromeda/images/icons/ESDM.png' /></div></td>";
				} else if(moduleName=='Employee'){
					moduleString += "<td><div class=\"amdModuleIcon\"><span style=\"font-size:40px;color:skyblue;\" class=\"glyphicon glyphicon-user\"></span></div></td>";
				} else if(moduleName=='Reports'){
					moduleString += "<td><div class=\"amdModuleIcon\"><img src='andromeda/images/icons/Reports.png' /></div></td>";
				} else if(moduleName=='SkillAmaravati'){
						moduleString += "<td><div class=\"amdModuleIcon\"><span style=\"font-size:40px;color:#337ab7;\" class=\"glyphicon glyphicon-calendar\"></div></td>";
				} else if(moduleName=='Companies'){
                        moduleString += "<td><div class=\"amdModuleIcon\"><span style=\"font-size:40px;color:peru;\" class=\"glyphicon glyphicon-tower\"></div></td>";
                } else{
					moduleString += "<td><div class=\"amdModuleIcon\"></div></td>";
				}
				
				moduleString += "<td><div class=\"amdModuleTitle\">"+ moduleName +"</div></td>";
				moduleString += "</tr><tr><td colspan=\"2\">";
				moduleString += "<div class=\"amdModuleDescription\">" + moduleDescription + "</div>";
				moduleString += "</td></tr></table></div></div>";
				
				modulesDataString += moduleString;
			}
			
			modulesDataString += "</div>";
		}
		jQuery("#amdContentDiv").html(modulesDataString);
	}

};
