package com.p280ss.android.ugc.aweme.analysis;

import com.bytedance.crash.C9912i;
import com.bytedance.crash.CrashType;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.analysis.d */
public final class C22503d {

    /* renamed from: a */
    private static final String f59948a;

    /* renamed from: a */
    public static void m74413a() {
        C9912i.m29312a(C22504e.f59949a, CrashType.ALL);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C7276d.m22809b(C6399b.m19921a()));
        sb.append(File.separator);
        sb.append("local_test_crash");
        sb.append(File.separator);
        sb.append("local_test_crash.txt");
        f59948a = sb.toString();
    }

    /* renamed from: a */
    static final /* synthetic */ void m74414a(CrashType crashType, String str, Thread thread) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aid", C6399b.m19935k());
            jSONObject.put("type", crashType.getName());
            String str2 = "unknown";
            if (thread != null) {
                str2 = thread.getName();
            }
            jSONObject.put("thread", str2);
            jSONObject.put("crash", str);
        } catch (JSONException unused) {
        }
        C42973bg.m136422a(f59948a, true);
        C7276d.m22807a(f59948a, C42996by.m136485a(jSONObject));
    }
}
