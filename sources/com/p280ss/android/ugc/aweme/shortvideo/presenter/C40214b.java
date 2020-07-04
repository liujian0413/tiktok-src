package com.p280ss.android.ugc.aweme.shortvideo.presenter;

import com.p280ss.android.medialib.jni.EffectThumb;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.presenter.b */
final /* synthetic */ class C40214b implements Callable {

    /* renamed from: a */
    private final boolean f104514a;

    /* renamed from: b */
    private final EditVideoSegment f104515b;

    /* renamed from: c */
    private final EffectThumb f104516c;

    /* renamed from: d */
    private final String f104517d;

    /* renamed from: e */
    private final OnVideoCoverCallback f104518e;

    C40214b(boolean z, EditVideoSegment editVideoSegment, EffectThumb effectThumb, String str, OnVideoCoverCallback onVideoCoverCallback) {
        this.f104514a = z;
        this.f104515b = editVideoSegment;
        this.f104516c = effectThumb;
        this.f104517d = str;
        this.f104518e = onVideoCoverCallback;
    }

    public final Object call() {
        return C40213a.m128522a(this.f104514a, this.f104515b, this.f104516c, this.f104517d, this.f104518e);
    }
}
