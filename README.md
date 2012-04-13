# sbt svn plugin

## How to use

`project/plugins.sbt`

```scala
resolvers += "xuwei-k repo" at "http://xuwei-k.github.com/mvn"

addSbtPlugin("com.github.xuwei_k" % "sbtsvn" % "0.1.0" )
```

or

`project/project/build.scala`

```scala
import sbt._

object Plugins extends Build {
  lazy val root = Project("root", file(".")) dependsOn(
    uri("git://github.com/xuwei-k/sbtsvn.git")
  )
}
```


