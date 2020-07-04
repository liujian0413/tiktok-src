package com.p280ss.android.ugc.aweme.p313im.sdk.group.viewholder;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel.GroupListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupSelectViewHolder */
public final class GroupSelectViewHolder extends BaseSelectViewHolder<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82037a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupSelectViewHolder.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel;"))};

    /* renamed from: j */
    private final C7541d f82038j;

    /* renamed from: k */
    private final DmtTextView f82039k;

    /* renamed from: a */
    private final GroupListViewModel m101949a() {
        return (GroupListViewModel) this.f82038j.getValue();
    }

    public GroupSelectViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.we, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…up_select, parent, false)");
        super(inflate);
        Context context = viewGroup.getContext();
        if (context != null) {
            C0043i iVar = (C0043i) context;
            C7584c a = C7575l.m23595a(GroupListViewModel.class);
            this.f82038j = C7546e.m23569a(new GroupSelectViewHolder$$special$$inlined$activityViewModel$1(a, iVar, a));
            View findViewById = this.itemView.findViewById(R.id.a3m);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.count_tv)");
            this.f82039k = (DmtTextView) findViewById;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0047, code lost:
        if (r1 == null) goto L_0x0049;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101951a(com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            r0.append(r1)
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r6.getConversationMemberCount()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            r3 = 2131823710(0x7f110c5e, float:1.9280227E38)
            java.lang.String r1 = r1.getString(r3, r2)
            r0.append(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r5.f82039k
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r0 = r5.m101949a()
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.mo82588m()
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r1 = r5.m101949a()
            if (r1 == 0) goto L_0x0049
            java.util.List r1 = r1.mo82590o()
            if (r1 != 0) goto L_0x004d
        L_0x0049:
            java.util.List r1 = kotlin.collections.C7525m.m23461a()
        L_0x004d:
            if (r0 == 0) goto L_0x0061
            r5.mo82610e()
            android.widget.ImageView r0 = r5.f83186i
            java.lang.String r2 = "mCheckBox"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            boolean r6 = r1.contains(r6)
            r0.setSelected(r6)
            return
        L_0x0061:
            r5.mo82611f()
            android.widget.ImageView r6 = r5.f83186i
            java.lang.String r0 = "mCheckBox"
            kotlin.jvm.internal.C7573i.m23582a(r6, r0)
            r6.setSelected(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.group.viewholder.GroupSelectViewHolder.m101951a(com.ss.android.ugc.aweme.im.service.model.IMConversation):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo81879a(IMContact iMContact, IMContact iMContact2, int i) {
        C7573i.m23587b(iMContact, "item");
        C23323e.m76524b(this.f83181d, iMContact.getDisplayAvatar());
        DmtTextView dmtTextView = this.f83183f;
        C7573i.m23582a((Object) dmtTextView, "mNameTv");
        dmtTextView.setText(iMContact.getDisplayName());
        DmtTextView dmtTextView2 = this.f83184g;
        C7573i.m23582a((Object) dmtTextView2, "mDetailTv");
        dmtTextView2.setVisibility(8);
        m101951a((IMConversation) iMContact);
    }
}
