package com.p280ss.android.ugc.aweme.shortvideo.presenter;

import android.graphics.Bitmap;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.presenter.c */
final /* synthetic */ class C40215c implements Runnable {

    /* renamed from: a */
    private final OnVideoCoverCallback f104519a;

    /* renamed from: b */
    private final Bitmap f104520b;

    C40215c(OnVideoCoverCallback onVideoCoverCallback, Bitmap bitmap) {
        this.f104519a = onVideoCoverCallback;
        this.f104520b = bitmap;
    }

    public final void run() {
        C40213a.m128524a(this.f104519a, this.f104520b);
    }
}
