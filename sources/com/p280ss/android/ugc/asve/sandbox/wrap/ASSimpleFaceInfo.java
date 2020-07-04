package com.p280ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.ASSimpleFaceInfo */
public final class ASSimpleFaceInfo implements Parcelable {
    public static final C21055a CREATOR = new C21055a(null);

    /* renamed from: a */
    public float f56527a;

    /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.ASSimpleFaceInfo$a */
    public static final class C21055a implements Creator<ASSimpleFaceInfo> {
        private C21055a() {
        }

        /* renamed from: a */
        private static ASSimpleFaceInfo[] m71052a(int i) {
            return new ASSimpleFaceInfo[i];
        }

        public /* synthetic */ C21055a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m71051a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m71052a(i);
        }

        /* renamed from: a */
        private static ASSimpleFaceInfo m71051a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new ASSimpleFaceInfo(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public ASSimpleFaceInfo(float f) {
        this.f56527a = f;
    }

    public ASSimpleFaceInfo(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(parcel.readFloat());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeFloat(this.f56527a);
    }
}
