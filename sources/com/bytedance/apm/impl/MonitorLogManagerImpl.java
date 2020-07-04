package com.bytedance.apm.impl;

import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p245h.C6212a;
import com.bytedance.apm.p245h.C6213e;
import com.bytedance.apm.p249l.C9613b;
import com.bytedance.apm.util.C6292i;
import com.bytedance.frameworks.core.apm.C6348a;
import com.bytedance.frameworks.core.apm.C6360b;
import com.bytedance.frameworks.core.apm.p257a.p258a.C6354a;
import com.bytedance.services.apm.api.C12917f;
import com.bytedance.services.apm.api.IMonitorLogManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class MonitorLogManagerImpl implements IMonitorLogManager {
    private static C6354a<? extends C6213e> getLogStoreByType(String str) {
        if (TextUtils.equals(str, "api_all")) {
            return C6360b.m19768a().mo15268a(C6212a.class);
        }
        return C6360b.m19768a().mo15268a(C6213e.class);
    }

    public void deleteLegacyLogByIds(String str, String str2) {
        C6354a logStoreByType = getLogStoreByType(str);
        if (logStoreByType != null) {
            logStoreByType.mo15253a(str2);
        }
    }

    private static String packLog(JSONArray jSONArray, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", jSONArray);
            JSONObject j2 = C6174c.m19152j();
            if (j2 != null) {
                JSONObject a = C9613b.m28454a(new JSONObject(j2.toString()), C6348a.m19690a().mo15234a(j));
                a.put("debug_fetch", 1);
                jSONObject.put("header", a);
                return jSONObject.toString();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public void getLegacyLog(long j, long j2, String str, C12917f fVar) {
        if (fVar != null && !TextUtils.isEmpty(str)) {
            C6354a logStoreByType = getLogStoreByType(str);
            if (logStoreByType != null) {
                List a = logStoreByType.mo15255a(j, j2, str, "0,100");
                if (!C6292i.m19525a(a)) {
                    Iterator it = a.iterator();
                    JSONArray jSONArray = new JSONArray();
                    LinkedList linkedList = new LinkedList();
                    long j3 = -1;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        try {
                            C6213e eVar = (C6213e) it.next();
                            if (j3 != -1) {
                                if (eVar.f18297j != j3) {
                                    break;
                                }
                            } else {
                                j3 = eVar.f18297j;
                            }
                            jSONArray.put(eVar.f18296i);
                            linkedList.add(Long.valueOf(eVar.f18293f));
                        } catch (Exception unused) {
                        }
                    }
                    packLog(jSONArray, j3);
                    C6292i.m19523a(linkedList, ",");
                }
            }
        }
    }
}
