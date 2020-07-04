package com.p280ss.video.rtc.engine;

import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;

/* renamed from: com.ss.video.rtc.engine.PublisherParameters */
public class PublisherParameters {
    public int audiobitrate = 96000;
    public int audiochannels = 1;
    public int audiosamplerate = 44100;
    public int bitrate = VETransitionFilterParam.TransitionDuration_DEFAULT;
    public int defaultLayout = 1;
    public String extraInfo;
    public int framerate = 15;
    public int height = 640;
    public int lifecycle = 1;
    public String mosaicStream;
    public boolean owner;
    public int width = 360;
}
