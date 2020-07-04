package com.p280ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo */
public final class VideoCutInfo implements Parcelable, Serializable {
    public static final Creator CREATOR = new C39690a();
    private final long end;
    private final int rotate;
    private final float speed;
    private final long start;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo$a */
    public static class C39690a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7573i.m23587b(parcel, "in");
            VideoCutInfo videoCutInfo = new VideoCutInfo(parcel.readLong(), parcel.readLong(), parcel.readFloat(), parcel.readInt());
            return videoCutInfo;
        }

        public final Object[] newArray(int i) {
            return new VideoCutInfo[i];
        }
    }

    public static /* synthetic */ VideoCutInfo copy$default(VideoCutInfo videoCutInfo, long j, long j2, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = videoCutInfo.start;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = videoCutInfo.end;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            f = videoCutInfo.speed;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            i = videoCutInfo.rotate;
        }
        return videoCutInfo.copy(j3, j4, f2, i);
    }

    public final long component1() {
        return this.start;
    }

    public final long component2() {
        return this.end;
    }

    public final float component3() {
        return this.speed;
    }

    public final int component4() {
        return this.rotate;
    }

    public final VideoCutInfo copy(long j, long j2, float f, int i) {
        VideoCutInfo videoCutInfo = new VideoCutInfo(j, j2, f, i);
        return videoCutInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoCutInfo) {
                VideoCutInfo videoCutInfo = (VideoCutInfo) obj;
                if (this.start == videoCutInfo.start) {
                    if ((this.end == videoCutInfo.end) && Float.compare(this.speed, videoCutInfo.speed) == 0) {
                        if (this.rotate == videoCutInfo.rotate) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getEnd() {
        return this.end;
    }

    public final int getRotate() {
        return this.rotate;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getStart() {
        return this.start;
    }

    public final int hashCode() {
        long j = this.start;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.end;
        return ((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + Float.floatToIntBits(this.speed)) * 31) + this.rotate;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCutInfo(start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", rotate=");
        sb.append(this.rotate);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeLong(this.start);
        parcel.writeLong(this.end);
        parcel.writeFloat(this.speed);
        parcel.writeInt(this.rotate);
    }

    public VideoCutInfo(long j, long j2, float f, int i) {
        this.start = j;
        this.end = j2;
        this.speed = f;
        this.rotate = i;
    }
}
