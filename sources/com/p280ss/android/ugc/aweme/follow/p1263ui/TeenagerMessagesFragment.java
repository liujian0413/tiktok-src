package com.p280ss.android.ugc.aweme.follow.p1263ui;

import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.follow.ui.TeenagerMessagesFragment */
public class TeenagerMessagesFragment extends TeenagerBaseFragment {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo75552a() {
        return R.string.e68;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo75554d() {
        return "teen_mode_message_tab";
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            C28580o.m93830a(PAGE.NOTICE);
        }
    }
}
