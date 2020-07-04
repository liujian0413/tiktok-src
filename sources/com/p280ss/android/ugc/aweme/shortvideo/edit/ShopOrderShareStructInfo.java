package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo */
public class ShopOrderShareStructInfo implements Parcelable, Serializable {
    public static final Creator<ShopOrderShareStructInfo> CREATOR = new Creator<ShopOrderShareStructInfo>() {
        /* renamed from: a */
        private static ShopOrderShareStructInfo[] m125838a(int i) {
            return new ShopOrderShareStructInfo[i];
        }

        /* renamed from: a */
        private static ShopOrderShareStructInfo m125837a(Parcel parcel) {
            return new ShopOrderShareStructInfo(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m125837a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m125838a(i);
        }
    };
    ShopOrderShareStruct shopOrderShareStruct;
    String title;

    public ShopOrderShareStructInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public ShopOrderShareStruct getShopOrderShareStruct() {
        return this.shopOrderShareStruct;
    }

    public String getTitle() {
        return this.title;
    }

    public void setShopOrderShareStruct(ShopOrderShareStruct shopOrderShareStruct2) {
        this.shopOrderShareStruct = shopOrderShareStruct2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    protected ShopOrderShareStructInfo(Parcel parcel) {
        this.shopOrderShareStruct = (ShopOrderShareStruct) parcel.readParcelable(ShopOrderShareStruct.class.getClassLoader());
        this.title = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.shopOrderShareStruct, i);
        parcel.writeString(this.title);
    }
}
