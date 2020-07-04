package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzlg implements Parcelable {
    public static final Creator<zzlg> CREATOR = new blf();

    /* renamed from: A */
    private int f45710A;

    /* renamed from: a */
    public final int f45711a;

    /* renamed from: b */
    public final String f45712b;

    /* renamed from: c */
    public final String f45713c;

    /* renamed from: d */
    public final int f45714d;

    /* renamed from: e */
    public final List<byte[]> f45715e;

    /* renamed from: f */
    public final zznd f45716f;

    /* renamed from: g */
    public final int f45717g;

    /* renamed from: h */
    public final int f45718h;

    /* renamed from: i */
    public final float f45719i;

    /* renamed from: j */
    public final int f45720j;

    /* renamed from: k */
    public final float f45721k;

    /* renamed from: l */
    public final int f45722l;

    /* renamed from: m */
    public final int f45723m;

    /* renamed from: n */
    public final int f45724n;

    /* renamed from: o */
    public final long f45725o;

    /* renamed from: p */
    public final int f45726p;

    /* renamed from: q */
    public final String f45727q;

    /* renamed from: r */
    private final String f45728r;

    /* renamed from: s */
    private final zzpn f45729s;

    /* renamed from: t */
    private final String f45730t;

    /* renamed from: u */
    private final int f45731u;

    /* renamed from: v */
    private final byte[] f45732v;

    /* renamed from: w */
    private final zzta f45733w;

    /* renamed from: x */
    private final int f45734x;

    /* renamed from: y */
    private final int f45735y;

    /* renamed from: z */
    private final int f45736z;

    /* renamed from: a */
    public static zzlg m53190a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, zzta zzta, zznd zznd) {
        zzlg zzlg = new zzlg(str, null, str2, null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzta, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zznd, null);
        return zzlg;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static zzlg m53192a(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, zznd zznd, int i5, String str4) {
        return m53191a(str, str2, null, -1, -1, i3, i4, -1, null, null, 0, str4);
    }

    /* renamed from: a */
    public static zzlg m53191a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, zznd zznd, int i6, String str4) {
        zzlg zzlg = new zzlg(str, null, str2, null, -1, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, -1, -1, i6, str4, -1, Long.MAX_VALUE, list, zznd, null);
        return zzlg;
    }

    /* renamed from: a */
    public static zzlg m53194a(String str, String str2, String str3, int i, int i2, String str4, zznd zznd) {
        return m53193a(str, str2, null, -1, i2, str4, -1, zznd, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static zzlg m53193a(String str, String str2, String str3, int i, int i2, String str4, int i3, zznd zznd, long j, List<byte[]> list) {
        zzlg zzlg = new zzlg(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zznd, null);
        return zzlg;
    }

    /* renamed from: a */
    public static zzlg m53196a(String str, String str2, String str3, int i, List<byte[]> list, String str4, zznd zznd) {
        zzlg zzlg = new zzlg(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zznd, null);
        return zzlg;
    }

    /* renamed from: a */
    public static zzlg m53195a(String str, String str2, String str3, int i, zznd zznd) {
        zzlg zzlg = new zzlg(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
        return zzlg;
    }

    private zzlg(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzta zzta, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, zznd zznd, zzpn zzpn) {
        this.f45728r = str;
        this.f45730t = str2;
        this.f45713c = str3;
        this.f45712b = str4;
        this.f45711a = i;
        this.f45714d = i2;
        this.f45717g = i3;
        this.f45718h = i4;
        this.f45719i = f;
        this.f45720j = i5;
        this.f45721k = f2;
        this.f45732v = bArr;
        this.f45731u = i6;
        this.f45733w = zzta;
        this.f45722l = i7;
        this.f45723m = i8;
        this.f45724n = i9;
        this.f45734x = i10;
        this.f45735y = i11;
        this.f45726p = i12;
        this.f45727q = str5;
        this.f45736z = i13;
        this.f45725o = j;
        this.f45715e = list == null ? Collections.emptyList() : list;
        this.f45716f = zznd;
        this.f45729s = zzpn;
    }

    zzlg(Parcel parcel) {
        this.f45728r = parcel.readString();
        this.f45730t = parcel.readString();
        this.f45713c = parcel.readString();
        this.f45712b = parcel.readString();
        this.f45711a = parcel.readInt();
        this.f45714d = parcel.readInt();
        this.f45717g = parcel.readInt();
        this.f45718h = parcel.readInt();
        this.f45719i = parcel.readFloat();
        this.f45720j = parcel.readInt();
        this.f45721k = parcel.readFloat();
        this.f45732v = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f45731u = parcel.readInt();
        this.f45733w = (zzta) parcel.readParcelable(zzta.class.getClassLoader());
        this.f45722l = parcel.readInt();
        this.f45723m = parcel.readInt();
        this.f45724n = parcel.readInt();
        this.f45734x = parcel.readInt();
        this.f45735y = parcel.readInt();
        this.f45726p = parcel.readInt();
        this.f45727q = parcel.readString();
        this.f45736z = parcel.readInt();
        this.f45725o = parcel.readLong();
        int readInt = parcel.readInt();
        this.f45715e = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f45715e.add(parcel.createByteArray());
        }
        this.f45716f = (zznd) parcel.readParcelable(zznd.class.getClassLoader());
        this.f45729s = (zzpn) parcel.readParcelable(zzpn.class.getClassLoader());
    }

    /* renamed from: a */
    public final zzlg mo42350a(int i) {
        int i2 = i;
        zzlg zzlg = new zzlg(this.f45728r, this.f45730t, this.f45713c, this.f45712b, this.f45711a, i2, this.f45717g, this.f45718h, this.f45719i, this.f45720j, this.f45721k, this.f45732v, this.f45731u, this.f45733w, this.f45722l, this.f45723m, this.f45724n, this.f45734x, this.f45735y, this.f45726p, this.f45727q, this.f45736z, this.f45725o, this.f45715e, this.f45716f, this.f45729s);
        return zzlg;
    }

    /* renamed from: a */
    public final zzlg mo42352a(long j) {
        zzlg zzlg = new zzlg(this.f45728r, this.f45730t, this.f45713c, this.f45712b, this.f45711a, this.f45714d, this.f45717g, this.f45718h, this.f45719i, this.f45720j, this.f45721k, this.f45732v, this.f45731u, this.f45733w, this.f45722l, this.f45723m, this.f45724n, this.f45734x, this.f45735y, this.f45726p, this.f45727q, this.f45736z, j, this.f45715e, this.f45716f, this.f45729s);
        return zzlg;
    }

    /* renamed from: a */
    public final zzlg mo42351a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        zzlg zzlg = new zzlg(this.f45728r, this.f45730t, this.f45713c, this.f45712b, this.f45711a, this.f45714d, this.f45717g, this.f45718h, this.f45719i, this.f45720j, this.f45721k, this.f45732v, this.f45731u, this.f45733w, this.f45722l, this.f45723m, this.f45724n, i3, i4, this.f45726p, this.f45727q, this.f45736z, this.f45725o, this.f45715e, this.f45716f, this.f45729s);
        return zzlg;
    }

    /* renamed from: a */
    public final zzlg mo42353a(zzpn zzpn) {
        zzpn zzpn2 = zzpn;
        zzlg zzlg = new zzlg(this.f45728r, this.f45730t, this.f45713c, this.f45712b, this.f45711a, this.f45714d, this.f45717g, this.f45718h, this.f45719i, this.f45720j, this.f45721k, this.f45732v, this.f45731u, this.f45733w, this.f45722l, this.f45723m, this.f45724n, this.f45734x, this.f45735y, this.f45726p, this.f45727q, this.f45736z, this.f45725o, this.f45715e, this.f45716f, zzpn2);
        return zzlg;
    }

    /* renamed from: a */
    public final int mo42349a() {
        if (this.f45717g == -1 || this.f45718h == -1) {
            return -1;
        }
        return this.f45717g * this.f45718h;
    }

    /* renamed from: b */
    public final MediaFormat mo42354b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f45713c);
        String str = "language";
        String str2 = this.f45727q;
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
        m53197a(mediaFormat, "max-input-size", this.f45714d);
        m53197a(mediaFormat, "width", this.f45717g);
        m53197a(mediaFormat, "height", this.f45718h);
        String str3 = "frame-rate";
        float f = this.f45719i;
        if (f != -1.0f) {
            mediaFormat.setFloat(str3, f);
        }
        m53197a(mediaFormat, "rotation-degrees", this.f45720j);
        m53197a(mediaFormat, "channel-count", this.f45722l);
        m53197a(mediaFormat, "sample-rate", this.f45723m);
        m53197a(mediaFormat, "encoder-delay", this.f45734x);
        m53197a(mediaFormat, "encoder-padding", this.f45735y);
        for (int i = 0; i < this.f45715e.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) this.f45715e.get(i)));
        }
        zzta zzta = this.f45733w;
        if (zzta != null) {
            m53197a(mediaFormat, "color-transfer", zzta.f45758c);
            m53197a(mediaFormat, "color-standard", zzta.f45756a);
            m53197a(mediaFormat, "color-range", zzta.f45757b);
            String str4 = "hdr-static-info";
            byte[] bArr = zzta.f45759d;
            if (bArr != null) {
                mediaFormat.setByteBuffer(str4, ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final String toString() {
        String str = this.f45728r;
        String str2 = this.f45730t;
        String str3 = this.f45713c;
        int i = this.f45711a;
        String str4 = this.f45727q;
        int i2 = this.f45717g;
        int i3 = this.f45718h;
        float f = this.f45719i;
        int i4 = this.f45722l;
        int i5 = this.f45723m;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.f45710A == 0) {
            int i = 0;
            int hashCode = ((((((((((((((((((((((((this.f45728r == null ? 0 : this.f45728r.hashCode()) + 527) * 31) + (this.f45730t == null ? 0 : this.f45730t.hashCode())) * 31) + (this.f45713c == null ? 0 : this.f45713c.hashCode())) * 31) + (this.f45712b == null ? 0 : this.f45712b.hashCode())) * 31) + this.f45711a) * 31) + this.f45717g) * 31) + this.f45718h) * 31) + this.f45722l) * 31) + this.f45723m) * 31) + (this.f45727q == null ? 0 : this.f45727q.hashCode())) * 31) + this.f45736z) * 31) + (this.f45716f == null ? 0 : this.f45716f.hashCode())) * 31;
            if (this.f45729s != null) {
                i = this.f45729s.hashCode();
            }
            this.f45710A = hashCode + i;
        }
        return this.f45710A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzlg zzlg = (zzlg) obj;
        if (this.f45711a != zzlg.f45711a || this.f45714d != zzlg.f45714d || this.f45717g != zzlg.f45717g || this.f45718h != zzlg.f45718h || this.f45719i != zzlg.f45719i || this.f45720j != zzlg.f45720j || this.f45721k != zzlg.f45721k || this.f45731u != zzlg.f45731u || this.f45722l != zzlg.f45722l || this.f45723m != zzlg.f45723m || this.f45724n != zzlg.f45724n || this.f45734x != zzlg.f45734x || this.f45735y != zzlg.f45735y || this.f45725o != zzlg.f45725o || this.f45726p != zzlg.f45726p || !bsf.m49941a((Object) this.f45728r, (Object) zzlg.f45728r) || !bsf.m49941a((Object) this.f45727q, (Object) zzlg.f45727q) || this.f45736z != zzlg.f45736z || !bsf.m49941a((Object) this.f45730t, (Object) zzlg.f45730t) || !bsf.m49941a((Object) this.f45713c, (Object) zzlg.f45713c) || !bsf.m49941a((Object) this.f45712b, (Object) zzlg.f45712b) || !bsf.m49941a((Object) this.f45716f, (Object) zzlg.f45716f) || !bsf.m49941a((Object) this.f45729s, (Object) zzlg.f45729s) || !bsf.m49941a((Object) this.f45733w, (Object) zzlg.f45733w) || !Arrays.equals(this.f45732v, zzlg.f45732v) || this.f45715e.size() != zzlg.f45715e.size()) {
            return false;
        }
        for (int i = 0; i < this.f45715e.size(); i++) {
            if (!Arrays.equals((byte[]) this.f45715e.get(i), (byte[]) zzlg.f45715e.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m53197a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45728r);
        parcel.writeString(this.f45730t);
        parcel.writeString(this.f45713c);
        parcel.writeString(this.f45712b);
        parcel.writeInt(this.f45711a);
        parcel.writeInt(this.f45714d);
        parcel.writeInt(this.f45717g);
        parcel.writeInt(this.f45718h);
        parcel.writeFloat(this.f45719i);
        parcel.writeInt(this.f45720j);
        parcel.writeFloat(this.f45721k);
        parcel.writeInt(this.f45732v != null ? 1 : 0);
        if (this.f45732v != null) {
            parcel.writeByteArray(this.f45732v);
        }
        parcel.writeInt(this.f45731u);
        parcel.writeParcelable(this.f45733w, i);
        parcel.writeInt(this.f45722l);
        parcel.writeInt(this.f45723m);
        parcel.writeInt(this.f45724n);
        parcel.writeInt(this.f45734x);
        parcel.writeInt(this.f45735y);
        parcel.writeInt(this.f45726p);
        parcel.writeString(this.f45727q);
        parcel.writeInt(this.f45736z);
        parcel.writeLong(this.f45725o);
        int size = this.f45715e.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.f45715e.get(i2));
        }
        parcel.writeParcelable(this.f45716f, 0);
        parcel.writeParcelable(this.f45729s, 0);
    }
}
