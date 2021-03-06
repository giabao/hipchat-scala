name := "hipchat-scala"

organization := "com.imadethatcow"

version := "0.1"

publishMavenStyle := true

publishTo := {
	val nexus = "https://oss.sonatype.org/"
	if (isSnapshot.value)
		Some("snapshots" at nexus + "content/repositories/snapshots")
	else
		Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

homepage := Some(url("https://github.com/poweld"))

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.2",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.3.3",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.3.3",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.0",
  "com.typesafe.akka" %% "akka-actor" % "2.3.2",
  "joda-time" % "joda-time" % "2.3",
  "com.typesafe" % "config" % "1.2.0",
  "org.scalatest" %% "scalatest" % "2.0" % "test"
)
