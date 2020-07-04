package com.bytedance.crash.p491b;

import android.app.ActivityManager.ProcessErrorStateInfo;

/* renamed from: com.bytedance.crash.b.a */
public final class C9856a {
    /* renamed from: a */
    static String m29083a(ProcessErrorStateInfo processErrorStateInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("|------------- processErrorStateInfo--------------|\n");
        StringBuilder sb2 = new StringBuilder("condition: ");
        sb2.append(processErrorStateInfo.condition);
        sb2.append("\n");
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("processName: ");
        sb3.append(processErrorStateInfo.processName);
        sb3.append("\n");
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("pid: ");
        sb4.append(processErrorStateInfo.pid);
        sb4.append("\n");
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder("uid: ");
        sb5.append(processErrorStateInfo.uid);
        sb5.append("\n");
        sb.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder("tag: ");
        sb6.append(processErrorStateInfo.tag);
        sb6.append("\n");
        sb.append(sb6.toString());
        StringBuilder sb7 = new StringBuilder("shortMsg : ");
        sb7.append(processErrorStateInfo.shortMsg);
        sb7.append("\n");
        sb.append(sb7.toString());
        StringBuilder sb8 = new StringBuilder("longMsg : ");
        sb8.append(processErrorStateInfo.longMsg);
        sb8.append("\n");
        sb.append(sb8.toString());
        sb.append("-----------------------end----------------------------");
        return sb.toString();
    }

    /* renamed from: a */
    static boolean m29084a(ProcessErrorStateInfo processErrorStateInfo, ProcessErrorStateInfo processErrorStateInfo2) {
        if (!String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfo2.condition)) || !String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfo2.processName)) || !String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfo2.pid)) || !String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfo2.uid)) || !String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfo2.tag)) || !String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfo2.shortMsg)) || !String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfo2.longMsg))) {
            return false;
        }
        return true;
    }
}
