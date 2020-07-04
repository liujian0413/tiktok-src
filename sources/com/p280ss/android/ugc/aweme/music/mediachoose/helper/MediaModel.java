package com.p280ss.android.ugc.aweme.music.mediachoose.helper;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.C1642a;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel */
public class MediaModel implements Parcelable, Comparable<MediaModel> {
    public static final Creator<MediaModel> CREATOR = new Creator<MediaModel>() {
        /* renamed from: a */
        private static MediaModel[] m108964a(int i) {
            return new MediaModel[i];
        }

        /* renamed from: a */
        private static MediaModel m108963a(Parcel parcel) {
            return new MediaModel(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m108963a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m108964a(i);
        }
    };

    /* renamed from: a */
    public long f88155a;

    /* renamed from: b */
    public String f88156b;

    /* renamed from: c */
    public long f88157c;

    /* renamed from: d */
    public int f88158d;

    /* renamed from: e */
    public long f88159e;

    /* renamed from: f */
    public long f88160f;

    /* renamed from: g */
    public String f88161g;

    /* renamed from: h */
    public String f88162h;

    /* renamed from: i */
    public int f88163i;

    /* renamed from: j */
    public int f88164j;

    /* renamed from: k */
    public double f88165k;

    /* renamed from: l */
    public double f88166l;

    /* renamed from: m */
    public int f88167m;

    /* renamed from: n */
    public int f88168n;

    /* renamed from: o */
    private long f88169o;

    /* renamed from: a */
    public long mo86198a() {
        return this.f88169o;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: c */
    public final boolean mo86201c() {
        if (this.f88158d == 4) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.valueOf(this.f88155a).hashCode();
    }

    /* renamed from: b */
    public final String mo86200b() {
        if (this.f88165k == 0.0d || this.f88166l == 0.0d) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(this.f88166l)}));
        sb.append(",");
        sb.append(C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(this.f88165k)}));
        return sb.toString();
    }

    public MediaModel(long j) {
        this.f88155a = j;
    }

    /* renamed from: a */
    public void mo86199a(long j) {
        this.f88169o = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compareTo(MediaModel mediaModel) {
        if (this.f88157c > mediaModel.f88157c) {
            return -1;
        }
        if (this.f88157c < mediaModel.f88157c) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaModel) || obj == null || this.f88155a != ((MediaModel) obj).f88155a) {
            return false;
        }
        return true;
    }

    protected MediaModel(Parcel parcel) {
        this.f88155a = parcel.readLong();
        this.f88156b = parcel.readString();
        this.f88157c = parcel.readLong();
        this.f88158d = parcel.readInt();
        this.f88159e = parcel.readLong();
        this.f88160f = parcel.readLong();
        this.f88161g = parcel.readString();
        this.f88162h = parcel.readString();
        this.f88163i = parcel.readInt();
        this.f88164j = parcel.readInt();
        this.f88165k = parcel.readDouble();
        this.f88166l = parcel.readDouble();
        this.f88167m = parcel.readInt();
        this.f88168n = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f88155a);
        parcel.writeString(this.f88156b);
        parcel.writeLong(this.f88157c);
        parcel.writeInt(this.f88158d);
        parcel.writeLong(this.f88159e);
        parcel.writeLong(this.f88160f);
        parcel.writeString(this.f88161g);
        parcel.writeString(this.f88162h);
        parcel.writeInt(this.f88163i);
        parcel.writeInt(this.f88164j);
        parcel.writeDouble(this.f88165k);
        parcel.writeDouble(this.f88166l);
        parcel.writeInt(this.f88167m);
        parcel.writeInt(this.f88168n);
    }
}
