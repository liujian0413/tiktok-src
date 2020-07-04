package com.p280ss.android.ugc.aweme.i18n.draftcompat;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ugc.aweme.i18n.draftcompat.Segment */
public class Segment implements Parcelable, Cloneable {
    public static final Creator<Segment> CREATOR = new Creator<Segment>() {
        /* renamed from: a */
        private static Segment[] m99463a(int i) {
            return new Segment[i];
        }

        /* renamed from: a */
        private static Segment m99462a(Parcel parcel) {
            return new Segment(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m99462a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m99463a(i);
        }
    };

    /* renamed from: A */
    public String f79991A;

    /* renamed from: B */
    public long f79992B;

    /* renamed from: a */
    public int f79993a;

    /* renamed from: b */
    public String f79994b;

    /* renamed from: c */
    public String f79995c;

    /* renamed from: d */
    public String f79996d;

    /* renamed from: e */
    public String f79997e;

    /* renamed from: f */
    public boolean f79998f;

    /* renamed from: g */
    public boolean f79999g;

    /* renamed from: h */
    public int f80000h;

    /* renamed from: i */
    public String f80001i;

    /* renamed from: j */
    public String f80002j;

    /* renamed from: k */
    public String f80003k;

    /* renamed from: l */
    public String f80004l;

    /* renamed from: m */
    public String f80005m;

    /* renamed from: n */
    public boolean f80006n;

    /* renamed from: o */
    public int f80007o;

    /* renamed from: p */
    public int f80008p;

    /* renamed from: q */
    public int f80009q = 2;

    /* renamed from: r */
    public int f80010r;

    /* renamed from: s */
    public int f80011s;

    /* renamed from: t */
    public float f80012t;

    /* renamed from: u */
    public int f80013u;

    /* renamed from: v */
    public int f80014v;

    /* renamed from: w */
    public int f80015w;

    /* renamed from: x */
    public int f80016x;

    /* renamed from: y */
    public int f80017y;

    /* renamed from: z */
    public boolean f80018z;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final String mo80124a() {
        if (this.f79993a == 1) {
            return this.f79994b;
        }
        return this.f79996d;
    }

    protected Segment(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f79993a = parcel.readInt();
        this.f79994b = parcel.readString();
        this.f79995c = parcel.readString();
        this.f79996d = parcel.readString();
        this.f79997e = parcel.readString();
        boolean z4 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f79998f = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f79999g = z2;
        this.f80000h = parcel.readInt();
        this.f80001i = parcel.readString();
        this.f80002j = parcel.readString();
        this.f80003k = parcel.readString();
        this.f80004l = parcel.readString();
        this.f80005m = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f80006n = z3;
        this.f80007o = parcel.readInt();
        this.f80008p = parcel.readInt();
        this.f80009q = parcel.readInt();
        this.f80010r = parcel.readInt();
        this.f80011s = parcel.readInt();
        this.f80012t = parcel.readFloat();
        this.f80013u = parcel.readInt();
        this.f80014v = parcel.readInt();
        this.f80015w = parcel.readInt();
        this.f80016x = parcel.readInt();
        this.f80017y = parcel.readInt();
        if (parcel.readByte() != 0) {
            z4 = true;
        }
        this.f80018z = z4;
        this.f79991A = parcel.readString();
        this.f79992B = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f79993a);
        parcel.writeString(this.f79994b);
        parcel.writeString(this.f79995c);
        parcel.writeString(this.f79996d);
        parcel.writeString(this.f79997e);
        parcel.writeByte(this.f79998f ? (byte) 1 : 0);
        parcel.writeByte(this.f79999g ? (byte) 1 : 0);
        parcel.writeInt(this.f80000h);
        parcel.writeString(this.f80001i);
        parcel.writeString(this.f80002j);
        parcel.writeString(this.f80003k);
        parcel.writeString(this.f80004l);
        parcel.writeString(this.f80005m);
        parcel.writeByte(this.f80006n ? (byte) 1 : 0);
        parcel.writeInt(this.f80007o);
        parcel.writeInt(this.f80008p);
        parcel.writeInt(this.f80009q);
        parcel.writeInt(this.f80010r);
        parcel.writeInt(this.f80011s);
        parcel.writeFloat(this.f80012t);
        parcel.writeInt(this.f80013u);
        parcel.writeInt(this.f80014v);
        parcel.writeInt(this.f80015w);
        parcel.writeInt(this.f80016x);
        parcel.writeInt(this.f80017y);
        parcel.writeByte(this.f80018z ? (byte) 1 : 0);
        parcel.writeString(this.f79991A);
        parcel.writeLong(this.f79992B);
    }
}
