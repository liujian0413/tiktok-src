package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent.C14561a;
import com.facebook.share.model.SharePhoto.C14579a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SharePhotoContent extends ShareContent<SharePhotoContent, C14581a> {
    public static final Creator<SharePhotoContent> CREATOR = new Creator<SharePhotoContent>() {
        /* renamed from: a */
        private static SharePhotoContent[] m42163a(int i) {
            return new SharePhotoContent[i];
        }

        /* renamed from: a */
        private static SharePhotoContent m42162a(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42162a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42163a(i);
        }
    };

    /* renamed from: a */
    public final List<SharePhoto> f37651a;

    /* renamed from: com.facebook.share.model.SharePhotoContent$a */
    public static class C14581a extends C14561a<SharePhotoContent, C14581a> {

        /* renamed from: g */
        public final List<SharePhoto> f37652g = new ArrayList();

        /* renamed from: a */
        public final SharePhotoContent mo36808a() {
            return new SharePhotoContent(this);
        }

        /* renamed from: a */
        public final C14581a mo36747a(SharePhotoContent sharePhotoContent) {
            if (sharePhotoContent == null) {
                return this;
            }
            return ((C14581a) super.mo36747a(sharePhotoContent)).m42164b(sharePhotoContent.f37651a);
        }

        /* renamed from: b */
        private C14581a m42164b(List<SharePhoto> list) {
            if (list != null) {
                for (SharePhoto a : list) {
                    mo36805a(a);
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C14581a mo36805a(SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.f37652g.add(new C14579a().mo36762a(sharePhoto).mo36801a());
            }
            return this;
        }

        /* renamed from: a */
        public final C14581a mo36807a(List<SharePhoto> list) {
            this.f37652g.clear();
            m42164b(list);
            return this;
        }
    }

    public final int describeContents() {
        return 0;
    }

    SharePhotoContent(Parcel parcel) {
        super(parcel);
        this.f37651a = Collections.unmodifiableList(C14579a.m42155c(parcel));
    }

    private SharePhotoContent(C14581a aVar) {
        super((C14561a) aVar);
        this.f37651a = Collections.unmodifiableList(aVar.f37652g);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C14579a.m42154a(parcel, i, this.f37651a);
    }
}
