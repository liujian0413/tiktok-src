package com.p280ss.android.ugc.aweme.dynamicfeature;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.p254b.C6304f;
import com.google.android.play.core.splitinstall.C17133c;
import com.google.android.play.core.splitinstall.C17134d;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.dynamicfeature.InstalledModulesReportTask */
public class InstalledModulesReportTask implements LegoTask {
    private List<String> livePlugins = Arrays.asList(new String[]{"df_live_byte_link", "df_live_zego_link"});
    private volatile Context mContext;
    private volatile SharedPreferences mSp;
    private volatile C17133c manager;

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    /* access modifiers changed from: private */
    /* renamed from: upLoadLivePluginStatus */
    public void lambda$run$0$InstalledModulesReportTask() {
        int i;
        if (this.mContext != null) {
            if (this.mSp == null) {
                this.mSp = C7285c.m22838a(this.mContext, "google_play_plugin_status", 0);
            }
            if (this.manager == null) {
                this.manager = C17134d.m56791a(this.mContext);
            }
            Set b = this.manager.mo44407b();
            for (String str : this.livePlugins) {
                boolean contains = b.contains(str);
                String string = this.mSp.getString(str, "");
                if (contains) {
                    i = 3;
                    if (TextUtils.equals("stage_installed", string)) {
                        i = 1;
                    } else if (TextUtils.equals("stage_start_install", string)) {
                        i = 2;
                    }
                } else if (TextUtils.equals("stage_start_install", string)) {
                    i = 4;
                } else {
                    i = 0;
                }
                JSONObject jSONObject = new JSONObject();
                safePutString(jSONObject, "plugin_name", str);
                safePutInt(jSONObject, "plugin_status", i);
                monitor("ttlive_plugin_installed_all", jSONObject);
            }
        }
    }

    private JSONObject generateFinalExtra(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    public void run(Context context) {
        if (VERSION.SDK_INT >= 21) {
            this.mContext = context.getApplicationContext();
            C6304f.submitRunnable(new C27324b(this));
        }
    }

    private void monitor(String str, JSONObject jSONObject) {
        C6893q.m21448a(str, (JSONObject) null, generateFinalExtra(jSONObject));
    }

    private void safePutInt(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
        } catch (Exception unused) {
        }
    }

    private void safePutString(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }
}
