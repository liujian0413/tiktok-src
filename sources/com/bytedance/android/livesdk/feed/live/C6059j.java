package com.bytedance.android.livesdk.feed.live;

import android.content.Context;
import android.os.Looper;
import android.widget.PopupWindow;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.bytedance.android.livesdk.feed.live.j */
final class C6059j {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public static void m18949a(PopupWindow popupWindow) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            popupWindow.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }

    /* renamed from: a */
    static boolean m18950a(Context context) {
        try {
            return C6900g.m21454b().mo16943d();
        } catch (Exception unused) {
            return false;
        }
    }
}
