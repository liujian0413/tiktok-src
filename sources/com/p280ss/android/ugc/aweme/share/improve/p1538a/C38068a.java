package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38142a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.a */
public final class C38068a implements C38389f {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f99116a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38068a.class), "mCopyLinkChannel", "getMCopyLinkChannel()Lcom/ss/android/ugc/aweme/share/improve/channel/CopyLinkChannel;"))};

    /* renamed from: b */
    private Aweme f99117b;

    /* renamed from: c */
    private String f99118c;

    /* renamed from: d */
    private final C7541d f99119d = C7546e.m23569a(C38069a.f99120a);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.a$a */
    static final class C38069a extends Lambda implements C7561a<C38142a> {

        /* renamed from: a */
        public static final C38069a f99120a = new C38069a();

        C38069a() {
            super(0);
        }

        /* renamed from: a */
        private static C38142a m121481a() {
            return new C38142a();
        }

        public final /* synthetic */ Object invoke() {
            return m121481a();
        }
    }

    /* renamed from: f */
    private final C38142a m121471f() {
        return (C38142a) this.f99119d.getValue();
    }

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.aoh;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "ad_settings";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.dqz;
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
    public final void mo95713a(ImageView imageView) {
        C7573i.m23587b(imageView, "iconView");
        C38390a.m122629a((C38389f) this, imageView);
    }

    /* renamed from: a */
    public final void mo95714a(TextView textView) {
        C7573i.m23587b(textView, "textView");
        C38390a.m122630a((C38389f) this, textView);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (r2 == null) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95711a(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            java.lang.String r4 = "show_adsetting_entrance"
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r3.f99118c
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f99117b
            java.lang.String r2 = r2.getAid()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f99117b
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            if (r2 == 0) goto L_0x002f
            java.lang.String r2 = r2.getUid()
            if (r2 != 0) goto L_0x0031
        L_0x002f:
            java.lang.String r2 = ""
        L_0x0031:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = "click_share_button"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.improve.p1538a.C38068a.mo95711a(android.content.Context):void");
    }

    public C38068a(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "enterFrom");
        this.f99117b = aweme;
        this.f99118c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004b, code lost:
        if (r1 == null) goto L_0x004d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95712a(android.content.Context r3, com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            java.lang.String r0 = "sharePackage"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.share.improve.b.a r1 = r2.m121471f()
            com.ss.android.ugc.aweme.sharer.b r1 = (com.p280ss.android.ugc.aweme.sharer.C38343b) r1
            com.ss.android.ugc.aweme.sharer.f r4 = r4.mo18860a(r1)
            boolean r1 = r4 instanceof com.p280ss.android.ugc.aweme.sharer.C38356g
            if (r1 == 0) goto L_0x001e
            com.ss.android.ugc.aweme.sharer.g r4 = (com.p280ss.android.ugc.aweme.sharer.C38356g) r4
            java.lang.String r0 = r4.f99565b
        L_0x001e:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r2.f99117b
            com.p280ss.android.ugc.aweme.setting.p337ui.AdSettingsActivity.m120653a(r3, r4, r0)
            java.lang.String r3 = "click_adsetting_entrance"
            com.ss.android.ugc.aweme.app.g.d r4 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = r2.f99118c
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r0, r1)
            java.lang.String r0 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r2.f99117b
            java.lang.String r1 = r1.getAid()
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r0, r1)
            java.lang.String r0 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r2.f99117b
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            if (r1 == 0) goto L_0x004d
            java.lang.String r1 = r1.getUid()
            if (r1 != 0) goto L_0x004f
        L_0x004d:
            java.lang.String r1 = ""
        L_0x004f:
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r0, r1)
            java.lang.String r0 = "enter_method"
            java.lang.String r1 = "click_share_button"
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.improve.p1538a.C38068a.mo95712a(android.content.Context, com.ss.android.ugc.aweme.sharer.ui.SharePackage):void");
    }
}
