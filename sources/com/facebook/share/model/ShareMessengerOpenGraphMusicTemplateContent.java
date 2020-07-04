package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerOpenGraphMusicTemplateContent extends ShareContent<ShareMessengerOpenGraphMusicTemplateContent, Object> {
    public static final Creator<ShareMessengerOpenGraphMusicTemplateContent> CREATOR = new Creator<ShareMessengerOpenGraphMusicTemplateContent>() {
        /* renamed from: a */
        private static ShareMessengerOpenGraphMusicTemplateContent[] m42128a(int i) {
            return new ShareMessengerOpenGraphMusicTemplateContent[i];
        }

        /* renamed from: a */
        private static ShareMessengerOpenGraphMusicTemplateContent m42127a(Parcel parcel) {
            return new ShareMessengerOpenGraphMusicTemplateContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42127a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42128a(i);
        }
    };

    /* renamed from: a */
    public final Uri f37632a;

    /* renamed from: b */
    public final ShareMessengerActionButton f37633b;

    public final int describeContents() {
        return 0;
    }

    ShareMessengerOpenGraphMusicTemplateContent(Parcel parcel) {
        super(parcel);
        this.f37632a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f37633b = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f37632a, i);
        parcel.writeParcelable(this.f37633b, i);
    }
}
