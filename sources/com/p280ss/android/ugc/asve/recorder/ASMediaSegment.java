package com.p280ss.android.ugc.asve.recorder;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.ASMediaSegment */
public final class ASMediaSegment implements Parcelable {
    public static final C20655a CREATOR = new C20655a(null);

    /* renamed from: a */
    public final long f55787a;

    /* renamed from: b */
    public final double f55788b;

    /* renamed from: com.ss.android.ugc.asve.recorder.ASMediaSegment$a */
    public static final class C20655a implements Creator<ASMediaSegment> {
        private C20655a() {
        }

        /* renamed from: a */
        private static ASMediaSegment[] m68440a(int i) {
            return new ASMediaSegment[i];
        }

        public /* synthetic */ C20655a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m68439a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m68440a(i);
        }

        /* renamed from: a */
        private static ASMediaSegment m68439a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new ASMediaSegment(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ASMediaSegment) {
                ASMediaSegment aSMediaSegment = (ASMediaSegment) obj;
                if (!(this.f55787a == aSMediaSegment.f55787a) || Double.compare(this.f55788b, aSMediaSegment.f55788b) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f55787a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.f55788b);
        return i + ((int) ((doubleToLongBits >>> 32) ^ doubleToLongBits));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ASMediaSegment(duration=");
        sb.append(this.f55787a);
        sb.append(", speed=");
        sb.append(this.f55788b);
        sb.append(")");
        return sb.toString();
    }

    public ASMediaSegment(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(parcel.readLong(), parcel.readDouble());
    }

    public ASMediaSegment(long j, double d) {
        this.f55787a = j;
        this.f55788b = d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeLong(this.f55787a);
        parcel.writeDouble(this.f55788b);
    }
}
