package com.p280ss.android.ugc.aweme.account.util;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.support.p022v4.util.C0888a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.util.s */
public final class C22344s {

    /* renamed from: a */
    private static final C0888a<Integer> f59610a;

    static {
        C0888a<Integer> aVar = new C0888a<>();
        f59610a = aVar;
        aVar.add(Integer.valueOf(1039));
        f59610a.add(Integer.valueOf(1049));
        f59610a.add(Integer.valueOf(1050));
    }

    /* renamed from: a */
    public static boolean m73955a(int i) {
        return f59610a.contains(Integer.valueOf(i));
    }

    /* renamed from: b */
    public static void m73956b(Context context, String str) {
        m73954a(context, str, context.getString(R.string.vj), true);
    }

    /* renamed from: a */
    public static void m73952a(Context context, String str) {
        if (!C6399b.m19944t()) {
            new C10741a(context).mo25660b(str).mo25650a((int) R.string.vj, (OnClickListener) null).mo25656a().mo25638b();
        }
    }

    /* renamed from: a */
    public static void m73953a(Context context, String str, int i) {
        if (!m73955a(i) || C6399b.m19944t()) {
            C10761a.m31403c(context, str).mo25750a();
        } else {
            m73956b(context, str);
        }
    }

    /* renamed from: a */
    public static void m73954a(Context context, String str, String str2, boolean z) {
        Dialog b = new C10741a(context).mo25660b(str).mo25654a(str2, (OnClickListener) null).mo25656a().mo25638b();
        b.setCancelable(z);
        b.setCanceledOnTouchOutside(z);
    }
}
