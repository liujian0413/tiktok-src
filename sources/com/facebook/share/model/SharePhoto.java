package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia.C14566a;
import com.facebook.share.model.ShareMedia.Type;
import java.util.ArrayList;
import java.util.List;

public final class SharePhoto extends ShareMedia {
    public static final Creator<SharePhoto> CREATOR = new Creator<SharePhoto>() {
        /* renamed from: a */
        private static SharePhoto[] m42151a(int i) {
            return new SharePhoto[i];
        }

        /* renamed from: a */
        private static SharePhoto m42150a(Parcel parcel) {
            return new SharePhoto(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42150a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42151a(i);
        }
    };

    /* renamed from: a */
    public final Bitmap f37643a;

    /* renamed from: b */
    public final Uri f37644b;

    /* renamed from: c */
    public final boolean f37645c;

    /* renamed from: d */
    public final String f37646d;

    /* renamed from: com.facebook.share.model.SharePhoto$a */
    public static final class C14579a extends C14566a<SharePhoto, C14579a> {

        /* renamed from: b */
        public Bitmap f37647b;

        /* renamed from: c */
        public Uri f37648c;

        /* renamed from: d */
        public boolean f37649d;

        /* renamed from: e */
        public String f37650e;

        /* renamed from: a */
        public final SharePhoto mo36801a() {
            return new SharePhoto(this);
        }

        /* renamed from: a */
        private C14579a m42152a(String str) {
            this.f37650e = str;
            return this;
        }

        /* renamed from: a */
        private C14579a m42153a(boolean z) {
            this.f37649d = z;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C14579a mo36802b(Parcel parcel) {
            return mo36762a((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        /* renamed from: c */
        static List<SharePhoto> m42155c(Parcel parcel) {
            List<ShareMedia> a = m42117a(parcel);
            ArrayList arrayList = new ArrayList();
            for (ShareMedia shareMedia : a) {
                if (shareMedia instanceof SharePhoto) {
                    arrayList.add((SharePhoto) shareMedia);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public final C14579a mo36798a(Bitmap bitmap) {
            this.f37647b = bitmap;
            return this;
        }

        /* renamed from: a */
        public final C14579a mo36799a(Uri uri) {
            this.f37648c = uri;
            return this;
        }

        /* renamed from: a */
        public final C14579a mo36762a(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                return this;
            }
            return ((C14579a) super.mo36762a(sharePhoto)).mo36798a(sharePhoto.f37643a).mo36799a(sharePhoto.f37644b).m42153a(sharePhoto.f37645c).m42152a(sharePhoto.f37646d);
        }

        /* renamed from: a */
        static void m42154a(Parcel parcel, int i, List<SharePhoto> list) {
            ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                shareMediaArr[i2] = (ShareMedia) list.get(i2);
            }
            parcel.writeParcelableArray(shareMediaArr, i);
        }
    }

    /* renamed from: b */
    public final Type mo36759b() {
        return Type.PHOTO;
    }

    public final int describeContents() {
        return 0;
    }

    private SharePhoto(C14579a aVar) {
        super((C14566a) aVar);
        this.f37643a = aVar.f37647b;
        this.f37644b = aVar.f37648c;
        this.f37645c = aVar.f37649d;
        this.f37646d = aVar.f37650e;
    }

    SharePhoto(Parcel parcel) {
        boolean z;
        super(parcel);
        this.f37643a = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f37644b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f37645c = z;
        this.f37646d = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f37643a, 0);
        parcel.writeParcelable(this.f37644b, 0);
        parcel.writeByte(this.f37645c ? (byte) 1 : 0);
        parcel.writeString(this.f37646d);
    }
}
