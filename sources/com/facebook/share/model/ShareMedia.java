package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public abstract class ShareMedia implements ShareModel {

    /* renamed from: a */
    private final Bundle f37616a;

    public enum Type {
        PHOTO,
        VIDEO
    }

    /* renamed from: com.facebook.share.model.ShareMedia$a */
    public static abstract class C14566a<M extends ShareMedia, B extends C14566a> {

        /* renamed from: a */
        public Bundle f37617a = new Bundle();

        /* renamed from: a */
        private B m42116a(Bundle bundle) {
            this.f37617a.putAll(bundle);
            return this;
        }

        /* renamed from: a */
        public B mo36762a(M m) {
            if (m == null) {
                return this;
            }
            return m42116a(m.mo36758a());
        }

        /* renamed from: a */
        static List<ShareMedia> m42117a(Parcel parcel) {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
            ArrayList arrayList = new ArrayList(readParcelableArray.length);
            for (Parcelable parcelable : readParcelableArray) {
                arrayList.add((ShareMedia) parcelable);
            }
            return arrayList;
        }
    }

    /* renamed from: b */
    public abstract Type mo36759b();

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final Bundle mo36758a() {
        return new Bundle(this.f37616a);
    }

    ShareMedia(Parcel parcel) {
        this.f37616a = parcel.readBundle();
    }

    protected ShareMedia(C14566a aVar) {
        this.f37616a = new Bundle(aVar.f37617a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f37616a);
    }
}
