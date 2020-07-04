package com.p280ss.android.ugc.trill.abtest;

import android.content.Context;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30475h;
import com.p280ss.android.ugc.aweme.setting.C7215f;
import com.p280ss.android.ugc.trill.app.TrillApplication;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.trill.abtest.b */
public final class C44974b {

    /* renamed from: c */
    private static final C30475h<C44974b> f115649c = new C30475h<C44974b>() {
        /* renamed from: c */
        private static C44974b m141921c() {
            return new C44974b();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo80150a() {
            return m141921c();
        }
    };

    /* renamed from: a */
    private Map<String, C44973a> f115650a;

    /* renamed from: b */
    private JSONObject f115651b;

    private C44974b() {
        this.f115650a = new HashMap();
    }

    /* renamed from: a */
    public static C44974b m141917a() {
        return (C44974b) f115649c.mo80151b();
    }

    /* renamed from: a */
    public final void mo107493a(String str) {
        try {
            this.f115651b = new JSONObject(str);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public final boolean mo107495b(String str) {
        C44973a aVar = (C44973a) this.f115650a.get(str);
        if (aVar == null) {
            return false;
        }
        if (this.f115651b == null) {
            try {
                this.f115651b = new JSONObject((String) C7215f.m22631b().mo16895a((Context) TrillApplication.m21341a(), "ab_test_model", String.class));
            } catch (Exception unused) {
                return false;
            }
        }
        return aVar.mo107492a(aVar.mo107491a(this.f115651b, str));
    }

    /* renamed from: a */
    public final void mo107494a(String str, C44973a aVar) {
        this.f115650a.put(str, aVar);
    }
}
