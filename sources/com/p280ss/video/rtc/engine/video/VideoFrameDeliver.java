package com.p280ss.video.rtc.engine.video;

import com.p280ss.video.rtc.engine.mediaio.IFrameRender;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import java.util.HashMap;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.video.VideoFrameDeliver */
public class VideoFrameDeliver {
    private static VideoFrameDeliver mInstance;
    private HashMap<String, IFrameRender> mUidScreenObserverMap = new HashMap<>();
    private HashMap<String, IFrameRender> mUidVideoObserverMap = new HashMap<>();

    public static VideoFrameDeliver instance() {
        if (mInstance == null) {
            mInstance = new VideoFrameDeliver();
        }
        return mInstance;
    }

    public void clearObservers() {
        LogUtil.m145278d("VideoFrameDeliver", "clear all observers including video and screen.");
        this.mUidVideoObserverMap.clear();
    }

    private VideoFrameDeliver() {
    }

    public void deregisterScreenFrameObserver(String str) {
        StringBuilder sb = new StringBuilder("deregister screen frame observer for uid: ");
        sb.append(str);
        LogUtil.m145278d("VideoFrameDeliver", sb.toString());
        this.mUidScreenObserverMap.remove(str);
    }

    public void deregisterVideoFrameObserver(String str) {
        StringBuilder sb = new StringBuilder("deregister video frame observer for uid: : ");
        sb.append(str);
        LogUtil.m145278d("VideoFrameDeliver", sb.toString());
        this.mUidVideoObserverMap.remove(str);
    }

    public void registerScreenFrameObserver(String str, IFrameRender iFrameRender) {
        StringBuilder sb = new StringBuilder("register screen frame observer for uid: : ");
        sb.append(str);
        LogUtil.m145278d("VideoFrameDeliver", sb.toString());
        this.mUidScreenObserverMap.put(str, iFrameRender);
    }

    public void registerVideoFrameObserver(String str, IFrameRender iFrameRender) {
        StringBuilder sb = new StringBuilder("register video frame observer for uid: ");
        sb.append(str);
        LogUtil.m145278d("VideoFrameDeliver", sb.toString());
        this.mUidVideoObserverMap.put(str, iFrameRender);
    }

    public void deliverScreenFrame(String str, VideoFrame videoFrame) {
        if (this.mUidScreenObserverMap.get(str) != null) {
            ((IFrameRender) this.mUidScreenObserverMap.get(str)).onVideoFrame(videoFrame);
            return;
        }
        StringBuilder sb = new StringBuilder("No screen observer fournd for uid : ");
        sb.append(str);
        sb.append(", please check it!");
        LogUtil.m145279e("VideoFrameDeliver", sb.toString());
    }

    public void deliverVideoFrame(String str, VideoFrame videoFrame) {
        if (this.mUidVideoObserverMap.get(str) != null) {
            ((IFrameRender) this.mUidVideoObserverMap.get(str)).onVideoFrame(videoFrame);
            return;
        }
        StringBuilder sb = new StringBuilder("No video observer found for uid : ");
        sb.append(str);
        sb.append(", please check it!");
        LogUtil.m145279e("VideoFrameDeliver", sb.toString());
    }
}
