package com.p280ss.android.ugc.aweme.profile.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel */
public final class MyProfileGuideViewModel extends JediViewModel<MyProfileGuideState> {
    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m118568f();
    }

    /* renamed from: f */
    private static MyProfileGuideState m118568f() {
        MyProfileGuideState myProfileGuideState = new MyProfileGuideState(false, false, false, false, null, null, null, null, null, 511, null);
        return myProfileGuideState;
    }

    /* renamed from: f */
    public final void mo93147f(C7562b<? super MyProfileGuideState, MyProfileGuideState> bVar) {
        C7573i.m23587b(bVar, "reducer");
        mo29038c(bVar);
    }
}
