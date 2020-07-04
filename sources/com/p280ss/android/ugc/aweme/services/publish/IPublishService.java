package com.p280ss.android.ugc.aweme.services.publish;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;

/* renamed from: com.ss.android.ugc.aweme.services.publish.IPublishService */
public interface IPublishService {

    /* renamed from: com.ss.android.ugc.aweme.services.publish.IPublishService$OnGetRecoverDraftCallback */
    public interface OnGetRecoverDraftCallback {
        void onFail();

        void onSuccess(C27311c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.publish.IPublishService$OnPublishCallback */
    public interface OnPublishCallback {
        void onStartPublish();

        void onStopPublish();
    }

    void cancelSynthetise(Context context);

    boolean checkIsAlreadyPublished(Context context);

    void getRecoverDraftIfHave(Context context, OnGetRecoverDraftCallback onGetRecoverDraftCallback);

    Class<? extends Service> getShortVideoPublishServiceClass();

    boolean inPublishPage(Context context);

    boolean isPublishServiceRunning(Context context);

    boolean isVideoPublishPreviewActivity(Context context);

    boolean processPublish(FragmentActivity fragmentActivity, Intent intent);

    void publishFromDraft(FragmentActivity fragmentActivity, C27311c cVar);

    void setUploadRecoverPath(String str);

    void startPublish(FragmentActivity fragmentActivity, Bundle bundle);
}
