package com.p280ss.android.ugc.aweme.feed.panel;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import com.p280ss.android.ugc.aweme.feed.C28230c;
import com.p280ss.android.ugc.aweme.feed.C28297e;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.C28576a;
import com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.C28577b;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C29021w;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C29027y;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42697d;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42708i;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.m */
public final class C28628m implements C28649y {
    /* renamed from: a */
    public final C28587aa mo73481a(C28648x xVar, int i) {
        return new C28590ad(xVar, i);
    }

    /* renamed from: a */
    public final C28576a mo73480a(Activity activity, View view, C28648x xVar) {
        return C28577b.m93820a(activity, view, xVar);
    }

    /* renamed from: a */
    public final C29027y mo73482a(View view, C28648x xVar, UgAwemeActivitySetting ugAwemeActivitySetting) {
        return new C29021w(view, xVar, ugAwemeActivitySetting);
    }

    /* renamed from: a */
    public final C42697d mo73483a(Handler handler, C28648x xVar, C38267a aVar) {
        return new C42708i(xVar, aVar);
    }

    /* renamed from: a */
    public final C28230c mo73479a(String str, int i, C28343z<C28318an> zVar, C28519d dVar) {
        return new C28297e(str, i, zVar, dVar);
    }
}
