package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.journey.C32247k;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.notice.api.p1426ab.MTTutorialVideoExperiment;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37239a;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37242c;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37249i;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37251j;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37253l;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37254m;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37255n;
import com.p280ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.p280ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import com.p280ss.android.ugc.aweme.requesttask.p1504a.C37225a;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.utils.C43122ff;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LegoRequestTask */
public class LegoRequestTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        C7121a.m22254e().mo18551a(new C37251j()).mo18551a(new C37225a()).mo18551a(new C37254m()).mo18551a(new C37255n()).mo18551a(new C37253l()).mo18551a(new C37239a()).mo18551a(new C32247k()).mo18552a();
        AbTestModel d = C7213d.m22500a().mo18803bo();
        if (d != null && d.useNewAppAlert == 1) {
            C7121a.m22254e().mo18551a(new C37242c()).mo18552a();
        }
        C7121a.m22248b().mo18559a(new GeckoHighPriorityCheckInRequest()).mo18559a(new GeckoCheckInRequest()).mo18559a(new InitServiceSettingTask()).mo18560a();
        if (C21115b.m71197a().isLogin() && !C43122ff.m136767b() && C6384b.m19835a().mo15292a(MTTutorialVideoExperiment.class, true, "mt_tutorial_video", C6384b.m19835a().mo15295d().mt_tutorial_video, false)) {
            C7121a.m22254e().mo18551a(new C37249i()).mo18552a();
        }
    }
}
