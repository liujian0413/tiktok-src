package com.p280ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.vesdk.VEEqualizerParams */
public class VEEqualizerParams implements Parcelable {
    public static final Creator<VEEqualizerParams> CREATOR = new Creator<VEEqualizerParams>() {
        /* renamed from: a */
        private static VEEqualizerParams[] m142655a(int i) {
            return new VEEqualizerParams[i];
        }

        /* renamed from: a */
        private static VEEqualizerParams m142654a(Parcel parcel) {
            return new VEEqualizerParams(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m142654a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m142655a(i);
        }
    };

    /* renamed from: a */
    public String f116339a = "";

    /* renamed from: b */
    public float f116340b = 12.0f;

    /* renamed from: c */
    public float f116341c = 1.0f;

    /* renamed from: d */
    public float f116342d = 1.0f;

    /* renamed from: e */
    public float f116343e = 1.0f;

    /* renamed from: f */
    public float f116344f = 1.0f;

    /* renamed from: g */
    public float f116345g = 1.0f;

    /* renamed from: h */
    public float f116346h = 1.0f;

    /* renamed from: i */
    public float f116347i = 1.0f;

    /* renamed from: j */
    public float f116348j = 1.0f;

    /* renamed from: k */
    public float f116349k = 1.0f;

    /* renamed from: l */
    public float f116350l = 1.0f;

    /* renamed from: m */
    public float f116351m;

    /* renamed from: n */
    public float f116352n;

    /* renamed from: o */
    public float f116353o;

    /* renamed from: p */
    public float f116354p;

    /* renamed from: q */
    public float f116355q;

    /* renamed from: r */
    public float f116356r;

    /* renamed from: s */
    public float f116357s;

    /* renamed from: t */
    public float f116358t;

    /* renamed from: u */
    public float f116359u;

    /* renamed from: v */
    public float f116360v;

    public int describeContents() {
        return 0;
    }

    public VEEqualizerParams() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VEEqualizerParams{name='");
        sb.append(this.f116339a);
        sb.append('\'');
        sb.append(", preamp=");
        sb.append(this.f116340b);
        sb.append(", amp31=");
        sb.append(this.f116351m);
        sb.append(", amp63=");
        sb.append(this.f116352n);
        sb.append(", amp125=");
        sb.append(this.f116353o);
        sb.append(", amp250=");
        sb.append(this.f116354p);
        sb.append(", amp500=");
        sb.append(this.f116355q);
        sb.append(", amp1000=");
        sb.append(this.f116356r);
        sb.append(", amp2000=");
        sb.append(this.f116357s);
        sb.append(", amp4000=");
        sb.append(this.f116358t);
        sb.append(", amp8000=");
        sb.append(this.f116359u);
        sb.append(", amp16000=");
        sb.append(this.f116360v);
        sb.append(", freqWidth31=");
        sb.append(this.f116341c);
        sb.append(", freqWidth63=");
        sb.append(this.f116342d);
        sb.append(", freqWidth125=");
        sb.append(this.f116343e);
        sb.append(", freqWidth250=");
        sb.append(this.f116344f);
        sb.append(", freqWidth500=");
        sb.append(this.f116345g);
        sb.append(", freqWidth1000=");
        sb.append(this.f116346h);
        sb.append(", freqWidth2000=");
        sb.append(this.f116347i);
        sb.append(", freqWidth4000=");
        sb.append(this.f116348j);
        sb.append(", freqWidth8000=");
        sb.append(this.f116349k);
        sb.append(", freqWidth16000=");
        sb.append(this.f116350l);
        sb.append('}');
        return sb.toString();
    }

    protected VEEqualizerParams(Parcel parcel) {
        this.f116339a = parcel.readString();
        this.f116340b = parcel.readFloat();
        this.f116341c = parcel.readFloat();
        this.f116342d = parcel.readFloat();
        this.f116343e = parcel.readFloat();
        this.f116344f = parcel.readFloat();
        this.f116345g = parcel.readFloat();
        this.f116346h = parcel.readFloat();
        this.f116347i = parcel.readFloat();
        this.f116348j = parcel.readFloat();
        this.f116349k = parcel.readFloat();
        this.f116350l = parcel.readFloat();
        this.f116351m = parcel.readFloat();
        this.f116352n = parcel.readFloat();
        this.f116353o = parcel.readFloat();
        this.f116354p = parcel.readFloat();
        this.f116355q = parcel.readFloat();
        this.f116356r = parcel.readFloat();
        this.f116357s = parcel.readFloat();
        this.f116358t = parcel.readFloat();
        this.f116359u = parcel.readFloat();
        this.f116360v = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f116339a);
        parcel.writeFloat(this.f116340b);
        parcel.writeFloat(this.f116341c);
        parcel.writeFloat(this.f116342d);
        parcel.writeFloat(this.f116343e);
        parcel.writeFloat(this.f116344f);
        parcel.writeFloat(this.f116345g);
        parcel.writeFloat(this.f116346h);
        parcel.writeFloat(this.f116347i);
        parcel.writeFloat(this.f116348j);
        parcel.writeFloat(this.f116349k);
        parcel.writeFloat(this.f116350l);
        parcel.writeFloat(this.f116351m);
        parcel.writeFloat(this.f116352n);
        parcel.writeFloat(this.f116353o);
        parcel.writeFloat(this.f116354p);
        parcel.writeFloat(this.f116355q);
        parcel.writeFloat(this.f116356r);
        parcel.writeFloat(this.f116357s);
        parcel.writeFloat(this.f116358t);
        parcel.writeFloat(this.f116359u);
        parcel.writeFloat(this.f116360v);
    }
}
