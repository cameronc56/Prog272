# Comments for Cook

Your copy of setActiveMenu should look like this:

```
function setActiveMenuItem() {
	$(".nav li").removeClass("active");
	var menuItem = $('a[href=".' + this.location.pathname + '"]');
    var name = this.location.pathname;
    name = name.slice(1, name.length).trim();
    if (name.length === 0) {
		   	name = 'home';
   	}
    try {
      var menuItem1 = $('#' + name);
      menuItem1.addClass('active');
    } catch(e) {
      // Do Nothing. Suppress error.
    }
}
```

You need to have the **try..catch** statement or you may have problem with
the tests since the menu item may or may not be there.

You are separating method calls with commas when they should be separated with
semicolons. This is what you wrote:

```
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
```

This is what you should write:

```
	$("#getFirstName").click(function() {
		var firstName = $("#inputFirstName").val();
		var lastName = $("#inputLastName").val();
		$("#firstName").html(firstName + " " + lastName + " ");
	});
	$("#getCityStateZip").click(function() {
		var city = $("#inputCity").val();
		var state = $("#inputState").val();
		var zip = $("#inputZip").val();
		var address = $("#inputAddress").val();
		$("#address").html(" - " + address + ", ");
		$("#city").html(city + " ");
		$("#state").html(state + ", ");
		$("#zip").html(zip + " ");
	});
```

Notice the difference, is an object syntax:

```
var myObject = {
    a: 1,
    b: 2,
    c: 'three'
};
```

Here is a function object syntax:

```
function myFunction02() {   
    'use strict';
     
    var myField01 = 3;
    var myField02 = 2;
    var nestedFunction = function() {
        return myField01 + myField02;  
    }; 
    
    return nestedFunction();
}
```

See these references:

- <http://www.elvenware.com/charlie/development/web/JavaScript/JavaScriptObjects.html>
- <http://www.elvenware.com/charlie/development/web/JavaScript/JavaScriptFunctions.html>

In MainCode.html, you wrote:

```
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width">
    <title></title>
    <link rel="stylesheet" href="../public/css/style.css">
    <script src="http://localhost:35729/livereload.js"></script>
    <script src="../public/components/jquery/dist/jquery.js"></script>
    <script src="../public/js/Control.js"></script>
  </head>
  <body>
    <h1></h1>
    <p>Welcome to , Cameron. </p>
    <html></html>
    <body>
      <div class="jsonArea">
        <h2>HTML fields</h2>
        <div class="displayArea">
        etc.
```

This HTML is being inserted into another, existing, HTML document, so there
is no need to include the HTML, HEAD and BODY elements. Instead, you should
write:

```
<div class="jsonArea">
    <h2>HTML fields</h2>

    <div class="displayArea">
        <button id="insertMale" class="button">Insert Male</button>
        <button id="insertFemale" class="button">Insert Female</button>
        <button id="clear" class="button">Clear</button>
    </div>
    <hr>
    etc...
```

Then you need to load jquery, etc, in the **index.html** for your test project:

```
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Mocha Spec Runner</title>

    <link rel="stylesheet" href="../public/components/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="bower_components/mocha/mocha.css">
    <link rel="stylesheet" href="../public/css/Custom.css">
    <link rel="stylesheet" href="../public/css/Buttons.css">
</head>
<body>
    <div id="mocha"></div>
    <script src="bower_components/mocha/mocha.js"></script>
    <script>mocha.setup('bdd')</script>
    <script src="bower_components/chai/chai.js"></script>
    <script>
        var assert = chai.assert;
        var expect = chai.expect;
        var should = chai.should();
    </script>

    <!-- The HTML to test goes here -->
    <div id="mainArea"></div>

    <!-- include source files here... -->
    <link href="../public/css/style.css" rel="stylesheet" type="text/css">
    <script src="../public/components/jquery/dist/jquery.js"></script>
    <script src="../public/components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="../public/js/Control.js"></script>

    <!-- include spec files here... -->
    <script src="spec/test.js"></script>

    <script>mocha.run()</script>
</body>
</html>
```

The key lines are these:

```
    <script src="../public/components/jquery/dist/jquery.js"></script>
    <script src="../public/components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="../public/js/Control.js"></script>
```

You need to move everything out of document ready and put it in a method called initalize:

```javascript
function setActiveMenuItem() { etc }
function initialize() { etc }

$(document).ready(function () {
    setActiveMenuItem();
    initialize();
});
```

Once you do all this, the errors on your test page start to go away. For 
instance. You write:

```
it('expect age to equal 32', function() {
   var age = parseInt($("#age").html());
   expect(age).to.equal(32);
});
```

This test should pass, but you do not inseart a number into 
age, instead you insert a string on about line 35 of Control.js:

```
$("#age").html(" - Age: " + age);
```

If you had written this, the test would pass:

```
$("#age").html(age);
```