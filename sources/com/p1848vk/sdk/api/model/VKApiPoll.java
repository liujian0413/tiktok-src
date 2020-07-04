package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p1848vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiPoll */
public class VKApiPoll extends VKApiAttachment implements Parcelable {
    public static Creator<VKApiPoll> CREATOR = new Creator<VKApiPoll>() {
        /* renamed from: a */
        private static VKApiPoll[] m147539a(int i) {
            return new VKApiPoll[i];
        }

        /* renamed from: a */
        private static VKApiPoll m147538a(Parcel parcel) {
            return new VKApiPoll(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147538a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147539a(i);
        }
    };

    /* renamed from: a */
    public int f121149a;

    /* renamed from: b */
    public int f121150b;

    /* renamed from: c */
    public long f121151c;

    /* renamed from: d */
    public String f121152d;

    /* renamed from: e */
    public int f121153e;

    /* renamed from: f */
    public int f121154f;

    /* renamed from: g */
    public VKList<Answer> f121155g;

    /* renamed from: com.vk.sdk.api.model.VKApiPoll$Answer */
    public static final class Answer extends VKApiModel implements Parcelable, C47207a {
        public static Creator<Answer> CREATOR = new Creator<Answer>() {
            /* renamed from: a */
            private static Answer[] m147543a(int i) {
                return new Answer[i];
            }

            /* renamed from: a */
            private static Answer m147542a(Parcel parcel) {
                return new Answer(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m147542a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m147543a(i);
            }
        };

        /* renamed from: a */
        public int f121156a;

        /* renamed from: b */
        public String f121157b;

        /* renamed from: c */
        public int f121158c;

        /* renamed from: d */
        public double f121159d;

        public final int describeContents() {
            return 0;
        }

        public Answer(Parcel parcel) {
            this.f121156a = parcel.readInt();
            this.f121157b = parcel.readString();
            this.f121158c = parcel.readInt();
            this.f121159d = parcel.readDouble();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Answer mo118445b(JSONObject jSONObject) {
            this.f121156a = jSONObject.optInt("id");
            this.f121157b = jSONObject.optString("text");
            this.f121158c = jSONObject.optInt("votes");
            this.f121159d = jSONObject.optDouble("rate");
            return this;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f121156a);
            parcel.writeString(this.f121157b);
            parcel.writeInt(this.f121158c);
            parcel.writeDouble(this.f121159d);
        }
    }

    public VKApiPoll() {
    }

    /* renamed from: a */
    public final CharSequence mo118444a() {
        return null;
    }

    /* renamed from: b */
    public final String mo118446b() {
        return "poll";
    }

    public int describeContents() {
        return 0;
    }

    public VKApiPoll(Parcel parcel) {
        this.f121149a = parcel.readInt();
        this.f121150b = parcel.readInt();
        this.f121151c = parcel.readLong();
        this.f121152d = parcel.readString();
        this.f121153e = parcel.readInt();
        this.f121154f = parcel.readInt();
        this.f121155g = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
    }

    /* renamed from: a */
    public final VKApiPoll mo118445b(JSONObject jSONObject) {
        this.f121149a = jSONObject.optInt("id");
        this.f121150b = jSONObject.optInt("owner_id");
        this.f121151c = jSONObject.optLong("created");
        this.f121152d = jSONObject.optString("question");
        this.f121153e = jSONObject.optInt("votes");
        this.f121154f = jSONObject.optInt("answer_id");
        this.f121155g = new VKList<>(jSONObject.optJSONArray("answers"), Answer.class);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121149a);
        parcel.writeInt(this.f121150b);
        parcel.writeLong(this.f121151c);
        parcel.writeString(this.f121152d);
        parcel.writeInt(this.f121153e);
        parcel.writeInt(this.f121154f);
        parcel.writeParcelable(this.f121155g, i);
    }
}
