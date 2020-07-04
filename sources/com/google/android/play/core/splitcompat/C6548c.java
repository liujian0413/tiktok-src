package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.C1642a;
import com.google.android.play.core.internal.C6512ad;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitcompat.c */
public final class C6548c {

    /* renamed from: a */
    private final File f18850a;

    /* renamed from: b */
    private final long f18851b;

    public C6548c(Context context) throws IOException, NameNotFoundException {
        this(context.getFilesDir(), (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
    }

    private C6548c(File file, long j) {
        this.f18850a = file;
        this.f18851b = j;
    }

    /* renamed from: c */
    private static File m20345c(File file) throws IOException {
        if (!file.exists()) {
            file.mkdirs();
            if (file.isDirectory()) {
                return file;
            }
            String str = "Unable to create directory: ";
            String valueOf = String.valueOf(file.getAbsolutePath());
            throw new IOException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } else if (file.isDirectory()) {
            return file;
        } else {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    /* renamed from: d */
    private static void m20346d(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File d : listFiles) {
                    m20346d(d);
                }
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(C1642a.m8034a("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    /* renamed from: f */
    private final File m20347f() throws IOException {
        return m20345c(new File(m20348g(), "verified-splits"));
    }

    /* renamed from: g */
    private final File m20348g() throws IOException {
        return m20345c(new File(m20350h(), Long.toString(this.f18851b)));
    }

    /* renamed from: g */
    private final File m20349g(String str) throws IOException {
        return m20345c(new File(m20352i(), str));
    }

    /* renamed from: h */
    private final File m20350h() throws IOException {
        return m20345c(new File(this.f18850a, "splitcompat"));
    }

    /* renamed from: h */
    private static String m20351h(String str) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(".apk");
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: i */
    private final File m20352i() throws IOException {
        return m20345c(new File(m20348g(), "native-libraries"));
    }

    /* renamed from: a */
    public final File mo15902a(File file) throws IOException {
        return new File(m20347f(), file.getName());
    }

    /* renamed from: a */
    public final File mo15903a(String str) throws IOException {
        return new File(mo15909c(), m20351h(str));
    }

    /* renamed from: a */
    public final File mo15904a(String str, String str2) throws IOException {
        return new File(m20349g(str), str2);
    }

    /* renamed from: a */
    public final void mo15905a() throws IOException {
        File h = m20350h();
        String[] list = h.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f18851b))) {
                    m20346d(new File(h, str));
                }
            }
        }
    }

    /* renamed from: b */
    public final File mo15906b() throws IOException {
        return new File(m20348g(), "lock.tmp");
    }

    /* renamed from: b */
    public final File mo15907b(String str) throws IOException {
        return new File(m20347f(), m20351h(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo15908b(File file) throws IOException {
        C6512ad.m20226a(file.getParentFile().getParentFile().equals(m20352i()), (Object) "File to remove is not a native library");
        m20346d(file);
    }

    /* renamed from: c */
    public final File mo15909c() throws IOException {
        return m20345c(new File(m20348g(), "unverified-splits"));
    }

    /* renamed from: c */
    public final File mo15910c(String str) throws IOException {
        return m20345c(new File(m20345c(new File(m20348g(), "dex")), str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Set<C6562q> mo15911d() throws IOException {
        File f = m20347f();
        HashSet hashSet = new HashSet();
        File[] listFiles = f.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    String name = file.getName();
                    hashSet.add(new C6562q(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo15912d(String str) throws IOException {
        m20346d(m20349g(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final List<String> mo15913e() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = m20352i().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Set<File> mo15914e(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] listFiles = m20349g(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo15915f(String str) throws IOException {
        m20346d(mo15907b(str));
    }
}
