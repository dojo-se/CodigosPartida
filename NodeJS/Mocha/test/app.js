var assert = require("assert");

//Resolva o problema
function problemaParaResolver(param){
	return true;
}

//Descreva e teste
//Para testar, execute: mocha
describe('problemaParaResolver()', function(){
  it('should return true', function(){
    assert.equal(problemaParaResolver(0), true);
  })
})

exports.problemaParaResolver = problemaParaResolver;