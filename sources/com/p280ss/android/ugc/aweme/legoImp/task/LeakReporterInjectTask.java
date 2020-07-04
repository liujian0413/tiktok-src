package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.crash.C9912i;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p501j.p502a.C9930f;
import com.bytedance.crash.upload.C10016a;
import com.example.leakinterface.C13072a;
import com.example.leakinterface.C13074c;
import com.example.leakinterface.C13075d;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.memory.p1391a.C33200a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LeakReporterInjectTask */
public class LeakReporterInjectTask implements LegoTask {
    private final String TAG = "LeakDetector";

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$run$0$LeakReporterInjectTask(String str) {
        if (C9912i.m29316a()) {
            C9896a aVar = new C9896a(new JSONObject());
            aVar.mo24492a("data", (Object) str);
            aVar.mo24492a("isOOM", (Object) Boolean.valueOf(false));
            aVar.mo24492a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
            C10016a.m29765a().mo24637a(C9930f.m29397a().mo24554a(CrashType.JAVA, aVar), (File) null, (String) null, false);
        }
    }

    public void run(Context context) {
        if (C13074c.m38221a()) {
            C32410o oVar = new C32410o(this);
            C13075d.m38222a(oVar);
            C13075d.m38223b(oVar);
            C13072a.m38215a((int) C34943c.f91128x);
            C13072a.m38219b(10);
            C13072a.m38216a(60000);
            C13072a.m38217a(true);
            C33200a.f86388a.mo84955b();
        }
    }
}
