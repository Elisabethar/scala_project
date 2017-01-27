package  examples{

  import java.net.Socket
  import javax.net.ssl.SSLSocketFactory

  class UnencryptedSockets {
    // <yes> <report>
    val soc = new Socket("www.google.com",80)
    val soc2 = SSLSocketFactory.getDefault().createSocket("www.google.com", 443);
  }
}


