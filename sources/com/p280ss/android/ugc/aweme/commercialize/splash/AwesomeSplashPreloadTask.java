package com.p280ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashPreloadTask */
public class AwesomeSplashPreloadTask implements LegoTask {
    private final List<Aweme> awemeList;

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public AwesomeSplashPreloadTask(List<Aweme> list) {
        this.awemeList = list;
    }

    public void run(Context context) {
        C6921a.m21555a("AwesomeSplashPreloadTask");
        C24671f.m80857g().mo65550a(context, this.awemeList);
    }
}
