package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.vk.sdk.api.model.VKWallPostResult */
public class VKWallPostResult extends VKApiModel {
    public static Creator<VKWallPostResult> CREATOR = new Creator<VKWallPostResult>() {
        /* renamed from: a */
        private static VKWallPostResult[] m147646a(int i) {
            return new VKWallPostResult[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147645a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147646a(i);
        }

        /* renamed from: a */
        private static VKWallPostResult m147645a(Parcel parcel) {
            VKWallPostResult vKWallPostResult = new VKWallPostResult();
            vKWallPostResult.f121341a = parcel.readInt();
            return vKWallPostResult;
        }
    };

    /* renamed from: a */
    public int f121341a;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121341a);
    }
}
