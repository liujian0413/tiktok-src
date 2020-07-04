package com.p280ss.android.ugc.aweme.lancet;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ttnet.C12961d;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.net.corenet.C34061f;
import com.p280ss.android.ugc.aweme.setting.C7208as;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.lancet.I18nLancet */
public final class I18nLancet {

    /* renamed from: a */
    public static String f84337a;

    /* renamed from: com.ss.android.ugc.aweme.lancet.I18nLancet$AmeActivityResumeRun */
    public static class AmeActivityResumeRun implements LegoTask {
        private Activity mContext;

        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        public AmeActivityResumeRun(Activity activity) {
            this.mContext = activity;
        }

        public void run(Context context) {
            if (C34061f.m109671b() && this.mContext != null) {
                C12961d.m37776a(this.mContext);
            }
            AbTestModel d = C7213d.m22500a().mo18803bo();
            if (d != null && d.useNewAppAlert == 0) {
                AppLog.activeUser(AwemeApplication.m21341a());
            }
            C7208as.m22479a().mo18706c();
        }
    }

    /* renamed from: a */
    public static void m104794a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.isNull(str)) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException unused) {
            }
        }
    }
}
