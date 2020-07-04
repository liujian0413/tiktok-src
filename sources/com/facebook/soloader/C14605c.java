package com.facebook.soloader;

import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.IOException;

/* renamed from: com.facebook.soloader.c */
public class C14605c extends C14623m {

    /* renamed from: b */
    protected final File f37736b;

    /* renamed from: c */
    protected final int f37737c;

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f37736b.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f37736b.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.f37737c);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    private static String[] m42266a(File file) throws IOException {
        if (SoLoader.f37712a) {
            StringBuilder sb = new StringBuilder("SoLoader.getElfDependencies[");
            sb.append(file.getName());
            sb.append("]");
            Api18TraceUtils.m42243a(sb.toString());
        }
        try {
            return C14618i.m42286a(file);
        } finally {
            if (SoLoader.f37712a) {
                Api18TraceUtils.m42242a();
            }
        }
    }

    public C14605c(File file, int i) {
        this.f37736b = file;
        this.f37737c = i;
    }

    /* renamed from: a */
    public int mo36850a(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        return mo36854a(str, i, this.f37736b, threadPolicy);
    }

    /* renamed from: a */
    private static void m42265a(File file, int i, ThreadPolicy threadPolicy) throws IOException {
        String[] a = m42266a(file);
        for (String str : a) {
            if (!str.startsWith("/")) {
                SoLoader.m42248a(str, i | 1, threadPolicy);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo36854a(String str, int i, File file, ThreadPolicy threadPolicy) throws IOException {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return 0;
        }
        if ((i & 1) != 0 && (this.f37737c & 2) != 0) {
            return 2;
        }
        if ((this.f37737c & 1) != 0) {
            m42265a(file2, i, threadPolicy);
        }
        try {
            SoLoader.f37713b.mo36846a(file2.getAbsolutePath(), i);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            if (e.getMessage().contains("bad ELF magic")) {
                return 3;
            }
            throw e;
        }
    }
}
