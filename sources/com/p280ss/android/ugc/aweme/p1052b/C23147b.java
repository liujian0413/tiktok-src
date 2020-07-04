package com.p280ss.android.ugc.aweme.p1052b;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.b.b */
public final class C23147b {

    /* renamed from: a */
    public static final C23147b f61094a = new C23147b();

    private C23147b() {
    }

    /* renamed from: a */
    private static View m76059a(Activity activity, int i) {
        if (!(activity instanceof C23149d)) {
            activity = null;
        }
        C23149d dVar = (C23149d) activity;
        if (dVar != null) {
            C23148c inflater = dVar.getInflater();
            if (inflater != null) {
                return inflater.mo60290a(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final View mo60288a(Activity activity, int i, Context context, ViewGroup viewGroup) {
        C7573i.m23587b(context, "context");
        View a = m76059a(activity, i);
        if (a != null) {
            return a;
        }
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…te(res, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final View mo60289a(Activity activity, int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7573i.m23587b(layoutInflater, "inflater");
        View a = m76059a(activity, i);
        if (a != null) {
            return a;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(res, container, false)");
        return inflate;
    }
}
