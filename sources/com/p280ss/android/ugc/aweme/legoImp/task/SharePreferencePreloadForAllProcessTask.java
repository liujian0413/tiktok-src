package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadForAllProcessTask */
public class SharePreferencePreloadForAllProcessTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        C6921a.m21555a("SharePreferencePreloadForAllProcessTask");
        preloadSharedPreferences(context, "app_setting", 0);
        preloadSharedPreferences(context, "use_https", 0);
        preloadSharedPreferences(context, "update_params", 0);
        preloadSharedPreferences(context, "is_allow_oppo_push", 0);
        preloadSharedPreferences(context, "push_setting", 0);
        preloadSharedPreferences(context, "push_multi_process_config", 4);
        preloadSharedPreferences(context, "applog_stats", 0);
    }

    private void preloadSharedPreferences(Context context, String str, int i) {
        C7285c.m22838a(context, str, i).getAll();
    }
}
