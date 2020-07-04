package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {
    public static final Creator<ShareStoryContent> CREATOR = new Creator<ShareStoryContent>() {
        /* renamed from: a */
        private static ShareStoryContent[] m42173a(int i) {
            return new ShareStoryContent[i];
        }

        /* renamed from: a */
        private static ShareStoryContent m42172a(Parcel parcel) {
            return new ShareStoryContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42172a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42173a(i);
        }
    };

    /* renamed from: a */
    public final ShareMedia f37653a;

    /* renamed from: b */
    public final SharePhoto f37654b;

    /* renamed from: c */
    public final String f37655c;

    /* renamed from: d */
    private final List<String> f37656d;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final List<String> mo36809a() {
        if (this.f37656d == null) {
            return null;
        }
        return Collections.unmodifiableList(this.f37656d);
    }

    /* renamed from: a */
    private static List<String> m42170a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    ShareStoryContent(Parcel parcel) {
        super(parcel);
        this.f37653a = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.f37654b = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        this.f37656d = m42170a(parcel);
        this.f37655c = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f37653a, 0);
        parcel.writeParcelable(this.f37654b, 0);
        parcel.writeStringList(this.f37656d);
        parcel.writeString(this.f37655c);
    }
}
