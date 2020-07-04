package com.p280ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.vesdk.VECherEffectParam */
public class VECherEffectParam implements Parcelable {
    public static final Creator<VECherEffectParam> CREATOR = new Creator<VECherEffectParam>() {
        /* renamed from: a */
        private static VECherEffectParam[] m142455a(int i) {
            return new VECherEffectParam[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m142454a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m142455a(i);
        }

        /* renamed from: a */
        private static VECherEffectParam m142454a(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            double[] dArr = new double[(readInt * 2)];
            parcel.readDoubleArray(dArr);
            boolean[] zArr = new boolean[readInt2];
            parcel.readBooleanArray(zArr);
            return new VECherEffectParam(strArr, dArr, zArr);
        }
    };
    private double[] duration;
    private int length;
    private String[] matrix;
    private boolean[] segUseCher;
    private int totalNum;

    public int describeContents() {
        return 0;
    }

    public double[] getDuration() {
        return this.duration;
    }

    public String[] getMatrix() {
        return this.matrix;
    }

    public boolean[] getSegUseCher() {
        return this.segUseCher;
    }

    public void setDuration(double[] dArr) {
        this.duration = dArr;
    }

    public void setMatrix(String[] strArr) {
        this.matrix = strArr;
    }

    public void setSegUseCher(boolean[] zArr) {
        this.segUseCher = zArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.matrix.length);
        parcel.writeInt(this.totalNum);
        parcel.writeStringArray(this.matrix);
        parcel.writeDoubleArray(this.duration);
        parcel.writeBooleanArray(this.segUseCher);
    }

    public VECherEffectParam(String[] strArr, double[] dArr, boolean[] zArr) {
        this(strArr, dArr, strArr.length, zArr);
    }

    private VECherEffectParam(String[] strArr, double[] dArr, int i, boolean[] zArr) {
        this.matrix = strArr;
        this.duration = dArr;
        this.length = i;
        this.segUseCher = zArr;
        this.totalNum = zArr.length;
    }
}
