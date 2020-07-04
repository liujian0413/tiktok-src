package com.p280ss.android.ugc.aweme.shortvideo.p1571f;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.f.b */
public final class C39827b {
    /* renamed from: b */
    private static boolean m127523b(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null || aweme.getAuthor().getFollowStatus() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m127522a(Aweme aweme) {
        if (aweme.getAuthor() == null) {
            return false;
        }
        if (C6861a.m21332a().userService().isMe(aweme.getAuthor().getUid())) {
            return true;
        }
        int duetSetting = aweme.getAuthor().getDuetSetting();
        if (duetSetting == 3) {
            return false;
        }
        switch (duetSetting) {
            case 0:
                return true;
            case 1:
                return m127523b(aweme);
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static void m127521a(Context context, Aweme aweme) {
        int i;
        if (context != null) {
            C10741a aVar = new C10741a(context);
            if (aweme == null || aweme.getAuthor() == null || aweme.getAuthor().getDuetSetting() != 3) {
                i = R.string.apm;
            } else {
                i = R.string.apn;
            }
            aVar.mo25649a((int) R.string.apo).mo25657b(i).mo25658b((int) R.string.b8g, (OnClickListener) null).mo25656a().mo25637a();
        }
    }
}
