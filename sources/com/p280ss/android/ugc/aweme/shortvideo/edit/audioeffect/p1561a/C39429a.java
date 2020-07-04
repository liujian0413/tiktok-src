package com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.p1561a;

import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.p1561a.C39430b.C39431a;
import com.p280ss.android.ugc.aweme.shortvideo.guide.C39990e;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a */
public final class C39429a implements C39433d {

    /* renamed from: a */
    private C39990e f102381a;

    /* renamed from: b */
    private Effect f102382b;

    /* renamed from: c */
    private final FrameLayout f102383c;

    /* renamed from: d */
    private final C39432c f102384d;

    /* renamed from: a */
    public final void mo98262a() {
        C39990e eVar = this.f102381a;
        if (eVar != null) {
            eVar.mo98266a(true);
        }
    }

    public C39429a(FrameLayout frameLayout) {
        this(frameLayout, C39431a.m125954a());
    }

    /* renamed from: a */
    public final void mo98263a(Effect effect) {
        C39990e eVar = this.f102381a;
        if (eVar != null) {
            eVar.mo98266a(false);
        }
        if (effect != null && !C7573i.m23585a((Object) effect, (Object) this.f102382b)) {
            this.f102382b = effect;
            this.f102381a = this.f102384d.mo98264a(effect);
            C39990e eVar2 = this.f102381a;
            if (eVar2 != null) {
                eVar2.mo98265a(this.f102383c);
            }
        }
    }

    private C39429a(FrameLayout frameLayout, C39432c cVar) {
        C7573i.m23587b(cVar, "mFactory");
        this.f102383c = frameLayout;
        this.f102384d = cVar;
    }
}
