package examples {
  import javax.crypto.Cipher

  class InsecureCiphers {
    // <yes> <report>
    val encipher = Cipher.getInstance("DESede/ECB/PKCS5Padding")
    // <no> <report>
    val encipher2 = Cipher.getInstance("AES/GCM/NoPadding")
  }
}