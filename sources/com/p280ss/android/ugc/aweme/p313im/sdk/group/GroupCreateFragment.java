package com.p280ss.android.ugc.aweme.p313im.sdk.group;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6937c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupListActivity.C31210a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.C31269b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.model.RelationMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseSelectFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.ExtensionsKt$viewModel$2;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment */
public final class GroupCreateFragment extends BaseSelectFragment<RelationMemberListViewModel> {

    /* renamed from: e */
    private HashMap f81847e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment$a */
    static final class C31208a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupCreateFragment f81848a;

        C31208a(GroupCreateFragment groupCreateFragment) {
            this.f81848a = groupCreateFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C31858ad.m103437a("my_groups_click", null);
            FragmentActivity activity = this.f81848a.getActivity();
            if (activity != null) {
                C31210a aVar = GroupListActivity.f81852b;
                C7573i.m23582a((Object) activity, "this");
                aVar.mo81765a(activity, 2, 224);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment$b */
    static final class C31209b extends Lambda implements C7563m<Conversation, C11438g, C7581n> {

        /* renamed from: a */
        final /* synthetic */ List f81849a;

        /* renamed from: b */
        final /* synthetic */ GroupCreateFragment f81850b;

        C31209b(List list, GroupCreateFragment groupCreateFragment) {
            this.f81849a = list;
            this.f81850b = groupCreateFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m101694a((Conversation) obj, (C11438g) obj2);
            return C7581n.f20898a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a2, code lost:
            if (r8 == null) goto L_0x00a4;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m101694a(com.bytedance.p263im.core.model.Conversation r8, com.bytedance.p263im.core.model.C11438g r9) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment r0 = r7.f81850b
                r0.mo82601w()
                r0 = 0
                if (r8 == 0) goto L_0x0074
                com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a.m101818a()
                com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.m101796a(r8)
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                if (r9 == 0) goto L_0x0018
                java.lang.String r2 = r9.f30960e
                goto L_0x0019
            L_0x0018:
                r2 = r0
            L_0x0019:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.model.GroupCheckMsg> r3 = com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupCheckMsg.class
                java.lang.Object r2 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m.m103667a(r2, r3)
                com.ss.android.ugc.aweme.im.sdk.group.model.GroupCheckMsg r2 = (com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupCheckMsg) r2
                java.lang.Integer r3 = r2.getStatusCode()
                if (r3 != 0) goto L_0x0028
                goto L_0x002e
            L_0x0028:
                int r3 = r3.intValue()
                if (r3 == 0) goto L_0x0035
            L_0x002e:
                java.lang.String r3 = "key_group_create_error"
                java.io.Serializable r2 = (java.io.Serializable) r2
                r1.putSerializable(r3, r2)
            L_0x0035:
                java.lang.String r2 = "key_enter_from"
                r3 = 9
                r1.putInt(r2, r3)
                java.lang.String r2 = r8.getConversationId()
                java.lang.String r3 = "success"
                java.lang.String r4 = "corner_entry"
                com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103484h(r2, r3, r4)
                com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103406a()
                java.lang.String r2 = r8.getConversationId()
                java.lang.String r3 = ""
                java.lang.String r4 = "group"
                java.lang.String r5 = "create_group"
                java.lang.String r6 = ""
                com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103432a(r2, r3, r4, r5, r6)
                com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment r2 = r7.f81850b
                android.content.Context r2 = r2.getContext()
                java.lang.String r3 = r8.getConversationId()
                r4 = 3
                com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity.m21596a(r2, r3, r4, r1)
                com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment r1 = r7.f81850b
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                if (r1 == 0) goto L_0x0072
                r1.finish()
            L_0x0072:
                if (r8 != 0) goto L_0x00c0
            L_0x0074:
                if (r9 == 0) goto L_0x0079
                java.lang.String r8 = r9.f30960e
                goto L_0x007a
            L_0x0079:
                r8 = r0
            L_0x007a:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.model.GroupCheckMsg> r9 = com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupCheckMsg.class
                java.lang.Object r8 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m.m103667a(r8, r9)
                com.ss.android.ugc.aweme.im.sdk.group.model.GroupCheckMsg r8 = (com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupCheckMsg) r8
                r9 = 2131823687(0x7f110c47, float:1.928018E38)
                if (r8 == 0) goto L_0x00a4
                com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment r1 = r7.f81850b
                android.content.Context r1 = r1.getContext()
                java.lang.String r2 = r8.getStatusMsg()
                if (r2 != 0) goto L_0x009b
                android.content.Context r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
                java.lang.String r2 = r2.getString(r9)
            L_0x009b:
                com.bytedance.ies.dmt.ui.c.a r1 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31387a(r1, r2)
                r1.mo25750a()
                if (r8 != 0) goto L_0x00b9
            L_0x00a4:
                com.ss.android.ugc.aweme.im.sdk.group.GroupCreateFragment r8 = r7.f81850b
                android.content.Context r8 = r8.getContext()
                android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
                java.lang.String r9 = r1.getString(r9)
                com.bytedance.ies.dmt.ui.c.a r8 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31387a(r8, r9)
                r8.mo25750a()
            L_0x00b9:
                java.lang.String r8 = "failure"
                java.lang.String r9 = "corner_entry"
                com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103484h(r0, r8, r9)
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupCreateFragment.C31209b.m101694a(com.bytedance.im.core.model.Conversation, com.bytedance.im.core.model.g):void");
        }
    }

    /* renamed from: a */
    public final int mo81749a(boolean z) {
        return R.drawable.b5m;
    }

    /* renamed from: a */
    public final View mo81750a(int i) {
        if (this.f81847e == null) {
            this.f81847e = new HashMap();
        }
        View view = (View) this.f81847e.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f81847e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo81757g() {
        if (this.f81847e != null) {
            this.f81847e.clear();
        }
    }

    /* renamed from: j */
    public final int mo81759j() {
        return R.layout.qh;
    }

    /* renamed from: k */
    public final boolean mo81760k() {
        return false;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo81757g();
    }

    /* renamed from: i */
    public final void mo81758i() {
        super.mo81758i();
        m101682x();
    }

    /* renamed from: d */
    public final void mo81754d() {
        super.mo81754d();
        ((RelationMemberListViewModel) mo82599u()).mo82585a(3);
    }

    /* renamed from: x */
    private final void m101682x() {
        View inflate = View.inflate(getContext(), R.layout.wf, null);
        inflate.setOnClickListener(new C31208a(this));
        C7573i.m23582a((Object) inflate, "headerView");
        inflate.setBackground(C10774c.m31449e(getContext()));
        mo82595a(inflate);
    }

    /* renamed from: f */
    public final String mo81756f() {
        if (C6937c.f19628b.mo17967b()) {
            String string = C6399b.m19921a().getString(R.string.a13);
            C7573i.m23582a((Object) string, "AppContextManager.getApp…at_creat_multiple_choice)");
            return string;
        }
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        String friendToFamiliarStr = a.mo18009f().getFriendToFamiliarStr(R.string.bqz, R.string.bqy);
        C7573i.m23582a((Object) friendToFamiliarStr, "AwemeImManager.instance(…e_select_follow_familiar)");
        return friendToFamiliarStr;
    }

    /* renamed from: l */
    public final void mo81761l() {
        super.mo81761l();
        if (((RelationMemberListViewModel) mo82599u()).mo82588m() && ((RelationMemberListViewModel) mo82599u()).mo82591p() > 1) {
            ((ImTextTitleBar) mo81750a((int) R.id.djz)).setRightText(C6399b.m19921a().getResources().getString(R.string.big, new Object[]{Integer.valueOf(((RelationMemberListViewModel) mo82599u()).mo82591p())}));
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) mo81750a((int) R.id.djz);
            C7573i.m23582a((Object) imTextTitleBar, "title_bar");
            View rightView = imTextTitleBar.getRightView();
            C7573i.m23582a((Object) rightView, "title_bar.rightView");
            rightView.setEnabled(true);
            ImTextTitleBar imTextTitleBar2 = (ImTextTitleBar) mo81750a((int) R.id.djz);
            C7573i.m23582a((Object) imTextTitleBar2, "title_bar");
            DmtTextView rightTexView = imTextTitleBar2.getRightTexView();
            C7573i.m23582a((Object) rightTexView, "title_bar.rightTexView");
            TextPaint paint = rightTexView.getPaint();
            C7573i.m23582a((Object) paint, "title_bar.rightTexView.paint");
            paint.setFakeBoldText(true);
            ((ImTextTitleBar) mo81750a((int) R.id.djz)).setRightTextColor(C6399b.m19921a().getResources().getColor(R.color.a79));
        }
    }

    /* renamed from: m */
    public final void mo81762m() {
        super.mo81762m();
        List list = (List) ((RelationMemberListViewModel) mo82599u()).f83148p.getValue();
        if (list != null) {
            if (list.size() == 1) {
                ((RelationMemberListViewModel) mo82599u()).f83148p.getValue();
                if (list.get(0) instanceof IMUser) {
                    Object obj = list.get(0);
                    if (obj != null) {
                        IMUser iMUser = (IMUser) obj;
                        C31858ad.m103437a("create_private_chat_click", null);
                        C31858ad.m103406a();
                        String uid = iMUser.getUid();
                        C7573i.m23582a((Object) uid, "user.uid");
                        C31858ad.m103432a(C6425b.m20076a(Long.parseLong(uid)), iMUser.getUid(), "private", "click_contact", "contact_list");
                        ChatRoomActivity.m21589a(getContext(), iMUser, 4);
                        FragmentActivity activity = getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                    }
                }
            } else {
                mo82600v();
                C31858ad.m103505s("corner_entry");
                C31244a.m101818a();
                C7573i.m23582a((Object) list, "this");
                Iterable<IMContact> iterable = list;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (IMContact iMContact : iterable) {
                    if (iMContact != null) {
                        arrayList.add((IMUser) iMContact);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                    }
                }
                C31243a.m101798a((List) arrayList, (Map<String, String>) C31269b.m101891a(6), (C7563m<? super Conversation, ? super C11438g, C7581n>) new C31209b<Object,Object,C7581n>(list, this));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public RelationMemberListViewModel mo81751a(C0043i iVar) {
        C0063u uVar;
        C7573i.m23587b(iVar, "lifecycleOwner");
        Class<RelationMemberListViewModel> cls = RelationMemberListViewModel.class;
        C7562b bVar = ExtensionsKt$viewModel$2.INSTANCE;
        if (iVar instanceof Fragment) {
            C0065w a = C0069x.m158a((Fragment) iVar, (C0067b) mo82598t());
            String name = cls.getName();
            C7573i.m23582a((Object) name, "viewModelClass.java.name");
            uVar = a.mo148a(name, cls);
            C7573i.m23582a((Object) uVar, "this");
            bVar.invoke(uVar);
        } else if (iVar instanceof FragmentActivity) {
            C0065w a2 = C0069x.m160a((FragmentActivity) iVar, (C0067b) mo82598t());
            String name2 = cls.getName();
            C7573i.m23582a((Object) name2, "viewModelClass.java.name");
            uVar = a2.mo148a(name2, cls);
            C7573i.m23582a((Object) uVar, "this");
            bVar.invoke(uVar);
        } else {
            throw new IllegalAccessException("owner must be either FragmentActivity or Fragment");
        }
        C7573i.m23582a((Object) uVar, "when (lifecycleOwner) {\n…)\n            }\n        }");
        return (RelationMemberListViewModel) uVar;
    }
}
