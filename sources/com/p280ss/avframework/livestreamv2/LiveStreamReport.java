package com.p280ss.avframework.livestreamv2;

import com.p280ss.avframework.statics.StaticsReport;

/* renamed from: com.ss.avframework.livestreamv2.LiveStreamReport */
public class LiveStreamReport extends StaticsReport {
    public double getAudioMixerCostTimePerFrameMs() {
        return getDouble("audio_mixer_cost_time_per_frame_ms");
    }

    public long getTransportAdjustBitrate() {
        return getLong("trans_adjust_bps");
    }

    public double getVideoMixerCostTimePerFrameMs() {
        return getDouble("video_mixer_cost_time_per_frame_ms");
    }

    public void setAudioMixerCostTimePerFrameMs(double d) {
        setDouble("audio_mixer_cost_time_per_frame_ms", d);
    }

    public void setTransportAdjustBps(long j) {
        setLong("trans_adjust_bps", j);
    }

    public void setVideoMixerCostTimePerFrameMs(double d) {
        setDouble("video_mixer_cost_time_per_frame_ms", d);
    }
}
