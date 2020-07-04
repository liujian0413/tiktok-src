package com.p280ss.android.ugc.aweme.p313im.sdk.group.adapter;

import android.arch.lifecycle.C0043i;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewholder.GroupMemberFansViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel.GroupMemberFansViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.BaseSelectListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupMemberFansAdapter */
public final class GroupMemberFansAdapter extends BaseSelectListAdapter<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f81947a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupMemberFansAdapter.class), "fansViewModel", "getFansViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberFansViewModel;"))};

    /* renamed from: b */
    public static final C31260a f81948b = new C31260a(null);

    /* renamed from: e */
    private final C7541d f81949e;

    /* renamed from: f */
    private C48006q<? super Integer, ? super Integer, ? super View, C7581n> f81950f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupMemberFansAdapter$a */
    public static final class C31260a {
        private C31260a() {
        }

        public /* synthetic */ C31260a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupMemberFansAdapter$b */
    static final class C31261b extends Lambda implements C48006q<Integer, Integer, View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansAdapter f81951a;

        C31261b(GroupMemberFansAdapter groupMemberFansAdapter) {
            this.f81951a = groupMemberFansAdapter;
            super(3);
        }

        /* renamed from: a */
        private void m101876a(int i, int i2, View view) {
            C7573i.m23587b(view, "<anonymous parameter 2>");
            switch (i) {
                case 0:
                case 1:
                case 2:
                    this.f81951a.mo81806c(i2);
                    return;
                default:
                    return;
            }
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m101876a(((Number) obj).intValue(), ((Number) obj2).intValue(), (View) obj3);
            return C7581n.f20898a;
        }
    }

    /* renamed from: k */
    private final GroupMemberFansViewModel m101870k() {
        return (GroupMemberFansViewModel) this.f81949e.getValue();
    }

    /* renamed from: l */
    public final C48006q<Integer, Integer, View, C7581n> mo81805l() {
        return this.f81950f;
    }

    /* renamed from: c */
    public final int mo60557c() {
        int i;
        List list = this.f67539l;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        return i + mo80347j();
    }

    public final int getItemCount() {
        if (this.f67566v) {
            return mo60557c() + 1;
        }
        return mo60557c();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public IMContact mo80344b(int i) {
        if (i < mo80347j() || i >= getItemCount()) {
            return null;
        }
        List list = this.f67539l;
        if (list != null) {
            return (IMContact) list.get(i - mo80347j());
        }
        return null;
    }

    public GroupMemberFansAdapter(C0043i iVar) {
        C7573i.m23587b(iVar, "owner");
        super(iVar);
        C7584c a = C7575l.m23595a(GroupMemberFansViewModel.class);
        this.f81949e = C7546e.m23569a(new GroupMemberFansAdapter$$special$$inlined$activityViewModel$1(a, iVar, a));
        this.f81950f = new C31261b(this);
        this.f67566v = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r1 == null) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092 A[SYNTHETIC, Splitter:B:34:0x0092] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81806c(int r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.im.service.model.IMContact r0 = r7.mo80344b(r8)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel r1 = r7.m101870k()
            if (r1 == 0) goto L_0x0013
            java.util.List r1 = r1.mo82590o()
            if (r1 != 0) goto L_0x0017
        L_0x0013:
            java.util.List r1 = kotlin.collections.C7525m.m23461a()
        L_0x0017:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel r2 = r7.m101870k()
            r3 = 0
            if (r2 == 0) goto L_0x0029
            java.util.List r2 = r2.mo82590o()
            if (r2 == 0) goto L_0x0029
            int r2 = r2.size()
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel r4 = r7.m101870k()
            if (r4 == 0) goto L_0x0039
            java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> r4 = r4.f82055d
            if (r4 == 0) goto L_0x0039
            int r4 = r4.size()
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            int r4 = r4 + r2
            boolean r5 = r1.contains(r0)
            r6 = 1
            if (r5 != 0) goto L_0x006b
            r5 = 10
            if (r2 < r5) goto L_0x006b
            android.content.Context r8 = r7.f82978c
            android.content.Context r0 = r7.f82978c
            r1 = 2131821585(0x7f110411, float:1.9275917E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2[r3] = r4
            java.lang.String r0 = r0.getString(r1, r2)
            com.bytedance.ies.dmt.ui.c.a r8 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31410e(r8, r0)
            r8.mo25750a()
            java.lang.String r8 = "add"
            java.lang.String r0 = "num_limit"
            r1 = 0
            java.lang.String r2 = ""
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103435a(r8, r0, r1, r2)
            return
        L_0x006b:
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L_0x0088
            r1 = 100
            if (r4 < r1) goto L_0x0088
            android.content.Context r8 = r7.f82978c
            android.content.Context r0 = r7.f82978c
            r1 = 2131823712(0x7f110c60, float:1.9280231E38)
            java.lang.String r0 = r0.getString(r1)
            com.bytedance.ies.dmt.ui.c.a r8 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31410e(r8, r0)
            r8.mo25750a()
            return
        L_0x0088:
            com.ss.android.ugc.aweme.im.sdk.utils.p r1 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()
            boolean r1 = r1.mo18286B()
            if (r1 != 0) goto L_0x00bf
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ NullValueException -> 0x00a9 }
            java.lang.String r2 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ NullValueException -> 0x00a9 }
            java.lang.Boolean r1 = r1.getGroupNewMemberCanPullOldMsg()     // Catch:{ NullValueException -> 0x00a9 }
            java.lang.String r2 = "SettingsReader.get().groupNewMemberCanPullOldMsg"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ NullValueException -> 0x00a9 }
            boolean r1 = r1.booleanValue()     // Catch:{ NullValueException -> 0x00a9 }
            goto L_0x00aa
        L_0x00a9:
            r1 = 0
        L_0x00aa:
            if (r1 == 0) goto L_0x00bf
            android.content.Context r1 = r7.f82978c
            r2 = 2131821596(0x7f11041c, float:1.927594E38)
            com.bytedance.ies.dmt.ui.c.a r1 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31409e(r1, r2)
            r1.mo25750a()
            com.ss.android.ugc.aweme.im.sdk.utils.p r1 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()
            r1.mo18316e(r6)
        L_0x00bf:
            r7.m101868a(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.group.adapter.GroupMemberFansAdapter.mo81806c(int):void");
    }

    /* renamed from: a */
    private final void m101868a(IMContact iMContact, int i) {
        GroupMemberFansViewModel k = m101870k();
        if (k != null) {
            k.mo82586a(iMContact);
        }
        notifyItemChanged(i);
    }

    /* renamed from: b */
    public final BaseSelectViewHolder<IMContact> mo81803b(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return new GroupMemberFansViewHolder<>(viewGroup);
    }
}
