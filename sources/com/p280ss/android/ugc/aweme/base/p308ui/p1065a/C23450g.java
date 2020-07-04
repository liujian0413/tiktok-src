package com.p280ss.android.ugc.aweme.base.p308ui.p1065a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.AnchorInfo;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.base.ui.a.g */
public final class C23450g extends C23443b {

    /* renamed from: a */
    public final Activity f61875a;

    /* renamed from: b */
    public final String f61876b;

    /* renamed from: a */
    public final void mo59065a() {
        C6907h.m21524a("anchor_entrance_show", (Map) C22984d.m75611a().f60753a);
    }

    /* renamed from: b */
    public final void mo59068b() {
        C6907h.m21524a("anchor_entrance_click", (Map) C22984d.m75611a().f60753a);
    }

    /* renamed from: a */
    private static boolean m76968a(AnchorInfo anchorInfo) {
        Integer type = anchorInfo.getType();
        int type2 = AnchorBusinessType.MICRO_APP.getTYPE();
        if (type != null && type.intValue() == type2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo59066a(View view) {
        String str;
        String str2;
        String str3;
        super.mo59066a(view);
        Aweme aweme = this.f61858j;
        Context context = null;
        if (aweme != null) {
            C33472a d = new C33472a().mo85791b(this.f61876b).mo85789a("in_video_tag").mo85793d(aweme.getAid());
            if (C25352e.m83221d(aweme)) {
                str = "025002";
            } else {
                str = "023001";
            }
            C33471b a = d.mo85792c(str).mo85790a();
            AnchorInfo anchorInfo = aweme.getAnchorInfo();
            if (anchorInfo != null) {
                String openUrl = anchorInfo.getOpenUrl();
                if (openUrl != null) {
                    C7167b b = C7167b.m22380b();
                    C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
                    b.mo18647a().openMiniApp((Context) this.f61875a, openUrl, a);
                    String str4 = "mp_click";
                    C22984d a2 = C22984d.m75611a().mo59973a("group_id", aweme.getAid());
                    String str5 = "mp_id";
                    AnchorInfo anchorInfo2 = aweme.getAnchorInfo();
                    if (anchorInfo2 != null) {
                        str2 = anchorInfo2.getId();
                    } else {
                        str2 = null;
                    }
                    C22984d a3 = a2.mo59973a(str5, str2).mo59973a("author_id", aweme.getAuthorUid()).mo59973a("enter_from", this.f61876b).mo59973a("position", "in_video_tag");
                    String str6 = "_param_for_special";
                    AnchorInfo anchorInfo3 = aweme.getAnchorInfo();
                    C7573i.m23582a((Object) anchorInfo3, "aweme.anchorInfo");
                    if (m76968a(anchorInfo3)) {
                        str3 = "micro_app";
                    } else {
                        str3 = "micro_game";
                    }
                    C6907h.m21524a(str4, (Map) a3.mo59973a(str6, str3).f60753a);
                }
            }
        }
        if (C25352e.m83224g(this.f61858j)) {
            if (view != null) {
                context = view.getContext();
            }
            C24976t.m82279t(context, this.f61858j, "draw_ad");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59067a(com.p280ss.android.ugc.aweme.feed.model.Aweme r5, org.json.JSONObject r6) {
        /*
            r4 = this;
            super.mo59067a(r5, r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r4.f61852d
            r0 = 0
            if (r5 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r1 = r5.getAnchorInfo()
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = r1.getTitle()
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r6.setText(r1)
            if (r5 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r6 = r5.getAnchorInfo()
            if (r6 == 0) goto L_0x0037
            java.lang.String r6 = r6.getOpenUrl()
            if (r6 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.miniapp_api.services.b r1 = com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b.m22380b()
            java.lang.String r2 = "MiniAppServiceProxy.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r1 = r1.mo18647a()
            r1.preloadMiniApp(r6)
        L_0x0037:
            if (r5 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r6 = r5.getAnchorInfo()
            if (r6 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r6.getIcon()
            if (r6 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r4.f61851c
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r1, r6)
            goto L_0x007c
        L_0x004b:
            r6 = r4
            com.ss.android.ugc.aweme.base.ui.a.g r6 = (com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23450g) r6
            if (r5 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r1 = r5.getAnchorInfo()
            if (r1 == 0) goto L_0x005b
            java.lang.Integer r1 = r1.getType()
            goto L_0x005c
        L_0x005b:
            r1 = r0
        L_0x005c:
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.MICRO_GAME
            int r2 = r2.getTYPE()
            if (r1 != 0) goto L_0x0065
            goto L_0x0074
        L_0x0065:
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x0074
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r6.f61851c
            r1 = 2131231804(0x7f08043c, float:1.80797E38)
            r6.setImageResource(r1)
            goto L_0x007c
        L_0x0074:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r6.f61851c
            r1 = 2131231803(0x7f08043b, float:1.8079697E38)
            r6.setImageResource(r1)
        L_0x007c:
            java.lang.String r6 = "mp_show"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "group_id"
            if (r5 == 0) goto L_0x008b
            java.lang.String r3 = r5.getAid()
            goto L_0x008c
        L_0x008b:
            r3 = r0
        L_0x008c:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "mp_id"
            if (r5 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r3 = r5.getAnchorInfo()
            if (r3 == 0) goto L_0x009f
            java.lang.String r3 = r3.getId()
            goto L_0x00a0
        L_0x009f:
            r3 = r0
        L_0x00a0:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "author_id"
            if (r5 == 0) goto L_0x00ac
            java.lang.String r0 = r5.getAuthorUid()
        L_0x00ac:
            com.ss.android.ugc.aweme.app.g.d r5 = r1.mo59973a(r2, r0)
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = r4.f61876b
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r0, r1)
            java.lang.String r0 = "position"
            java.lang.String r1 = "in_video_tag"
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r0, r1)
            java.lang.String r0 = "_param_for_special"
            java.lang.String r1 = "micro_app"
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23450g.mo59067a(com.ss.android.ugc.aweme.feed.model.Aweme, org.json.JSONObject):void");
    }

    public C23450g(ViewGroup viewGroup, Activity activity, String str) {
        C7573i.m23587b(viewGroup, "parent");
        super(viewGroup);
        this.f61875a = activity;
        this.f61876b = str;
    }
}
