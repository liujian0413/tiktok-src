package com.p280ss.android.ugc.aweme.awemeservice.p1047b;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p601c.C11783b;
import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p601c.C11786e;
import com.bytedance.jedi.model.repository.C11994b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.b.b */
public final class C23135b extends C11994b {

    /* renamed from: a */
    public static final C23135b f61065a = new C23135b();

    /* renamed from: b */
    private static C23134a f61066b;

    /* renamed from: c */
    private static final C11785d<String, Aweme> f61067c;

    private C23135b() {
    }

    /* renamed from: b */
    public static C7492s<List<Pair<String, Aweme>>> m76054b() {
        return f61067c.mo29343a(true, (C11785d<?, ?>[]) new C11785d[0]);
    }

    static {
        C23134a aVar = C23134a.f61064a;
        f61066b = aVar;
        f61067c = C11783b.m34514a((C11750c<K, V>) aVar);
    }

    /* renamed from: a */
    public static C7492s<C11786e<Aweme>> m76052a(String str) {
        C7573i.m23587b(str, "aid");
        return f61067c.mo29342a(str, (C11785d<?, ?>[]) new C11785d[0]);
    }

    /* renamed from: a */
    public static void m76053a(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        C23134a aVar = f61066b;
        String aid = aweme.getAid();
        C7573i.m23582a((Object) aid, "aweme.aid");
        aVar.mo29326a(aid, aweme);
    }
}
