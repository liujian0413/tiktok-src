package com.p280ss.android.ugc.aweme.p313im.sdk.group.adapter;

import android.arch.lifecycle.C0043i;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewholder.GroupMemberSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel.GroupMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.BaseSelectListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.zhiliaoapp.musically.df_live_zego_link.R;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupMemberSelectAdapter */
public final class GroupMemberSelectAdapter extends BaseSelectListAdapter<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f81953a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupMemberSelectAdapter.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;"))};

    /* renamed from: b */
    private final C7541d f81954b;

    /* renamed from: e */
    private C48006q<? super Integer, ? super Integer, ? super View, C7581n> f81955e = new C31263a(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupMemberSelectAdapter$a */
    static final class C31263a extends Lambda implements C48006q<Integer, Integer, View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberSelectAdapter f81956a;

        C31263a(GroupMemberSelectAdapter groupMemberSelectAdapter) {
            this.f81956a = groupMemberSelectAdapter;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m101881a(((Number) obj).intValue(), ((Number) obj2).intValue(), (View) obj3);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101881a(int i, int i2, View view) {
            C7573i.m23587b(view, "view");
            switch (i) {
                case 0:
                case 1:
                case 2:
                    GroupMemberListViewModel k = this.f81956a.mo81807k();
                    if (k == null || k.f83142j != 5 || view.getTag(R.id.l) == null) {
                        IMContact iMContact = (IMContact) this.f81956a.mo80344b(i2);
                        if (iMContact != null) {
                            GroupMemberListViewModel k2 = this.f81956a.mo81807k();
                            if (k2 != null) {
                                k2.mo82586a(iMContact);
                            }
                            this.f81956a.notifyItemChanged(i2);
                            return;
                        }
                    } else {
                        C10761a.m31383a(view.getContext(), (int) R.string.bhj).mo25750a();
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: k */
    public final GroupMemberListViewModel mo81807k() {
        return (GroupMemberListViewModel) this.f81954b.getValue();
    }

    /* renamed from: l */
    public final C48006q<Integer, Integer, View, C7581n> mo81805l() {
        return this.f81955e;
    }

    public GroupMemberSelectAdapter(C0043i iVar) {
        C7573i.m23587b(iVar, "owner");
        super(iVar);
        C7584c a = C7575l.m23595a(GroupMemberListViewModel.class);
        this.f81954b = C7546e.m23569a(new GroupMemberSelectAdapter$$special$$inlined$activityViewModel$1(a, iVar, a));
    }

    /* renamed from: b */
    public final BaseSelectViewHolder<IMContact> mo81803b(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return new GroupMemberSelectViewHolder<>(viewGroup);
    }
}
