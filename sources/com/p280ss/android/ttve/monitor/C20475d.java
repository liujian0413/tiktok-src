package com.p280ss.android.ttve.monitor;

import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetCommonParams;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.d */
public final class C20475d {
    /* renamed from: a */
    private static SDKMonitor m67923a() {
        try {
            return SDKMonitorUtils.getInstance("1357");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m67924a(String str) {
        SDKMonitor a = m67923a();
        if (a == null) {
            return null;
        }
        JSONObject reportJsonHeaderInfo = a.reportJsonHeaderInfo();
        if (reportJsonHeaderInfo != null) {
            try {
                return reportJsonHeaderInfo.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m67925a(int i) {
        SDKMonitorUtils.setConfigUrl("1357", m67930c(i));
        SDKMonitorUtils.setDeafultReportUrl("1357", m67929b(i));
    }

    /* renamed from: b */
    private static List<String> m67929b(int i) {
        if (i == 0) {
            return new ArrayList(Arrays.asList(new String[]{"https://mon.snssdk.com/monitor/collect/", "https://mon.toutiao.com/monitor/collect/", "https://mon.toutiaocloud.com/monitor/collect/", "https://mon.toutiaocloud.net/monitor/collect/"}));
        }
        return new ArrayList(Arrays.asList(new String[]{"https://mon.byteoversea.com/monitor/collect/", "https://mon.sgsnssdk.com/monitor/collect/"}));
    }

    /* renamed from: c */
    private static List<String> m67930c(int i) {
        if (i == 0) {
            return new ArrayList(Arrays.asList(new String[]{"https://mon.snssdk.com/monitor/appmonitor/v2/settings", "https://monsetting.toutiao.com/monitor/appmonitor/v2/settings"}));
        }
        return new ArrayList(Arrays.asList(new String[]{"https://mon.byteoversea.com/monitor/appmonitor/v2/settings", "https://mon.isnssdk.com/monitor/appmonitor/v2/settings", "https://mon.snssdk.com/monitor/appmonitor/v2/settings"}));
    }

    /* renamed from: a */
    public static void m67928a(String str, String str2) {
        SDKMonitor a = m67923a();
        if (a != null) {
            JSONObject reportJsonHeaderInfo = a.reportJsonHeaderInfo();
            if (reportJsonHeaderInfo != null) {
                try {
                    reportJsonHeaderInfo.put(str, str2);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m67927a(String str, int i, JSONObject jSONObject) {
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        jSONObject.put("te_language", language);
        jSONObject.put("te_region", country);
        if (m67923a() != null) {
            m67923a().monitorStatusAndDuration(str, i, jSONObject, null);
        }
    }

    /* renamed from: a */
    public static void m67926a(Context context, String str, String str2, String str3) {
        SDKMonitorUtils.init(context, "1357", C20477e.m67939b(context, str, str2, str3), new IGetCommonParams() {
            public final String getSessionId() {
                return null;
            }
        });
    }
}
