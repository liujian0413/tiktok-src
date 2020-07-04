package com.p280ss.android.ugc.aweme.p313im.sdk.group;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.proto.GroupRole;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.C31072c;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.ListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31257b;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel.GroupMemberFansViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.BaseSelectListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseSelectFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberFansFragment */
public final class GroupMemberFansFragment extends BaseSelectFragment<GroupMemberFansViewModel> implements C6905a {

    /* renamed from: f */
    public static final C31227a f81889f = new C31227a(null);

    /* renamed from: e */
    public String f81890e;

    /* renamed from: g */
    private HashMap f81891g;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberFansFragment$a */
    public static final class C31227a {
        private C31227a() {
        }

        public /* synthetic */ C31227a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m101766a(String str) {
            boolean z;
            String str2;
            boolean z2;
            boolean z3;
            CharSequence charSequence = str;
            boolean z4 = true;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            CharSequence b = C7074e.m22069b();
            IMMember iMMember = null;
            if (b != null) {
                str2 = b.toString();
            } else {
                str2 = null;
            }
            CharSequence charSequence2 = str2;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return false;
            }
            List b2 = C31244a.m101818a().mo81799b(str);
            if (b2 != null) {
                Iterable iterable = b2;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    IMMember iMMember2 = (IMMember) next;
                    long parseLong = Long.parseLong(str2);
                    Member member = iMMember2.getMember();
                    if (member == null || parseLong != member.getUid()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        arrayList.add(next);
                    }
                }
                List list = (List) arrayList;
                if (list.size() != 1) {
                    z4 = false;
                }
                if (!z4) {
                    list = null;
                }
                if (list != null) {
                    iMMember = (IMMember) list.get(0);
                }
            }
            if (iMMember != null) {
                Member member2 = iMMember.getMember();
                if (member2 != null && member2.getRole() == GroupRole.OWNER.getValue()) {
                    try {
                        IESSettingsProxy a = C30199h.m98861a();
                        C7573i.m23582a((Object) a, "SettingsReader.get()");
                        Boolean enableGroupMemberByFollowers = a.getEnableGroupMemberByFollowers();
                        C7573i.m23582a((Object) enableGroupMemberByFollowers, "SettingsReader.get().enableGroupMemberByFollowers");
                        return enableGroupMemberByFollowers.booleanValue();
                    } catch (NullValueException unused) {
                        return false;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberFansFragment$b */
    static final class C31228b extends Lambda implements C7562b<GroupMemberFansViewModel, GroupMemberFansViewModel> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansFragment f81892a;

        C31228b(GroupMemberFansFragment groupMemberFansFragment) {
            this.f81892a = groupMemberFansFragment;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public GroupMemberFansViewModel invoke(GroupMemberFansViewModel groupMemberFansViewModel) {
            C7573i.m23587b(groupMemberFansViewModel, "$receiver");
            groupMemberFansViewModel.f83142j = this.f81892a.f83159m;
            groupMemberFansViewModel.f82054c = this.f81892a.f81890e;
            return groupMemberFansViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberFansFragment$c */
    static final class C31229c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansFragment f81893a;

        C31229c(GroupMemberFansFragment groupMemberFansFragment) {
            this.f81893a = groupMemberFansFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            FragmentActivity activity = this.f81893a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberFansFragment$d */
    static final class C31230d implements OnClickListener {

        /* renamed from: a */
        public static final C31230d f81894a = new C31230d();

        C31230d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberFansFragment$e */
    static final class C31231e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansFragment f81895a;

        C31231e(GroupMemberFansFragment groupMemberFansFragment) {
            this.f81895a = groupMemberFansFragment;
            super(0);
        }

        /* renamed from: a */
        private void m101768a() {
            this.f81895a.mo82600v();
        }

        public final /* synthetic */ Object invoke() {
            m101768a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberFansFragment$f */
    static final class C31232f extends Lambda implements C7563m<List<IMContact>, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansFragment f81896a;

        C31232f(GroupMemberFansFragment groupMemberFansFragment) {
            this.f81896a = groupMemberFansFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m101769a((List) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101769a(List<IMContact> list, boolean z) {
            Object obj;
            boolean z2;
            BaseSelectListAdapter baseSelectListAdapter;
            StringBuilder sb = new StringBuilder("refresh onSuccess: ");
            BaseSelectListAdapter baseSelectListAdapter2 = null;
            if (list != null) {
                obj = Integer.valueOf(list.size());
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", ");
            sb.append(z);
            this.f81896a.mo82601w();
            BaseSelectListAdapter s = this.f81896a.mo82597s();
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                baseSelectListAdapter = s;
            } else {
                baseSelectListAdapter = null;
            }
            if (baseSelectListAdapter != null) {
                baseSelectListAdapter.mo58045a(list);
                baseSelectListAdapter.mo66516d(true);
                if (z) {
                    baseSelectListAdapter2 = baseSelectListAdapter;
                }
                if (baseSelectListAdapter2 != null) {
                    baseSelectListAdapter2.ai_();
                } else {
                    baseSelectListAdapter.ah_();
                }
            } else {
                s.mo66516d(false);
                this.f81896a.mo81768o();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberFansFragment$g */
    static final class C31233g extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansFragment f81897a;

        C31233g(GroupMemberFansFragment groupMemberFansFragment) {
            this.f81897a = groupMemberFansFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m101770a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101770a(Throwable th) {
            this.f81897a.mo82601w();
            this.f81897a.mo81768o();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberFansFragment$h */
    static final class C31234h extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansFragment f81898a;

        C31234h(GroupMemberFansFragment groupMemberFansFragment) {
            this.f81898a = groupMemberFansFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m101771a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101771a() {
            this.f81898a.mo82597s().ag_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberFansFragment$i */
    static final class C31235i extends Lambda implements C7563m<List<IMContact>, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansFragment f81899a;

        C31235i(GroupMemberFansFragment groupMemberFansFragment) {
            this.f81899a = groupMemberFansFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m101772a((List) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101772a(List<IMContact> list, boolean z) {
            Object obj;
            boolean z2;
            BaseSelectListAdapter baseSelectListAdapter;
            StringBuilder sb = new StringBuilder("loadMore: ");
            BaseSelectListAdapter baseSelectListAdapter2 = null;
            if (list != null) {
                obj = Integer.valueOf(list.size());
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", ");
            sb.append(z);
            BaseSelectListAdapter s = this.f81899a.mo82597s();
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                baseSelectListAdapter = s;
            } else {
                baseSelectListAdapter = null;
            }
            if (baseSelectListAdapter != null) {
                baseSelectListAdapter.mo61577b(list);
            }
            if (z) {
                baseSelectListAdapter2 = s;
            }
            if (baseSelectListAdapter2 != null) {
                baseSelectListAdapter2.ai_();
            } else {
                s.ah_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberFansFragment$j */
    static final class C31236j extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansFragment f81900a;

        C31236j(GroupMemberFansFragment groupMemberFansFragment) {
            this.f81900a = groupMemberFansFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m101773a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101773a(Throwable th) {
            this.f81900a.mo82597s().ah_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberFansFragment$k */
    static final class C31237k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f81901a;

        /* renamed from: b */
        final /* synthetic */ GroupMemberFansFragment f81902b;

        C31237k(List list, GroupMemberFansFragment groupMemberFansFragment) {
            this.f81901a = list;
            this.f81902b = groupMemberFansFragment;
        }

        public final void run() {
            C31858ad.m103406a();
            C31858ad.m103421a(this.f81902b.f81890e, this.f81901a.size());
            GroupMemberFansFragment groupMemberFansFragment = this.f81902b;
            List list = this.f81901a;
            C7573i.m23582a((Object) list, "this");
            groupMemberFansFragment.mo81780d(list);
        }
    }

    /* renamed from: a */
    public final int mo81749a(boolean z) {
        return R.drawable.cmw;
    }

    /* renamed from: a */
    public final View mo81750a(int i) {
        if (this.f81891g == null) {
            this.f81891g = new HashMap();
        }
        View view = (View) this.f81891g.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f81891g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo81757g() {
        if (this.f81891g != null) {
            this.f81891g.clear();
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

    public final void bd_() {
        ((GroupMemberFansViewModel) mo82599u()).mo81893l();
    }

    /* renamed from: i */
    public final void mo81758i() {
        mo82597s().mo66504a((C6905a) this);
        super.mo81758i();
    }

    /* renamed from: a */
    public final void mo81752a() {
        String str;
        super.mo81752a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("session_id");
        } else {
            str = null;
        }
        this.f81890e = str;
    }

    /* renamed from: f */
    public final String mo81756f() {
        String string = C6399b.m19921a().getString(R.string.a1e);
        C7573i.m23582a((Object) string, "AppContextManager.getApp…ing.chat_group_fans_cell)");
        return string;
    }

    /* renamed from: o */
    public final void mo81768o() {
        super.mo81768o();
        mo82597s().ai_();
        mo82597s().mo66502g();
    }

    /* renamed from: q */
    public final void mo81781q() {
        if (!be_()) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: m */
    public final void mo81762m() {
        List list = (List) ((GroupMemberFansViewModel) mo82599u()).f83148p.getValue();
        if (list != null) {
            C31257b.m101862a(getContext(), this.f81890e, new C31237k(list, this));
        }
    }

    public final boolean be_() {
        boolean z;
        Collection collection = (Collection) ((GroupMemberFansViewModel) mo82599u()).f83148p.getValue();
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        new C10741a(getContext()).mo25657b((int) R.string.a1i).mo25650a((int) R.string.a1j, (OnClickListener) new C31229c(this)).mo25658b((int) R.string.w_, (OnClickListener) C31230d.f81894a).mo25656a().mo25638b();
        return true;
    }

    /* renamed from: d */
    public final void mo81754d() {
        super.mo81754d();
        ((GroupMemberFansViewModel) mo82599u()).mo82585a(3);
        ListViewModel.m101340a((GroupMemberFansViewModel) mo82599u(), this, C31072c.m101359a(new C31231e(this), new C31232f(this), new C31233g(this)), C31072c.m101359a(new C31234h(this), new C31235i(this), new C31236j(this)), null, 8, null);
    }

    /* renamed from: l */
    public final void mo81761l() {
        super.mo81761l();
        ((ImTextTitleBar) mo81750a((int) R.id.djz)).setTitle(mo81756f());
        ((ImTextTitleBar) mo81750a((int) R.id.djz)).setLeftIcon(mo81749a(true));
        int p = ((GroupMemberFansViewModel) mo82599u()).mo82591p();
        if (p > 0) {
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) mo81750a((int) R.id.djz);
            StringBuilder sb = new StringBuilder();
            Context context = getContext();
            if (context == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) context, "context!!");
            sb.append(context.getResources().getString(R.string.a1f));
            sb.append('(');
            sb.append(p);
            sb.append(')');
            imTextTitleBar.setRightText(sb.toString());
            return;
        }
        ((ImTextTitleBar) mo81750a((int) R.id.djz)).setRightText((int) R.string.a1f);
    }

    /* renamed from: a_ */
    public final void mo81778a_(List<? extends IMContact> list) {
        if (this.f83157k != null) {
            mo82597s().mo82500m();
        }
    }

    /* renamed from: b */
    public final void mo81766b(List<? extends IMContact> list) {
        View view = this.f83157k;
        if (view != null) {
            mo82597s().mo82499c(view);
        }
    }

    /* renamed from: e */
    private static List<String> m101749e(List<? extends IMContact> list) {
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
    public GroupMemberFansViewModel mo81751a(C0043i iVar) {
        C0063u uVar;
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7562b bVar = new C31228b(this);
        Class<GroupMemberFansViewModel> cls = GroupMemberFansViewModel.class;
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
        return (GroupMemberFansViewModel) uVar;
    }

    /* renamed from: d */
    public final void mo81780d(List<? extends IMContact> list) {
        boolean z;
        List e = m101749e(list);
        if (e != null) {
            Collection collection = e;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                e = null;
            }
            if (e != null) {
                C31244a.m101818a();
                String str = this.f81890e;
                if (str == null) {
                    C7573i.m23580a();
                }
                C31243a.m101802c(str, e);
                C10761a.m31383a(getContext(), (int) R.string.a1a).mo25750a();
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }
}
