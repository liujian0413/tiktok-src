package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitReportSignature */
public class InitReportSignature implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        NetworkUtils.setServerTimeFromResponse(C32408m.f84525a);
    }

    static final /* synthetic */ long lambda$run$0$InitReportSignature(String str) {
        try {
            return ((JSONObject) new JSONObject(str).get("extra")).optLong("now", -1);
        } catch (Exception unused) {
            return -1;
        }
    }
}
