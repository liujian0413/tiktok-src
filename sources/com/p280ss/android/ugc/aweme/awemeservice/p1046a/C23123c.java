package com.p280ss.android.ugc.aweme.awemeservice.p1046a;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.c */
public final class C23123c implements C23122b<String> {

    /* renamed from: a */
    private Map<String, Aweme> f61041a = new HashMap();

    /* renamed from: b */
    public final void mo60235b() {
        this.f61041a.clear();
    }

    /* renamed from: a */
    public final Collection<Aweme> mo60233a() {
        return this.f61041a.values();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean mo60236b(String str) {
        return this.f61041a.containsKey(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Aweme mo60232a(String str) {
        return (Aweme) this.f61041a.get(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo60234a(String str, Aweme aweme) {
        this.f61041a.put(str, aweme);
    }
}
