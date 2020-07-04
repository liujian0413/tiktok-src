package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.video.C43310q;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PlayerKitInitTask */
public class PlayerKitInitTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        C6857a.m21312e().mo16822a("method_init_player_kit_duration", false);
        C43310q.m137425c();
        C6857a.m21312e().mo16827b("method_init_player_kit_duration", false);
    }
}
