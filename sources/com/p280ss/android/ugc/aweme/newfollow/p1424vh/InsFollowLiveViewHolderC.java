package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderC */
public final class InsFollowLiveViewHolderC extends InsFollowLiveViewHolderB {
    /* renamed from: t */
    public final void mo75292t() {
        if (mo86957ao() != null) {
            View view = this.f89309d;
            UrlModel urlModel = mo86957ao().roomCover;
            C7573i.m23582a((Object) urlModel, "mRoom.roomCover");
            int width = urlModel.getWidth();
            UrlModel urlModel2 = mo86957ao().roomCover;
            C7573i.m23582a((Object) urlModel2, "mRoom.roomCover");
            mo68503a(view, width, urlModel2.getHeight());
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
            viewStub3.setLayoutResource(R.layout.a6k);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        }
        mo75255a(view4, 16.0f, 16.0f, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public final void mo87005a(int i, int i2) {
        mo68503a(this.f89309d, i, i2);
    }

    /* renamed from: a */
    public final void mo86992a(int i, float f, int[] iArr) {
        C7573i.m23587b(iArr, "dstSize");
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
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            mo86992a(C9738o.m28691a(mo75261ab()), ((float) i2) / ((float) i), iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
