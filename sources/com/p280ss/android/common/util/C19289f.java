package com.p280ss.android.common.util;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.app.api.C22839k;
import com.p280ss.android.ugc.aweme.net.experiment.LinkSelectorTypeExperiment;

/* renamed from: com.ss.android.common.util.f */
final class C19289f {
    /* renamed from: a */
    static int m63207a() throws Exception {
        return C22839k.m75280a();
    }

    /* renamed from: a */
    static String m63208a(String str) {
        return C6384b.m19835a().mo15287a(LinkSelectorTypeExperiment.class, true, "link_selector_type", C6384b.m19835a().mo15295d().link_selector_type, 0) == 1 ? str : NetworkUtils.filterUrl$___twin___(str);
    }
}
