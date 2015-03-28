name := "Fizz Buzz Scala"

version := "1.0"

scalaVersion := "2.11.4"

resolvers += "Mvn Repository" at "http://central.maven.org/maven2/"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "2.4.15" % "test", 
			    "org.specs2" %% "specs2-junit" % "2.4.15" % "test", 
			    "org.scalatest" %% "scalatest" % "2.2.4" % "test",
			    "junit" % "junit" % "4.12" % "test")