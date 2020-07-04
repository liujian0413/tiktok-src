package com.toutiao.proxyserver;

import com.toutiao.proxyserver.exception.FileNotDeleteException;
import com.toutiao.proxyserver.net.C46517e;
import com.toutiao.proxyserver.p1840b.C46461a;
import com.toutiao.proxyserver.p1840b.C46463c;
import com.toutiao.proxyserver.p1841c.C46470c;
import com.toutiao.proxyserver.p1842d.C46476c;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

/* renamed from: com.toutiao.proxyserver.t */
final class C46554t extends C46447a {

    /* renamed from: m */
    private final Socket f119971m;

    /* renamed from: n */
    private final C46561c f119972n;

    /* renamed from: o */
    private final ExecutorService f119973o;

    /* renamed from: p */
    private volatile C46494h f119974p;

    /* renamed from: q */
    private boolean f119975q;

    /* renamed from: r */
    private volatile boolean f119976r = true;

    /* renamed from: com.toutiao.proxyserver.t$a */
    static final class C46559a {

        /* renamed from: a */
        C46467c f119988a;

        /* renamed from: b */
        C46463c f119989b;

        /* renamed from: c */
        ExecutorService f119990c;

        /* renamed from: d */
        Socket f119991d;

        /* renamed from: e */
        C46561c f119992e;

        C46559a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46554t mo115739a() {
            if (this.f119989b != null && this.f119990c != null && this.f119991d != null) {
                return new C46554t(this);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46559a mo115736a(C46561c cVar) {
            this.f119992e = cVar;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46559a mo115735a(C46463c cVar) {
            if (cVar != null) {
                this.f119989b = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46559a mo115737a(Socket socket) {
            if (socket != null) {
                this.f119991d = socket;
                return this;
            }
            throw new IllegalArgumentException("socket == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C46559a mo115738a(ExecutorService executorService) {
            if (executorService != null) {
                this.f119990c = executorService;
                return this;
            }
            throw new IllegalArgumentException("executor == null");
        }
    }

    /* renamed from: com.toutiao.proxyserver.t$b */
    static class C46560b {

        /* renamed from: a */
        public int f119993a;

        /* renamed from: b */
        public boolean f119994b;

        /* renamed from: c */
        private final OutputStream f119995c;

        /* renamed from: d */
        private final String f119996d;

        /* renamed from: a */
        public final void mo115740a() throws C46569x {
            try {
                this.f119995c.flush();
            } catch (IOException e) {
                if (C46534r.f119900g != null) {
                    C46534r.f119900g.mo105059a(-1, "flush error.", this.f119996d);
                }
                StringBuilder sb = new StringBuilder("flush error");
                sb.append(e.toString());
                C46470c.m146089d("TAG_PROXY_ProxyTask", sb.toString());
                throw new C46569x(e);
            }
        }

        C46560b(OutputStream outputStream, int i, String str) {
            this.f119995c = outputStream;
            this.f119993a = i;
            this.f119996d = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo115742b(byte[] bArr, int i, int i2) throws C46569x {
            try {
                this.f119995c.write(bArr, 0, i2);
                this.f119993a += i2;
            } catch (IOException e) {
                if (C46534r.f119900g != null) {
                    C46534r.f119900g.mo105059a(-1, "Write data to player error.", this.f119996d);
                }
                StringBuilder sb = new StringBuilder("writeData error");
                sb.append(e.toString());
                C46470c.m146089d("TAG_PROXY_ProxyTask", sb.toString());
                throw new C46569x(e);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo115741a(byte[] bArr, int i, int i2) throws C46569x {
            if (!this.f119994b) {
                try {
                    this.f119995c.write(bArr, 0, i2);
                    this.f119994b = true;
                } catch (IOException e) {
                    if (C46534r.f119900g != null) {
                        C46534r.f119900g.mo105059a(-1, "Write header to player error.", this.f119996d);
                    }
                    throw new C46569x(e);
                }
            }
        }
    }

    /* renamed from: com.toutiao.proxyserver.t$c */
    public interface C46561c {
        /* renamed from: a */
        void mo115713a(C46554t tVar);

        /* renamed from: b */
        void mo115714b(C46554t tVar);
    }

    /* renamed from: a */
    public final void mo115555a() {
        super.mo115555a();
        m146322m();
    }

    /* renamed from: l */
    private void m146321l() {
        if (C46534r.f119918y) {
            if (C46522q.m146233f() == 1) {
                C46522q.m146227a().mo115686c();
                return;
            }
            C46522q.m146227a().mo115677a(mo115568g(), this.f119663h);
        }
    }

    /* renamed from: m */
    private void m146322m() {
        C46494h hVar = this.f119974p;
        this.f119974p = null;
        if (hVar != null) {
            hVar.mo115555a();
            StringBuilder sb = new StringBuilder("cancel fetch task, ");
            sb.append(C46470c.m146081a((Throwable) new RuntimeException()));
            C46470c.m146088c("TAG_PROXY_ProxyTask", sb.toString(), this.f119662g);
        }
    }

    public final void run() {
        C46560b k = m146320k();
        if (k != null) {
            if (this.f119972n != null) {
                this.f119972n.mo115713a(this);
            }
            try {
                this.f119656a.mo115592a(this.f119663h);
                try {
                    m146315a(k);
                } catch (CancelException e) {
                    C46470c.m146090d("TAG_PROXY_ProxyTask", C46470c.m146081a((Throwable) e), this.f119662g);
                }
                if (this.f119975q) {
                    this.f119656a.mo115594c(this.f119662g);
                }
                this.f119656a.mo115593b(this.f119663h);
                mo115555a();
                C46476c.m146123a(this.f119971m);
                StringBuilder sb = new StringBuilder("close socket vid: ");
                sb.append(this.f119662g);
                sb.append(", ");
                sb.append(k.f119993a);
                C46470c.m146089d("TAG_PROXY_ProxyTask", sb.toString());
                if (this.f119972n != null) {
                    this.f119972n.mo115714b(this);
                }
            } catch (FileNotDeleteException unused) {
                C46476c.m146123a(this.f119971m);
                if (this.f119972n != null) {
                    this.f119972n.mo115714b(this);
                }
            }
        }
    }

    /* renamed from: k */
    private C46560b m146320k() {
        C46467c cVar;
        try {
            this.f119664i = C46564v.m146340a(this.f119971m.getInputStream());
            OutputStream outputStream = this.f119971m.getOutputStream();
            if (this.f119664i.f120000c.f120001a == 1) {
                cVar = C46534r.f119894a;
            } else {
                cVar = C46534r.f119895b;
            }
            if (cVar == null) {
                C46470c.m146090d("TAG_PROXY_ProxyTask", "cache is null", this.f119662g);
                return null;
            }
            this.f119656a = cVar;
            this.f119662g = this.f119664i.f120000c.f120002b;
            this.f119663h = this.f119664i.f120000c.f120003c;
            this.f119665j = new C46571z(this.f119664i.f120000c.f120007g);
            this.f119660e = this.f119664i.f119999b;
            StringBuilder sb = new StringBuilder("request from MediaPlayer:    ");
            sb.append(this.f119664i.toString());
            C46470c.m146086b("TAG_PROXY_ProxyTask", sb.toString(), this.f119662g);
            return new C46560b(outputStream, this.f119664i.f120000c.f120004d, this.f119662g);
        } catch (IOException e) {
            C46476c.m146123a(this.f119971m);
            C46470c.m146090d("TAG_PROXY_ProxyTask", C46470c.m146081a((Throwable) e), this.f119662g);
            return null;
        } catch (C46567c e2) {
            C46476c.m146123a(this.f119971m);
            C46470c.m146090d("TAG_PROXY_ProxyTask", C46470c.m146081a((Throwable) e2), this.f119662g);
            return null;
        }
    }

    C46554t(C46559a aVar) {
        super(aVar.f119988a, aVar.f119989b);
        this.f119973o = aVar.f119990c;
        this.f119971m = aVar.f119991d;
        this.f119972n = aVar.f119992e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        r0 = new java.lang.StringBuilder("CancelException: ");
        r0.append(com.toutiao.proxyserver.p1841c.C46470c.m146081a((java.lang.Throwable) r11));
        com.toutiao.proxyserver.p1841c.C46470c.m146090d("TAG_PROXY_ProxyTask", r0.toString(), r10.f119662g);
        com.toutiao.proxyserver.C46534r.m146260a(-1, "Task was cancel.", r10.f119662g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        r3 = new java.lang.StringBuilder("ContentLengthNotMatchException: ");
        r3.append(com.toutiao.proxyserver.p1841c.C46470c.m146081a((java.lang.Throwable) r11));
        com.toutiao.proxyserver.p1841c.C46470c.m146090d("TAG_PROXY_ProxyTask", r3.toString(), r10.f119662g);
        r10.f119975q = true;
        r2 = new java.lang.StringBuilder(" ContentLengthNotMatchException: ");
        r2.append(com.toutiao.proxyserver.p1841c.C46470c.m146081a((java.lang.Throwable) r11));
        com.toutiao.proxyserver.C46534r.m146260a(5, r2.toString(), r10.f119662g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e2, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0126, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0127, code lost:
        r1 = new java.lang.StringBuilder("SocketWriteException: ");
        r1.append(com.toutiao.proxyserver.p1841c.C46470c.m146081a((java.lang.Throwable) r11));
        com.toutiao.proxyserver.p1841c.C46470c.m146090d("TAG_PROXY_ProxyTask", r1.toString(), r10.f119662g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0140, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0141, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014e, code lost:
        r8 = new java.lang.StringBuilder("IOException: ");
        r8.append(com.toutiao.proxyserver.p1841c.C46470c.m146081a((java.lang.Throwable) r3));
        com.toutiao.proxyserver.p1841c.C46470c.m146090d("TAG_PROXY_ProxyTask", r8.toString(), r10.f119662g);
        r4 = new com.toutiao.proxyserver.C46499i(2, "IOException", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0174, code lost:
        r4 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b A[ExcHandler: CancelException (r11v10 'e' com.toutiao.proxyserver.CancelException A[CUSTOM_DECLARE]), Splitter:B:18:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae A[ExcHandler: e (r11v7 'e' com.toutiao.proxyserver.e A[CUSTOM_DECLARE]), Splitter:B:18:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0126 A[ExcHandler: x (r11v4 'e' com.toutiao.proxyserver.x A[CUSTOM_DECLARE]), Splitter:B:18:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m146315a(com.toutiao.proxyserver.C46554t.C46560b r11) throws com.toutiao.proxyserver.CancelException {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            r4 = r0
            r5 = r4
            r3 = 1
            r6 = 0
        L_0x0007:
            com.toutiao.proxyserver.z r7 = r10.f119665j
            boolean r7 = r7.mo115752a()
            if (r7 == 0) goto L_0x01ba
            r10.mo115567f()
            r7 = 2
            if (r3 == 0) goto L_0x002e
            boolean r3 = com.toutiao.proxyserver.C46534r.f119909p
            if (r3 == 0) goto L_0x002e
            com.toutiao.proxyserver.z r3 = r10.f119665j
            java.util.List<java.lang.String> r3 = r3.f120015a
            if (r3 == 0) goto L_0x002e
            com.toutiao.proxyserver.z r3 = r10.f119665j
            java.util.List<java.lang.String> r3 = r3.f120015a
            int r3 = r3.size()
            if (r3 < r7) goto L_0x002e
            com.toutiao.proxyserver.z r3 = r10.f119665j
            r3.mo115753b()
        L_0x002e:
            if (r6 == 0) goto L_0x0040
            r3 = r0
        L_0x0031:
            com.toutiao.proxyserver.z r8 = r10.f119665j
            boolean r8 = r8.mo115752a()
            if (r8 == 0) goto L_0x0046
            com.toutiao.proxyserver.z r3 = r10.f119665j
            com.toutiao.proxyserver.z$a r3 = r3.mo115753b()
            goto L_0x0031
        L_0x0040:
            com.toutiao.proxyserver.z r3 = r10.f119665j
            com.toutiao.proxyserver.z$a r3 = r3.mo115753b()
        L_0x0046:
            java.lang.String r8 = r3.f120018a     // Catch:{ RequestException -> 0x0174, IOException -> 0x0141, x -> 0x0126, a -> 0x00e3, e -> 0x00ae, CancelException -> 0x008b, Exception -> 0x0063 }
            r10.mo115571j()     // Catch:{ RequestException -> 0x005f, IOException -> 0x005b, x -> 0x0126, a -> 0x0057, e -> 0x00ae, CancelException -> 0x008b, Exception -> 0x0054 }
            java.lang.String r5 = r3.f120018a     // Catch:{ RequestException -> 0x005f, IOException -> 0x005b, x -> 0x0126, a -> 0x0057, e -> 0x00ae, CancelException -> 0x008b, Exception -> 0x0054 }
            r10.m146313a(r11, r5)     // Catch:{ RequestException -> 0x005f, IOException -> 0x005b, x -> 0x0126, a -> 0x0057, e -> 0x00ae, CancelException -> 0x008b, Exception -> 0x0054 }
            r11.mo115740a()     // Catch:{ RequestException -> 0x005f, IOException -> 0x005b, x -> 0x0126, a -> 0x0057, e -> 0x00ae, CancelException -> 0x008b, Exception -> 0x0054 }
            return r2
        L_0x0054:
            r3 = move-exception
            r5 = r8
            goto L_0x0064
        L_0x0057:
            r3 = move-exception
            r5 = r8
            goto L_0x00e4
        L_0x005b:
            r3 = move-exception
            r5 = r8
            goto L_0x0142
        L_0x005f:
            r4 = move-exception
            r5 = r8
            goto L_0x0175
        L_0x0063:
            r3 = move-exception
        L_0x0064:
            java.lang.String r4 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "OtherException: "
            r7.<init>(r8)
            java.lang.String r8 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r3)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = r10.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r4, r7, r8)
            com.toutiao.proxyserver.i r4 = new com.toutiao.proxyserver.i
            java.lang.String r7 = "OtherException"
            r4.<init>(r1, r7, r3)
            int r3 = r10.f119666k
            int r3 = r3 + r2
            r10.f119666k = r3
            goto L_0x0123
        L_0x008b:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CancelException: "
            r0.<init>(r1)
            java.lang.String r1 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r11)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r10.f119662g
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r2, r0, r1)
            r0 = -1
            java.lang.String r1 = r10.f119662g
            java.lang.String r2 = "Task was cancel."
            com.toutiao.proxyserver.C46534r.m146260a(r0, r2, r1)
            throw r11
        L_0x00ae:
            r11 = move-exception
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ContentLengthNotMatchException: "
            r3.<init>(r4)
            java.lang.String r4 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r11)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r10.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r0, r3, r4)
            r10.f119975q = r2
            r0 = 5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " ContentLengthNotMatchException: "
            r2.<init>(r3)
            java.lang.String r11 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r11)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            java.lang.String r2 = r10.f119662g
            com.toutiao.proxyserver.C46534r.m146260a(r0, r11, r2)
            return r1
        L_0x00e3:
            r3 = move-exception
        L_0x00e4:
            java.lang.String r4 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "RandomAccessFileWrapper"
            r7.<init>(r8)
            java.lang.String r8 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r3)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = r10.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r4, r7, r8)
            r10.f119976r = r1
            com.toutiao.proxyserver.i r4 = new com.toutiao.proxyserver.i
            java.lang.String r7 = "RandomAccessFileWrapper.FileException"
            r8 = 4
            r4.<init>(r8, r7, r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = " RandomAccessFileWrapper.FileException："
            r7.<init>(r9)
            java.lang.String r3 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r3)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            java.lang.String r7 = r10.f119662g
            com.toutiao.proxyserver.C46534r.m146260a(r8, r3, r7)
            int r3 = r10.f119666k
            int r3 = r3 + r2
            r10.f119666k = r3
        L_0x0123:
            r3 = 0
            goto L_0x0007
        L_0x0126:
            r11 = move-exception
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "SocketWriteException: "
            r1.<init>(r3)
            java.lang.String r11 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r11)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = r10.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r0, r11, r1)
            return r2
        L_0x0141:
            r3 = move-exception
        L_0x0142:
            java.lang.String r8 = "Canceled"
            java.lang.String r9 = r3.getMessage()
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 != 0) goto L_0x016e
            java.lang.String r4 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "IOException: "
            r8.<init>(r9)
            java.lang.String r9 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r3)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = r10.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r4, r8, r9)
            com.toutiao.proxyserver.i r4 = new com.toutiao.proxyserver.i
            java.lang.String r8 = "IOException"
            r4.<init>(r7, r8, r3)
        L_0x016e:
            int r3 = r10.f119666k
            int r3 = r3 + r2
            r10.f119666k = r3
            goto L_0x0123
        L_0x0174:
            r4 = move-exception
        L_0x0175:
            boolean r7 = com.toutiao.proxyserver.C46534r.f119908o
            if (r7 != 0) goto L_0x017c
            r3.mo115754a()
        L_0x017c:
            java.lang.String r3 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "RequestException: "
            r7.<init>(r8)
            java.lang.String r8 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r4)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = r10.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r3, r7, r8)
            com.toutiao.proxyserver.i r3 = new com.toutiao.proxyserver.i
            int r7 = r4.errorCode
            java.lang.String r8 = "RequestException"
            r3.<init>(r7, r8, r4)
            int r7 = r4.errorCode
            r8 = 416(0x1a0, float:5.83E-43)
            if (r7 != r8) goto L_0x01a7
            r10.f119975q = r2
            goto L_0x01b2
        L_0x01a7:
            int r4 = r4.errorCode
            r7 = 403(0x193, float:5.65E-43)
            if (r4 != r7) goto L_0x01b2
            boolean r4 = com.toutiao.proxyserver.C46534r.f119908o
            if (r4 == 0) goto L_0x01b2
            r6 = 1
        L_0x01b2:
            int r4 = r10.f119666k
            int r4 = r4 + r2
            r10.f119666k = r4
            r4 = r3
            goto L_0x0123
        L_0x01ba:
            if (r4 == 0) goto L_0x01e3
            int r11 = r4.f119815a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r4.f119816b
            r0.append(r3)
            java.lang.Exception r3 = r4.f119817c
            java.lang.String r3 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r3)
            r0.append(r3)
            java.lang.String r3 = ", url:"
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r10.f119662g
            com.toutiao.proxyserver.C46534r.m146260a(r11, r0, r3)
            goto L_0x01eb
        L_0x01e3:
            r11 = 6
            java.lang.String r0 = "After retry all url, no exception..."
            java.lang.String r3 = r10.f119662g
            com.toutiao.proxyserver.C46534r.m146260a(r11, r0, r3)
        L_0x01eb:
            java.lang.String r11 = "TAG_PROXY_ProxyTask"
            java.lang.String r0 = "execute() called and return false"
            java.lang.String r3 = r10.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r11, r0, r3)
            com.toutiao.proxyserver.C46534r.m146259a(r2, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C46554t.m146315a(com.toutiao.proxyserver.t$b):boolean");
    }

    /* renamed from: a */
    private void m146313a(C46560b bVar, String str) throws Exception {
        if ("HEAD".equalsIgnoreCase(this.f119664i.f119998a.f120008a)) {
            m146317b(bVar, str);
        } else {
            m146318c(bVar, str);
        }
    }

    /* renamed from: b */
    private void m146317b(C46560b bVar, String str) throws IOException, C46569x {
        StringBuilder sb = new StringBuilder("procHead() called with: mediaPlayerWriter = [");
        sb.append(bVar);
        sb.append("], url = [");
        sb.append(str);
        sb.append("]");
        C46470c.m146083a("TAG_PROXY_ProxyTask", sb.toString());
        byte[] a = m146316a(this.f119657b.mo115584a(this.f119663h, this.f119664i.f120000c.f120001a), bVar, str);
        bVar.mo115741a(a, 0, a.length);
    }

    /* renamed from: c */
    private void m146318c(C46560b bVar, String str) throws Exception {
        int i;
        StringBuilder sb = new StringBuilder("procGet() called with, url = [");
        sb.append(str);
        sb.append("]，rawKey：");
        sb.append(this.f119662g);
        sb.append("， key:");
        sb.append(this.f119663h);
        C46470c.m146084a("TAG_PROXY_ProxyTask", sb.toString(), this.f119662g);
        if (this.f119976r) {
            File d = this.f119656a.mo115595d(this.f119663h);
            long length = d.length();
            C46461a a = this.f119657b.mo115584a(this.f119663h, this.f119664i.f120000c.f120001a);
            int i2 = bVar.f119993a;
            long j = length - ((long) i2);
            int i3 = (int) j;
            if (a == null) {
                i = -1;
            } else {
                i = a.f119727c;
            }
            StringBuilder sb2 = new StringBuilder("procGet() totalLength:");
            sb2.append(i);
            sb2.append(", cacheLength:");
            sb2.append(length);
            sb2.append(", mpOffset:");
            sb2.append(i2);
            C46470c.m146083a("TAG_PROXY_ProxyTask", sb2.toString());
            if (length > ((long) bVar.f119993a)) {
                StringBuilder sb3 = new StringBuilder("cache hit, remainSize: ");
                sb3.append(j);
                sb3.append("，rawKey：");
                sb3.append(this.f119662g);
                sb3.append("， key:");
                sb3.append(this.f119663h);
                C46470c.m146086b("TAG_PROXY_ProxyTask", sb3.toString(), this.f119662g);
                m146314a(true, i3, i, (int) length, i2);
                C46456aa.m146053a().mo115578a(this.f119662g, length);
                m146312a(a, d, bVar, str);
                return;
            }
            m146314a(false, i3, i, (int) length, i2);
            C46456aa.m146053a().mo115578a(this.f119662g, length);
        } else {
            m146314a(false, 0, 0, 0, bVar.f119993a);
            C46456aa.m146053a().mo115578a(this.f119662g, 0);
        }
        m146319d(bVar, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03b3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03b4, code lost:
        r16 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03a4 A[SYNTHETIC, Splitter:B:123:0x03a4] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03b3 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:20:0x013e] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03d6 A[Catch:{ all -> 0x03de }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x042b A[SYNTHETIC, Splitter:B:159:0x042b] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0312 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0266 A[Catch:{ IOException -> 0x03ab, all -> 0x03a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0268 A[Catch:{ IOException -> 0x03ab, all -> 0x03a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0277 A[Catch:{ IOException -> 0x03ab, all -> 0x03a9 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m146319d(com.toutiao.proxyserver.C46554t.C46560b r23, java.lang.String r24) throws com.toutiao.proxyserver.C46569x, java.io.IOException, com.toutiao.proxyserver.CancelException, com.toutiao.proxyserver.C46479e {
        /*
            r22 = this;
            r8 = r22
            r7 = r23
            r9 = r24
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "processNetworkOnly() called with, url = ["
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = "]，rawKey："
            r1.append(r2)
            java.lang.String r2 = r8.f119662g
            r1.append(r2)
            java.lang.String r2 = "， key:"
            r1.append(r2)
            java.lang.String r2 = r8.f119663h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146084a(r0, r1, r2)
            r22.m146321l()
            r22.m146322m()
            r22.mo115563b()
            long r10 = android.os.SystemClock.elapsedRealtime()
            int r0 = r7.f119993a
            com.toutiao.proxyserver.speed.c r12 = new com.toutiao.proxyserver.speed.c
            r12.<init>()
            com.toutiao.proxyserver.speed.b r1 = com.toutiao.proxyserver.speed.C46546b.m146298a()
            r1.f119958a = r12
            com.toutiao.proxyserver.speed.b r1 = com.toutiao.proxyserver.speed.C46546b.m146298a()     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            r1.mo115721b()     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            r22.mo115570i()     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            com.toutiao.proxyserver.c.b r1 = com.toutiao.proxyserver.C46534r.f119914u     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            if (r1 == 0) goto L_0x0064
            com.toutiao.proxyserver.c.b r1 = com.toutiao.proxyserver.C46534r.f119914u     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            java.lang.String r2 = "videocache_start_request"
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            java.lang.String r5 = r8.f119662g     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            r1.mo105058a(r2, r3, r5)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
        L_0x0064:
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            java.lang.String r3 = "processNetworkOnly() before request from:"
            r2.<init>(r3)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            r2.append(r0)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            java.lang.String r3 = ", to:"
            r2.append(r3)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            com.toutiao.proxyserver.v r3 = r8.f119664i     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            com.toutiao.proxyserver.v$a r3 = r3.f120000c     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            int r3 = r3.f120005e     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            r2.append(r3)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            com.toutiao.proxyserver.p1841c.C46470c.m146083a(r1, r2)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            com.toutiao.proxyserver.v r1 = r8.f119664i     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            com.toutiao.proxyserver.v$a r1 = r1.f120000c     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            int r1 = r1.f120005e     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            java.lang.String r2 = "GET"
            com.toutiao.proxyserver.net.e r14 = r8.mo115554a(r9, r0, r1, r2)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            r22.mo115569h()     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            r1 = 1
            r15 = 0
            com.toutiao.proxyserver.p1842d.C46476c.m146118a(r14, r15, r1)     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.b.c r1 = r8.f119657b     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            java.lang.String r2 = r8.f119663h     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            int r3 = r22.mo115568g()     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.b.a r6 = r1.mo115584a(r2, r3)     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            int r5 = com.toutiao.proxyserver.p1842d.C46476c.m146108a(r14)     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            if (r6 == 0) goto L_0x013e
            int r1 = r6.f119727c     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            if (r1 == r5) goto L_0x013e
            com.toutiao.proxyserver.n r0 = com.toutiao.proxyserver.C46534r.f119898e     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            if (r0 == 0) goto L_0x00cb
            int r0 = r22.mo115568g()     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            boolean r2 = com.toutiao.proxyserver.p1840b.C46462b.m146064a(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = r8.f119662g     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            int r4 = r6.f119727c     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r7 = r6.f119729e     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r1 = r22
            r0 = r5
            r15 = r6
            r6 = r24
            r1.mo115561a(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            goto L_0x00cd
        L_0x00cb:
            r0 = r5
            r15 = r6
        L_0x00cd:
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = "Content-Length not match, old: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            int r3 = r15.f119727c     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = ", "
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = ", key: "
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = r8.f119663h     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = "，rawKey："
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = r8.f119662g     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = r8.f119662g     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r1, r2, r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            com.toutiao.proxyserver.e r1 = new com.toutiao.proxyserver.e     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = "Content-Length not match, old length: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            int r3 = r15.f119727c     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = ", new length: "
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r0 = ", rawKey: "
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r0 = r8.f119662g     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r0 = ", currentUrl: "
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r9)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r0 = ", previousInfo: "
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r0 = r15.f119729e     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            throw r1     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
        L_0x013a:
            r0 = move-exception
            r13 = r14
            goto L_0x03be
        L_0x013e:
            boolean r1 = r7.f119994b     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            if (r1 != 0) goto L_0x0164
            java.lang.String r0 = com.toutiao.proxyserver.p1842d.C46476c.m146114a(r14, r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r22.mo115567f()     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.nio.charset.Charset r1 = com.toutiao.proxyserver.p1842d.C46476c.f119755a     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            byte[] r0 = r0.getBytes(r1)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            int r1 = r0.length     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r7.mo115741a(r0, r15, r1)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            com.toutiao.proxyserver.c.b r0 = com.toutiao.proxyserver.C46534r.f119914u     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            if (r0 == 0) goto L_0x0164
            com.toutiao.proxyserver.c.b r0 = com.toutiao.proxyserver.C46534r.f119914u     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r1 = "videocache_write_header"
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r4 = r8.f119662g     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r0.mo105058a(r1, r2, r4)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
        L_0x0164:
            r22.mo115567f()     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.c r0 = r8.f119656a     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            java.lang.String r1 = r8.f119663h     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            java.io.File r1 = r0.mo115596e(r1)     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            boolean r0 = r8.f119976r     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            if (r0 == 0) goto L_0x021c
            if (r1 == 0) goto L_0x021c
            long r2 = r1.length()     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            int r0 = r7.f119993a     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            long r4 = (long) r0     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x021c
            com.toutiao.proxyserver.b.c r0 = r8.f119657b     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            java.lang.String r2 = r8.f119663h     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.v r3 = r8.f119664i     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.v$a r3 = r3.f120000c     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            int r3 = r3.f120001a     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.p1842d.C46476c.m146111a(r14, r0, r2, r3)     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.u r0 = new com.toutiao.proxyserver.u     // Catch:{ a -> 0x01b0 }
            java.lang.String r2 = "rwd"
            r0.<init>(r1, r2)     // Catch:{ a -> 0x01b0 }
            int r2 = r7.f119993a     // Catch:{ a -> 0x01b0 }
            long r2 = (long) r2     // Catch:{ a -> 0x01b0 }
            r0.mo115745a(r2)     // Catch:{ a -> 0x01b0 }
            com.toutiao.proxyserver.d r2 = new com.toutiao.proxyserver.d     // Catch:{ a -> 0x01b0 }
            r2.<init>(r0)     // Catch:{ a -> 0x01b0 }
            java.util.concurrent.Future r3 = r2.mo115599b()     // Catch:{ a -> 0x01ae, IOException -> 0x01aa, all -> 0x01a4 }
            goto L_0x01c0
        L_0x01a4:
            r0 = move-exception
            r13 = r2
            r16 = r14
            goto L_0x03b7
        L_0x01aa:
            r0 = move-exception
            r13 = r14
            goto L_0x03c9
        L_0x01ae:
            r0 = move-exception
            goto L_0x01b2
        L_0x01b0:
            r0 = move-exception
            r2 = 0
        L_0x01b2:
            java.lang.String r3 = "TAG_PROXY_ProxyTask"
            java.lang.String r0 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r0)     // Catch:{ IOException -> 0x0215, all -> 0x020f }
            java.lang.String r4 = r8.f119662g     // Catch:{ IOException -> 0x0215, all -> 0x020f }
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r3, r0, r4)     // Catch:{ IOException -> 0x0215, all -> 0x020f }
            r0 = 0
            r2 = 0
            r3 = 0
        L_0x01c0:
            java.lang.String r4 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0207, all -> 0x0200 }
            java.lang.String r6 = "can write to cache file in network task, cache file size: "
            r5.<init>(r6)     // Catch:{ IOException -> 0x0207, all -> 0x0200 }
            r16 = r14
            long r13 = r1.length()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5.append(r13)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r1 = ", from: "
            r5.append(r1)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r1 = r7.f119993a     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5.append(r1)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r1 = "，rawKey："
            r5.append(r1)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r1 = r8.f119662g     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5.append(r1)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r1 = "， key:"
            r5.append(r1)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r1 = r8.f119663h     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5.append(r1)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r1 = r5.toString()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r5 = r8.f119662g     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            com.toutiao.proxyserver.p1841c.C46470c.m146086b(r4, r1, r5)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r13 = r2
            r14 = r3
            goto L_0x0258
        L_0x01fc:
            r0 = move-exception
            goto L_0x0203
        L_0x01fe:
            r0 = move-exception
            goto L_0x020a
        L_0x0200:
            r0 = move-exception
            r16 = r14
        L_0x0203:
            r13 = r2
            r14 = r3
            goto L_0x03e2
        L_0x0207:
            r0 = move-exception
            r16 = r14
        L_0x020a:
            r14 = r3
        L_0x020b:
            r13 = r16
            goto L_0x03ca
        L_0x020f:
            r0 = move-exception
            r16 = r14
            r13 = r2
            goto L_0x03b7
        L_0x0215:
            r0 = move-exception
            r16 = r14
            r13 = r16
            goto L_0x03c9
        L_0x021c:
            r16 = r14
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r3 = "can't write to cache file in network task, cache file size: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            long r3 = r1.length()     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            r2.append(r3)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r1 = ", from: "
            r2.append(r1)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            int r1 = r7.f119993a     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            r2.append(r1)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r1 = "，rawKey："
            r2.append(r1)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r1 = r8.f119662g     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            r2.append(r1)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r1 = "， key:"
            r2.append(r1)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r1 = r8.f119663h     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            r2.append(r1)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r2 = r8.f119662g     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            com.toutiao.proxyserver.p1841c.C46470c.m146088c(r0, r1, r2)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            r0 = 0
            r13 = 0
            r14 = 0
        L_0x0258:
            com.toutiao.proxyserver.b.c r1 = r8.f119657b     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r2 = r8.f119663h     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            int r3 = r22.mo115568g()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.b.a r1 = r1.mo115584a(r2, r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            if (r1 != 0) goto L_0x0268
            r5 = 0
            goto L_0x026b
        L_0x0268:
            int r1 = r1.f119727c     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r5 = r1
        L_0x026b:
            int r1 = com.toutiao.proxyserver.C46534r.f119904k     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            byte[] r6 = new byte[r1]     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.io.InputStream r4 = r16.mo115674d()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r17 = r0
        L_0x0275:
            if (r4 == 0) goto L_0x0312
            r22.mo115567f()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r22.mo115570i()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            int r3 = r4.read(r6)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.n r2 = com.toutiao.proxyserver.C46534r.f119898e     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            if (r2 == 0) goto L_0x02a4
            java.lang.String r2 = r8.f119662g     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r20 = 0
            long r18 = r18 - r0
            r1 = r22
            r0 = r3
            r3 = r24
            r20 = r4
            r4 = r0
            r21 = r5
            r15 = r6
            r5 = r18
            r1.mo115558a(r2, r3, r4, r5)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            goto L_0x02aa
        L_0x02a4:
            r0 = r3
            r20 = r4
            r21 = r5
            r15 = r6
        L_0x02aa:
            r22.mo115569h()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            if (r0 < 0) goto L_0x030f
            if (r0 <= 0) goto L_0x0303
            r1 = 0
            r7.mo115742b(r15, r1, r0)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            long r1 = (long) r0     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r12.mo115729a(r1)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.aa r1 = com.toutiao.proxyserver.C46456aa.m146053a()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r2 = r8.f119662g     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            long r3 = r12.mo115728a()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r1.mo115578a(r2, r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            if (r13 == 0) goto L_0x02fb
            r1 = 0
            r13.mo115598a(r15, r1, r0)     // Catch:{ Throwable -> 0x02cd }
            goto L_0x02fb
        L_0x02cd:
            r0 = move-exception
            r1 = r0
            if (r17 == 0) goto L_0x02d6
            r17.mo115744a()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r17 = 0
        L_0x02d6:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            java.lang.String r3 = "append to cache file error in network task!!! "
            r2.<init>(r3)     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            java.lang.String r1 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r1)     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            r2.append(r1)     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            java.lang.String r2 = r8.f119662g     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r0, r1, r2)     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            r13 = 0
            goto L_0x02fb
        L_0x02f1:
            r0 = move-exception
            r13 = 0
            goto L_0x03e2
        L_0x02f5:
            r0 = move-exception
            r13 = r16
            r2 = 0
            goto L_0x03ca
        L_0x02fb:
            int r0 = r7.f119993a     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r1 = r21
            r8.mo115556a(r1, r0)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            goto L_0x0305
        L_0x0303:
            r1 = r21
        L_0x0305:
            r22.mo115567f()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r5 = r1
            r6 = r15
            r4 = r20
            r15 = 0
            goto L_0x0275
        L_0x030f:
            r1 = r21
            goto L_0x0313
        L_0x0312:
            r1 = r5
        L_0x0313:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r3 = "read from net complete!，rawKey："
            r2.<init>(r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r3 = r8.f119662g     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r2.append(r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r3 = "， key:"
            r2.append(r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r3 = r8.f119663h     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r2.append(r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r3 = ", url:"
            r2.append(r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r2.append(r9)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r3 = r8.f119662g     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.p1841c.C46470c.m146086b(r0, r2, r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r0 = "complete"
            int r2 = r8.f119666k     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r3 = 0
            r8.mo115560a(r3, r0, r2)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r22.mo115565d()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.n r0 = com.toutiao.proxyserver.C46534r.f119898e     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            if (r0 == 0) goto L_0x0357
            int r0 = r7.f119993a     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            if (r0 < r1) goto L_0x0357
            com.toutiao.proxyserver.t$4 r0 = new com.toutiao.proxyserver.t$4     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r0.<init>()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.p1842d.C46476c.m146132b(r0)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
        L_0x0357:
            r1 = 0
            com.toutiao.proxyserver.C46534r.m146259a(r1, r9)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.speed.b r0 = com.toutiao.proxyserver.speed.C46546b.m146298a()
            r0.mo115722c()
            com.toutiao.proxyserver.speed.b r0 = com.toutiao.proxyserver.speed.C46546b.m146298a()
            r0.mo115724e()
            com.toutiao.proxyserver.p1842d.C46476c.m146119a(r16)
            if (r13 == 0) goto L_0x0371
            r13.mo115597a()
        L_0x0371:
            java.util.concurrent.atomic.AtomicInteger r0 = r8.f119658c
            long r1 = r12.mo115728a()
            int r1 = (int) r1
            r0.addAndGet(r1)
            java.util.concurrent.atomic.AtomicLong r0 = r8.f119659d
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r10
            r0.addAndGet(r1)
            java.lang.String r0 = "proxy"
            r8.mo115557a(r0)
            java.lang.String r0 = "finally"
            int r1 = r8.f119666k
            r2 = 0
            r8.mo115560a(r2, r0, r1)
            com.toutiao.proxyserver.aa r0 = com.toutiao.proxyserver.C46456aa.m146053a()
            java.lang.String r1 = r8.f119662g
            java.util.concurrent.atomic.AtomicInteger r2 = r8.f119658c
            int r2 = r2.get()
            long r2 = (long) r2
            r0.mo115578a(r1, r2)
            if (r14 == 0) goto L_0x03a8
            r14.get()     // Catch:{ InterruptedException | ExecutionException -> 0x03a7 }
        L_0x03a7:
            return
        L_0x03a8:
            return
        L_0x03a9:
            r0 = move-exception
            goto L_0x03e2
        L_0x03ab:
            r0 = move-exception
            r2 = r13
            goto L_0x020b
        L_0x03af:
            r0 = move-exception
            goto L_0x03b6
        L_0x03b1:
            r0 = move-exception
            goto L_0x03bc
        L_0x03b3:
            r0 = move-exception
            r16 = r14
        L_0x03b6:
            r13 = 0
        L_0x03b7:
            r14 = 0
            goto L_0x03e2
        L_0x03b9:
            r0 = move-exception
            r16 = r14
        L_0x03bc:
            r13 = r16
        L_0x03be:
            r2 = 0
            goto L_0x03c9
        L_0x03c0:
            r0 = move-exception
            r13 = 0
            r14 = 0
            r16 = 0
            goto L_0x03e2
        L_0x03c6:
            r0 = move-exception
            r2 = 0
            r13 = 0
        L_0x03c9:
            r14 = 0
        L_0x03ca:
            java.lang.String r1 = "Canceled"
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x03de }
            boolean r1 = r1.equalsIgnoreCase(r3)     // Catch:{ all -> 0x03de }
            if (r1 != 0) goto L_0x03dd
            java.lang.String r1 = "exception"
            int r3 = r8.f119666k     // Catch:{ all -> 0x03de }
            r8.mo115560a(r0, r1, r3)     // Catch:{ all -> 0x03de }
        L_0x03dd:
            throw r0     // Catch:{ all -> 0x03de }
        L_0x03de:
            r0 = move-exception
            r16 = r13
            r13 = r2
        L_0x03e2:
            com.toutiao.proxyserver.speed.b r1 = com.toutiao.proxyserver.speed.C46546b.m146298a()
            r1.mo115722c()
            com.toutiao.proxyserver.speed.b r1 = com.toutiao.proxyserver.speed.C46546b.m146298a()
            r1.mo115724e()
            com.toutiao.proxyserver.p1842d.C46476c.m146119a(r16)
            if (r13 == 0) goto L_0x03f8
            r13.mo115597a()
        L_0x03f8:
            java.util.concurrent.atomic.AtomicInteger r1 = r8.f119658c
            long r2 = r12.mo115728a()
            int r2 = (int) r2
            r1.addAndGet(r2)
            java.util.concurrent.atomic.AtomicLong r1 = r8.f119659d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r10
            r1.addAndGet(r2)
            java.lang.String r1 = "proxy"
            r8.mo115557a(r1)
            java.lang.String r1 = "finally"
            int r2 = r8.f119666k
            r3 = 0
            r8.mo115560a(r3, r1, r2)
            com.toutiao.proxyserver.aa r1 = com.toutiao.proxyserver.C46456aa.m146053a()
            java.lang.String r2 = r8.f119662g
            java.util.concurrent.atomic.AtomicInteger r3 = r8.f119658c
            int r3 = r3.get()
            long r3 = (long) r3
            r1.mo115578a(r2, r3)
            if (r14 == 0) goto L_0x042e
            r14.get()     // Catch:{ InterruptedException | ExecutionException -> 0x042e }
        L_0x042e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C46554t.m146319d(com.toutiao.proxyserver.t$b, java.lang.String):void");
    }

    /* renamed from: a */
    private byte[] m146316a(C46461a aVar, C46560b bVar, String str) throws IOException {
        if (aVar != null) {
            C46470c.m146086b("TAG_PROXY_ProxyTask", "get header from db", this.f119662g);
            return C46476c.m146113a(aVar, bVar.f119993a).getBytes(C46476c.f119755a);
        }
        C46517e a = mo115554a(str, 0, -1, "HEAD");
        C46476c.m146118a(a, false, false);
        C46461a a2 = C46476c.m146111a(a, this.f119657b, this.f119663h, this.f119664i.f120000c.f120001a);
        C46470c.m146088c("TAG_PROXY_ProxyTask", "get header from network", this.f119662g);
        return C46476c.m146113a(a2, bVar.f119993a).getBytes(C46476c.f119755a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x030c A[SYNTHETIC, Splitter:B:104:0x030c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m146312a(com.toutiao.proxyserver.p1840b.C46461a r22, java.io.File r23, com.toutiao.proxyserver.C46554t.C46560b r24, java.lang.String r25) throws java.lang.Exception {
        /*
            r21 = this;
            r8 = r21
            r0 = r22
            r1 = r24
            r3 = r25
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "processCacheNetWorkConcurrent() called with: headerInfo = ["
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r5 = "], url = ["
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = "]"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = r8.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146084a(r2, r4, r5)
            boolean r2 = r1.f119994b
            r4 = 0
            if (r2 != 0) goto L_0x005c
            com.toutiao.proxyserver.c.b r2 = com.toutiao.proxyserver.C46534r.f119914u
            if (r2 == 0) goto L_0x0040
            com.toutiao.proxyserver.c.b r2 = com.toutiao.proxyserver.C46534r.f119914u
            java.lang.String r5 = "videocache_start_request"
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r9 = r8.f119662g
            r2.mo105058a(r5, r6, r9)
        L_0x0040:
            byte[] r2 = r8.m146316a(r0, r1, r3)
            r21.mo115567f()
            int r5 = r2.length
            r1.mo115741a(r2, r4, r5)
            com.toutiao.proxyserver.c.b r2 = com.toutiao.proxyserver.C46534r.f119914u
            if (r2 == 0) goto L_0x005c
            com.toutiao.proxyserver.c.b r2 = com.toutiao.proxyserver.C46534r.f119914u
            java.lang.String r5 = "videocache_write_header"
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r9 = r8.f119662g
            r2.mo105058a(r5, r6, r9)
        L_0x005c:
            if (r0 != 0) goto L_0x008e
            com.toutiao.proxyserver.b.c r0 = r8.f119657b
            java.lang.String r2 = r8.f119663h
            com.toutiao.proxyserver.v r5 = r8.f119664i
            com.toutiao.proxyserver.v$a r5 = r5.f120000c
            int r5 = r5.f120001a
            com.toutiao.proxyserver.b.a r0 = r0.mo115584a(r2, r5)
            if (r0 == 0) goto L_0x006f
            goto L_0x008e
        L_0x006f:
            java.lang.String r0 = r8.f119662g
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.String r2 = "failed to get video header info"
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r1, r2, r0)
            com.toutiao.proxyserver.RequestException r0 = new com.toutiao.proxyserver.RequestException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "failed to get video header info. key = "
            r1.<init>(r2)
            java.lang.String r2 = r8.f119662g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008e:
            int r0 = r0.f119727c
            long r5 = r23.length()
            long r9 = (long) r0
            r2 = 0
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0127
            java.lang.String r5 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[processCacheNetWorkConcurrent] need to download. ，rawKey："
            r6.<init>(r7)
            java.lang.String r7 = r8.f119662g
            r6.append(r7)
            java.lang.String r7 = "， key:"
            r6.append(r7)
            java.lang.String r7 = r8.f119663h
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r8.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146086b(r5, r6, r7)
            com.toutiao.proxyserver.h r5 = r8.f119974p
            if (r5 == 0) goto L_0x00ce
            boolean r6 = r5.mo115564c()
            if (r6 != 0) goto L_0x00ce
            boolean r5 = r5.mo115566e()
            if (r5 == 0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            r5 = r2
            goto L_0x0125
        L_0x00ce:
            r21.m146321l()
            com.toutiao.proxyserver.h$a r5 = new com.toutiao.proxyserver.h$a
            r5.<init>()
            com.toutiao.proxyserver.c r6 = r8.f119656a
            com.toutiao.proxyserver.h$a r5 = r5.mo115638a(r6)
            com.toutiao.proxyserver.b.c r6 = r8.f119657b
            com.toutiao.proxyserver.h$a r5 = r5.mo115637a(r6)
            java.lang.String r6 = r8.f119662g
            com.toutiao.proxyserver.h$a r5 = r5.mo115643a(r6)
            java.lang.String r6 = r8.f119663h
            com.toutiao.proxyserver.h$a r5 = r5.mo115647b(r6)
            com.toutiao.proxyserver.z r6 = new com.toutiao.proxyserver.z
            com.toutiao.proxyserver.z r7 = r8.f119665j
            java.util.List<java.lang.String> r7 = r7.f120015a
            r6.<init>(r7)
            com.toutiao.proxyserver.h$a r5 = r5.mo115642a(r6)
            java.util.List r6 = r8.f119660e
            com.toutiao.proxyserver.h$a r5 = r5.mo115644a(r6)
            com.toutiao.proxyserver.v r6 = r8.f119664i
            com.toutiao.proxyserver.h$a r5 = r5.mo115641a(r6)
            com.toutiao.proxyserver.t$2 r6 = new com.toutiao.proxyserver.t$2
            r6.<init>()
            com.toutiao.proxyserver.h$a r5 = r5.mo115639a(r6)
            com.toutiao.proxyserver.h r5 = r5.mo115646a()
            r8.f119974p = r5
            java.util.concurrent.ExecutorService r6 = r8.f119973o
            java.util.concurrent.Future r5 = r6.submit(r5)
            java.lang.String r6 = "TAG_PROXY_ProxyTask"
            java.lang.String r7 = "fire download in process cache task"
            java.lang.String r9 = r8.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r6, r7, r9)
        L_0x0125:
            r9 = r5
            goto L_0x0155
        L_0x0127:
            java.lang.String r5 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[processCacheNetWorkConcurrent] This video has been totally downloaded ，rawKey："
            r6.<init>(r7)
            java.lang.String r7 = r8.f119662g
            r6.append(r7)
            java.lang.String r7 = "， key:"
            r6.append(r7)
            java.lang.String r7 = r8.f119663h
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r8.f119662g
            com.toutiao.proxyserver.p1841c.C46470c.m146086b(r5, r6, r7)
            com.toutiao.proxyserver.n r5 = com.toutiao.proxyserver.C46534r.f119898e
            if (r5 == 0) goto L_0x0154
            com.toutiao.proxyserver.t$3 r5 = new com.toutiao.proxyserver.t$3
            r5.<init>(r0)
            com.toutiao.proxyserver.p1842d.C46476c.m146132b(r5)
        L_0x0154:
            r9 = r2
        L_0x0155:
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r5]
            com.toutiao.proxyserver.u r10 = new com.toutiao.proxyserver.u     // Catch:{ all -> 0x0300 }
            java.lang.String r6 = "r"
            r7 = r23
            r10.<init>(r7, r6)     // Catch:{ all -> 0x0300 }
            int r2 = r1.f119993a     // Catch:{ all -> 0x02fe }
            long r6 = (long) r2     // Catch:{ all -> 0x02fe }
            r10.mo115745a(r6)     // Catch:{ all -> 0x02fe }
            com.toutiao.proxyserver.v r2 = r8.f119664i     // Catch:{ all -> 0x02fe }
            com.toutiao.proxyserver.v$a r2 = r2.f120000c     // Catch:{ all -> 0x02fe }
            int r2 = r2.f120005e     // Catch:{ all -> 0x02fe }
            if (r2 <= 0) goto L_0x017a
            com.toutiao.proxyserver.v r2 = r8.f119664i     // Catch:{ all -> 0x02fe }
            com.toutiao.proxyserver.v$a r2 = r2.f120000c     // Catch:{ all -> 0x02fe }
            int r2 = r2.f120005e     // Catch:{ all -> 0x02fe }
            int r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x02fe }
        L_0x017a:
            r2 = r0
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fe }
            java.lang.String r7 = "read cache file start getCurrentOffset:"
            r6.<init>(r7)     // Catch:{ all -> 0x02fe }
            int r7 = r1.f119993a     // Catch:{ all -> 0x02fe }
            r6.append(r7)     // Catch:{ all -> 0x02fe }
            java.lang.String r7 = ", maxLen:"
            r6.append(r7)     // Catch:{ all -> 0x02fe }
            r6.append(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x02fe }
            com.toutiao.proxyserver.p1841c.C46470c.m146085b(r0, r6)     // Catch:{ all -> 0x02fe }
            r0 = 0
            r11 = 0
            r13 = 0
            r15 = 0
        L_0x019f:
            int r6 = r1.f119993a     // Catch:{ all -> 0x02fe }
            if (r6 >= r2) goto L_0x02ac
            r21.mo115567f()     // Catch:{ all -> 0x02fe }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02fe }
            int r4 = r10.mo115743a(r5)     // Catch:{ all -> 0x02fe }
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02fe }
            r19 = 0
            long r17 = r17 - r6
            long r11 = r11 + r17
            long r6 = (long) r4     // Catch:{ all -> 0x02fe }
            long r13 = r13 + r6
            if (r4 > 0) goto L_0x029d
            com.toutiao.proxyserver.h r4 = r8.f119974p     // Catch:{ all -> 0x02fe }
            if (r4 == 0) goto L_0x01c6
            java.lang.Exception r6 = r4.f119791n     // Catch:{ all -> 0x02fe }
            if (r6 != 0) goto L_0x01c5
            goto L_0x01c6
        L_0x01c5:
            throw r6     // Catch:{ all -> 0x02fe }
        L_0x01c6:
            if (r4 == 0) goto L_0x0266
            boolean r6 = r4.mo115564c()     // Catch:{ all -> 0x02fe }
            if (r6 != 0) goto L_0x0266
            boolean r6 = r4.mo115566e()     // Catch:{ all -> 0x02fe }
            if (r6 != 0) goto L_0x0266
            int r6 = r0 + 1
            r0 = 15
            if (r6 <= r0) goto L_0x0218
            r17 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e1
            goto L_0x0218
        L_0x01e1:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = "wait data too long!!!，rawKey："
            r1.<init>(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = r8.f119662g     // Catch:{ all -> 0x02fe }
            r1.append(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = "， key:"
            r1.append(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = r8.f119663h     // Catch:{ all -> 0x02fe }
            r1.append(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = r8.f119662g     // Catch:{ all -> 0x02fe }
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r0, r1, r2)     // Catch:{ all -> 0x02fe }
            com.toutiao.proxyserver.RequestException r0 = new com.toutiao.proxyserver.RequestException     // Catch:{ all -> 0x02fe }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = "wait data too long!!! key = "
            r1.<init>(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = r8.f119662g     // Catch:{ all -> 0x02fe }
            r1.append(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02fe }
            r0.<init>(r1)     // Catch:{ all -> 0x02fe }
            throw r0     // Catch:{ all -> 0x02fe }
        L_0x0218:
            r21.mo115567f()     // Catch:{ all -> 0x02fe }
            java.lang.Object r7 = r4.f119790m     // Catch:{ all -> 0x02fe }
            monitor-enter(r7)     // Catch:{ all -> 0x02fe }
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0263 }
            java.lang.Object r0 = r4.f119790m     // Catch:{ InterruptedException -> 0x0236 }
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.wait(r3)     // Catch:{ InterruptedException -> 0x0236 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0263 }
            r0 = 0
            long r3 = r3 - r17
            long r15 = r15 + r3
            r20 = r6
            goto L_0x025a
        L_0x0234:
            r0 = move-exception
            goto L_0x025f
        L_0x0236:
            r0 = move-exception
            java.lang.String r3 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0234 }
            r20 = r6
            java.lang.String r6 = "InterruptedException: "
            r4.<init>(r6)     // Catch:{ all -> 0x0234 }
            java.lang.String r0 = com.toutiao.proxyserver.p1841c.C46470c.m146081a(r0)     // Catch:{ all -> 0x0234 }
            r4.append(r0)     // Catch:{ all -> 0x0234 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0234 }
            java.lang.String r4 = r8.f119662g     // Catch:{ all -> 0x0234 }
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r3, r0, r4)     // Catch:{ all -> 0x0234 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0263 }
            r0 = 0
            long r3 = r3 - r17
            long r15 = r15 + r3
        L_0x025a:
            monitor-exit(r7)     // Catch:{ all -> 0x0263 }
            r0 = r20
            r3 = 0
            goto L_0x02a4
        L_0x025f:
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0263 }
            throw r0     // Catch:{ all -> 0x0263 }
        L_0x0263:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0263 }
            throw r0     // Catch:{ all -> 0x02fe }
        L_0x0266:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = "download task has finished!!!，rawKey："
            r1.<init>(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = r8.f119662g     // Catch:{ all -> 0x02fe }
            r1.append(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = "， key:"
            r1.append(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = r8.f119663h     // Catch:{ all -> 0x02fe }
            r1.append(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = r8.f119662g     // Catch:{ all -> 0x02fe }
            com.toutiao.proxyserver.p1841c.C46470c.m146090d(r0, r1, r2)     // Catch:{ all -> 0x02fe }
            com.toutiao.proxyserver.RequestException r0 = new com.toutiao.proxyserver.RequestException     // Catch:{ all -> 0x02fe }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = "download task has finished!!! key = "
            r1.<init>(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = r8.f119662g     // Catch:{ all -> 0x02fe }
            r1.append(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02fe }
            r0.<init>(r1)     // Catch:{ all -> 0x02fe }
            throw r0     // Catch:{ all -> 0x02fe }
        L_0x029d:
            r3 = 0
            r1.mo115742b(r5, r3, r4)     // Catch:{ all -> 0x02fe }
            r0 = 0
            r15 = 0
        L_0x02a4:
            r21.mo115567f()     // Catch:{ all -> 0x02fe }
            r3 = r25
            r4 = 0
            goto L_0x019f
        L_0x02ac:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fe }
            java.lang.String r4 = "read cache file complete: "
            r3.<init>(r4)     // Catch:{ all -> 0x02fe }
            int r1 = r1.f119993a     // Catch:{ all -> 0x02fe }
            r3.append(r1)     // Catch:{ all -> 0x02fe }
            java.lang.String r1 = ", "
            r3.append(r1)     // Catch:{ all -> 0x02fe }
            r3.append(r2)     // Catch:{ all -> 0x02fe }
            java.lang.String r1 = "，rawKey："
            r3.append(r1)     // Catch:{ all -> 0x02fe }
            java.lang.String r1 = r8.f119662g     // Catch:{ all -> 0x02fe }
            r3.append(r1)     // Catch:{ all -> 0x02fe }
            java.lang.String r1 = "， key:"
            r3.append(r1)     // Catch:{ all -> 0x02fe }
            java.lang.String r1 = r8.f119663h     // Catch:{ all -> 0x02fe }
            r3.append(r1)     // Catch:{ all -> 0x02fe }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x02fe }
            java.lang.String r2 = r8.f119662g     // Catch:{ all -> 0x02fe }
            com.toutiao.proxyserver.p1841c.C46470c.m146086b(r0, r1, r2)     // Catch:{ all -> 0x02fe }
            com.toutiao.proxyserver.m r0 = com.toutiao.proxyserver.C46534r.f119899f     // Catch:{ all -> 0x02fe }
            if (r0 == 0) goto L_0x02ee
            java.lang.String r2 = r8.f119662g     // Catch:{ all -> 0x02fe }
            r1 = r21
            r3 = r25
            r4 = r13
            r6 = r11
            r1.mo115559a(r2, r3, r4, r6)     // Catch:{ all -> 0x02fe }
        L_0x02ee:
            r21.mo115565d()     // Catch:{ all -> 0x02fe }
            r10.mo115744a()
            r21.m146322m()
            if (r9 == 0) goto L_0x02fd
            r9.get()     // Catch:{ Throwable -> 0x02fc }
        L_0x02fc:
            return
        L_0x02fd:
            return
        L_0x02fe:
            r0 = move-exception
            goto L_0x0302
        L_0x0300:
            r0 = move-exception
            r10 = r2
        L_0x0302:
            if (r10 == 0) goto L_0x0307
            r10.mo115744a()
        L_0x0307:
            r21.m146322m()
            if (r9 == 0) goto L_0x030f
            r9.get()     // Catch:{ Throwable -> 0x030f }
        L_0x030f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C46554t.m146312a(com.toutiao.proxyserver.b.a, java.io.File, com.toutiao.proxyserver.t$b, java.lang.String):void");
    }

    /* renamed from: a */
    private void m146314a(boolean z, int i, int i2, int i3, int i4) {
        final C46506n nVar = C46534r.f119898e;
        if (nVar != null) {
            final boolean z2 = z;
            final int i5 = i;
            final int i6 = i2;
            final int i7 = i3;
            final int i8 = i4;
            C465551 r0 = new Runnable() {
                public final void run() {
                    C46564v vVar = C46554t.this.f119664i;
                    C46564v vVar2 = C46554t.this.f119664i;
                }
            };
            C46476c.m146132b((Runnable) r0);
        }
    }
}
