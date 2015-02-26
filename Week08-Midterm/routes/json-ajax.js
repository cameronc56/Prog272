var express = require('express');
var router = express.Router();

/* GET json-ajax page. */

router.get('/', function(req, res) {
    res.render('json-ajax', { title: 'json-ajax' });
});

module.exports = router;
