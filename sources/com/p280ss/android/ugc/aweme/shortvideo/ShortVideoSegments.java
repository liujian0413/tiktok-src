package com.p280ss.android.ugc.aweme.shortvideo;

import android.os.Bundle;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.EmbaddedWindowInfo;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.StickerPoi;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.sticker.StickerInfo;
import com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ShortVideoSegments */
public class ShortVideoSegments extends ArrayList<TimeSpeedModelExtension> {
    transient int cameraId = -1;
    transient String faceId;
    transient AVChallenge mCurrentChallenge;
    transient RecordingSpeed mCurrentSpeed;
    transient FaceStickerBean mCurrentSticker;

    public ShortVideoSegments() {
    }

    public void removeLast() {
        remove(size() - 1);
    }

    private boolean supportRetake(FaceStickerBean faceStickerBean) {
        return C40496bh.m129458f(faceStickerBean);
    }

    public ShortVideoSegments(Collection<? extends TimeSpeedModelExtension> collection) {
        super(collection);
    }

    public long end(long j) {
        return end(j, null, null, null, null);
    }

    public void begin(RecordingSpeed recordingSpeed, FaceStickerBean faceStickerBean, AVChallenge aVChallenge, Bundle bundle) {
        this.mCurrentSpeed = recordingSpeed;
        this.mCurrentSticker = faceStickerBean;
        this.mCurrentChallenge = aVChallenge;
        this.cameraId = bundle.getInt("cameraId", -1);
        this.faceId = bundle.getString("faceId");
    }

    public long end(long j, EmbaddedWindowInfo embaddedWindowInfo, List<String> list, List<String> list2, BackgroundVideo backgroundVideo) {
        boolean z;
        String str;
        StickerPoi stickerPoi;
        StickerInfo stickerInfo;
        boolean z2;
        long j2 = j;
        if (this.mCurrentSpeed == null) {
            return 0;
        }
        if (this.mCurrentSticker == null || this.mCurrentSticker == FaceStickerBean.NONE) {
            z = true;
        } else {
            z = false;
        }
        int i = (int) j2;
        double value = (double) this.mCurrentSpeed.value();
        List list3 = null;
        if (z) {
            str = null;
        } else {
            str = String.valueOf(this.mCurrentSticker.getStickerId());
        }
        if (z) {
            stickerPoi = null;
        } else {
            stickerPoi = this.mCurrentSticker.getStickerPoi();
        }
        if (this.mCurrentSticker == null) {
            stickerInfo = null;
        } else {
            stickerInfo = new StickerInfo(this.mCurrentSticker.getPropSource(), this.mCurrentSticker.getGradeKey());
        }
        AVChallenge aVChallenge = this.mCurrentChallenge;
        if (!z) {
            list3 = this.mCurrentSticker.getMusicIds();
        }
        List list4 = list3;
        int i2 = this.cameraId;
        if (z || !this.mCurrentSticker.isBusi()) {
            z2 = false;
        } else {
            z2 = true;
        }
        TimeSpeedModelExtension timeSpeedModelExtension = r6;
        TimeSpeedModelExtension timeSpeedModelExtension2 = new TimeSpeedModelExtension(i, value, str, stickerPoi, stickerInfo, aVChallenge, list4, embaddedWindowInfo, list, list2, i2, z2, this.faceId, supportRetake(this.mCurrentSticker), backgroundVideo);
        add(timeSpeedModelExtension);
        return TimeSpeedModelExtension.calculateRealTime(j2, (double) this.mCurrentSpeed.value());
    }
}
