package com.p280ss.android.ugc.aweme.shortvideo.upload;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo */
public final class UploadSpeedInfo implements Parcelable, Serializable {
    public static final Creator CREATOR = new C41433a();
    private final long endTime;
    private final long speed;
    private final long startTime;
    private int usedCompilerSettingGroup;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo$a */
    public static class C41433a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7573i.m23587b(parcel, "in");
            UploadSpeedInfo uploadSpeedInfo = new UploadSpeedInfo(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt());
            return uploadSpeedInfo;
        }

        public final Object[] newArray(int i) {
            return new UploadSpeedInfo[i];
        }
    }

    public UploadSpeedInfo() {
        this(0, 0, 0, 0, 15, null);
    }

    public UploadSpeedInfo(long j) {
        this(j, 0, 0, 0, 14, null);
    }

    public UploadSpeedInfo(long j, long j2) {
        this(j, j2, 0, 0, 12, null);
    }

    public UploadSpeedInfo(long j, long j2, long j3) {
        this(j, j2, j3, 0, 8, null);
    }

    public static /* synthetic */ UploadSpeedInfo copy$default(UploadSpeedInfo uploadSpeedInfo, long j, long j2, long j3, int i, int i2, Object obj) {
        UploadSpeedInfo uploadSpeedInfo2 = uploadSpeedInfo;
        return uploadSpeedInfo.copy((i2 & 1) != 0 ? uploadSpeedInfo2.speed : j, (i2 & 2) != 0 ? uploadSpeedInfo2.startTime : j2, (i2 & 4) != 0 ? uploadSpeedInfo2.endTime : j3, (i2 & 8) != 0 ? uploadSpeedInfo2.usedCompilerSettingGroup : i);
    }

    public final long component1() {
        return this.speed;
    }

    public final long component2() {
        return this.startTime;
    }

    public final long component3() {
        return this.endTime;
    }

    public final int component4() {
        return this.usedCompilerSettingGroup;
    }

    public final UploadSpeedInfo copy(long j, long j2, long j3, int i) {
        UploadSpeedInfo uploadSpeedInfo = new UploadSpeedInfo(j, j2, j3, i);
        return uploadSpeedInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UploadSpeedInfo) {
                UploadSpeedInfo uploadSpeedInfo = (UploadSpeedInfo) obj;
                if (this.speed == uploadSpeedInfo.speed) {
                    if (this.startTime == uploadSpeedInfo.startTime) {
                        if (this.endTime == uploadSpeedInfo.endTime) {
                            if (this.usedCompilerSettingGroup == uploadSpeedInfo.usedCompilerSettingGroup) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getSpeed() {
        return this.speed;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getUsedCompilerSettingGroup() {
        return this.usedCompilerSettingGroup;
    }

    public final int hashCode() {
        long j = this.speed;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.startTime;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.endTime;
        return ((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + this.usedCompilerSettingGroup;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadSpeedInfo(speed=");
        sb.append(this.speed);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", usedCompilerSettingGroup=");
        sb.append(this.usedCompilerSettingGroup);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeLong(this.speed);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.usedCompilerSettingGroup);
    }

    public final void setUsedCompilerSettingGroup(int i) {
        this.usedCompilerSettingGroup = i;
    }

    public UploadSpeedInfo(long j, long j2, long j3, int i) {
        this.speed = j;
        this.startTime = j2;
        this.endTime = j3;
        this.usedCompilerSettingGroup = i;
    }

    public /* synthetic */ UploadSpeedInfo(long j, long j2, long j3, int i, int i2, C7571f fVar) {
        long j4;
        long j5;
        int i3;
        long j6 = -6;
        if ((i2 & 1) != 0) {
            j4 = -6;
        } else {
            j4 = j;
        }
        if ((i2 & 2) != 0) {
            j5 = -6;
        } else {
            j5 = j2;
        }
        if ((i2 & 4) == 0) {
            j6 = j3;
        }
        if ((i2 & 8) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        this(j4, j5, j6, i3);
    }
}
