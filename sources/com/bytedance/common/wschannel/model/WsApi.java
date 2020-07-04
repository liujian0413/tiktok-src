package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class WsApi implements Parcelable {
    public static final Creator<WsApi> CREATOR = new Creator<WsApi>() {
        /* renamed from: a */
        private static WsApi[] m28993a(int i) {
            return new WsApi[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m28992a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m28993a(i);
        }

        /* renamed from: a */
        private static WsApi m28992a(Parcel parcel) {
            WsApi wsApi = new WsApi();
            wsApi.f26764a = parcel.readInt();
            wsApi.f26765b = parcel.readInt();
            return wsApi;
        }
    };

    /* renamed from: a */
    public int f26764a;

    /* renamed from: b */
    public int f26765b;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26764a);
        parcel.writeInt(this.f26765b);
    }
}
