#!/usr/bin/env fish

# Variables
set -g repo_pwd ~/flask-dojo
set -g dojo_name "Flask Dojo"
set -g quantum 5m

function z
    command zenity --title="$dojo_name" $argv ^ /dev/null
end

function ask_name
    set -g name (z --entry --text="Bem-vindo, piloto :)\nQual é o seu nome?")
    while [ $status -ne 0 -o -z "$name" ]
        set -g name (z --entry --text="Não entendi.\nQual é o seu nome?")
    end
end

function ask_email
    set -g email (z --entry --text="Oi, $name.\nQual é o seu email?")
    while [ $status -ne 0 -o -z "$email" ]
        set -g email (z --entry --text="Não entendi.\nQual é o seu email?")
    end
end

while true
    ask_name; ask_email
    pushd $repo_pwd
    git config user.name "$name"
    git config user.email "$email"
    popd
    sleep $quantum; z --warning --text="Acabou o seu tempo, $name :(\nPromova o seu copiloto e senta lá!"
end
