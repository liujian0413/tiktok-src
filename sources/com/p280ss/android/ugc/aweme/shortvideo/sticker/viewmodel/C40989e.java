package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.C0052o;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.e */
final /* synthetic */ class C40989e implements C7326g {

    /* renamed from: a */
    private final C0052o f106572a;

    C40989e(C0052o oVar) {
        this.f106572a = oVar;
    }

    public final void accept(Object obj) {
        this.f106572a.setValue(LiveDataWrapper.m109598a(STATUS.ERROR, (Throwable) obj));
    }
}
