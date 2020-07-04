package com.p280ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo */
public final class VideoFileInfo implements Parcelable, Serializable {
    public static final Creator CREATOR = new C39691a();
    private final long duration;
    private final int fps;
    private final int height;
    private final int width;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo$a */
    public static class C39691a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7573i.m23587b(parcel, "in");
            VideoFileInfo videoFileInfo = new VideoFileInfo(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt());
            return videoFileInfo;
        }

        public final Object[] newArray(int i) {
            return new VideoFileInfo[i];
        }
    }

    public static /* synthetic */ VideoFileInfo copy$default(VideoFileInfo videoFileInfo, int i, int i2, long j, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = videoFileInfo.width;
        }
        if ((i4 & 2) != 0) {
            i2 = videoFileInfo.height;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            j = videoFileInfo.duration;
        }
        long j2 = j;
        if ((i4 & 8) != 0) {
            i3 = videoFileInfo.fps;
        }
        return videoFileInfo.copy(i, i5, j2, i3);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final long component3() {
        return this.duration;
    }

    public final int component4() {
        return this.fps;
    }

    public final VideoFileInfo copy(int i, int i2, long j, int i3) {
        VideoFileInfo videoFileInfo = new VideoFileInfo(i, i2, j, i3);
        return videoFileInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoFileInfo) {
                VideoFileInfo videoFileInfo = (VideoFileInfo) obj;
                if (this.width == videoFileInfo.width) {
                    if (this.height == videoFileInfo.height) {
                        if (this.duration == videoFileInfo.duration) {
                            if (this.fps == videoFileInfo.fps) {
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

    public final long getDuration() {
        return this.duration;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        int i = ((this.width * 31) + this.height) * 31;
        long j = this.duration;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.fps;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoFileInfo(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", fps=");
        sb.append(this.fps);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.fps);
    }

    public VideoFileInfo(int i, int i2, long j, int i3) {
        this.width = i;
        this.height = i2;
        this.duration = j;
        this.fps = i3;
    }
}
