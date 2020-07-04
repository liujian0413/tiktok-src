package com.p280ss.android.ugc.aweme.effect.p1196b;

import com.p280ss.android.ugc.aweme.effect.EffectModel;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effect.b.a */
public final class C27394a {

    /* renamed from: a */
    public int f72278a = -1;

    /* renamed from: b */
    public EffectModel f72279b;

    /* renamed from: c */
    private int f72280c = -1;

    /* renamed from: a */
    public final boolean mo70491a(int i) {
        if (i == this.f72280c && this.f72278a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo70490a(int i, int i2, EffectModel effectModel) {
        C7573i.m23587b(effectModel, "model");
        this.f72278a = i;
        this.f72280c = i2;
        this.f72279b = effectModel;
    }
}
