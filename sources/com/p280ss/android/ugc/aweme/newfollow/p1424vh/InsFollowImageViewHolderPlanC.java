package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolderPlanC */
public class InsFollowImageViewHolderPlanC extends InsFollowImageViewHolder {
    /* renamed from: a */
    private void m110617a(int i, int i2) {
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "mAweme");
        Object obj = aweme.getImageInfos().get(0);
        C7573i.m23582a(obj, "mAweme.imageInfos[0]");
        int width = ((ImageInfo) obj).getWidth();
        Aweme aweme2 = this.f77546j;
        C7573i.m23582a((Object) aweme2, "mAweme");
        Object obj2 = aweme2.getImageInfos().get(0);
        C7573i.m23582a(obj2, "mAweme.imageInfos[0]");
        if (((float) ((ImageInfo) obj2).getHeight()) / ((float) width) > 1.5933334f) {
            int i3 = (int) (((float) i2) / 1.5933334f);
            ViewGroup viewGroup = this.f77571a;
            if (viewGroup == null) {
                C7573i.m23580a();
            }
            Context ab = mo75261ab();
            C7573i.m23582a((Object) ab, "context");
            viewGroup.setBackgroundColor(ab.getResources().getColor(R.color.a7f));
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
    private static void m110616a(int i, float f, int[] iArr) {
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
            m110616a(C9738o.m28691a(mo75261ab()), ((float) i2) / ((float) i), iArr);
            m110617a(iArr[0], iArr[1]);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public InsFollowImageViewHolderPlanC(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
    }
}
