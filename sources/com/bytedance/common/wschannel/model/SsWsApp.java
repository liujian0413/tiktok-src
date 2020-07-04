package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.wschannel.app.IWsApp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SsWsApp implements Parcelable, IWsApp {
    public static final Creator<SsWsApp> CREATOR = new Creator<SsWsApp>() {
        /* renamed from: a */
        private static SsWsApp[] m28979a(int i) {
            return new SsWsApp[i];
        }

        /* renamed from: a */
        private static SsWsApp m28978a(Parcel parcel) {
            return new SsWsApp(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m28978a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m28979a(i);
        }
    };

    /* renamed from: a */
    private List<String> f26744a;

    /* renamed from: b */
    private int f26745b;

    /* renamed from: c */
    private String f26746c;

    /* renamed from: d */
    private int f26747d;

    /* renamed from: e */
    private String f26748e;

    /* renamed from: f */
    private String f26749f;

    /* renamed from: g */
    private int f26750g;

    /* renamed from: h */
    private int f26751h;

    /* renamed from: i */
    private int f26752i;

    /* renamed from: j */
    private String f26753j;

    /* renamed from: com.bytedance.common.wschannel.model.SsWsApp$a */
    public static class C9822a {

        /* renamed from: a */
        private int f26754a;

        /* renamed from: b */
        private String f26755b;

        /* renamed from: c */
        private String f26756c;

        /* renamed from: d */
        private int f26757d;

        /* renamed from: e */
        private int f26758e;

        /* renamed from: f */
        private int f26759f;

        /* renamed from: g */
        private String f26760g;

        /* renamed from: h */
        private String f26761h;

        /* renamed from: i */
        private int f26762i;

        /* renamed from: j */
        private List<String> f26763j;

        /* renamed from: a */
        public final SsWsApp mo24345a() {
            SsWsApp ssWsApp = new SsWsApp(this.f26762i, this.f26754a, this.f26755b, this.f26756c, this.f26763j, this.f26757d, this.f26758e, this.f26759f, this.f26760g, this.f26761h);
            return ssWsApp;
        }

        /* renamed from: a */
        public final C9822a mo24342a(int i) {
            this.f26754a = i;
            return this;
        }

        /* renamed from: b */
        public final C9822a mo24346b(int i) {
            this.f26757d = i;
            return this;
        }

        /* renamed from: c */
        public final C9822a mo24348c(int i) {
            this.f26758e = 0;
            return this;
        }

        /* renamed from: d */
        public final C9822a mo24350d(int i) {
            this.f26759f = i;
            return this;
        }

        /* renamed from: e */
        public final C9822a mo24352e(int i) {
            this.f26762i = i;
            return this;
        }

        /* renamed from: a */
        public final C9822a mo24343a(String str) {
            this.f26755b = str;
            return this;
        }

        /* renamed from: b */
        public final C9822a mo24347b(String str) {
            this.f26756c = str;
            return this;
        }

        /* renamed from: c */
        public final C9822a mo24349c(String str) {
            this.f26761h = str;
            return this;
        }

        /* renamed from: d */
        public final C9822a mo24351d(String str) {
            this.f26760g = str;
            return this;
        }

        /* renamed from: a */
        public static SsWsApp m28980a(JSONObject jSONObject) {
            SsWsApp ssWsApp = new SsWsApp();
            ssWsApp.mo24335a(jSONObject);
            return ssWsApp;
        }

        /* renamed from: a */
        public final C9822a mo24344a(List<String> list) {
            this.f26763j = list;
            return this;
        }
    }

    /* renamed from: a */
    public final int mo24145a() {
        return this.f26745b;
    }

    /* renamed from: b */
    public final int mo24146b() {
        return this.f26747d;
    }

    /* renamed from: c */
    public final String mo24147c() {
        return this.f26748e;
    }

    /* renamed from: d */
    public final String mo24148d() {
        return this.f26749f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo24149e() {
        return this.f26750g;
    }

    /* renamed from: f */
    public final int mo24150f() {
        return this.f26751h;
    }

    /* renamed from: h */
    public final String mo24152h() {
        return this.f26753j;
    }

    /* renamed from: i */
    public final int mo24153i() {
        return this.f26752i;
    }

    /* renamed from: j */
    public final String mo24154j() {
        return this.f26746c;
    }

    /* renamed from: k */
    public final List<String> mo24155k() {
        return this.f26744a;
    }

    protected SsWsApp() {
        this.f26744a = new ArrayList();
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = ((this.f26747d * 31) + this.f26745b) * 31;
        int i4 = 0;
        if (this.f26748e != null) {
            i = this.f26748e.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        if (this.f26749f != null) {
            i2 = this.f26749f.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        if (this.f26746c != null) {
            i4 = this.f26746c.hashCode();
        }
        return ((((i6 + i4) * 31) + this.f26750g) * 31) + this.f26751h;
    }

    /* renamed from: g */
    public final JSONObject mo24151g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channel_id", this.f26745b);
        jSONObject.put("app_id", this.f26747d);
        jSONObject.put("device_id", this.f26748e);
        jSONObject.put("install_id", this.f26749f);
        JSONArray jSONArray = new JSONArray();
        if (this.f26744a != null) {
            for (String put : this.f26744a) {
                jSONArray.put(put);
            }
        }
        jSONObject.put("urls", jSONArray);
        jSONObject.put("app_version", this.f26750g);
        jSONObject.put("platform", this.f26751h);
        jSONObject.put("fpid", this.f26752i);
        jSONObject.put("app_kay", this.f26753j);
        jSONObject.put("extra", this.f26746c);
        return jSONObject;
    }

    protected SsWsApp(Parcel parcel) {
        this.f26744a = new ArrayList();
        this.f26744a = parcel.createStringArrayList();
        this.f26745b = parcel.readInt();
        this.f26746c = parcel.readString();
        this.f26747d = parcel.readInt();
        this.f26748e = parcel.readString();
        this.f26749f = parcel.readString();
        this.f26750g = parcel.readInt();
        this.f26751h = parcel.readInt();
        this.f26752i = parcel.readInt();
        this.f26753j = parcel.readString();
    }

    /* renamed from: a */
    public final void mo24335a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f26745b = jSONObject.optInt("channel_id");
            this.f26747d = jSONObject.optInt("app_id");
            this.f26748e = jSONObject.optString("device_id");
            this.f26749f = jSONObject.optString("install_id");
            this.f26750g = jSONObject.optInt("app_version");
            this.f26751h = jSONObject.optInt("platform");
            this.f26752i = jSONObject.optInt("fpid");
            this.f26753j = jSONObject.optString("app_kay");
            this.f26746c = jSONObject.optString("extra");
            JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            this.f26744a.clear();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.f26744a.add(optJSONArray.optString(i));
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SsWsApp ssWsApp = (SsWsApp) obj;
        if (this.f26745b != ssWsApp.f26745b || this.f26747d != ssWsApp.f26747d || this.f26750g != ssWsApp.f26750g || this.f26751h != ssWsApp.f26751h) {
            return false;
        }
        if (this.f26748e == null ? ssWsApp.f26748e != null : !this.f26748e.equals(ssWsApp.f26748e)) {
            return false;
        }
        if (this.f26749f == null ? ssWsApp.f26749f != null : !this.f26749f.equals(ssWsApp.f26749f)) {
            return false;
        }
        if (this.f26752i != ssWsApp.f26752i) {
            return false;
        }
        if (this.f26753j == null ? ssWsApp.f26753j != null : !this.f26753j.equals(ssWsApp.f26753j)) {
            return false;
        }
        if (this.f26744a.size() != ssWsApp.f26744a.size()) {
            return false;
        }
        for (String contains : this.f26744a) {
            if (!ssWsApp.f26744a.contains(contains)) {
                return false;
            }
        }
        return C6319n.m19594a(this.f26746c, ssWsApp.f26746c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f26744a);
        parcel.writeInt(this.f26745b);
        parcel.writeString(this.f26746c);
        parcel.writeInt(this.f26747d);
        parcel.writeString(this.f26748e);
        parcel.writeString(this.f26749f);
        parcel.writeInt(this.f26750g);
        parcel.writeInt(this.f26751h);
        parcel.writeInt(this.f26752i);
        parcel.writeString(this.f26753j);
    }

    private SsWsApp(int i, int i2, String str, String str2, List<String> list, int i3, int i4, int i5, String str3, String str4) {
        this.f26744a = new ArrayList();
        this.f26747d = i2;
        this.f26745b = i;
        this.f26748e = str;
        this.f26749f = str2;
        if (list != null) {
            this.f26744a.addAll(list);
        }
        this.f26750g = i3;
        this.f26751h = i4;
        this.f26752i = i5;
        this.f26753j = str3;
        this.f26746c = str4;
    }
}
