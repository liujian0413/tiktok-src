package com.p280ss.android.ugc.aweme.app.application;

import android.app.Application;
import com.p280ss.android.ugc.aweme.app.application.initialization.C6867a;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import com.p280ss.android.ugc.aweme.legoImp.task.HackActivityThreadH;
import com.p280ss.android.ugc.aweme.legoImp.task.InitDebugBox;
import com.p280ss.android.ugc.aweme.legoImp.task.InitLinkSelector;
import com.p280ss.android.ugc.aweme.legoImp.task.LegacyTask;
import com.p280ss.android.ugc.aweme.legoImp.task.SetupDebugLevel;
import com.p280ss.android.ugc.aweme.legoImp.task.SetupMainServiceForJsb;

/* renamed from: com.ss.android.ugc.aweme.app.application.e */
public final class C22867e implements C6867a {
    /* renamed from: a */
    public final void mo16880a(Application application) {
    }

    /* renamed from: b */
    public final void mo16881b(Application application) {
        C7121a.m22248b().mo18559a(new LegacyTask()).mo18559a(new InitLinkSelector()).mo18559a(new SetupMainServiceForJsb()).mo18559a(new InitDebugBox()).mo18559a(new GetGoogleAIdTask()).mo18559a(new HackActivityThreadH()).mo18559a(new SetupDebugLevel()).mo18560a();
    }
}
