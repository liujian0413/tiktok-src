package com.p280ss.android.ugc.aweme.lego;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.lego.LegoInflate */
public interface LegoInflate {
    Class<? extends Activity> activity();

    void inflate(Context context, Activity activity);

    int theme();
}
