package com.p280ss.android.ugc.aweme.p313im.sdk.group.viewholder;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel.GroupMemberFansViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.RelationMemberViewHolder;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import java.util.List;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupMemberFansViewHolder */
public final class GroupMemberFansViewHolder extends RelationMemberViewHolder {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82032a = {C7575l.m23601a((PropertyReference0) new PropertyReference0Impl(C7575l.m23595a(GroupMemberFansViewHolder.class), "viewModel", "<v#0>"))};

    /* renamed from: b */
    public final List<IMContact> mo81881b() {
        BaseMemberListViewModel<?> baseMemberListViewModel = this.f83202k;
        if (!(baseMemberListViewModel instanceof GroupMemberFansViewModel)) {
            baseMemberListViewModel = null;
        }
        GroupMemberFansViewModel groupMemberFansViewModel = (GroupMemberFansViewModel) baseMemberListViewModel;
        if (groupMemberFansViewModel != null) {
            return groupMemberFansViewModel.f82055d;
        }
        return null;
    }

    /* renamed from: a */
    public final BaseMemberListViewModel<?> mo81880a() {
        Context context = this.f83203l.getContext();
        if (context != null) {
            C0043i iVar = (C0043i) context;
            C7584c a = C7575l.m23595a(GroupMemberFansViewModel.class);
            return (BaseMemberListViewModel) C7546e.m23569a(new C31297x8f034b8(a, iVar, a)).getValue();
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    public GroupMemberFansViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        super(viewGroup);
    }
}
