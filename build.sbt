sbtPlugin := true

name := "sbtsvn"

organization := "com.github.xuwei_k"

version := "0.1.1-SNAPSHOT"

libraryDependencies ++= Seq()

scalacOptions := Seq("-deprecation", "-unchecked")

publishTo := sys.env.get("MAVEN_DIRECTORY").map{ dir =>
  Resolver.file("gh-pages",file(dir))(Patterns(true, Resolver.mavenStyleBasePattern))
}
