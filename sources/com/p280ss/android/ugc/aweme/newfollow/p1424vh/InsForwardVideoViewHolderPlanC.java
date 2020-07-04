package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsForwardVideoViewHolderPlanC */
public class InsForwardVideoViewHolderPlanC extends InsForwardVideoViewHolder {
    /* renamed from: a */
    private void m110770a(int i, int i2) {
        Aweme aweme = this.f78552F;
        C7573i.m23582a((Object) aweme, "mAweme");
        Aweme forwardItem = aweme.getForwardItem();
        C7573i.m23582a((Object) forwardItem, "mAweme.forwardItem");
        Video video = forwardItem.getVideo();
        C7573i.m23582a((Object) video, "mAweme.forwardItem.video");
        int width = video.getWidth();
        Aweme aweme2 = this.f78552F;
        C7573i.m23582a((Object) aweme2, "mAweme");
        Aweme forwardItem2 = aweme2.getForwardItem();
        C7573i.m23582a((Object) forwardItem2, "mAweme.forwardItem");
        Video video2 = forwardItem2.getVideo();
        C7573i.m23582a((Object) video2, "mAweme.forwardItem.video");
        if (((float) video2.getHeight()) / ((float) width) > 1.5933334f) {
            int i3 = (int) (((float) i2) / 1.5933334f);
            ViewGroup viewGroup = this.f78638T;
            if (viewGroup == null) {
                C7573i.m23580a();
            }
            Context b = mo75888b();
            C7573i.m23582a((Object) b, "context");
            viewGroup.setBackgroundColor(b.getResources().getColor(R.color.a7f));
            KeepSurfaceTextureView keepSurfaceTextureView = this.f78642X;
            if (keepSurfaceTextureView == null) {
                C7573i.m23580a();
            }
            keepSurfaceTextureView.getLayoutParams().width = i3;
            KeepSurfaceTextureView keepSurfaceTextureView2 = this.f78642X;
            if (keepSurfaceTextureView2 == null) {
                C7573i.m23580a();
            }
            keepSurfaceTextureView2.getLayoutParams().height = i2;
            RemoteImageView remoteImageView = this.f78637S;
            if (remoteImageView == null) {
                C7573i.m23580a();
            }
            remoteImageView.getLayoutParams().width = i3;
            RemoteImageView remoteImageView2 = this.f78637S;
            if (remoteImageView2 == null) {
                C7573i.m23580a();
            }
            remoteImageView2.getLayoutParams().height = i2;
            return;
        }
        KeepSurfaceTextureView keepSurfaceTextureView3 = this.f78642X;
        if (keepSurfaceTextureView3 == null) {
            C7573i.m23580a();
        }
        keepSurfaceTextureView3.getLayoutParams().width = i;
        KeepSurfaceTextureView keepSurfaceTextureView4 = this.f78642X;
        if (keepSurfaceTextureView4 == null) {
            C7573i.m23580a();
        }
        keepSurfaceTextureView4.getLayoutParams().height = i2;
        RemoteImageView remoteImageView3 = this.f78637S;
        if (remoteImageView3 == null) {
            C7573i.m23580a();
        }
        remoteImageView3.getLayoutParams().width = i;
        RemoteImageView remoteImageView4 = this.f78637S;
        if (remoteImageView4 == null) {
            C7573i.m23580a();
        }
        remoteImageView4.getLayoutParams().height = i2;
    }

    /* renamed from: a */
    private static void m110769a(int i, float f, int[] iArr) {
        iArr[0] = i;
        if (f > 1.2533333f) {
            iArr[1] = (int) (((float) i) * 1.2533333f);
        } else {
            iArr[1] = (int) (((float) i) * f);
        }
    }

    /* renamed from: a */
    public final void mo76020a(View view, int i, int i2) {
        LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            m110769a(C9738o.m28691a(mo75888b()), ((float) i2) / ((float) i), iArr);
            m110770a(iArr[0], iArr[1]);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            layoutParams2.topMargin = (int) C9738o.m28708b(mo75888b(), 16.0f);
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public InsForwardVideoViewHolderPlanC(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar) {
        C7573i.m23587b(followFeedLayout, "itemView");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(eVar, "itemViewInteractListener");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, eVar, aVar);
    }
}
