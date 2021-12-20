package com.bikatoo.psyche.infrastructure.utils;

import org.apache.commons.codec.binary.Base64;

import java.nio.charset.StandardCharsets;

public class Base64Utils {
    public static String base64Decode(String base64Str) {
        final Base64 base64 = new Base64();
        return new String(base64.decode(base64Str), StandardCharsets.UTF_8);
    }

    public static String base64Encode(String originStr) {
        final Base64 base64 = new Base64();
        byte[] textByte = originStr.getBytes(StandardCharsets.UTF_8);
        return base64.encodeToString(textByte);
    }

}
