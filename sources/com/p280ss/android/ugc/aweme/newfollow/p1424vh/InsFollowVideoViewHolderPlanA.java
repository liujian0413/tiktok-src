package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedTagLayout2;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowVideoViewHolderPlanA */
public class InsFollowVideoViewHolderPlanA extends InsFollowVideoViewHolder {
    /* renamed from: ao */
    public final void mo86957ao() {
    }

    /* renamed from: d */
    public final void mo68504d() {
        if (VERSION.SDK_INT >= 21) {
            FrameLayout frameLayout = this.f77597az;
            if (frameLayout == null) {
                C7573i.m23580a();
            }
            FrameLayout frameLayout2 = this.f77597az;
            if (frameLayout2 == null) {
                C7573i.m23580a();
            }
            frameLayout.setOutlineProvider(new C43070ds(frameLayout2.getResources().getDimensionPixelOffset(R.dimen.hf)));
            FrameLayout frameLayout3 = this.f77597az;
            if (frameLayout3 == null) {
                C7573i.m23580a();
            }
            frameLayout3.setClipToOutline(true);
        }
    }

    /* renamed from: B */
    public final void mo75226B() {
        JSONObject jSONObject = new JSONObject();
        String str = "request_id";
        try {
            Aweme aweme = this.f77546j;
            C7573i.m23582a((Object) aweme, "mAweme");
            jSONObject.put(str, aweme.getRequestId());
        } catch (JSONException unused) {
        }
        FollowFeedTagLayout2 followFeedTagLayout2 = this.f77486B;
        if (followFeedTagLayout2 == null) {
            C7573i.m23580a();
        }
        followFeedTagLayout2.setVisibility(0);
        FollowFeedTagLayout2 followFeedTagLayout22 = this.f77486B;
        if (followFeedTagLayout22 == null) {
            C7573i.m23580a();
        }
        followFeedTagLayout22.setPageType(this.f77512aa);
        FollowFeedTagLayout2 followFeedTagLayout23 = this.f77486B;
        if (followFeedTagLayout23 == null) {
            C7573i.m23580a();
        }
        followFeedTagLayout23.setFollowPageType(this.f77513ab);
        FollowFeedTagLayout2 followFeedTagLayout24 = this.f77486B;
        if (followFeedTagLayout24 == null) {
            C7573i.m23580a();
        }
        Aweme aweme2 = this.f77546j;
        Context ab = mo75261ab();
        if (ab != null) {
            followFeedTagLayout24.mo75207a(aweme2, (Activity) ab, this.f77510Z, jSONObject);
            if (C7634n.m23717a("poi_page", this.f77510Z, true)) {
                FollowFeedTagLayout2 followFeedTagLayout25 = this.f77486B;
                if (followFeedTagLayout25 == null) {
                    C7573i.m23580a();
                }
                followFeedTagLayout25.mo75209d();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0036  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75225A() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f77546j
            java.lang.String r1 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r0.getStatus()
            r1 = 0
            if (r0 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r0.getStatus()
            java.lang.String r2 = "mAweme.status"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            boolean r0 = r0.isWithGoods()
            if (r0 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.commerce.model.SimplePromotion r0 = r0.getPromotion()
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0141
            android.widget.TextView r0 = r4.f77495K
            if (r0 != 0) goto L_0x003d
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x003d:
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.f77495K
            if (r0 != 0) goto L_0x0047
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0047:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.commerce.model.SimplePromotion r1 = r1.getPromotion()
            if (r1 != 0) goto L_0x0057
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0057:
            java.lang.String r1 = r1.getShortTitle()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f77546j
            java.lang.String r1 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.commerce.model.SimplePromotion r0 = r0.getPromotion()
            if (r0 == 0) goto L_0x014d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f77546j
            java.lang.String r1 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.commerce.model.SimplePromotion r0 = r0.getPromotion()
            com.ss.android.ugc.aweme.commerce.service.logs.e r1 = new com.ss.android.ugc.aweme.commerce.service.logs.e
            r1.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r2 = r2.getAuthorUid()
            com.ss.android.ugc.aweme.commerce.service.logs.e r1 = r1.mo63568g(r2)
            java.lang.String r2 = "video_cart_tag"
            com.ss.android.ugc.aweme.commerce.service.logs.e r1 = r1.mo63561a(r2)
            if (r0 != 0) goto L_0x0097
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0097:
            java.lang.String r2 = r0.getPromotionId()
            com.ss.android.ugc.aweme.commerce.service.logs.e r1 = r1.mo63563b(r2)
            int r2 = r0.getPromotionSource()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.ss.android.ugc.aweme.commerce.service.logs.e r1 = r1.mo63560a(r2)
            java.lang.String r2 = r4.f77510Z
            com.ss.android.ugc.aweme.commerce.service.logs.e r1 = r1.mo63567f(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r2 = r2.getAid()
            com.ss.android.ugc.aweme.commerce.service.logs.e r1 = r1.mo63564c(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            int r2 = r2.getFollowStatus()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.ss.android.ugc.aweme.commerce.service.logs.e r1 = r1.mo63562b(r2)
            r1.mo63537a()
            com.ss.android.ugc.aweme.commerce.service.logs.f r1 = new com.ss.android.ugc.aweme.commerce.service.logs.f
            r1.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r2 = r2.getAuthorUid()
            com.ss.android.ugc.aweme.commerce.service.logs.f r1 = r1.mo63576f(r2)
            java.lang.String r2 = "video_cart_tag"
            com.ss.android.ugc.aweme.commerce.service.logs.f r1 = r1.mo63572b(r2)
            java.lang.String r2 = r0.getPromotionId()
            com.ss.android.ugc.aweme.commerce.service.logs.f r1 = r1.mo63573c(r2)
            int r0 = r0.getPromotionSource()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.commerce.service.logs.f r0 = r1.mo63569a(r0)
            java.lang.String r1 = r4.f77510Z
            com.ss.android.ugc.aweme.commerce.service.logs.f r0 = r0.mo63577g(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.String r1 = r1.getAid()
            com.ss.android.ugc.aweme.commerce.service.logs.f r0 = r0.mo63574d(r1)
            java.lang.String r1 = "video_play"
            com.ss.android.ugc.aweme.commerce.service.logs.f r0 = r0.mo63575e(r1)
            r1 = 0
            com.ss.android.ugc.aweme.commerce.service.logs.f r0 = r0.mo63578h(r1)
            java.lang.String r1 = r4.f77510Z
            com.ss.android.ugc.aweme.commerce.service.logs.f r0 = r0.mo63570a(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            int r1 = r1.getFollowStatus()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.ss.android.ugc.aweme.commerce.service.logs.f r0 = r0.mo63571b(r1)
            r0.mo63537a()
            return
        L_0x0141:
            android.widget.TextView r0 = r4.f77495K
            if (r0 != 0) goto L_0x0148
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0148:
            r1 = 8
            r0.setVisibility(r1)
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowVideoViewHolderPlanA.mo75225A():void");
    }

    /* renamed from: a */
    public final void mo68500a(View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        View view4;
        ViewStub viewStub4;
        ViewStub viewStub5;
        View view5;
        ViewStub viewStub6;
        View view6 = null;
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
            viewStub3.setLayoutResource(R.layout.a7n);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        } else {
            view4 = null;
        }
        mo75255a(view4, 12.0f, 0.0f, 16.0f, 16.0f);
        if (view != null) {
            viewStub4 = (ViewStub) view.findViewById(R.id.dcl);
        } else {
            viewStub4 = null;
        }
        if (viewStub4 != null) {
            viewStub4.setLayoutResource(R.layout.a6m);
        }
        if (viewStub4 != null) {
            viewStub4.inflate();
        }
        if (view != null) {
            viewStub5 = (ViewStub) view.findViewById(R.id.dc6);
        } else {
            viewStub5 = null;
        }
        if (viewStub5 != null) {
            viewStub5.setLayoutResource(R.layout.a7s);
        }
        if (viewStub5 != null) {
            view5 = viewStub5.inflate();
        } else {
            view5 = null;
        }
        mo75253a(view5, 16.0f);
        if (view != null) {
            viewStub6 = (ViewStub) view.findViewById(R.id.dc0);
        } else {
            viewStub6 = null;
        }
        if (viewStub6 != null) {
            viewStub6.setLayoutResource(R.layout.a7o);
        }
        if (viewStub6 != null) {
            view6 = viewStub6.inflate();
        }
        mo75254a(view6, 0.0f, 4.0f);
    }

    /* renamed from: a */
    public void mo68503a(View view, int i, int i2) {
        LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            mo86991a(C9738o.m28691a(mo75261ab()), C9738o.m28709b(mo75261ab()), C9738o.m28708b(mo75261ab(), 16.0f), ((float) i2) / ((float) i), iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public InsFollowVideoViewHolderPlanA(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
    }

    /* renamed from: a */
    public void mo86991a(int i, int i2, float f, float f2, int[] iArr) {
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
