package com.p280ss.android.ugc.aweme.p313im.sdk.group.viewholder;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.proto.GroupRole;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel.GroupMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupMemberSelectViewHolder */
public final class GroupMemberSelectViewHolder extends BaseSelectViewHolder<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82034a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupMemberSelectViewHolder.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;"))};

    /* renamed from: j */
    private final C7541d f82035j;

    /* renamed from: a */
    private final GroupMemberListViewModel m101943a() {
        return (GroupMemberListViewModel) this.f82035j.getValue();
    }

    public GroupMemberSelectViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wd, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…er_select, parent, false)");
        super(inflate);
        Context context = viewGroup.getContext();
        if (context != null) {
            C0043i iVar = (C0043i) context;
            C7584c a = C7575l.m23595a(GroupMemberListViewModel.class);
            this.f82035j = C7546e.m23569a(new C31299x33052376(a, iVar, a));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    /* renamed from: a */
    private final void m101945a(IMUser iMUser) {
        List list;
        GroupMemberListViewModel a = m101943a();
        if (a != null && a.f83142j == 5) {
            GroupMemberListViewModel a2 = m101943a();
            if (!(a2 == null || a2.f82089b == null)) {
                C31243a a3 = C31244a.m101818a();
                GroupMemberListViewModel a4 = m101943a();
                if (a4 == null) {
                    C7573i.m23580a();
                }
                String str = a4.f82089b;
                if (str == null) {
                    C7573i.m23580a();
                }
                List b = a3.mo81799b(str);
                if (b != null) {
                    Iterable iterable = b;
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        if (C7573i.m23585a((Object) iMUser, (Object) ((IMMember) next).getUser())) {
                            arrayList.add(next);
                        }
                    }
                    list = (List) arrayList;
                } else {
                    list = null;
                }
                if (list != null && list.size() == 1) {
                    Member member = ((IMMember) list.get(0)).getMember();
                    if (member != null && member.getRole() == GroupRole.OWNER.getValue()) {
                        this.f83180c.setTag(R.id.l, Integer.valueOf(GroupRole.OWNER.getValue()));
                        View view = this.f83180c;
                        C7573i.m23582a((Object) view, "mContentView");
                        view.setAlpha(0.34f);
                    }
                }
                this.f83180c.setTag(R.id.l, null);
                View view2 = this.f83180c;
                C7573i.m23582a((Object) view2, "mContentView");
                view2.setAlpha(1.0f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r4 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 == null) goto L_0x000c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101946a(com.p280ss.android.ugc.aweme.p313im.service.model.IMUser r13, com.p280ss.android.ugc.aweme.p313im.service.model.IMUser r14) {
        /*
            r12 = this;
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r0 = r12.m101943a()
            if (r0 == 0) goto L_0x000c
            java.util.List r0 = r0.mo82590o()
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r0 = kotlin.collections.C7525m.m23461a()
        L_0x0010:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r1 = r12.m101943a()
            r2 = 0
            if (r1 == 0) goto L_0x001c
            boolean r1 = r1.mo82588m()
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r3 = r12.m101943a()
            if (r3 == 0) goto L_0x0028
            boolean r3 = r3.mo82589n()
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r4 = r12.m101943a()
            if (r4 == 0) goto L_0x0038
            java.lang.String r4 = r4.mo82592q()
            if (r4 != 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r8 = r4
            goto L_0x003b
        L_0x0038:
            java.lang.String r4 = ""
            goto L_0x0036
        L_0x003b:
            r12.m101945a(r13)
            if (r1 == 0) goto L_0x0052
            r12.mo82610e()
            android.widget.ImageView r1 = r12.f83186i
            java.lang.String r4 = "mCheckBox"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            boolean r0 = r0.contains(r13)
            r1.setSelected(r0)
            goto L_0x005f
        L_0x0052:
            r12.mo82611f()
            android.widget.ImageView r0 = r12.f83186i
            java.lang.String r1 = "mCheckBox"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r0.setSelected(r2)
        L_0x005f:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r0 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C31741e.f83051a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r12.f83183f
            java.lang.String r4 = "mNameTv"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.mo82533a(r1, r13, r8)
            android.widget.ImageView r0 = r12.f83182e
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31889bb.m103601a(r0, r13)
            r0 = 8
            if (r3 != 0) goto L_0x00af
            if (r14 == 0) goto L_0x0094
            java.lang.String r14 = r14.getInitialLetter()
            java.lang.String r1 = r13.getInitialLetter()
            boolean r14 = kotlin.jvm.internal.C7573i.m23585a(r14, r1)
            r14 = r14 ^ 1
            if (r14 == 0) goto L_0x0089
            goto L_0x0094
        L_0x0089:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r12.f83185h
            java.lang.String r14 = "mIndexTv"
            kotlin.jvm.internal.C7573i.m23582a(r13, r14)
            r13.setVisibility(r0)
            return
        L_0x0094:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r12.f83185h
            java.lang.String r0 = "mIndexTv"
            kotlin.jvm.internal.C7573i.m23582a(r14, r0)
            r14.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r12.f83185h
            java.lang.String r0 = "mIndexTv"
            kotlin.jvm.internal.C7573i.m23582a(r14, r0)
            java.lang.String r13 = r13.getInitialLetter()
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r14.setText(r13)
            return
        L_0x00af:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r5 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C31741e.f83051a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r12.f83184g
            java.lang.String r1 = "mDetailTv"
            kotlin.jvm.internal.C7573i.m23582a(r14, r1)
            r6 = r14
            android.widget.TextView r6 = (android.widget.TextView) r6
            r9 = 0
            r10 = 8
            r11 = 0
            r7 = r13
            r5.m103078a(r6, r7, r8, false)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r12.f83185h
            java.lang.String r14 = "mIndexTv"
            kotlin.jvm.internal.C7573i.m23582a(r13, r14)
            r13.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.group.viewholder.GroupMemberSelectViewHolder.m101946a(com.ss.android.ugc.aweme.im.service.model.IMUser, com.ss.android.ugc.aweme.im.service.model.IMUser):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo81879a(IMContact iMContact, IMContact iMContact2, int i) {
        IMUser iMUser;
        C7573i.m23587b(iMContact, "item");
        C23323e.m76524b(this.f83181d, iMContact.getDisplayAvatar());
        DmtTextView dmtTextView = this.f83183f;
        C7573i.m23582a((Object) dmtTextView, "mNameTv");
        dmtTextView.setText(iMContact.getDisplayName());
        DmtTextView dmtTextView2 = this.f83184g;
        C7573i.m23582a((Object) dmtTextView2, "mDetailTv");
        dmtTextView2.setVisibility(8);
        IMUser a = C6961d.m21661a(iMContact);
        if (iMContact2 != null) {
            iMUser = C6961d.m21661a(iMContact2);
        } else {
            iMUser = null;
        }
        C7573i.m23582a((Object) a, "user");
        m101946a(a, iMUser);
    }
}
