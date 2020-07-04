package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent;

public class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    public static final Creator<ShareFeedContent> CREATOR = new Creator<ShareFeedContent>() {
        /* renamed from: a */
        private static ShareFeedContent[] m41825a(int i) {
            return new ShareFeedContent[i];
        }

        /* renamed from: a */
        private static ShareFeedContent m41824a(Parcel parcel) {
            return new ShareFeedContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m41824a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m41825a(i);
        }
    };

    /* renamed from: a */
    public final String f37456a;

    /* renamed from: b */
    public final String f37457b;

    /* renamed from: c */
    public final String f37458c;

    /* renamed from: d */
    public final String f37459d;

    /* renamed from: e */
    public final String f37460e;

    /* renamed from: f */
    public final String f37461f;

    /* renamed from: g */
    public final String f37462g;

    public int describeContents() {
        return 0;
    }

    ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.f37456a = parcel.readString();
        this.f37457b = parcel.readString();
        this.f37458c = parcel.readString();
        this.f37459d = parcel.readString();
        this.f37460e = parcel.readString();
        this.f37461f = parcel.readString();
        this.f37462g = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f37456a);
        parcel.writeString(this.f37457b);
        parcel.writeString(this.f37458c);
        parcel.writeString(this.f37459d);
        parcel.writeString(this.f37460e);
        parcel.writeString(this.f37461f);
        parcel.writeString(this.f37462g);
    }
}
