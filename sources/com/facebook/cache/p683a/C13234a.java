package com.facebook.cache.p683a;

import com.C1642a;
import com.facebook.binaryresource.C13231a;
import com.facebook.binaryresource.C13232b;
import com.facebook.cache.common.C13271g;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.p683a.C13248d.C13249a;
import com.facebook.cache.p683a.C13248d.C13250b;
import com.facebook.common.file.C13297a;
import com.facebook.common.file.C13298b;
import com.facebook.common.file.FileUtils;
import com.facebook.common.file.FileUtils.CreateDirectoryException;
import com.facebook.common.file.FileUtils.RenameException;
import com.facebook.common.internal.C13301c;
import com.facebook.common.internal.C13307g;
import com.facebook.common.time.C13330a;
import com.facebook.common.time.C13332c;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.cache.a.a */
public class C13234a implements C13248d {

    /* renamed from: a */
    public static final Class<?> f35058a = C13234a.class;

    /* renamed from: b */
    static final long f35059b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c */
    public final File f35060c;

    /* renamed from: d */
    public final File f35061d;

    /* renamed from: e */
    public final CacheErrorLogger f35062e;

    /* renamed from: f */
    public final C13330a f35063f = C13332c.m39022b();

    /* renamed from: g */
    private final boolean f35064g;

    /* renamed from: com.facebook.cache.a.a$a */
    class C13236a implements C13298b {

        /* renamed from: b */
        private final List<C13249a> f35066b;

        /* renamed from: a */
        public final void mo16657a(File file) {
        }

        /* renamed from: c */
        public final void mo16659c(File file) {
        }

        /* renamed from: a */
        public final List<C13249a> mo32442a() {
            return Collections.unmodifiableList(this.f35066b);
        }

        private C13236a() {
            this.f35066b = new ArrayList();
        }

        /* renamed from: b */
        public final void mo16658b(File file) {
            C13238c a = C13234a.this.mo32432a(file);
            if (a != null && a.f35071a == ".cnt") {
                this.f35066b.add(new C13237b(a.f35072b, file));
            }
        }
    }

    /* renamed from: com.facebook.cache.a.a$b */
    static class C13237b implements C13249a {

        /* renamed from: a */
        public final C13232b f35067a;

        /* renamed from: b */
        private final String f35068b;

        /* renamed from: c */
        private long f35069c;

        /* renamed from: d */
        private long f35070d;

        /* renamed from: a */
        public final String mo32443a() {
            return this.f35068b;
        }

        /* renamed from: b */
        public final long mo32444b() {
            if (this.f35070d < 0) {
                this.f35070d = this.f35067a.f35057a.lastModified();
            }
            return this.f35070d;
        }

        /* renamed from: c */
        public final long mo32445c() {
            if (this.f35069c < 0) {
                this.f35069c = this.f35067a.mo32428b();
            }
            return this.f35069c;
        }

        private C13237b(String str, File file) {
            C13307g.m38940a(file);
            this.f35068b = (String) C13307g.m38940a(str);
            this.f35067a = C13232b.m38669a(file);
            this.f35069c = -1;
            this.f35070d = -1;
        }
    }

    /* renamed from: com.facebook.cache.a.a$c */
    static class C13238c {

        /* renamed from: a */
        public final String f35071a;

        /* renamed from: b */
        public final String f35072b;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f35071a);
            sb.append("(");
            sb.append(this.f35072b);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public final File mo32446a(File file) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f35072b);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            return File.createTempFile(sb.toString(), ".tmp", file);
        }

        /* renamed from: b */
        public static C13238c m38702b(File file) {
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0) {
                return null;
            }
            String c = C13234a.m38678c(name.substring(lastIndexOf));
            if (c == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (c.equals(".tmp")) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new C13238c(c, substring);
        }

        /* renamed from: a */
        public final String mo32447a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append(this.f35072b);
            sb.append(this.f35071a);
            return sb.toString();
        }

        private C13238c(String str, String str2) {
            this.f35071a = str;
            this.f35072b = str2;
        }
    }

    /* renamed from: com.facebook.cache.a.a$d */
    static class C13239d extends IOException {

        /* renamed from: a */
        public final long f35073a;

        /* renamed from: b */
        public final long f35074b;

        public C13239d(long j, long j2) {
            StringBuilder sb = new StringBuilder("File was not written completely. Expected: ");
            sb.append(j);
            sb.append(", found: ");
            sb.append(j2);
            super(sb.toString());
            this.f35073a = j;
            this.f35074b = j2;
        }
    }

    /* renamed from: com.facebook.cache.a.a$e */
    class C13240e implements C13250b {

        /* renamed from: a */
        final File f35075a;

        /* renamed from: c */
        private final String f35077c;

        /* renamed from: a */
        public final boolean mo32451a() {
            if (!this.f35075a.exists() || this.f35075a.delete()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final C13231a mo32449a(Object obj) throws IOException {
            File a = C13234a.this.mo32434a(this.f35077c);
            try {
                FileUtils.m38908a(this.f35075a, a);
                if (a.exists()) {
                    a.setLastModified(C13234a.this.f35063f.mo32622a());
                }
                return C13232b.m38669a(a);
            } catch (RenameException e) {
                e.getCause();
                throw e;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public final void mo32450a(C13271g gVar, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f35075a);
                try {
                    C13301c cVar = new C13301c(fileOutputStream);
                    gVar.mo32494a(cVar);
                    cVar.flush();
                    long j = cVar.f35205a;
                    fileOutputStream.close();
                    if (this.f35075a.length() != j) {
                        throw new C13239d(j, this.f35075a.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                throw e;
            }
        }

        public C13240e(String str, File file) {
            this.f35077c = str;
            this.f35075a = file;
        }
    }

    /* renamed from: com.facebook.cache.a.a$f */
    class C13241f implements C13298b {

        /* renamed from: b */
        private boolean f35079b;

        private C13241f() {
        }

        /* renamed from: b */
        public final void mo16658b(File file) {
            if (!this.f35079b || !m38708d(file)) {
                file.delete();
            }
        }

        /* renamed from: e */
        private boolean m38709e(File file) {
            if (file.lastModified() > C13234a.this.f35063f.mo32622a() - C13234a.f35059b) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo16657a(File file) {
            if (!this.f35079b && file.equals(C13234a.this.f35061d)) {
                this.f35079b = true;
            }
        }

        /* renamed from: d */
        private boolean m38708d(File file) {
            C13238c a = C13234a.this.mo32432a(file);
            boolean z = false;
            if (a == null) {
                return false;
            }
            if (a.f35071a == ".tmp") {
                return m38709e(file);
            }
            if (a.f35071a == ".cnt") {
                z = true;
            }
            C13307g.m38947b(z);
            return true;
        }

        /* renamed from: c */
        public final void mo16659c(File file) {
            if (!C13234a.this.f35060c.equals(file) && !this.f35079b) {
                file.delete();
            }
            if (this.f35079b && file.equals(C13234a.this.f35061d)) {
                this.f35079b = false;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo32435a() {
        return this.f35064g;
    }

    /* renamed from: c */
    public final void mo32439c() {
        C13297a.m38910a(this.f35060c);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public List<C13249a> mo32441d() throws IOException {
        C13236a aVar = new C13236a();
        C13297a.m38909a(this.f35061d, aVar);
        return aVar.mo32442a();
    }

    /* renamed from: e */
    private void m38681e() {
        boolean z = true;
        if (this.f35060c.exists()) {
            if (!this.f35061d.exists()) {
                C13297a.m38911b(this.f35060c);
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                FileUtils.m38907a(this.f35061d);
            } catch (CreateDirectoryException unused) {
                new StringBuilder("version directory could not be created: ").append(this.f35061d);
            }
        }
    }

    /* renamed from: b */
    public final void mo32438b() {
        C13297a.m38909a(this.f35060c, new C13241f());
    }

    /* renamed from: e */
    private File m38680e(String str) {
        return new File(m38679d(str));
    }

    /* renamed from: b */
    public final long mo32436b(String str) {
        return m38677b(mo32434a(str));
    }

    /* renamed from: a */
    private static String m38673a(int i) {
        return C1642a.m8035a(null, "%s.ols%d.%d", new Object[]{"v2", Integer.valueOf(100), Integer.valueOf(i)});
    }

    /* renamed from: b */
    private static long m38677b(File file) {
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1;
    }

    /* renamed from: c */
    public static String m38678c(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    /* renamed from: f */
    private String m38682f(String str) {
        C13238c cVar = new C13238c(".cnt", str);
        return cVar.mo32447a(m38679d(cVar.f35072b));
    }

    /* renamed from: d */
    private String m38679d(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f35061d);
        sb.append(File.separator);
        sb.append(valueOf);
        return sb.toString();
    }

    /* renamed from: a */
    public final long mo32431a(C13249a aVar) {
        return m38677b(((C13237b) aVar).f35067a.f35057a);
    }

    /* renamed from: a */
    public final C13238c mo32432a(File file) {
        C13238c b = C13238c.m38702b(file);
        if (b != null && m38680e(b.f35072b).equals(file.getParentFile())) {
            return b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final File mo32434a(String str) {
        return new File(m38682f(str));
    }

    /* renamed from: a */
    private void m38674a(File file, String str) throws IOException {
        try {
            FileUtils.m38907a(file);
        } catch (CreateDirectoryException e) {
            throw e;
        }
    }

    /* renamed from: a */
    private boolean m38676a(String str, boolean z) {
        return mo32434a(str).exists();
    }

    /* renamed from: c */
    public final boolean mo32440c(String str, Object obj) {
        return m38676a(str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        new java.lang.StringBuilder("failed to read folder to check if external: ").append(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0014 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m38675a(java.io.File r1, com.facebook.cache.common.CacheErrorLogger r2) {
        /*
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x001e }
            if (r2 == 0) goto L_0x001e
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x001e }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x0013 }
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x0014 }
            goto L_0x001f
        L_0x0013:
            r1 = 0
        L_0x0014:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x001e }
            java.lang.String r0 = "failed to read folder to check if external: "
            r2.<init>(r0)     // Catch:{ Exception -> 0x001e }
            r2.append(r1)     // Catch:{ Exception -> 0x001e }
        L_0x001e:
            r2 = 0
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.p683a.C13234a.m38675a(java.io.File, com.facebook.cache.common.CacheErrorLogger):boolean");
    }

    /* renamed from: b */
    public final C13231a mo32437b(String str, Object obj) {
        File a = mo32434a(str);
        if (!a.exists()) {
            return null;
        }
        a.setLastModified(this.f35063f.mo32622a());
        return C13232b.m38669a(a);
    }

    /* renamed from: a */
    public final C13250b mo32433a(String str, Object obj) throws IOException {
        C13238c cVar = new C13238c(".tmp", str);
        File e = m38680e(cVar.f35072b);
        if (!e.exists()) {
            m38674a(e, "insert");
        }
        try {
            return new C13240e(str, cVar.mo32446a(e));
        } catch (IOException e2) {
            throw e2;
        }
    }

    public C13234a(File file, int i, CacheErrorLogger cacheErrorLogger) {
        C13307g.m38940a(file);
        this.f35060c = file;
        this.f35064g = m38675a(file, cacheErrorLogger);
        this.f35061d = new File(this.f35060c, m38673a(i));
        this.f35062e = cacheErrorLogger;
        m38681e();
    }
}
