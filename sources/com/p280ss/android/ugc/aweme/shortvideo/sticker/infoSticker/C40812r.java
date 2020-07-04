package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.C0052o;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.r */
final /* synthetic */ class C40812r implements C23319b {

    /* renamed from: a */
    private final C0052o f106136a;

    C40812r(C0052o oVar) {
        this.f106136a = oVar;
    }

    public final void accept(Object obj) {
        this.f106136a.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, (AVChallenge) obj));
    }
}
