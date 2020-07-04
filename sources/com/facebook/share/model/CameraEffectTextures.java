package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public class CameraEffectTextures implements ShareModel {
    public static final Creator<CameraEffectTextures> CREATOR = new Creator<CameraEffectTextures>() {
        /* renamed from: a */
        private static CameraEffectTextures[] m42084a(int i) {
            return new CameraEffectTextures[i];
        }

        /* renamed from: a */
        private static CameraEffectTextures m42083a(Parcel parcel) {
            return new CameraEffectTextures(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42083a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42084a(i);
        }
    };

    /* renamed from: a */
    public final Bundle f37580a;

    /* renamed from: com.facebook.share.model.CameraEffectTextures$a */
    public static class C14558a {

        /* renamed from: a */
        public Bundle f37581a = new Bundle();

        /* renamed from: a */
        public final CameraEffectTextures mo36739a() {
            return new CameraEffectTextures(this);
        }

        /* renamed from: a */
        private C14558a m42085a(CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.f37581a.putAll(cameraEffectTextures.f37580a);
            }
            return this;
        }

        /* renamed from: a */
        public final C14558a mo36738a(Parcel parcel) {
            return m42085a((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final Set<String> mo36732a() {
        return this.f37580a.keySet();
    }

    private CameraEffectTextures(C14558a aVar) {
        this.f37580a = aVar.f37581a;
    }

    /* renamed from: a */
    public final Bitmap mo36731a(String str) {
        Object obj = this.f37580a.get(str);
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    /* renamed from: b */
    public final Uri mo36733b(String str) {
        Object obj = this.f37580a.get(str);
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    CameraEffectTextures(Parcel parcel) {
        this.f37580a = parcel.readBundle(getClass().getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f37580a);
    }
}
