package examples {

  import java.io.FileInputStream
  import java.nio.file.{Files, Paths}
  import javax.xml.transform.Source

//  import org.apache.commons.io.FilenameUtils

  class PathTraversal {
    def Bad(value: String){
      // <yes> <report>
      val filename =new FileInputStream("public/lists/" + value)
  }
    def Good(value: String) {
      // <no> <report>
//      val filename =new FileInputStream("public/lists/" + FilenameUtils.getName(value))
    }
  }

}

