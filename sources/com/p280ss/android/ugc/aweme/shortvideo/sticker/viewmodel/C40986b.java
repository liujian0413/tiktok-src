package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7495v;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.b */
final /* synthetic */ class C40986b implements C7495v {

    /* renamed from: a */
    private final EffectStickerViewModel f106560a;

    /* renamed from: b */
    private final EffectPlatform f106561b;

    /* renamed from: c */
    private final String f106562c;

    C40986b(EffectStickerViewModel effectStickerViewModel, EffectPlatform effectPlatform, String str) {
        this.f106560a = effectStickerViewModel;
        this.f106561b = effectPlatform;
        this.f106562c = str;
    }

    public final void subscribe(C47870u uVar) {
        this.f106560a.mo101287a(this.f106561b, this.f106562c, uVar);
    }
}
