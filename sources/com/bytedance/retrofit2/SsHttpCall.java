package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p638c.C12471b;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.Executor;

public class SsHttpCall<T> implements C12466b<T>, C12489l, C12490m {
    public static C12448a sThrottleControl;
    private long appCallTime;
    public final Object[] args;
    private final CallServerInterceptor callServerInterceptor;
    public boolean isInDelayTimeRange;
    public C12462c originalRequest;
    public Throwable preBuildURLException;
    public final C12532s<T> serviceMethod;

    /* renamed from: com.bytedance.retrofit2.SsHttpCall$a */
    public interface C12448a {
        /* renamed from: e */
        boolean mo30433e(String str);

        /* renamed from: f */
        boolean mo30434f();

        /* renamed from: g */
        int mo30435g();
    }

    public C12520r getRetrofitMetrics() {
        return this.serviceMethod.f33257m;
    }

    public void cancel() {
        if (this.callServerInterceptor != null) {
            this.callServerInterceptor.mo30403c();
        }
    }

    public SsHttpCall<T> clone() {
        return new SsHttpCall<>(this.serviceMethod, this.args);
    }

    public void doCollect() {
        if (this.callServerInterceptor != null) {
            this.callServerInterceptor.doCollect();
        }
    }

    public Object getRequestInfo() {
        if (this.callServerInterceptor != null) {
            return this.callServerInterceptor.getRequestInfo();
        }
        return null;
    }

    public boolean isCanceled() {
        if (this.callServerInterceptor == null || !this.callServerInterceptor.f33055b) {
            return false;
        }
        return true;
    }

    public synchronized boolean isExecuted() {
        boolean z;
        if (this.callServerInterceptor == null || !this.callServerInterceptor.mo30400a()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public C12534t getResponseWithInterceptorChain() throws Exception {
        C12520r rVar = this.serviceMethod.f33257m;
        rVar.f33211g = SystemClock.uptimeMillis();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.serviceMethod.f33249e);
        linkedList.add(this.callServerInterceptor);
        rVar.f33205a = this.appCallTime;
        rVar.f33206b = System.currentTimeMillis();
        C12471b bVar = new C12471b(linkedList, 0, this.originalRequest, this, rVar);
        C12534t a = bVar.mo30457a(this.originalRequest);
        a.f33304d = rVar;
        return a;
    }

    public C12462c request() {
        if (this.callServerInterceptor != null) {
            C12462c cVar = this.callServerInterceptor.f33054a;
            if (cVar != null) {
                return cVar;
            }
        }
        if (this.originalRequest == null) {
            try {
                C12520r rVar = this.serviceMethod.f33257m;
                rVar.f33217m = SystemClock.uptimeMillis();
                this.originalRequest = this.serviceMethod.mo30507a(null, this.args);
                rVar.f33218n = SystemClock.uptimeMillis();
            } catch (RuntimeException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Unable to create request.", e2);
            }
        }
        return this.originalRequest;
    }

    public C12534t<T> execute() throws Exception {
        C12520r rVar = this.serviceMethod.f33257m;
        rVar.f33210f = SystemClock.uptimeMillis();
        this.appCallTime = System.currentTimeMillis();
        rVar.f33217m = SystemClock.uptimeMillis();
        this.originalRequest = this.serviceMethod.mo30507a(null, this.args);
        rVar.f33218n = SystemClock.uptimeMillis();
        if (sThrottleControl != null && sThrottleControl.mo30434f() && sThrottleControl.mo30433e(this.originalRequest.mo30444b())) {
            Thread.sleep((long) sThrottleControl.mo30435g());
        }
        return getResponseWithInterceptorChain();
    }

    public static void setThrottleControl(C12448a aVar) {
        sThrottleControl = aVar;
    }

    public T toResponseBody(TypedInput typedInput) throws IOException {
        return this.serviceMethod.mo30508a(typedInput);
    }

    public void enqueue(final C12474e<T> eVar) {
        final C12488k kVar;
        final C12520r rVar = this.serviceMethod.f33257m;
        rVar.f33209e = SystemClock.uptimeMillis();
        this.appCallTime = System.currentTimeMillis();
        if (eVar == null) {
            throw new NullPointerException("callback == null");
        } else if (this.callServerInterceptor == null || !this.callServerInterceptor.mo30400a()) {
            final Executor executor = this.serviceMethod.f33250f;
            if (eVar instanceof C12488k) {
                kVar = (C12488k) eVar;
            } else {
                kVar = null;
            }
            final C124461 r3 = new C12535u() {
                /* renamed from: a */
                public final int mo30428a() {
                    return SsHttpCall.this.serviceMethod.f33251g;
                }

                /* renamed from: b */
                public final boolean mo30429b() {
                    return SsHttpCall.this.serviceMethod.f33253i;
                }

                /* renamed from: c */
                public final int mo30430c() {
                    if (SsHttpCall.sThrottleControl == null || !SsHttpCall.this.isInDelayTimeRange || !SsHttpCall.sThrottleControl.mo30433e(SsHttpCall.this.originalRequest.mo30444b())) {
                        return 0;
                    }
                    return SsHttpCall.sThrottleControl.mo30435g();
                }

                public final void run() {
                    try {
                        if (SsHttpCall.this.preBuildURLException == null) {
                            if (SsHttpCall.this.originalRequest == null) {
                                rVar.f33217m = SystemClock.uptimeMillis();
                                SsHttpCall.this.originalRequest = SsHttpCall.this.serviceMethod.mo30507a(kVar, SsHttpCall.this.args);
                                rVar.f33218n = SystemClock.uptimeMillis();
                            }
                            m36230a(SsHttpCall.this.getResponseWithInterceptorChain());
                            return;
                        }
                        throw SsHttpCall.this.preBuildURLException;
                    } catch (Throwable th) {
                        m36231a(th);
                    }
                }

                /* renamed from: a */
                private void m36231a(Throwable th) {
                    try {
                        eVar.mo26464a((C12466b<T>) SsHttpCall.this, th);
                    } catch (Throwable unused) {
                    }
                }

                /* renamed from: a */
                private void m36230a(C12534t<T> tVar) {
                    try {
                        eVar.mo26463a((C12466b<T>) SsHttpCall.this, tVar);
                        if (kVar != null) {
                            kVar.mo30461b(SsHttpCall.this, tVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            };
            if (sThrottleControl == null || !sThrottleControl.mo30434f()) {
                executor.execute(r3);
            } else {
                executor.execute(new C12535u() {
                    /* renamed from: c */
                    public final int mo30430c() {
                        return 0;
                    }

                    /* renamed from: a */
                    public final int mo30428a() {
                        return SsHttpCall.this.serviceMethod.f33251g;
                    }

                    /* renamed from: b */
                    public final boolean mo30429b() {
                        return SsHttpCall.this.serviceMethod.f33253i;
                    }

                    public final void run() {
                        try {
                            if (SsHttpCall.this.originalRequest == null) {
                                C12520r rVar = SsHttpCall.this.serviceMethod.f33257m;
                                rVar.f33217m = SystemClock.uptimeMillis();
                                SsHttpCall.this.originalRequest = SsHttpCall.this.serviceMethod.mo30507a(kVar, SsHttpCall.this.args);
                                rVar.f33218n = SystemClock.uptimeMillis();
                            }
                            SsHttpCall.this.isInDelayTimeRange = true;
                        } catch (Throwable th) {
                            SsHttpCall.this.preBuildURLException = th;
                        }
                        executor.execute(r3);
                    }
                });
            }
        } else {
            throw new IllegalStateException("Already executed.");
        }
    }

    SsHttpCall(C12532s<T> sVar, Object[] objArr) {
        this.serviceMethod = sVar;
        this.args = objArr;
        this.callServerInterceptor = new CallServerInterceptor(sVar);
    }
}
