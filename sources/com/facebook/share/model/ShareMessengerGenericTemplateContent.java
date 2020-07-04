package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerGenericTemplateContent extends ShareContent<ShareMessengerGenericTemplateContent, Object> {
    public static final Creator<ShareMessengerGenericTemplateContent> CREATOR = new Creator<ShareMessengerGenericTemplateContent>() {
        /* renamed from: a */
        private static ShareMessengerGenericTemplateContent[] m42122a(int i) {
            return new ShareMessengerGenericTemplateContent[i];
        }

        /* renamed from: a */
        private static ShareMessengerGenericTemplateContent m42121a(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42121a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42122a(i);
        }
    };

    /* renamed from: a */
    public final boolean f37620a;

    /* renamed from: b */
    public final ImageAspectRatio f37621b;

    /* renamed from: c */
    public final ShareMessengerGenericTemplateElement f37622c;

    public enum ImageAspectRatio {
        HORIZONTAL,
        SQUARE
    }

    public final int describeContents() {
        return 0;
    }

    ShareMessengerGenericTemplateContent(Parcel parcel) {
        boolean z;
        super(parcel);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f37620a = z;
        this.f37621b = (ImageAspectRatio) parcel.readSerializable();
        this.f37622c = (ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f37620a ? (byte) 1 : 0);
        parcel.writeSerializable(this.f37621b);
        parcel.writeParcelable(this.f37622c, i);
    }
}
