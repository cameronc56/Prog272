/**
 * Created by charliecalvert on 1/13/15.
 */
(function() {
	'use strict';
	exports.stringSlices = {
		getFirstThreeCharacters: function(input) {
       			return input.slice(0, 3);
   	        },

		getLastThreeCharacters: function(input) {
			return input.slice(input.length - 3, input.length);
		},
		
		getMiddleThreeCharacters: function(input) {
			return input.slice((input.length /2) -1, (input.length /2) + 2);
		},

		getAllButFirstAndLast: function(input) {
			return input.slice(1, input.length - 1);
		},

		getAllButFirstAndLastIfSame: function(input) {
			if(input.charAt(0) == input.charAt(input.length - 1)) {
				return input.slice(1, input.length - 1);
			} else {
				return input;
			}
		}
	};
}());
