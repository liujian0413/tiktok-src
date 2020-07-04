package com.p280ss.android.ugc.aweme.discover.p1185ui;

import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.VideoIntermediateFragment */
public final class VideoIntermediateFragment extends SearchIntermediateFragment<Object> {

    /* renamed from: e */
    private HashMap f71273e;

    /* renamed from: a */
    public final String mo69547a() {
        return "video";
    }

    /* renamed from: d */
    public final int mo69549d() {
        return C27029ba.f71320b;
    }

    /* renamed from: f */
    public final void mo69551f() {
        if (this.f71273e != null) {
            this.f71273e.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69551f();
    }
}
