package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.service;

import android.app.Application;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25917d;
import com.p280ss.android.ugc.aweme.framework.C29957d;
import com.p280ss.android.ugc.aweme.framework.ReactInstance;
import com.p280ss.android.ugc.aweme.framework.p1273b.C29950a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.service.ReactService */
public class ReactService implements IReactService {
    public void invoke() {
        C25917d.m85217c();
    }

    public void rePrepareReactContext() {
    }

    public void init(Application application, C29950a aVar, C29957d dVar) {
        ReactInstance.initReactInstanceManager(application, aVar, dVar);
    }
}
