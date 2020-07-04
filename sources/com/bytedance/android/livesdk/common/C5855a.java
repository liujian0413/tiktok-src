package com.bytedance.android.livesdk.common;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.common.a */
public abstract class C5855a {

    /* renamed from: a */
    protected boolean f17237a;

    /* renamed from: b */
    protected Context f17238b;

    /* renamed from: c */
    protected View f17239c;

    /* renamed from: d */
    private Set<Dialog> f17240d = new HashSet();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14350a() {
        this.f17237a = false;
        this.f17238b = null;
        this.f17239c = null;
        for (Dialog dialog : this.f17240d) {
            if (dialog != null && dialog.isShowing()) {
                C5856b.m18328a(dialog);
            }
        }
        this.f17240d.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14351a(Context context, View view, Bundle bundle) {
        this.f17238b = context;
        this.f17239c = view;
        this.f17237a = true;
    }
}
