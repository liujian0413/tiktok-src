package com.bytedance.android.livesdkapi.depend.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import java.util.List;

public class ChargeDeal implements Parcelable {
    public static final Creator<ChargeDeal> CREATOR = new Creator<ChargeDeal>() {
        /* renamed from: a */
        private static ChargeDeal[] m27774a(int i) {
            return new ChargeDeal[i];
        }

        /* renamed from: a */
        private static ChargeDeal m27773a(Parcel parcel) {
            return new ChargeDeal(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m27773a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m27774a(i);
        }
    };
    @C6593c(mo15949a = "id")

    /* renamed from: a */
    public long f25515a;
    @C6593c(mo15949a = "exchange_price")

    /* renamed from: b */
    public int f25516b;
    @C6593c(mo15949a = "price")

    /* renamed from: c */
    public int f25517c;
    @C6593c(mo15949a = "describe")

    /* renamed from: d */
    public String f25518d = "";
    @C6593c(mo15949a = "diamond_count")

    /* renamed from: e */
    public int f25519e;
    @C6593c(mo15949a = "giving_count")

    /* renamed from: f */
    public int f25520f;
    @C6593c(mo15949a = "iap_id")

    /* renamed from: g */
    public String f25521g;
    @C6593c(mo15949a = "currency_price")

    /* renamed from: h */
    public List<CurrencyPrice> f25522h;

    /* renamed from: i */
    public int f25523i;

    /* renamed from: j */
    public boolean f25524j;

    /* renamed from: k */
    public transient HsSkuDetail f25525k;

    public static class CurrencyPrice implements Parcelable {
        public static final Creator<CurrencyPrice> CREATOR = new Creator<CurrencyPrice>() {
            /* renamed from: a */
            private static CurrencyPrice[] m27776a(int i) {
                return new CurrencyPrice[i];
            }

            /* renamed from: a */
            private static CurrencyPrice m27775a(Parcel parcel) {
                return new CurrencyPrice(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m27775a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m27776a(i);
            }
        };
        @C6593c(mo15949a = "currency")

        /* renamed from: a */
        public String f25526a;
        @C6593c(mo15949a = "price")

        /* renamed from: b */
        public String f25527b;
        @C6593c(mo15949a = "price_show_form")

        /* renamed from: c */
        public String f25528c;

        public int describeContents() {
            return 0;
        }

        protected CurrencyPrice(Parcel parcel) {
            this.f25526a = parcel.readString();
            this.f25527b = parcel.readString();
            this.f25528c = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f25526a);
            parcel.writeString(this.f25527b);
            parcel.writeString(this.f25528c);
        }
    }

    public static class HsSkuDetail implements Parcelable {
        public static final Creator<HsSkuDetail> CREATOR = new Creator<HsSkuDetail>() {
            /* renamed from: a */
            private static HsSkuDetail[] m27778a(int i) {
                return new HsSkuDetail[i];
            }

            /* renamed from: a */
            private static HsSkuDetail m27777a(Parcel parcel) {
                return new HsSkuDetail(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m27777a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m27778a(i);
            }
        };

        /* renamed from: a */
        public final String f25529a;

        /* renamed from: b */
        public final String f25530b;

        /* renamed from: c */
        public final String f25531c;

        /* renamed from: d */
        public final String f25532d;

        /* renamed from: e */
        public final String f25533e;

        /* renamed from: f */
        public final String f25534f;

        public int describeContents() {
            return 0;
        }

        protected HsSkuDetail(Parcel parcel) {
            this.f25529a = parcel.readString();
            this.f25530b = parcel.readString();
            this.f25531c = parcel.readString();
            this.f25532d = parcel.readString();
            this.f25533e = parcel.readString();
            this.f25534f = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f25529a);
            parcel.writeString(this.f25530b);
            parcel.writeString(this.f25531c);
            parcel.writeString(this.f25532d);
            parcel.writeString(this.f25533e);
            parcel.writeString(this.f25534f);
        }

        public HsSkuDetail(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f25529a = str;
            this.f25530b = str2;
            this.f25531c = str3;
            this.f25532d = str4;
            this.f25533e = str5;
            this.f25534f = str6;
        }
    }

    public int describeContents() {
        return 0;
    }

    public ChargeDeal() {
    }

    protected ChargeDeal(Parcel parcel) {
        boolean z;
        this.f25515a = parcel.readLong();
        this.f25516b = parcel.readInt();
        this.f25517c = parcel.readInt();
        this.f25518d = parcel.readString();
        this.f25519e = parcel.readInt();
        this.f25520f = parcel.readInt();
        this.f25521g = parcel.readString();
        this.f25522h = parcel.createTypedArrayList(CurrencyPrice.CREATOR);
        this.f25523i = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f25524j = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f25515a);
        parcel.writeInt(this.f25516b);
        parcel.writeInt(this.f25517c);
        parcel.writeString(this.f25518d);
        parcel.writeInt(this.f25519e);
        parcel.writeInt(this.f25520f);
        parcel.writeString(this.f25521g);
        parcel.writeTypedList(this.f25522h);
        parcel.writeInt(this.f25523i);
        parcel.writeByte(this.f25524j ? (byte) 1 : 0);
    }
}
