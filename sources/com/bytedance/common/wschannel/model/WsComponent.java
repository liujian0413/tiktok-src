package com.bytedance.common.wschannel.model;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class WsComponent implements Parcelable {
    public static final Creator<WsComponent> CREATOR = new Creator<WsComponent>() {
        /* renamed from: a */
        private static WsComponent[] m29010a(int i) {
            return new WsComponent[i];
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m29010a(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public WsComponent createFromParcel(Parcel parcel) {
            WsComponent wsComponent = new WsComponent();
            wsComponent.f26789a = (ComponentName) parcel.readParcelable(getClass().getClassLoader());
            wsComponent.f26790b = parcel.createTypedArrayList(WsApi.CREATOR);
            return wsComponent;
        }
    };

    /* renamed from: a */
    public ComponentName f26789a;

    /* renamed from: b */
    public List<WsApi> f26790b;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f26789a, i);
        parcel.writeTypedList(this.f26790b);
    }
}
