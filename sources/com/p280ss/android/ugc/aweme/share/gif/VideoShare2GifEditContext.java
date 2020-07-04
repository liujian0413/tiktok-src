package com.p280ss.android.ugc.aweme.share.gif;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext */
public class VideoShare2GifEditContext implements Parcelable {
    public static final Creator<VideoShare2GifEditContext> CREATOR = new Creator<VideoShare2GifEditContext>() {
        /* renamed from: a */
        private static VideoShare2GifEditContext[] m121411a(int i) {
            return new VideoShare2GifEditContext[i];
        }

        /* renamed from: a */
        private static VideoShare2GifEditContext m121410a(Parcel parcel) {
            return new VideoShare2GifEditContext(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m121410a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m121411a(i);
        }
    };

    /* renamed from: a */
    public String f99031a;

    /* renamed from: b */
    public String f99032b;

    /* renamed from: c */
    public boolean f99033c;

    /* renamed from: d */
    public int f99034d;

    /* renamed from: e */
    public String f99035e;

    /* renamed from: f */
    public String f99036f;

    /* renamed from: g */
    public int f99037g;

    /* renamed from: h */
    public int f99038h;

    /* renamed from: i */
    public int f99039i;

    /* renamed from: j */
    public int f99040j;

    /* renamed from: k */
    public float f99041k;

    /* renamed from: l */
    public float f99042l;

    /* renamed from: m */
    public long f99043m;

    /* renamed from: n */
    public long f99044n;

    /* renamed from: o */
    public int f99045o;

    /* renamed from: p */
    public String f99046p;

    /* renamed from: q */
    public String f99047q;

    /* renamed from: r */
    public String f99048r;

    public VideoShare2GifEditContext() {
    }

    public int describeContents() {
        return 0;
    }

    protected VideoShare2GifEditContext(Parcel parcel) {
        boolean z;
        this.f99031a = parcel.readString();
        this.f99032b = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f99033c = z;
        this.f99035e = parcel.readString();
        this.f99037g = parcel.readInt();
        this.f99038h = parcel.readInt();
        this.f99039i = parcel.readInt();
        this.f99040j = parcel.readInt();
        this.f99041k = parcel.readFloat();
        this.f99042l = parcel.readFloat();
        this.f99046p = parcel.readString();
        this.f99047q = parcel.readString();
        this.f99048r = parcel.readString();
        this.f99043m = parcel.readLong();
        this.f99044n = parcel.readLong();
        this.f99045o = parcel.readInt();
        this.f99034d = parcel.readInt();
        this.f99036f = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f99031a);
        parcel.writeString(this.f99032b);
        parcel.writeByte(this.f99033c ? (byte) 1 : 0);
        parcel.writeString(this.f99035e);
        parcel.writeInt(this.f99037g);
        parcel.writeInt(this.f99038h);
        parcel.writeInt(this.f99039i);
        parcel.writeInt(this.f99040j);
        parcel.writeFloat(this.f99041k);
        parcel.writeFloat(this.f99042l);
        parcel.writeString(this.f99046p);
        parcel.writeString(this.f99047q);
        parcel.writeString(this.f99048r);
        parcel.writeLong(this.f99043m);
        parcel.writeLong(this.f99044n);
        parcel.writeInt(this.f99045o);
        parcel.writeInt(this.f99034d);
        parcel.writeString(this.f99036f);
    }
}
