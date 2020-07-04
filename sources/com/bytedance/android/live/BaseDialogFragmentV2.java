package com.bytedance.android.live;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import java.lang.reflect.Field;

public class BaseDialogFragmentV2 extends DialogFragment {
    /* renamed from: a */
    private void m9931a(String str, Object obj) {
        try {
            Field declaredField = BaseDialogFragmentV2.class.getSuperclass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(this, obj);
        } catch (Exception unused) {
        }
    }

    public void show(C0608j jVar, String str) {
        m9931a("mDismissed", Boolean.valueOf(false));
        m9931a("mShownByMe", Boolean.valueOf(true));
        C0633q a = jVar.mo2645a();
        a.mo2588a((Fragment) this, str);
        a.mo2606d();
    }

    public int show(C0633q qVar, String str) {
        m9931a("mDismissed", Boolean.valueOf(false));
        m9931a("mShownByMe", Boolean.valueOf(true));
        qVar.mo2588a((Fragment) this, str);
        m9931a("mViewDestroyed", Boolean.valueOf(false));
        int d = qVar.mo2606d();
        m9931a("mBackStackId", Integer.valueOf(d));
        return d;
    }

    public void showNow(C0608j jVar, String str) {
        m9931a("mDismissed", Boolean.valueOf(false));
        m9931a("mShownByMe", Boolean.valueOf(true));
        C0633q a = jVar.mo2645a();
        a.mo2588a((Fragment) this, str);
        try {
            a.mo2610f();
        } catch (Throwable unused) {
            a.mo2606d();
        }
    }
}
