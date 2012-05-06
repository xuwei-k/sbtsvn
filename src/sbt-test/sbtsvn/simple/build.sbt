TaskKey[Unit]("create-dummy-svn-directory") := {
  IO.writeLines( file(".svn") / "dummy" , Seq(" ") )
}
