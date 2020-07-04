package com.p280ss.video.rtc.engine.data;

import android.util.Pair;
import com.p280ss.video.rtc.engine.VideoStreamDescription;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import com.p280ss.video.rtc.engine.video.VideoEncoderConfiguration.ORIENTATION_MODE;
import java.util.Arrays;

/* renamed from: com.ss.video.rtc.engine.data.ByteRtcData */
public class ByteRtcData {
    private ORIENTATION_MODE mOrientationMode;
    private VideoStreamDescription[] videoStreamDescriptions = new VideoStreamDescription[1];

    /* renamed from: com.ss.video.rtc.engine.data.ByteRtcData$SingletonHelper */
    static class SingletonHelper {
        public static final ByteRtcData INSTANCE = new ByteRtcData();

        private SingletonHelper() {
        }
    }

    public static ByteRtcData instance() {
        return SingletonHelper.INSTANCE;
    }

    public ORIENTATION_MODE getOrientationMode() {
        return this.mOrientationMode;
    }

    public VideoStreamDescription[] getVideoStreamDescriptions() {
        return this.videoStreamDescriptions;
    }

    public ByteRtcData() {
        VideoStreamDescription videoStreamDescription = new VideoStreamDescription();
        videoStreamDescription.videoSize = new Pair<>(Integer.valueOf(640), Integer.valueOf(360));
        videoStreamDescription.frameRate = 20;
        videoStreamDescription.maxKbps = 600;
        this.videoStreamDescriptions[0] = videoStreamDescription;
        this.mOrientationMode = ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;
    }

    public void setOrientationMode(ORIENTATION_MODE orientation_mode) {
        this.mOrientationMode = orientation_mode;
    }

    public void setVideoStreamDescriptions(VideoStreamDescription[] videoStreamDescriptionArr) {
        StringBuilder sb = new StringBuilder("setVideoStreamDescriptions: ");
        sb.append(Arrays.toString(videoStreamDescriptionArr));
        LogUtil.m145281i("ByteRtcData", sb.toString());
        this.videoStreamDescriptions = videoStreamDescriptionArr;
    }
}
