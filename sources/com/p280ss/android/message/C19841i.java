package com.p280ss.android.message;

import android.content.Context;
import android.content.Intent;
import com.p280ss.android.pushmanager.C20074g;
import com.p280ss.android.pushmanager.setting.C20090b;

/* renamed from: com.ss.android.message.i */
public class C19841i {

    /* renamed from: a */
    private static final String f53800a = "i";

    /* renamed from: b */
    public static Class m65520b() {
        return NotifyService.class;
    }

    /* renamed from: a */
    public static boolean m65518a() {
        return C20090b.m66187a().mo53789o();
    }

    /* renamed from: a */
    public static Intent m65516a(Context context) {
        return new Intent(context.getApplicationContext(), m65520b());
    }

    /* renamed from: b */
    public static Intent m65519b(Context context) {
        Intent a = m65516a(context);
        a.setAction("pull_do_schedule");
        a.putExtra("from_schedule", true);
        return a;
    }

    /* renamed from: c */
    public static Intent m65521c(Context context) {
        Intent a = m65516a(context);
        a.setAction("push_heart_beat");
        a.putExtra("push_heart_beat", true);
        return a;
    }

    /* renamed from: d */
    public static void m65522d(Context context) {
        try {
            Intent b = m65519b(context);
            b.putExtra("do_schedule_pause", true);
            context.startService(b);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static void m65523e(Context context) {
        try {
            Intent a = m65516a(context);
            a.putExtra("do_schedule_start", true);
            a.putExtra("do_schedule_start_type", 1);
            context.startService(a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m65517a(Context context, int i) {
        if (C20074g.f54271a.contains(Integer.valueOf(2))) {
            try {
                Intent a = m65516a(context);
                a.putExtra("do_schedule_start", true);
                a.putExtra("do_schedule_start_type", 2);
                context.startService(a);
            } catch (Exception unused) {
            }
        }
    }
}
