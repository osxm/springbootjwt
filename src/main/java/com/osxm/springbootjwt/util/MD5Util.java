/**
 * @Title: MD5Util.java
 * @Package com.edu.badou.core.util
 * @Description: TODO
 * @author oscarchen
 * @date 2019年10月28日
 * @version V1.0
 */
package com.osxm.springbootjwt.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
  * @ClassName: MD5Util
  * @Description: TODO
  * @author oscarchen
  */
public class MD5Util {
	public static String encrypt(String source) {
        return encodeMd5(source.getBytes());
    }

    private static String encodeMd5(byte[] source) {
        try {
            return encodeHex(MessageDigest.getInstance("MD5").digest(source));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    private static String encodeHex(byte[] bytes) {
        StringBuffer buffer = new StringBuffer(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            if (((int) bytes[i] & 0xff) < 0x10)
                buffer.append("0");
            buffer.append(Long.toString((int) bytes[i] & 0xff, 16));
        }
        return buffer.toString();
    }

}
