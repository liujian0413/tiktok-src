package com.p280ss.avframework.statics;

import com.p280ss.avframework.utils.JNINamespace;
import com.p280ss.avframework.utils.TEBundle;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.statics.StaticsReport */
public class StaticsReport extends TEBundle {

    /* renamed from: com.ss.avframework.statics.StaticsReport$StaticReportInterface */
    public interface StaticReportInterface {
        boolean getStaticsReport(StaticsReport staticsReport);
    }

    public double getAudioEncodeRealBps() {
        return getDouble("estream_aenc_real_bps");
    }

    public double getCostTimeProessPerFrame() {
        return getDouble("vtrack_cost_time_ppf");
    }

    public double getTransportDropCount() {
        return getDouble("estream_transport_video_drop_count");
    }

    public double getTransportDuration() {
        return getDouble("estream_transport_duration");
    }

    public double getTransportPackageAverageDelay() {
        return getDouble("estream_transport_package_delay");
    }

    public double getVideoDropCount() {
        return getDouble("estream_video_drop_count");
    }

    public double getVideoEncodeRealBps() {
        return getDouble("estream_venc_real_bps");
    }

    public double getVideoEncodeRealFps() {
        return getDouble("estream_venc_real_fps");
    }

    public double getVideoSourceDeliverFps() {
        return getDouble("vsourc_deliver_fps");
    }

    public double getVideoSourceDropFps() {
        return getDouble("vsourc_drop_fps");
    }

    public double getVideoTransportRealBps() {
        return getDouble("estream_transport_real_bps");
    }

    public double getVideoTransportRealFps() {
        return getDouble("estream_transport_real_fps");
    }

    public double getVideoSourceFps() {
        return getVideoSourceDeliverFps() + getVideoSourceDropFps();
    }
}
