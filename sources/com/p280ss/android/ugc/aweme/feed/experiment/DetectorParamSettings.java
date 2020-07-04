package com.p280ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.network.observer.bean.DetectorParam;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.DetectorParamSettings */
public final class DetectorParamSettings {
    @C6382b
    private static DetectorParam DETECTOR_PARAM;
    public static final DetectorParamSettings INSTANCE = new DetectorParamSettings();

    private DetectorParamSettings() {
    }

    public final DetectorParam getDETECTOR_PARAM() {
        return DETECTOR_PARAM;
    }

    public static final DetectorParam getParameters() {
        DetectorParam detectorParam;
        try {
            detectorParam = (DetectorParam) C10292j.m30480a().mo25014a(DetectorParamSettings.class, "network_monitor_config", C6384b.m19835a().mo15294c().getNetworkMonitorConfig(), "com.ss.android.ugc.network.observer.bean.DetectorParam", DetectorParam.class);
        } catch (Throwable unused) {
            detectorParam = null;
        }
        if (detectorParam != null) {
            return detectorParam;
        }
        if (C6399b.m19944t()) {
            return new DetectorParam(new String[]{"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"});
        }
        return new DetectorParam(new String[]{"114.114.114.114:80", "aweme-eagle-hl.snssdk.com:443", "www.baidu.com:443"});
    }

    public final void setDETECTOR_PARAM(DetectorParam detectorParam) {
        DETECTOR_PARAM = detectorParam;
    }
}
