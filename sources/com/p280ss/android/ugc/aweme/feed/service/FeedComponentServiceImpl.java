package com.p280ss.android.ugc.aweme.feed.service;

import com.p280ss.android.ugc.aweme.feed.adapter.C28134ag;
import com.p280ss.android.ugc.aweme.feed.adapter.C28168bm;
import com.p280ss.android.ugc.aweme.feed.adapter.C28180h;
import com.p280ss.android.ugc.aweme.feed.adapter.C28197y;
import com.p280ss.android.ugc.aweme.feed.guide.C28391g;
import com.p280ss.android.ugc.aweme.feed.guide.C28394j;
import com.p280ss.android.ugc.aweme.feed.panel.C28628m;
import com.p280ss.android.ugc.aweme.feed.panel.C28649y;

/* renamed from: com.ss.android.ugc.aweme.feed.service.FeedComponentServiceImpl */
public class FeedComponentServiceImpl implements IFeedComponentService {
    private C28197y feedAdapterService;
    private C28680d feedExperimentService;
    private C28649y feedFragmentPanelService;
    private C28681e feedWidgetService;
    private C28394j guideService;
    private C28134ag videoViewHolderService;

    public C28197y getFeedAdapterService() {
        if (this.feedAdapterService == null) {
            this.feedAdapterService = new C28180h();
        }
        return this.feedAdapterService;
    }

    public C28680d getFeedExperimentService() {
        if (this.feedExperimentService == null) {
            this.feedExperimentService = new C28678b();
        }
        return this.feedExperimentService;
    }

    public C28649y getFeedFragmentPanelService() {
        if (this.feedFragmentPanelService == null) {
            this.feedFragmentPanelService = new C28628m();
        }
        return this.feedFragmentPanelService;
    }

    public C28681e getFeedWidgetService() {
        if (this.feedWidgetService == null) {
            this.feedWidgetService = new C28679c();
        }
        return this.feedWidgetService;
    }

    public C28394j getGuideService() {
        if (this.guideService == null) {
            this.guideService = new C28391g();
        }
        return this.guideService;
    }

    public C28134ag getVideoViewHolderService() {
        if (this.videoViewHolderService == null) {
            this.videoViewHolderService = new C28168bm();
        }
        return this.videoViewHolderService;
    }
}
