var assert = require('assert');
var hello = require('../src/hello');

describe('greeter', function(){
	it('should say Hello to the World', function() {
		assert.equal(hello.greet('World'),'Hello, World!');
	});
});