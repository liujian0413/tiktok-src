package com.bytedance.ies.ugc.statisticlogger.config;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.CustomChannelHandler;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.statistic.C20403a;
import com.p280ss.android.statistic.C20413c;
import com.p280ss.android.statistic.Configuration;
import com.p280ss.android.statistic.Configuration.BuildType;
import com.p280ss.android.statistic.Configuration.C20402a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import kotlin.jvm.internal.C7573i;

public final class LazyLoadLegoTask implements LegoTask {
    private final Application application;

    public final Application getApplication() {
        return this.application;
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BACKGROUND;
    }

    public LazyLoadLegoTask(Application application2) {
        C7573i.m23587b(application2, "application");
        this.application = application2;
    }

    public final void run(Context context) {
        BuildType buildType;
        C7573i.m23587b(context, "context");
        C20402a a = new C20402a().mo54938a(C6399b.m19936l(), C6399b.m19937m()).mo54937a(C6399b.m19941q());
        if (C6399b.m19928c()) {
            buildType = BuildType.DEBUG;
        } else {
            buildType = BuildType.RELEASE;
        }
        Configuration a2 = a.mo54936a(buildType).mo54941b(AppLog.getServerDeviceId()).mo54942c(C6399b.m19934j()).mo54935a((int) C6399b.m19933i()).mo54940b(C6399b.m19935k()).mo54939a();
        C7573i.m23582a((Object) a2, "configrationBuilder.conf…nager.getAppId()).build()");
        C20413c.m67737a().mo54955a(this.application, a2, C6776h.m20947b(context));
        C20413c.m67737a().mo54958a(C20403a.f55113a);
        if (!CustomChannelHandler.inst(C6399b.m19921a()).hasGetChannels()) {
            CustomChannelHandler.inst(C6399b.m19921a()).loadInfoFromSp();
            CustomChannelHandler.inst(C6399b.m19921a()).getAppChannel(C10987a.f29717a);
        }
    }
}
