package com.p280ss.android.ugc.effectmanager.effect.p1733c;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43759i;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.c.c */
public final class C43776c {

    /* renamed from: a */
    public final List<Effect> f113259a = new ArrayList();

    /* renamed from: b */
    private EffectChannelResponse f113260b;

    /* renamed from: c */
    private C43834g f113261c;

    public C43776c(C43834g gVar) {
        this.f113261c = gVar;
    }

    /* renamed from: b */
    public final boolean mo105827b(Effect effect) {
        if (effect == null) {
            return false;
        }
        synchronized (this.f113259a) {
            for (Effect effectId : this.f113259a) {
                if (TextUtils.equals(effectId.getEffectId(), effect.getEffectId())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo105826a(Effect effect) {
        if (mo105827b(effect)) {
            return false;
        }
        return C43733e.m138597a(effect.getUnzipPath());
    }

    /* renamed from: a */
    public final void mo105825a(String str, List<Effect> list, C43726c cVar) {
        synchronized (this.f113259a) {
            this.f113259a.removeAll(list);
        }
        C43759i e = this.f113261c.f113508B.mo106048e(str);
        if (e != null) {
            if (cVar == null) {
                e.mo95926a(list);
                return;
            }
            e.mo95925a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo105824a(String str, EffectChannelResponse effectChannelResponse, int i, C43726c cVar) {
        switch (i) {
            case 23:
                this.f113260b = effectChannelResponse;
                C43757g h = this.f113261c.f113508B.mo106051h(str);
                if (h != null) {
                    h.mo9275a(effectChannelResponse);
                    return;
                }
                break;
            case 24:
                return;
            case 25:
                return;
            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                C43757g h2 = this.f113261c.f113508B.mo106051h(str);
                if (h2 != null) {
                    h2.mo9274a(cVar);
                    break;
                }
                break;
        }
    }

    /* renamed from: a */
    public final void mo105823a(String str, Effect effect, int i, C43726c cVar) {
        if (i != 26) {
            switch (i) {
                case 20:
                    synchronized (this.f113259a) {
                        this.f113259a.remove(effect);
                    }
                    C43760j d = this.f113261c.f113508B.mo106047d(str);
                    if (d != null) {
                        d.mo9280a(effect);
                        return;
                    }
                    break;
                case 21:
                    synchronized (this.f113259a) {
                        this.f113259a.add(effect);
                    }
                    break;
                case 22:
                    synchronized (this.f113259a) {
                        this.f113259a.remove(effect);
                    }
                    break;
            }
            return;
        }
        C43760j d2 = this.f113261c.f113508B.mo106047d(str);
        if (d2 != null) {
            d2.mo9281a(effect, cVar);
        }
        synchronized (this.f113259a) {
            this.f113259a.remove(effect);
        }
    }
}
