package com.p280ss.android.message.sswo;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.view.Display;
import com.p280ss.android.pushmanager.setting.C20090b;

/* renamed from: com.ss.android.message.sswo.a */
public class C19894a {

    /* renamed from: c */
    private static volatile C19894a f53956c;

    /* renamed from: a */
    private Context f53957a;

    /* renamed from: b */
    private SswoReceiver f53958b = new SswoReceiver();

    /* renamed from: d */
    public final void mo53316d() {
        try {
            SswoActivity.m65683b(this.f53957a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo53314b() {
        try {
            this.f53957a.unregisterReceiver(this.f53958b);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final void mo53315c() {
        try {
            if (!C20090b.m66187a().mo53792s()) {
                mo53316d();
            } else {
                SswoActivity.m65680a(this.f53957a);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo53313a() {
        try {
            if (!C20090b.m66187a().mo53792s()) {
                mo53314b();
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f53957a.registerReceiver(this.f53958b, intentFilter);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public final boolean mo53317e() {
        try {
            if (VERSION.SDK_INT >= 20) {
                Display[] displays = ((DisplayManager) this.f53957a.getSystemService("display")).getDisplays();
                if (displays == null || displays.length <= 0 || 1 != displays[0].getState()) {
                    return false;
                }
                return true;
            } else if (!((PowerManager) this.f53957a.getSystemService("power")).isScreenOn()) {
                return true;
            } else {
                return false;
            }
        } catch (Throwable unused) {
        }
    }

    private C19894a(Context context) {
        this.f53957a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C19894a m65685a(Context context) {
        if (f53956c == null) {
            synchronized (C19894a.class) {
                if (f53956c == null) {
                    f53956c = new C19894a(context);
                }
            }
        }
        return f53956c;
    }
}
