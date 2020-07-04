package com.p280ss.android.ugc.aweme.effectplatform;

import com.google.common.base.C17454q;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43762l;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.n */
public final class C27493n implements C43762l {

    /* renamed from: c */
    public static final C27494a f72520c = new C27494a(null);

    /* renamed from: a */
    public final String f72521a;

    /* renamed from: b */
    public final C43762l f72522b;

    /* renamed from: d */
    private final C17454q f72523d;

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.n$a */
    public static final class C27494a {
        private C27494a() {
        }

        public /* synthetic */ C27494a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C27493n m90134a(String str, C43762l lVar) {
            C7573i.m23587b(str, "panel");
            C7573i.m23587b(lVar, "listener");
            return new C27493n(str, lVar, null);
        }
    }

    /* renamed from: a */
    public static final C27493n m90130a(String str, C43762l lVar) {
        return C27494a.m90134a(str, lVar);
    }

    /* renamed from: a */
    private static JSONObject m90131a(JSONObject jSONObject) {
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

    /* renamed from: a */
    public final void mo70697a(C43726c cVar) {
        String str;
        int i;
        if (cVar == null) {
            i = -2;
            str = "unknown error";
        } else {
            i = cVar.f113220a;
            str = cVar.f113221b;
            C7573i.m23582a((Object) str, "e.msg");
        }
        C6893q.m21444a("sticker_list_error_rate", 1, new C38510bb().mo96479a("errorCode", Integer.valueOf(i)).mo96481a("errorDesc", str).mo96481a("panel", this.f72521a).mo96482b());
        JSONObject b = new C38510bb().mo96479a("error_code", Integer.valueOf(i)).mo96481a("error_msg", str).mo96481a("panel_type", this.f72521a).mo96482b();
        C6893q.m21445a("ttlive_load_sticker_list_all", 1, null, m90131a(b));
        C6893q.m21444a("ttlive_load_sticker_list_error", 1, b);
        C43762l lVar = this.f72522b;
        if (lVar != null) {
            lVar.mo70697a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo70698a(PanelInfoModel panelInfoModel) {
        long a = this.f72523d.mo44941a(TimeUnit.MILLISECONDS);
        C43762l lVar = this.f72522b;
        if (lVar != null) {
            lVar.mo70698a(panelInfoModel);
        }
        JSONObject b = new C38510bb().mo96480a("duration", Long.valueOf(a)).mo96481a("panel", this.f72521a).mo96482b();
        C6893q.m21444a("sticker_list_error_rate", 0, b);
        C6893q.m21445a("ttlive_load_sticker_list_all", 0, b, m90131a(new C38510bb().mo96481a("panel_type", this.f72521a).mo96482b()));
    }

    private C27493n(String str, C43762l lVar) {
        this.f72521a = str;
        this.f72522b = lVar;
        C17454q b = C17454q.m58004b();
        C7573i.m23582a((Object) b, "Stopwatch.createStarted()");
        this.f72523d = b;
    }

    public /* synthetic */ C27493n(String str, C43762l lVar, C7571f fVar) {
        this(str, lVar);
    }
}
