package com.ttnet.org.chromium.base1;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.SecureRandom;

public class SecureRandomInitializer {
    public static void initialize(SecureRandom secureRandom) throws IOException {
        FileInputStream fileInputStream;
        try {
            byte[] bArr = new byte[16];
            fileInputStream = new FileInputStream("/dev/urandom");
            try {
                if (fileInputStream.read(bArr) == 16) {
                    secureRandom.setSeed(bArr);
                    StreamUtil.closeQuietly(fileInputStream);
                    return;
                }
                throw new IOException("Failed to get enough random data.");
            } catch (Throwable th) {
                th = th;
                StreamUtil.closeQuietly(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            StreamUtil.closeQuietly(fileInputStream);
            throw th;
        }
    }
}
