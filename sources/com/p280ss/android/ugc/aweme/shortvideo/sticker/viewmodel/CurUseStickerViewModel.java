package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel */
public class CurUseStickerViewModel extends C0063u {

    /* renamed from: a */
    private Map<String, C0052o<Effect>> f106506a = new HashMap();

    /* renamed from: a */
    public final C0052o<Effect> mo101274a() {
        return m130854a("default");
    }

    /* renamed from: a */
    public final void mo101275a(Effect effect) {
        mo101276a(effect, "default");
    }

    /* renamed from: a */
    private C0052o<Effect> m130854a(String str) {
        if (this.f106506a.get(str) != null) {
            return (C0052o) this.f106506a.get(str);
        }
        C0052o<Effect> oVar = new C0052o<>();
        this.f106506a.put(str, oVar);
        return oVar;
    }

    /* renamed from: a */
    public final void mo101276a(Effect effect, String str) {
        if (this.f106506a.get(str) == null) {
            C0052o oVar = new C0052o();
            this.f106506a.put(str, oVar);
            oVar.setValue(effect);
            return;
        }
        ((C0052o) this.f106506a.get(str)).setValue(effect);
    }
}
