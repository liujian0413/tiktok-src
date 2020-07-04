package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.newmedia.p891a.C19923c;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.audio.AudioUtils;
import com.p280ss.android.ugc.aweme.audio.C23102f;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment;
import com.p280ss.android.ugc.aweme.feed.preload.C28662h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32720b;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.MainFragment;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.p332ml.C33573d;
import com.p280ss.android.ugc.aweme.profile.C36102u;
import com.p280ss.android.ugc.aweme.profile.service.IProfileDependentComponentService;
import com.p280ss.android.ugc.aweme.qrcode.C37067d;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import com.p280ss.android.ugc.aweme.utils.C43086eb;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceTask */
public class PreloadInstanceTask implements LegoTask {
    private void preloadInstance(Object obj) {
    }

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        preloadInstance(Double.valueOf(AudioUtils.m75891a()));
        preloadInstance(context.getSystemService("audio"));
        preloadInstance(context.getSystemService("activity"));
        preloadInstance(C28662h.m94303a());
        preloadInstance(C19923c.m65736a(context));
        preloadInstance(Boolean.valueOf(MainActivity.appsFlyerisInit));
        preloadInstance(Boolean.valueOf(DetailActivity.f69011d));
        preloadInstance(Boolean.valueOf(CrossPlatformActivity.f68245b));
        preloadInstance(C34315c.f89468b);
        preloadInstance(C33573d.m108449a());
        try {
            preloadInstance(new ScrollableViewPager(context));
            preloadInstance(new SwipeRefreshLayout(context));
            preloadInstance(new DmtTextView(context));
            preloadInstance(new MainFragment());
            preloadInstance(new FeedRecommendFragment());
            preloadInstance(C6900g.m21454b());
        } catch (Throwable unused) {
        }
        preloadInstance(C37067d.m119194a());
        preloadInstance(C19025f.m62192w());
        C24671f.m80862l();
        ServiceManager.get().getService(C42846a.class);
        ServiceManager.get().getService(IProfileDependentComponentService.class);
        C6903bc.m21500s().mo102610a();
        C6903bc.m21487f();
        preloadInstance(C23102f.m75929a());
        preloadInstance(Boolean.valueOf(PosterSRProcessorInitTask.NEED_POSTER_PROCESS));
        preloadInstance(new WidgetManager());
        preloadInstance(Boolean.valueOf(C43086eb.m136679a(0, 0)));
        preloadInstance(Boolean.valueOf(C32720b.m105919a(null)));
        preloadInstance(C36102u.f94392a);
    }
}
