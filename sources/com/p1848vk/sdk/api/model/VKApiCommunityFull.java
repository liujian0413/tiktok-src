package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiCommunityFull */
public class VKApiCommunityFull extends VKApiCommunity implements Parcelable {
    public static Creator<VKApiCommunityFull> CREATOR = new Creator<VKApiCommunityFull>() {
        /* renamed from: a */
        private static VKApiCommunityFull[] m147453a(int i) {
            return new VKApiCommunityFull[i];
        }

        /* renamed from: a */
        private static VKApiCommunityFull m147452a(Parcel parcel) {
            return new VKApiCommunityFull(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147452a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147453a(i);
        }
    };

    /* renamed from: A */
    public int f121022A;

    /* renamed from: B */
    public boolean f121023B;

    /* renamed from: C */
    public String f121024C;

    /* renamed from: D */
    public boolean f121025D;

    /* renamed from: l */
    public VKApiCity f121026l;

    /* renamed from: m */
    public VKApiCountry f121027m;

    /* renamed from: n */
    public VKApiAudio f121028n;

    /* renamed from: o */
    public VKApiPlace f121029o;

    /* renamed from: p */
    public String f121030p;

    /* renamed from: q */
    public String f121031q;

    /* renamed from: r */
    public int f121032r;

    /* renamed from: s */
    public Counters f121033s;

    /* renamed from: t */
    public long f121034t;

    /* renamed from: u */
    public long f121035u;

    /* renamed from: v */
    public boolean f121036v;

    /* renamed from: w */
    public boolean f121037w;

    /* renamed from: x */
    public String f121038x;

    /* renamed from: y */
    public VKList<Contact> f121039y;

    /* renamed from: z */
    public VKList<Link> f121040z;

    /* renamed from: com.vk.sdk.api.model.VKApiCommunityFull$Contact */
    public static class Contact extends VKApiModel implements Parcelable, C47207a {
        public static Creator<Contact> CREATOR = new Creator<Contact>() {
            /* renamed from: a */
            private static Contact[] m147457a(int i) {
                return new Contact[i];
            }

            /* renamed from: a */
            private static Contact m147456a(Parcel parcel) {
                return new Contact(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m147456a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m147457a(i);
            }
        };

        /* renamed from: a */
        public int f121041a;

        /* renamed from: b */
        public VKApiUser f121042b;

        /* renamed from: c */
        public String f121043c;

        /* renamed from: d */
        public String f121044d;

        public int describeContents() {
            return 0;
        }

        public String toString() {
            if (this.f121042b != null) {
                return this.f121042b.toString();
            }
            if (this.f121043c != null) {
                return this.f121043c;
            }
            return null;
        }

        private Contact(Parcel parcel) {
            this.f121041a = parcel.readInt();
            this.f121044d = parcel.readString();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Contact mo118445b(JSONObject jSONObject) {
            this.f121041a = jSONObject.optInt("user_id");
            this.f121044d = jSONObject.optString("desc");
            this.f121043c = jSONObject.optString("email");
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f121041a);
            parcel.writeString(this.f121044d);
        }
    }

    /* renamed from: com.vk.sdk.api.model.VKApiCommunityFull$Counters */
    public static class Counters implements Parcelable {
        public static Creator<Counters> CREATOR = new Creator<Counters>() {
            /* renamed from: a */
            private static Counters[] m147459a(int i) {
                return new Counters[i];
            }

            /* renamed from: a */
            private static Counters m147458a(Parcel parcel) {
                return new Counters(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m147458a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m147459a(i);
            }
        };

        /* renamed from: a */
        public int f121045a;

        /* renamed from: b */
        public int f121046b;

        /* renamed from: c */
        public int f121047c;

        /* renamed from: d */
        public int f121048d;

        /* renamed from: e */
        public int f121049e;

        /* renamed from: f */
        public int f121050f;

        public int describeContents() {
            return 0;
        }

        private Counters(Parcel parcel) {
            this.f121045a = -1;
            this.f121046b = -1;
            this.f121047c = -1;
            this.f121048d = -1;
            this.f121049e = -1;
            this.f121050f = -1;
            this.f121045a = parcel.readInt();
            this.f121046b = parcel.readInt();
            this.f121047c = parcel.readInt();
            this.f121048d = parcel.readInt();
            this.f121049e = parcel.readInt();
            this.f121050f = parcel.readInt();
        }

        public Counters(JSONObject jSONObject) {
            this.f121045a = -1;
            this.f121046b = -1;
            this.f121047c = -1;
            this.f121048d = -1;
            this.f121049e = -1;
            this.f121050f = -1;
            this.f121045a = jSONObject.optInt("photos", this.f121045a);
            this.f121046b = jSONObject.optInt("albums", this.f121046b);
            this.f121047c = jSONObject.optInt("audios", this.f121047c);
            this.f121048d = jSONObject.optInt("videos", this.f121048d);
            this.f121049e = jSONObject.optInt("topics", this.f121049e);
            this.f121050f = jSONObject.optInt("docs", this.f121050f);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f121045a);
            parcel.writeInt(this.f121046b);
            parcel.writeInt(this.f121047c);
            parcel.writeInt(this.f121048d);
            parcel.writeInt(this.f121049e);
            parcel.writeInt(this.f121050f);
        }
    }

    /* renamed from: com.vk.sdk.api.model.VKApiCommunityFull$Link */
    public static class Link extends VKApiModel implements Parcelable, C47207a {
        public static Creator<Link> CREATOR = new Creator<Link>() {
            /* renamed from: a */
            private static Link[] m147463a(int i) {
                return new Link[i];
            }

            /* renamed from: a */
            private static Link m147462a(Parcel parcel) {
                return new Link(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m147462a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m147463a(i);
            }
        };

        /* renamed from: a */
        public String f121051a;

        /* renamed from: b */
        public String f121052b;

        /* renamed from: c */
        public String f121053c;

        /* renamed from: d */
        public VKPhotoSizes f121054d = new VKPhotoSizes();

        public int describeContents() {
            return 0;
        }

        public Link(Parcel parcel) {
            this.f121051a = parcel.readString();
            this.f121052b = parcel.readString();
            this.f121053c = parcel.readString();
            this.f121054d = (VKPhotoSizes) parcel.readParcelable(null);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Link mo118445b(JSONObject jSONObject) {
            this.f121051a = jSONObject.optString("url");
            this.f121052b = jSONObject.optString("name");
            this.f121053c = jSONObject.optString("desc");
            String optString = jSONObject.optString("photo_50");
            if (!TextUtils.isEmpty(optString)) {
                this.f121054d.add(VKApiPhotoSize.m147521a(optString, 50));
            }
            String optString2 = jSONObject.optString("photo_100");
            if (!TextUtils.isEmpty(optString2)) {
                this.f121054d.add(VKApiPhotoSize.m147521a(optString2, 100));
            }
            this.f121054d.mo118656a();
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f121051a);
            parcel.writeString(this.f121052b);
            parcel.writeString(this.f121053c);
            parcel.writeParcelable(this.f121054d, i);
        }
    }

    public VKApiCommunityFull() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiCommunityFull(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        super(parcel);
        this.f121026l = (VKApiCity) parcel.readParcelable(VKApiCity.class.getClassLoader());
        this.f121027m = (VKApiCountry) parcel.readParcelable(VKApiCountry.class.getClassLoader());
        this.f121028n = (VKApiAudio) parcel.readParcelable(VKApiAudio.class.getClassLoader());
        this.f121029o = (VKApiPlace) parcel.readParcelable(VKApiPlace.class.getClassLoader());
        this.f121030p = parcel.readString();
        this.f121031q = parcel.readString();
        this.f121032r = parcel.readInt();
        this.f121033s = (Counters) parcel.readParcelable(Counters.class.getClassLoader());
        this.f121034t = parcel.readLong();
        this.f121035u = parcel.readLong();
        boolean z4 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121036v = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f121037w = z2;
        this.f121038x = parcel.readString();
        this.f121039y = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
        this.f121040z = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
        this.f121022A = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f121023B = z3;
        this.f121024C = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        }
        this.f121025D = z4;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public VKApiCommunityFull mo118471c(JSONObject jSONObject) {
        super.mo118471c(jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("city");
        if (optJSONObject != null) {
            this.f121026l = new VKApiCity().mo118445b(optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("country");
        if (optJSONObject2 != null) {
            this.f121027m = new VKApiCountry().mo118445b(optJSONObject2);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("place");
        if (optJSONObject3 != null) {
            this.f121029o = new VKApiPlace().mo118445b(optJSONObject3);
        }
        this.f121030p = jSONObject.optString("description");
        this.f121031q = jSONObject.optString("wiki_page");
        this.f121032r = jSONObject.optInt("members_count");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("counters");
        if (optJSONObject4 != null) {
            this.f121033s = new Counters(optJSONObject4);
        }
        this.f121034t = jSONObject.optLong("start_date");
        this.f121035u = jSONObject.optLong("end_date");
        this.f121036v = C47208b.m147655a(jSONObject, "can_post");
        this.f121037w = C47208b.m147655a(jSONObject, "can_see_all_posts");
        this.f121038x = jSONObject.optString("status");
        JSONObject optJSONObject5 = jSONObject.optJSONObject("status_audio");
        if (optJSONObject5 != null) {
            this.f121028n = new VKApiAudio().mo118445b(optJSONObject5);
        }
        this.f121039y = new VKList<>(jSONObject.optJSONArray("contacts"), Contact.class);
        this.f121040z = new VKList<>(jSONObject.optJSONArray("links"), Link.class);
        this.f121022A = jSONObject.optInt("fixed_post");
        this.f121023B = C47208b.m147655a(jSONObject, "verified");
        this.f121025D = C47208b.m147655a(jSONObject, "verified");
        this.f121024C = jSONObject.optString("site");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f121026l, i);
        parcel.writeParcelable(this.f121027m, i);
        parcel.writeParcelable(this.f121028n, i);
        parcel.writeParcelable(this.f121029o, i);
        parcel.writeString(this.f121030p);
        parcel.writeString(this.f121031q);
        parcel.writeInt(this.f121032r);
        parcel.writeParcelable(this.f121033s, i);
        parcel.writeLong(this.f121034t);
        parcel.writeLong(this.f121035u);
        parcel.writeByte(this.f121036v ? (byte) 1 : 0);
        parcel.writeByte(this.f121037w ? (byte) 1 : 0);
        parcel.writeString(this.f121038x);
        parcel.writeParcelable(this.f121039y, i);
        parcel.writeParcelable(this.f121040z, i);
        parcel.writeInt(this.f121022A);
        parcel.writeByte(this.f121023B ? (byte) 1 : 0);
        parcel.writeString(this.f121024C);
        parcel.writeByte(this.f121025D ? (byte) 1 : 0);
    }
}
