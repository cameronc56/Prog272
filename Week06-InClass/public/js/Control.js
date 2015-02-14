$(document).ready(function() {
		$("#debug").html("it's loading");
		$("#getFirstName").click(function() {
			var first = $("#firstName").val();
			$("#displayFirstName").html(first);
		});
		$("#getLastName").click(function() {
			var last = $("#lastName").val();
			$("#displayLastName").html(last);
		});
        $("#getPresidents").click(function() {
			$.getJSON('Presidents.json', function(result) {
				for(var i = 0; i < result.length; i++) {
					$("#displayPresidents").append("<li>" + result[i].firstName + "</li>");
				}
			})
		});
});
