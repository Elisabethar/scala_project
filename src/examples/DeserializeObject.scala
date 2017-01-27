package examples

import java.io._

class DeserializeObject(receivedFile: InputStream){
  // Probably some flags are needed
  // <yes> <report>
  val in = new ObjectInputStream(receivedFile)
  in.readObject()
}