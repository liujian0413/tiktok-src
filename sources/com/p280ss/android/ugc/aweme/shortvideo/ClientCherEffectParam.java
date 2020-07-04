package com.p280ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam */
public final class ClientCherEffectParam implements Parcelable, Serializable {
    public static final C38391a CREATOR = new C38391a(null);
    @C6593c(mo15949a = "duration")
    private double[] duration;
    @C6593c(mo15949a = "matrix")
    private String[] matrix;
    @C6593c(mo15949a = "segUseCher")
    private boolean[] segUseCher;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam$a */
    public static final class C38391a implements Creator<ClientCherEffectParam> {
        private C38391a() {
        }

        /* renamed from: a */
        private static ClientCherEffectParam[] m122632a(int i) {
            return new ClientCherEffectParam[i];
        }

        public /* synthetic */ C38391a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122631a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122632a(i);
        }

        /* renamed from: a */
        private static ClientCherEffectParam m122631a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new ClientCherEffectParam(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final double[] getDuration() {
        return this.duration;
    }

    public final String[] getMatrix() {
        return this.matrix;
    }

    public final boolean[] getSegUseCher() {
        return this.segUseCher;
    }

    public final void setDuration(double[] dArr) {
        this.duration = dArr;
    }

    public final void setMatrix(String[] strArr) {
        this.matrix = strArr;
    }

    public final void setSegUseCher(boolean[] zArr) {
        this.segUseCher = zArr;
    }

    public ClientCherEffectParam(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(parcel.createStringArray(), parcel.createDoubleArray(), parcel.createBooleanArray());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeStringArray(this.matrix);
        parcel.writeDoubleArray(this.duration);
        parcel.writeBooleanArray(this.segUseCher);
    }

    public ClientCherEffectParam(String[] strArr, double[] dArr, boolean[] zArr) {
        this.matrix = strArr;
        this.duration = dArr;
        this.segUseCher = zArr;
    }
}
