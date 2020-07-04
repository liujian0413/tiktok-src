package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public class CameraEffectArguments implements ShareModel {
    public static final Creator<CameraEffectArguments> CREATOR = new Creator<CameraEffectArguments>() {
        /* renamed from: a */
        private static CameraEffectArguments[] m42076a(int i) {
            return new CameraEffectArguments[i];
        }

        /* renamed from: a */
        private static CameraEffectArguments m42075a(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42075a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42076a(i);
        }
    };

    /* renamed from: a */
    public final Bundle f37578a;

    /* renamed from: com.facebook.share.model.CameraEffectArguments$a */
    public static class C14556a {

        /* renamed from: a */
        public Bundle f37579a = new Bundle();

        /* renamed from: a */
        public final CameraEffectArguments mo36730a() {
            return new CameraEffectArguments(this);
        }

        /* renamed from: a */
        private C14556a m42077a(CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.f37579a.putAll(cameraEffectArguments.f37578a);
            }
            return this;
        }

        /* renamed from: a */
        public final C14556a mo36729a(Parcel parcel) {
            return m42077a((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final Set<String> mo36724a() {
        return this.f37578a.keySet();
    }

    private CameraEffectArguments(C14556a aVar) {
        this.f37578a = aVar.f37579a;
    }

    /* renamed from: a */
    public final Object mo36723a(String str) {
        return this.f37578a.get(str);
    }

    CameraEffectArguments(Parcel parcel) {
        this.f37578a = parcel.readBundle(getClass().getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f37578a);
    }
}
