package com.p280ss.android.ugc.aweme.statistic;

import android.app.Application;
import com.bytedance.common.utility.C6317k;
import com.bytedance.ies.ugc.statisticlogger.config.C10988b;
import com.bytedance.ies.ugc.statisticlogger.config.C10992c;
import com.bytedance.ies.ugc.statisticlogger.config.C10992c.C10993a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.statistic.a */
public final class C41756a {

    /* renamed from: com.ss.android.ugc.aweme.statistic.a$a */
    public static final class C41757a extends C10992c {

        /* renamed from: c */
        final /* synthetic */ Application f108647c;

        /* renamed from: com.ss.android.ugc.aweme.statistic.a$a$a */
        public static final class C41758a implements C10993a {
            C41758a() {
            }

            /* renamed from: a */
            public final C6317k mo26545a() {
                return new AppLogNetworkClient();
            }
        }

        /* renamed from: a */
        public final C10993a mo26544a() {
            return new C41758a();
        }

        C41757a(Application application, Application application2) {
            this.f108647c = application;
            super(application2, false, 2, null);
        }
    }

    /* renamed from: a */
    public static final void m132956a(Application application) {
        C7573i.m23587b(application, "application");
        try {
            C10988b.m32201a((C10992c) new C41757a(application, application));
        } catch (Exception unused) {
        }
    }
}
