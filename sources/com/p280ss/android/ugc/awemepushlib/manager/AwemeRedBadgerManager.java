package com.p280ss.android.ugc.awemepushlib.manager;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0055r;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.statisticlogger.C10981a;
import com.p280ss.android.newmedia.redbadge.C19991g;
import com.p280ss.android.newmedia.redbadge.RedBadgerException;
import com.p280ss.android.newmedia.redbadge.p895b.C19979a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.pushmanager.C20074g;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.awemepushlib.interaction.C43604e;
import com.p280ss.android.ugc.awemepushlib.model.PushMsg;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager */
public class AwemeRedBadgerManager implements GenericLifecycleObserver {

    /* renamed from: b */
    private static AwemeRedBadgerManager f112880b = new AwemeRedBadgerManager();

    /* renamed from: a */
    C19991g f112881a = C19991g.m65902a();

    /* renamed from: c */
    private boolean f112882c = "oppo".equalsIgnoreCase(Build.BRAND);

    /* renamed from: d */
    private boolean f112883d = "vivo".equalsIgnoreCase(Build.BRAND);

    /* renamed from: e */
    private boolean f112884e;

    /* renamed from: a */
    public static AwemeRedBadgerManager m138220a() {
        return f112880b;
    }

    /* renamed from: b */
    public final void mo105542b() {
        C0055r.m126a().getLifecycle().mo55a(this);
    }

    public AwemeRedBadgerManager() {
        boolean z;
        if (this.f112882c || this.f112883d) {
            z = true;
        } else {
            z = false;
        }
        this.f112884e = z;
    }

    /* renamed from: a */
    public static void m138221a(Context context) {
        try {
            if (!C6319n.m19593a(C10981a.m32172c()) && !C6319n.m19593a(C10981a.m32174d())) {
                C19979a.m65855a(context).mo53485d(((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).getSessionKey());
                C19979a.m65855a(context).mo53487e(C43636d.m138282a());
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static String m138224b(Context context) {
        ResolveInfo resolveInfo;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            resolveInfo = context.getPackageManager().resolveActivity(intent, 65536);
        } catch (Throwable unused) {
            resolveInfo = null;
        }
        if (resolveInfo == null || resolveInfo.activityInfo == null) {
            return "";
        }
        return resolveInfo.activityInfo.packageName;
    }

    /* renamed from: a */
    private void m138222a(Context context, int i) throws RedBadgerException {
        this.f112881a.mo53510b(context, i);
    }

    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        if (event == Event.ON_START) {
            C6726a.m20842a(new Runnable() {
                public final void run() {
                    if (C43604e.f112848a == 0 || C43604e.f112848a == 2) {
                        AwemeRedBadgerManager.this.f112881a.mo53508a(C29960a.m98230a());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final boolean mo105540a(Context context, PushMsg pushMsg) {
        String str;
        boolean z;
        try {
            boolean z2 = true;
            if (1 != pushMsg.extra.redBadgeOnly || pushMsg.extra.badgeCount < 0) {
                if (pushMsg.extra.badgeCount >= 0) {
                    String str2 = "";
                    try {
                        m138222a(context, pushMsg.extra.badgeCount);
                    } catch (RedBadgerException e) {
                        str2 = Log.getStackTraceString(e);
                        z2 = false;
                    }
                    m138223a(context, pushMsg.extra.badgeCount, z2, str2, pushMsg);
                    m138225b(context, pushMsg.extra.badgeCount, z2, str2, pushMsg);
                }
                return false;
            }
            String str3 = "";
            m138222a(context, pushMsg.extra.badgeCount);
            str = str3;
            z = true;
            m138223a(context, pushMsg.extra.badgeCount, z, str, pushMsg);
            m138225b(context, pushMsg.extra.badgeCount, z, str, pushMsg);
            return true;
        } catch (RedBadgerException e2) {
            str = Log.getStackTraceString(e2);
            z = false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo105541a(JSONObject jSONObject, Context context) {
        boolean z;
        boolean a = C19979a.m65855a(context).mo53477a();
        String b = C19979a.m65855a(context).mo53478b();
        boolean z2 = false;
        if (jSONObject.optInt("is_desktop_red_badge_show", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        if ((!this.f112884e || C6399b.m19944t()) && z != a) {
            C19979a.m65855a(context).mo53476a(z);
            z2 = true;
        }
        String optString = jSONObject.optString("desktop_red_badge_args", "");
        if (optString != null && !optString.equals(b)) {
            C19979a.m65855a(context).mo53475a(optString);
            z2 = true;
        }
        if (!C19979a.m65855a(context).mo53477a() && C43604e.f112848a == 0) {
            C19991g.m65902a().mo53508a(context);
        }
        return z2;
    }

    /* renamed from: a */
    private static void m138223a(Context context, int i, boolean z, String str, PushMsg pushMsg) {
        Bundle bundle = new Bundle();
        bundle.putInt("success", z ? 1 : 0);
        if (!z) {
            String str2 = "stack_info";
            if (str == null) {
                str = "";
            }
            bundle.putString(str2, str);
        }
        String b = m138224b(context);
        String str3 = "launcher_package";
        if (b == null) {
            b = "";
        }
        bundle.putString(str3, b);
        long j = (long) pushMsg.f112935id;
        try {
            if (!C6319n.m19593a(pushMsg.openUrl)) {
                Uri parse = Uri.parse(pushMsg.openUrl);
                if (parse != null) {
                    long parseLong = Long.parseLong(parse.getQueryParameter("push_id"));
                    if (parseLong > 0) {
                        j = parseLong;
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        bundle.putLong("rule_id", j);
        C6907h.m21522a("red_badge_receive", bundle);
    }

    /* renamed from: b */
    private static void m138225b(Context context, int i, boolean z, String str, PushMsg pushMsg) {
        if (context != null) {
            try {
                C20074g.m66102a().mo53709a(context, "umeng", "red_badge", "destop_red_badge", (long) i, 0, new JSONObject());
            } catch (Throwable unused) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("badge_number", i);
        bundle.putInt("success", z ? 1 : 0);
        if (!z) {
            String str2 = "stack_info";
            if (str == null) {
                str = "";
            }
            bundle.putString(str2, str);
        }
        String b = m138224b(context);
        String str3 = "launcher_package";
        if (b == null) {
            b = "";
        }
        bundle.putString(str3, b);
        bundle.putString("show_type", "receive");
        long j = (long) pushMsg.f112935id;
        try {
            if (!C6319n.m19593a(pushMsg.openUrl)) {
                Uri parse = Uri.parse(pushMsg.openUrl);
                if (parse != null) {
                    long parseLong = Long.parseLong(parse.getQueryParameter("push_id"));
                    if (parseLong > 0) {
                        j = parseLong;
                    }
                }
            }
        } catch (NumberFormatException unused2) {
        }
        bundle.putLong("rule_id", j);
        C6907h.m21522a("red_badge_show", bundle);
    }
}
