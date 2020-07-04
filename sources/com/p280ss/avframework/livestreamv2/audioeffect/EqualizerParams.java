package com.p280ss.avframework.livestreamv2.audioeffect;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.EqualizerParams */
public class EqualizerParams implements Parcelable {
    public static final Creator<EqualizerParams> CREATOR = new Creator<EqualizerParams>() {
        public final EqualizerParams[] newArray(int i) {
            return new EqualizerParams[i];
        }

        public final EqualizerParams createFromParcel(Parcel parcel) {
            return new EqualizerParams(parcel);
        }
    };
    public float amp1000;
    public float amp125;
    public float amp16000;
    public float amp2000;
    public float amp250;
    public float amp31;
    public float amp4000;
    public float amp500;
    public float amp63;
    public float amp8000;
    public float freqWidth1000;
    public float freqWidth125;
    public float freqWidth16000;
    public float freqWidth2000;
    public float freqWidth250;
    public float freqWidth31;
    public float freqWidth4000;
    public float freqWidth500;
    public float freqWidth63;
    public float freqWidth8000;
    public String name;
    public float preamp;

    /* renamed from: com.ss.avframework.livestreamv2.audioeffect.EqualizerParams$Presets */
    public static class Presets {
        public static final EqualizerParams CLASSICAL;
        public static final EqualizerParams CLUB;
        public static final EqualizerParams DANCE;
        public static final EqualizerParams FLAT;
        public static final EqualizerParams FULLBASS;
        public static final EqualizerParams FULLBASSTREBLE;
        public static final EqualizerParams FULLTREBLE;
        public static final EqualizerParams HEADPHONES;
        public static final EqualizerParams LARGEHALL;
        public static final EqualizerParams LIVE;
        public static final EqualizerParams NONE = new EqualizerParams();
        public static final EqualizerParams PARTY;
        public static final EqualizerParams POP;
        public static final EqualizerParams ROCK;
        public static final EqualizerParams SOFT;

        static {
            EqualizerParams equalizerParams = new EqualizerParams(12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
            FLAT = equalizerParams;
            EqualizerParams equalizerParams2 = new EqualizerParams(12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -7.2f, -7.2f, -7.2f, -9.6f);
            CLASSICAL = equalizerParams2;
            EqualizerParams equalizerParams3 = new EqualizerParams(6.0f, 0.0f, 0.0f, 8.0f, 5.6f, 5.6f, 5.6f, 3.2f, 0.0f, 0.0f, 0.0f);
            CLUB = equalizerParams3;
            EqualizerParams equalizerParams4 = new EqualizerParams(5.0f, 9.6f, 7.2f, 2.4f, 0.0f, 0.0f, -5.6f, -7.2f, -7.2f, 0.0f, 0.0f);
            DANCE = equalizerParams4;
            EqualizerParams equalizerParams5 = new EqualizerParams(5.0f, -8.0f, 9.6f, 9.6f, 5.6f, 1.6f, -4.0f, -8.0f, -10.4f, -11.2f, -11.2f);
            FULLBASS = equalizerParams5;
            EqualizerParams equalizerParams6 = new EqualizerParams(4.0f, 7.2f, 5.6f, 0.0f, -7.2f, -4.8f, 1.6f, 8.0f, 11.2f, 12.0f, 12.0f);
            FULLBASSTREBLE = equalizerParams6;
            EqualizerParams equalizerParams7 = new EqualizerParams(3.0f, -9.6f, -9.6f, -9.6f, -4.0f, 2.4f, 11.2f, 16.0f, 16.0f, 16.0f, 16.8f);
            FULLTREBLE = equalizerParams7;
            EqualizerParams equalizerParams8 = new EqualizerParams(4.0f, 4.8f, 11.2f, 5.6f, -3.2f, -2.4f, 1.6f, 4.8f, 9.6f, 12.8f, 14.4f);
            HEADPHONES = equalizerParams8;
            EqualizerParams equalizerParams9 = new EqualizerParams(5.0f, 10.4f, 10.4f, 5.6f, 5.6f, 0.0f, -4.8f, -4.8f, -4.8f, 0.0f, 0.0f);
            LARGEHALL = equalizerParams9;
            EqualizerParams equalizerParams10 = new EqualizerParams(7.0f, -4.8f, 0.0f, 4.0f, 5.6f, 5.6f, 5.6f, 4.0f, 2.4f, 2.4f, 2.4f);
            LIVE = equalizerParams10;
            EqualizerParams equalizerParams11 = new EqualizerParams(6.0f, 7.2f, 7.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 7.2f, 7.2f);
            PARTY = equalizerParams11;
            EqualizerParams equalizerParams12 = new EqualizerParams(6.0f, -1.6f, 4.8f, 7.2f, 8.0f, 5.6f, 0.0f, -2.4f, -2.4f, -1.6f, -1.6f);
            POP = equalizerParams12;
            EqualizerParams equalizerParams13 = new EqualizerParams(5.0f, 8.0f, 4.8f, -5.6f, -8.0f, -3.2f, 4.0f, 8.8f, 11.2f, 11.2f, 11.2f);
            ROCK = equalizerParams13;
            EqualizerParams equalizerParams14 = new EqualizerParams(5.0f, 4.8f, 1.6f, 0.0f, -2.4f, 0.0f, 4.0f, 8.0f, 9.6f, 11.2f, 12.0f);
            SOFT = equalizerParams14;
        }

        public static EqualizerParams fromValue(int i) {
            switch (i) {
                case 0:
                    return FLAT;
                case 1:
                    return CLASSICAL;
                case 2:
                    return CLUB;
                case 3:
                    return DANCE;
                case 4:
                    return FULLBASS;
                case 5:
                    return FULLBASSTREBLE;
                case 6:
                    return FULLTREBLE;
                case 7:
                    return HEADPHONES;
                case 8:
                    return LARGEHALL;
                case 9:
                    return LIVE;
                case 10:
                    return PARTY;
                case 11:
                    return POP;
                case 12:
                    return ROCK;
                case 13:
                    return SOFT;
                default:
                    return NONE;
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public EqualizerParams copy() {
        return fromString(getParamsAsString());
    }

    public EqualizerParams() {
        this.name = "";
        this.preamp = 12.0f;
        this.freqWidth31 = 1.0f;
        this.freqWidth63 = 1.0f;
        this.freqWidth125 = 1.0f;
        this.freqWidth250 = 1.0f;
        this.freqWidth500 = 1.0f;
        this.freqWidth1000 = 1.0f;
        this.freqWidth2000 = 1.0f;
        this.freqWidth4000 = 1.0f;
        this.freqWidth8000 = 1.0f;
        this.freqWidth16000 = 1.0f;
    }

    public String getParamsAsString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(",");
        sb.append(this.preamp);
        sb.append(",");
        sb.append(this.freqWidth31);
        sb.append(",");
        sb.append(this.freqWidth63);
        sb.append(",");
        sb.append(this.freqWidth125);
        sb.append(",");
        sb.append(this.freqWidth250);
        sb.append(",");
        sb.append(this.freqWidth500);
        sb.append(",");
        sb.append(this.freqWidth1000);
        sb.append(",");
        sb.append(this.freqWidth2000);
        sb.append(",");
        sb.append(this.freqWidth4000);
        sb.append(",");
        sb.append(this.freqWidth8000);
        sb.append(",");
        sb.append(this.freqWidth16000);
        sb.append(",");
        sb.append(this.amp31);
        sb.append(",");
        sb.append(this.amp63);
        sb.append(",");
        sb.append(this.amp125);
        sb.append(",");
        sb.append(this.amp250);
        sb.append(",");
        sb.append(this.amp500);
        sb.append(",");
        sb.append(this.amp1000);
        sb.append(",");
        sb.append(this.amp2000);
        sb.append(",");
        sb.append(this.amp4000);
        sb.append(",");
        sb.append(this.amp8000);
        sb.append(",");
        sb.append(this.amp16000);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EqualizerParams{name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", preamp=");
        sb.append(this.preamp);
        sb.append(", amp31=");
        sb.append(this.amp31);
        sb.append(", amp63=");
        sb.append(this.amp63);
        sb.append(", amp125=");
        sb.append(this.amp125);
        sb.append(", amp250=");
        sb.append(this.amp250);
        sb.append(", amp500=");
        sb.append(this.amp500);
        sb.append(", amp1000=");
        sb.append(this.amp1000);
        sb.append(", amp2000=");
        sb.append(this.amp2000);
        sb.append(", amp4000=");
        sb.append(this.amp4000);
        sb.append(", amp8000=");
        sb.append(this.amp8000);
        sb.append(", amp16000=");
        sb.append(this.amp16000);
        sb.append(", freqWidth31=");
        sb.append(this.freqWidth31);
        sb.append(", freqWidth63=");
        sb.append(this.freqWidth63);
        sb.append(", freqWidth125=");
        sb.append(this.freqWidth125);
        sb.append(", freqWidth250=");
        sb.append(this.freqWidth250);
        sb.append(", freqWidth500=");
        sb.append(this.freqWidth500);
        sb.append(", freqWidth1000=");
        sb.append(this.freqWidth1000);
        sb.append(", freqWidth2000=");
        sb.append(this.freqWidth2000);
        sb.append(", freqWidth4000=");
        sb.append(this.freqWidth4000);
        sb.append(", freqWidth8000=");
        sb.append(this.freqWidth8000);
        sb.append(", freqWidth16000=");
        sb.append(this.freqWidth16000);
        sb.append('}');
        return sb.toString();
    }

    public static EqualizerParams fromString(String str) {
        String[] split = str.split(",");
        try {
            EqualizerParams equalizerParams = new EqualizerParams();
            equalizerParams.name = split[0];
            equalizerParams.preamp = Float.parseFloat(split[1]);
            equalizerParams.freqWidth31 = Float.parseFloat(split[2]);
            equalizerParams.freqWidth63 = Float.parseFloat(split[3]);
            equalizerParams.freqWidth125 = Float.parseFloat(split[4]);
            equalizerParams.freqWidth250 = Float.parseFloat(split[5]);
            equalizerParams.freqWidth500 = Float.parseFloat(split[6]);
            equalizerParams.freqWidth1000 = Float.parseFloat(split[7]);
            equalizerParams.freqWidth2000 = Float.parseFloat(split[8]);
            equalizerParams.freqWidth4000 = Float.parseFloat(split[9]);
            equalizerParams.freqWidth8000 = Float.parseFloat(split[10]);
            equalizerParams.freqWidth16000 = Float.parseFloat(split[11]);
            equalizerParams.amp31 = Float.parseFloat(split[12]);
            equalizerParams.amp63 = Float.parseFloat(split[13]);
            equalizerParams.amp125 = Float.parseFloat(split[14]);
            equalizerParams.amp250 = Float.parseFloat(split[15]);
            equalizerParams.amp500 = Float.parseFloat(split[16]);
            equalizerParams.amp1000 = Float.parseFloat(split[17]);
            equalizerParams.amp2000 = Float.parseFloat(split[18]);
            equalizerParams.amp4000 = Float.parseFloat(split[19]);
            equalizerParams.amp8000 = Float.parseFloat(split[20]);
            equalizerParams.amp16000 = Float.parseFloat(split[21]);
            return equalizerParams;
        } catch (Exception unused) {
            return null;
        }
    }

    protected EqualizerParams(Parcel parcel) {
        this.name = "";
        this.preamp = 12.0f;
        this.freqWidth31 = 1.0f;
        this.freqWidth63 = 1.0f;
        this.freqWidth125 = 1.0f;
        this.freqWidth250 = 1.0f;
        this.freqWidth500 = 1.0f;
        this.freqWidth1000 = 1.0f;
        this.freqWidth2000 = 1.0f;
        this.freqWidth4000 = 1.0f;
        this.freqWidth8000 = 1.0f;
        this.freqWidth16000 = 1.0f;
        this.name = parcel.readString();
        this.preamp = parcel.readFloat();
        this.freqWidth31 = parcel.readFloat();
        this.freqWidth63 = parcel.readFloat();
        this.freqWidth125 = parcel.readFloat();
        this.freqWidth250 = parcel.readFloat();
        this.freqWidth500 = parcel.readFloat();
        this.freqWidth1000 = parcel.readFloat();
        this.freqWidth2000 = parcel.readFloat();
        this.freqWidth4000 = parcel.readFloat();
        this.freqWidth8000 = parcel.readFloat();
        this.freqWidth16000 = parcel.readFloat();
        this.amp31 = parcel.readFloat();
        this.amp63 = parcel.readFloat();
        this.amp125 = parcel.readFloat();
        this.amp250 = parcel.readFloat();
        this.amp500 = parcel.readFloat();
        this.amp1000 = parcel.readFloat();
        this.amp2000 = parcel.readFloat();
        this.amp4000 = parcel.readFloat();
        this.amp8000 = parcel.readFloat();
        this.amp16000 = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeFloat(this.preamp);
        parcel.writeFloat(this.freqWidth31);
        parcel.writeFloat(this.freqWidth63);
        parcel.writeFloat(this.freqWidth125);
        parcel.writeFloat(this.freqWidth250);
        parcel.writeFloat(this.freqWidth500);
        parcel.writeFloat(this.freqWidth1000);
        parcel.writeFloat(this.freqWidth2000);
        parcel.writeFloat(this.freqWidth4000);
        parcel.writeFloat(this.freqWidth8000);
        parcel.writeFloat(this.freqWidth16000);
        parcel.writeFloat(this.amp31);
        parcel.writeFloat(this.amp63);
        parcel.writeFloat(this.amp125);
        parcel.writeFloat(this.amp250);
        parcel.writeFloat(this.amp500);
        parcel.writeFloat(this.amp1000);
        parcel.writeFloat(this.amp2000);
        parcel.writeFloat(this.amp4000);
        parcel.writeFloat(this.amp8000);
        parcel.writeFloat(this.amp16000);
    }

    private EqualizerParams(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.name = "";
        this.preamp = 12.0f;
        this.freqWidth31 = 1.0f;
        this.freqWidth63 = 1.0f;
        this.freqWidth125 = 1.0f;
        this.freqWidth250 = 1.0f;
        this.freqWidth500 = 1.0f;
        this.freqWidth1000 = 1.0f;
        this.freqWidth2000 = 1.0f;
        this.freqWidth4000 = 1.0f;
        this.freqWidth8000 = 1.0f;
        this.freqWidth16000 = 1.0f;
        this.name = "custom";
        this.preamp = f;
        this.amp31 = f2;
        this.amp63 = f3;
        this.amp125 = f4;
        this.amp250 = f5;
        this.amp500 = f6;
        this.amp1000 = f7;
        this.amp2000 = f8;
        this.amp4000 = f9;
        this.amp8000 = f10;
        this.amp16000 = f11;
    }

    private EqualizerParams(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21) {
        this.name = "";
        this.preamp = 12.0f;
        this.freqWidth31 = 1.0f;
        this.freqWidth63 = 1.0f;
        this.freqWidth125 = 1.0f;
        this.freqWidth250 = 1.0f;
        this.freqWidth500 = 1.0f;
        this.freqWidth1000 = 1.0f;
        this.freqWidth2000 = 1.0f;
        this.freqWidth4000 = 1.0f;
        this.freqWidth8000 = 1.0f;
        this.freqWidth16000 = 1.0f;
        this.name = "custom";
        this.preamp = f11;
        this.freqWidth31 = f;
        this.freqWidth63 = f2;
        this.freqWidth125 = f3;
        this.freqWidth250 = f4;
        this.freqWidth500 = f5;
        this.freqWidth1000 = f6;
        this.freqWidth2000 = f7;
        this.freqWidth4000 = f8;
        this.freqWidth8000 = f9;
        this.freqWidth16000 = f10;
        this.amp31 = f12;
        this.amp63 = f13;
        this.amp125 = f14;
        this.amp250 = f15;
        this.amp500 = f16;
        this.amp1000 = f17;
        this.amp2000 = f18;
        this.amp4000 = f19;
        this.amp8000 = f20;
        this.amp16000 = f21;
    }
}
