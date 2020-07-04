package com.p280ss.android.ugc.aweme.dmt_integration;

import android.app.Application;
import com.p280ss.android.ugc.aweme.common.p1145f.C25679a;
import com.p280ss.android.ugc.aweme.common.p1145f.C25680b;
import com.p280ss.android.ugc.aweme.common.p1145f.C25681c;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.p1001al.C22488a;
import com.p280ss.android.ugc.aweme.p993ae.C22469a;
import com.p280ss.android.ugc.aweme.p993ae.C22470b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.services.IAVInitializer;
import com.p280ss.android.ugc.aweme.services.storage.AVStorageManagerImpl;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40491bc;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl */
public class AVInitializerImpl implements IAVInitializer {
    public void initialize(Application application) {
        C35574k.m114860a(application, new C27282a());
        C22488a.m74377a(new C22469a());
        C40491bc.m129423a(new C22470b());
        C25682d.m84427a(new C25681c());
        C35574k.m114859a().mo70094i().mo102930a(new AVStorageManagerImpl());
        C25682d.m84427a(new C25679a());
        C25682d.m84427a(new C25680b());
    }
}
