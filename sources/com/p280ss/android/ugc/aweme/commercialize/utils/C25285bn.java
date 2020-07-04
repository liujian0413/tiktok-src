package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.p817ad.p818a.C18909a;
import com.p280ss.android.p817ad.p818a.C18909a.C18911a;
import com.p280ss.android.p817ad.p818a.p819a.C18914b;
import com.p280ss.android.ugc.aweme.account.C21115b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bn */
final /* synthetic */ class C25285bn implements C18914b {

    /* renamed from: a */
    static final C18914b f66643a = new C25285bn();

    private C25285bn() {
    }

    /* renamed from: a */
    public final C18909a mo50290a() {
        return new C18911a().mo50287d(String.valueOf(AppLog.getAppId())).mo50285b(C6399b.m19934j()).mo50283a(AppLog.getServerDeviceId()).mo50288e(C21115b.m71197a().getCurUser().getShortId()).mo50286c(String.valueOf(C6399b.m19933i())).mo50284a();
    }
}
