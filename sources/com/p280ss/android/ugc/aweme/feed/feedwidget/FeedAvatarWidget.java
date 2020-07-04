package com.p280ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.C0053p;
import android.view.View;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28894e;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedAvatarView;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidget */
public class FeedAvatarWidget extends AbsFeedWidget {
    public void onCreate() {
        super.onCreate();
        this.f60922e.mo60132a("awesome_update_data", (C0053p<C23083a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C28894e mo61335b(View view) {
        return new FeedAvatarView(view);
    }

    /* renamed from: a */
    public final void onChanged(C23083a aVar) {
        super.onChanged(aVar);
        if (aVar != null && aVar.mo60161a() != null && (aVar.mo60161a() instanceof VideoItemParams) && C25072c.m82575a(((VideoItemParams) aVar.mo60161a()).mAweme) && "awesome_update_data".equals(aVar.f60948a)) {
            mo72017b(aVar);
        }
    }
}
