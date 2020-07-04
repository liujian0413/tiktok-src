package com.p280ss.android.ugc.trill.app;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.application.C22865d;
import com.p280ss.android.ugc.aweme.app.application.C22867e;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.task.C7158v;
import com.p280ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadForAllProcessTask;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;

/* renamed from: com.ss.android.ugc.trill.app.c */
public final class C7299c {
    public static void attachBaseContextAfterMultiDex(TrillApplication trillApplication) {
        trillApplication.mo19032h();
        C6857a.m21312e().mo16822a("method_setup_graph_duration", false);
        trillApplication.mo16889d();
        C6857a.m21312e().mo16827b("method_setup_graph_duration", false);
        trillApplication.mo19030f();
        if (trillApplication.mo19031g()) {
            trillApplication.f20381g = new C22865d();
        } else {
            trillApplication.f20381g = new C22867e();
        }
        trillApplication.f20381g.mo16880a(trillApplication);
        C7121a.m22248b().mo18559a(new SharePreferencePreloadForAllProcessTask()).mo18560a();
        if (trillApplication.f19515c) {
            C6857a.m21312e().mo16827b("cold_boot_application_attach_duration", true);
            C6857a.m21312e().mo16822a("cold_boot_application_attach_to_create", true);
        }
        if (C6399b.m19947w()) {
            C7158v.m22354d().run(trillApplication);
        }
    }
}
