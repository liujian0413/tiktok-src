package com.p280ss.android.ugc.aweme.feed.p1234j;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.feed.experiment.DDislikeStyleExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.LongPressEnterMaskLayerExperiment;
import com.p280ss.android.ugc.aweme.main.C33058m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.j.r */
public final class C28502r {

    /* renamed from: a */
    public static final C28502r f75124a = new C28502r();

    private C28502r() {
    }

    /* renamed from: a */
    public static final boolean m93676a(String str) {
        C7573i.m23587b(str, "eventType");
        CharSequence charSequence = str;
        if (TextUtils.equals(charSequence, "homepage_hot")) {
            return true;
        }
        C33058m a = C6903bc.m21482a();
        C7573i.m23582a((Object) a, "LegacyServiceUtils.getMainPageExperimentService()");
        if ((a.mo84630a() && TextUtils.equals(charSequence, "homepage_follow")) || DDislikeStyleExperiment.enableDetailShowOptionDialog()) {
            return true;
        }
        if (!C6399b.m19944t() || !C6384b.m19835a().mo15292a(LongPressEnterMaskLayerExperiment.class, true, "show_global_multi_func", C6384b.m19835a().mo15295d().show_global_multi_func, false)) {
            return false;
        }
        return true;
    }
}
