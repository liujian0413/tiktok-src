package com.p280ss.video.rtc.engine.handler;

import com.p280ss.video.rtc.engine.utils.LogUtil;
import com.p280ss.video.rtc.engine.video.VideoFrameDeliver;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.handler.ByteRtcVideoFrameObserver */
public class ByteRtcVideoFrameObserver {
    private VideoFrameDeliver mVideoFrameDeliver = VideoFrameDeliver.instance();

    /* access modifiers changed from: 0000 */
    public void onScreenFrame(String str, VideoFrame videoFrame) {
        if (this.mVideoFrameDeliver != null) {
            this.mVideoFrameDeliver.deliverScreenFrame(str, videoFrame);
            return;
        }
        StringBuilder sb = new StringBuilder("frame deliver is null when invoke onScreenFrame of uid: ");
        sb.append(str);
        LogUtil.m145278d("ByteRtcVideoFrameObserver", sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void onVideoFrame(String str, VideoFrame videoFrame) {
        if (this.mVideoFrameDeliver != null) {
            this.mVideoFrameDeliver.deliverVideoFrame(str, videoFrame);
            return;
        }
        StringBuilder sb = new StringBuilder("frame deliver is null when invoke OnVideoFrame of uid: ");
        sb.append(str);
        LogUtil.m145278d("ByteRtcVideoFrameObserver", sb.toString());
    }
}
