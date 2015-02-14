$(document).ready(function () {
	$("#getFirstName").click(function() {
		var firstName = $("#firstName").val();
		var lastName = $("#lastName").val();
		$("#displayFirstName").html(firstName + " " + lastName);
	})
	$("#getLocation").click(function() {
		var city = $("#city").val();
		var state = $("#state").val();
		var zip = $("#zip").val();
		$("#displayCity").html(city);
		$("#displayState").html(state);
		$("#displayZip").html(zip);
	})
	$("#loadWithJSON").click(function() {
		$.getJSON('Presidents.json', function(result) {
			console.log(JSON.stringify(result, null, 4));			
			for(var i = 0; i < result.length; i++) {
				$("#displayPresidents").append("<li>" + result[i].firstName + "</li>");
			}
		})
	})
});
