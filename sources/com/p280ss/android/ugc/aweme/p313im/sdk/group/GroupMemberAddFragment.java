package com.p280ss.android.ugc.aweme.p313im.sdk.group;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.p584a.p585a.C11196c;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupMemberFansFragment.C31227a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.C31269b;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupCheckMsg;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31257b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.RelationSelectActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.model.RelationMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseSelectFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment */
public final class GroupMemberAddFragment extends BaseSelectFragment<RelationMemberListViewModel> {

    /* renamed from: g */
    public static final C31220a f81873g = new C31220a(null);

    /* renamed from: e */
    public String f81874e;

    /* renamed from: f */
    public List<? extends IMContact> f81875f;

    /* renamed from: h */
    private HashMap f81876h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment$a */
    public static final class C31220a {
        private C31220a() {
        }

        public /* synthetic */ C31220a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment$b */
    static final class C31221b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupMemberAddFragment f81877a;

        C31221b(GroupMemberAddFragment groupMemberAddFragment) {
            this.f81877a = groupMemberAddFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Bundle bundle = new Bundle();
            bundle.putInt("key_member_list_type", 7);
            bundle.putString("session_id", this.f81877a.f81874e);
            RelationSelectActivity.m21880a((Activity) this.f81877a.getActivity(), bundle, 225);
            C31858ad.m103406a();
            C31858ad.m103497m(this.f81877a.f81874e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment$c */
    public static final class C31222c implements C11196c<List<? extends Member>> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberAddFragment f81878a;

        /* renamed from: b */
        final /* synthetic */ List f81879b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18089a(List<? extends Member> list) {
            this.f81878a.mo82601w();
            this.f81878a.mo81773p();
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            this.f81878a.mo82601w();
            if (this.f81878a.getContext() != null) {
                Context context = this.f81878a.getContext();
                if (context == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) context, "context!!");
                C31257b.m101861a(context, gVar);
            }
        }

        C31222c(GroupMemberAddFragment groupMemberAddFragment, List list) {
            this.f81878a = groupMemberAddFragment;
            this.f81879b = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18090a(List<? extends Member> list, C11438g gVar) {
            String str;
            this.f81878a.mo82601w();
            if (gVar != null) {
                str = gVar.f30960e;
            } else {
                str = null;
            }
            GroupCheckMsg groupCheckMsg = (GroupCheckMsg) C31913m.m103667a(str, GroupCheckMsg.class);
            if (groupCheckMsg != null) {
                Integer statusCode = groupCheckMsg.getStatusCode();
                if (statusCode == null || statusCode.intValue() != 0) {
                    this.f81878a.mo81770a(this.f81879b, groupCheckMsg);
                    this.f81878a.mo81772d(list);
                    return;
                }
            }
            this.f81878a.mo81773p();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment$d */
    static final class C31223d extends Lambda implements C7562b<RelationMemberListViewModel, RelationMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberAddFragment f81880a;

        C31223d(GroupMemberAddFragment groupMemberAddFragment) {
            this.f81880a = groupMemberAddFragment;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RelationMemberListViewModel invoke(RelationMemberListViewModel relationMemberListViewModel) {
            C7573i.m23587b(relationMemberListViewModel, "$receiver");
            relationMemberListViewModel.f83142j = this.f81880a.f83159m;
            relationMemberListViewModel.f83130c = this.f81880a.f81874e;
            List<? extends IMContact> list = this.f81880a.f81875f;
            if (list != null) {
                relationMemberListViewModel.mo82571a(list);
            }
            return relationMemberListViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment$e */
    static final class C31224e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f81881a;

        /* renamed from: b */
        final /* synthetic */ GroupMemberAddFragment f81882b;

        C31224e(List list, GroupMemberAddFragment groupMemberAddFragment) {
            this.f81881a = list;
            this.f81882b = groupMemberAddFragment;
        }

        public final void run() {
            C31858ad.m103406a();
            String str = this.f81882b.f81874e;
            Object value = ((RelationMemberListViewModel) this.f81882b.mo82599u()).f83148p.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            C31858ad.m103483h(str, String.valueOf(((List) value).size()));
            GroupMemberAddFragment groupMemberAddFragment = this.f81882b;
            List list = this.f81881a;
            C7573i.m23582a((Object) list, "this");
            groupMemberAddFragment.mo81771c(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment$f */
    static final class C31225f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupMemberAddFragment f81883a;

        /* renamed from: b */
        final /* synthetic */ List f81884b;

        /* renamed from: c */
        final /* synthetic */ String f81885c;

        /* renamed from: d */
        final /* synthetic */ boolean f81886d;

        C31225f(GroupMemberAddFragment groupMemberAddFragment, List list, String str, boolean z) {
            this.f81883a = groupMemberAddFragment;
            this.f81884b = list;
            this.f81885c = str;
            this.f81886d = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            boolean z;
            List e = GroupMemberAddFragment.m101726e(this.f81884b);
            CharSequence charSequence = this.f81883a.f81874e;
            boolean z2 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Collection collection = e;
                if (collection == null || collection.isEmpty()) {
                    z2 = true;
                }
                if (!z2) {
                    C31244a.m101818a();
                    String str = this.f81883a.f81874e;
                    if (str == null) {
                        C7573i.m23580a();
                    }
                    C31243a.m101802c(str, e);
                    C10761a.m31383a(this.f81883a.getContext(), (int) R.string.bkp).mo25750a();
                    String str2 = "add";
                    String str3 = this.f81885c;
                    Iterable<IMContact> iterable = this.f81884b;
                    Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (IMContact iMContact : iterable) {
                        if (iMContact != null) {
                            arrayList.add((IMUser) iMContact);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                        }
                    }
                    C31858ad.m103435a(str2, str3, (List) arrayList, "confirm");
                    if (this.f81886d) {
                        FragmentActivity activity = this.f81883a.getActivity();
                        if (activity != null) {
                            activity.setResult(220);
                        }
                    }
                    FragmentActivity activity2 = this.f81883a.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberAddFragment$g */
    static final class C31226g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f81887a;

        /* renamed from: b */
        final /* synthetic */ List f81888b;

        C31226g(String str, List list) {
            this.f81887a = str;
            this.f81888b = list;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str = "add";
            String str2 = this.f81887a;
            Iterable<IMContact> iterable = this.f81888b;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (IMContact iMContact : iterable) {
                if (iMContact != null) {
                    arrayList.add((IMUser) iMContact);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                }
            }
            C31858ad.m103435a(str, str2, (List) arrayList, "cancel");
        }
    }

    /* renamed from: a */
    public final int mo81749a(boolean z) {
        return R.drawable.cmw;
    }

    /* renamed from: a */
    public final View mo81750a(int i) {
        if (this.f81876h == null) {
            this.f81876h = new HashMap();
        }
        View view = (View) this.f81876h.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f81876h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo81757g() {
        if (this.f81876h != null) {
            this.f81876h.clear();
        }
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
        m101727x();
    }

    /* renamed from: d */
    public final void mo81754d() {
        super.mo81754d();
        ((RelationMemberListViewModel) mo82599u()).mo82585a(3);
    }

    /* renamed from: f */
    public final String mo81756f() {
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        String friendToFamiliarStr = a.mo18009f().getFriendToFamiliarStr(R.string.bqz, R.string.bqy);
        C7573i.m23582a((Object) friendToFamiliarStr, "AwemeImManager.instance(…e_select_follow_familiar)");
        return friendToFamiliarStr;
    }

    /* renamed from: p */
    public final void mo81773p() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(220);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* renamed from: x */
    private final void m101727x() {
        GroupMemberAddFragment groupMemberAddFragment;
        if (C31227a.m101766a(this.f81874e)) {
            groupMemberAddFragment = this;
        } else {
            groupMemberAddFragment = null;
        }
        GroupMemberAddFragment groupMemberAddFragment2 = groupMemberAddFragment;
        if (groupMemberAddFragment2 != null) {
            View inflate = View.inflate(groupMemberAddFragment2.getContext(), R.layout.v6, null);
            inflate.setOnClickListener(new C31221b(groupMemberAddFragment2));
            C7573i.m23582a((Object) inflate, "headerView");
            inflate.setBackground(C10774c.m31449e(groupMemberAddFragment2.getContext()));
            groupMemberAddFragment2.mo82595a(inflate);
        }
    }

    /* renamed from: m */
    public final void mo81762m() {
        List list = (List) ((RelationMemberListViewModel) mo82599u()).f83148p.getValue();
        if (list != null) {
            C31257b.m101862a(getContext(), this.f81874e, new C31224e(list, this));
        }
    }

    /* renamed from: a */
    public final void mo81752a() {
        super.mo81752a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f81874e = arguments.getString("session_id");
            Serializable serializable = arguments.getSerializable("key_unselected_contact");
            if (!(serializable instanceof List)) {
                serializable = null;
            }
            this.f81875f = (List) serializable;
            if (arguments != null) {
                return;
            }
        }
        GroupMemberAddFragment groupMemberAddFragment = this;
        FragmentActivity activity = groupMemberAddFragment.getActivity();
        if (activity != null) {
            activity.setResult(220);
        }
        FragmentActivity activity2 = groupMemberAddFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* renamed from: e */
    public static List<String> m101726e(List<? extends IMContact> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        List<String> arrayList = new ArrayList<>();
        for (IMContact iMContact : list) {
            if (iMContact instanceof IMUser) {
                String uid = ((IMUser) iMContact).getUid();
                C7573i.m23582a((Object) uid, "it.uid");
                arrayList.add(uid);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public RelationMemberListViewModel mo81751a(C0043i iVar) {
        C0063u uVar;
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7562b dVar = new C31223d(this);
        Class<RelationMemberListViewModel> cls = RelationMemberListViewModel.class;
        if (iVar instanceof Fragment) {
            C0065w a = C0069x.m158a((Fragment) iVar, (C0067b) mo82598t());
            String name = cls.getName();
            C7573i.m23582a((Object) name, "viewModelClass.java.name");
            uVar = a.mo148a(name, cls);
            C7573i.m23582a((Object) uVar, "this");
            dVar.invoke(uVar);
        } else if (iVar instanceof FragmentActivity) {
            C0065w a2 = C0069x.m160a((FragmentActivity) iVar, (C0067b) mo82598t());
            String name2 = cls.getName();
            C7573i.m23582a((Object) name2, "viewModelClass.java.name");
            uVar = a2.mo148a(name2, cls);
            C7573i.m23582a((Object) uVar, "this");
            dVar.invoke(uVar);
        } else {
            throw new IllegalAccessException("owner must be either FragmentActivity or Fragment");
        }
        C7573i.m23582a((Object) uVar, "when (lifecycleOwner) {\n…)\n            }\n        }");
        return (RelationMemberListViewModel) uVar;
    }

    /* renamed from: c */
    public final void mo81771c(List<? extends IMContact> list) {
        mo82600v();
        HashMap a = C31269b.m101892a(C7074e.m22072d(), 6, null);
        C31243a a2 = C31244a.m101818a();
        String str = this.f81874e;
        Iterable<IMContact> iterable = list;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (IMContact iMContact : iterable) {
            if (iMContact != null) {
                arrayList.add((IMUser) iMContact);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
        a2.mo81796a(str, (List) arrayList, a, new C31222c(this, list));
    }

    /* renamed from: d */
    public final void mo81772d(List<? extends Member> list) {
        List arrayList = new ArrayList();
        if (list != null) {
            for (Member uid : list) {
                IMUser b = C6961d.m21657a().mo18029b(String.valueOf(uid.getUid()));
                if (b != null) {
                    List<? extends IMContact> list2 = ((RelationMemberListViewModel) mo82599u()).f83133f;
                    if (list2 != null) {
                        ((ArrayList) list2).add(b);
                        arrayList.add(b);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.im.service.model.IMContact>");
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((RelationMemberListViewModel) mo82599u()).mo82572b(arrayList);
        }
    }

    /* renamed from: a */
    private final void m101724a(List<? extends IMContact> list, String str) {
        String string = getString(R.string.bls);
        C7573i.m23582a((Object) string, "getString(R.string.im_invitation_need_allow)");
        m101723a(string, list, false, str);
    }

    /* renamed from: a */
    public final void mo81770a(List<? extends IMContact> list, GroupCheckMsg groupCheckMsg) {
        boolean z;
        String str;
        Integer statusCode = groupCheckMsg.getStatusCode();
        if (statusCode != null && statusCode.intValue() == 7508) {
            m101724a(list, "member_agree");
            return;
        }
        Integer statusCode2 = groupCheckMsg.getStatusCode();
        if (statusCode2 == null || statusCode2.intValue() != 7511) {
            Integer statusCode3 = groupCheckMsg.getStatusCode();
            if (statusCode3 == null || statusCode3.intValue() != 7504) {
                return;
            }
        }
        List<IMUser> invalidMembers = groupCheckMsg.getInvalidMembers();
        if (invalidMembers != null) {
            StringBuilder sb = new StringBuilder();
            for (IMUser iMUser : invalidMembers) {
                IMUser b = C6961d.m21657a().mo18029b(iMUser.getUid());
                if (b != null) {
                    sb.append(b.getDisplayName());
                    sb.append("、");
                    if (b != null) {
                    }
                }
                sb.append(iMUser.getDisplayName());
                sb.append("、");
            }
            if (sb.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb.setLength(sb.length() - 1);
            }
            if (invalidMembers.size() > 1) {
                str = C6399b.m19921a().getResources().getString(R.string.bkn, new Object[]{sb.toString(), Integer.valueOf(invalidMembers.size())});
            } else {
                str = C6399b.m19921a().getResources().getString(R.string.bkm, new Object[]{sb.toString()});
            }
            List invalidMembers2 = groupCheckMsg.getInvalidMembers();
            if (invalidMembers2 == null) {
                C7573i.m23580a();
            }
            if (invalidMembers2.size() == list.size()) {
                C7573i.m23582a((Object) str, "showMsg");
                List invalidMembers3 = groupCheckMsg.getInvalidMembers();
                if (invalidMembers3 == null) {
                    C7573i.m23580a();
                }
                m101723a(str, invalidMembers3, false, "group_agree");
            } else {
                C7573i.m23582a((Object) str, "showMsg");
                List invalidMembers4 = groupCheckMsg.getInvalidMembers();
                if (invalidMembers4 == null) {
                    C7573i.m23580a();
                }
                m101723a(str, invalidMembers4, true, "group_agree");
            }
        }
    }

    /* renamed from: a */
    private final void m101723a(String str, List<? extends IMContact> list, boolean z, String str2) {
        if (getContext() != null) {
            Context context = getContext();
            if (context == null) {
                C7573i.m23580a();
            }
            new C10741a(context).mo25660b(str).mo25665e(R.style.m2).mo25650a((int) R.string.blt, (DialogInterface.OnClickListener) new C31225f(this, list, str2, z)).mo25658b((int) R.string.bhe, (DialogInterface.OnClickListener) new C31226g(str2, list)).mo25656a().mo25637a();
        }
    }
}
