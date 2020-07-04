package com.p280ss.android.ugc.aweme.account.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.main.p1385g.C33038x;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.util.e */
public final class C22326e {

    /* renamed from: a */
    public static final C22326e f59598a = new C22326e();

    private C22326e() {
    }

    /* renamed from: b */
    public static final void m73922b(Context context, String str) {
        C33038x xVar = (C33038x) C21671bd.m72521a(C33038x.class);
        if (context == null) {
            C7573i.m23580a();
        }
        xVar.mo60007a(context, str, false);
    }

    /* renamed from: a */
    public static final boolean m73921a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        if (context == null) {
            try {
                C7573i.m23580a();
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        }
        context.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public static final void m73920a(Context context, String str, boolean z) {
        Object obj;
        if (str == 0) {
            obj = context;
        } else {
            obj = str;
        }
        if (obj != 0) {
            C33038x xVar = (C33038x) C21671bd.m72521a(C33038x.class);
            if (context == 0) {
                C7573i.m23580a();
            }
            if (str == 0) {
                C7573i.m23580a();
            }
            xVar.mo60007a(context, str, true);
        }
    }
}
