package com.google.android.gms.common.util;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.util.n */
public final class C15331n {
    /* renamed from: a */
    public static void m44592a(StringBuilder sb, HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            } else {
                z = false;
            }
            String str2 = (String) hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append(TEVideoRecorder.FACE_BEAUTY_NULL);
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
        }
        sb.append("}");
    }
}
