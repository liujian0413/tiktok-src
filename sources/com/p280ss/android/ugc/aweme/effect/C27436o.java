package com.p280ss.android.ugc.aweme.effect;

import com.p280ss.android.ugc.aweme.effect.p1200d.C27425d;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effect.o */
public final class C27436o implements C27425d {

    /* renamed from: a */
    private EffectPlatform f72354a;

    /* renamed from: a */
    public final void mo70548a() {
        EffectPlatform effectPlatform = this.f72354a;
        if (effectPlatform != null) {
            effectPlatform.destroy();
        }
        this.f72354a = null;
    }

    /* renamed from: a */
    public final void mo70549a(C43757g gVar) {
        C7573i.m23587b(gVar, "listener");
        if (this.f72354a == null) {
            this.f72354a = new EffectPlatform(C35574k.m114861b(), C35574k.m114859a().mo70107v().mo83209c(), C35574k.m114859a().mo70078L().getOKHttpClient());
        }
        EffectPlatform effectPlatform = this.f72354a;
        if (effectPlatform != null) {
            effectPlatform.mo70641b("editingeffect", false, gVar);
        }
    }
}
