package com.p280ss.android.ugc.aweme.commercialize.log;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.p288d.C6759a;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.e */
public final class C24956e {

    /* renamed from: a */
    private String f65807a;

    /* renamed from: b */
    private String f65808b;

    /* renamed from: c */
    private String f65809c;

    /* renamed from: d */
    private long f65810d;

    /* renamed from: e */
    private String f65811e;

    /* renamed from: f */
    private long f65812f;

    /* renamed from: g */
    private JSONObject f65813g;

    /* renamed from: h */
    private JSONObject f65814h;

    /* renamed from: i */
    private String f65815i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.e$a */
    public static class C24957a {

        /* renamed from: a */
        private String f65816a;

        /* renamed from: b */
        private String f65817b;

        /* renamed from: c */
        private String f65818c;

        /* renamed from: d */
        private String f65819d;

        /* renamed from: e */
        private long f65820e;

        /* renamed from: f */
        private String f65821f;

        /* renamed from: g */
        private long f65822g;

        /* renamed from: h */
        private JSONObject f65823h;

        /* renamed from: i */
        private JSONObject f65824i;

        /* renamed from: a */
        public final C24956e mo65245a() {
            if (TextUtils.isEmpty(this.f65816a)) {
                this.f65816a = "umeng";
            }
            C24956e eVar = new C24956e(this.f65816a, this.f65817b, this.f65818c, this.f65819d, this.f65820e, this.f65821f, this.f65822g, this.f65823h, this.f65824i);
            return eVar;
        }

        /* renamed from: a */
        public final C24957a mo65242a(long j) {
            this.f65820e = j;
            return this;
        }

        /* renamed from: b */
        public final C24957a mo65246b(long j) {
            this.f65822g = j;
            return this;
        }

        /* renamed from: c */
        public final C24957a mo65248c(String str) {
            this.f65818c = str;
            return this;
        }

        /* renamed from: d */
        public final C24957a mo65249d(String str) {
            this.f65821f = str;
            return this;
        }

        /* renamed from: a */
        public final C24957a mo65243a(String str) {
            this.f65816a = str;
            return this;
        }

        /* renamed from: b */
        public final C24957a mo65247b(String str) {
            this.f65817b = str;
            return this;
        }

        /* renamed from: a */
        public final C24957a mo65244a(JSONObject jSONObject) {
            this.f65824i = jSONObject;
            return this;
        }
    }

    /* renamed from: a */
    public final void mo65241a() {
        Bundle bundle = new Bundle();
        bundle.putString("category", this.f65807a);
        bundle.putLong("nt", (long) NetworkUtils.m19550d(C6399b.m19921a()).getValue());
        bundle.putString("tag", this.f65809c);
        bundle.putString("label", this.f65815i);
        bundle.putString("value", String.valueOf(this.f65810d));
        bundle.putString("log_extra", this.f65811e);
        bundle.putString("ext_value", String.valueOf(this.f65812f));
        bundle.putString("is_ad_event", "1");
        if (this.f65813g != null) {
            bundle.putString("ad_extra_data", String.valueOf(this.f65813g));
        }
        if (this.f65814h != null) {
            try {
                if (this.f65813g == null) {
                    Object opt = this.f65814h.opt("ad_extra_data");
                    if (opt != null) {
                        bundle.putString("ad_extra_data", opt.toString());
                    }
                }
                Iterator keys = this.f65814h.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    bundle.putString(str, this.f65814h.getString(str));
                }
            } catch (JSONException unused) {
            }
        }
        C6759a.m20909a(this.f65808b, bundle);
    }

    C24956e(String str, String str2, String str3, String str4, long j, String str5, long j2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f65807a = str;
        this.f65808b = str2;
        this.f65809c = str3;
        this.f65815i = str4;
        this.f65810d = j;
        this.f65811e = str5;
        this.f65812f = j2;
        this.f65813g = jSONObject;
        this.f65814h = jSONObject2;
    }
}
