package com.p280ss.android.ugc.aweme.story.shootvideo.publish;

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

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.publish.a */
public final class C42018a {
    /* renamed from: b */
    private static FileInputStream m133568b(File file) {
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static FileInputStream m133562a(String str) {
        return m133568b(new File(str));
    }

    /* renamed from: b */
    private static InputStream m133569b(InputStream inputStream) {
        if (inputStream instanceof BufferedInputStream) {
            return inputStream;
        }
        return new BufferedInputStream(inputStream, 524288);
    }

    /* renamed from: c */
    private static byte[] m133570c(File file) {
        return m133567a((InputStream) m133568b(file));
    }

    /* renamed from: a */
    private static OutputStream m133563a(OutputStream outputStream) {
        if (outputStream instanceof BufferedOutputStream) {
            return outputStream;
        }
        return new BufferedOutputStream(outputStream, 524288);
    }

    /* renamed from: a */
    public static String m133564a(File file) {
        return new String(m133570c(file));
    }

    /* renamed from: a */
    private static boolean m133566a(Closeable closeable) {
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
    public static byte[] m133567a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (inputStream != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(524288);
            } catch (IOException unused) {
                byteArrayOutputStream = null;
                m133566a((Closeable) byteArrayOutputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                m133566a((Closeable) byteArrayOutputStream2);
                throw th;
            }
            try {
                m133565a(inputStream, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                m133566a((Closeable) byteArrayOutputStream);
                return byteArray;
            } catch (IOException unused2) {
                m133566a((Closeable) byteArrayOutputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream2 = byteArrayOutputStream;
                m133566a((Closeable) byteArrayOutputStream2);
                throw th;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m133565a(InputStream inputStream, OutputStream outputStream) throws IOException {
        InputStream inputStream2;
        IOException e;
        try {
            byte[] bArr = new byte[524288];
            inputStream2 = m133569b(inputStream);
            try {
                OutputStream a = m133563a(outputStream);
                int read = inputStream2.read(bArr);
                if (read != -1) {
                    a.write(bArr, 0, read);
                    a.flush();
                }
                m133566a((Closeable) inputStream2);
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
            m133566a((Closeable) inputStream2);
            throw th;
        }
    }
}
