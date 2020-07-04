package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.facebook.C13499h;
import com.facebook.FacebookException;
import com.facebook.applinks.C13193a;
import com.facebook.applinks.C13193a.C13195a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.money.growth.C33633c.C33634a;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.trill.p1759b.C44984a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AppLinkDataTask */
public class AppLinkDataTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        safeRunTask(context);
    }

    private void fetchDeferredAppLinkData(final Context context) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        C13193a.m38570a(context, new C13195a() {
            /* renamed from: a */
            public final void mo32382a(C13193a aVar) {
                String str;
                if (aVar != null) {
                    Bundle bundle = aVar.f34947c;
                    if (bundle != null) {
                        String string = bundle.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                        if (!TextUtils.isEmpty(string) && !C33634a.m108554b().mo86017a(string)) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("channel", "facebook");
                                jSONObject.put("url", string);
                                String str2 = "target";
                                if (aVar.f34946b == null) {
                                    str = "";
                                } else {
                                    str = aVar.f34946b.toString();
                                }
                                jSONObject.put(str2, str);
                                jSONObject.put("total_time", SystemClock.uptimeMillis() - C6857a.m21312e().f19502b);
                                jSONObject.put("fetch_time", SystemClock.uptimeMillis() - uptimeMillis);
                            } catch (JSONException unused) {
                            }
                            C6379c.m19826a("deep_link", jSONObject);
                            C44984a.m141937a(string);
                            Intent intent = new Intent(context, C6903bc.m21503v().mo58103a());
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(aVar.f34946b);
                            intent.putExtra("dl_from", "facebook");
                            intent.addFlags(268435456);
                            intent.putExtra("from_notification", false);
                            intent.putExtra("from_task", true);
                            context.startActivity(intent);
                        }
                    }
                }
            }
        });
    }

    private void reTryRunTask(Context context) {
        try {
            C13499h.m39707a("597615686992125");
            fetchDeferredAppLinkData(context);
        } catch (FacebookException | NullPointerException e) {
            C2077a.m9161a(e, "fetchDeferredAppLinkData retry failed");
        }
    }

    private void safeRunTask(Context context) {
        try {
            fetchDeferredAppLinkData(context);
        } catch (FacebookException | NullPointerException e) {
            C2077a.m9161a(e, "fetchDeferredAppLinkData first failed");
            reTryRunTask(context);
        }
    }
}
