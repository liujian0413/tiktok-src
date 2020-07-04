package com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.model.RelationMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.viewholder.RelationMemberSelectViewHolder */
public final class RelationMemberSelectViewHolder extends BaseSelectViewHolder<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f83193a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RelationMemberSelectViewHolder.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;"))};

    /* renamed from: j */
    private final View f83194j = this.itemView.findViewById(R.id.dke);

    /* renamed from: k */
    private final DmtTextView f83195k = ((DmtTextView) this.itemView.findViewById(R.id.dkn));

    /* renamed from: l */
    private final ImageView f83196l = ((ImageView) this.itemView.findViewById(R.id.b0l));

    /* renamed from: m */
    private final int f83197m;

    /* renamed from: n */
    private final C7541d f83198n;

    /* renamed from: a */
    private final RelationMemberListViewModel m103234a() {
        return (RelationMemberListViewModel) this.f83198n.getValue();
    }

    public RelationMemberSelectViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a21, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…on_select, parent, false)");
        super(inflate);
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f83197m = context.getResources().getColor(R.color.ay7);
        Context context2 = viewGroup.getContext();
        if (context2 != null) {
            C0043i iVar = (C0043i) context2;
            C7584c a = C7575l.m23595a(RelationMemberListViewModel.class);
            this.f83198n = C7546e.m23569a(new C31803xc1879b3(a, iVar, a));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2 == null) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m103236a(com.p280ss.android.ugc.aweme.p313im.service.model.IMUser r11, com.p280ss.android.ugc.aweme.p313im.service.model.IMUser r12) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r0 = r10.m103234a()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.mo82589n()
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r2 = r10.m103234a()
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = r2.mo82592q()
            if (r2 != 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r6 = r2
            goto L_0x001f
        L_0x001c:
            java.lang.String r2 = ""
            goto L_0x001a
        L_0x001f:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r2 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C31741e.f83051a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r10.f83183f
            java.lang.String r4 = "mNameTv"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.mo82533a(r3, r11, r6)
            android.widget.ImageView r2 = r10.f83182e
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31889bb.m103601a(r2, r11)
            r2 = 8
            if (r0 != 0) goto L_0x007c
            int r0 = r11.getType()
            r3 = 3
            if (r0 == r3) goto L_0x0043
            int r0 = r11.getType()
            if (r0 != 0) goto L_0x0056
        L_0x0043:
            if (r12 == 0) goto L_0x0061
            java.lang.String r12 = r12.getInitialLetter()
            java.lang.String r0 = r11.getInitialLetter()
            boolean r12 = kotlin.jvm.internal.C7573i.m23585a(r12, r0)
            r12 = r12 ^ 1
            if (r12 == 0) goto L_0x0056
            goto L_0x0061
        L_0x0056:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f83185h
            java.lang.String r12 = "mIndexTv"
            kotlin.jvm.internal.C7573i.m23582a(r11, r12)
            r11.setVisibility(r2)
            return
        L_0x0061:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r10.f83185h
            java.lang.String r0 = "mIndexTv"
            kotlin.jvm.internal.C7573i.m23582a(r12, r0)
            r12.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r10.f83185h
            java.lang.String r0 = "mIndexTv"
            kotlin.jvm.internal.C7573i.m23582a(r12, r0)
            java.lang.String r11 = r11.getInitialLetter()
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r12.setText(r11)
            return
        L_0x007c:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r3 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C31741e.f83051a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r10.f83184g
            java.lang.String r0 = "mDetailTv"
            kotlin.jvm.internal.C7573i.m23582a(r12, r0)
            r4 = r12
            android.widget.TextView r4 = (android.widget.TextView) r4
            r7 = 0
            r8 = 8
            r9 = 0
            r5 = r11
            r3.m103078a(r4, r5, r6, false)
            android.view.View r11 = r10.f83194j
            java.lang.String r12 = "mTitleLayout"
            kotlin.jvm.internal.C7573i.m23582a(r11, r12)
            r11.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f83185h
            java.lang.String r12 = "mIndexTv"
            kotlin.jvm.internal.C7573i.m23582a(r11, r12)
            r11.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.RelationMemberSelectViewHolder.m103236a(com.ss.android.ugc.aweme.im.service.model.IMUser, com.ss.android.ugc.aweme.im.service.model.IMUser):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ab, code lost:
        if (r3 == null) goto L_0x00ad;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo81879a(com.p280ss.android.ugc.aweme.p313im.service.model.IMContact r8, com.p280ss.android.ugc.aweme.p313im.service.model.IMContact r9, int r10) {
        /*
            r7 = this;
            java.lang.String r10 = "item"
            kotlin.jvm.internal.C7573i.m23587b(r8, r10)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r10 = r7.f83181d
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r10 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r10
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r8.getDisplayAvatar()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r10, r0)
            boolean r10 = r8 instanceof com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation
            r0 = 0
            r1 = 0
            if (r10 == 0) goto L_0x0074
            com.bytedance.ies.uikit.textview.a r10 = new com.bytedance.ies.uikit.textview.a
            android.view.View r2 = r7.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            android.content.Context r2 = r2.getContext()
            r10.<init>(r2)
            r2 = 1097859072(0x41700000, float:15.0)
            r10.mo26987a(r2)
            int r2 = r7.f83197m
            r10.mo26988a(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            android.content.Context r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            r4 = 2131823710(0x7f110c5e, float:1.9280227E38)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = r8
            com.ss.android.ugc.aweme.im.service.model.IMConversation r6 = (com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation) r6
            int r6 = r6.getConversationMemberCount()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r1] = r6
            java.lang.String r2 = r2.getString(r4, r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r10.mo26989a(r2)
            int r2 = r10.getIntrinsicWidth()
            int r3 = r10.getIntrinsicHeight()
            r10.setBounds(r1, r1, r2, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r7.f83183f
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            r2.setCompoundDrawables(r0, r0, r10, r0)
            goto L_0x0079
        L_0x0074:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r7.f83183f
            r10.setCompoundDrawables(r0, r0, r0, r0)
        L_0x0079:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r7.f83183f
            java.lang.String r2 = "mNameTv"
            kotlin.jvm.internal.C7573i.m23582a(r10, r2)
            java.lang.String r2 = r8.getDisplayName()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r10.setText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r7.f83184g
            java.lang.String r2 = "mDetailTv"
            kotlin.jvm.internal.C7573i.m23582a(r10, r2)
            r2 = 8
            r10.setVisibility(r2)
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r10 = r7.m103234a()
            if (r10 == 0) goto L_0x00a0
            boolean r10 = r10.mo82588m()
            goto L_0x00a1
        L_0x00a0:
            r10 = 0
        L_0x00a1:
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r3 = r7.m103234a()
            if (r3 == 0) goto L_0x00ad
            java.util.List r3 = r3.mo82590o()
            if (r3 != 0) goto L_0x00b1
        L_0x00ad:
            java.util.List r3 = kotlin.collections.C7525m.m23461a()
        L_0x00b1:
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r4 = r7.m103234a()
            if (r4 == 0) goto L_0x00bc
            boolean r4 = r4.mo82589n()
            goto L_0x00bd
        L_0x00bc:
            r4 = 0
        L_0x00bd:
            if (r10 == 0) goto L_0x00d1
            r7.mo82610e()
            android.widget.ImageView r10 = r7.f83186i
            java.lang.String r5 = "mCheckBox"
            kotlin.jvm.internal.C7573i.m23582a(r10, r5)
            boolean r3 = r3.contains(r8)
            r10.setSelected(r3)
            goto L_0x00de
        L_0x00d1:
            r7.mo82611f()
            android.widget.ImageView r10 = r7.f83186i
            java.lang.String r3 = "mCheckBox"
            kotlin.jvm.internal.C7573i.m23582a(r10, r3)
            r10.setSelected(r1)
        L_0x00de:
            if (r4 != 0) goto L_0x0196
            int r10 = r8.getType()
            r3 = 2
            if (r10 != r3) goto L_0x0105
            android.view.View r10 = r7.f83194j
            java.lang.String r3 = "mTitleLayout"
            kotlin.jvm.internal.C7573i.m23582a(r10, r3)
            r10.setVisibility(r1)
            android.widget.ImageView r10 = r7.f83196l
            java.lang.String r1 = "mFriendIcon"
            kotlin.jvm.internal.C7573i.m23582a(r10, r1)
            r10.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r7.f83195k
            r1 = 2131823848(0x7f110ce8, float:1.9280507E38)
            r10.setText(r1)
            goto L_0x01a0
        L_0x0105:
            int r10 = r8.getType()
            r3 = 5
            if (r10 != r3) goto L_0x0148
            android.view.View r10 = r7.f83194j
            java.lang.String r3 = "mTitleLayout"
            kotlin.jvm.internal.C7573i.m23582a(r10, r3)
            r10.setVisibility(r1)
            android.widget.ImageView r10 = r7.f83196l
            java.lang.String r1 = "mFriendIcon"
            kotlin.jvm.internal.C7573i.m23582a(r10, r1)
            r10.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r7.f83195k
            java.lang.String r1 = "mTitleTv"
            kotlin.jvm.internal.C7573i.m23582a(r10, r1)
            android.view.View r1 = r7.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "itemView.context"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131823667(0x7f110c33, float:1.928014E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r10.setText(r1)
            goto L_0x01a0
        L_0x0148:
            int r10 = r8.getType()
            r3 = 3
            if (r10 != r3) goto L_0x018b
            android.view.View r10 = r7.f83194j
            java.lang.String r3 = "mTitleLayout"
            kotlin.jvm.internal.C7573i.m23582a(r10, r3)
            r10.setVisibility(r1)
            android.widget.ImageView r10 = r7.f83196l
            java.lang.String r1 = "mFriendIcon"
            kotlin.jvm.internal.C7573i.m23582a(r10, r1)
            r10.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r7.f83195k
            java.lang.String r1 = "mTitleTv"
            kotlin.jvm.internal.C7573i.m23582a(r10, r1)
            android.view.View r1 = r7.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "itemView.context"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131823808(0x7f110cc0, float:1.9280426E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r10.setText(r1)
            goto L_0x01a0
        L_0x018b:
            android.view.View r10 = r7.f83194j
            java.lang.String r1 = "mTitleLayout"
            kotlin.jvm.internal.C7573i.m23582a(r10, r1)
            r10.setVisibility(r2)
            goto L_0x01a0
        L_0x0196:
            android.view.View r10 = r7.f83194j
            java.lang.String r1 = "mTitleLayout"
            kotlin.jvm.internal.C7573i.m23582a(r10, r1)
            r10.setVisibility(r2)
        L_0x01a0:
            com.ss.android.ugc.aweme.im.service.model.IMUser r8 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21661a(r8)
            if (r9 == 0) goto L_0x01aa
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21661a(r9)
        L_0x01aa:
            if (r8 == 0) goto L_0x01af
            r7.m103236a(r8, r0)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.RelationMemberSelectViewHolder.mo81879a(com.ss.android.ugc.aweme.im.service.model.IMContact, com.ss.android.ugc.aweme.im.service.model.IMContact, int):void");
    }
}
