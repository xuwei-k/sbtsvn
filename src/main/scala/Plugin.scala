package sbtsvn

import sbt._
import Keys._
import sbt.complete.Parser
import sbt.complete.DefaultParsers._

object Plugin extends sbt.Plugin{

  override lazy val settings =
    if(file(".svn").exists)
      Seq(commands += svnCommand)
    else
      Nil

  lazy val svnCommandParser = {
    ( Space ~> (
        token("add") | "blame" | "cat" | "changelist" | "checkout" | "cleanup" |
        "commit" | "copy" | "delete" | "diff" | "export" | "help" | "import" |
        "info" | "list" | "lock" | "log" | "merge" | "mergeinfo" | "mkdir" |
        "move" | "propdel" | "propedit" | "propget" | "proplist" | "propset" |
        "resolve" | "resolved" | "revert" | "status" | "switch" | "unlock" | "update"
      )
    ) ~ (( Space ?) ~> ( any *))
  }

  lazy val svnCommand = Command("svn")(_ => svnCommandParser) {case (state, ( cmd , params ) ) =>
    Seq("svn",cmd,params.mkString).mkString(" ") ! ;
    state
  }

}
