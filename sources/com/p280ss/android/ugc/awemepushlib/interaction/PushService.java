package com.p280ss.android.ugc.awemepushlib.interaction;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.message.sswo.SswoActivity;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.push.C20007a;
import com.p280ss.android.pushmanager.client.C20070h;
import com.p280ss.android.pushmanager.client.MessageAppManager;
import com.p280ss.android.ugc.aweme.C21676bi;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.awemepushapi.C43587a;
import com.p280ss.android.ugc.awemepushapi.IPushApi;
import com.p280ss.android.ugc.awemepushlib.manager.C43633a;
import com.p280ss.android.ugc.awemepushlib.p1715os.lifecycle.LifecycleCallbackAdapter;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.PushService */
public class PushService implements IPushApi {
    public void initMessageDepend() {
        C43604e.m138183a();
    }

    public void initNotificationChannel() {
        C43601c.m138169a(C6399b.m19921a());
    }

    public boolean isSswoAct(Activity activity) {
        return activity instanceof SswoActivity;
    }

    public void setAutoDisappear(int i) {
        C43604e.f112848a = i;
    }

    private synchronized boolean getConfirmPush(Context context) {
        return C43633a.m138259c().mo105557b(context);
    }

    private boolean getNotifyEnabled(Context context) {
        return C43633a.m138259c().mo105558c(context);
    }

    public void initPushAccountService(boolean z) {
        if (C6399b.m19944t()) {
            C43604e.m138190a(C6399b.m19921a(), z);
        }
    }

    private String getParameterString(Uri uri, String str) {
        try {
            return uri.getQueryParameter(str);
        } catch (Exception unused) {
            return "";
        }
    }

    private void setNotifyEnabled(Context context, boolean z) {
        C43633a.m138259c().mo105555b(context, z);
    }

    public void notifyOnLocationChanged(Context context, String str) {
        C20070h.m66075a();
        C20070h.m66076a(context, str);
    }

    private synchronized void setConfirmPush(Context context, boolean z) {
        C43633a.m138259c().mo105551a(context, z);
    }

    public void init(Context context, C43587a aVar) {
        boolean b = C6776h.m20947b(context);
        C43604e.m138191a(context, b, aVar);
        C21676bi.m72554a(b, context);
    }

    public void initImmediately(Context context, C43587a aVar) {
        boolean b = C6776h.m20947b(context);
        C43604e.m138192a(context, b, aVar, true);
        C21676bi.m72554a(b, context);
    }

    public void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri) {
        long j;
        Intent intent2 = intent;
        Uri uri2 = uri;
        if (!z) {
            C43603d.m138179a(uri.toString());
            return;
        }
        try {
            int a = C20007a.m65932a(intent2, "msg_from", -1);
            int a2 = C20007a.m65932a(intent2, "msg_id", -1);
            HashMap hashMap = (HashMap) intent2.getSerializableExtra("log_data_extra_to_adsapp");
            if (hashMap == null) {
                hashMap = new HashMap(8);
                if (uri2 != null) {
                    String parameterString = getParameterString(uri2, "push_id");
                    if (!TextUtils.isEmpty(parameterString)) {
                        hashMap.put("rule_id", parameterString);
                    }
                    String parameterString2 = getParameterString(uri2, "gd_label");
                    if (!TextUtils.isEmpty(parameterString2)) {
                        hashMap.put("push_label", parameterString2);
                    }
                    String host = uri.getHost();
                    String parameterString3 = getParameterString(uri2, "id");
                    if (C22704b.f60415d.equals(host) && !TextUtils.isEmpty(parameterString3)) {
                        hashMap.put("group_id", getParameterString(uri2, "id"));
                    } else if (!TextUtils.isEmpty(host) && "aweme".equals(host) && !TextUtils.isEmpty(uri.getLastPathSegment())) {
                        hashMap.put("group_id", uri.getLastPathSegment());
                    }
                }
            }
            String stringExtra = intent2.getStringExtra("post_back");
            String str = (String) hashMap.get("rule_id");
            if (TextUtils.isEmpty(intent2.getStringExtra("rule_id"))) {
                intent2.putExtra("rule_id", str);
            }
            String parameterString4 = getParameterString(uri2, "push_params");
            if (!TextUtils.isEmpty(parameterString4)) {
                hashMap.put("feed_batch_params", parameterString4);
            }
            String parameterString5 = getParameterString(uri2, C22704b.f60416e);
            if (!TextUtils.isEmpty(parameterString5) && TextUtils.equals("aweme", uri.getHost())) {
                if (parameterString5.contains(",")) {
                    parameterString5 = parameterString5.substring(0, parameterString5.indexOf(","));
                }
                hashMap.put("group_id", parameterString5);
            }
            int a3 = C20007a.m65932a(intent2, "message_from", -1);
            String stringExtra2 = intent2.getStringExtra("message_extra");
            JSONObject jSONObject = new JSONObject(hashMap);
            if (TextUtils.isEmpty(str)) {
                j = (long) a2;
            } else {
                j = Long.valueOf(str).longValue();
            }
            switch (a) {
                case 1:
                    C43603d.m138176a(context, "news_notify_view", (long) a2, -1, new JSONObject[0]);
                    trackClickPush(context, j, true, stringExtra, jSONObject);
                    break;
                case 2:
                    C43603d.m138176a(context, "news_notify_view", (long) a2, -1, new JSONObject[0]);
                    trackClickPush(context, j, false, stringExtra, jSONObject);
                    break;
            }
            if (a3 != -1 && !C6319n.m19593a(stringExtra2)) {
                MessageAppManager.inst().trackPush(context, a3, stringExtra2);
            }
        } catch (Exception unused) {
        }
    }

    private void trackClickPush(Context context, long j, boolean z, String str, JSONObject jSONObject) {
        if (!C30538p.m99745a()) {
            MessageAppManager.inst().trackClickPush(context, j, z, str, jSONObject);
        } else {
            C43603d.m138174a(j, str, jSONObject, z);
        }
        Application a = C29960a.m98230a();
        final long j2 = j;
        final boolean z2 = z;
        final String str2 = str;
        final JSONObject jSONObject2 = jSONObject;
        C435971 r0 = new LifecycleCallbackAdapter() {
            public final void onActivityResumed(Activity activity) {
                C29960a.m98230a().unregisterActivityLifecycleCallbacks(this);
                C6726a.m20844b(new Runnable() {
                    public final void run() {
                        C43603d.m138175a(j2, z2, str2, jSONObject2);
                    }
                });
            }
        };
        a.registerActivityLifecycleCallbacks(r0);
    }
}
