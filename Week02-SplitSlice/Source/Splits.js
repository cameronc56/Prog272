/**
 * Created by charliecalvert on 1/13/15.
 */

(function() {
	 "use strict";
       	 exports.splits = {
   	 	splitOnDash: function (value) {
       	 		return value.split('-');
    		},

	   	 splitOnCommaWithSpace01: function (value) {
      		 	 var split = value.split(',');
       			 return split.map(function (item) {
       		    		 return item.trim();
       			 });
   		 },

   		 splitOnCommaWithSpace02: function (value) {
       			 return value.split(',').map(function (item) {
           			 return item.trim();
       			 });
		},

		splitOnSemicolon: function(value) {
			return value.split(';');
		},

		splitOnTab: function(value) {
			return value.split('\t');
		},

		splitOnNewLine: function(value) {
			return value.split('\n');
		},

		splitOnComma: function(value) {
			return value.split(',');
		},

		reverseString: function(value) {
			return (value.split("")).reverse().join("");
		}
	};
}());
