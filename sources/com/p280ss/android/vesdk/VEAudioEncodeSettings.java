package com.p280ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.vesdk.VEAudioEncodeSettings */
public class VEAudioEncodeSettings implements Parcelable {
    public static final Creator<VEAudioEncodeSettings> CREATOR = new Creator<VEAudioEncodeSettings>() {
        /* renamed from: a */
        private static VEAudioEncodeSettings[] m142402a(int i) {
            return new VEAudioEncodeSettings[i];
        }

        /* renamed from: a */
        private static VEAudioEncodeSettings m142401a(Parcel parcel) {
            return new VEAudioEncodeSettings(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m142401a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m142402a(i);
        }
    };

    /* renamed from: a */
    static final VEAudioEncodeSettings f116081a = new VEAudioEncodeSettings();

    /* renamed from: b */
    public ENCODE_STANDARD f116082b;

    /* renamed from: c */
    public int f116083c;

    /* renamed from: d */
    public int f116084d;

    /* renamed from: e */
    public int f116085e;

    /* renamed from: f */
    public boolean f116086f;

    /* renamed from: com.ss.android.vesdk.VEAudioEncodeSettings$ENCODE_STANDARD */
    public enum ENCODE_STANDARD implements Parcelable {
        ENCODE_STANDARD_WAV,
        ENCODE_STANDARD_PCM,
        ENCODE_STANDARD_AAC;
        
        public static final Creator<ENCODE_STANDARD> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<ENCODE_STANDARD>() {
                /* renamed from: a */
                private static ENCODE_STANDARD[] m142404a(int i) {
                    return new ENCODE_STANDARD[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m142403a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m142404a(i);
                }

                /* renamed from: a */
                private static ENCODE_STANDARD m142403a(Parcel parcel) {
                    return ENCODE_STANDARD.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VEAudioEncodeSettings$a */
    public static final class C45170a {

        /* renamed from: a */
        public ENCODE_STANDARD f116087a = ENCODE_STANDARD.ENCODE_STANDARD_WAV;

        /* renamed from: b */
        public int f116088b = 44100;

        /* renamed from: c */
        public int f116089c = 131072;

        /* renamed from: d */
        public int f116090d = 2;

        /* renamed from: e */
        public boolean f116091e;

        /* renamed from: a */
        public final VEAudioEncodeSettings mo107763a() {
            return new VEAudioEncodeSettings(this);
        }
    }

    public int describeContents() {
        return 0;
    }

    public VEAudioEncodeSettings() {
        this.f116083c = 44100;
        this.f116084d = 131072;
        this.f116085e = 2;
        this.f116083c = 44100;
        this.f116084d = 128000;
        this.f116085e = 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"mCodec\":");
        sb.append(this.f116082b);
        sb.append(",\"mSampleRate\":");
        sb.append(this.f116083c);
        sb.append(",\"mBps\":");
        sb.append(this.f116084d);
        sb.append(",\"mChannelCount\":");
        sb.append(this.f116085e);
        sb.append(",\"mHwEnc\":");
        sb.append(this.f116086f);
        sb.append('}');
        return sb.toString();
    }

    protected VEAudioEncodeSettings(Parcel parcel) {
        boolean z;
        this.f116083c = 44100;
        this.f116084d = 131072;
        this.f116085e = 2;
        this.f116082b = (ENCODE_STANDARD) parcel.readParcelable(ENCODE_STANDARD.class.getClassLoader());
        this.f116083c = parcel.readInt();
        this.f116084d = parcel.readInt();
        this.f116085e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f116086f = z;
    }

    private VEAudioEncodeSettings(C45170a aVar) {
        this.f116083c = 44100;
        this.f116084d = 131072;
        this.f116085e = 2;
        this.f116082b = aVar.f116087a;
        this.f116083c = aVar.f116088b;
        this.f116084d = aVar.f116089c;
        this.f116085e = aVar.f116090d;
        this.f116086f = aVar.f116091e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f116082b, i);
        parcel.writeInt(this.f116083c);
        parcel.writeInt(this.f116084d);
        parcel.writeInt(this.f116085e);
        parcel.writeByte(this.f116086f ? (byte) 1 : 0);
    }
}
