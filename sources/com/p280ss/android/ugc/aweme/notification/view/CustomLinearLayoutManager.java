package com.p280ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;

/* renamed from: com.ss.android.ugc.aweme.notification.view.CustomLinearLayoutManager */
public class CustomLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public boolean f90389a = false;

    /* renamed from: e */
    public final boolean mo5438e() {
        if (!this.f90389a || !super.mo5438e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo5441f() {
        if (!this.f90389a || !super.mo5441f()) {
            return false;
        }
        return true;
    }

    public CustomLinearLayoutManager(Context context) {
        super(context);
    }
}
