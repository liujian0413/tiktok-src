package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsForwardVideoViewHolderPlanA */
public class InsForwardVideoViewHolderPlanA extends InsForwardVideoViewHolder {
    /* renamed from: u */
    public final void mo76045u() {
        super.mo76045u();
        m110763U();
    }

    /* renamed from: U */
    private void m110763U() {
        if (VERSION.SDK_INT >= 21) {
            ViewGroup viewGroup = this.f78638T;
            if (viewGroup == null) {
                C7573i.m23580a();
            }
            ViewGroup viewGroup2 = this.f78638T;
            if (viewGroup2 == null) {
                C7573i.m23580a();
            }
            viewGroup.setOutlineProvider(new C43070ds(viewGroup2.getResources().getDimensionPixelOffset(R.dimen.hf)));
            ViewGroup viewGroup3 = this.f78638T;
            if (viewGroup3 == null) {
                C7573i.m23580a();
            }
            viewGroup3.setClipToOutline(true);
        }
    }

    /* renamed from: c */
    public final void mo76029c(View view) {
        C7573i.m23587b(view, "root");
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        C7573i.m23582a((Object) viewStub, "headStub");
        viewStub.setLayoutResource(R.layout.a7t);
        mo76017a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        C7573i.m23582a((Object) viewStub2, "descStub");
        viewStub2.setLayoutResource(R.layout.a6s);
        mo76017a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        C7573i.m23582a((Object) viewStub3, "contentStub");
        viewStub3.setLayoutResource(R.layout.a7w);
        mo76019a(viewStub3.inflate(), 12.0f, 0.0f, 0.0f, 16.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dc6);
        C7573i.m23582a((Object) viewStub4, "bottomStub");
        viewStub4.setLayoutResource(R.layout.a7s);
        mo76017a(viewStub4.inflate(), 16.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc0);
        C7573i.m23582a((Object) viewStub5, "commentStub");
        viewStub5.setLayoutResource(R.layout.a7o);
        mo76018a(viewStub5.inflate(), 0.0f, 4.0f);
    }

    /* renamed from: a */
    public void mo76020a(View view, int i, int i2) {
        LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            int a = C9738o.m28691a(mo75888b());
            int b = C9738o.m28709b(mo75888b());
            float b2 = C9738o.m28708b(mo75888b(), 16.0f);
            mo87014a(a, b, b2, ((float) i2) / ((float) i), iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            int i3 = (int) b2;
            layoutParams2.topMargin = i3;
            layoutParams2.leftMargin = i3;
            layoutParams2.rightMargin = i3;
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public InsForwardVideoViewHolderPlanA(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar) {
        C7573i.m23587b(followFeedLayout, "itemView");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(eVar, "itemViewInteractListener");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, eVar, aVar);
    }

    /* renamed from: a */
    public void mo87014a(int i, int i2, float f, float f2, int[] iArr) {
        C7573i.m23587b(iArr, "dstSize");
        float f3 = ((float) i2) * 0.56f;
        if (f2 > 1.3333334f) {
            iArr[1] = (int) f3;
            iArr[0] = (int) (((float) iArr[1]) / 1.3333334f);
            int i3 = (int) ((((float) i) * 0.85f) - f);
            if (iArr[0] > i3) {
                iArr[0] = i3;
            }
        } else {
            iArr[0] = (int) (((float) i) - (f * 2.0f));
            iArr[1] = (int) (((float) iArr[0]) * f2);
            if (((float) iArr[1]) > f3) {
                iArr[1] = (int) f3;
                iArr[0] = (int) (((float) iArr[1]) / f2);
            }
        }
    }
}
