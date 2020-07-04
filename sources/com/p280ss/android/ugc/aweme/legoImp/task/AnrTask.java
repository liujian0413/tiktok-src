package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import com.bytedance.crash.C9912i;
import com.p280ss.android.anrmonitor.ANRError;
import com.p280ss.android.anrmonitor.C19214a;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.utils.C43121fe;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AnrTask */
public class AnrTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    private void uploadANRToSlardar(ANRError aNRError) {
        if (C9912i.m29316a() && aNRError != null && aNRError.getStackTraces() != null) {
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) aNRError.getStackTraces().get(Looper.getMainLooper().getThread());
            if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
                StringBuilder sb = new StringBuilder("AnrMonitor: ");
                sb.append(stackTraceElementArr[0].toString());
                sb.append(" caused anr\nat ");
                sb.append(stackTraceElementArr[0].getClassName());
                sb.append(" (");
                sb.append(C43121fe.m136752b(stackTraceElementArr[0].getClassName()));
                sb.append(".java:0)\n");
                sb.append(C43121fe.m136750a(stackTraceElementArr));
                C43121fe.m136751a(sb.toString());
            }
        }
    }

    public void run(Context context) {
        int i;
        if (C7163a.m22363a() && !C7188c.m22428a()) {
            C6921a.m21555a("AnrTask");
            if (!C7285c.m22838a(C29960a.m98230a(), "test_data", 0).getBoolean("sp_key_enable_anr", false)) {
                try {
                    Class.forName("butterknife.RConverter");
                } catch (ClassNotFoundException unused) {
                }
                if (VERSION.SDK_INT <= 19) {
                    i = 50000;
                } else {
                    i = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
                }
                new C19214a(i, i / 2).mo50915a(new C32397b(this)).start();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$run$0$AnrTask(ANRError aNRError, int i) {
        if (!C7163a.m22363a()) {
            return;
        }
        if (2 == i) {
            uploadANRToSlardar(aNRError);
        } else if (1 == i) {
            throw aNRError;
        } else {
            throw aNRError;
        }
    }
}
