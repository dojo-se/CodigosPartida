# C�digos de partida Scala

C�digos de partida em Scala, feito com specs2, uma ferramenta de testes para estilo BBD.
Para rodar � necess�rios instalar as seguintes ferramentas

  - Compilador Scala: http://www.scala-lang.org/download/
  - Scala Build Tool(SBT): http://www.scala-sbt.org/download.html
  - Scala IDE(Opcional): http://scala-ide.org/download/current.html

Para rodar os testes use o terminal ou prompt de comando para rodar a tarefa test da SBT:
> sbt test

Os projetos est�o configurados com o plugin sbt eclipse, para permitir converter projetos sbt em projetos eclipse(ou scala ide). Para tanto � preciso rodar a seguinte linha de comando:
> sbt eclipse

H� outros plugins para outra ides no link na se��o "plugins for IDEs" http://www.scala-sbt.org/0.13.1/docs/Community/Community-Plugins.html