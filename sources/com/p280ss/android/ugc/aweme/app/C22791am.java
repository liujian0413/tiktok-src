package com.p280ss.android.ugc.aweme.app;

import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.legoImp.task.InitAbTest;
import com.p280ss.android.ugc.aweme.legoImp.task.InstallEventBus;
import com.p280ss.android.ugc.aweme.legoImp.task.PolarisInitTask;
import com.p280ss.android.ugc.aweme.legoImp.task.RefreshYouTubeTask;
import com.p280ss.android.ugc.aweme.legoImp.task.RegisterLifecycle;
import com.p280ss.android.ugc.aweme.legoImp.task.SymphonySdkInitTask;

/* renamed from: com.ss.android.ugc.aweme.app.am */
public final class C22791am extends C23020r {
    /* renamed from: q */
    public final void mo16870q() {
        PolarisInitTask.ensuareInit();
    }

    /* renamed from: v */
    public final void mo16875v() {
        C30476b.m99558c();
    }

    /* renamed from: p */
    public final LegoTask mo16869p() {
        return new PolarisInitTask();
    }

    /* renamed from: r */
    public final boolean mo16871r() {
        return PolarisInitTask.isPolarisInit();
    }

    /* renamed from: s */
    public final LegoTask mo16872s() {
        return new InitAbTest();
    }

    /* renamed from: t */
    public final LegoTask mo16873t() {
        return new SymphonySdkInitTask();
    }

    /* renamed from: u */
    public final LegoTask mo16874u() {
        return new RegisterLifecycle();
    }

    /* renamed from: w */
    public final LegoTask mo16876w() {
        return new RefreshYouTubeTask();
    }

    /* renamed from: x */
    public final LegoTask mo16877x() {
        return new InstallEventBus();
    }
}
