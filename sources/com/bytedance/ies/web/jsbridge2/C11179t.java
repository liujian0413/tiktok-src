package com.bytedance.ies.web.jsbridge2;

/* renamed from: com.bytedance.ies.web.jsbridge2.t */
final class C11179t {

    /* renamed from: a */
    private String f30334a;

    /* renamed from: b */
    private C11180a f30335b;

    /* renamed from: c */
    private boolean f30336c = true;

    /* renamed from: com.bytedance.ies.web.jsbridge2.t$a */
    interface C11180a {
        /* renamed from: a */
        void mo27180a(String str);
    }

    /* renamed from: a */
    private void m32733a() {
        if (!this.f30336c) {
            StringBuilder sb = new StringBuilder("Jsb async call already finished: ");
            sb.append(this.f30334a);
            sb.append(", stub: ");
            sb.append(hashCode());
            C11165i.m32683a((RuntimeException) new IllegalStateException(sb.toString()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27216a(String str) {
        m32733a();
        StringBuilder sb = new StringBuilder("Jsb async call about to finish with response: ");
        sb.append(this.f30334a);
        sb.append(", stub: ");
        sb.append(hashCode());
        this.f30335b.mo27180a(str);
        this.f30336c = false;
    }

    C11179t(String str, C11180a aVar) {
        this.f30334a = str;
        this.f30335b = aVar;
    }
}
