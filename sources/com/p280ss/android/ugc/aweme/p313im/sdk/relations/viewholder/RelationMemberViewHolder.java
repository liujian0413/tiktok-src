package com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.model.RelationMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.viewholder.RelationMemberViewHolder */
public class RelationMemberViewHolder extends BaseSelectViewHolder<IMContact> {

    /* renamed from: j */
    static final /* synthetic */ C7595j[] f83200j = {C7575l.m23601a((PropertyReference0) new PropertyReference0Impl(C7575l.m23595a(RelationMemberViewHolder.class), "viewModel", "<v#0>"))};

    /* renamed from: a */
    private final View f83201a = this.itemView.findViewById(R.id.dke);

    /* renamed from: k */
    public final BaseMemberListViewModel<?> f83202k = mo81880a();

    /* renamed from: l */
    public final ViewGroup f83203l;

    /* renamed from: m */
    private final DmtTextView f83204m = ((DmtTextView) this.itemView.findViewById(R.id.dkn));

    /* renamed from: n */
    private final ImageView f83205n = ((ImageView) this.itemView.findViewById(R.id.b0l));

    /* renamed from: b */
    public List<IMContact> mo81881b() {
        BaseMemberListViewModel<?> baseMemberListViewModel = this.f83202k;
        if (!(baseMemberListViewModel instanceof RelationMemberListViewModel)) {
            baseMemberListViewModel = null;
        }
        RelationMemberListViewModel relationMemberListViewModel = (RelationMemberListViewModel) baseMemberListViewModel;
        if (relationMemberListViewModel != null) {
            return relationMemberListViewModel.f83133f;
        }
        return null;
    }

    /* renamed from: a */
    public BaseMemberListViewModel<?> mo81880a() {
        Context context = this.f83203l.getContext();
        if (context != null) {
            C0043i iVar = (C0043i) context;
            C7584c a = C7575l.m23595a(RelationMemberListViewModel.class);
            return (BaseMemberListViewModel) C7546e.m23569a(new RelationMemberViewHolder$mViewModel$$inlined$activityViewModel$1(a, iVar, a)).getValue();
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    public RelationMemberViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a21, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…on_select, parent, false)");
        super(inflate);
        this.f83203l = viewGroup;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m103240a(com.p280ss.android.ugc.aweme.p313im.service.model.IMUser r11, com.p280ss.android.ugc.aweme.p313im.service.model.IMUser r12) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel<?> r0 = r10.f83202k
            r1 = 0
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.mo82589n()
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel<?> r2 = r10.f83202k
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = r2.mo82592q()
            if (r2 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r6 = r2
            goto L_0x001b
        L_0x0018:
            java.lang.String r2 = ""
            goto L_0x0016
        L_0x001b:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r2 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C31741e.f83051a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r10.f83183f
            java.lang.String r4 = "mNameTv"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.mo82533a(r3, r11, r6)
            android.widget.ImageView r2 = r10.f83182e
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31889bb.m103601a(r2, r11)
            r2 = 8
            if (r0 != 0) goto L_0x00e9
            int r0 = r11.getType()
            r3 = 2
            r4 = 5
            if (r0 != r3) goto L_0x0057
            android.view.View r0 = r10.f83201a
            java.lang.String r3 = "mTitleLayout"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r10.f83205n
            java.lang.String r3 = "mFriendIcon"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r0.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r10.f83204m
            r3 = 2131823848(0x7f110ce8, float:1.9280507E38)
            r0.setText(r3)
            goto L_0x00a3
        L_0x0057:
            int r0 = r11.getType()
            if (r0 != r4) goto L_0x0099
            android.view.View r0 = r10.f83201a
            java.lang.String r3 = "mTitleLayout"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r10.f83205n
            java.lang.String r3 = "mFriendIcon"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r0.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r10.f83204m
            java.lang.String r3 = "mTitleTv"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            android.view.View r3 = r10.itemView
            java.lang.String r5 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            android.content.Context r3 = r3.getContext()
            java.lang.String r5 = "itemView.context"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131823667(0x7f110c33, float:1.928014E38)
            java.lang.String r3 = r3.getString(r5)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
            goto L_0x00a3
        L_0x0099:
            android.view.View r0 = r10.f83201a
            java.lang.String r3 = "mTitleLayout"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r0.setVisibility(r2)
        L_0x00a3:
            int r0 = r11.getType()
            if (r0 == r4) goto L_0x00b0
            int r0 = r11.getType()
            r3 = 6
            if (r0 != r3) goto L_0x00c3
        L_0x00b0:
            if (r12 == 0) goto L_0x00ce
            java.lang.String r12 = r12.getInitialLetter()
            java.lang.String r0 = r11.getInitialLetter()
            boolean r12 = kotlin.jvm.internal.C7573i.m23585a(r12, r0)
            r12 = r12 ^ 1
            if (r12 == 0) goto L_0x00c3
            goto L_0x00ce
        L_0x00c3:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f83185h
            java.lang.String r12 = "mIndexTv"
            kotlin.jvm.internal.C7573i.m23582a(r11, r12)
            r11.setVisibility(r2)
            return
        L_0x00ce:
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
        L_0x00e9:
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
            android.view.View r11 = r10.f83201a
            java.lang.String r12 = "mTitleLayout"
            kotlin.jvm.internal.C7573i.m23582a(r11, r12)
            r11.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f83185h
            java.lang.String r12 = "mIndexTv"
            kotlin.jvm.internal.C7573i.m23582a(r11, r12)
            r11.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.RelationMemberViewHolder.m103240a(com.ss.android.ugc.aweme.im.service.model.IMUser, com.ss.android.ugc.aweme.im.service.model.IMUser):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r1 == null) goto L_0x0035;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo81879a(com.p280ss.android.ugc.aweme.p313im.service.model.IMContact r5, com.p280ss.android.ugc.aweme.p313im.service.model.IMContact r6, int r7) {
        /*
            r4 = this;
            java.lang.String r7 = "item"
            kotlin.jvm.internal.C7573i.m23587b(r5, r7)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r7 = r4.f83181d
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r7 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r7
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r5.getDisplayAvatar()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r7, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r4.f83183f
            java.lang.String r0 = "mNameTv"
            kotlin.jvm.internal.C7573i.m23582a(r7, r0)
            java.lang.String r0 = r5.getDisplayName()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.setText(r0)
            com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel<?> r7 = r4.f83202k
            r0 = 0
            if (r7 == 0) goto L_0x002a
            boolean r7 = r7.mo82588m()
            goto L_0x002b
        L_0x002a:
            r7 = 0
        L_0x002b:
            com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel<?> r1 = r4.f83202k
            if (r1 == 0) goto L_0x0035
            java.util.List r1 = r1.mo82590o()
            if (r1 != 0) goto L_0x0039
        L_0x0035:
            java.util.List r1 = kotlin.collections.C7525m.m23461a()
        L_0x0039:
            java.util.List r2 = r4.mo81881b()
            if (r7 == 0) goto L_0x0051
            r4.mo82610e()
            android.widget.ImageView r7 = r4.f83186i
            java.lang.String r3 = "mCheckBox"
            kotlin.jvm.internal.C7573i.m23582a(r7, r3)
            boolean r1 = r1.contains(r5)
            r7.setSelected(r1)
            goto L_0x005e
        L_0x0051:
            r4.mo82611f()
            android.widget.ImageView r7 = r4.f83186i
            java.lang.String r1 = "mCheckBox"
            kotlin.jvm.internal.C7573i.m23582a(r7, r1)
            r7.setSelected(r0)
        L_0x005e:
            r7 = 1
            if (r2 == 0) goto L_0x009d
            boolean r1 = r2.contains(r5)
            if (r1 != r7) goto L_0x009d
            android.view.View r1 = r4.f83180c
            java.lang.String r2 = "mContentView"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r1.setEnabled(r0)
            android.widget.ImageView r1 = r4.f83186i
            java.lang.String r2 = "mCheckBox"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r1.setSelected(r7)
            android.widget.ImageView r7 = r4.f83186i
            java.lang.String r1 = "mCheckBox"
            kotlin.jvm.internal.C7573i.m23582a(r7, r1)
            r7.setEnabled(r0)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r7 = r4.f83181d
            java.lang.String r1 = "mAvatarIv"
            kotlin.jvm.internal.C7573i.m23582a(r7, r1)
            r7.setEnabled(r0)
            android.view.View r7 = r4.f83180c
            java.lang.String r0 = "mContentView"
            kotlin.jvm.internal.C7573i.m23582a(r7, r0)
            r0 = 1051595899(0x3eae147b, float:0.34)
            r7.setAlpha(r0)
            goto L_0x00c7
        L_0x009d:
            android.view.View r0 = r4.f83180c
            java.lang.String r1 = "mContentView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r0.setEnabled(r7)
            android.widget.ImageView r0 = r4.f83186i
            java.lang.String r1 = "mCheckBox"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r0.setEnabled(r7)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r4.f83181d
            java.lang.String r1 = "mAvatarIv"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r0.setEnabled(r7)
            android.view.View r7 = r4.f83180c
            java.lang.String r0 = "mContentView"
            kotlin.jvm.internal.C7573i.m23582a(r7, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.setAlpha(r0)
        L_0x00c7:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r4.f83184g
            java.lang.String r0 = "mDetailTv"
            kotlin.jvm.internal.C7573i.m23582a(r7, r0)
            r0 = 8
            r7.setVisibility(r0)
            if (r6 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.im.service.model.IMUser r6 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21661a(r6)
            goto L_0x00db
        L_0x00da:
            r6 = 0
        L_0x00db:
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21661a(r5)
            java.lang.String r7 = "this"
            kotlin.jvm.internal.C7573i.m23582a(r5, r7)
            r4.m103240a(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.RelationMemberViewHolder.mo81879a(com.ss.android.ugc.aweme.im.service.model.IMContact, com.ss.android.ugc.aweme.im.service.model.IMContact, int):void");
    }
}
