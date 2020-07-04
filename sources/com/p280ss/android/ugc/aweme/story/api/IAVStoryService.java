package com.p280ss.android.ugc.aweme.story.api;

import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;

/* renamed from: com.ss.android.ugc.aweme.story.api.IAVStoryService */
public interface IAVStoryService {
    void cancelPublish(String str);

    C0052o<C41975g> getPublishState();

    boolean isStoryPublishing(Context context);

    boolean isStoryRecording();

    void launchRecord(Context context, Intent intent);

    boolean processPublish(FragmentActivity fragmentActivity, Intent intent);

    void rePublishStory(FragmentActivity fragmentActivity, String str, C41967a<Object> aVar);

    void reset();

    void startPublish(FragmentActivity fragmentActivity, Bundle bundle);

    void updatePublishStartTime(long j);

    void updateStoryActivityRemainTime();
}
