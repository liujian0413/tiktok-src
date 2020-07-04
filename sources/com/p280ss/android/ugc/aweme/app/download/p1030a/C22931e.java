package com.p280ss.android.ugc.aweme.app.download.p1030a;

import android.content.Context;
import com.p280ss.android.p848c.p849a.p850a.C19226a;
import com.p280ss.android.p848c.p849a.p850a.C19229b;
import com.p280ss.android.p848c.p849a.p850a.C19232c;
import com.p280ss.android.ugc.aweme.commercialize.model.C24988a;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.C25539a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.download.a.e */
public class C22931e {

    /* renamed from: a */
    public static final String f60696a = "e";

    /* renamed from: b */
    private C22929c f60697b;

    /* renamed from: c */
    private C22932f f60698c;

    /* renamed from: b */
    public final void mo59926b() {
        this.f60697b.mo59917b();
    }

    /* renamed from: c */
    public final void mo59929c() {
        this.f60697b.mo59920d();
    }

    /* renamed from: d */
    public final void mo59931d() {
        this.f60697b.mo59919c();
    }

    /* renamed from: a */
    public final void mo59922a() {
        this.f60697b.mo59911a();
    }

    /* renamed from: a */
    public final void mo59923a(Context context) {
        this.f60697b.mo59912a(context);
    }

    /* renamed from: b */
    public final void mo59928b(JSONObject jSONObject) {
        if (jSONObject != null && this.f60698c != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            C22930d dVar = new C22930d();
            dVar.mo59921a(optJSONObject);
            this.f60697b.mo59918b(C22930d.m75472a(dVar), optJSONObject);
        }
    }

    /* renamed from: c */
    public final void mo59930c(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            this.f60697b.mo59916a(jSONObject.optJSONArray("task_list"));
        }
    }

    /* renamed from: a */
    public final void mo59925a(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            C22930d dVar = new C22930d();
            dVar.mo59921a(optJSONObject);
            this.f60697b.mo59915a(C22930d.m75472a(dVar), optJSONObject);
        }
    }

    /* renamed from: a */
    public static C22931e m75476a(Context context, C22932f fVar) {
        return new C22931e(context, fVar);
    }

    private C22931e(Context context, C22932f fVar) {
        this.f60698c = fVar;
        this.f60697b = new C22926a(context, this.f60698c);
    }

    /* renamed from: a */
    public final void mo59924a(Context context, JSONObject jSONObject) {
        if (context != null && jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            C22930d dVar = new C22930d();
            dVar.mo59921a(optJSONObject);
            this.f60697b.mo59914a(context, C22930d.m75472a(dVar), optJSONObject);
        }
    }

    /* renamed from: b */
    public final void mo59927b(Context context, JSONObject jSONObject) {
        C19229b a;
        if (context != null && jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            C22930d dVar = new C22930d();
            dVar.mo59921a(optJSONObject);
            C19232c a2 = C22930d.m75472a(dVar);
            C19226a a3 = C22930d.m75469a(dVar.f60690j, dVar.f60692l);
            if (dVar.f60688h) {
                a = C22930d.m75471a(dVar.f60689i, true);
            } else {
                a = C22930d.m75470a(dVar.f60689i);
            }
            C19229b bVar = a;
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("extParam");
            if (optJSONObject2 != null) {
                bVar.f51913c = new C24988a(null, optJSONObject2.optString("refer"), optJSONObject2.optJSONObject("ad_extra_data"));
            }
            this.f60697b.mo59913a(context, a2, bVar, a3, optJSONObject);
            C42961az.m136380a(new C25539a(-1));
        }
    }
}
