package com.bytedance.ies.ugc.statisticlogger.config;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.deviceregister.p289a.C6778a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.usergrowth.C45166a;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

public final class SetAppTrackTask implements LegoTask {
    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        try {
            String a = C45166a.m142381a(context.getPackageCodePath());
            if (!TextUtils.isEmpty(a)) {
                AppLog.setAppTrack(new JSONObject(a));
                Editor edit = C7285c.m22838a(context, C6778a.m20960a(), 0).edit();
                edit.putString("app_track", a);
                edit.apply();
            }
        } catch (Throwable unused) {
        }
    }
}
