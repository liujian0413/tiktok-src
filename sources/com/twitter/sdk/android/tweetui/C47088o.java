package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.internal.scribe.C46908e;
import com.twitter.sdk.android.core.internal.scribe.C46908e.C46909a;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import java.util.ArrayList;

/* renamed from: com.twitter.sdk.android.tweetui.o */
public final class C47088o implements C47087n {

    /* renamed from: a */
    final C47029aq f120836a;

    /* renamed from: a */
    public final void mo118355a() {
        this.f120836a.mo118235a(m147214d());
    }

    /* renamed from: b */
    public final void mo118357b() {
        this.f120836a.mo118235a(m147215e());
    }

    public final void dismiss() {
        this.f120836a.mo118235a(m147216f());
    }

    /* renamed from: c */
    private static C46908e m147213c() {
        return new C46909a().mo118034a("tfw").mo118036b("android").mo118037c("gallery").mo118040f("impression").mo118035a();
    }

    /* renamed from: d */
    private static C46908e m147214d() {
        return new C46909a().mo118034a("tfw").mo118036b("android").mo118037c("gallery").mo118040f("show").mo118035a();
    }

    /* renamed from: e */
    private static C46908e m147215e() {
        return new C46909a().mo118034a("tfw").mo118036b("android").mo118037c("gallery").mo118040f("navigate").mo118035a();
    }

    /* renamed from: f */
    private static C46908e m147216f() {
        return new C46909a().mo118034a("tfw").mo118036b("android").mo118037c("gallery").mo118040f("dismiss").mo118035a();
    }

    public C47088o(C47029aq aqVar) {
        this.f120836a = aqVar;
    }

    /* renamed from: a */
    public final void mo118356a(ScribeItem scribeItem) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(scribeItem);
        this.f120836a.mo118234a(m147213c(), arrayList);
    }
}
