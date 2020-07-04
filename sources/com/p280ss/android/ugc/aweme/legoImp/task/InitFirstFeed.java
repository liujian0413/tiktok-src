package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.feed.preload.C28662h;
import com.p280ss.android.ugc.aweme.feed.preload.C28666j;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitFirstFeed */
public class InitFirstFeed implements LegoTask {
    public static volatile boolean isLoadInApp;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitFirstFeed$a */
    static class C32367a {

        /* renamed from: a */
        public static C32368a f84482a;

        /* renamed from: b */
        private static volatile boolean f84483b;

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitFirstFeed$a$a */
        enum C32368a {
            A,
            B
        }

        /* renamed from: a */
        public static void m104932a() {
            if (!f84483b) {
                f84483b = true;
                String string = Secure.getString(C6399b.m19921a().getContentResolver(), "android_id");
                if (!TextUtils.isEmpty(string)) {
                    if (string.charAt(string.length() - 1) % 2 == 0) {
                        f84482a = C32368a.A;
                    } else {
                        f84482a = C32368a.B;
                    }
                    C1592h.m7853a((Callable<TResult>) new C32405j<TResult>(string));
                }
            }
        }

        /* renamed from: a */
        static final /* synthetic */ Object m104931a(String str) throws Exception {
            int i;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("openudid", str);
                String str2 = "group";
                if (f84482a == C32368a.A) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put(str2, i);
            } catch (JSONException unused) {
            }
            jSONObject.put("event", "feed_preload");
            jSONObject.put("scene", "network");
            AppLog.recordMiscLog(C6399b.m19921a(), "app_perf", jSONObject);
            return null;
        }
    }

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public static void start() {
        if (!isLoadInApp) {
            load();
        }
    }

    private static void load() {
        ((C28666j) C28662h.m94303a().mo73724a(4)).mo73733h();
    }

    static final /* synthetic */ Object lambda$run$0$InitFirstFeed() throws Exception {
        SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "first_feed_sp", 0);
        if (a.getBoolean("is_new_install", true)) {
            a.edit().putBoolean("is_new_install", false).commit();
            C32367a.m104932a();
            if (C32367a.f84482a == C32368a.A) {
                isLoadInApp = true;
                load();
            }
        }
        return null;
    }

    public void run(Context context) {
        C1592h.m7853a(C32404i.f84521a);
    }
}
