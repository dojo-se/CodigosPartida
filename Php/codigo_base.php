<?php
# Esqueleto de código Php, para uso no Dojo-SE
# Escrito por Wagner Luís de Araújo Menezes Macêdo <wagnerluis1982@gmail.com>.
# 
# Para rodar os testes, execute o comando phpunit <arquivo>

function problemaParaResolver()
{
    return true;
}

class ProblemaParaResolverTest extends PHPUnit_Framework_TestCase
{
    function testSimples()
    {
        $this->assertSame(true, problemaParaResolver());
    }
}
