package com.ttnet.org.chromium.url;

import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.net.IDN;

@JNINamespace("url::android")
public class IDNStringUtil {
    private static String idnToASCII(String str) {
        try {
            return IDN.toASCII(str, 2);
        } catch (Exception unused) {
            return null;
        }
    }
}
