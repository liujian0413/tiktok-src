package com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel;

import com.bytedance.jedi.arch.C11496ae;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NavigationViewModel */
public final class DiscoverV4NavigationViewModel extends JediViewModel<DiscoverV4NavigationState> {
    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m89199f();
    }

    /* renamed from: f */
    private static DiscoverV4NavigationState m89199f() {
        return new DiscoverV4NavigationState(C11496ae.f31094a);
    }

    /* renamed from: a */
    public static C7492s<DiscoverV4CategoryResponse> m89198a(int i) {
        C7492s<DiscoverV4CategoryResponse> a = DiscoverApi.m87295a().categoryListV4(i).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "DiscoverApi.getInstance(…dSchedulers.mainThread())");
        return a;
    }
}
