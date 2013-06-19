# encoding: utf-8

# Esqueleto de código Ruby para uso no Dojo-SE
# Escrito por Breno Augusto Santana Moura <basmoura@gmail.com>.
# 
# Para executar os testes, chame o interpretador Ruby com esse arquivo como
# parâmetro. Ex: ruby <caminho_do_arquivo>.rb

require 'test/unit'

class ProblemaParaResolverTest < Test::Unit::TestCase
	def test_simples
		assert_equal(true, ProblemaParaResolver.problema)
	end
end

class ProblemaParaResolver
	def self.problema
		true
	end
end