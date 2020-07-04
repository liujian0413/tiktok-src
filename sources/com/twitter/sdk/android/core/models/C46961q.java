package com.twitter.sdk.android.core.models;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.models.q */
public final class C46961q {

    /* renamed from: a */
    static final C46961q f120487a;
    @C6593c(mo15949a = "urls")

    /* renamed from: b */
    public final List<UrlEntity> f120488b;
    @C6593c(mo15949a = "user_mentions")

    /* renamed from: c */
    public final List<MentionEntity> f120489c;
    @C6593c(mo15949a = "media")

    /* renamed from: d */
    public final List<MediaEntity> f120490d;
    @C6593c(mo15949a = "hashtags")

    /* renamed from: e */
    public final List<HashtagEntity> f120491e;
    @C6593c(mo15949a = "symbols")

    /* renamed from: f */
    public final List<SymbolEntity> f120492f;

    static {
        C46961q qVar = new C46961q(null, null, null, null, null);
        f120487a = qVar;
    }

    private C46961q() {
        this(null, null, null, null, null);
    }

    private C46961q(List<UrlEntity> list, List<MentionEntity> list2, List<MediaEntity> list3, List<HashtagEntity> list4, List<SymbolEntity> list5) {
        this.f120488b = C46954k.m146830a(null);
        this.f120489c = C46954k.m146830a(null);
        this.f120490d = C46954k.m146830a(null);
        this.f120491e = C46954k.m146830a(null);
        this.f120492f = C46954k.m146830a(null);
    }
}
