package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.C14577a;
import java.util.Set;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends C14577a> implements ShareModel {

    /* renamed from: a */
    private final Bundle f37641a;

    /* renamed from: com.facebook.share.model.ShareOpenGraphValueContainer$a */
    public static abstract class C14577a<P extends ShareOpenGraphValueContainer, E extends C14577a> {

        /* renamed from: a */
        public Bundle f37642a = new Bundle();

        /* renamed from: a */
        public E mo36784a(P p) {
            if (p != null) {
                this.f37642a.putAll(p.mo36790b());
            }
            return this;
        }

        /* renamed from: a */
        public final E mo36795a(String str, String str2) {
            this.f37642a.putString(str, str2);
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: c */
    public final Set<String> mo36792c() {
        return this.f37641a.keySet();
    }

    /* renamed from: b */
    public final Bundle mo36790b() {
        return (Bundle) this.f37641a.clone();
    }

    /* renamed from: a */
    public final Object mo36789a(String str) {
        return this.f37641a.get(str);
    }

    /* renamed from: b */
    public final String mo36791b(String str) {
        return this.f37641a.getString(str);
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.f37641a = parcel.readBundle(C14577a.class.getClassLoader());
    }

    protected ShareOpenGraphValueContainer(C14577a<P, E> aVar) {
        this.f37641a = (Bundle) aVar.f37642a.clone();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f37641a);
    }
}
