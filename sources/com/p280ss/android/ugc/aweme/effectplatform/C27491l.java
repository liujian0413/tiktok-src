package com.p280ss.android.ugc.aweme.effectplatform;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43755e;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.l */
public final class C27491l implements C43755e {

    /* renamed from: a */
    private final C43760j f72518a;

    /* renamed from: b */
    private long f72519b;

    private C27491l(C43760j jVar) {
        this.f72518a = jVar;
    }

    /* renamed from: a */
    public static C27491l m90122a(C43760j jVar) {
        return new C27491l(jVar);
    }

    /* renamed from: b */
    public final void mo9282b(Effect effect) {
        this.f72519b = System.currentTimeMillis();
    }

    /* renamed from: a */
    private static JSONObject m90123a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    /* renamed from: c */
    private static int m90124c(Effect effect) {
        if (effect == null) {
            return 0;
        }
        List types = effect.getTypes();
        if (!C6307b.m19566a((Collection<T>) types) && types.contains("AR")) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo9280a(Effect effect) {
        if (C27492m.m90129a(C35574k.m114861b())) {
            int c = m90124c(effect);
            long currentTimeMillis = System.currentTimeMillis() - this.f72519b;
            AVAB k = C35574k.m114859a().mo70096k();
            C6893q.m21444a("sticker_download_error_rate", 0, new C38510bb().mo96481a("type", String.valueOf(c)).mo96481a("url", C35574k.m114859a().mo70085S().mo15979b((Object) effect.getFileUrl())).mo96479a("executor_type", Integer.valueOf(k.mo93305a(Property.UseNewEffectExecutorType) ? 1 : 0)).mo96479a("prefetch_model", Integer.valueOf(k.mo93305a(Property.PreFetchPopEffectModel) ? 1 : 0)).mo96479a("zip_model", Integer.valueOf(k.mo93306b(Property.FetchEffectModelType))).mo96481a("duration", String.valueOf(currentTimeMillis)).mo96482b());
            String str = "type_av_sticker_download_time";
            C38510bb a = C38510bb.m123095a().mo96480a("duration", Long.valueOf(currentTimeMillis));
            String str2 = "isAr";
            boolean z = true;
            if (c != 1) {
                z = false;
            }
            C6893q.m21447a(str, a.mo96477a(str2, Boolean.valueOf(z)).mo96482b());
            C6893q.m21445a("ttlive_download_sticker_all", 0, new C38510bb().mo96480a("duration", Long.valueOf(currentTimeMillis)).mo96482b(), m90123a((JSONObject) null));
        }
        if (this.f72518a != null) {
            this.f72518a.mo9280a(effect);
        }
    }

    /* renamed from: a */
    public final void mo9281a(Effect effect, C43726c cVar) {
        Object obj;
        String str;
        String str2;
        if (C27492m.m90129a(C35574k.m114861b())) {
            AVAB k = C35574k.m114859a().mo70096k();
            boolean a = k.mo93305a(Property.UseNewEffectExecutorType);
            boolean a2 = k.mo93305a(Property.PreFetchPopEffectModel);
            int b = k.mo93306b(Property.FetchEffectModelType);
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.f113221b);
            if (cVar.f113220a == -1) {
                obj = cVar.f113222c.getStackTrace();
            } else {
                obj = "";
            }
            sb.append(obj);
            String sb2 = sb.toString();
            String str3 = "sticker_download_error_rate";
            C38510bb bbVar = new C38510bb();
            String str4 = "sticker_id";
            if (effect == null) {
                str = "";
            } else {
                str = effect.getEffectId();
            }
            C38510bb a3 = bbVar.mo96481a(str4, str).mo96481a("errorCode", String.valueOf(cVar.f113220a)).mo96481a("errorMsg", sb2).mo96479a("executor_type", Integer.valueOf(a ? 1 : 0)).mo96479a("prefetch_model", Integer.valueOf(a2 ? 1 : 0)).mo96479a("zip_model", Integer.valueOf(b));
            String str5 = "url";
            if (effect == null) {
                str2 = "";
            } else {
                str2 = C35574k.m114859a().mo70085S().mo15979b((Object) effect.getFileUrl());
            }
            C6893q.m21444a(str3, 1, a3.mo96481a(str5, str2).mo96482b());
            JSONObject b2 = new C38510bb().mo96479a("error_code", Integer.valueOf(cVar.f113220a)).mo96481a("error_msg", sb2).mo96482b();
            C6893q.m21445a("ttlive_download_sticker_all", 1, null, m90123a(b2));
            C6893q.m21444a("ttlive_download_sticker_error", 1, b2);
        }
        if (this.f72518a != null) {
            this.f72518a.mo9281a(effect, cVar);
        }
    }

    /* renamed from: a */
    public final void mo70696a(Effect effect, int i, long j) {
        if (this.f72518a instanceof C43755e) {
            ((C43755e) this.f72518a).mo70696a(effect, i, j);
        }
    }
}
