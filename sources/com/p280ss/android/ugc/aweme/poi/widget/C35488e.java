package com.p280ss.android.ugc.aweme.poi.widget;

import android.view.View.OnClickListener;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.e */
public final class C35488e {

    /* renamed from: a */
    public String f93124a;

    /* renamed from: b */
    public int f93125b;

    /* renamed from: c */
    public boolean f93126c;

    /* renamed from: d */
    public OnClickListener f93127d;

    public C35488e(String str, int i, boolean z, OnClickListener onClickListener) {
        C7573i.m23587b(str, "title");
        C7573i.m23587b(onClickListener, "callback");
        this.f93124a = str;
        this.f93125b = i;
        this.f93126c = z;
        this.f93127d = onClickListener;
    }
}
