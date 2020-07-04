package com.bytedance.android.live.broadcast.effect.sticker.p137a;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.p126b.C2424d;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2425a;
import com.bytedance.android.live.broadcast.effect.sticker.C2660c;
import com.bytedance.android.live.broadcast.effect.sticker.C2661d;
import com.bytedance.android.live.broadcast.effect.sticker.C2662e;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.effectmanager.C43681b;
import com.p280ss.android.ugc.effectmanager.C43837h;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43770t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.a.a */
public abstract class C2653a implements C2424d {

    /* renamed from: a */
    public final C43837h f8462a = ((IHostContext) C3596c.m13172a(IHostContext.class)).getEffectManager();

    /* renamed from: b */
    public final List<C2425a> f8463b = new ArrayList();

    /* renamed from: c */
    public final List<String> f8464c = new ArrayList();

    /* renamed from: a */
    public void mo8903a() {
        this.f8463b.clear();
    }

    /* renamed from: a */
    private static C2662e mo9319a(String str) {
        if (C2418b.f7950a.equals(str)) {
            return new C2660c();
        }
        if (C2418b.f7951b.equals(str)) {
            return new C2661d();
        }
        return new C2662e();
    }

    /* renamed from: a */
    public final boolean mo8906a(C9355c cVar) {
        if (cVar == null) {
            return true;
        }
        if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_USE_EFFECT_DOWNLOAD_CACHE.mo10240a()).booleanValue() && this.f8464c.contains(cVar.f25581t)) {
            return true;
        }
        if (C43681b.m138406a()) {
            return C43681b.m138407b().mo105678a(this.f8462a, C2663f.m10854a(cVar));
        }
        return this.f8462a.mo106021a(C2663f.m10854a(cVar));
    }

    /* renamed from: a */
    public final void mo9318a(String str, String str2, C43770t tVar) {
        if (this.f8462a != null) {
            this.f8462a.mo106011a(str, str2, tVar);
        }
    }

    /* renamed from: a */
    public final void mo8905a(final String str, C9355c cVar, final C2425a aVar) {
        if (cVar != null && cVar.f25563b != null && !cVar.f25563b.f7711b.isEmpty() && !mo8906a(cVar)) {
            final C2662e a = mo9319a(str);
            a.mo9332e();
            this.f8462a.mo106000a(C2663f.m10854a(cVar), (C43760j) new C43760j() {
                /* renamed from: b */
                public final void mo9282b(Effect effect) {
                }

                /* renamed from: a */
                public final void mo9280a(Effect effect) {
                    C9355c a = C2663f.m10852a(effect);
                    a.f25583v = false;
                    a.f25582u = true;
                    a.mo9328b();
                    C2653a.this.f8464c.add(effect.getUnzipPath());
                    for (C2425a c : C2653a.this.f8463b) {
                        c.mo8909c(str, a);
                    }
                    if (aVar != null) {
                        aVar.mo8909c(str, a);
                    }
                }

                /* renamed from: a */
                public final void mo9281a(Effect effect, C43726c cVar) {
                    C2653a.this.f8462a.mo106028c(effect);
                    C9355c a = C2663f.m10852a(effect);
                    a.f25583v = false;
                    a.mo9329b(cVar.f113220a, cVar.f113221b);
                    for (C2425a b : C2653a.this.f8463b) {
                        b.mo8908b(str, a);
                    }
                    if (aVar != null) {
                        aVar.mo8908b(str, a);
                    }
                }
            });
            cVar.f25583v = true;
            for (C2425a a2 : this.f8463b) {
                a2.mo8907a(str, cVar);
            }
            if (aVar != null) {
                aVar.mo8907a(str, cVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo9317a(String str, String str2, C43765o oVar) {
        if (oVar != null) {
            if (this.f8462a == null || str == null || str2 == null || TextUtils.equals(POIService.INVALID_ID, str2.toUpperCase())) {
                oVar.mo9279b();
            } else {
                this.f8462a.mo106010a(str, str2, oVar);
            }
        }
    }
}
