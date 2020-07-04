package com.p280ss.android.ugc.aweme.port.p1479in;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.port.in.IAVStoryProxyService */
public interface IAVStoryProxyService {
    String detectIsFromEditOrStory(Context context);

    Map getTrickyMapByActivity(Context context);

    void startStoryEditActivity(Activity activity, Intent intent);

    void startStorySettingActivity(Activity activity, int i, int i2, int i3, boolean z);

    void startStorySettingActivity(Activity activity, int i, int i2, boolean z, int i3);

    void startStorySettingActivity(Activity activity, int i, int i2, boolean z, boolean z2, boolean z3);

    void startStorySettingActivityForView(Activity activity, int i, int i2, boolean z, int i3, ViewGroup viewGroup);
}
