package com.p280ss.android.ugc.aweme.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.play.core.splitcompat.C6546a;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30472f;
import com.p280ss.android.ugc.aweme.lancet.I18nLancet.AmeActivityResumeRun;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.p995ag.C22473a;
import com.p280ss.android.ugc.aweme.utils.C43067dp;
import com.p280ss.android.ugc.aweme.utils.C43073dv;

/* renamed from: com.ss.android.ugc.aweme.base.a */
final class C23193a {
    /* renamed from: a */
    static void m76153a(AmeActivity ameActivity) {
        try {
            ameActivity.onResume$___twin___();
            C7121a.m22248b().mo18559a(new AmeActivityResumeRun(ameActivity)).mo18560a();
            C43073dv.m136651a((Activity) ameActivity);
        } catch (Throwable th) {
            C43067dp.m136625a();
            throw th;
        }
    }

    /* renamed from: a */
    static void m76154a(AmeActivity ameActivity, Context context) {
        C22473a.m74358a(context);
        Context b = C30472f.m99537b(context);
        C6546a.m20342b(b);
        ameActivity.attachBaseContext$___twin___(b);
    }

    /* renamed from: a */
    static void m76155a(AmeActivity ameActivity, Configuration configuration) {
        ameActivity.onConfigurationChanged$___twin___(configuration);
        C30476b.m99556b(ameActivity);
    }

    /* renamed from: a */
    static void m76156a(AmeActivity ameActivity, Bundle bundle) {
        ameActivity.onCreate$___twin___(bundle);
        C30476b.m99556b(ameActivity);
    }
}
