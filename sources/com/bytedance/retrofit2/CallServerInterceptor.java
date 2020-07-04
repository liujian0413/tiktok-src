package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12464d;
import com.bytedance.retrofit2.p637a.C12465e;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import java.io.IOException;

public class CallServerInterceptor<T> implements C12469a, C12489l, C12490m {

    /* renamed from: a */
    public C12462c f33054a;

    /* renamed from: b */
    public volatile boolean f33055b;

    /* renamed from: c */
    private final C12532s<T> f33056c;

    /* renamed from: d */
    private volatile C12465e f33057d;

    /* renamed from: e */
    private Throwable f33058e;

    /* renamed from: f */
    private volatile boolean f33059f;

    /* renamed from: b */
    private C12464d m36212b(C12465e eVar, C12520r rVar) throws IOException {
        return C12473d.m36294a(this, eVar, rVar);
    }

    /* renamed from: b */
    private C12534t m36213b(C12464d dVar, C12520r rVar) throws IOException {
        return C12473d.m36295a(this, dVar, rVar);
    }

    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C12473d.m36296a(this, aVar);
    }

    /* renamed from: c */
    public final void mo30403c() {
        this.f33055b = true;
        if (this.f33057d != null) {
            this.f33057d.mo10451b();
        }
    }

    public void doCollect() {
        if (this.f33057d instanceof C12489l) {
            ((C12489l) this.f33057d).doCollect();
        }
    }

    public Object getRequestInfo() {
        if (this.f33057d instanceof C12490m) {
            ((C12490m) this.f33057d).getRequestInfo();
        }
        return null;
    }

    /* renamed from: b */
    public final synchronized void mo30402b() {
        this.f33059f = false;
    }

    /* renamed from: a */
    public final synchronized boolean mo30400a() {
        return this.f33059f;
    }

    public CallServerInterceptor(C12532s<T> sVar) {
        this.f33056c = sVar;
    }

    /* renamed from: b */
    public final C12534t mo30401b(C12470a aVar) throws Exception {
        C12520r b = aVar.mo30458b();
        if (b != null) {
            b.f33212h = SystemClock.uptimeMillis();
            b.f33219o.put("CallServerInterceptor", Long.valueOf(aVar.mo30458b().f33212h));
        }
        this.f33054a = aVar.mo30456a();
        synchronized (this) {
            if (!this.f33059f) {
                this.f33059f = true;
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f33058e == null) {
            try {
                this.f33054a.f33107k = b;
                this.f33057d = m36211a((C12488k) null, this.f33054a);
                if (this.f33055b) {
                    this.f33057d.mo10451b();
                }
                return m36213b(m36212b(this.f33057d, b), b);
            } catch (IOException | RuntimeException e) {
                this.f33058e = e;
                throw e;
            } catch (Throwable th) {
                this.f33058e = th;
                if (th instanceof Exception) {
                    throw ((Exception) th);
                }
                throw new Exception(th);
            }
        } else if (this.f33058e instanceof IOException) {
            throw ((IOException) this.f33058e);
        } else {
            throw new Exception(this.f33058e);
        }
    }

    /* renamed from: a */
    private C12465e m36211a(C12488k kVar, C12462c cVar) throws IOException {
        return this.f33056c.f33247c.mo10453a().mo10452a(cVar);
    }

    /* renamed from: a */
    public static C12464d m36210a(C12465e eVar, C12520r rVar) throws IOException {
        if (rVar != null) {
            rVar.f33213i = SystemClock.uptimeMillis();
        }
        C12464d a = eVar.mo10450a();
        if (rVar != null) {
            rVar.f33214j = SystemClock.uptimeMillis();
        }
        return a;
    }

    /* renamed from: a */
    public final C12534t<T> mo30399a(C12464d dVar, C12520r rVar) throws IOException {
        if (dVar != null) {
            TypedInput typedInput = dVar.f33122e;
            int i = dVar.f33119b;
            if (i < 200 || i >= 300) {
                return C12534t.m36419a(typedInput, dVar);
            }
            if (i == 204 || i == 205) {
                return C12534t.m36420a(null, dVar);
            }
            if (rVar != null) {
                try {
                    rVar.f33215k = SystemClock.uptimeMillis();
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            Object a = this.f33056c.mo30508a(typedInput);
            if (rVar != null) {
                rVar.f33216l = SystemClock.uptimeMillis();
            }
            return C12534t.m36420a(a, dVar);
        }
        throw new IOException("SsResponse is null");
    }
}
