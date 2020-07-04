package com.ttnet.org.chromium.base;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.SecureRandom;

public class SecureRandomInitializer {
    public static void initialize(SecureRandom secureRandom) throws IOException {
        Throwable th;
        FileInputStream fileInputStream = new FileInputStream("/dev/urandom");
        try {
            byte[] bArr = new byte[16];
            if (fileInputStream.read(bArr) == 16) {
                secureRandom.setSeed(bArr);
                fileInputStream.close();
                return;
            }
            throw new IOException("Failed to get enough random data.");
        } catch (Throwable th2) {
            C6497a.m20181a(th, th2);
        }
        throw th;
    }
}
