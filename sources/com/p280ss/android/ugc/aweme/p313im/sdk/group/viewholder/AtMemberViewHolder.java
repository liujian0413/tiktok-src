package com.p280ss.android.ugc.aweme.p313im.sdk.group.viewholder;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel.GroupMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.BaseSelectViewHolder;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewholder.AtMemberViewHolder */
public final class AtMemberViewHolder extends BaseSelectViewHolder<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82029a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AtMemberViewHolder.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;"))};

    /* renamed from: j */
    private final C7541d f82030j;

    /* renamed from: a */
    private final GroupMemberListViewModel m101935a() {
        return (GroupMemberListViewModel) this.f82030j.getValue();
    }

    public AtMemberViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wd, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…er_select, parent, false)");
        super(inflate);
        Context context = viewGroup.getContext();
        if (context != null) {
            C0043i iVar = (C0043i) context;
            C7584c a = C7575l.m23595a(GroupMemberListViewModel.class);
            this.f82030j = C7546e.m23569a(new AtMemberViewHolder$$special$$inlined$activityViewModel$1(a, iVar, a));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2 == null) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101937a(com.p280ss.android.ugc.aweme.p313im.service.model.IMUser r11, com.p280ss.android.ugc.aweme.p313im.service.model.IMUser r12) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r0 = r10.m101935a()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.mo82589n()
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r2 = r10.m101935a()
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
            if (r0 != 0) goto L_0x006f
            if (r12 == 0) goto L_0x0054
            java.lang.String r12 = r12.getInitialLetter()
            java.lang.String r0 = r11.getInitialLetter()
            boolean r12 = kotlin.jvm.internal.C7573i.m23585a(r12, r0)
            r12 = r12 ^ 1
            if (r12 == 0) goto L_0x0049
            goto L_0x0054
        L_0x0049:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f83185h
            java.lang.String r12 = "mIndexTv"
            kotlin.jvm.internal.C7573i.m23582a(r11, r12)
            r11.setVisibility(r2)
            return
        L_0x0054:
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
        L_0x006f:
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
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f83185h
            java.lang.String r12 = "mIndexTv"
            kotlin.jvm.internal.C7573i.m23582a(r11, r12)
            r11.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.group.viewholder.AtMemberViewHolder.m101937a(com.ss.android.ugc.aweme.im.service.model.IMUser, com.ss.android.ugc.aweme.im.service.model.IMUser):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0036, code lost:
        if (r5 == null) goto L_0x0038;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo81879a(com.p280ss.android.ugc.aweme.p313im.service.model.IMContact r3, com.p280ss.android.ugc.aweme.p313im.service.model.IMContact r4, int r5) {
        /*
            r2 = this;
            java.lang.String r5 = "item"
            kotlin.jvm.internal.C7573i.m23587b(r3, r5)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r5 = r2.f83181d
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r5
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r3.getDisplayAvatar()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r5, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r2.f83183f
            java.lang.String r0 = "mNameTv"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            java.lang.String r0 = r3.getDisplayName()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.setText(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r2.f83184g
            java.lang.String r0 = "mDetailTv"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            r0 = 8
            r5.setVisibility(r0)
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r5 = r2.m101935a()
            if (r5 == 0) goto L_0x0038
            java.util.List r5 = r5.mo82590o()
            if (r5 != 0) goto L_0x003c
        L_0x0038:
            java.util.List r5 = kotlin.collections.C7525m.m23461a()
        L_0x003c:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r0 = r2.m101935a()
            r1 = 0
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.mo82588m()
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            if (r0 == 0) goto L_0x005d
            r2.mo82610e()
            android.widget.ImageView r0 = r2.f83186i
            java.lang.String r1 = "mCheckBox"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r5 = r5.contains(r3)
            r0.setSelected(r5)
            goto L_0x006a
        L_0x005d:
            r2.mo82611f()
            android.widget.ImageView r5 = r2.f83186i
            java.lang.String r0 = "mCheckBox"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            r5.setSelected(r1)
        L_0x006a:
            com.ss.android.ugc.aweme.im.service.model.IMUser r3 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21661a(r3)
            if (r4 == 0) goto L_0x0075
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21661a(r4)
            goto L_0x0076
        L_0x0075:
            r4 = 0
        L_0x0076:
            java.lang.String r5 = "user"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            r2.m101937a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.group.viewholder.AtMemberViewHolder.mo81879a(com.ss.android.ugc.aweme.im.service.model.IMContact, com.ss.android.ugc.aweme.im.service.model.IMContact, int):void");
    }
}
