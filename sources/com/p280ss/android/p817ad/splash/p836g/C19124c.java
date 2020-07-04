package com.p280ss.android.p817ad.splash.p836g;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.ss.android.ad.splash.g.c */
public final class C19124c {
    /* renamed from: a */
    private static void m62676a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static long m62674a(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return 0;
        }
        return file.length() / 1024;
    }

    /* renamed from: a */
    public static long m62673a(File file) {
        long j = 0;
        if (file == null) {
            return 0;
        }
        if (!file.isDirectory() || file.listFiles() == null) {
            j = file.length() / 1024;
        } else {
            for (File a : file.listFiles()) {
                j += m62673a(a);
            }
        }
        return j;
    }

    /* renamed from: b */
    public static String m62679b(String str) {
        String str2;
        FileInputStream fileInputStream;
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                str2 = m62675a((InputStream) fileInputStream);
                m62676a((Closeable) fileInputStream);
            } catch (Exception unused) {
                m62676a((Closeable) fileInputStream);
                str2 = null;
                return str2;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                m62676a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
            m62676a((Closeable) fileInputStream);
            str2 = null;
            return str2;
        } catch (Throwable th2) {
            th = th2;
            m62676a((Closeable) fileInputStream2);
            throw th;
        }
        return str2;
    }

    /* renamed from: a */
    private static String m62675a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            } catch (Exception e) {
                new StringBuilder("Exception:").append(e);
            } catch (Throwable th) {
                m62676a((Closeable) bufferedReader);
                throw th;
            }
        }
        m62676a((Closeable) bufferedReader);
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m62678a(File file, long j) {
        if (file == null || j <= 0 || System.currentTimeMillis() - file.lastModified() > j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m62677a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            File file = new File(str2);
            if (file.exists() || file.mkdir()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str3);
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(sb.toString(), false);
                    try {
                        fileOutputStream2.write(str.getBytes());
                        fileOutputStream2.flush();
                        m62676a((Closeable) fileOutputStream2);
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        try {
                            new StringBuilder("Exception:").append(e);
                            m62676a((Closeable) fileOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            m62676a((Closeable) fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        m62676a((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    new StringBuilder("Exception:").append(e);
                    m62676a((Closeable) fileOutputStream);
                }
            }
        }
    }
}
