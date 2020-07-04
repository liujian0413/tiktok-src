package com.p280ss.android.ugc.aweme.p313im.sdk.group;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.C31072c;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.ListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel.GroupListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.SearchHeadListView;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.BaseSelectListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseSelectFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31916o;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment */
public final class GroupListFragment extends BaseSelectFragment<GroupListViewModel> implements C6905a {

    /* renamed from: e */
    public final String f81856e = "GroupListFragment";

    /* renamed from: f */
    public SharePackage f81857f;

    /* renamed from: g */
    public BaseContent f81858g;

    /* renamed from: h */
    public int f81859h = 10;

    /* renamed from: i */
    public C6892b<Boolean> f81860i;

    /* renamed from: o */
    private int f81861o = -1;

    /* renamed from: p */
    private LinkedHashSet<IMContact> f81862p;

    /* renamed from: q */
    private HashMap f81863q;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment$a */
    static final class C31211a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupListFragment f81864a;

        C31211a(GroupListFragment groupListFragment) {
            this.f81864a = groupListFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C31858ad.m103437a("create_group_from_list_click", null);
            FragmentActivity activity = this.f81864a.getActivity();
            if (activity != null) {
                activity.setResult(224);
            }
            FragmentActivity activity2 = this.f81864a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment$b */
    static final class C31212b extends Lambda implements C7562b<GroupListViewModel, GroupListViewModel> {

        /* renamed from: a */
        final /* synthetic */ GroupListFragment f81865a;

        C31212b(GroupListFragment groupListFragment) {
            this.f81865a = groupListFragment;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public GroupListViewModel invoke(GroupListViewModel groupListViewModel) {
            C7573i.m23587b(groupListViewModel, "$receiver");
            groupListViewModel.f83142j = this.f81865a.f83159m;
            groupListViewModel.f82046f = this.f81865a.f81857f;
            groupListViewModel.f82047g = this.f81865a.f81858g;
            groupListViewModel.f82048h = this.f81865a.f81859h;
            return groupListViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment$c */
    static final class C31213c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupListFragment f81866a;

        C31213c(GroupListFragment groupListFragment) {
            this.f81866a = groupListFragment;
            super(0);
        }

        /* renamed from: a */
        private void m101716a() {
            this.f81866a.mo82600v();
        }

        public final /* synthetic */ Object invoke() {
            m101716a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment$d */
    static final class C31214d extends Lambda implements C7563m<List<IMContact>, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupListFragment f81867a;

        C31214d(GroupListFragment groupListFragment) {
            this.f81867a = groupListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m101717a((List) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101717a(List<IMContact> list, boolean z) {
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
            this.f81867a.mo82601w();
            BaseSelectListAdapter s = this.f81867a.mo82597s();
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
                this.f81867a.mo81768o();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment$e */
    static final class C31215e extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupListFragment f81868a;

        C31215e(GroupListFragment groupListFragment) {
            this.f81868a = groupListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m101718a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101718a(Throwable th) {
            this.f81868a.mo82601w();
            this.f81868a.mo81768o();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment$f */
    static final class C31216f extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupListFragment f81869a;

        C31216f(GroupListFragment groupListFragment) {
            this.f81869a = groupListFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m101719a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101719a() {
            this.f81869a.mo82597s().ag_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment$g */
    static final class C31217g extends Lambda implements C7563m<List<IMContact>, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupListFragment f81870a;

        C31217g(GroupListFragment groupListFragment) {
            this.f81870a = groupListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m101720a((List) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101720a(List<IMContact> list, boolean z) {
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
            BaseSelectListAdapter s = this.f81870a.mo82597s();
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment$h */
    static final class C31218h extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupListFragment f81871a;

        C31218h(GroupListFragment groupListFragment) {
            this.f81871a = groupListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m101721a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101721a(Throwable th) {
            this.f81871a.mo82597s().ah_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment$i */
    static final class C31219i<T> implements C6892b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ GroupListFragment f81872a;

        C31219i(GroupListFragment groupListFragment) {
            this.f81872a = groupListFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void run(Boolean bool) {
            if (this.f81872a.f83159m == 3) {
                C6892b<Boolean> bVar = this.f81872a.f81860i;
                if (bVar != null) {
                    bVar.run(bool);
                }
                ((GroupListViewModel) this.f81872a.mo82599u()).mo82594s();
                C7573i.m23582a((Object) bool, "onShare");
                if (bool.booleanValue()) {
                    BaseContent baseContent = ((GroupListViewModel) this.f81872a.mo82599u()).f82047g;
                    if (baseContent != null) {
                        ChatRoomActivity.m21588a(this.f81872a.getContext());
                        if (baseContent != null) {
                            return;
                        }
                    }
                    Boolean.valueOf(C7195s.m22438a().mo18682a("aweme://main"));
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo81749a(boolean z) {
        return R.drawable.cmw;
    }

    /* renamed from: a */
    public final View mo81750a(int i) {
        if (this.f81863q == null) {
            this.f81863q = new HashMap();
        }
        View view = (View) this.f81863q.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f81863q.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo81757g() {
        if (this.f81863q != null) {
            this.f81863q.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo81757g();
    }

    public final void bd_() {
        ((GroupListViewModel) mo82599u()).mo81885b();
    }

    /* renamed from: e */
    public final boolean mo81755e() {
        if (this.f83159m == 3 && this.f81861o == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String mo81756f() {
        String string = C6399b.m19921a().getResources().getString(R.string.bp3);
        C7573i.m23582a((Object) string, "AppContextManager.getApp…R.string.im_select_group)");
        return string;
    }

    /* renamed from: k */
    public final boolean mo81760k() {
        if (this.f83159m == 2 || (this.f83159m == 3 && this.f81861o == 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final void mo81768o() {
        super.mo81768o();
        mo82597s().ai_();
        mo82597s().mo66502g();
    }

    /* renamed from: i */
    public final void mo81758i() {
        super.mo81758i();
        SearchHeadListView searchHeadListView = (SearchHeadListView) mo81750a((int) R.id.d0z);
        C7573i.m23582a((Object) searchHeadListView, "search_head_list");
        searchHeadListView.setVisibility(8);
        mo82597s().mo66504a((C6905a) this);
    }

    /* renamed from: l */
    public final void mo81761l() {
        super.mo81761l();
        if (this.f83159m == 2) {
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) mo81750a((int) R.id.djz);
            C7573i.m23582a((Object) imTextTitleBar, "title_bar");
            View rightView = imTextTitleBar.getRightView();
            C7573i.m23582a((Object) rightView, "title_bar.rightView");
            rightView.setVisibility(8);
        }
    }

    /* renamed from: n */
    public final View mo81767n() {
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        C10806a c = new C10806a(getContext()).mo25990b((int) R.string.bkh).mo25993c(R.string.bk8);
        C31916o.m103676a(c);
        if (this.f83159m == 2) {
            c.mo25986a(ButtonStyle.SOLID, R.string.bjg, new C31211a(this));
        }
        dmtDefaultView.setStatus(c.f29135a);
        return dmtDefaultView;
    }

    /* renamed from: a */
    public final void mo81752a() {
        super.mo81752a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f81861o = arguments.getInt("key_select_mode", -1);
            Serializable serializable = arguments.getSerializable("key_selected_contact");
            if (!(serializable instanceof LinkedHashSet)) {
                serializable = null;
            }
            this.f81862p = (LinkedHashSet) serializable;
            this.f81859h = arguments.getInt("key_number_limit", 10);
            Parcelable parcelable = arguments.getParcelable("share_package");
            if (!(parcelable instanceof SharePackage)) {
                parcelable = null;
            }
            this.f81857f = (SharePackage) parcelable;
            Serializable serializable2 = arguments.getSerializable("share_content");
            if (!(serializable2 instanceof BaseContent)) {
                serializable2 = null;
            }
            this.f81858g = (BaseContent) serializable2;
            BaseContent.wrapForward(this.f81858g, arguments.getLong("forward_origin_msgid"));
            if (arguments != null) {
                return;
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: d */
    public final void mo81754d() {
        super.mo81754d();
        if (this.f81861o != -1) {
            ((GroupListViewModel) mo82599u()).mo82585a(this.f81861o);
        }
        LinkedHashSet<IMContact> linkedHashSet = this.f81862p;
        if (linkedHashSet != null) {
            ((GroupListViewModel) mo82599u()).mo81884a(C7525m.m23516h((Iterable<? extends T>) linkedHashSet));
        }
        ListViewModel.m101340a((GroupListViewModel) mo82599u(), this, C31072c.m101359a(new C31213c(this), new C31214d(this), new C31215e(this)), C31072c.m101359a(new C31216f(this), new C31217g(this), new C31218h(this)), null, 8, null);
    }

    /* renamed from: m */
    public final void mo81762m() {
        super.mo81762m();
        if (((GroupListViewModel) mo82599u()).mo82588m() && this.f83159m == 3) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_selected_contact", new LinkedHashSet(((GroupListViewModel) mo82599u()).mo82590o()));
            intent.putExtras(bundle);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(224, intent);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    /* renamed from: b */
    public final void mo81766b(List<? extends IMContact> list) {
        super.mo81766b(list);
        SearchHeadListView searchHeadListView = (SearchHeadListView) mo81750a((int) R.id.d0z);
        C7573i.m23582a((Object) searchHeadListView, "search_head_list");
        searchHeadListView.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public GroupListViewModel mo81751a(C0043i iVar) {
        C0063u uVar;
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7562b bVar = new C31212b(this);
        Class<GroupListViewModel> cls = GroupListViewModel.class;
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
        return (GroupListViewModel) uVar;
    }

    /* renamed from: a */
    public final void mo81753a(List<? extends IMContact> list) {
        if (((GroupListViewModel) mo82599u()).mo82588m()) {
            super.mo81753a(list);
        } else if (list != null) {
            for (IMContact a : list) {
                C7052b.m21947a(getContext(), a, ((GroupListViewModel) mo82599u()).f82046f, ((GroupListViewModel) mo82599u()).f82047g, (C6892b<Boolean>) new C31219i<Boolean>(this));
            }
        }
    }
}
