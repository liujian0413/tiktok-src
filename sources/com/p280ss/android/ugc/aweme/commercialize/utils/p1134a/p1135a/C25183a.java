package com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25175a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.a */
public abstract class C25183a implements C25184b {

    /* renamed from: e */
    public Context f66476e;

    /* renamed from: f */
    public C25175a f66477f;

    /* renamed from: a */
    public void mo65814a(boolean z, C25175a aVar) {
        C7573i.m23587b(aVar, "params");
    }

    /* renamed from: c */
    public final Context mo65815c() {
        Context context = this.f66476e;
        if (context == null) {
            C7573i.m23583a("context");
        }
        return context;
    }

    /* renamed from: d */
    public final C25175a mo65816d() {
        C25175a aVar = this.f66477f;
        if (aVar == null) {
            C7573i.m23583a("params");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo65812a(Context context) {
        C7573i.m23587b(context, "<set-?>");
        this.f66476e = context;
    }

    /* renamed from: a */
    public final void mo65813a(C25175a aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f66477f = aVar;
    }

    /* renamed from: a */
    public static boolean m82844a(Context context, Intent intent) {
        if (context == null || intent == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException | SecurityException unused) {
            return false;
        }
    }
}
