package examples

/**
  * Created by Elisabeth on 27.01.2017.
  */
class IndexOf {
  val color = "blue"
  val name = "ishmael"
  val strings = List(color, name)
  // <yes> <report>
  if (strings.indexOf(color) > 0) {
    // Noncompliant
  }
  // <yes> <report>
  if (name.indexOf("ish") > 0) {
    // Noncompliant
  }
  if (name.indexOf("hma") > 2) {
    // Noncompliant
  }
  // <no> <report>
  if (strings.indexOf(color) > -1) {
    // ...
  }
  // <no> <report>
  if (name.indexOf("ish") >= 0) {
    // ...
  }
  // <no> <report>
  if (name.indexOf("hma") > -1) {
    // ...
  }

}
