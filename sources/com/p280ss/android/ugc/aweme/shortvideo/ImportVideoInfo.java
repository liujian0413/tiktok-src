package com.p280ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo */
public final class ImportVideoInfo implements Parcelable, Serializable {
    public static final C38398a CREATOR = new C38398a(null);
    private int bitRate;
    private long duration;
    private int encodeId;
    private String importPath;
    private long importfileDuration;
    private int videoHeight;
    private int videoWidth;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo$a */
    public static final class C38398a implements Creator<ImportVideoInfo> {
        private C38398a() {
        }

        /* renamed from: a */
        private static ImportVideoInfo[] m122659a(int i) {
            return new ImportVideoInfo[i];
        }

        public /* synthetic */ C38398a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122658a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122659a(i);
        }

        /* renamed from: a */
        private static ImportVideoInfo m122658a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new ImportVideoInfo(parcel);
        }
    }

    public ImportVideoInfo() {
        this(0, 0, 0, 0, null, 0, 0, 127, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getEncodeId() {
        return this.encodeId;
    }

    public final String getImportPath() {
        return this.importPath;
    }

    public final long getImportfileDuration() {
        return this.importfileDuration;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final void setBitRate(int i) {
        this.bitRate = i;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEncodeId(int i) {
        this.encodeId = i;
    }

    public final void setImportPath(String str) {
        this.importPath = str;
    }

    public final void setImportfileDuration(long j) {
        this.importfileDuration = j;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public ImportVideoInfo(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(0, 0, 0, 0, null, 0, 0, 127, null);
        this.videoWidth = parcel.readInt();
        this.videoHeight = parcel.readInt();
        this.bitRate = parcel.readInt();
        this.encodeId = parcel.readInt();
        this.importPath = parcel.readString();
        this.importfileDuration = parcel.readLong();
        this.duration = parcel.readLong();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeInt(this.bitRate);
        parcel.writeInt(this.encodeId);
        parcel.writeString(this.importPath);
        parcel.writeLong(this.importfileDuration);
        parcel.writeLong(this.duration);
    }

    public ImportVideoInfo(int i, int i2, int i3, int i4, String str, long j, long j2) {
        this.videoWidth = i;
        this.videoHeight = i2;
        this.bitRate = i3;
        this.encodeId = i4;
        this.importPath = str;
        this.importfileDuration = j;
        this.duration = j2;
    }

    public /* synthetic */ ImportVideoInfo(int i, int i2, int i3, int i4, String str, long j, long j2, int i5, C7571f fVar) {
        int i6;
        int i7;
        int i8;
        String str2;
        long j3;
        int i9 = 0;
        if ((i5 & 1) != 0) {
            i6 = 0;
        } else {
            i6 = i;
        }
        if ((i5 & 2) != 0) {
            i7 = 0;
        } else {
            i7 = i2;
        }
        if ((i5 & 4) != 0) {
            i8 = 0;
        } else {
            i8 = i3;
        }
        if ((i5 & 8) == 0) {
            i9 = i4;
        }
        if ((i5 & 16) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        long j4 = 0;
        if ((i5 & 32) != 0) {
            j3 = 0;
        } else {
            j3 = j;
        }
        if ((i5 & 64) == 0) {
            j4 = j2;
        }
        this(i6, i7, i8, i9, str2, j3, j4);
    }
}
