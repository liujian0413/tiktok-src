package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiUserFull */
public class VKApiUserFull extends VKApiUser implements Parcelable {
    public static Creator<VKApiUserFull> CREATOR = new Creator<VKApiUserFull>() {
        /* renamed from: a */
        private static VKApiUserFull[] m147575a(int i) {
            return new VKApiUserFull[i];
        }

        /* renamed from: a */
        private static VKApiUserFull m147574a(Parcel parcel) {
            return new VKApiUserFull(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147574a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147575a(i);
        }
    };

    /* renamed from: A */
    public int f121218A;

    /* renamed from: B */
    public String f121219B;

    /* renamed from: C */
    public String[] f121220C;

    /* renamed from: D */
    public String f121221D;

    /* renamed from: G */
    public String f121222G;

    /* renamed from: H */
    public String f121223H;

    /* renamed from: I */
    public String f121224I;

    /* renamed from: J */
    public String f121225J;

    /* renamed from: K */
    public String f121226K;

    /* renamed from: L */
    public String f121227L;

    /* renamed from: M */
    public String f121228M;

    /* renamed from: N */
    public String f121229N;

    /* renamed from: O */
    public String f121230O;

    /* renamed from: P */
    public String f121231P;

    /* renamed from: Q */
    public String f121232Q;

    /* renamed from: R */
    public String f121233R;

    /* renamed from: S */
    public String f121234S;

    /* renamed from: T */
    public String f121235T;

    /* renamed from: U */
    public String f121236U;

    /* renamed from: V */
    public String f121237V;

    /* renamed from: W */
    public String f121238W;

    /* renamed from: X */
    public String f121239X;

    /* renamed from: Y */
    public String f121240Y;

    /* renamed from: Z */
    public boolean f121241Z;

    /* renamed from: aa */
    public boolean f121242aa;

    /* renamed from: ab */
    public boolean f121243ab;

    /* renamed from: ac */
    public boolean f121244ac;

    /* renamed from: ad */
    public boolean f121245ad;

    /* renamed from: ae */
    public boolean f121246ae;

    /* renamed from: af */
    public boolean f121247af;

    /* renamed from: ag */
    public boolean f121248ag;

    /* renamed from: ah */
    public int f121249ah;

    /* renamed from: ai */
    public Counters f121250ai;

    /* renamed from: aj */
    public Occupation f121251aj;

    /* renamed from: ak */
    public int f121252ak;

    /* renamed from: al */
    public VKList<Relative> f121253al;

    /* renamed from: am */
    public boolean f121254am;

    /* renamed from: o */
    public String f121255o;

    /* renamed from: p */
    public VKApiAudio f121256p;

    /* renamed from: q */
    public String f121257q;

    /* renamed from: r */
    public VKApiCity f121258r;

    /* renamed from: s */
    public VKApiCountry f121259s;

    /* renamed from: t */
    public long f121260t;

    /* renamed from: u */
    public VKList<VKApiUniversity> f121261u;

    /* renamed from: v */
    public VKList<VKApiSchool> f121262v;

    /* renamed from: w */
    public int f121263w;

    /* renamed from: x */
    public int f121264x;

    /* renamed from: y */
    public int f121265y;

    /* renamed from: z */
    public int f121266z;

    /* renamed from: com.vk.sdk.api.model.VKApiUserFull$Counters */
    public static class Counters implements Parcelable {
        public static Creator<Counters> CREATOR = new Creator<Counters>() {
            /* renamed from: a */
            private static Counters[] m147577a(int i) {
                return new Counters[i];
            }

            /* renamed from: a */
            private static Counters m147576a(Parcel parcel) {
                return new Counters(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m147576a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m147577a(i);
            }
        };

        /* renamed from: a */
        public int f121267a;

        /* renamed from: b */
        public int f121268b;

        /* renamed from: c */
        public int f121269c;

        /* renamed from: d */
        public int f121270d;

        /* renamed from: e */
        public int f121271e;

        /* renamed from: f */
        public int f121272f;

        /* renamed from: g */
        public int f121273g;

        /* renamed from: h */
        public int f121274h;

        /* renamed from: i */
        public int f121275i;

        /* renamed from: j */
        public int f121276j;

        /* renamed from: k */
        public int f121277k;

        /* renamed from: l */
        public int f121278l;

        /* renamed from: m */
        public int f121279m;

        public int describeContents() {
            return 0;
        }

        private Counters(Parcel parcel) {
            this.f121267a = -1;
            this.f121268b = -1;
            this.f121269c = -1;
            this.f121270d = -1;
            this.f121271e = -1;
            this.f121272f = -1;
            this.f121273g = -1;
            this.f121274h = -1;
            this.f121275i = -1;
            this.f121276j = -1;
            this.f121277k = -1;
            this.f121278l = -1;
            this.f121279m = -1;
            this.f121267a = parcel.readInt();
            this.f121268b = parcel.readInt();
            this.f121269c = parcel.readInt();
            this.f121270d = parcel.readInt();
            this.f121271e = parcel.readInt();
            this.f121272f = parcel.readInt();
            this.f121273g = parcel.readInt();
            this.f121274h = parcel.readInt();
            this.f121275i = parcel.readInt();
            this.f121276j = parcel.readInt();
            this.f121277k = parcel.readInt();
            this.f121278l = parcel.readInt();
            this.f121279m = parcel.readInt();
        }

        Counters(JSONObject jSONObject) {
            this.f121267a = -1;
            this.f121268b = -1;
            this.f121269c = -1;
            this.f121270d = -1;
            this.f121271e = -1;
            this.f121272f = -1;
            this.f121273g = -1;
            this.f121274h = -1;
            this.f121275i = -1;
            this.f121276j = -1;
            this.f121277k = -1;
            this.f121278l = -1;
            this.f121279m = -1;
            this.f121267a = jSONObject.optInt("albums", this.f121267a);
            this.f121269c = jSONObject.optInt("audios", this.f121269c);
            this.f121277k = jSONObject.optInt("followers", this.f121277k);
            this.f121272f = jSONObject.optInt("photos", this.f121272f);
            this.f121271e = jSONObject.optInt("friends", this.f121271e);
            this.f121273g = jSONObject.optInt("groups", this.f121273g);
            this.f121275i = jSONObject.optInt("mutual_friends", this.f121275i);
            this.f121270d = jSONObject.optInt("notes", this.f121270d);
            this.f121274h = jSONObject.optInt("online_friends", this.f121274h);
            this.f121276j = jSONObject.optInt("user_videos", this.f121276j);
            this.f121268b = jSONObject.optInt("videos", this.f121268b);
            this.f121278l = jSONObject.optInt("subscriptions", this.f121278l);
            this.f121279m = jSONObject.optInt("pages", this.f121279m);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f121267a);
            parcel.writeInt(this.f121268b);
            parcel.writeInt(this.f121269c);
            parcel.writeInt(this.f121270d);
            parcel.writeInt(this.f121271e);
            parcel.writeInt(this.f121272f);
            parcel.writeInt(this.f121273g);
            parcel.writeInt(this.f121274h);
            parcel.writeInt(this.f121275i);
            parcel.writeInt(this.f121276j);
            parcel.writeInt(this.f121277k);
            parcel.writeInt(this.f121278l);
            parcel.writeInt(this.f121279m);
        }
    }

    /* renamed from: com.vk.sdk.api.model.VKApiUserFull$Occupation */
    public static class Occupation implements Parcelable {
        public static Creator<Occupation> CREATOR = new Creator<Occupation>() {
            /* renamed from: a */
            private static Occupation[] m147579a(int i) {
                return new Occupation[i];
            }

            /* renamed from: a */
            private static Occupation m147578a(Parcel parcel) {
                return new Occupation(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m147578a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m147579a(i);
            }
        };

        /* renamed from: a */
        public String f121280a;

        /* renamed from: b */
        public int f121281b;

        /* renamed from: c */
        public String f121282c;

        public int describeContents() {
            return 0;
        }

        private Occupation(Parcel parcel) {
            this.f121281b = -1;
            this.f121280a = parcel.readString();
            this.f121281b = parcel.readInt();
            this.f121282c = parcel.readString();
        }

        Occupation(JSONObject jSONObject) {
            this.f121281b = -1;
            this.f121280a = jSONObject.optString("type");
            this.f121281b = jSONObject.optInt("id", this.f121281b);
            this.f121282c = jSONObject.optString("name");
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f121280a);
            parcel.writeInt(this.f121281b);
            parcel.writeString(this.f121282c);
        }
    }

    /* renamed from: com.vk.sdk.api.model.VKApiUserFull$Relative */
    public static class Relative extends VKApiModel implements Parcelable, C47207a {
        public static Creator<Relative> CREATOR = new Creator<Relative>() {
            /* renamed from: a */
            private static Relative[] m147583a(int i) {
                return new Relative[i];
            }

            /* renamed from: a */
            private static Relative m147582a(Parcel parcel) {
                return new Relative(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m147582a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m147583a(i);
            }
        };

        /* renamed from: a */
        public int f121283a;

        /* renamed from: b */
        public String f121284b;

        public int describeContents() {
            return 0;
        }

        private Relative(Parcel parcel) {
            this.f121283a = parcel.readInt();
            this.f121284b = parcel.readString();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Relative mo118445b(JSONObject jSONObject) {
            this.f121283a = jSONObject.optInt("id");
            this.f121284b = jSONObject.optString("name");
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f121283a);
            parcel.writeString(this.f121284b);
        }
    }

    public VKApiUserFull() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiUserFull(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        super(parcel);
        this.f121255o = parcel.readString();
        this.f121256p = (VKApiAudio) parcel.readParcelable(VKApiAudio.class.getClassLoader());
        this.f121257q = parcel.readString();
        this.f121258r = (VKApiCity) parcel.readParcelable(VKApiCity.class.getClassLoader());
        this.f121259s = (VKApiCountry) parcel.readParcelable(VKApiCountry.class.getClassLoader());
        this.f121260t = parcel.readLong();
        this.f121261u = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
        this.f121262v = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
        this.f121263w = parcel.readInt();
        this.f121264x = parcel.readInt();
        this.f121265y = parcel.readInt();
        this.f121266z = parcel.readInt();
        this.f121218A = parcel.readInt();
        this.f121219B = parcel.readString();
        this.f121220C = parcel.createStringArray();
        this.f121221D = parcel.readString();
        this.f121222G = parcel.readString();
        this.f121223H = parcel.readString();
        this.f121224I = parcel.readString();
        this.f121225J = parcel.readString();
        this.f121226K = parcel.readString();
        this.f121227L = parcel.readString();
        this.f121228M = parcel.readString();
        this.f121229N = parcel.readString();
        this.f121230O = parcel.readString();
        this.f121231P = parcel.readString();
        this.f121233R = parcel.readString();
        this.f121234S = parcel.readString();
        this.f121235T = parcel.readString();
        this.f121236U = parcel.readString();
        this.f121237V = parcel.readString();
        this.f121238W = parcel.readString();
        this.f121239X = parcel.readString();
        this.f121240Y = parcel.readString();
        boolean z9 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121241Z = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f121242aa = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f121243ab = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f121244ac = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f121245ad = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f121246ae = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f121247af = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f121248ag = z8;
        this.f121249ah = parcel.readInt();
        this.f121250ai = (Counters) parcel.readParcelable(Counters.class.getClassLoader());
        this.f121251aj = (Occupation) parcel.readParcelable(Occupation.class.getClassLoader());
        this.f121252ak = parcel.readInt();
        this.f121253al = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z9 = true;
        }
        this.f121254am = z9;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public VKApiUserFull mo118471c(JSONObject jSONObject) {
        super.mo118471c(jSONObject);
        this.f121260t = C47208b.m147657c(jSONObject.optJSONObject("last_seen"), "time");
        this.f121257q = jSONObject.optString("bdate");
        JSONObject optJSONObject = jSONObject.optJSONObject("city");
        if (optJSONObject != null) {
            this.f121258r = new VKApiCity().mo118445b(optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("country");
        if (optJSONObject2 != null) {
            this.f121259s = new VKApiCountry().mo118445b(optJSONObject2);
        }
        this.f121261u = new VKList<>(jSONObject.optJSONArray("universities"), VKApiUniversity.class);
        this.f121262v = new VKList<>(jSONObject.optJSONArray("schools"), VKApiSchool.class);
        this.f121255o = jSONObject.optString("activity");
        JSONObject optJSONObject3 = jSONObject.optJSONObject("status_audio");
        if (optJSONObject3 != null) {
            this.f121256p = new VKApiAudio().mo118445b(optJSONObject3);
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("personal");
        if (optJSONObject4 != null) {
            this.f121263w = optJSONObject4.optInt("smoking");
            this.f121264x = optJSONObject4.optInt("alcohol");
            this.f121265y = optJSONObject4.optInt("political");
            this.f121266z = optJSONObject4.optInt("life_main");
            this.f121218A = optJSONObject4.optInt("people_main");
            this.f121219B = optJSONObject4.optString("inspired_by");
            this.f121221D = optJSONObject4.optString("religion");
            if (optJSONObject4.has("langs")) {
                JSONArray optJSONArray = optJSONObject4.optJSONArray("langs");
                if (optJSONArray != null) {
                    this.f121220C = new String[optJSONArray.length()];
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        this.f121220C[i] = optJSONArray.optString(i);
                    }
                }
            }
        }
        this.f121222G = jSONObject.optString("facebook");
        this.f121223H = jSONObject.optString("facebook_name");
        this.f121224I = jSONObject.optString("livejournal");
        this.f121226K = jSONObject.optString("site");
        StringBuilder sb = new StringBuilder("id");
        sb.append(this.f121102F);
        this.f121231P = jSONObject.optString("screen_name", sb.toString());
        this.f121225J = jSONObject.optString("skype");
        this.f121229N = jSONObject.optString("mobile_phone");
        this.f121230O = jSONObject.optString("home_phone");
        this.f121227L = jSONObject.optString("twitter");
        this.f121228M = jSONObject.optString("instagram");
        this.f121239X = jSONObject.optString("about");
        this.f121233R = jSONObject.optString("activities");
        this.f121237V = jSONObject.optString("books");
        this.f121238W = jSONObject.optString("games");
        this.f121234S = jSONObject.optString("interests");
        this.f121235T = jSONObject.optString("movies");
        this.f121240Y = jSONObject.optString("quotes");
        this.f121236U = jSONObject.optString("tv");
        this.f121232Q = jSONObject.optString("nickname", null);
        this.f121241Z = C47208b.m147655a(jSONObject, "can_post");
        this.f121242aa = C47208b.m147655a(jSONObject, "can_see_all_posts");
        this.f121254am = C47208b.m147655a(jSONObject, "blacklisted_by_me");
        this.f121243ab = C47208b.m147655a(jSONObject, "can_write_private_message");
        this.f121244ac = C47208b.m147655a(jSONObject, "wall_default");
        String optString = jSONObject.optString("deactivated");
        this.f121246ae = "deleted".equals(optString);
        this.f121245ad = "banned".equals(optString);
        this.f121247af = "owner".equals(jSONObject.optString("wall_default"));
        this.f121248ag = C47208b.m147655a(jSONObject, "verified");
        this.f121249ah = jSONObject.optInt("sex");
        JSONObject optJSONObject5 = jSONObject.optJSONObject("counters");
        if (optJSONObject5 != null) {
            this.f121250ai = new Counters(optJSONObject5);
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("occupation");
        if (optJSONObject6 != null) {
            this.f121251aj = new Occupation(optJSONObject6);
        }
        this.f121252ak = jSONObject.optInt("relation");
        if (jSONObject.has("relatives")) {
            if (this.f121253al == null) {
                this.f121253al = new VKList<>();
            }
            this.f121253al.mo118622a(jSONObject.optJSONArray("relatives"), Relative.class);
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f121255o);
        parcel.writeParcelable(this.f121256p, i);
        parcel.writeString(this.f121257q);
        parcel.writeParcelable(this.f121258r, i);
        parcel.writeParcelable(this.f121259s, i);
        parcel.writeLong(this.f121260t);
        parcel.writeParcelable(this.f121261u, i);
        parcel.writeParcelable(this.f121262v, i);
        parcel.writeInt(this.f121263w);
        parcel.writeInt(this.f121264x);
        parcel.writeInt(this.f121265y);
        parcel.writeInt(this.f121266z);
        parcel.writeInt(this.f121218A);
        parcel.writeString(this.f121219B);
        parcel.writeStringArray(this.f121220C);
        parcel.writeString(this.f121221D);
        parcel.writeString(this.f121222G);
        parcel.writeString(this.f121223H);
        parcel.writeString(this.f121224I);
        parcel.writeString(this.f121225J);
        parcel.writeString(this.f121226K);
        parcel.writeString(this.f121227L);
        parcel.writeString(this.f121228M);
        parcel.writeString(this.f121229N);
        parcel.writeString(this.f121230O);
        parcel.writeString(this.f121231P);
        parcel.writeString(this.f121233R);
        parcel.writeString(this.f121234S);
        parcel.writeString(this.f121235T);
        parcel.writeString(this.f121236U);
        parcel.writeString(this.f121237V);
        parcel.writeString(this.f121238W);
        parcel.writeString(this.f121239X);
        parcel.writeString(this.f121240Y);
        parcel.writeByte(this.f121241Z ? (byte) 1 : 0);
        parcel.writeByte(this.f121242aa ? (byte) 1 : 0);
        parcel.writeByte(this.f121243ab ? (byte) 1 : 0);
        parcel.writeByte(this.f121244ac ? (byte) 1 : 0);
        parcel.writeByte(this.f121245ad ? (byte) 1 : 0);
        parcel.writeByte(this.f121246ae ? (byte) 1 : 0);
        parcel.writeByte(this.f121247af ? (byte) 1 : 0);
        parcel.writeByte(this.f121248ag ? (byte) 1 : 0);
        parcel.writeInt(this.f121249ah);
        parcel.writeParcelable(this.f121250ai, i);
        parcel.writeParcelable(this.f121251aj, i);
        parcel.writeInt(this.f121252ak);
        parcel.writeParcelable(this.f121253al, i);
        parcel.writeByte(this.f121254am ? (byte) 1 : 0);
    }
}
