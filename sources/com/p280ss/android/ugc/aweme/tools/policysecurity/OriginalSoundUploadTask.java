package com.p280ss.android.ugc.aweme.tools.policysecurity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask */
public final class OriginalSoundUploadTask implements Parcelable {
    public static final C42576a CREATOR = new C42576a(null);

    /* renamed from: a */
    public String f110719a;

    /* renamed from: b */
    public final String f110720b;

    /* renamed from: c */
    public final String f110721c;

    /* renamed from: d */
    public final String f110722d;

    /* renamed from: e */
    public final long f110723e;

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask$a */
    public static final class C42576a implements Creator<OriginalSoundUploadTask> {
        private C42576a() {
        }

        /* renamed from: a */
        private static OriginalSoundUploadTask[] m135295a(int i) {
            return new OriginalSoundUploadTask[i];
        }

        public /* synthetic */ C42576a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m135294a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m135295a(i);
        }

        /* renamed from: a */
        private static OriginalSoundUploadTask m135294a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new OriginalSoundUploadTask(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OriginalSoundUploadTask) {
                OriginalSoundUploadTask originalSoundUploadTask = (OriginalSoundUploadTask) obj;
                if (C7573i.m23585a((Object) this.f110720b, (Object) originalSoundUploadTask.f110720b) && C7573i.m23585a((Object) this.f110721c, (Object) originalSoundUploadTask.f110721c) && C7573i.m23585a((Object) this.f110722d, (Object) originalSoundUploadTask.f110722d)) {
                    if (this.f110723e == originalSoundUploadTask.f110723e) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f110720b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f110721c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f110722d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        long j = this.f110723e;
        return i2 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OriginalSoundUploadTask(awemeId=");
        sb.append(this.f110720b);
        sb.append(", vid=");
        sb.append(this.f110721c);
        sb.append(", originalSoundPath=");
        sb.append(this.f110722d);
        sb.append(", updateTime=");
        sb.append(this.f110723e);
        sb.append(")");
        return sb.toString();
    }

    public OriginalSoundUploadTask(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            C7573i.m23580a();
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            C7573i.m23580a();
        }
        String readString3 = parcel.readString();
        if (readString3 == null) {
            C7573i.m23580a();
        }
        this(readString, readString2, readString3, parcel.readLong());
        this.f110719a = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeString(this.f110720b);
        parcel.writeString(this.f110721c);
        parcel.writeString(this.f110722d);
        parcel.writeLong(this.f110723e);
        parcel.writeString(this.f110719a);
    }

    public OriginalSoundUploadTask(String str, String str2, String str3, long j) {
        C7573i.m23587b(str, "awemeId");
        C7573i.m23587b(str2, "vid");
        C7573i.m23587b(str3, "originalSoundPath");
        this.f110720b = str;
        this.f110721c = str2;
        this.f110722d = str3;
        this.f110723e = j;
    }
}
