package com.p280ss.android.ugc.aweme.feed.panel;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import com.p280ss.android.ugc.aweme.feed.C28230c;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.C28576a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C29027y;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42697d;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.y */
public interface C28649y {
    /* renamed from: a */
    C28230c mo73479a(String str, int i, C28343z<C28318an> zVar, C28519d dVar);

    /* renamed from: a */
    C28576a mo73480a(Activity activity, View view, C28648x xVar);

    /* renamed from: a */
    C28587aa mo73481a(C28648x xVar, int i);

    /* renamed from: a */
    C29027y mo73482a(View view, C28648x xVar, UgAwemeActivitySetting ugAwemeActivitySetting);

    /* renamed from: a */
    C42697d mo73483a(Handler handler, C28648x xVar, C38267a aVar);
}
