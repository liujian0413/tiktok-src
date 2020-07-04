package com.p280ss.android.ugc.asve.recorder;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.RecorderConcatResult */
public final class RecorderConcatResult implements Parcelable {
    public static final C20660a CREATOR = new C20660a(null);

    /* renamed from: a */
    public final int f55804a;

    /* renamed from: b */
    public final String f55805b;

    /* renamed from: c */
    public final String f55806c;

    /* renamed from: com.ss.android.ugc.asve.recorder.RecorderConcatResult$a */
    public static final class C20660a implements Creator<RecorderConcatResult> {
        private C20660a() {
        }

        /* renamed from: a */
        private static RecorderConcatResult[] m68465a(int i) {
            return new RecorderConcatResult[i];
        }

        public /* synthetic */ C20660a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m68464a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m68465a(i);
        }

        /* renamed from: a */
        public static RecorderConcatResult m68464a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new RecorderConcatResult(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecorderConcatResult) {
                RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
                if (!(this.f55804a == recorderConcatResult.f55804a) || !C7573i.m23585a((Object) this.f55805b, (Object) recorderConcatResult.f55805b) || !C7573i.m23585a((Object) this.f55806c, (Object) recorderConcatResult.f55806c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f55804a * 31;
        String str = this.f55805b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55806c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecorderConcatResult(ret=");
        sb.append(this.f55804a);
        sb.append(", videoPath=");
        sb.append(this.f55805b);
        sb.append(", audioPath=");
        sb.append(this.f55806c);
        sb.append(")");
        return sb.toString();
    }

    public RecorderConcatResult(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        C7573i.m23582a((Object) readString, "parcel.readString()");
        String readString2 = parcel.readString();
        C7573i.m23582a((Object) readString2, "parcel.readString()");
        this(readInt, readString, readString2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeInt(this.f55804a);
        parcel.writeString(this.f55805b);
        parcel.writeString(this.f55806c);
    }

    public RecorderConcatResult(int i, String str, String str2) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "audioPath");
        this.f55804a = i;
        this.f55805b = str;
        this.f55806c = str2;
    }
}
