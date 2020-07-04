package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.p115a.C2319a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.i18n.C8317b;
import com.bytedance.android.livesdk.p394i.C8306a;
import java.util.Arrays;
import java.util.List;

@C2319a(mo8127a = 1)
public class I18nInitTask extends C8306a {
    public List<Integer> preTasks() {
        return Arrays.asList(new Integer[]{Integer.valueOf(4)});
    }

    public void run() {
        C8317b.m25387a().mo21483a(TTLiveSDKContext.getHostService().mo22360a().currentLocale());
    }
}
