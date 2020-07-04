package com.toutiao.proxyserver;

import android.os.SystemClock;
import android.text.TextUtils;
import com.toutiao.proxyserver.exception.FileNotDeleteException;
import com.toutiao.proxyserver.net.C46513c;
import com.toutiao.proxyserver.p1840b.C46463c;
import com.toutiao.proxyserver.p1841c.C46470c;
import com.toutiao.proxyserver.p1842d.C46474a;
import com.toutiao.proxyserver.p1842d.C46476c;
import java.io.File;
import java.util.List;

/* renamed from: com.toutiao.proxyserver.h */
final class C46494h extends C46447a {

    /* renamed from: m */
    final Object f119790m = this;

    /* renamed from: n */
    public Exception f119791n;

    /* renamed from: o */
    private int f119792o;

    /* renamed from: p */
    private final C46498b f119793p;

    /* renamed from: q */
    private final boolean f119794q;

    /* renamed from: r */
    private C46520o f119795r;

    /* renamed from: com.toutiao.proxyserver.h$a */
    static final class C46497a {

        /* renamed from: a */
        String f119804a;

        /* renamed from: b */
        String f119805b;

        /* renamed from: c */
        C46571z f119806c;

        /* renamed from: d */
        C46520o f119807d;

        /* renamed from: e */
        C46467c f119808e;

        /* renamed from: f */
        C46463c f119809f;

        /* renamed from: g */
        List<C46513c> f119810g;

        /* renamed from: h */
        int f119811h;

        /* renamed from: i */
        C46564v f119812i;

        /* renamed from: j */
        C46498b f119813j;

        /* renamed from: k */
        boolean f119814k;

        C46497a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46494h mo115646a() {
            if (this.f119808e != null && this.f119809f != null && (this.f119807d != null || (!TextUtils.isEmpty(this.f119804a) && !TextUtils.isEmpty(this.f119805b) && this.f119806c != null))) {
                return new C46494h(this);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46497a mo115636a(int i) {
            this.f119811h = i;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46497a mo115639a(C46498b bVar) {
            this.f119813j = bVar;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46497a mo115637a(C46463c cVar) {
            if (cVar != null) {
                this.f119809f = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46497a mo115638a(C46467c cVar) {
            if (cVar != null) {
                this.f119808e = cVar;
                return this;
            }
            throw new IllegalArgumentException("cache == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C46497a mo115647b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f119805b = str;
                return this;
            }
            throw new IllegalArgumentException("key == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46497a mo115640a(C46520o oVar) {
            if (oVar != null) {
                this.f119807d = oVar;
                return this;
            }
            throw new IllegalArgumentException("urlsLazyProvider is NULL");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46497a mo115641a(C46564v vVar) {
            this.f119812i = vVar;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46497a mo115642a(C46571z zVar) {
            if (zVar != null) {
                this.f119806c = zVar;
                return this;
            }
            throw new IllegalArgumentException("urls is empty");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46497a mo115643a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f119804a = str;
                return this;
            }
            throw new IllegalArgumentException("rawKey == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46497a mo115644a(List<C46513c> list) {
            this.f119810g = list;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46497a mo115645a(boolean z) {
            this.f119814k = true;
            return this;
        }
    }

    /* renamed from: com.toutiao.proxyserver.h$b */
    public interface C46498b {
        /* renamed from: a */
        void mo115648a(C46494h hVar);

        /* renamed from: b */
        void mo115649b(C46494h hVar);
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Throwable, com.toutiao.proxyserver.RequestException] */
    /* JADX WARNING: type inference failed for: r3v4, types: [com.toutiao.proxyserver.RequestException] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r5v12, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r3v9, types: [com.toutiao.proxyserver.u$a] */
    /* JADX WARNING: type inference failed for: r3v13, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r3v14, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r3v15, types: [com.toutiao.proxyserver.RequestException] */
    /* JADX WARNING: type inference failed for: r4v15, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r3v16, types: [com.toutiao.proxyserver.u$a] */
    /* JADX WARNING: type inference failed for: r3v17, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r3 = move-exception;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        r1 = new java.lang.StringBuilder("CancelException: ");
        r1.append(com.toutiao.proxyserver.p1841c.C46470c.m146081a((java.lang.Throwable) r0));
        com.toutiao.proxyserver.p1841c.C46470c.m146090d("TAG_PROXY_DownloadTask", r1.toString(), r9.f119662g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        r3 = new java.lang.StringBuilder("ContentLengthNotMatchException: ");
        r3.append(com.toutiao.proxyserver.p1841c.C46470c.m146081a((java.lang.Throwable) r0));
        com.toutiao.proxyserver.p1841c.C46470c.m146090d("TAG_PROXY_DownloadTask", r3.toString(), r9.f119662g);
        r9.f119791n = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        r3 = move-exception;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        r7 = r4;
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ce, code lost:
        r5 = new java.lang.StringBuilder("IOException: ");
        r5.append(com.toutiao.proxyserver.p1841c.C46470c.m146081a((java.lang.Throwable) r4));
        com.toutiao.proxyserver.p1841c.C46470c.m146090d("TAG_PROXY_DownloadTask", r5.toString(), r9.f119662g);
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
        r3 = move-exception;
        r3 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v2
      assigns: []
      uses: []
      mth insns count: 130
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[ExcHandler: CancelException (r0v2 'e' com.toutiao.proxyserver.CancelException A[CUSTOM_DECLARE]), Splitter:B:10:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081 A[ExcHandler: e (r0v1 'e' com.toutiao.proxyserver.e A[CUSTOM_DECLARE]), Splitter:B:10:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Unknown variable types count: 15 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m146168k() throws com.toutiao.proxyserver.CancelException {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r3 = r0
            r4 = r3
            r2 = 0
        L_0x0005:
            com.toutiao.proxyserver.z r5 = r9.f119665j
            boolean r5 = r5.mo115752a()
            r6 = 1
            if (r5 == 0) goto L_0x0123
            r9.mo115567f()
            if (r2 == 0) goto L_0x0023
            r5 = r0
        L_0x0014:
            com.toutiao.proxyserver.z r7 = r9.f119665j
            boolean r7 = r7.mo115752a()
            if (r7 == 0) goto L_0x0029
            com.toutiao.proxyserver.z r5 = r9.f119665j
            com.toutiao.proxyserver.z$a r5 = r5.mo115753b()
            goto L_0x0014
        L_0x0023:
            com.toutiao.proxyserver.z r5 = r9.f119665j
            com.toutiao.proxyserver.z$a r5 = r5.mo115753b()
        L_0x0029:
            java.lang.String r7 = r5.f120018a     // Catch:{ RequestException -> 0x00f0, IOException -> 0x00bf, a -> 0x009e, e -> 0x0081, CancelException -> 0x0066, Exception -> 0x0046 }
            r9.mo115571j()     // Catch:{ RequestException -> 0x0042, IOException -> 0x003f, a -> 0x003c, e -> 0x0081, CancelException -> 0x0066, Exception -> 0x0039 }
            java.lang.String r4 = r5.f120018a     // Catch:{ RequestException -> 0x0042, IOException -> 0x003f, a -> 0x003c, e -> 0x0081, CancelException -> 0x0066, Exception -> 0x0039 }
            r9.m146167b(r4)     // Catch:{ RequestException -> 0x0042, IOException -> 0x003f, a -> 0x003c, e -> 0x0081, CancelException -> 0x0066, Exception -> 0x0039 }
            java.lang.String r4 = r5.f120018a     // Catch:{ RequestException -> 0x0042, IOException -> 0x003f, a -> 0x003c, e -> 0x0081, CancelException -> 0x0066, Exception -> 0x0039 }
            com.toutiao.proxyserver.C46534r.m146259a(r1, r4)     // Catch:{ RequestException -> 0x0042, IOException -> 0x003f, a -> 0x003c, e -> 0x0081, CancelException -> 0x0066, Exception -> 0x0039 }
            return r6
        L_0x0039:
            r3 = move-exception
            r4 = r7
            goto L_0x0047
        L_0x003c:
            r3 = move-exception
            r4 = r7
            goto L_0x009f
        L_0x003f:
            r4 = move-exception
            goto L_0x00c2
        L_0x0042:
            r3 = move-exception
            r4 = r7
            goto L_0x00f1
        L_0x0046:
            r3 = move-exception
        L_0x0047:
            java.lang.String r5 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "OtherException: "
            r7.<init>(r8)
            java.lang.String r8 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r3)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = r9.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r5, r7, r8)
            int r5 = r9.f119666k
            int r5 = r5 + r6
            r9.f119666k = r5
            goto L_0x0005
        L_0x0066:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CancelException: "
            r1.<init>(r2)
            java.lang.String r2 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r9.f119662g
            java.lang.String r3 = "TAG_PROXY_DownloadTask"
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r3, r1, r2)
            throw r0
        L_0x0081:
            r0 = move-exception
            java.lang.String r2 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ContentLengthNotMatchException: "
            r3.<init>(r4)
            java.lang.String r4 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r9.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r2, r3, r4)
            r9.f119791n = r0
            return r1
        L_0x009e:
            r3 = move-exception
        L_0x009f:
            java.lang.String r5 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "RandomAccessFileWrapper"
            r7.<init>(r8)
            java.lang.String r8 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r3)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = r9.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r5, r7, r8)
            int r5 = r9.f119666k
            int r5 = r5 + r6
            r9.f119666k = r5
            goto L_0x0005
        L_0x00bf:
            r5 = move-exception
            r7 = r4
            r4 = r5
        L_0x00c2:
            java.lang.String r5 = "Canceled"
            java.lang.String r8 = r4.getMessage()
            boolean r5 = r5.equalsIgnoreCase(r8)
            if (r5 != 0) goto L_0x00e8
            java.lang.String r3 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "IOException: "
            r5.<init>(r8)
            java.lang.String r8 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r4)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = r9.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r3, r5, r8)
            r3 = r4
        L_0x00e8:
            int r4 = r9.f119666k
            int r4 = r4 + r6
            r9.f119666k = r4
            r4 = r7
            goto L_0x0005
        L_0x00f0:
            r3 = move-exception
        L_0x00f1:
            boolean r7 = com.toutiao.proxyserver.C46534r.f119908o
            if (r7 != 0) goto L_0x00f8
            r5.mo115754a()
        L_0x00f8:
            java.lang.String r5 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "RequestException: "
            r7.<init>(r8)
            java.lang.String r8 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r3)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = r9.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r5, r7, r8)
            int r5 = r3.errorCode
            r7 = 403(0x193, float:5.65E-43)
            if (r5 != r7) goto L_0x011c
            boolean r5 = com.toutiao.proxyserver.C46534r.f119908o
            if (r5 == 0) goto L_0x011c
            r2 = 1
        L_0x011c:
            int r5 = r9.f119666k
            int r5 = r5 + r6
            r9.f119666k = r5
            goto L_0x0005
        L_0x0123:
            r9.f119791n = r3
            com.toutiao.proxyserver.C46534r.m146259a(r6, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C46494h.m146168k():boolean");
    }

    public final void run() {
        try {
            if (this.f119665j == null && this.f119795r != null) {
                String[] a = this.f119795r.mo105083a();
                if (a == null || a.length <= 0) {
                    C46534r.m146259a(1, "lazy provide lazy url fail, provide empty urls.");
                    return;
                }
                this.f119665j = new C46571z(C46476c.m146116a(a));
                this.f119662g = this.f119795r.mo105084b();
                this.f119663h = C46474a.m146102a(this.f119662g);
                StringBuilder sb = new StringBuilder("lazy preload rawKey:");
                sb.append(this.f119662g);
                sb.append(", key:");
                sb.append(this.f119663h);
                C46470c.m146085b("TAG_PROXY_DownloadTask", sb.toString());
                if (!TextUtils.isEmpty(this.f119663h)) {
                    String a2 = C46474a.m146102a(this.f119663h);
                    File e = this.f119656a.mo115596e(a2);
                    if (e != null && e.length() >= ((long) this.f119792o)) {
                        StringBuilder sb2 = new StringBuilder("lazy no need preload, file size: ");
                        sb2.append(e.length());
                        sb2.append(", need preload size: ");
                        sb2.append(this.f119792o);
                        C46470c.m146085b("TAG_PROXY_DownloadTask", sb2.toString());
                        return;
                    } else if (C46536s.m146278a().mo115708a(mo115568g(), a2)) {
                        StringBuilder sb3 = new StringBuilder("lazy has pending proxy task, skip preload for key: ");
                        sb3.append(this.f119663h);
                        C46470c.m146087c("TAG_PROXY_DownloadTask", sb3.toString());
                        return;
                    } else if (this.f119793p != null) {
                        this.f119793p.mo115648a(this);
                    }
                } else {
                    return;
                }
            }
            try {
                this.f119656a.mo115592a(this.f119663h);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    m146168k();
                } catch (CancelException e2) {
                    C46470c.m146088c("TAG_PROXY_DownloadTask", C46470c.m146081a((Throwable) e2), this.f119662g);
                }
                this.f119659d.set(SystemClock.elapsedRealtime() - elapsedRealtime);
                this.f119656a.mo115593b(this.f119663h);
                if (this.f119793p != null) {
                    this.f119793p.mo115649b(this);
                }
            } catch (FileNotDeleteException unused) {
                if (this.f119793p != null) {
                    this.f119793p.mo115649b(this);
                }
            }
        } catch (Exception e3) {
            StringBuilder sb4 = new StringBuilder("lazy provide lazy url fail:");
            sb4.append(e3.toString());
            C46534r.m146259a(1, sb4.toString());
        }
    }

    C46494h(C46497a aVar) {
        super(aVar.f119808e, aVar.f119809f);
        this.f119792o = aVar.f119811h;
        this.f119793p = aVar.f119813j;
        this.f119662g = aVar.f119804a;
        this.f119663h = aVar.f119805b;
        this.f119660e = aVar.f119810g;
        this.f119665j = aVar.f119806c;
        this.f119664i = aVar.f119812i;
        this.f119794q = aVar.f119814k;
        this.f119795r = aVar.f119807d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x040f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0410, code lost:
        r7 = r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03ea A[SYNTHETIC, Splitter:B:124:0x03ea] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ee A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x040f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:32:0x013f] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0428 A[Catch:{ all -> 0x0430 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04a8 A[SYNTHETIC, Splitter:B:177:0x04a8] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x035d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0148 A[SYNTHETIC, Splitter:B:35:0x0148] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01e6 A[SYNTHETIC, Splitter:B:47:0x01e6] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x022f A[Catch:{ IOException -> 0x03fb, all -> 0x03f8 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m146167b(java.lang.String r23) throws java.io.IOException, com.toutiao.proxyserver.C46562u.C46563a, com.toutiao.proxyserver.CancelException, com.toutiao.proxyserver.C46479e {
        /*
            r22 = this;
            r8 = r22
            r0 = r23
            java.lang.String r1 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "process() called with: url = ["
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = "]， rawKey："
            r2.append(r3)
            java.lang.String r3 = r8.f119662g
            r2.append(r3)
            java.lang.String r3 = "， key："
            r2.append(r3)
            java.lang.String r3 = r8.f119663h
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r8.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146084a(r1, r2, r3)
            com.toutiao.proxyserver.c r1 = r8.f119656a
            java.lang.String r2 = r8.f119663h
            java.io.File r1 = r1.mo115595d(r2)
            long r2 = r1.length()
            int r4 = r8.f119792o
            if (r4 <= 0) goto L_0x0078
            int r4 = r8.f119792o
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0078
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "no necessary to download for "
            r1.<init>(r4)
            java.lang.String r4 = r8.f119663h
            r1.append(r4)
            java.lang.String r4 = ", rawKey: "
            r1.append(r4)
            java.lang.String r4 = r8.f119662g
            r1.append(r4)
            java.lang.String r4 = ", cache file size: "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = ", max: "
            r1.append(r2)
            int r2 = r8.f119792o
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146086b(r0, r1, r2)
            return
        L_0x0078:
            int r4 = r22.mo115568g()
            com.toutiao.proxyserver.b.c r5 = r8.f119657b
            java.lang.String r6 = r8.f119663h
            com.toutiao.proxyserver.b.a r9 = r5.mo115584a(r6, r4)
            if (r9 == 0) goto L_0x00af
            int r5 = r9.f119727c
            long r5 = (long) r5
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x00af
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "file download complete, key: "
            r1.<init>(r2)
            java.lang.String r2 = r8.f119663h
            r1.append(r2)
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)
            java.lang.String r2 = r8.f119662g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146086b(r0, r1, r2)
            return
        L_0x00af:
            boolean r5 = com.toutiao.proxyserver.C46534r.f119910q
            if (r5 == 0) goto L_0x00bf
            if (r9 == 0) goto L_0x00bf
            int r5 = r8.f119792o
            int r6 = r9.f119727c
            if (r5 <= r6) goto L_0x00bf
            int r5 = r9.f119727c
            r8.f119792o = r5
        L_0x00bf:
            java.lang.String r5 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "process() before request, max:"
            r6.<init>(r7)
            int r7 = r8.f119792o
            r6.append(r7)
            java.lang.String r7 = ", contentLength:"
            r6.append(r7)
            if (r9 == 0) goto L_0x00db
            int r7 = r9.f119727c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00dd
        L_0x00db:
            java.lang.String r7 = "null"
        L_0x00dd:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.toutiao.proxyserver.p1841c.C46470c.m146083a(r5, r6)
            r22.mo115567f()
            r22.mo115570i()
            int r5 = (int) r2
            int r6 = r8.f119792o
            java.lang.String r7 = "GET"
            com.toutiao.proxyserver.net.e r10 = r8.mo115554a(r0, r5, r6, r7)
            java.lang.String r5 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "process() after request statuscode:"
            r6.<init>(r7)
            int r7 = r10.f119848b
            r6.append(r7)
            java.lang.String r7 = ", contentlength:"
            r6.append(r7)
            int r7 = com.toutiao.proxyserver.p1842d.C46476c.m146108a(r10)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.toutiao.proxyserver.p1841c.C46470c.m146083a(r5, r6)
            r22.mo115569h()
            com.toutiao.proxyserver.speed.c r11 = new com.toutiao.proxyserver.speed.c
            r11.<init>(r2)
            com.toutiao.proxyserver.speed.b r5 = com.toutiao.proxyserver.speed.C46546b.m146298a()
            r5.f119958a = r11
            r12 = 1
            r14 = 0
            com.toutiao.proxyserver.speed.b r5 = com.toutiao.proxyserver.speed.C46546b.m146298a()     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            r5.mo115721b()     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            r22.mo115567f()     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            com.toutiao.proxyserver.v r5 = r8.f119664i     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            if (r5 != 0) goto L_0x013e
            boolean r5 = com.toutiao.proxyserver.C46534r.f119903j     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            if (r5 == 0) goto L_0x013e
            r5 = 1
            goto L_0x013f
        L_0x013b:
            r0 = move-exception
            goto L_0x0419
        L_0x013e:
            r5 = 0
        L_0x013f:
            com.toutiao.proxyserver.p1842d.C46476c.m146118a(r10, r5, r12)     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            int r15 = com.toutiao.proxyserver.p1842d.C46476c.m146108a(r10)     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            if (r9 == 0) goto L_0x01d3
            int r5 = r9.f119727c     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            if (r5 == r15) goto L_0x01d3
            com.toutiao.proxyserver.n r1 = com.toutiao.proxyserver.C46534r.f119898e     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            if (r1 == 0) goto L_0x0166
            int r1 = r22.mo115568g()     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            boolean r2 = com.toutiao.proxyserver.p1840b.C46462b.m146064a(r1)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = r8.f119662g     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            int r4 = r9.f119727c     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r7 = r9.f119729e     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r1 = r22
            r5 = r15
            r6 = r23
            r1.mo115561a(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
        L_0x0166:
            java.lang.String r1 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = "Content-Length not match, old: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            int r3 = r9.f119727c     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = ", "
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r15)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = ", key: "
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = r8.f119663h     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = ", rawKey: "
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = r8.f119662g     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = r8.f119662g     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r1, r2, r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            com.toutiao.proxyserver.e r1 = new com.toutiao.proxyserver.e     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = "Content-Length not match, old length: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            int r3 = r9.f119727c     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = ", new length: "
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r15)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = ", rawKey: "
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = r8.f119662g     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = ", currentUrl: "
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r0)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r0 = ", previousInfo: "
            r2.append(r0)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r0 = r9.f119729e     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r0)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r1.<init>(r0)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            throw r1     // Catch:{ IOException -> 0x013b, all -> 0x040f }
        L_0x01d3:
            com.toutiao.proxyserver.b.c r5 = r8.f119657b     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            java.lang.String r6 = r8.f119663h     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            com.toutiao.proxyserver.p1842d.C46476c.m146111a(r10, r5, r6, r4)     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            com.toutiao.proxyserver.b.c r5 = r8.f119657b     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            java.lang.String r6 = r8.f119663h     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            com.toutiao.proxyserver.b.a r7 = r5.mo115584a(r6, r4)     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            if (r7 != 0) goto L_0x01e6
            r9 = 0
            goto L_0x01e9
        L_0x01e6:
            int r4 = r7.f119727c     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            r9 = r4
        L_0x01e9:
            java.io.InputStream r15 = r10.mo115674d()     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            com.toutiao.proxyserver.u r4 = new com.toutiao.proxyserver.u     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            java.lang.String r5 = "rwd"
            r4.<init>(r1, r5)     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            r4.mo115745a(r2)     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            com.toutiao.proxyserver.d r5 = new com.toutiao.proxyserver.d     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            r5.<init>(r4)     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            java.util.concurrent.Future r16 = r5.mo115599b()     // Catch:{ IOException -> 0x0404, all -> 0x0401 }
            java.lang.String r1 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r6 = "preload start from: "
            r4.<init>(r6)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            r4.append(r2)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r2 = ", rawKey: "
            r4.append(r2)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r2 = r8.f119662g     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            r4.append(r2)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r2 = ", key: "
            r4.append(r2)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r2 = r8.f119663h     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            r4.append(r2)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r2 = r4.toString()     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r3 = r8.f119662g     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            com.toutiao.proxyserver.p1841c.C46470c.m146086b(r1, r2, r3)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            int r1 = com.toutiao.proxyserver.C46534r.f119904k     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            byte[] r6 = new byte[r1]     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
        L_0x022d:
            if (r15 == 0) goto L_0x035d
            r22.mo115567f()     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            r22.mo115570i()     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            int r4 = r15.read(r6)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            com.toutiao.proxyserver.n r3 = com.toutiao.proxyserver.C46534r.f119898e     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            if (r3 == 0) goto L_0x025a
            java.lang.String r3 = r8.f119662g     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            r19 = 0
            long r17 = r17 - r1
            r1 = r22
            r2 = r3
            r3 = r23
            r20 = r4
            r12 = r5
            r13 = r6
            r5 = r17
            r1.mo115558a(r2, r3, r4, r5)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            goto L_0x025e
        L_0x025a:
            r20 = r4
            r12 = r5
            r13 = r6
        L_0x025e:
            r22.mo115569h()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r1 = r20
            if (r1 < 0) goto L_0x035e
            if (r1 <= 0) goto L_0x0299
            r12.mo115598a(r13, r14, r1)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            long r2 = (long) r1     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r11.mo115729a(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            com.toutiao.proxyserver.aa r2 = com.toutiao.proxyserver.C46456aa.m146053a()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r3 = r8.f119662g     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            long r4 = r11.mo115728a()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r2.mo115578a(r3, r4)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            com.toutiao.proxyserver.v r2 = r8.f119664i     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            if (r2 == 0) goto L_0x028c
            java.lang.Object r2 = r8.f119790m     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.Object r3 = r8.f119790m     // Catch:{ all -> 0x0289 }
            r3.notifyAll()     // Catch:{ all -> 0x0289 }
            monitor-exit(r2)     // Catch:{ all -> 0x0289 }
            goto L_0x028c
        L_0x0289:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0289 }
            throw r0     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
        L_0x028c:
            java.util.concurrent.atomic.AtomicInteger r2 = r8.f119658c     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r2.addAndGet(r1)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            long r1 = r11.mo115728a()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            int r1 = (int) r1     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r8.mo115556a(r9, r1)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
        L_0x0299:
            int r1 = r8.f119792o     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            if (r1 <= 0) goto L_0x034f
            long r1 = r11.mo115728a()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            int r3 = r8.f119792o     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            long r3 = (long) r3     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x034f
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = "download, more data received, currentCacheFileSize: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r1.append(r11)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = ", max: "
            r1.append(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            int r2 = r8.f119792o     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r1.append(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = r8.f119662g     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r1.append(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = ", key: "
            r1.append(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = r8.f119663h     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r1.append(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = r8.f119662g     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            com.toutiao.proxyserver.p1841c.C46470c.m146088c(r0, r1, r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            com.toutiao.proxyserver.speed.b r0 = com.toutiao.proxyserver.speed.C46546b.m146298a()
            r0.mo115722c()
            com.toutiao.proxyserver.speed.b r0 = com.toutiao.proxyserver.speed.C46546b.m146298a()
            r0.mo115724e()
            com.toutiao.proxyserver.p1842d.C46476c.m146119a(r10)
            r12.mo115597a()
            r22.mo115555a()
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cancel call, rawKey: "
            r1.<init>(r2)
            java.lang.String r2 = r8.f119662g
            r1.append(r2)
            java.lang.String r2 = ", key: "
            r1.append(r2)
            java.lang.String r2 = r8.f119663h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146088c(r0, r1, r2)
            boolean r0 = r8.f119794q
            if (r0 == 0) goto L_0x031a
            java.lang.String r0 = "preloader"
            goto L_0x031c
        L_0x031a:
            java.lang.String r0 = "proxy"
        L_0x031c:
            r8.mo115557a(r0)
            r2 = 0
            r3 = 0
            if (r7 != 0) goto L_0x0325
            r4 = 0
            goto L_0x0328
        L_0x0325:
            int r0 = r7.f119727c
            r4 = r0
        L_0x0328:
            long r0 = r11.mo115728a()
            int r5 = (int) r0
            r6 = 0
            r1 = r22
            r1.m146166a(r2, r3, r4, r5, r6)
            com.toutiao.proxyserver.aa r0 = com.toutiao.proxyserver.C46456aa.m146053a()
            java.lang.String r1 = r8.f119662g
            long r2 = r11.mo115728a()
            r0.mo115578a(r1, r2)
            java.lang.String r0 = "finally"
            int r1 = r8.f119666k
            r2 = 0
            r8.mo115560a(r2, r0, r1)
            if (r16 == 0) goto L_0x034e
            r16.get()     // Catch:{ InterruptedException -> 0x034d, ExecutionException -> 0x034e }
        L_0x034d:
            return
        L_0x034e:
            return
        L_0x034f:
            r22.mo115567f()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r5 = r12
            r6 = r13
            r12 = 1
            goto L_0x022d
        L_0x0357:
            r0 = move-exception
            goto L_0x0414
        L_0x035a:
            r0 = move-exception
            goto L_0x03fd
        L_0x035d:
            r12 = r5
        L_0x035e:
            java.lang.String r0 = "complete"
            int r1 = r8.f119666k     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            r2 = 0
            r8.mo115560a(r2, r0, r1)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            r22.mo115565d()     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            com.toutiao.proxyserver.n r0 = com.toutiao.proxyserver.C46534r.f119898e     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            if (r0 == 0) goto L_0x037e
            long r0 = r11.mo115728a()     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            long r2 = (long) r9     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x037e
            com.toutiao.proxyserver.h$1 r0 = new com.toutiao.proxyserver.h$1     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            r0.<init>()     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            com.toutiao.proxyserver.p1842d.C46476c.m146132b(r0)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
        L_0x037e:
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            java.lang.String r2 = "download succeed, no need to cancel call, rawKey: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            java.lang.String r2 = r8.f119662g     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            r1.append(r2)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            java.lang.String r2 = ", key: "
            r1.append(r2)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            java.lang.String r2 = r8.f119663h     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            r1.append(r2)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            java.lang.String r2 = r8.f119662g     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            com.toutiao.proxyserver.p1841c.C46470c.m146086b(r0, r1, r2)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            com.toutiao.proxyserver.speed.b r0 = com.toutiao.proxyserver.speed.C46546b.m146298a()
            r0.mo115722c()
            com.toutiao.proxyserver.speed.b r0 = com.toutiao.proxyserver.speed.C46546b.m146298a()
            r0.mo115724e()
            com.toutiao.proxyserver.p1842d.C46476c.m146119a(r10)
            r12.mo115597a()
            boolean r0 = r8.f119794q
            if (r0 == 0) goto L_0x03ba
            java.lang.String r0 = "preloader"
            goto L_0x03bc
        L_0x03ba:
            java.lang.String r0 = "proxy"
        L_0x03bc:
            r8.mo115557a(r0)
            r2 = 0
            r3 = 0
            if (r7 != 0) goto L_0x03c5
            r4 = 0
            goto L_0x03c8
        L_0x03c5:
            int r0 = r7.f119727c
            r4 = r0
        L_0x03c8:
            long r0 = r11.mo115728a()
            int r5 = (int) r0
            r6 = 0
            r1 = r22
            r1.m146166a(r2, r3, r4, r5, r6)
            com.toutiao.proxyserver.aa r0 = com.toutiao.proxyserver.C46456aa.m146053a()
            java.lang.String r1 = r8.f119662g
            long r2 = r11.mo115728a()
            r0.mo115578a(r1, r2)
            java.lang.String r0 = "finally"
            int r1 = r8.f119666k
            r2 = 0
            r8.mo115560a(r2, r0, r1)
            if (r16 == 0) goto L_0x03ee
            r16.get()     // Catch:{ InterruptedException | ExecutionException -> 0x03ed }
        L_0x03ed:
            return
        L_0x03ee:
            return
        L_0x03ef:
            r0 = move-exception
            r21 = 0
            goto L_0x0435
        L_0x03f3:
            r0 = move-exception
            r9 = r7
            r13 = r12
            r12 = 0
            goto L_0x041c
        L_0x03f8:
            r0 = move-exception
            r12 = r5
            goto L_0x0414
        L_0x03fb:
            r0 = move-exception
            r12 = r5
        L_0x03fd:
            r9 = r7
            r13 = r12
            r12 = 1
            goto L_0x041c
        L_0x0401:
            r0 = move-exception
            r12 = r5
            goto L_0x0412
        L_0x0404:
            r0 = move-exception
            r12 = r5
            r9 = r7
            r13 = r12
            r12 = 1
            goto L_0x041a
        L_0x040a:
            r0 = move-exception
            goto L_0x0411
        L_0x040c:
            r0 = move-exception
            r9 = r7
            goto L_0x0418
        L_0x040f:
            r0 = move-exception
            r7 = r9
        L_0x0411:
            r12 = 0
        L_0x0412:
            r16 = 0
        L_0x0414:
            r21 = 1
            goto L_0x0435
        L_0x0417:
            r0 = move-exception
        L_0x0418:
            r12 = 1
        L_0x0419:
            r13 = 0
        L_0x041a:
            r16 = 0
        L_0x041c:
            java.lang.String r1 = "Canceled"
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x0430 }
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch:{ all -> 0x0430 }
            if (r1 != 0) goto L_0x042f
            java.lang.String r1 = "exception"
            int r2 = r8.f119666k     // Catch:{ all -> 0x0430 }
            r8.mo115560a(r0, r1, r2)     // Catch:{ all -> 0x0430 }
        L_0x042f:
            throw r0     // Catch:{ all -> 0x0430 }
        L_0x0430:
            r0 = move-exception
            r7 = r9
            r21 = r12
            r12 = r13
        L_0x0435:
            com.toutiao.proxyserver.speed.b r1 = com.toutiao.proxyserver.speed.C46546b.m146298a()
            r1.mo115722c()
            com.toutiao.proxyserver.speed.b r1 = com.toutiao.proxyserver.speed.C46546b.m146298a()
            r1.mo115724e()
            com.toutiao.proxyserver.p1842d.C46476c.m146119a(r10)
            if (r12 == 0) goto L_0x044b
            r12.mo115597a()
        L_0x044b:
            if (r21 == 0) goto L_0x0471
            r22.mo115555a()
            java.lang.String r1 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "cancel call, rawKey: "
            r2.<init>(r3)
            java.lang.String r3 = r8.f119662g
            r2.append(r3)
            java.lang.String r3 = ", key: "
            r2.append(r3)
            java.lang.String r3 = r8.f119663h
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r8.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146088c(r1, r2, r3)
        L_0x0471:
            boolean r1 = r8.f119794q
            if (r1 == 0) goto L_0x0478
            java.lang.String r1 = "preloader"
            goto L_0x047a
        L_0x0478:
            java.lang.String r1 = "proxy"
        L_0x047a:
            r8.mo115557a(r1)
            r2 = 0
            r3 = 0
            if (r7 != 0) goto L_0x0483
            r4 = 0
            goto L_0x0486
        L_0x0483:
            int r1 = r7.f119727c
            r4 = r1
        L_0x0486:
            long r5 = r11.mo115728a()
            int r5 = (int) r5
            r6 = 0
            r1 = r22
            r1.m146166a(r2, r3, r4, r5, r6)
            com.toutiao.proxyserver.aa r1 = com.toutiao.proxyserver.C46456aa.m146053a()
            java.lang.String r2 = r8.f119662g
            long r3 = r11.mo115728a()
            r1.mo115578a(r2, r3)
            java.lang.String r1 = "finally"
            int r2 = r8.f119666k
            r3 = 0
            r8.mo115560a(r3, r1, r2)
            if (r16 == 0) goto L_0x04ab
            r16.get()     // Catch:{ InterruptedException | ExecutionException -> 0x04ab }
        L_0x04ab:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C46494h.m146167b(java.lang.String):void");
    }

    /* renamed from: a */
    private void m146166a(boolean z, int i, int i2, int i3, int i4) {
        final C46506n nVar = C46534r.f119898e;
        if (nVar != null) {
            final int i5 = i2;
            final int i6 = i3;
            C464962 r0 = new Runnable(false, 0, 0) {

                /* renamed from: c */
                final /* synthetic */ int f119799c;

                public final void run() {
                    String str = C46494h.this.f119662g;
                }

                {
                    this.f119799c = r4;
                }
            };
            C46476c.m146132b((Runnable) r0);
        }
    }
}
