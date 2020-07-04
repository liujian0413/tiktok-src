package com.p280ss.android.ugc.aweme.feed.api;

import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.feed.cache.C28288d;
import com.p280ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.api.IFeedModuleService */
public interface IFeedModuleService {
    void attachActivityToGlobalAcViewModel(FragmentActivity fragmentActivity);

    void commitFeedRequest(int i, C6309f fVar, Callable callable, int i2, boolean z);

    C28288d getFeedCacheLoader();

    void initPosterSRProcessorOnHotStart();

    void log(Fragment fragment, int i, String str, FeedAppLogParams feedAppLogParams, Exception exc);

    void logFeedV3(Fragment fragment, int i, String str, FeedAppLogParams feedAppLogParams);

    void mobStartRequest(Fragment fragment, String str);

    void posterSRProcessorOnDestroy();
}
