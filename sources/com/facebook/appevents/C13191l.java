package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType;
import com.facebook.appevents.internal.C13182g;
import com.facebook.internal.C13892b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.l */
final class C13191l {

    /* renamed from: a */
    private List<AppEvent> f34934a = new ArrayList();

    /* renamed from: b */
    private List<AppEvent> f34935b = new ArrayList();

    /* renamed from: c */
    private int f34936c;

    /* renamed from: d */
    private C13892b f34937d;

    /* renamed from: e */
    private String f34938e;

    /* renamed from: f */
    private final int f34939f = 1000;

    /* renamed from: a */
    public final synchronized int mo32376a() {
        return this.f34934a.size();
    }

    /* renamed from: b */
    public final synchronized List<AppEvent> mo32380b() {
        List<AppEvent> list;
        list = this.f34934a;
        this.f34934a = new ArrayList();
        return list;
    }

    /* renamed from: a */
    public final synchronized void mo32379a(boolean z) {
        if (z) {
            try {
                this.f34934a.addAll(this.f34935b);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f34935b.clear();
        this.f34936c = 0;
    }

    /* renamed from: a */
    public final synchronized void mo32378a(AppEvent appEvent) {
        if (this.f34934a.size() + this.f34935b.size() >= 1000) {
            this.f34936c++;
        } else {
            this.f34934a.add(appEvent);
        }
    }

    public C13191l(C13892b bVar, String str) {
        this.f34937d = bVar;
        this.f34938e = str;
    }

    /* renamed from: a */
    public final int mo32377a(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.f34936c;
            C13182g.m38526a(this.f34935b);
            this.f34935b.addAll(this.f34934a);
            this.f34934a.clear();
            JSONArray jSONArray = new JSONArray();
            for (AppEvent appEvent : this.f34935b) {
                if (appEvent.isChecksumValid() && (z || !appEvent.getIsImplicit())) {
                    jSONArray.put(appEvent.getJSONObject());
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
            m38557a(graphRequest, context, i, jSONArray, z2);
            return jSONArray.length();
        }
    }

    /* renamed from: a */
    private void m38557a(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            jSONObject = AppEventsLoggerUtility.m38480a(GraphAPIActivityType.CUSTOM_APP_EVENTS, this.f34937d, this.f34938e, z, context);
            if (this.f34936c > 0) {
                jSONObject.put("num_skipped_events", i);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        graphRequest.f34676f = jSONObject;
        Bundle bundle = graphRequest.f34680j;
        if (bundle == null) {
            bundle = new Bundle();
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2 != null) {
            bundle.putString("custom_events", jSONArray2);
            graphRequest.f34682l = jSONArray2;
        }
        graphRequest.f34680j = bundle;
    }
}
