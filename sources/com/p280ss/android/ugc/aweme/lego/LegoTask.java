package com.p280ss.android.ugc.aweme.lego;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.lego.LegoTask */
public interface LegoTask {
    ProcessType process();

    void run(Context context);

    WorkType type();
}
