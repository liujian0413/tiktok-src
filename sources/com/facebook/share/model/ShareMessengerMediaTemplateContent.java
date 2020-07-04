package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, Object> {
    public static final Creator<ShareMessengerMediaTemplateContent> CREATOR = new Creator<ShareMessengerMediaTemplateContent>() {
        /* renamed from: a */
        private static ShareMessengerMediaTemplateContent[] m42126a(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }

        /* renamed from: a */
        private static ShareMessengerMediaTemplateContent m42125a(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42125a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42126a(i);
        }
    };

    /* renamed from: a */
    public final MediaType f37628a;

    /* renamed from: b */
    public final String f37629b;

    /* renamed from: c */
    public final Uri f37630c;

    /* renamed from: d */
    public final ShareMessengerActionButton f37631d;

    public enum MediaType {
        IMAGE,
        VIDEO
    }

    public final int describeContents() {
        return 0;
    }

    ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.f37628a = (MediaType) parcel.readSerializable();
        this.f37629b = parcel.readString();
        this.f37630c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f37631d = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f37628a);
        parcel.writeString(this.f37629b);
        parcel.writeParcelable(this.f37630c, i);
        parcel.writeParcelable(this.f37631d, i);
    }
}
