package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.C1642a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.twitter.sdk.android.core.internal.C46869g;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.s */
public final class C46928s implements C46918m {

    /* renamed from: a */
    private final Context f120325a;

    /* renamed from: b */
    private final File f120326b;

    /* renamed from: c */
    private final String f120327c;

    /* renamed from: d */
    private final File f120328d;

    /* renamed from: e */
    private C46923r f120329e = new C46923r(this.f120328d);

    /* renamed from: f */
    private File f120330f;

    /* renamed from: b */
    public final boolean mo118062b() {
        return this.f120329e.mo118070b();
    }

    /* renamed from: a */
    public final int mo118056a() {
        return this.f120329e.mo118064a();
    }

    /* renamed from: c */
    public final List<File> mo118063c() {
        return Arrays.asList(this.f120330f.listFiles());
    }

    /* renamed from: d */
    private void m146785d() {
        this.f120330f = new File(this.f120326b, this.f120327c);
        if (!this.f120330f.exists()) {
            this.f120330f.mkdirs();
        }
    }

    /* renamed from: a */
    private static OutputStream m146783a(File file) throws IOException {
        return new FileOutputStream(file);
    }

    /* renamed from: a */
    public final List<File> mo118057a(int i) {
        ArrayList arrayList = new ArrayList();
        for (File add : this.f120330f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() > 0) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo118058a(String str) throws IOException {
        this.f120329e.close();
        m146784a(this.f120328d, new File(this.f120330f, str));
        this.f120329e = new C46923r(this.f120328d);
    }

    /* renamed from: a */
    public final void mo118059a(List<File> list) {
        for (File file : list) {
            C46869g.m146602a(this.f120325a, C1642a.m8034a("deleting sent analytics file %s", new Object[]{file.getName()}));
            file.delete();
        }
    }

    /* renamed from: a */
    public final void mo118060a(byte[] bArr) throws IOException {
        this.f120329e.mo118068a(bArr);
    }

    /* renamed from: a */
    private void m146784a(File file, File file2) throws IOException {
        FileInputStream fileInputStream;
        OutputStream a;
        OutputStream outputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                a = m146783a(file2);
            } catch (Throwable th) {
                th = th;
                C46869g.m146605a((Closeable) fileInputStream, "Failed to close file input stream");
                C46869g.m146605a((Closeable) outputStream, "Failed to close output stream");
                file.delete();
                throw th;
            }
            try {
                C46869g.m146606a((InputStream) fileInputStream, a, new byte[PreloadTask.BYTE_UNIT_NUMBER]);
                C46869g.m146605a((Closeable) fileInputStream, "Failed to close file input stream");
                C46869g.m146605a((Closeable) a, "Failed to close output stream");
                file.delete();
            } catch (Throwable th2) {
                Throwable th3 = th2;
                outputStream = a;
                th = th3;
                C46869g.m146605a((Closeable) fileInputStream, "Failed to close file input stream");
                C46869g.m146605a((Closeable) outputStream, "Failed to close output stream");
                file.delete();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            C46869g.m146605a((Closeable) fileInputStream, "Failed to close file input stream");
            C46869g.m146605a((Closeable) outputStream, "Failed to close output stream");
            file.delete();
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo118061a(int i, int i2) {
        return this.f120329e.mo118069a(i, i2);
    }

    public C46928s(Context context, File file, String str, String str2) throws IOException {
        this.f120325a = context;
        this.f120326b = file;
        this.f120327c = str2;
        this.f120328d = new File(this.f120326b, str);
        m146785d();
    }
}
