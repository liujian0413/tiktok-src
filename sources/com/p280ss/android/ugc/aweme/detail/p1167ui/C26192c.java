package com.p280ss.android.ugc.aweme.detail.p1167ui;

import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p280ss.android.ugc.aweme.discover.C26608c;
import com.p280ss.android.ugc.aweme.feed.adapter.VideoViewHolder;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.helper.C28412a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28254o;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.c */
public final class C26192c extends VideoViewHolder {

    /* renamed from: A */
    private boolean f69082A = true;

    /* renamed from: B */
    private BaseFeedPageParams f69083B;

    /* renamed from: l */
    public final void mo65715l() {
        super.mo65715l();
        m86178au();
    }

    /* renamed from: au */
    private void m86178au() {
        String str;
        try {
            if (BusinessComponentServiceUtils.getMixSearchRNWebViewRefHolder().mo68292a()) {
                Aweme h = mo65711h();
                C26608c mixSearchRNWebViewRefHolder = BusinessComponentServiceUtils.getMixSearchRNWebViewRefHolder();
                if (this.f69082A) {
                    str = "next_video";
                } else {
                    str = "prev_video";
                }
                mixSearchRNWebViewRefHolder.mo68291a(h, str, this.f69083B.param.getFrom());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final void mo67769c(boolean z) {
        this.f69082A = z;
    }

    public C26192c(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams, C28254o oVar, C28412a aVar) {
        super(view, zVar, onTouchListener, fragment, baseFeedPageParams, oVar, aVar);
        this.f69083B = baseFeedPageParams;
    }
}
