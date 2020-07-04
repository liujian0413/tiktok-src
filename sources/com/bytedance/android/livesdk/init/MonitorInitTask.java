package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.core.performance.C3222b;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.p115a.C2319a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p394i.C8306a;

@C2319a(mo8127a = 3)
public class MonitorInitTask extends C8306a {
    public void run() {
        C3222b.m12218a().mo10142a(((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_PERFORMANCE_SAMPLING.mo10240a()).booleanValue(), ((Integer) LiveConfigSettingKeys.LIVE_PERFORMANCE_SAMPLE_RATE.mo10240a()).intValue());
        TimeCostUtil.m12207a(((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_TIME_COST.mo10240a()).booleanValue());
    }
}
