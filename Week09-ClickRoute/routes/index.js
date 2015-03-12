var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(request, response) {
  response.render('index', { title: 'Click Routes' });
});

router.get('/Item01', function(request, response) {
    var result = { "result": "Success", "route": "/Item01", "message": "You clicked Item01" };
    response.send(result);
});

router.get('/Item02', function(request, response) {
	var result = {"result": "Success", "route": "/Item02", "message": "You clicked Item02" };
	response.send(result);
});

router.get('/Item03', function(request, response) {
	var result = {"result": "Success", "route": "/Item03", "message": "You clicked Item03" };
	response.send(result);
});

module.exports = router;
