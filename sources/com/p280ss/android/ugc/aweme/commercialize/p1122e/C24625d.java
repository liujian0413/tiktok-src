package com.p280ss.android.ugc.aweme.commercialize.p1122e;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.p280ss.android.ugc.aweme.story.model.StoryResponse.C41999a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e.d */
public final class C24625d extends AbsLiveStoryItemView {
    public C24625d(Context context) {
        super(context, false);
    }

    public final void onClick(View view) {
        C41999a a = C24623b.m80724a();
        if (a != null) {
            Context context = getContext();
            if ((TextUtils.isEmpty(a.f109089c) || !C25371n.m83463a(context, a.f109089c, false)) && !TextUtils.isEmpty(a.f109090d)) {
                C25371n.m83459a(context, a.f109090d, a.f109091e);
            }
            C6907h.m21524a("click_skylight_entrance", (Map) new HashMap());
        }
    }

    /* renamed from: a */
    public final View mo64480a(Context context, boolean z) {
        return LayoutInflater.from(context).inflate(R.layout.u3, this, true);
    }
}
