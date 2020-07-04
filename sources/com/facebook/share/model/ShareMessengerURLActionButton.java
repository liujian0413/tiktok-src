package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Creator<ShareMessengerURLActionButton> CREATOR = new Creator<ShareMessengerURLActionButton>() {
        /* renamed from: a */
        private static ShareMessengerURLActionButton[] m42130a(int i) {
            return new ShareMessengerURLActionButton[i];
        }

        /* renamed from: a */
        private static ShareMessengerURLActionButton m42129a(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42129a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42130a(i);
        }
    };

    /* renamed from: b */
    public final Uri f37634b;

    /* renamed from: c */
    public final Uri f37635c;

    /* renamed from: d */
    public final boolean f37636d;

    /* renamed from: e */
    public final boolean f37637e;

    /* renamed from: f */
    public final WebviewHeightRatio f37638f;

    public enum WebviewHeightRatio {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    ShareMessengerURLActionButton(Parcel parcel) {
        boolean z;
        super(parcel);
        this.f37634b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f37636d = z;
        this.f37635c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f37638f = (WebviewHeightRatio) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f37637e = z2;
    }
}
