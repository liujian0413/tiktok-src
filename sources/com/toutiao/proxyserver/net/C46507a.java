package com.toutiao.proxyserver.net;

import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12489l;
import com.bytedance.retrofit2.C12490m;
import com.bytedance.retrofit2.C12534t;
import com.toutiao.proxyserver.C46500j;
import com.toutiao.proxyserver.p1839a.C46455c;
import com.toutiao.proxyserver.p1841c.C46470c;
import com.toutiao.proxyserver.p1842d.C46476c;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* renamed from: com.toutiao.proxyserver.net.a */
public final class C46507a {

    /* renamed from: a */
    private final C12466b<?> f119821a;

    /* renamed from: b */
    private final Call f119822b;

    /* renamed from: c */
    private final C46514d f119823c;

    /* renamed from: d */
    private C46517e f119824d;

    /* renamed from: e */
    private long f119825e;

    /* renamed from: f */
    private long f119826f;

    /* renamed from: g */
    private boolean f119827g;

    /* renamed from: b */
    public final void mo115656b() {
        if (this.f119821a != null) {
            this.f119821a.cancel();
            return;
        }
        if (this.f119822b != null) {
            this.f119822b.cancel();
        }
    }

    /* renamed from: a */
    public final C46517e mo115654a() throws IOException {
        if (this.f119821a != null) {
            this.f119825e = System.currentTimeMillis();
            try {
                C12534t execute = this.f119821a.execute();
                this.f119826f = System.currentTimeMillis();
                C46517e eVar = new C46517e(execute, this.f119823c);
                this.f119824d = eVar;
                return eVar;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else if (this.f119822b == null) {
            return null;
        } else {
            try {
                this.f119825e = System.currentTimeMillis();
                Response execute2 = this.f119822b.execute();
                this.f119826f = System.currentTimeMillis();
                C46517e eVar2 = new C46517e(execute2, this.f119823c);
                this.f119824d = eVar2;
                return eVar2;
            } catch (Exception e3) {
                if (!"Canceled".equalsIgnoreCase(e3.getMessage())) {
                    m146197a(e3);
                }
                throw e3;
            }
        }
    }

    /* renamed from: a */
    private void m146197a(Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        C46518f fVar = new C46518f();
        fVar.f27502e = this.f119825e;
        fVar.f27505h = currentTimeMillis;
        C10142f.m30102a(currentTimeMillis - this.f119825e, this.f119825e, this.f119823c.f119835a, "", fVar, th);
        StringBuilder sb = new StringBuilder("api_error, from okhttp connect: , netInfo: ");
        sb.append(fVar);
        sb.append(", url: ");
        sb.append(this.f119823c.f119835a);
        sb.append(", error: ");
        sb.append(th.getMessage());
        C46470c.m146089d("HttpCall", sb.toString());
    }

    C46507a(C12466b<?> bVar, C46514d dVar) {
        this.f119821a = bVar;
        this.f119823c = dVar;
    }

    C46507a(Call call, C46514d dVar) {
        this.f119822b = call;
        this.f119823c = dVar;
    }

    /* renamed from: a */
    public final void mo115655a(Throwable th, String str, int i) {
        if (!this.f119827g) {
            this.f119827g = true;
            try {
                if (this.f119824d != null) {
                    if (this.f119824d.f119850d != null) {
                        m146199c(th, str, i);
                    }
                    if (this.f119824d.f119851e != null) {
                        m146198b(th, str, i);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private void m146198b(Throwable th, String str, int i) {
        C46455c a = C46500j.m146183a().mo115650a(this.f119823c.f119835a);
        long currentTimeMillis = System.currentTimeMillis();
        C46518f fVar = new C46518f();
        fVar.f27502e = this.f119825e;
        fVar.f27503f = this.f119826f;
        fVar.f27505h = currentTimeMillis;
        fVar.f119855E = i;
        if (a != null) {
            fVar.f27498a = a.f119711g;
        }
        if (th == null) {
            C10142f.m30101a(currentTimeMillis - this.f119825e, this.f119825e, this.f119823c.f119835a, this.f119824d.mo115669a("X-TT-LOGID", ""), fVar);
        } else {
            C10142f.m30102a(currentTimeMillis - this.f119825e, this.f119825e, this.f119823c.f119835a, this.f119824d.mo115669a("X-TT-LOGID", ""), fVar, th);
        }
    }

    /* renamed from: c */
    private void m146199c(Throwable th, String str, int i) {
        C46518f fVar;
        C46518f fVar2;
        Throwable th2 = th;
        String str2 = str;
        int i2 = i;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f119821a instanceof C12489l) {
            ((C12489l) this.f119821a).doCollect();
        }
        Object obj = this.f119824d.f119850d.f33301a.f33123f;
        if (obj instanceof C46518f) {
            fVar = (C46518f) obj;
            fVar.f27502e = this.f119825e;
            fVar.f27503f = this.f119826f;
            fVar.f27505h = currentTimeMillis;
            fVar.f119855E = i2;
        } else {
            fVar = null;
        }
        if (th2 == null) {
            C10142f.m30101a(currentTimeMillis - this.f119825e, this.f119825e, this.f119823c.f119835a, this.f119824d.mo115669a("X-TT-LOGID", ""), fVar);
            StringBuilder sb = new StringBuilder("api_succeed, from: ");
            sb.append(str2);
            sb.append(", cost: ");
            sb.append(currentTimeMillis - this.f119825e);
            sb.append(", netInfo: ");
            sb.append(fVar);
            sb.append(", url: ");
            sb.append(this.f119823c.f119835a);
            C46470c.m146085b("HttpCall", sb.toString());
            return;
        }
        if (fVar == null && (this.f119821a instanceof C12490m)) {
            Object requestInfo = ((C12490m) this.f119821a).getRequestInfo();
            if (requestInfo instanceof C46518f) {
                C46518f fVar3 = (C46518f) requestInfo;
                fVar3.f27502e = this.f119825e;
                fVar3.f27503f = this.f119826f;
                fVar3.f27505h = currentTimeMillis;
                fVar3.f119855E = i2;
                fVar2 = fVar3;
                if (!(fVar2 == null || fVar2.f27522y == null)) {
                    C46476c.m146126a(fVar2.f27522y, "ex", (Object) th.getMessage());
                }
                if (fVar2 != null && (th2 instanceof CronetIOException)) {
                    fVar2.f27521x = ((CronetIOException) th2).getRequestLog();
                }
                C10142f.m30102a(currentTimeMillis - this.f119825e, this.f119825e, this.f119823c.f119835a, this.f119824d.mo115669a("X-TT-LOGID", ""), fVar2, th);
                StringBuilder sb2 = new StringBuilder("api_error, from: ");
                sb2.append(str2);
                sb2.append(", cost: ");
                sb2.append(currentTimeMillis - this.f119825e);
                sb2.append(", netInfo: ");
                sb2.append(fVar2);
                sb2.append(", url: ");
                sb2.append(this.f119823c.f119835a);
                sb2.append(", error: ");
                sb2.append(th.getMessage());
                C46470c.m146089d("HttpCall", sb2.toString());
            }
        }
        fVar2 = fVar;
        C46476c.m146126a(fVar2.f27522y, "ex", (Object) th.getMessage());
        fVar2.f27521x = ((CronetIOException) th2).getRequestLog();
        C10142f.m30102a(currentTimeMillis - this.f119825e, this.f119825e, this.f119823c.f119835a, this.f119824d.mo115669a("X-TT-LOGID", ""), fVar2, th);
        StringBuilder sb22 = new StringBuilder("api_error, from: ");
        sb22.append(str2);
        sb22.append(", cost: ");
        sb22.append(currentTimeMillis - this.f119825e);
        sb22.append(", netInfo: ");
        sb22.append(fVar2);
        sb22.append(", url: ");
        sb22.append(this.f119823c.f119835a);
        sb22.append(", error: ");
        sb22.append(th.getMessage());
        C46470c.m146089d("HttpCall", sb22.toString());
    }
}
