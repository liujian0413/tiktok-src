package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22977g;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h.C30200a;
import com.p280ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SettingsReaderInitTask */
public class SettingsReaderInitTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        C6921a.m21555a("SettingsReaderInitTask");
        C30199h.m98862a((C30200a) SettingsManagerProxy.inst(), C6399b.m19928c());
        SettingsManagerProxy.inst().registerSettingsWatcher(C7285c.m22839a(), false);
        C22977g.f60742b.mo59965a();
        SettingsManagerProxy.inst().registerSettingsWatcher(PosterSRProcessorInitTask.watcher(), true);
    }
}
