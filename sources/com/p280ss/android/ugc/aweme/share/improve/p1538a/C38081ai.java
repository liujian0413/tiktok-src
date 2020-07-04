package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ai */
public final class C38081ai implements C38389f {

    /* renamed from: a */
    private final Aweme f99138a;

    /* renamed from: b */
    private final String f99139b;

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.au1;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "reuse_sticker";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.dh3;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    /* renamed from: a */
    public final void mo95711a(Context context) {
        C7573i.m23587b(context, "context");
        C38390a.m122628a((C38389f) this, context);
    }

    /* renamed from: a */
    public final void mo95713a(ImageView imageView) {
        C7573i.m23587b(imageView, "iconView");
        C38390a.m122629a((C38389f) this, imageView);
    }

    /* renamed from: a */
    public final void mo95714a(TextView textView) {
        C7573i.m23587b(textView, "textView");
        C38390a.m122630a((C38389f) this, textView);
    }

    public C38081ai(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        this.f99138a = aweme;
        this.f99139b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0120  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95712a(android.content.Context r7, com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage r8) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            java.lang.String r0 = "sharePackage"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            boolean r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r8 != 0) goto L_0x0061
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r6.f99138a
            java.lang.String r0 = r6.f99139b
            boolean r8 = com.p280ss.android.ugc.aweme.share.improve.p1540c.C38156a.m121902a(r6, r7, r8, r0)
            if (r8 != 0) goto L_0x001b
            return
        L_0x001b:
            boolean r8 = com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r8 == 0) goto L_0x0030
            r8 = 2131827224(0x7f111a18, float:1.9287355E38)
            java.lang.String r8 = r7.getString(r8)
            com.bytedance.ies.dmt.ui.c.a r7 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31410e(r7, r8)
            r7.mo25750a()
            return
        L_0x0030:
            com.ss.android.ugc.aweme.IAccountUserService r8 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r0 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            boolean r8 = r8.isLogin()
            if (r8 != 0) goto L_0x0065
            com.ss.android.ugc.aweme.framework.services.ServiceManager r8 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r0 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r8 = r8.getService(r0)
            com.ss.android.ugc.aweme.services.IAVService r8 = (com.p280ss.android.ugc.aweme.services.IAVService) r8
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r8 = r8.avSettingsService()
            boolean r8 = r8.needLoginBeforeRecord()
            if (r8 == 0) goto L_0x0065
            android.app.Activity r7 = com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b.m121903a(r7)
            java.lang.String r8 = r6.f99139b
            java.lang.String r0 = "click_share_button"
            com.p280ss.android.ugc.aweme.login.C32656f.m105742a(r7, r8, r0)
            return
        L_0x0061:
            java.lang.String r8 = "prop_reuse"
            com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean.sCurPropSource = r8
        L_0x0065:
            java.lang.String r8 = "prop_reuse_icon"
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r1 = "prop_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f99138a
            java.lang.String r2 = r2.getStickerIDs()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "action_type"
            java.lang.String r2 = "click"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f99138a
            java.lang.String r2 = r2.getAid()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r8, r0)
            com.ss.android.ugc.aweme.share.x r8 = new com.ss.android.ugc.aweme.share.x
            r8.<init>(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f99138a
            java.lang.String r0 = r0.getStickerIDs()
            java.lang.String r1 = "aweme.stickerIDs"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = ","
            kotlin.text.Regex r2 = new kotlin.text.Regex
            r2.<init>(r1)
            r1 = 0
            java.util.List r0 = r2.split(r0, r1)
            boolean r2 = r0.isEmpty()
            r3 = 1
            if (r2 != 0) goto L_0x00e7
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        L_0x00c2:
            boolean r4 = r2.hasPrevious()
            if (r4 == 0) goto L_0x00e7
            java.lang.Object r4 = r2.previous()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x00d8
            r4 = 1
            goto L_0x00d9
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            if (r4 != 0) goto L_0x00c2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r2 = r2.nextIndex()
            int r2 = r2 + r3
            java.util.List r0 = kotlin.collections.C7525m.m23505c(r0, r2)
            goto L_0x00eb
        L_0x00e7:
            java.util.List r0 = kotlin.collections.C7525m.m23461a()
        L_0x00eb:
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            if (r0 == 0) goto L_0x0120
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
        L_0x00f8:
            if (r1 >= r2) goto L_0x0108
            r4 = r0[r1]
            boolean r5 = r7.contains(r4)
            if (r5 != 0) goto L_0x0105
            r7.add(r4)
        L_0x0105:
            int r1 = r1 + 1
            goto L_0x00f8
        L_0x0108:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f99138a
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            r8.f99478h = r0
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 != 0) goto L_0x011a
            r8.mo95919a(r7, r3, r3)
            return
        L_0x011a:
            java.lang.String r0 = "prop_reuse"
            r8.mo95916a(r7, r0)
            return
        L_0x0120:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T>"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.improve.p1538a.C38081ai.mo95712a(android.content.Context, com.ss.android.ugc.aweme.sharer.ui.SharePackage):void");
    }
}
