package com.p280ss.android.ugc.aweme.p313im.sdk.group.adapter;

import android.arch.lifecycle.C0043i;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewholder.AtMemberViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel.GroupMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.BaseSelectListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.adapter.AtMemberAdapter */
public final class AtMemberAdapter extends BaseSelectListAdapter<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f81942a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AtMemberAdapter.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;"))};

    /* renamed from: b */
    private final C7541d f81943b;

    /* renamed from: e */
    private C48006q<? super Integer, ? super Integer, ? super View, C7581n> f81944e = new C31258a(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.adapter.AtMemberAdapter$a */
    static final class C31258a extends Lambda implements C48006q<Integer, Integer, View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ AtMemberAdapter f81945a;

        C31258a(AtMemberAdapter atMemberAdapter) {
            this.f81945a = atMemberAdapter;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m101866a(((Number) obj).intValue(), ((Number) obj2).intValue(), (View) obj3);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101866a(int i, int i2, View view) {
            C7573i.m23587b(view, "view");
            switch (i) {
                case 0:
                case 1:
                case 2:
                    IMContact iMContact = (IMContact) this.f81945a.mo80344b(i2);
                    if (iMContact != null) {
                        GroupMemberListViewModel k = this.f81945a.mo81804k();
                        if (k != null) {
                            k.mo82586a(iMContact);
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
            }
        }
    }

    /* renamed from: k */
    public final GroupMemberListViewModel mo81804k() {
        return (GroupMemberListViewModel) this.f81943b.getValue();
    }

    /* renamed from: l */
    public final C48006q<Integer, Integer, View, C7581n> mo81805l() {
        return this.f81944e;
    }

    public AtMemberAdapter(C0043i iVar) {
        C7573i.m23587b(iVar, "owner");
        super(iVar);
        C7584c a = C7575l.m23595a(GroupMemberListViewModel.class);
        this.f81943b = C7546e.m23569a(new AtMemberAdapter$$special$$inlined$activityViewModel$1(a, iVar, a));
    }

    /* renamed from: b */
    public final BaseSelectViewHolder<IMContact> mo81803b(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return new AtMemberViewHolder<>(viewGroup);
    }
}
