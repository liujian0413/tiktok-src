package com.p280ss.android.ugc.aweme.p313im.sdk.group.adapter;

import android.arch.lifecycle.C0043i;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewholder.GroupSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel.GroupListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.BaseSelectListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter */
public final class GroupSelectListAdapter extends BaseSelectListAdapter<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f81958a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupSelectListAdapter.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel;"))};

    /* renamed from: b */
    private final C7541d f81959b;

    /* renamed from: e */
    private C48006q<? super Integer, ? super Integer, ? super View, C7581n> f81960e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter$a */
    static final class C31265a extends Lambda implements C48006q<Integer, Integer, View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupSelectListAdapter f81961a;

        /* renamed from: b */
        final /* synthetic */ C0043i f81962b;

        C31265a(GroupSelectListAdapter groupSelectListAdapter, C0043i iVar) {
            this.f81961a = groupSelectListAdapter;
            this.f81962b = iVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m101889a(((Number) obj).intValue(), ((Number) obj2).intValue(), (View) obj3);
            return C7581n.f20898a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
            if (r4 == null) goto L_0x0086;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m101889a(int r4, int r5, android.view.View r6) {
            /*
                r3 = this;
                java.lang.String r0 = "view"
                kotlin.jvm.internal.C7573i.m23587b(r6, r0)
                switch(r4) {
                    case 0: goto L_0x000a;
                    case 1: goto L_0x000a;
                    case 2: goto L_0x000a;
                    default: goto L_0x0008;
                }
            L_0x0008:
                goto L_0x00e7
            L_0x000a:
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r4 = r3.f81961a
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r4 = r4.mo81809k()
                if (r4 == 0) goto L_0x00e7
                int r4 = r4.f83142j
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r6 = r3.f81961a
                com.ss.android.ugc.aweme.im.service.model.IMContact r6 = r6.mo80344b(r5)
                boolean r0 = r6 instanceof com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation
                if (r0 != 0) goto L_0x0029
                r6 = 0
            L_0x0029:
                com.ss.android.ugc.aweme.im.service.model.IMConversation r6 = (com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation) r6
                if (r6 != 0) goto L_0x002f
                goto L_0x00e7
            L_0x002f:
                r0 = 2
                if (r4 != r0) goto L_0x0067
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                java.lang.String r5 = "key_enter_from"
                r0 = 7
                r4.putInt(r5, r0)
                android.arch.lifecycle.i r5 = r3.f81962b
                if (r5 == 0) goto L_0x005f
                android.content.Context r5 = (android.content.Context) r5
                java.lang.String r0 = r6.getConversationId()
                r1 = 3
                com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity.m21596a(r5, r0, r1, r4)
                com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103406a()
                java.lang.String r4 = r6.getConversationId()
                java.lang.String r5 = ""
                java.lang.String r6 = "group"
                java.lang.String r0 = "click_contact"
                java.lang.String r1 = "contact_list"
                com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103432a(r4, r5, r6, r0, r1)
                goto L_0x00e7
            L_0x005f:
                kotlin.TypeCastException r4 = new kotlin.TypeCastException
                java.lang.String r5 = "null cannot be cast to non-null type android.content.Context"
                r4.<init>(r5)
                throw r4
            L_0x0067:
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r4 = r3.f81961a
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r4 = r4.mo81809k()
                r0 = 0
                if (r4 == 0) goto L_0x0075
                boolean r4 = r4.mo82588m()
                goto L_0x0076
            L_0x0075:
                r4 = 0
            L_0x0076:
                if (r4 == 0) goto L_0x00d8
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r4 = r3.f81961a
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r4 = r4.mo81809k()
                if (r4 == 0) goto L_0x0086
                java.util.List r4 = r4.mo82590o()
                if (r4 != 0) goto L_0x008a
            L_0x0086:
                java.util.List r4 = kotlin.collections.C7525m.m23461a()
            L_0x008a:
                boolean r1 = r4.contains(r6)
                if (r1 != 0) goto L_0x00c5
                int r4 = r4.size()
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r1 = r3.f81961a
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r1 = r1.mo81809k()
                r2 = 10
                if (r1 == 0) goto L_0x00a1
                int r1 = r1.f82048h
                goto L_0x00a3
            L_0x00a1:
                r1 = 10
            L_0x00a3:
                if (r4 < r1) goto L_0x00c5
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r4 = r3.f81961a
                android.content.Context r4 = r4.f82978c
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r5 = r3.f81961a
                android.content.Context r5 = r5.f82978c
                r6 = 2131823945(0x7f110d49, float:1.9280704E38)
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r0] = r2
                java.lang.String r5 = r5.getString(r6, r1)
                com.bytedance.ies.dmt.ui.c.a r4 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31410e(r4, r5)
                r4.mo25750a()
                goto L_0x00e7
            L_0x00c5:
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r4 = r3.f81961a
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r4 = r4.mo81809k()
                if (r4 == 0) goto L_0x00d2
                com.ss.android.ugc.aweme.im.service.model.IMContact r6 = (com.p280ss.android.ugc.aweme.p313im.service.model.IMContact) r6
                r4.mo82586a(r6)
            L_0x00d2:
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r4 = r3.f81961a
                r4.notifyItemChanged(r5)
                goto L_0x00e7
            L_0x00d8:
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r4 = r3.f81961a
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r4 = r4.mo81809k()
                if (r4 == 0) goto L_0x00e6
                com.ss.android.ugc.aweme.im.service.model.IMContact r6 = (com.p280ss.android.ugc.aweme.p313im.service.model.IMContact) r6
                r4.mo82586a(r6)
                goto L_0x00e7
            L_0x00e6:
                return
            L_0x00e7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.group.adapter.GroupSelectListAdapter.C31265a.m101889a(int, int, android.view.View):void");
        }
    }

    /* renamed from: k */
    public final GroupListViewModel mo81809k() {
        return (GroupListViewModel) this.f81959b.getValue();
    }

    /* renamed from: l */
    public final C48006q<Integer, Integer, View, C7581n> mo81805l() {
        return this.f81960e;
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

    /* renamed from: c */
    public final IMContact mo80344b(int i) {
        if (i < mo80347j() || i >= getItemCount()) {
            return null;
        }
        List list = this.f67539l;
        if (list != null) {
            return (IMContact) list.get(i - mo80347j());
        }
        return null;
    }

    public GroupSelectListAdapter(C0043i iVar) {
        C7573i.m23587b(iVar, "owner");
        super(iVar);
        this.f67566v = true;
        C7584c a = C7575l.m23595a(GroupListViewModel.class);
        this.f81959b = C7546e.m23569a(new GroupSelectListAdapter$$special$$inlined$activityViewModel$1(a, iVar, a));
        this.f81960e = new C31265a(this, iVar);
    }

    /* renamed from: b */
    public final BaseSelectViewHolder<IMContact> mo81803b(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return new GroupSelectViewHolder<>(viewGroup);
    }
}
