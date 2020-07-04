package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.usergrowth.C45166a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SetAppTrackTask */
public class SetAppTrackTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        C6921a.m21555a("SetAppTrackTask");
        setAppTrack(context);
    }

    private static void setAppTrack(Context context) {
        try {
            String a = C45166a.m142381a(context.getPackageCodePath());
            if (!TextUtils.isEmpty(a)) {
                AppLog.setAppTrack(new JSONObject(a));
                Editor edit = C7285c.m22838a(context, "applog_stats", 0).edit();
                edit.putString("app_track", a);
                edit.apply();
            }
        } catch (Throwable unused) {
        }
    }
}
