package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.CameraEffectArguments.C14556a;
import com.facebook.share.model.CameraEffectTextures.C14558a;

public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {
    public static final Creator<ShareCameraEffectContent> CREATOR = new Creator<ShareCameraEffectContent>() {
        /* renamed from: a */
        private static ShareCameraEffectContent[] m42091a(int i) {
            return new ShareCameraEffectContent[i];
        }

        /* renamed from: a */
        private static ShareCameraEffectContent m42090a(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42090a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42091a(i);
        }
    };

    /* renamed from: a */
    public String f37590a;

    /* renamed from: b */
    public CameraEffectArguments f37591b;

    /* renamed from: c */
    public CameraEffectTextures f37592c;

    ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.f37590a = parcel.readString();
        this.f37591b = new C14556a().mo36729a(parcel).mo36730a();
        this.f37592c = new C14558a().mo36738a(parcel).mo36739a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f37590a);
        parcel.writeParcelable(this.f37591b, 0);
        parcel.writeParcelable(this.f37592c, 0);
    }
}
