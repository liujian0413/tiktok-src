package com.p280ss.android.ugc.aweme.experiment;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.service.C28677a;

/* renamed from: com.ss.android.ugc.aweme.experiment.a */
public final class C27685a {

    /* renamed from: a */
    public static final C27685a f72985a = new C27685a();

    private C27685a() {
    }

    /* renamed from: g */
    private final boolean m90830g() {
        if ((m90828e() & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo71137a() {
        if (C6399b.m19944t() || m90827d() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static int m90827d() {
        return C6384b.m19835a().mo15287a(FamiliarBarrageStrategyExperiment.class, true, "bullet_screen_strategy", C6384b.m19835a().mo15295d().bullet_screen_strategy, 0);
    }

    /* renamed from: e */
    private static int m90828e() {
        return C6384b.m19835a().mo15287a(FamiliarBarragePageExperiment.class, true, "bullet_screen_page", C6384b.m19835a().mo15295d().bullet_screen_page, 0);
    }

    /* renamed from: f */
    private final boolean m90829f() {
        if (!C28677a.m94352f().mo73744a() || (m90828e() & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo71139b() {
        if (C6399b.m19944t() || m90827d() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo71140c() {
        if (C6399b.m19944t() || m90827d() != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m90826a(String str) {
        if (C6399b.m19944t()) {
            return false;
        }
        CharSequence charSequence = str;
        if (TextUtils.equals(charSequence, "homepage_familiar") && m90829f()) {
            return true;
        }
        if ((TextUtils.equals(charSequence, "homepage_hot") || TextUtils.equals(charSequence, "homepage_follow")) && m90830g()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo71138a(String str, Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (aweme.isFamiliar() || TextUtils.equals(str, "homepage_familiar")) {
            return m90826a(str);
        }
        return false;
    }
}
