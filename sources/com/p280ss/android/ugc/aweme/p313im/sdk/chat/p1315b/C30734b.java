package com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.ImShareVideoMsgStyleExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.b */
public final class C30734b {
    /* renamed from: b */
    public static int m100128b() {
        int a = m100127a();
        if (a == 2 || a == 1 || a == 4) {
            return R.layout.yv;
        }
        if (a == 3) {
            return R.layout.yi;
        }
        return R.layout.yt;
    }

    /* renamed from: c */
    public static int m100129c() {
        int a = m100127a();
        if (a == 2 || a == 1 || a == 4) {
            return R.layout.yw;
        }
        if (a == 3) {
            return R.layout.yx;
        }
        return R.layout.yu;
    }

    /* renamed from: a */
    public static int m100127a() {
        if (C6399b.m19945u()) {
            return C6384b.m19835a().mo15287a(ImShareVideoMsgStyleExperiment.class, true, "im_share_video_message_style", C6384b.m19835a().mo15295d().im_share_video_message_style, 0);
        }
        return 0;
    }
}
