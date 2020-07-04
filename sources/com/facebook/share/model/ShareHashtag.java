package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class ShareHashtag implements ShareModel {
    public static final Creator<ShareHashtag> CREATOR = new Creator<ShareHashtag>() {
        /* renamed from: a */
        private static ShareHashtag[] m42100a(int i) {
            return new ShareHashtag[i];
        }

        /* renamed from: a */
        private static ShareHashtag m42099a(Parcel parcel) {
            return new ShareHashtag(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42099a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42100a(i);
        }
    };

    /* renamed from: a */
    public final String f37605a;

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    public static class C14563a {

        /* renamed from: a */
        public String f37606a;

        /* renamed from: a */
        public final ShareHashtag mo36753a() {
            return new ShareHashtag(this);
        }

        /* renamed from: a */
        private C14563a m42102a(String str) {
            this.f37606a = str;
            return this;
        }

        /* renamed from: a */
        private C14563a m42101a(ShareHashtag shareHashtag) {
            if (shareHashtag == null) {
                return this;
            }
            return m42102a(shareHashtag.f37605a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C14563a mo36752a(Parcel parcel) {
            return m42101a((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }
    }

    public int describeContents() {
        return 0;
    }

    private ShareHashtag(C14563a aVar) {
        this.f37605a = aVar.f37606a;
    }

    ShareHashtag(Parcel parcel) {
        this.f37605a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37605a);
    }
}
