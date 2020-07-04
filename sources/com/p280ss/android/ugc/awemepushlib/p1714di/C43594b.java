package com.p280ss.android.ugc.awemepushlib.p1714di;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.p534b.C10295a;
import com.p280ss.android.common.util.MultiProcessSharedProvider;
import com.p280ss.android.common.util.MultiProcessSharedProvider.C19285a;
import com.p280ss.android.push.window.oppo.C20023a;
import com.p280ss.android.push.window.oppo.C20025c;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.awemepushlib.interaction.C43603d;
import com.p280ss.android.ugc.awemepushlib.model.C43639a;
import com.p280ss.android.ugc.awemepushlib.model.PushMsg;
import com.p280ss.android.ugc.awemepushlib.p1713b.C43590a;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.di.b */
public final class C43594b implements C20023a {
    /* renamed from: a */
    public final void mo53608a(Context context, Map<String, ?> map) {
        try {
            C19285a a = MultiProcessSharedProvider.m63189a(context);
            for (Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    a.mo51176a((String) entry.getKey(), ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    a.mo51177a((String) entry.getKey(), ((Long) value).longValue());
                } else if (value instanceof Float) {
                    a.mo51175a((String) entry.getKey(), ((Float) value).floatValue());
                } else if (value instanceof Boolean) {
                    a.mo51179a((String) entry.getKey(), ((Boolean) value).booleanValue());
                } else if (value instanceof String) {
                    a.mo51178a((String) entry.getKey(), (String) value);
                }
            }
            a.mo51180a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final String mo53606a(Context context, String str, String str2) {
        return MultiProcessSharedProvider.m63193b(context).mo51183a(str, str2);
    }

    /* renamed from: a */
    public static boolean m138151a(final Context context, final PushMsg pushMsg, final int i, final HashMap hashMap) {
        if (!C20025c.m65968a(context).mo53617a() || !C43590a.m138128a(pushMsg.originData, pushMsg.title, pushMsg.text) || pushMsg.extra.floatWindow != 1) {
            return false;
        }
        C43603d.m138178a(pushMsg, false, i);
        C20025c.m65968a(context).mo53616a(pushMsg.originData, pushMsg.text, pushMsg.title, pushMsg.f112935id, i, pushMsg.extra.toJsonString(), false, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                try {
                    Intent a = C43639a.m138283a(context, pushMsg);
                    if (a != null) {
                        a.addFlags(268435456);
                        a.putExtra("from_notification", true);
                        a.putExtra("msg_from", 2);
                        a.putExtra("msg_id", pushMsg.f112935id);
                        a.putExtra("message_from", i);
                        if (!C30538p.m99745a()) {
                            a.putExtra("msg_post_back", pushMsg.postBack);
                        }
                        if (!C6319n.m19593a(pushMsg.extra.toJsonString())) {
                            a.putExtra("message_extra", pushMsg.extra.toJsonString());
                        }
                        a.putExtra("log_data_extra_to_adsapp", hashMap);
                        if (!C43590a.m138124a(pushMsg.pass_through, context, a)) {
                            context.startActivity(a);
                        }
                    }
                } catch (Exception e) {
                    Context context = context;
                    StringBuilder sb = new StringBuilder("can not get launch intent: ");
                    sb.append(e);
                    C10295a.m30492a(context, sb.toString());
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public final void mo53607a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        C6906g.m21514a(context, str, str2, str3, j, j2, jSONObject);
    }
}
