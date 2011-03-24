#!/bin/bash

# Esqueleto de código Shell Script (Bash) para uso no Dojo-SE
# Escrito por Wagner Luís de Araújo Menezes Macêdo <wagnerluis1982@gmail.com>.
#
# Para rodar os testes, execute esse arquivo

# Códigos do Problema
function problema_para_resolver() {
    echo true
}

# Testes Unitários
test_simples() {
    assertEquals $(problema_para_resolver) true
}

# Chamada do ShUnit2
dir=$(dirname $0)
source "$dir/shunit2/shunit2"
