package com.p280ss.android.message.p885a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.message.a.b */
public final class C19813b {
    /* renamed from: a */
    public static void m65416a(Context context) {
        Context applicationContext = context.getApplicationContext();
        C19818d b = m65418b(applicationContext);
        long currentTimeMillis = System.currentTimeMillis();
        b.mo53166a(Long.valueOf(currentTimeMillis));
        if (b.mo53164a() < 5 || currentTimeMillis - ((Long) b.mo53165a(0)).longValue() > 7000) {
            m65417a(applicationContext, b);
            Process.killProcess(Process.myPid());
        }
    }

    /* renamed from: b */
    private static C19818d<Long> m65418b(Context context) {
        SharedPreferences a = C7285c.m22838a(context.getApplicationContext(), "kill_process_sp", 0);
        C19818d<Long> dVar = new C19818d<>(5);
        String string = a.getString("last_kill_times", "");
        if (TextUtils.isEmpty(string)) {
            return dVar;
        }
        String[] split = string.split("\\|");
        for (int i = 0; i < split.length; i++) {
            try {
                dVar.mo53166a(Long.valueOf(Long.parseLong(split[i])));
            } catch (Exception unused) {
            }
        }
        return dVar;
    }

    /* renamed from: a */
    private static void m65417a(Context context, C19818d<Long> dVar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dVar.mo53164a(); i++) {
            sb.append(dVar.mo53165a(i));
            sb.append("|");
        }
        C7285c.m22838a(context.getApplicationContext(), "kill_process_sp", 0).edit().putString("last_kill_times", sb.toString()).commit();
    }
}
