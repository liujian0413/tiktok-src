package com.p280ss.android.ugc.aweme.p313im.sdk.group;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel.GroupMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseSelectFragment;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.AtMemberFragment */
public final class AtMemberFragment extends BaseSelectFragment<GroupMemberListViewModel> {

    /* renamed from: e */
    public String f81844e;

    /* renamed from: f */
    private HashMap f81845f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.AtMemberFragment$a */
    static final class C31207a extends Lambda implements C7562b<GroupMemberListViewModel, GroupMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ AtMemberFragment f81846a;

        C31207a(AtMemberFragment atMemberFragment) {
            this.f81846a = atMemberFragment;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public GroupMemberListViewModel invoke(GroupMemberListViewModel groupMemberListViewModel) {
            C7573i.m23587b(groupMemberListViewModel, "$receiver");
            groupMemberListViewModel.f83142j = this.f81846a.f83159m;
            groupMemberListViewModel.f82089b = this.f81846a.f81844e;
            return groupMemberListViewModel;
        }
    }

    /* renamed from: a */
    public final int mo81749a(boolean z) {
        return R.drawable.b5m;
    }

    /* renamed from: a */
    public final View mo81750a(int i) {
        if (this.f81845f == null) {
            this.f81845f = new HashMap();
        }
        View view = (View) this.f81845f.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f81845f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public final boolean mo81755e() {
        return false;
    }

    /* renamed from: g */
    public final void mo81757g() {
        if (this.f81845f != null) {
            this.f81845f.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo81757g();
    }

    /* renamed from: d */
    public final void mo81754d() {
        super.mo81754d();
        ((GroupMemberListViewModel) mo82599u()).mo82585a(2);
    }

    /* renamed from: f */
    public final String mo81756f() {
        String string = C6399b.m19921a().getResources().getString(R.string.bqv);
        C7573i.m23582a((Object) string, "AppContextManager.getApp…im_title_at_group_member)");
        return string;
    }

    /* renamed from: a */
    public final void mo81752a() {
        super.mo81752a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f81844e = arguments.getString("session_id");
            if (arguments != null) {
                return;
            }
        }
        AtMemberFragment atMemberFragment = this;
        FragmentActivity activity = atMemberFragment.getActivity();
        if (activity != null) {
            activity.setResult(223);
        }
        FragmentActivity activity2 = atMemberFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public GroupMemberListViewModel mo81751a(C0043i iVar) {
        C0063u uVar;
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7562b aVar = new C31207a(this);
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

    /* renamed from: a */
    public final void mo81753a(List<? extends IMContact> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Intent intent = new Intent();
            String str = "key_at_member";
            Object f = C7525m.m23511f(list);
            if (f != null) {
                intent.putExtra(str, (IMUser) f);
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.setResult(223, intent);
                }
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
    }
}
