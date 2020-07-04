package com.p280ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.vesdk.VEEditor.VIDEO_GRAVITY;
import com.p280ss.android.vesdk.VEEditor.VIDEO_RATIO;
import com.p280ss.android.vesdk.VEEditor.VIDEO_SCALETYPE;
import java.util.Arrays;

/* renamed from: com.ss.android.vesdk.VEEditorModel */
public class VEEditorModel implements Parcelable {
    public static final Creator<VEEditorModel> CREATOR = new Creator<VEEditorModel>() {
        /* renamed from: a */
        private static VEEditorModel[] m142653a(int i) {
            return new VEEditorModel[i];
        }

        /* renamed from: a */
        private static VEEditorModel m142652a(Parcel parcel) {
            return new VEEditorModel(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m142652a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m142653a(i);
        }
    };

    /* renamed from: A */
    public float f116309A;

    /* renamed from: B */
    public boolean f116310B;

    /* renamed from: C */
    public VIDEO_GRAVITY f116311C;

    /* renamed from: D */
    public VIDEO_SCALETYPE f116312D;

    /* renamed from: a */
    public String f116313a;

    /* renamed from: b */
    public int f116314b;

    /* renamed from: c */
    public int f116315c;

    /* renamed from: d */
    public boolean f116316d;

    /* renamed from: e */
    public VIDEO_RATIO f116317e;

    /* renamed from: f */
    public boolean f116318f;

    /* renamed from: g */
    public int f116319g;

    /* renamed from: h */
    public int f116320h;

    /* renamed from: i */
    public int f116321i;

    /* renamed from: j */
    public String f116322j;

    /* renamed from: k */
    public int f116323k;

    /* renamed from: l */
    public int f116324l;

    /* renamed from: m */
    public String[] f116325m;

    /* renamed from: n */
    public String[] f116326n;

    /* renamed from: o */
    public String[] f116327o;

    /* renamed from: p */
    public int f116328p;

    /* renamed from: q */
    public int f116329q;

    /* renamed from: r */
    public String f116330r;

    /* renamed from: s */
    public String f116331s;

    /* renamed from: t */
    public double f116332t;

    /* renamed from: u */
    public double f116333u;

    /* renamed from: v */
    public double f116334v;

    /* renamed from: w */
    public double f116335w;

    /* renamed from: x */
    public String f116336x;

    /* renamed from: y */
    public String f116337y;

    /* renamed from: z */
    public float f116338z;

    public VEEditorModel() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"projectXML\":\"");
        sb.append(this.f116313a);
        sb.append('\"');
        sb.append(",\"inPoint\":");
        sb.append(this.f116314b);
        sb.append(",\"outputPoint\":");
        sb.append(this.f116315c);
        sb.append(",\"reverseDone\":");
        sb.append(this.f116316d);
        sb.append(",\"videoOutRes\":");
        sb.append(this.f116317e);
        sb.append(",\"separateAV\":");
        sb.append(this.f116318f);
        sb.append(",\"masterTrackIndex\":");
        sb.append(this.f116319g);
        sb.append(",\"hostTrackIndex\":");
        sb.append(this.f116320h);
        sb.append(",\"audioEffectFilterIndex\":");
        sb.append(this.f116321i);
        sb.append(",\"modelDir\":\"");
        sb.append(this.f116322j);
        sb.append('\"');
        sb.append(",\"colorFilterIndex\":");
        sb.append(this.f116323k);
        sb.append(",\"effectHDRFilterIndex\":");
        sb.append(this.f116324l);
        sb.append(",\"videoPaths\":");
        sb.append(Arrays.toString(this.f116325m));
        sb.append(",\"audioPaths\":");
        sb.append(Arrays.toString(this.f116326n));
        sb.append(",\"transitions\":");
        sb.append(Arrays.toString(this.f116327o));
        sb.append(",\"backgroundColor\":");
        sb.append(this.f116328p);
        sb.append(",\"videoBackgroundColor\":");
        sb.append(this.f116329q);
        sb.append(",\"outputFile\":\"");
        sb.append(this.f116330r);
        sb.append('\"');
        sb.append(",\"watermarkFile\":\"");
        sb.append(this.f116331s);
        sb.append('\"');
        sb.append(",\"watermarkWidth\":");
        sb.append(this.f116332t);
        sb.append(",\"watermarkHeight\":");
        sb.append(this.f116333u);
        sb.append(",\"watermarkOffsetX\":");
        sb.append(this.f116334v);
        sb.append(",\"watermarkOffsetY\":");
        sb.append(this.f116335w);
        sb.append(",\"colorFilterLeftPath\":\"");
        sb.append(this.f116336x);
        sb.append('\"');
        sb.append(",\"colorFilterRightPath\":\"");
        sb.append(this.f116337y);
        sb.append('\"');
        sb.append(",\"colorFilterPosition\":");
        sb.append(this.f116338z);
        sb.append(",\"colorFilterIntensity\":");
        sb.append(this.f116309A);
        sb.append(",\"useColorFilterResIntensity\":");
        sb.append(this.f116310B);
        sb.append(",\"videoGravity\":");
        sb.append(this.f116311C);
        sb.append(",\"videoScaleType\":");
        sb.append(this.f116312D);
        sb.append('}');
        return sb.toString();
    }

    protected VEEditorModel(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f116313a = parcel.readString();
        this.f116314b = parcel.readInt();
        this.f116315c = parcel.readInt();
        boolean z3 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f116316d = z;
        this.f116317e = VIDEO_RATIO.values()[parcel.readInt()];
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f116318f = z2;
        this.f116319g = parcel.readInt();
        this.f116320h = parcel.readInt();
        this.f116321i = parcel.readInt();
        this.f116322j = parcel.readString();
        this.f116323k = parcel.readInt();
        this.f116324l = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt != -1) {
            this.f116325m = new String[readInt];
            parcel.readStringArray(this.f116325m);
        } else {
            this.f116325m = null;
        }
        int readInt2 = parcel.readInt();
        if (readInt2 != -1) {
            this.f116326n = new String[readInt2];
            parcel.readStringArray(this.f116326n);
        } else {
            this.f116326n = null;
        }
        int readInt3 = parcel.readInt();
        if (readInt3 != -1) {
            this.f116327o = new String[readInt3];
            parcel.readStringArray(this.f116327o);
        } else {
            this.f116327o = null;
        }
        this.f116328p = parcel.readInt();
        this.f116330r = parcel.readString();
        this.f116331s = parcel.readString();
        this.f116332t = parcel.readDouble();
        this.f116333u = parcel.readDouble();
        this.f116334v = parcel.readDouble();
        this.f116335w = parcel.readDouble();
        this.f116336x = parcel.readString();
        this.f116337y = parcel.readString();
        this.f116338z = parcel.readFloat();
        this.f116309A = parcel.readFloat();
        if (parcel.readInt() == 1) {
            z3 = true;
        }
        this.f116310B = z3;
        this.f116311C = VIDEO_GRAVITY.values()[parcel.readInt()];
        this.f116312D = VIDEO_SCALETYPE.values()[parcel.readInt()];
        this.f116329q = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f116313a);
        parcel.writeInt(this.f116314b);
        parcel.writeInt(this.f116315c);
        parcel.writeInt(this.f116316d ? 1 : 0);
        parcel.writeInt(this.f116317e.ordinal());
        parcel.writeInt(this.f116318f ? 1 : 0);
        parcel.writeInt(this.f116319g);
        parcel.writeInt(this.f116320h);
        parcel.writeInt(this.f116321i);
        parcel.writeString(this.f116322j);
        parcel.writeInt(this.f116323k);
        parcel.writeInt(this.f116324l);
        if (this.f116325m != null) {
            parcel.writeInt(this.f116325m.length);
            parcel.writeStringArray(this.f116325m);
        } else {
            parcel.writeInt(-1);
        }
        if (this.f116326n != null) {
            parcel.writeInt(this.f116326n.length);
            parcel.writeStringArray(this.f116326n);
        } else {
            parcel.writeInt(-1);
        }
        if (this.f116327o != null) {
            parcel.writeInt(this.f116327o.length);
            parcel.writeStringArray(this.f116327o);
        } else {
            parcel.writeInt(-1);
        }
        parcel.writeInt(this.f116328p);
        parcel.writeString(this.f116330r);
        parcel.writeString(this.f116331s);
        parcel.writeDouble(this.f116332t);
        parcel.writeDouble(this.f116333u);
        parcel.writeDouble(this.f116334v);
        parcel.writeDouble(this.f116335w);
        parcel.writeString(this.f116336x);
        parcel.writeString(this.f116337y);
        parcel.writeFloat(this.f116338z);
        parcel.writeFloat(this.f116309A);
        parcel.writeInt(this.f116310B ? 1 : 0);
        parcel.writeInt(this.f116311C.ordinal());
        parcel.writeInt(this.f116312D.ordinal());
        parcel.writeInt(this.f116329q);
    }
}
