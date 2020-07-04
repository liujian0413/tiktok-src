package com.bytedance.ies.web.jsbridge2;

/* renamed from: com.bytedance.ies.web.jsbridge2.c */
public abstract class C11152c<P, R> extends C11150a<P, R> {
    public CallContext callContext;
    private C11153a callback;
    private boolean isValid = true;

    /* renamed from: com.bytedance.ies.web.jsbridge2.c$a */
    interface C11153a {
        /* renamed from: a */
        void mo27162a(Object obj);

        /* renamed from: a */
        void mo27163a(Throwable th);
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.c$b */
    public interface C11154b {
        /* renamed from: a */
        C11152c mo11646a();
    }

    /* access modifiers changed from: protected */
    public abstract void invoke(P p, CallContext callContext2) throws Exception;

    /* access modifiers changed from: protected */
    public abstract void onTerminate();

    public final void finishWithFailure() {
        finishWithFailure(null);
    }

    public final void finishWithSuccess() {
        finishWithResult(null);
    }

    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.isValid = false;
        this.callContext = null;
    }

    /* access modifiers changed from: 0000 */
    public void terminateActual() {
        onTerminate();
        onDestroy();
    }

    private boolean checkInvalid() {
        if (this.isValid) {
            return true;
        }
        StringBuilder sb = new StringBuilder("Jsb async call already finished: ");
        sb.append(getName());
        sb.append(", hashcode: ");
        sb.append(hashCode());
        C11165i.m32683a((RuntimeException) new IllegalStateException(sb.toString()));
        return false;
    }

    public final void finishWithFailure(Throwable th) {
        if (checkInvalid()) {
            this.callback.mo27163a(th);
            onDestroy();
        }
    }

    public final void finishWithResult(R r) {
        if (checkInvalid()) {
            this.callback.mo27162a((Object) r);
            onDestroy();
        }
    }

    /* access modifiers changed from: 0000 */
    public void invokeActual(P p, CallContext callContext2, C11153a aVar) throws Exception {
        this.callContext = callContext2;
        this.callback = aVar;
        invoke(p, callContext2);
    }
}
