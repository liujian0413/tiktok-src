package com.bytedance.android.livesdkapi.p452h;

import android.app.Activity;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.DrawerLayout;
import com.bytedance.android.livesdkapi.C9289b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdkapi.h.h */
public final class C9420h {
    /* renamed from: a */
    public static boolean m27939a(Activity activity) {
        if (activity != null && (activity instanceof C9289b)) {
            return ((C9289b) activity).mo22779b();
        }
        return false;
    }

    /* renamed from: a */
    public static void m27938a(Activity activity, Boolean bool) {
        if (activity != null && (activity instanceof C9289b)) {
            if (m27939a(activity)) {
                ((C9289b) activity).mo22777a(bool);
                return;
            }
            DrawerLayout a = ((C9289b) activity).mo22775a();
            if (a != null && C0991u.m4170G(a)) {
                if (bool.booleanValue()) {
                    a.openDrawer(8388613);
                    return;
                }
                a.closeDrawer(8388613);
            }
        }
    }

    /* renamed from: a */
    public static void m27937a(Activity activity, Room room, boolean z) {
        if (room != null && !room.isOfficial() && (activity instanceof C9289b)) {
            DrawerLayout a = ((C9289b) activity).mo22775a();
            if (a != null && C0991u.m4170G(a)) {
                if (z) {
                    a.setDrawerLockMode(1);
                    return;
                }
                a.setDrawerLockMode(0);
            }
        }
    }
}
