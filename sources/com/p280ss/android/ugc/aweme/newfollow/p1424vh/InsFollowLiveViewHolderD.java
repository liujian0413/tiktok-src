package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderD */
public final class InsFollowLiveViewHolderD extends InsFollowLiveViewHolderB {
    /* renamed from: a */
    public final void mo68499a() {
        m110682as();
        super.mo68499a();
    }

    /* renamed from: as */
    private final void m110682as() {
        if (VERSION.SDK_INT >= 21) {
            mo86986ar().setOutlineProvider(new C43070ds((int) C9738o.m28708b(mo75261ab(), 2.0f)));
            mo86986ar().setClipToOutline(true);
        }
    }

    /* renamed from: a */
    public final void mo68500a(View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        View view4 = null;
        if (view != null) {
            viewStub = (ViewStub) view.findViewById(R.id.dc_);
        } else {
            viewStub = null;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.a7t);
        }
        if (viewStub != null) {
            view2 = viewStub.inflate();
        } else {
            view2 = null;
        }
        mo75253a(view2, 4.0f);
        if (view != null) {
            viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        } else {
            viewStub2 = null;
        }
        if (viewStub2 != null) {
            viewStub2.setLayoutResource(R.layout.a6s);
        }
        if (viewStub2 != null) {
            view3 = viewStub2.inflate();
        } else {
            view3 = null;
        }
        mo75253a(view3, 12.0f);
        if (view != null) {
            viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        } else {
            viewStub3 = null;
        }
        if (viewStub3 != null) {
            viewStub3.setLayoutResource(R.layout.a6l);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        }
        mo75255a(view4, 16.0f, 16.0f, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public final void mo87005a(int i, int i2) {
        LayoutParams layoutParams;
        FrameLayout ar = mo86986ar();
        if (ar != null) {
            layoutParams = ar.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (i > i2) {
                layoutParams2.width = (int) C9738o.m28708b(mo75261ab(), 267.0f);
                layoutParams2.height = (int) C9738o.m28708b(mo75261ab(), 150.0f);
            } else {
                layoutParams2.width = (int) C9738o.m28708b(mo75261ab(), 150.0f);
                layoutParams2.height = (int) C9738o.m28708b(mo75261ab(), 267.0f);
            }
            mo86986ar().setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public InsFollowLiveViewHolderD(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
    }
}
