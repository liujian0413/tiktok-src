package com.p280ss.android.ugc.aweme.main.page;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack */
public class AwemeChangeCallBack extends C0063u {

    /* renamed from: a */
    private C23084b<Aweme> f86036a = new C23084b<>();

    /* renamed from: com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack$a */
    public interface C33063a {
        /* renamed from: a */
        void mo67730a(Aweme aweme);
    }

    /* renamed from: a */
    public static Aweme m106763a(FragmentActivity fragmentActivity) {
        return (Aweme) m106766b(fragmentActivity).getValue();
    }

    /* renamed from: b */
    private static C23084b<Aweme> m106766b(FragmentActivity fragmentActivity) {
        return ((AwemeChangeCallBack) C0069x.m159a(fragmentActivity).mo147a(AwemeChangeCallBack.class)).f86036a;
    }

    /* renamed from: a */
    public static void m106765a(FragmentActivity fragmentActivity, Aweme aweme) {
        m106766b(fragmentActivity).setValue(aweme);
    }

    /* renamed from: a */
    public static void m106764a(FragmentActivity fragmentActivity, C0043i iVar, final C33063a aVar) {
        m106766b(fragmentActivity).observe(iVar, new C0053p<Aweme>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Aweme aweme) {
                if (aVar != null) {
                    aVar.mo67730a(aweme);
                }
            }
        });
    }
}
