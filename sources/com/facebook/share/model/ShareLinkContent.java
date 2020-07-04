package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent.C14561a;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, C14565a> {
    public static final Creator<ShareLinkContent> CREATOR = new Creator<ShareLinkContent>() {
        /* renamed from: a */
        private static ShareLinkContent[] m42106a(int i) {
            return new ShareLinkContent[i];
        }

        /* renamed from: a */
        private static ShareLinkContent m42105a(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42105a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42106a(i);
        }
    };

    /* renamed from: a */
    public final String f37607a;

    /* renamed from: b */
    public final String f37608b;

    /* renamed from: c */
    public final Uri f37609c;

    /* renamed from: d */
    public final String f37610d;

    /* renamed from: com.facebook.share.model.ShareLinkContent$a */
    public static final class C14565a extends C14561a<ShareLinkContent, C14565a> {

        /* renamed from: g */
        static final String f37611g = "ShareLinkContent$a";

        /* renamed from: h */
        public String f37612h;

        /* renamed from: i */
        public String f37613i;

        /* renamed from: j */
        public Uri f37614j;

        /* renamed from: k */
        public String f37615k;

        /* renamed from: b */
        private C14565a m42108b(Uri uri) {
            return this;
        }

        /* renamed from: b */
        private C14565a m42109b(String str) {
            return this;
        }

        /* renamed from: c */
        private C14565a m42110c(String str) {
            return this;
        }

        /* renamed from: a */
        public final ShareLinkContent mo36757a() {
            return new ShareLinkContent(this);
        }

        /* renamed from: a */
        public final C14565a mo36756a(String str) {
            this.f37615k = str;
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C14565a mo36747a(ShareLinkContent shareLinkContent) {
            if (shareLinkContent == null) {
                return this;
            }
            return ((C14565a) super.mo36747a(shareLinkContent)).m42109b(shareLinkContent.f37607a).m42108b(shareLinkContent.f37609c).m42110c(shareLinkContent.f37608b).mo36756a(shareLinkContent.f37610d);
        }
    }

    public final int describeContents() {
        return 0;
    }

    private ShareLinkContent(C14565a aVar) {
        super((C14561a) aVar);
        this.f37607a = aVar.f37612h;
        this.f37608b = aVar.f37613i;
        this.f37609c = aVar.f37614j;
        this.f37610d = aVar.f37615k;
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.f37607a = parcel.readString();
        this.f37608b = parcel.readString();
        this.f37609c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f37610d = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f37607a);
        parcel.writeString(this.f37608b);
        parcel.writeParcelable(this.f37609c, 0);
        parcel.writeString(this.f37610d);
    }
}
