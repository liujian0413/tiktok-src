package com.p280ss.android.ugc.aweme.commercialize.splash.livesplash;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.LiveAwesomeSplashPreloadTask */
public final class LiveAwesomeSplashPreloadTask implements LegoTask {
    private final List<Aweme> awemesList;

    public final List<Aweme> getAwemesList() {
        return this.awemesList;
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public LiveAwesomeSplashPreloadTask(List<Aweme> list) {
        this.awemesList = list;
    }

    public final void run(Context context) {
        C24671f.m80858h().mo65577a(context, this.awemesList);
    }
}
