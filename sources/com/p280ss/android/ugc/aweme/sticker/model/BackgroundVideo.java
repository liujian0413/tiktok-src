package com.p280ss.android.ugc.aweme.sticker.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.BackgroundVideo */
public final class BackgroundVideo implements Serializable {
    @C6593c(mo15949a = "audioPath")
    private final String audioPath;
    @C6593c(mo15949a = "endTime")
    private long endTime;
    @C6593c(mo15949a = "maxDuration")
    private final long maxDuration;
    @C6593c(mo15949a = "uid")
    private final String uid;
    @C6593c(mo15949a = "videoPath")
    private final String videoPath;

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getMaxDuration() {
        return this.maxDuration;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final int hashCode() {
        return this.videoPath.hashCode();
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BackgroundVideo)) {
            return false;
        }
        BackgroundVideo backgroundVideo = (BackgroundVideo) obj;
        if (!C7573i.m23585a((Object) this.videoPath, (Object) backgroundVideo.videoPath) || !C7573i.m23585a((Object) this.audioPath, (Object) backgroundVideo.audioPath)) {
            return false;
        }
        return true;
    }

    public BackgroundVideo(String str, String str2, long j, long j2, String str3) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "audioPath");
        C7573i.m23587b(str3, "uid");
        this.videoPath = str;
        this.audioPath = str2;
        this.maxDuration = j;
        this.endTime = j2;
        this.uid = str3;
    }

    public /* synthetic */ BackgroundVideo(String str, String str2, long j, long j2, String str3, int i, C7571f fVar) {
        long j3;
        String str4;
        if ((i & 8) != 0) {
            j3 = 0;
        } else {
            j3 = j2;
        }
        if ((i & 16) != 0) {
            String uuid = UUID.randomUUID().toString();
            C7573i.m23582a((Object) uuid, "UUID.randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str3;
        }
        this(str, str2, j, j3, str4);
    }
}
