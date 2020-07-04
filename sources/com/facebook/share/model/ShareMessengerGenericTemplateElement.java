package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerGenericTemplateElement implements ShareModel {
    public static final Creator<ShareMessengerGenericTemplateElement> CREATOR = new Creator<ShareMessengerGenericTemplateElement>() {
        /* renamed from: a */
        private static ShareMessengerGenericTemplateElement[] m42124a(int i) {
            return new ShareMessengerGenericTemplateElement[i];
        }

        /* renamed from: a */
        private static ShareMessengerGenericTemplateElement m42123a(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42123a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42124a(i);
        }
    };

    /* renamed from: a */
    public final String f37623a;

    /* renamed from: b */
    public final String f37624b;

    /* renamed from: c */
    public final Uri f37625c;

    /* renamed from: d */
    public final ShareMessengerActionButton f37626d;

    /* renamed from: e */
    public final ShareMessengerActionButton f37627e;

    public final int describeContents() {
        return 0;
    }

    ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.f37623a = parcel.readString();
        this.f37624b = parcel.readString();
        this.f37625c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f37626d = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
        this.f37627e = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37623a);
        parcel.writeString(this.f37624b);
        parcel.writeParcelable(this.f37625c, i);
        parcel.writeParcelable(this.f37626d, i);
        parcel.writeParcelable(this.f37627e, i);
    }
}
