package com.bytedance.apm.agent.helper;

import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.agent.p464v2.InstructOperationSwitch;
import com.bytedance.apm.internal.ApmDelegate;
import org.json.JSONObject;

public class PageShowCallback {
    public static void onPageShowHideAction(Object obj, boolean z) {
        String str;
        String str2;
        if (InstructOperationSwitch.sUiSwitch) {
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = obj.getClass().getName();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (obj instanceof IPageMonitor) {
                    jSONObject.put("label", ((IPageMonitor) obj).getMonitorLabel());
                }
            } catch (Exception unused) {
            }
            if (z) {
                str2 = "page_show";
            } else {
                str2 = "page_hide";
            }
            if (z && ApmDelegate.getInstance().getApmInitConfig().f18177d != null) {
                ApmDelegate.getInstance().getApmInitConfig();
            }
            MonitorTool.monitorUIAction(str2, str, jSONObject);
        }
    }
}
