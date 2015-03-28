# Códigos de partida Scala

Códigos de partida em Scala, feito com specs2, uma ferramenta de testes para estilo BBD.
Para rodar é necessários instalar as seguintes ferramentas

  - Compilador Scala: http://www.scala-lang.org/download/
  - Scala Build Tool(SBT): http://www.scala-sbt.org/download.html
  - Scala IDE(Opcional): http://scala-ide.org/download/current.html

Para rodar os testes use o terminal ou prompt de comando para rodar a tarefa test da SBT:
> sbt test

Os projetos estão configurados com o plugin sbt eclipse, para permitir converter projetos sbt em projetos eclipse(ou scala ide). Para tanto é preciso rodar a seguinte linha de comando:
> sbt eclipse

Há outros plugins para outra ides no link na seção "plugins for IDEs" http://www.scala-sbt.org/0.13.1/docs/Community/Community-Plugins.html