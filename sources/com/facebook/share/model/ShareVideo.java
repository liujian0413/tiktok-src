package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia.C14566a;
import com.facebook.share.model.ShareMedia.Type;

public final class ShareVideo extends ShareMedia {
    public static final Creator<ShareVideo> CREATOR = new Creator<ShareVideo>() {
        /* renamed from: a */
        private static ShareVideo[] m42176a(int i) {
            return new ShareVideo[i];
        }

        /* renamed from: a */
        private static ShareVideo m42175a(Parcel parcel) {
            return new ShareVideo(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42175a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42176a(i);
        }
    };

    /* renamed from: a */
    public final Uri f37657a;

    /* renamed from: com.facebook.share.model.ShareVideo$a */
    public static final class C14584a extends C14566a<ShareVideo, C14584a> {

        /* renamed from: b */
        public Uri f37658b;

        /* renamed from: a */
        public final ShareVideo mo36816a() {
            return new ShareVideo(this);
        }

        /* renamed from: a */
        public final C14584a mo36814a(Uri uri) {
            this.f37658b = uri;
            return this;
        }

        /* renamed from: a */
        public final C14584a mo36762a(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            return ((C14584a) super.mo36762a(shareVideo)).mo36814a(shareVideo.f37657a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C14584a mo36817b(Parcel parcel) {
            return mo36762a((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }
    }

    /* renamed from: b */
    public final Type mo36759b() {
        return Type.VIDEO;
    }

    public final int describeContents() {
        return 0;
    }

    private ShareVideo(C14584a aVar) {
        super((C14566a) aVar);
        this.f37657a = aVar.f37658b;
    }

    ShareVideo(Parcel parcel) {
        super(parcel);
        this.f37657a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f37657a, 0);
    }
}
