package com.p280ss.android.ugc.aweme.discover.p1185ui;

import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.MixIntermediateFragment */
public final class MixIntermediateFragment extends SearchIntermediateFragment<Object> {

    /* renamed from: e */
    private HashMap f71015e;

    /* renamed from: a */
    public final String mo69547a() {
        return "general_search";
    }

    /* renamed from: d */
    public final int mo69549d() {
        return C27029ba.f71319a;
    }

    /* renamed from: f */
    public final void mo69551f() {
        if (this.f71015e != null) {
            this.f71015e.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69551f();
    }
}
