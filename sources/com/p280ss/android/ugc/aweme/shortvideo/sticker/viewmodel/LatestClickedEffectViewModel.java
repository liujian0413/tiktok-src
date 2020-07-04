package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import com.bytedance.apm.util.C9653q;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.LatestClickedEffectViewModel */
public final class LatestClickedEffectViewModel extends C0063u {

    /* renamed from: a */
    public final C0052o<Effect> f106553a = new C0052o<>();

    /* renamed from: a */
    public final Effect mo101302a() {
        return (Effect) this.f106553a.getValue();
    }

    /* renamed from: a */
    public final void mo101303a(Effect effect) {
        if (C9653q.m28546a()) {
            this.f106553a.setValue(effect);
        } else {
            this.f106553a.postValue(effect);
        }
    }
}
