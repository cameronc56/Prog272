$(document).ready(function () {
	$("#getFirstName").click(function() {
		var firstName = $("#inputFirstName").val();
		$("#firstName").html(firstName);
	}),
	$("#getLastName").click(function() {
		var lastName = $("#inputLastName").val();
		$("#lastName").html(lastName);
	}),
	$("#getCityStateZip").click(function() {
		var city = $("#inputCity").val();
		var state = $("#inputState").val();
		var zip = $("#inputZip").val();
		$("#city").html(city);
		$("#state").html(state);
		$("#zip").html(zip);
	}),
	$("#getAge").click(function() {
		var age = $("#inputAge").val();
		$("#age").html(age);
	}),
	$("#loadWithJSON").click(function() {
		$.getJSON('Presidents.json', function(result) {
			console.log(JSON.stringify(result, null, 4));			
			$("#jsonDisplay").html("");
			for(var i = 0; i < result.length; i++) {
				$("#jsonDisplay").append("<li>" + result[i].firstName + " " + result[i].lastName + "</li>");
			}
		})
	}),
	$("#loadWithAjax").click(function() {
		$.ajax({
			type: "GET",
			url: "./Scientists.json",
			dataType: "json",
			success: function(json) {
				console.log(JSON.stringify(json, null, 4));
				$("#jsonDisplay").html("");
				for(var i = 0; i < json.length; i++) {
					$("#jsonDisplay").append("<li>" + json[i].firstName + " " + json[i].lastName + "</li>");
				}
			},

			error: function() {
				console.log("Error");
			},
		})
	}),
	$("#insertMale").click(function() {
		$("#inputFirstName").val("Nikola");
		$("#inputLastName").val("Tesla");
		$("#inputCity").val("Smiljan");
		$("#inputState").val("NY");
		$("#inputZip").val("32211");
		$("#inputAge").val("32");
		$("#male").checked = true;
		$("#female").checked = false;
	}),
	$("#insertFemale").click(function() {
		$("#inputFirstName").val("Marie");
		$("#inputLastName").val("Curie");
		$("#inputCity").val("Passy");
		$("#inputState").val("CA");
		$("#female").checked = true;
		$("male").checked = false;
		$("#inputZip").val("99999");
		$("#inputAge").val("99999");
	}),
	$("#clear").click(function() {
		$("#inputFirstName").val("");
		$("#inputLastName").val("");
		$("#inputCity").val("");
		$("#inputState").val("");
		$("#inputZip").val("");
		$("#inputAge").val("");
		$("#male").checked = false;
		$("#female").checked = false;
	})
});

