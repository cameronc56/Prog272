function setActiveMenuItem() {
	$(".nav li").removeClass("active");
	var menuItem = $('a[href=".' + this.location.pathname + '"]');
    var name = this.location.pathname;
    name = name.slice(1, name.length).trim();
    if (name.length === 0) {
		   	name = 'home';
   	}
    var menuItem1 = $('#' + name);
    menuItem1.addClass('active');
}

$(document).ready(function() {
	setActiveMenuItem();		
});

$(document).ready(function () {
	$("#getFirstName").click(function() {
		var firstName = $("#inputFirstName").val();
		var lastName = $("#inputLastName").val();
		$("#firstName").html(firstName + " " + lastName + " ");
	}),
	$("#getCityStateZip").click(function() {
		var city = $("#inputCity").val();
		var state = $("#inputState").val();
		var zip = $("#inputZip").val();
		var address = $("#inputAddress").val();
		$("#address").html(" - " + address + ", ");
		$("#city").html(city + " ");
		$("#state").html(state + ", ");
		$("#zip").html(zip + " ");
	}),
	$("#getAge").click(function() {
		var age = $("#inputAge").val();
		$("#age").html(" - Age: " + age);
	}),

	$("#getJson").click(function() {
		$.getJSON('Presidents.json', function(result) {
			console.log(JSON.stringify(result, null, 4));			
			$("#jsonDisplay").html("");
			for(var i = 0; i < result.length; i++) {
				console.log("hi");
				$("#jsonDisplay").append("<li class='list-group-item'>" + result[i].firstName + " " + result[i].lastName + "</li>");
			}
		})
	}),
	$("#getAjax").click(function() {
		$.ajax({
			type: "GET",
			url: "./Scientists.json",
			dataType: "json",
			success: function(json) {
				console.log(JSON.stringify(json, null, 4));
				$("#jsonDisplay").html("");
				for(var i = 0; i < json.length; i++) {
					$("#jsonDisplay").append("<li class='list-group-item'>" + json[i].firstName + " " + json[i].lastName + "</li>");
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
		$("#inputAddress").val("55555 55th Street");
		$("#inputZip").val("32211");
		$("#inputAge").val("32");
		$("#bootmale").prop("checked", true);
		$("#bootfemale").prop("checked", false);
	}),
	$("#insertFemale").click(function() {
		$("#inputFirstName").val("Marie");
		$("#inputLastName").val("Curie");
		$("#inputCity").val("Passy");
		$("#inputState").val("CA");
		$("#inputAddress").val("77777 77th Court");
		$("#bootfemale").prop("checked", true);
		$("bootmale").prop("checked", false);
		$("#inputZip").val("99999");
		$("#inputAge").val("99999");
	}),
	$("#clear").click(function() {
		$("#inputFirstName").val("");
		$("#inputLastName").val("");
		$("#inputCity").val("");
		$("#inputState").val("");
		$("#inputAddress").val("");
		$("#inputZip").val("");
		$("#inputAge").val("");
		$("#bootmale").prop("checked", false);
		$("#bootfemale").prop("checked", false);
	})
});

