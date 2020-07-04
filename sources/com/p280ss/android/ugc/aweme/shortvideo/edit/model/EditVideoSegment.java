package com.p280ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment */
public class EditVideoSegment implements Parcelable, Serializable {
    public static final Creator<EditVideoSegment> CREATOR = new C39688b();
    public static final C39687a Companion = new C39687a(null);
    private String audioPath;
    private VideoCutInfo videoCutInfo;
    private final VideoFileInfo videoFileInfo;
    private final String videoPath;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment$a */
    public static final class C39687a {
        private C39687a() {
        }

        public /* synthetic */ C39687a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment$b */
    public static final class C39688b implements Creator<EditVideoSegment> {
        C39688b() {
        }

        /* renamed from: a */
        private static EditVideoSegment[] m127018a(int i) {
            return new EditVideoSegment[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m127017a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m127018a(i);
        }

        /* renamed from: a */
        private static EditVideoSegment m127017a(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            return new EditVideoSegment(parcel);
        }
    }

    public final EditVideoSegment copy() {
        return copy$default(this, null, null, null, null, 15, null);
    }

    public final EditVideoSegment copy(String str) {
        return copy$default(this, str, null, null, null, 14, null);
    }

    public final EditVideoSegment copy(String str, String str2) {
        return copy$default(this, str, str2, null, null, 12, null);
    }

    public final EditVideoSegment copy(String str, String str2, VideoFileInfo videoFileInfo2) {
        return copy$default(this, str, str2, videoFileInfo2, null, 8, null);
    }

    public int describeContents() {
        return 0;
    }

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final VideoCutInfo getVideoCutInfo() {
        return this.videoCutInfo;
    }

    public final VideoFileInfo getVideoFileInfo() {
        return this.videoFileInfo;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final void setAudioPath(String str) {
        this.audioPath = str;
    }

    public final void setVideoCutInfo(VideoCutInfo videoCutInfo2) {
        this.videoCutInfo = videoCutInfo2;
    }

    public EditVideoSegment(Parcel parcel) {
        C7573i.m23587b(parcel, "source");
        String readString = parcel.readString();
        if (readString != null) {
            String readString2 = parcel.readString();
            VideoFileInfo videoFileInfo2 = (VideoFileInfo) parcel.readParcelable(VideoFileInfo.class.getClassLoader());
            if (videoFileInfo2 != null) {
                this(readString, readString2, videoFileInfo2);
                this.videoCutInfo = (VideoCutInfo) parcel.readParcelable(VideoCutInfo.class.getClassLoader());
                return;
            }
            throw new IllegalArgumentException("create EditVideoSegment instance with invalid VideoFileInfo");
        }
        throw new IllegalArgumentException("create EditVideoSegment instance with invalid videoPath");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "dest");
        parcel.writeString(this.videoPath);
        parcel.writeString(this.audioPath);
        parcel.writeParcelable(this.videoFileInfo, i);
        parcel.writeParcelable(this.videoCutInfo, i);
    }

    public EditVideoSegment(String str, String str2, VideoFileInfo videoFileInfo2) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(videoFileInfo2, "videoFileInfo");
        this.videoPath = str;
        this.audioPath = str2;
        this.videoFileInfo = videoFileInfo2;
    }

    public final EditVideoSegment copy(String str, String str2, VideoFileInfo videoFileInfo2, VideoCutInfo videoCutInfo2) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(videoFileInfo2, "videoFileInfo");
        EditVideoSegment editVideoSegment = new EditVideoSegment(str, str2, videoFileInfo2);
        editVideoSegment.videoCutInfo = videoCutInfo2;
        return editVideoSegment;
    }

    public /* synthetic */ EditVideoSegment(String str, String str2, VideoFileInfo videoFileInfo2, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        this(str, str2, videoFileInfo2);
    }

    public static /* synthetic */ EditVideoSegment copy$default(EditVideoSegment editVideoSegment, String str, String str2, VideoFileInfo videoFileInfo2, VideoCutInfo videoCutInfo2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = editVideoSegment.videoPath;
            }
            if ((i & 2) != 0) {
                str2 = editVideoSegment.audioPath;
            }
            if ((i & 4) != 0) {
                videoFileInfo2 = VideoFileInfo.copy$default(editVideoSegment.videoFileInfo, 0, 0, 0, 0, 15, null);
            }
            if ((i & 8) != 0) {
                VideoCutInfo videoCutInfo3 = editVideoSegment.videoCutInfo;
                if (videoCutInfo3 != null) {
                    videoCutInfo2 = VideoCutInfo.copy$default(videoCutInfo3, 0, 0, 0.0f, 0, 15, null);
                } else {
                    videoCutInfo2 = null;
                }
            }
            return editVideoSegment.copy(str, str2, videoFileInfo2, videoCutInfo2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }
}
