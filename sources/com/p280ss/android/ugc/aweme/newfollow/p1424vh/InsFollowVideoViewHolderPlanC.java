package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowVideoViewHolderPlanC */
public class InsFollowVideoViewHolderPlanC extends InsFollowVideoViewHolder {
    /* renamed from: a */
    private void m110716a(int i, int i2) {
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "mAweme");
        Video video = aweme.getVideo();
        C7573i.m23582a((Object) video, "mAweme.video");
        int width = video.getWidth();
        Aweme aweme2 = this.f77546j;
        C7573i.m23582a((Object) aweme2, "mAweme");
        Video video2 = aweme2.getVideo();
        C7573i.m23582a((Object) video2, "mAweme.video");
        if (((float) video2.getHeight()) / ((float) width) > 1.5933334f) {
            int i3 = (int) (((float) i2) / 1.5933334f);
            FrameLayout frameLayout = this.f77597az;
            if (frameLayout == null) {
                C7573i.m23580a();
            }
            Context ab = mo75261ab();
            C7573i.m23582a((Object) ab, "context");
            frameLayout.setBackgroundColor(ab.getResources().getColor(R.color.a7f));
            KeepSurfaceTextureView keepSurfaceTextureView = this.f77575aA;
            if (keepSurfaceTextureView == null) {
                C7573i.m23580a();
            }
            keepSurfaceTextureView.getLayoutParams().width = i3;
            KeepSurfaceTextureView keepSurfaceTextureView2 = this.f77575aA;
            if (keepSurfaceTextureView2 == null) {
                C7573i.m23580a();
            }
            keepSurfaceTextureView2.getLayoutParams().height = i2;
            RemoteImageView remoteImageView = this.f77551o;
            if (remoteImageView == null) {
                C7573i.m23580a();
            }
            remoteImageView.getLayoutParams().width = i3;
            RemoteImageView remoteImageView2 = this.f77551o;
            if (remoteImageView2 == null) {
                C7573i.m23580a();
            }
            remoteImageView2.getLayoutParams().height = i2;
            return;
        }
        KeepSurfaceTextureView keepSurfaceTextureView3 = this.f77575aA;
        if (keepSurfaceTextureView3 == null) {
            C7573i.m23580a();
        }
        keepSurfaceTextureView3.getLayoutParams().width = i;
        KeepSurfaceTextureView keepSurfaceTextureView4 = this.f77575aA;
        if (keepSurfaceTextureView4 == null) {
            C7573i.m23580a();
        }
        keepSurfaceTextureView4.getLayoutParams().height = i2;
        RemoteImageView remoteImageView3 = this.f77551o;
        if (remoteImageView3 == null) {
            C7573i.m23580a();
        }
        remoteImageView3.getLayoutParams().width = i;
        RemoteImageView remoteImageView4 = this.f77551o;
        if (remoteImageView4 == null) {
            C7573i.m23580a();
        }
        remoteImageView4.getLayoutParams().height = i2;
    }

    /* renamed from: a */
    private static void m110715a(int i, float f, int[] iArr) {
        iArr[0] = i;
        if (f > 1.2533333f) {
            iArr[1] = (int) (((float) i) * 1.2533333f);
        } else {
            iArr[1] = (int) (((float) i) * f);
        }
    }

    /* renamed from: a */
    public final void mo68503a(View view, int i, int i2) {
        LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            m110715a(C9738o.m28691a(mo75261ab()), ((float) i2) / ((float) i), iArr);
            m110716a(iArr[0], iArr[1]);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public InsFollowVideoViewHolderPlanC(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
    }
}
