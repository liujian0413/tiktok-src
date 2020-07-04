package com.p280ss.android.ugc.aweme.feed.p1231g;

import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.utils.C42937ar;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.g.b */
public final class C28356b {

    /* renamed from: a */
    public static final C28357a f74709a = new C28357a(null);

    /* renamed from: b */
    private final Keva f74710b;

    /* renamed from: c */
    private long f74711c = this.f74710b.getLong("today_timeStamp", Long.MIN_VALUE);

    /* renamed from: d */
    private final Set<String> f74712d;

    /* renamed from: e */
    private final Set<String> f74713e;

    /* renamed from: com.ss.android.ugc.aweme.feed.g.b$a */
    public static final class C28357a {
        private C28357a() {
        }

        public /* synthetic */ C28357a(C7571f fVar) {
            this();
        }
    }

    public C28356b() {
        Keva repo = Keva.getRepo("recommend_history_keva");
        C7573i.m23582a((Object) repo, "Keva.getRepo(REPO_NAME)");
        this.f74710b = repo;
        Set<String> stringSet = this.f74710b.getStringSet("today_set", new LinkedHashSet());
        C7573i.m23582a((Object) stringSet, "keva.getStringSet(TODAY_…, mutableSetOf<String>())");
        this.f74712d = stringSet;
        Set<String> stringSet2 = this.f74710b.getStringSet("yesterday_set", new LinkedHashSet());
        C7573i.m23582a((Object) stringSet2, "keva.getStringSet(YESTER…, mutableSetOf<String>())");
        this.f74713e = stringSet2;
    }

    /* renamed from: a */
    public final void mo72025a() {
        if (this.f74711c == Long.MIN_VALUE || this.f74712d.isEmpty()) {
            this.f74711c = System.currentTimeMillis();
            this.f74710b.storeLong("today_timeStamp", this.f74711c);
        }
        if (!C42937ar.m136295a(this.f74711c)) {
            if (C42937ar.m136298c(this.f74711c)) {
                this.f74711c = System.currentTimeMillis();
                this.f74713e.clear();
                this.f74713e.addAll(this.f74712d);
                this.f74712d.clear();
                this.f74710b.storeLong("today_timeStamp", this.f74711c);
                this.f74710b.storeStringSet("yesterday_set", this.f74713e);
                return;
            }
            this.f74711c = System.currentTimeMillis();
            this.f74713e.clear();
            this.f74712d.clear();
            this.f74710b.storeLong("today_timeStamp", this.f74711c);
            this.f74710b.storeStringSet("yesterday_set", this.f74713e);
        }
    }

    /* renamed from: a */
    public final boolean mo72026a(String str) {
        C7573i.m23587b(str, "awemeId");
        if (this.f74712d.contains(str) || this.f74713e.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo72027b(String str) {
        C7573i.m23587b(str, "awemeId");
        mo72025a();
        this.f74712d.add(str);
        this.f74710b.storeStringSet("today_set", this.f74712d);
    }
}
