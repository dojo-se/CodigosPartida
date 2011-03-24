#!/bin/bash

# Script para facilitar o processo de testes unitários para o Java no Coding Dojo-SE
#
# Escrito por Wagner Luís de Araújo Menezes Macêdo <wagnerluis1982@gmail.com>.

# Localização da biblioteca junit
junitpath='/usr/share/java/junit4.jar'

# Função para exibir uma mensagem e sair
function sair() {
    mensagem=$1 code=$2

    echo $mensagem; exit $code
}

# Nome da classe de teste: Parâmetro $1 + 'Test'
testclass="${1}Test"

# Finaliza o script quando ou o subdiretório src ou a classe de teste não exista
if ! ( [ -d "src" ] && [ -f "test/${testclass}.java" ] )
then
    sair "Informe a classe a testar como único parâmetro" 1
fi

# Diretório temporário para os arquivos compilados
tempdir=$(mktemp -d) || sair "Não foi possível criar o diretório temporário" 2
trap "rm -rf -- '$tempdir'" EXIT

# Caminha para o diretório do projeto
dir=$(dirname "$0")
cd "$dir"

function main() {
    # Compila os arquivos java com destino para o diretório 'bin'
    javac -cp $junitpath -sourcepath src -d "$tempdir" "test"/*.java
    # Executa os testes unitários
    java -cp $tempdir:$junitpath org.junit.runner.JUnitCore "$testclass"
}

main
