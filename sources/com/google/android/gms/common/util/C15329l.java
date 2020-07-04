package com.google.android.gms.common.util;

import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.common.util.l */
public final class C15329l {
    /* renamed from: a */
    public static void m44589a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static long m44587a(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        return m44588a(inputStream, outputStream, z, PreloadTask.BYTE_UNIT_NUMBER);
    }

    /* renamed from: a */
    private static long m44588a(InputStream inputStream, OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    m44589a(inputStream);
                    m44589a(outputStream);
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public static byte[] m44590a(InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m44587a(inputStream, byteArrayOutputStream, true);
        return byteArrayOutputStream.toByteArray();
    }
}
