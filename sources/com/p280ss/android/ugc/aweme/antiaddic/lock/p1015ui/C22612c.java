package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.TimeLockAboutFragment;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.TimeLockEnterFragment;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.TimeLockOptionsFragment;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.TimeLockSetFragment;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2.TeenagerLockAboutFragmentV2;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2.TeenagerLockOptionsFragmentV2;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2.TimeLockAboutFragmentV2;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2.TimeLockEnterFragmentV2;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2.TimeLockOptionsFragmentV2;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2.TimeLockSetFragmentV2;
import com.p280ss.android.ugc.aweme.mobile.p1400a.C33598a;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.c */
public final class C22612c {
    /* renamed from: b */
    private static boolean m74773b() {
        return false;
    }

    /* renamed from: a */
    public static Fragment m74769a() {
        return m74772b(0);
    }

    /* renamed from: a */
    public static Fragment m74770a(int i) {
        if (m74773b()) {
            return C33598a.m108487a(TimeLockAboutFragment.class).mo85932a();
        }
        if (i == 0) {
            return C33598a.m108487a(TimeLockAboutFragmentV2.class).mo85932a();
        }
        return C33598a.m108487a(TeenagerLockAboutFragmentV2.class).mo85932a();
    }

    /* renamed from: b */
    public static Fragment m74772b(int i) {
        if (m74773b()) {
            return C33598a.m108487a(TimeLockEnterFragment.class).mo85932a();
        }
        return C33598a.m108487a(TimeLockEnterFragmentV2.class).mo85933a("type_close", i).mo85932a();
    }

    /* renamed from: c */
    public static Fragment m74774c(int i) {
        if (m74773b()) {
            return C33598a.m108487a(TimeLockOptionsFragment.class).mo85932a();
        }
        if (i == 0) {
            return C33598a.m108487a(TimeLockOptionsFragmentV2.class).mo85932a();
        }
        return C33598a.m108487a(TeenagerLockOptionsFragmentV2.class).mo85932a();
    }

    /* renamed from: a */
    public static Fragment m74771a(boolean z) {
        if (m74773b()) {
            return C33598a.m108487a(TimeLockSetFragment.class).mo85934a("from_change_pwd", z).mo85932a();
        }
        return C33598a.m108487a(TimeLockSetFragmentV2.class).mo85934a("from_change_pwd", z).mo85932a();
    }
}
