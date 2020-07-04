package com.bytedance.framwork.core.p517a.p518a;

import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.a.a.b */
public interface C10205b {
    boolean getRemoveSwitch();

    int reportCount();

    int reportFailRepeatBaseTime();

    int reportFailRepeatCount();

    int reportInterval();

    JSONObject reportJsonHeaderInfo();

    List<String> reportUrl(String str);

    long stopMoreChannelInterval();
}
