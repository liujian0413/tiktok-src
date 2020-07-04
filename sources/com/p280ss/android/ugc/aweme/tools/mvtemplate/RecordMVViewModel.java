package com.p280ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel */
public final class RecordMVViewModel extends BaseJediViewModel<RecordMVState> {

    /* renamed from: c */
    public Effect f110511c;

    /* renamed from: d */
    public ShortVideoContext f110512d;

    /* renamed from: g */
    private static RecordMVState m135055g() {
        return new RecordMVState(null, null, 3, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m135055g();
    }

    /* renamed from: f */
    public final ShortVideoContext mo29069f() {
        ShortVideoContext shortVideoContext = this.f110512d;
        if (shortVideoContext == null) {
            C7573i.m23583a("shortVideoContext");
        }
        return shortVideoContext;
    }

    /* renamed from: a */
    public final void mo104070a(ShortVideoContext shortVideoContext) {
        C7573i.m23587b(shortVideoContext, "<set-?>");
        this.f110512d = shortVideoContext;
    }
}
