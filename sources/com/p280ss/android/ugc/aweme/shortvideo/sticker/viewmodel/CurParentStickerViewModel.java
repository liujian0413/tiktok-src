package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.support.p022v4.util.C0902i;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurParentStickerViewModel */
public class CurParentStickerViewModel extends C0063u {

    /* renamed from: a */
    private Map<String, C0052o<C0902i<Effect, Effect>>> f106505a = new HashMap();

    /* renamed from: a */
    public final C0052o<C0902i<Effect, Effect>> mo101270a() {
        return mo101271a("default");
    }

    /* renamed from: a */
    public final void mo101272a(C0902i<Effect, Effect> iVar) {
        mo101273a(iVar, "default");
    }

    /* renamed from: a */
    public final C0052o<C0902i<Effect, Effect>> mo101271a(String str) {
        if (this.f106505a.get(str) != null) {
            return (C0052o) this.f106505a.get(str);
        }
        C0052o<C0902i<Effect, Effect>> oVar = new C0052o<>();
        this.f106505a.put(str, oVar);
        return oVar;
    }

    /* renamed from: a */
    public final void mo101273a(C0902i<Effect, Effect> iVar, String str) {
        if (this.f106505a.get(str) == null) {
            C0052o oVar = new C0052o();
            oVar.setValue(iVar);
            this.f106505a.put(str, oVar);
            return;
        }
        ((C0052o) this.f106505a.get(str)).setValue(iVar);
    }
}
