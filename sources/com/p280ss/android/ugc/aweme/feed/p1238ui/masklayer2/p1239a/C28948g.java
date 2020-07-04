package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a;

import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28933a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.g */
public final class C28948g extends C28955l {

    /* renamed from: a */
    public SharePackage f76289a;

    public C28948g(C28933a aVar) {
        C7573i.m23587b(aVar, "actionsManager");
        super(aVar);
        this.f76289a = aVar.f76273d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74231a(android.view.View r8) {
        /*
            r7 = this;
            java.lang.String r0 = "v"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f76297e
            java.lang.String r1 = "download"
            com.ss.android.ugc.aweme.app.g.d r2 = new com.ss.android.ugc.aweme.app.g.d
            r2.<init>()
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f76297e
            r5 = 0
            if (r4 == 0) goto L_0x001a
            java.lang.String r4 = r4.getAid()
            goto L_0x001b
        L_0x001a:
            r4 = r5
        L_0x001b:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f76297e
            if (r4 == 0) goto L_0x002a
            java.lang.String r4 = r4.getAuthorUid()
            goto L_0x002b
        L_0x002a:
            r4 = r5
        L_0x002b:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = r7.f76298f
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "download_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f76297e
            if (r4 == 0) goto L_0x0042
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            goto L_0x0043
        L_0x0042:
            r4 = r5
        L_0x0043:
            if (r4 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.IAccountUserService r4 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r6 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r6)
            java.lang.String r4 = r4.getCurUserId()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r7.f76297e
            if (r6 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.profile.model.User r6 = r6.getAuthor()
            if (r6 == 0) goto L_0x0062
            java.lang.String r5 = r6.getUid()
        L_0x0062:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x006d
            java.lang.String r4 = "self"
            goto L_0x006f
        L_0x006d:
            java.lang.String r4 = "other"
        L_0x006f:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "download_method"
            java.lang.String r4 = "long_press_download"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.feed.ae r4 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r7.f76297e
            java.lang.String r5 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107219c(r5)
            java.lang.String r4 = r4.mo71791a(r5)
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            com.p280ss.android.ugc.aweme.poi.utils.C35452k.m114511a(r0, r1, r2)
            java.lang.String r0 = "long_press_download"
            com.p280ss.android.ugc.aweme.share.C38024d.m121364a(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f76297e
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r0.isPreventDownload()
            r1 = 1
            if (r0 != r1) goto L_0x00e6
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r0 = com.p280ss.android.ugc.aweme.share.AwemeACLStruct.m121220a()
            android.content.Context r1 = r8.getContext()
            java.lang.String r2 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131821389(0x7f11034d, float:1.927552E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r3 = "v.context.resources.getS…ot_save_due_to_copyright)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            r0.setToastMsg(r1)
            java.lang.String r0 = r7.f76298f
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f76297e
            com.p280ss.android.ugc.aweme.share.C38024d.m121365a(r0, r1)
            android.content.Context r0 = r8.getContext()
            android.content.Context r8 = r8.getContext()
            java.lang.String r1 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r8, r1)
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getString(r2)
            com.bytedance.ies.dmt.ui.c.a r8 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31410e(r0, r8)
            r8.mo25750a()
            return
        L_0x00e6:
            java.lang.String r0 = r7.f76298f
            com.p280ss.android.ugc.aweme.share.C38024d.m121368b(r0)
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f76297e
            boolean r0 = com.p280ss.android.ugc.aweme.feed.share.p1236a.C28687a.m94362a(r0, r1)
            if (r0 != 0) goto L_0x00f8
            return
        L_0x00f8:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f76297e
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83220c(r0)
            if (r0 == 0) goto L_0x0139
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 != 0) goto L_0x0139
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r0 = com.p280ss.android.ugc.aweme.share.AwemeACLStruct.m121220a()
            android.content.Context r1 = r8.getContext()
            java.lang.String r2 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131820721(0x7f1100b1, float:1.9274165E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r3 = "v.context.resources.getS…not_support_this_feature)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            r0.setToastMsg(r1)
            java.lang.String r0 = r7.f76298f
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f76297e
            com.p280ss.android.ugc.aweme.share.C38024d.m121365a(r0, r1)
            android.content.Context r8 = r8.getContext()
            com.bytedance.ies.dmt.ui.c.a r8 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r8, r2)
            r8.mo25750a()
            return
        L_0x0139:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 != 0) goto L_0x01ba
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f76297e
            if (r0 == 0) goto L_0x0192
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.p280ss.android.ugc.aweme.share.C37984ap.m121302b()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f76297e
            if (r1 != 0) goto L_0x014e
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x014e:
            android.content.Context r2 = r8.getContext()
            java.lang.String r3 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            boolean r0 = r0.checkShareAllowStatus(r1, r2)
            if (r0 != 0) goto L_0x015e
            goto L_0x0192
        L_0x015e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f76297e
            if (r0 == 0) goto L_0x0191
            com.ss.android.ugc.aweme.share.ShareExtService r1 = com.p280ss.android.ugc.aweme.share.C37984ap.m121302b()
            android.content.Context r0 = r8.getContext()
            java.lang.String r2 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            android.app.Activity r2 = com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b.m121903a(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f76297e
            if (r3 != 0) goto L_0x017a
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x017a:
            java.lang.String r4 = r7.f76298f
            java.lang.String r5 = "long_press_download"
            r6 = 0
            com.ss.android.ugc.aweme.sharer.ui.f r0 = r1.getDownloadAction(r2, r3, r4, r5, r6)
            android.content.Context r8 = r8.getContext()
            java.lang.String r1 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r8, r1)
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r1 = r7.f76289a
            r0.mo95712a(r8, r1)
        L_0x0191:
            return
        L_0x0192:
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r0 = com.p280ss.android.ugc.aweme.share.AwemeACLStruct.m121220a()
            android.content.Context r8 = r8.getContext()
            java.lang.String r1 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r8, r1)
            android.content.res.Resources r8 = r8.getResources()
            r1 = 2131821390(0x7f11034e, float:1.9275522E38)
            java.lang.String r8 = r8.getString(r1)
            java.lang.String r1 = "v.context.resources.getS…g(R.string.can_not_share)"
            kotlin.jvm.internal.C7573i.m23582a(r8, r1)
            r0.setToastMsg(r8)
            java.lang.String r8 = r7.f76298f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f76297e
            com.p280ss.android.ugc.aweme.share.C38024d.m121365a(r8, r0)
            return
        L_0x01ba:
            com.ss.android.ugc.aweme.share.ShareExtService r1 = com.p280ss.android.ugc.aweme.share.C37984ap.m121302b()
            android.content.Context r0 = r8.getContext()
            java.lang.String r2 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            android.app.Activity r2 = com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b.m121903a(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f76297e
            if (r3 != 0) goto L_0x01d2
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x01d2:
            java.lang.String r4 = r7.f76298f
            java.lang.String r5 = "long_press_download"
            r6 = 0
            com.ss.android.ugc.aweme.sharer.ui.f r0 = r1.getDownloadAction(r2, r3, r4, r5, r6)
            android.content.Context r8 = r8.getContext()
            java.lang.String r1 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r8, r1)
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r1 = r7.f76289a
            r0.mo95712a(r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28948g.mo74231a(android.view.View):void");
    }
}
