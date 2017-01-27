package examples

class IndexOfStartPosition {
  val name = "ismael"

  // <yes> <report>
  if (name.indexOf("ae") > 2) { // Noncompliant
    // ...
  }

  // <no> <report>
  if (name.indexOf("ae", 2) > -1) {
    // ...
  }

}
