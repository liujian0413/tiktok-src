package com.ttnet.org.chromium.base1;

import java.io.Closeable;
import java.io.IOException;

public class StreamUtil {
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
