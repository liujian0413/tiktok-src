package com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository;

import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.e */
public final class C41613e implements C41611c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f108120a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41613e.class), "mRecentProvider", "getMRecentProvider()Lcom/ss/android/ugc/aweme/shortvideo/videocategory/repository/IRecentVideoCategoryProvider;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41613e.class), "mLongVideoProvider", "getMLongVideoProvider()Lcom/ss/android/ugc/aweme/shortvideo/videocategory/repository/ILongVideoCategoryProvider;"))};

    /* renamed from: b */
    private final C7541d f108121b = C7546e.m23570a(new C41614f(0, 1, null));

    /* renamed from: c */
    private final C7541d f108122c = C7546e.m23570a(new C41612d());

    /* renamed from: b */
    private final C41610b m132482b() {
        return (C41610b) this.f108121b.getValue();
    }

    /* renamed from: c */
    private final C41596a m132483c() {
        return (C41596a) this.f108122c.getValue();
    }

    /* renamed from: a */
    public final List<VideoCategoryParam> mo102222a() {
        return m132483c().mo102222a();
    }

    /* renamed from: a */
    public final List<VideoCategoryParam> mo102234a(int i) {
        return m132482b().mo102234a(i);
    }

    /* renamed from: a */
    public final void mo102235a(VideoCategoryParam videoCategoryParam) {
        C7573i.m23587b(videoCategoryParam, "latestCategory");
        m132482b().mo102235a(videoCategoryParam);
    }
}
