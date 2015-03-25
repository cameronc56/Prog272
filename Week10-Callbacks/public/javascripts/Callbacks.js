function callbackHandler(int1, int2, callback) {
		var message = callback(int1, int2).toString();        
		showMessage(message);
		console.log("hello");
}

function showMessage(message) {
				$("#myList").append("<li>" + message + "</li>");
				console.log(message);
};

function callRoute() {
		        showMessage("callRoute was called");
				        $.getJSON("/getNine", function(json) {
								                showMessage(JSON.stringify(json));
												                showMessage(json.result);
																        });
};


callbackHandler(3, 3, function(a, b) {
		        return a + b;
});

callbackHandler(4, 2, function(a, b) {
		        return a % b;
});

callbackHandler(4, 4, function(a, b) {
		        return b * 5280;
});
$("#test").append("HELJKSFJLKSDFJ");

