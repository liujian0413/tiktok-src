package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7495v;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.f */
final /* synthetic */ class C40990f implements C7495v {

    /* renamed from: a */
    private final EffectStickerViewModel f106573a;

    /* renamed from: b */
    private final EffectPlatform f106574b;

    /* renamed from: c */
    private final String f106575c;

    /* renamed from: d */
    private final String f106576d;

    /* renamed from: e */
    private final Boolean f106577e;

    /* renamed from: f */
    private final int f106578f;

    /* renamed from: g */
    private final int f106579g;

    /* renamed from: h */
    private final int f106580h;

    /* renamed from: i */
    private final String f106581i;

    C40990f(EffectStickerViewModel effectStickerViewModel, EffectPlatform effectPlatform, String str, String str2, Boolean bool, int i, int i2, int i3, String str3) {
        this.f106573a = effectStickerViewModel;
        this.f106574b = effectPlatform;
        this.f106575c = str;
        this.f106576d = str2;
        this.f106577e = bool;
        this.f106578f = i;
        this.f106579g = i2;
        this.f106580h = i3;
        this.f106581i = str3;
    }

    public final void subscribe(C47870u uVar) {
        this.f106573a.mo101288a(this.f106574b, this.f106575c, this.f106576d, this.f106577e, this.f106578f, this.f106579g, this.f106580h, this.f106581i, uVar);
    }
}
