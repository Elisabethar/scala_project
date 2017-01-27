package examples {

  import javax.crypto.Cipher

  class RSAWithoutPadding {
    // <yes> <report>
    val encipher = Cipher.getInstance("RSA/NONE/NoPadding")
    // <no> <report>
    val encipher2 = Cipher.getInstance("RSA/ECB/OAEPWithMD5AndMGF1Padding")
  }
}