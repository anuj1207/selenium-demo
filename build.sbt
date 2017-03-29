
name := "selenium-demo"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1",
  "org.seleniumhq.selenium" % "selenium-chrome-driver" % "3.3.1",
  "org.seleniumhq.selenium" % "selenium-java" % "3.0.1"
)
        