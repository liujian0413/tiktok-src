package com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.p1623a.p1624a.C41599b;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.p1623a.p1624a.C41600c;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.f */
public final class C41614f implements C41610b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f108123a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41614f.class), "mRecentRepo", "getMRecentRepo()Lcom/bytedance/keva/Keva;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41614f.class), "mCache", "getMCache()Lcom/ss/android/ugc/aweme/shortvideo/videocategory/repository/cache/lru/ILruCache;"))};

    /* renamed from: b */
    public static final C41615a f108124b = new C41615a(null);

    /* renamed from: c */
    private final C7541d f108125c;

    /* renamed from: d */
    private final C7541d f108126d;

    /* renamed from: e */
    private final int f108127e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.f$a */
    public static final class C41615a {
        private C41615a() {
        }

        public /* synthetic */ C41615a(C7571f fVar) {
            this();
        }
    }

    public C41614f() {
        this(0, 1, null);
    }

    /* renamed from: a */
    private final Keva m132487a() {
        return (Keva) this.f108125c.getValue();
    }

    /* renamed from: b */
    private final C41599b<VideoCategoryParam> m132488b() {
        return (C41599b) this.f108126d.getValue();
    }

    /* renamed from: c */
    private final List<VideoCategoryParam> m132489c() {
        return m132488b().mo102227c();
    }

    /* renamed from: d */
    private final boolean m132490d() {
        return !C7573i.m23585a((Object) C35574k.m114859a().mo70073G().mo57091d(), (Object) m132487a().getString("key_stored_userid", ""));
    }

    /* renamed from: e */
    private final void m132491e() {
        m132488b().mo102228d();
        m132487a().storeString("key_stored_userid", C35574k.m114859a().mo70073G().mo57091d());
    }

    /* renamed from: a */
    public final List<VideoCategoryParam> mo102234a(int i) {
        if (!m132490d()) {
            return m132489c();
        }
        m132491e();
        return C7525m.m23461a();
    }

    private C41614f(int i) {
        this.f108127e = i;
        this.f108125c = C7546e.m23570a(Keva.getRepoFromSp(C6399b.m19921a(), "RecentUsedVideoCategory", 0));
        this.f108126d = C7546e.m23570a(new C41600c("RecentUsedVideoCategory", this.f108127e, VideoCategoryParam.class));
    }

    /* renamed from: a */
    public final void mo102235a(VideoCategoryParam videoCategoryParam) {
        C7573i.m23587b(videoCategoryParam, "latestCategory");
        m132488b().mo102223a(videoCategoryParam);
    }

    public /* synthetic */ C41614f(int i, int i2, C7571f fVar) {
        this(3);
    }
}
