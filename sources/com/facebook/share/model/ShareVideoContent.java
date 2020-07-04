package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent.C14561a;
import com.facebook.share.model.SharePhoto.C14579a;
import com.facebook.share.model.ShareVideo.C14584a;

public final class ShareVideoContent extends ShareContent<ShareVideoContent, C14586a> implements ShareModel {
    public static final Creator<ShareVideoContent> CREATOR = new Creator<ShareVideoContent>() {
        /* renamed from: a */
        private static ShareVideoContent[] m42183a(int i) {
            return new ShareVideoContent[i];
        }

        /* renamed from: a */
        private static ShareVideoContent m42182a(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42182a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42183a(i);
        }
    };

    /* renamed from: a */
    public final String f37659a;

    /* renamed from: b */
    public final String f37660b;

    /* renamed from: c */
    public final SharePhoto f37661c;

    /* renamed from: d */
    public final ShareVideo f37662d;

    /* renamed from: com.facebook.share.model.ShareVideoContent$a */
    public static final class C14586a extends C14561a<ShareVideoContent, C14586a> {

        /* renamed from: g */
        public String f37663g;

        /* renamed from: h */
        public String f37664h;

        /* renamed from: i */
        public SharePhoto f37665i;

        /* renamed from: j */
        public ShareVideo f37666j;

        /* renamed from: a */
        public final ShareVideoContent mo36821a() {
            return new ShareVideoContent(this);
        }

        /* renamed from: a */
        private C14586a m42186a(String str) {
            this.f37663g = str;
            return this;
        }

        /* renamed from: b */
        private C14586a m42187b(String str) {
            this.f37664h = str;
            return this;
        }

        /* renamed from: a */
        private C14586a m42184a(SharePhoto sharePhoto) {
            SharePhoto sharePhoto2;
            if (sharePhoto == null) {
                sharePhoto2 = null;
            } else {
                sharePhoto2 = new C14579a().mo36762a(sharePhoto).mo36801a();
            }
            this.f37665i = sharePhoto2;
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C14586a mo36747a(ShareVideoContent shareVideoContent) {
            if (shareVideoContent == null) {
                return this;
            }
            return ((C14586a) super.mo36747a(shareVideoContent)).m42186a(shareVideoContent.f37659a).m42187b(shareVideoContent.f37660b).m42184a(shareVideoContent.f37661c).mo36820a(shareVideoContent.f37662d);
        }

        /* renamed from: a */
        public final C14586a mo36820a(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            this.f37666j = new C14584a().mo36762a(shareVideo).mo36816a();
            return this;
        }
    }

    public final int describeContents() {
        return 0;
    }

    private ShareVideoContent(C14586a aVar) {
        super((C14561a) aVar);
        this.f37659a = aVar.f37663g;
        this.f37660b = aVar.f37664h;
        this.f37661c = aVar.f37665i;
        this.f37662d = aVar.f37666j;
    }

    ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.f37659a = parcel.readString();
        this.f37660b = parcel.readString();
        C14579a b = new C14579a().mo36802b(parcel);
        if (b.f37648c == null && b.f37647b == null) {
            this.f37661c = null;
        } else {
            this.f37661c = b.mo36801a();
        }
        this.f37662d = new C14584a().mo36817b(parcel).mo36816a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f37659a);
        parcel.writeString(this.f37660b);
        parcel.writeParcelable(this.f37661c, 0);
        parcel.writeParcelable(this.f37662d, 0);
    }
}
