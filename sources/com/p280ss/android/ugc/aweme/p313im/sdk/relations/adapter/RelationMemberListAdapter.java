package com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter;

import android.arch.lifecycle.C0043i;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.model.RelationMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.RelationMemberViewHolder;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberListAdapter */
public final class RelationMemberListAdapter extends BaseSelectListAdapter<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f83025a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RelationMemberListAdapter.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;"))};

    /* renamed from: b */
    public static final C31723a f83026b = new C31723a(null);

    /* renamed from: e */
    private final C7541d f83027e;

    /* renamed from: f */
    private C48006q<? super Integer, ? super Integer, ? super View, C7581n> f83028f = new C31724b(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberListAdapter$a */
    public static final class C31723a {
        private C31723a() {
        }

        public /* synthetic */ C31723a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberListAdapter$b */
    static final class C31724b extends Lambda implements C48006q<Integer, Integer, View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RelationMemberListAdapter f83029a;

        C31724b(RelationMemberListAdapter relationMemberListAdapter) {
            this.f83029a = relationMemberListAdapter;
            super(3);
        }

        /* renamed from: a */
        private void m103034a(int i, int i2, View view) {
            C7573i.m23587b(view, "view");
            switch (i) {
                case 0:
                case 1:
                case 2:
                    this.f83029a.mo82514c(i2);
                    return;
                default:
                    return;
            }
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m103034a(((Number) obj).intValue(), ((Number) obj2).intValue(), (View) obj3);
            return C7581n.f20898a;
        }
    }

    /* renamed from: k */
    private final RelationMemberListViewModel m103030k() {
        return (RelationMemberListViewModel) this.f83027e.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C48006q<Integer, Integer, View, C7581n> mo81805l() {
        return this.f83028f;
    }

    public RelationMemberListAdapter(C0043i iVar) {
        C7573i.m23587b(iVar, "owner");
        super(iVar);
        C7584c a = C7575l.m23595a(RelationMemberListViewModel.class);
        this.f83027e = C7546e.m23569a(new RelationMemberListAdapter$$special$$inlined$activityViewModel$1(a, iVar, a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r8.contains(r0) == true) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r1.contains(r0) == true) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e7, code lost:
        if (r1 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82514c(int r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.mo80344b(r10)
            com.ss.android.ugc.aweme.im.service.model.IMContact r0 = (com.p280ss.android.ugc.aweme.p313im.service.model.IMContact) r0
            if (r0 == 0) goto L_0x011e
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r1 = r9.m103030k()
            r2 = 0
            r3 = 2131823871(0x7f110cff, float:1.9280554E38)
            r4 = 10
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x00dd
            int r1 = r1.f83142j
            r7 = 4
            if (r1 != r7) goto L_0x00dd
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r1 = r9.m103030k()
            if (r1 == 0) goto L_0x002c
            java.util.List r1 = r1.mo82590o()
            if (r1 == 0) goto L_0x002c
            int r1 = r1.size()
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r7 = r9.m103030k()
            if (r7 == 0) goto L_0x003c
            java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> r7 = r7.f83133f
            if (r7 == 0) goto L_0x003c
            int r7 = r7.size()
            goto L_0x003d
        L_0x003c:
            r7 = 0
        L_0x003d:
            int r7 = r7 + r1
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r8 = r9.m103030k()
            if (r8 == 0) goto L_0x0050
            java.util.List r8 = r8.mo82590o()
            if (r8 == 0) goto L_0x0050
            boolean r8 = r8.contains(r0)
            if (r8 == r5) goto L_0x0074
        L_0x0050:
            if (r1 < r4) goto L_0x0074
            android.content.Context r10 = r9.f82978c
            android.content.Context r0 = r9.f82978c
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r6] = r4
            java.lang.String r0 = r0.getString(r3, r1)
            com.bytedance.ies.dmt.ui.c.a r10 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31410e(r10, r0)
            r10.mo25750a()
            java.lang.String r10 = "add"
            java.lang.String r0 = "num_limit"
            java.lang.String r1 = ""
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103435a(r10, r0, r2, r1)
            goto L_0x011e
        L_0x0074:
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r1 = r9.m103030k()
            if (r1 == 0) goto L_0x0086
            java.util.List r1 = r1.mo82590o()
            if (r1 == 0) goto L_0x0086
            boolean r1 = r1.contains(r0)
            if (r1 == r5) goto L_0x009e
        L_0x0086:
            r1 = 100
            if (r7 < r1) goto L_0x009e
            android.content.Context r10 = r9.f82978c
            android.content.Context r0 = r9.f82978c
            r1 = 2131823712(0x7f110c60, float:1.9280231E38)
            java.lang.String r0 = r0.getString(r1)
            com.bytedance.ies.dmt.ui.c.a r10 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31410e(r10, r0)
            r10.mo25750a()
            goto L_0x011e
        L_0x009e:
            com.ss.android.ugc.aweme.im.sdk.utils.p r1 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()
            boolean r1 = r1.mo18286B()
            if (r1 != 0) goto L_0x00d9
            android.content.Context r1 = r9.f82978c
            if (r1 == 0) goto L_0x00d9
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ NullValueException -> 0x00c3 }
            java.lang.String r2 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ NullValueException -> 0x00c3 }
            java.lang.Boolean r1 = r1.getGroupNewMemberCanPullOldMsg()     // Catch:{ NullValueException -> 0x00c3 }
            java.lang.String r2 = "SettingsReader.get().groupNewMemberCanPullOldMsg"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ NullValueException -> 0x00c3 }
            boolean r1 = r1.booleanValue()     // Catch:{ NullValueException -> 0x00c3 }
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            if (r1 == 0) goto L_0x00d9
            android.content.Context r1 = r9.f82978c
            r2 = 2131821596(0x7f11041c, float:1.927594E38)
            com.bytedance.ies.dmt.ui.c.a r1 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31409e(r1, r2)
            r1.mo25750a()
            com.ss.android.ugc.aweme.im.sdk.utils.p r1 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()
            r1.mo18316e(r5)
        L_0x00d9:
            r9.m103029a(r0, r10)
            goto L_0x011e
        L_0x00dd:
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r1 = r9.m103030k()
            if (r1 == 0) goto L_0x00e9
            java.util.List r1 = r1.mo82590o()
            if (r1 != 0) goto L_0x00ed
        L_0x00e9:
            java.util.List r1 = kotlin.collections.C7525m.m23461a()
        L_0x00ed:
            boolean r7 = r1.contains(r0)
            if (r7 != 0) goto L_0x011a
            int r1 = r1.size()
            if (r1 != r4) goto L_0x011a
            android.content.Context r10 = r9.f82978c
            android.content.Context r0 = r9.f82978c
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r6] = r4
            java.lang.String r0 = r0.getString(r3, r1)
            com.bytedance.ies.dmt.ui.c.a r10 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31410e(r10, r0)
            r10.mo25750a()
            java.lang.String r10 = "start"
            java.lang.String r0 = "num_limit"
            java.lang.String r1 = ""
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103435a(r10, r0, r2, r1)
            goto L_0x011e
        L_0x011a:
            r9.m103029a(r0, r10)
            return
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.RelationMemberListAdapter.mo82514c(int):void");
    }

    /* renamed from: a */
    private final void m103029a(IMContact iMContact, int i) {
        RelationMemberListViewModel k = m103030k();
        if (k != null) {
            k.mo82586a(iMContact);
        }
        notifyItemChanged(i);
    }

    /* renamed from: b */
    public final BaseSelectViewHolder<IMContact> mo81803b(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return new RelationMemberViewHolder<>(viewGroup);
    }
}
