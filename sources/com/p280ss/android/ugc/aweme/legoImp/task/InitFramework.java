package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p854d.C19291a;
import com.p280ss.android.p854d.C19292b;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.utils.C43171v;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitFramework */
public class InitFramework implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    private void initializeLaunchLog() {
        C19292b.m63215a(C6399b.m19921a());
        C19292b.m63217a(true);
        C19292b.m63215a(C6399b.m19921a()).f52196a = new C19291a() {
            public final void onEvent(Map<String, String> map) {
                C6906g.m21515a("launch_log", map);
            }
        };
    }

    public void run(Context context) {
        C7276d.m22804a(context);
        initializeLaunchLog();
        C43171v.m136920a().mo104784a(context);
    }
}
