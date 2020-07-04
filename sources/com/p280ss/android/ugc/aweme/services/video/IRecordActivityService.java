package com.p280ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.services.video.IRecordActivityService */
public interface IRecordActivityService {
    Class<? extends Activity> getVideoPublishActivityClass();

    Class<? extends Activity> getVideoRecordActivityClass();

    boolean instanceOfVideoRecordActivity(Context context);
}
