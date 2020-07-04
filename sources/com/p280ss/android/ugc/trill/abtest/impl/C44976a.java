package com.p280ss.android.ugc.trill.abtest.impl;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.main.C32897bb;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.trill.abtest.C44973a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.abtest.impl.a */
public final class C44976a extends C44973a<Boolean> {
    /* renamed from: a */
    public final /* synthetic */ Object mo107490a() {
        return m141925b();
    }

    /* renamed from: b */
    private static Boolean m141925b() {
        if (C7163a.m22363a()) {
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: a */
    public static void m141923a(String str) {
        C6907h.onEvent(MobClick.obtain().setLabelName(str).setEventName("recall_popup"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean mo107492a(Boolean bool) {
        if (C21115b.m71197a().isLogin() || ((Boolean) C23060u.m75742a().mo60036F().mo59877d()).booleanValue() || !bool.booleanValue()) {
            return false;
        }
        final Activity g = C6405d.m19984g();
        if (g == null) {
            return false;
        }
        new C10741a(g).mo25653a(g.getString(R.string.lv)).mo25661b(g.getString(R.string.byr), (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (g != null && (g instanceof MainActivity)) {
                    C32897bb mainHelper = ((MainActivity) g).getMainHelper();
                    if (mainHelper != null) {
                        mainHelper.mo84581b();
                    }
                    C44976a.m141923a("cancel");
                }
            }
        }).mo25654a(g.getString(R.string.c5o), (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (g != null && (g instanceof MainActivity)) {
                    C32656f.m105742a(g, "recall_popup", "click");
                    C44976a.m141923a("confirm");
                }
            }
        }).mo25656a().mo25637a();
        m141923a("show");
        C23060u.m75742a().mo60036F().mo59871a(Boolean.valueOf(true));
        return true;
    }
}
