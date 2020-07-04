package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.C0052o;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.d */
final /* synthetic */ class C40988d implements C7326g {

    /* renamed from: a */
    private final C0052o f106571a;

    C40988d(C0052o oVar) {
        this.f106571a = oVar;
    }

    public final void accept(Object obj) {
        this.f106571a.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, (CategoryEffectModel) obj));
    }
}
