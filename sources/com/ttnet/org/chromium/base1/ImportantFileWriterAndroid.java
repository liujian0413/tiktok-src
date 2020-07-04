package com.ttnet.org.chromium.base1;

import com.ttnet.org.chromium.base1.annotations.JNINamespace;

@JNINamespace("base::android")
public class ImportantFileWriterAndroid {
    private static native boolean nativeWriteFileAtomically(String str, byte[] bArr);

    public static boolean writeFileAtomically(String str, byte[] bArr) {
        return nativeWriteFileAtomically(str, bArr);
    }
}
