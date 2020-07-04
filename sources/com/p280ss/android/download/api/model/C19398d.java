package com.p280ss.android.download.api.model;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.download.api.model.d */
public final class C19398d {

    /* renamed from: a */
    public String f52470a;

    /* renamed from: b */
    public final String f52471b;

    /* renamed from: c */
    public final String f52472c;

    /* renamed from: d */
    public final boolean f52473d;

    /* renamed from: e */
    public final long f52474e;

    /* renamed from: f */
    public final String f52475f;

    /* renamed from: g */
    public final long f52476g;

    /* renamed from: h */
    public final JSONObject f52477h;

    /* renamed from: i */
    public final List<String> f52478i;

    /* renamed from: j */
    public final int f52479j;

    /* renamed from: k */
    public final Object f52480k;

    /* renamed from: l */
    public boolean f52481l;

    /* renamed from: m */
    public String f52482m;

    /* renamed from: n */
    public JSONObject f52483n;

    /* renamed from: com.ss.android.download.api.model.d$a */
    public static class C19399a {

        /* renamed from: a */
        public String f52484a;

        /* renamed from: b */
        public String f52485b;

        /* renamed from: c */
        public String f52486c;

        /* renamed from: d */
        public boolean f52487d;

        /* renamed from: e */
        public long f52488e;

        /* renamed from: f */
        public String f52489f;

        /* renamed from: g */
        public long f52490g;

        /* renamed from: h */
        public JSONObject f52491h;

        /* renamed from: i */
        public List<String> f52492i;

        /* renamed from: j */
        public int f52493j;

        /* renamed from: k */
        public Object f52494k;

        /* renamed from: l */
        public boolean f52495l;

        /* renamed from: m */
        public String f52496m;

        /* renamed from: n */
        public JSONObject f52497n;

        /* renamed from: o */
        private Map<String, Object> f52498o;

        /* renamed from: a */
        public final C19398d mo51409a() {
            if (TextUtils.isEmpty(this.f52484a)) {
                this.f52484a = "umeng";
            }
            JSONObject jSONObject = new JSONObject();
            if (this.f52491h == null) {
                this.f52491h = new JSONObject();
            }
            try {
                if (this.f52498o != null && !this.f52498o.isEmpty()) {
                    for (Entry entry : this.f52498o.entrySet()) {
                        if (!this.f52491h.has((String) entry.getKey())) {
                            this.f52491h.putOpt((String) entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (this.f52495l) {
                    this.f52496m = this.f52486c;
                    this.f52497n = new JSONObject();
                    Iterator keys = this.f52491h.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        this.f52497n.put(str, this.f52491h.get(str));
                    }
                    this.f52497n.put("category", this.f52484a);
                    this.f52497n.put("tag", this.f52485b);
                    this.f52497n.put("value", this.f52488e);
                    this.f52497n.put("ext_value", this.f52490g);
                }
                if (this.f52487d) {
                    jSONObject.put("ad_extra_data", this.f52491h.toString());
                    if (!jSONObject.has("log_extra") && !TextUtils.isEmpty(this.f52489f)) {
                        jSONObject.put("log_extra", this.f52489f);
                    }
                    jSONObject.put("is_ad_event", "1");
                } else {
                    jSONObject.put("extra", this.f52491h);
                }
                this.f52491h = jSONObject;
            } catch (Exception unused) {
            }
            return new C19398d(this);
        }

        /* renamed from: a */
        public final C19399a mo51402a(int i) {
            this.f52493j = i;
            return this;
        }

        /* renamed from: b */
        public final C19399a mo51410b(long j) {
            this.f52490g = j;
            return this;
        }

        /* renamed from: c */
        public final C19399a mo51413c(String str) {
            this.f52486c = str;
            return this;
        }

        /* renamed from: d */
        public final C19399a mo51414d(String str) {
            this.f52489f = str;
            return this;
        }

        /* renamed from: a */
        public final C19399a mo51403a(long j) {
            this.f52488e = j;
            return this;
        }

        /* renamed from: b */
        public final C19399a mo51411b(String str) {
            this.f52485b = str;
            return this;
        }

        /* renamed from: a */
        public final C19399a mo51404a(Object obj) {
            this.f52494k = obj;
            return this;
        }

        /* renamed from: b */
        public final C19399a mo51412b(boolean z) {
            this.f52487d = z;
            return this;
        }

        /* renamed from: a */
        public final C19399a mo51405a(String str) {
            this.f52484a = str;
            return this;
        }

        /* renamed from: a */
        public final C19399a mo51406a(List<String> list) {
            this.f52492i = list;
            return this;
        }

        /* renamed from: a */
        public final C19399a mo51407a(JSONObject jSONObject) {
            this.f52491h = jSONObject;
            return this;
        }

        /* renamed from: a */
        public final C19399a mo51408a(boolean z) {
            this.f52495l = z;
            return this;
        }
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("category: ");
        sb.append(this.f52470a);
        sb.append("\ntag: ");
        sb.append(this.f52471b);
        sb.append("\nlabel: ");
        sb.append(this.f52472c);
        sb.append("  <------------------\nisAd: ");
        sb.append(this.f52473d);
        sb.append("\nadId: ");
        sb.append(this.f52474e);
        sb.append("\nlogExtra: ");
        sb.append(this.f52475f);
        sb.append("\nextValue: ");
        sb.append(this.f52476g);
        sb.append("\nextJson: ");
        sb.append(this.f52477h);
        sb.append("\nclickTrackUrl: ");
        if (this.f52478i != null) {
            str = this.f52478i.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("\neventSource: ");
        sb.append(this.f52479j);
        sb.append("\nextraObject: ");
        if (this.f52480k != null) {
            str2 = this.f52480k.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("\nisV3: ");
        sb.append(this.f52481l);
        sb.append("\nV3EventName: ");
        sb.append(this.f52482m);
        sb.append("\nV3EventParams: ");
        if (this.f52483n != null) {
            str3 = this.f52483n.toString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    C19398d(C19399a aVar) {
        this.f52470a = aVar.f52484a;
        this.f52471b = aVar.f52485b;
        this.f52472c = aVar.f52486c;
        this.f52473d = aVar.f52487d;
        this.f52474e = aVar.f52488e;
        this.f52475f = aVar.f52489f;
        this.f52476g = aVar.f52490g;
        this.f52477h = aVar.f52491h;
        this.f52478i = aVar.f52492i;
        this.f52479j = aVar.f52493j;
        this.f52480k = aVar.f52494k;
        this.f52481l = aVar.f52495l;
        this.f52482m = aVar.f52496m;
        this.f52483n = aVar.f52497n;
    }
}
