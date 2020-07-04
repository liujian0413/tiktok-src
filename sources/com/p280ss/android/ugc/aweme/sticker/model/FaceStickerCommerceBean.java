package com.p280ss.android.ugc.aweme.sticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean */
public class FaceStickerCommerceBean implements Parcelable {
    public static final Creator<FaceStickerCommerceBean> CREATOR = new Creator<FaceStickerCommerceBean>() {
        /* renamed from: a */
        private static FaceStickerCommerceBean[] m133123a(int i) {
            return new FaceStickerCommerceBean[i];
        }

        /* renamed from: a */
        private static FaceStickerCommerceBean m133122a(Parcel parcel) {
            return new FaceStickerCommerceBean(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m133122a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m133123a(i);
        }
    };
    @C6593c(mo15949a = "commerce_sticker_web_url")

    /* renamed from: a */
    public String f108864a;
    @C6593c(mo15949a = "commerce_sticker_open_url")

    /* renamed from: b */
    public String f108865b;
    @C6593c(mo15949a = "commerce_sticker_buy_text")

    /* renamed from: c */
    public String f108866c;
    @C6593c(mo15949a = "commerce_sticker_type")

    /* renamed from: d */
    public int f108867d;

    public int describeContents() {
        return 0;
    }

    protected FaceStickerCommerceBean(Parcel parcel) {
        this.f108864a = parcel.readString();
        this.f108865b = parcel.readString();
        this.f108866c = parcel.readString();
        this.f108867d = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f108864a);
        parcel.writeString(this.f108865b);
        parcel.writeString(this.f108866c);
        parcel.writeInt(this.f108867d);
    }
}
