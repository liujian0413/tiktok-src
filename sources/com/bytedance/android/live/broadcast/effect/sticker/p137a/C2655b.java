package com.bytedance.android.live.broadcast.effect.sticker.p137a;

import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2426b;
import com.bytedance.android.live.broadcast.effect.sticker.C2660c;
import com.bytedance.android.live.broadcast.effect.sticker.C2661d;
import com.bytedance.android.live.broadcast.effect.sticker.C2662e;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43751a;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.a.b */
public final class C2655b extends C2653a {

    /* renamed from: d */
    public final List<C2426b> f8469d = new ArrayList();

    /* renamed from: e */
    public final Map<String, EffectChannelResponse> f8470e = new HashMap();

    /* renamed from: f */
    private final Map<String, C9355c> f8471f = new HashMap();

    /* renamed from: a */
    public final void mo8903a() {
        super.mo8903a();
        this.f8469d.clear();
        this.f8470e.clear();
    }

    /* renamed from: a */
    public final void mo9319a(String str) {
        mo8904a(str, (C2426b) null);
    }

    /* renamed from: b */
    public final C9355c mo9322b(String str) {
        if (this.f8471f.containsKey(str)) {
            return (C9355c) this.f8471f.get(str);
        }
        return null;
    }

    /* renamed from: c */
    private static C2662e m10819c(String str) {
        if (C2418b.f7950a.equals(str)) {
            return new C2660c();
        }
        if (C2418b.f7951b.equals(str)) {
            return new C2661d();
        }
        return new C2662e();
    }

    /* renamed from: a */
    public final void mo9320a(String str, C9355c cVar) {
        if (!this.f8471f.containsKey(str)) {
            this.f8471f.put(str, cVar);
        }
    }

    /* renamed from: a */
    public final void mo8904a(final String str, C2426b bVar) {
        if (this.f8470e.containsKey(str)) {
            for (C2426b bVar2 : this.f8469d) {
                if (bVar2 != null) {
                    bVar2.mo8911a((EffectChannelResponse) this.f8470e.get(str));
                }
            }
            if (bVar != null) {
                bVar.mo8911a((EffectChannelResponse) this.f8470e.get(str));
            }
        } else if (this.f8462a != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            C2662e c = m10819c(str);
            final String str2 = str;
            final AtomicBoolean atomicBoolean2 = atomicBoolean;
            final C2662e eVar = c;
            final C2426b bVar3 = bVar;
            final C26561 r1 = new C43757g() {
                /* renamed from: a */
                public final void mo9274a(C43726c cVar) {
                    if (atomicBoolean2.get()) {
                        eVar.mo9327a(cVar.f113220a, cVar.f113221b);
                    }
                    for (C2426b bVar : C2655b.this.f8469d) {
                        if (bVar != null) {
                            bVar.mo8910a();
                        }
                    }
                    if (bVar3 != null) {
                        bVar3.mo8910a();
                    }
                }

                /* renamed from: a */
                public final void mo9275a(EffectChannelResponse effectChannelResponse) {
                    if (effectChannelResponse != null && (!C6311g.m19573a(effectChannelResponse.categoryResponseList) || !C6311g.m19573a(effectChannelResponse.allCategoryEffects))) {
                        C2655b.this.f8470e.put(str2, effectChannelResponse);
                        if (atomicBoolean2.get()) {
                            eVar.mo9326a();
                        }
                        for (C2426b bVar : C2655b.this.f8469d) {
                            if (bVar != null) {
                                bVar.mo8911a((EffectChannelResponse) C2655b.this.f8470e.get(str2));
                            }
                        }
                        C2515f.m10417f().mo9074a().mo8890a(effectChannelResponse);
                        if (bVar3 != null) {
                            bVar3.mo8911a((EffectChannelResponse) C2655b.this.f8470e.get(str2));
                        }
                    }
                }
            };
            c.mo9330c();
            if (!C2658c.m10830a(C3358ac.m12528e())) {
                mo9321a(atomicBoolean, str, r1, false);
            } else if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_USED_EFFECT_CHECK_CACHE.mo10240a()).booleanValue()) {
                this.f8462a.mo106003a(str, (C43751a) new C43751a() {
                    /* renamed from: a */
                    public final void mo9276a(C43726c cVar) {
                        C2655b.this.mo9321a(atomicBoolean, str, r1, true);
                    }

                    /* renamed from: a */
                    public final void mo9277a(boolean z) {
                        C2655b.this.mo9321a(atomicBoolean, str, r1, z);
                    }
                });
            } else {
                mo9321a(atomicBoolean, str, r1, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo9321a(AtomicBoolean atomicBoolean, String str, C43757g gVar, boolean z) {
        atomicBoolean.set(z);
        if (z) {
            this.f8462a.mo106015a(str, false, gVar);
            return;
        }
        atomicBoolean.set(false);
        this.f8462a.mo106004a(str, gVar);
    }
}
