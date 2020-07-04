package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.f */
public final class C31905f {
    /* renamed from: b */
    private static FileInputStream m103642b(File file) {
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static FileInputStream m103637a(String str) {
        return m103642b(new File(str));
    }

    /* renamed from: b */
    private static InputStream m103643b(InputStream inputStream) {
        if (inputStream instanceof BufferedInputStream) {
            return inputStream;
        }
        return new BufferedInputStream(inputStream, 524288);
    }

    /* renamed from: a */
    private static OutputStream m103638a(OutputStream outputStream) {
        if (outputStream instanceof BufferedOutputStream) {
            return outputStream;
        }
        return new BufferedOutputStream(outputStream, 524288);
    }

    /* renamed from: a */
    public static int m103636a(File file) {
        if (file == null) {
            return 1;
        }
        if (!file.exists()) {
            return 2;
        }
        if (!file.isFile()) {
            return 3;
        }
        if (file.length() == 0) {
            return 4;
        }
        return 0;
    }

    /* renamed from: a */
    private static boolean m103640a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static byte[] m103641a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (inputStream != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(524288);
            } catch (IOException unused) {
                byteArrayOutputStream = null;
                m103640a((Closeable) byteArrayOutputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                m103640a((Closeable) byteArrayOutputStream2);
                throw th;
            }
            try {
                m103639a(inputStream, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                m103640a((Closeable) byteArrayOutputStream);
                return byteArray;
            } catch (IOException unused2) {
                m103640a((Closeable) byteArrayOutputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream2 = byteArrayOutputStream;
                m103640a((Closeable) byteArrayOutputStream2);
                throw th;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m103639a(InputStream inputStream, OutputStream outputStream) throws IOException {
        InputStream inputStream2;
        IOException e;
        try {
            byte[] bArr = new byte[524288];
            inputStream2 = m103643b(inputStream);
            try {
                OutputStream a = m103638a(outputStream);
                int read = inputStream2.read(bArr);
                if (read != -1) {
                    a.write(bArr, 0, read);
                    a.flush();
                }
                m103640a((Closeable) inputStream2);
            } catch (IOException e2) {
                e = e2;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (IOException e3) {
            inputStream2 = inputStream;
            e = e3;
            throw e;
        } catch (Throwable th2) {
            inputStream2 = inputStream;
            th = th2;
            m103640a((Closeable) inputStream2);
            throw th;
        }
    }
}
