# sbt svn plugin [![Build Status](https://secure.travis-ci.org/xuwei-k/sbtsvn.png)](http://travis-ci.org/xuwei-k/sbtsvn)

## How to use

`project/plugins.sbt`

```scala
resolvers += "xuwei-k repo" at "http://xuwei-k.github.io/mvn"

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


