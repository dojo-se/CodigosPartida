/// <reference path="../types/qunit.d.ts" />

import p = require('Problem')

var problema: p.Problema;

QUnit.module("Modulo Teste", {
	setup: function(){
		problema = new p.Problema(true);
	},
	teardown: function(){
		/* Se precisa fazer algo após os testes */
	}
})

QUnit.test("testInitial", function(assert){
	expect(2);
	assert.ok(problema.ehVerdadeiro(), "Verifica se é Verdadeiro");
	assert.equal(problema.ehVerdadeiro(), true, "Verificação com o .equal");
});
