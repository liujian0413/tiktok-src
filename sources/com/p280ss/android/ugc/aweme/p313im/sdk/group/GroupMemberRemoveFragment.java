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
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31257b;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel.GroupMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseSelectFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberRemoveFragment */
public final class GroupMemberRemoveFragment extends BaseSelectFragment<GroupMemberListViewModel> {

    /* renamed from: e */
    public String f81903e;

    /* renamed from: f */
    private HashMap f81904f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberRemoveFragment$a */
    static final class C31238a extends Lambda implements C7562b<GroupMemberListViewModel, GroupMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberRemoveFragment f81905a;

        C31238a(GroupMemberRemoveFragment groupMemberRemoveFragment) {
            this.f81905a = groupMemberRemoveFragment;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public GroupMemberListViewModel invoke(GroupMemberListViewModel groupMemberListViewModel) {
            C7573i.m23587b(groupMemberListViewModel, "$receiver");
            groupMemberListViewModel.f83142j = this.f81905a.f83159m;
            groupMemberListViewModel.f82089b = this.f81905a.f81903e;
            return groupMemberListViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberRemoveFragment$b */
    public static final class C31239b implements C11195b<List<? extends Member>> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberRemoveFragment f81906a;

        C31239b(GroupMemberRemoveFragment groupMemberRemoveFragment) {
            this.f81906a = groupMemberRemoveFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18089a(List<? extends Member> list) {
            this.f81906a.mo82601w();
            FragmentActivity activity = this.f81906a.getActivity();
            if (activity != null) {
                activity.setResult(221);
            }
            FragmentActivity activity2 = this.f81906a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            this.f81906a.mo82601w();
            if (this.f81906a.getContext() != null) {
                Context context = this.f81906a.getContext();
                if (context == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) context, "context!!");
                C31257b.m101861a(context, gVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberRemoveFragment$c */
    static final class C31240c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupMemberRemoveFragment f81907a;

        /* renamed from: b */
        final /* synthetic */ List f81908b;

        C31240c(GroupMemberRemoveFragment groupMemberRemoveFragment, List list) {
            this.f81907a = groupMemberRemoveFragment;
            this.f81908b = list;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C31257b.m101862a(this.f81907a.getContext(), this.f81907a.f81903e, new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C31240c f81909a;

                {
                    this.f81909a = r1;
                }

                public final void run() {
                    this.f81909a.f81907a.mo81785d(this.f81909a.f81908b);
                }
            });
        }
    }

    /* renamed from: a */
    public final int mo81749a(boolean z) {
        return R.drawable.cmw;
    }

    /* renamed from: a */
    public final View mo81750a(int i) {
        if (this.f81904f == null) {
            this.f81904f = new HashMap();
        }
        View view = (View) this.f81904f.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f81904f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo81757g() {
        if (this.f81904f != null) {
            this.f81904f.clear();
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

    /* renamed from: d */
    public final void mo81754d() {
        super.mo81754d();
        ((GroupMemberListViewModel) mo82599u()).mo82585a(3);
    }

    /* renamed from: f */
    public final String mo81756f() {
        String string = C6399b.m19921a().getResources().getString(R.string.bqw);
        C7573i.m23582a((Object) string, "AppContextManager.getApp…itle_delete_group_member)");
        return string;
    }

    /* renamed from: m */
    public final void mo81762m() {
        List list = (List) ((GroupMemberListViewModel) mo82599u()).f83148p.getValue();
        if (list != null) {
            C7573i.m23582a((Object) list, "this");
            m101775e(list);
        }
    }

    /* renamed from: a */
    public final void mo81752a() {
        super.mo81752a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f83159m = arguments.getInt("key_member_list_type");
            this.f81903e = arguments.getString("session_id");
            if (arguments != null) {
                return;
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: e */
    private final void m101775e(List<? extends IMContact> list) {
        if (getContext() != null) {
            new C10741a(getContext()).mo25657b((int) R.string.bly).mo25665e(R.style.m2).mo25658b((int) R.string.bhe, (OnClickListener) null).mo25650a((int) R.string.bi8, (OnClickListener) new C31240c(this, list)).mo25656a().mo25637a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public GroupMemberListViewModel mo81751a(C0043i iVar) {
        C0063u uVar;
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7562b aVar = new C31238a(this);
        Class<GroupMemberListViewModel> cls = GroupMemberListViewModel.class;
        if (iVar instanceof Fragment) {
            C0065w a = C0069x.m158a((Fragment) iVar, (C0067b) mo82598t());
            String name = cls.getName();
            C7573i.m23582a((Object) name, "viewModelClass.java.name");
            uVar = a.mo148a(name, cls);
            C7573i.m23582a((Object) uVar, "this");
            aVar.invoke(uVar);
        } else if (iVar instanceof FragmentActivity) {
            C0065w a2 = C0069x.m160a((FragmentActivity) iVar, (C0067b) mo82598t());
            String name2 = cls.getName();
            C7573i.m23582a((Object) name2, "viewModelClass.java.name");
            uVar = a2.mo148a(name2, cls);
            C7573i.m23582a((Object) uVar, "this");
            aVar.invoke(uVar);
        } else {
            throw new IllegalAccessException("owner must be either FragmentActivity or Fragment");
        }
        C7573i.m23582a((Object) uVar, "when (lifecycleOwner) {\n…)\n            }\n        }");
        return (GroupMemberListViewModel) uVar;
    }

    /* renamed from: f */
    private final void m101776f(List<? extends IMContact> list) {
        boolean z;
        String str = ",";
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            IMContact iMContact = (IMContact) it.next();
            if (iMContact instanceof IMUser) {
                IMUser iMUser = (IMUser) iMContact;
                CharSequence uid = iMUser.getUid();
                if (uid == null || uid.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    sb.append(iMUser.getUid());
                    sb.append(str);
                }
            }
        }
        String sb2 = sb.toString();
        CharSequence charSequence = sb2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int length = sb2.length() - 1;
            if (sb2 != null) {
                String substring = sb2.substring(0, length);
                C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                C31858ad.m103406a();
                C31858ad.m103490j(this.f81903e, substring);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: d */
    public final void mo81785d(List<? extends IMContact> list) {
        mo82600v();
        m101776f(list);
        C31243a a = C31244a.m101818a();
        String str = this.f81903e;
        Iterable<IMContact> iterable = list;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (IMContact iMContact : iterable) {
            if (iMContact != null) {
                arrayList.add((IMUser) iMContact);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
        a.mo81795a(str, (List) arrayList, (C11195b<List<Member>>) new C31239b<List<Member>>(this));
    }
}
