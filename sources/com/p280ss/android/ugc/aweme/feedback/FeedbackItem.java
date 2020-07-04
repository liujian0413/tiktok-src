package com.p280ss.android.ugc.aweme.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ugc.aweme.feedback.FeedbackItem */
public class FeedbackItem implements Parcelable {
    public static final Creator<FeedbackItem> CREATOR = new Creator<FeedbackItem>() {
        /* renamed from: a */
        private static FeedbackItem[] m95369a(int i) {
            return new FeedbackItem[i];
        }

        /* renamed from: a */
        private static FeedbackItem m95368a(Parcel parcel) {
            return new FeedbackItem(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m95368a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m95369a(i);
        }
    };

    /* renamed from: a */
    public String f76679a;

    /* renamed from: b */
    public String f76680b;

    /* renamed from: c */
    public String f76681c;

    /* renamed from: d */
    public String f76682d;

    /* renamed from: e */
    public String f76683e;

    /* renamed from: f */
    public int f76684f;

    public FeedbackItem() {
    }

    public int describeContents() {
        return 0;
    }

    protected FeedbackItem(Parcel parcel) {
        this.f76679a = parcel.readString();
        this.f76680b = parcel.readString();
        this.f76681c = parcel.readString();
        this.f76682d = parcel.readString();
        this.f76683e = parcel.readString();
        this.f76684f = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f76679a);
        parcel.writeString(this.f76680b);
        parcel.writeString(this.f76681c);
        parcel.writeString(this.f76682d);
        parcel.writeString(this.f76683e);
        parcel.writeInt(this.f76684f);
    }
}
