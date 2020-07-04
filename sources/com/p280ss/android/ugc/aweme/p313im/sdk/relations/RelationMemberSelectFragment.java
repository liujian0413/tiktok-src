package com.p280ss.android.ugc.aweme.p313im.sdk.relations;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupListActivity.C31210a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.model.RelationMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseSelectFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.RelationMemberSelectFragment */
public final class RelationMemberSelectFragment extends BaseSelectFragment<RelationMemberListViewModel> {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f82770e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RelationMemberSelectFragment.class), "mLastSelectedMember", "getMLastSelectedMember()Ljava/util/List;"))};

    /* renamed from: f */
    public SharePackage f82771f;

    /* renamed from: g */
    public BaseContent f82772g;

    /* renamed from: h */
    public C6892b<Boolean> f82773h;

    /* renamed from: i */
    private int f82774i = -1;

    /* renamed from: o */
    private LinkedHashSet<IMContact> f82775o;

    /* renamed from: p */
    private boolean f82776p;

    /* renamed from: q */
    private final C7541d f82777q = C7546e.m23569a(C31604c.f82782a);

    /* renamed from: r */
    private C31743c f82778r;

    /* renamed from: s */
    private HashMap f82779s;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.RelationMemberSelectFragment$a */
    static final class C31602a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RelationMemberSelectFragment f82780a;

        C31602a(RelationMemberSelectFragment relationMemberSelectFragment) {
            this.f82780a = relationMemberSelectFragment;
        }

        public final void onClick(View view) {
            int i;
            boolean z;
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f82780a.getActivity();
            if (activity != null) {
                if (((RelationMemberListViewModel) this.f82780a.mo82599u()).mo82588m()) {
                    i = 3;
                } else {
                    i = 2;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("key_select_mode", i);
                bundle.putParcelable("share_package", this.f82780a.f82771f);
                bundle.putSerializable("share_content", this.f82780a.f82772g);
                Iterable o = ((RelationMemberListViewModel) this.f82780a.mo82599u()).mo82590o();
                Collection arrayList = new ArrayList();
                for (Object next : o) {
                    IMContact iMContact = (IMContact) next;
                    if (!(iMContact instanceof IMConversation) || ((IMConversation) iMContact).getConversationType() != C11203a.f30381b) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                List list = (List) arrayList;
                if (((RelationMemberListViewModel) this.f82780a.mo82599u()).mo82591p() > list.size()) {
                    bundle.putInt("key_number_limit", 10 - (((RelationMemberListViewModel) this.f82780a.mo82599u()).mo82591p() - list.size()));
                }
                bundle.putSerializable("key_selected_contact", new LinkedHashSet(list));
                C7573i.m23582a((Object) activity, "this");
                C31210a.m101696a(activity, 3, bundle, this.f82780a.f82773h, 224);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.RelationMemberSelectFragment$b */
    static final class C31603b extends Lambda implements C7562b<RelationMemberListViewModel, RelationMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ RelationMemberSelectFragment f82781a;

        C31603b(RelationMemberSelectFragment relationMemberSelectFragment) {
            this.f82781a = relationMemberSelectFragment;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RelationMemberListViewModel invoke(RelationMemberListViewModel relationMemberListViewModel) {
            C7573i.m23587b(relationMemberListViewModel, "$receiver");
            relationMemberListViewModel.f83142j = this.f82781a.f83159m;
            relationMemberListViewModel.f83131d = this.f82781a.f82771f;
            relationMemberListViewModel.f83132e = this.f82781a.f82772g;
            return relationMemberListViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.RelationMemberSelectFragment$c */
    static final class C31604c extends Lambda implements C7561a<List<IMContact>> {

        /* renamed from: a */
        public static final C31604c f82782a = new C31604c();

        C31604c() {
            super(0);
        }

        /* renamed from: a */
        private static List<IMContact> m102733a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102733a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.RelationMemberSelectFragment$d */
    static final class C31605d<T> implements C6892b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ RelationMemberSelectFragment f82783a;

        C31605d(RelationMemberSelectFragment relationMemberSelectFragment) {
            this.f82783a = relationMemberSelectFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void run(Boolean bool) {
            C6892b<Boolean> bVar = this.f82783a.f82773h;
            if (bVar != null) {
                bVar.run(bool);
            }
            ((RelationMemberListViewModel) this.f82783a.mo82599u()).mo82594s();
            C7573i.m23582a((Object) bool, "onShare");
            if (bool.booleanValue()) {
                FragmentActivity activity = this.f82783a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.RelationMemberSelectFragment$e */
    static final class C31606e<T> implements C6892b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ RelationMemberSelectFragment f82784a;

        C31606e(RelationMemberSelectFragment relationMemberSelectFragment) {
            this.f82784a = relationMemberSelectFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void run(Boolean bool) {
            C6892b<Boolean> bVar = this.f82784a.f82773h;
            if (bVar != null) {
                bVar.run(bool);
            }
            C7573i.m23582a((Object) bool, "it");
            if (bool.booleanValue()) {
                FragmentActivity activity = this.f82784a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    /* renamed from: x */
    private final List<IMContact> m102713x() {
        return (List) this.f82777q.getValue();
    }

    /* renamed from: a */
    public final View mo81750a(int i) {
        if (this.f82779s == null) {
            this.f82779s = new HashMap();
        }
        View view = (View) this.f82779s.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f82779s.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo81757g() {
        if (this.f82779s != null) {
            this.f82779s.clear();
        }
    }

    /* renamed from: j */
    public final int mo81759j() {
        return R.layout.qh;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo81757g();
    }

    /* renamed from: k */
    public final boolean mo81760k() {
        return C6399b.m19944t();
    }

    /* renamed from: r */
    public final boolean mo82381r() {
        return C6399b.m19944t();
    }

    /* renamed from: o */
    public final void mo81768o() {
        super.mo81768o();
        C31743c cVar = this.f82778r;
        if (cVar != null) {
            cVar.mo82534a();
        }
    }

    /* renamed from: q */
    public final void mo81781q() {
        super.mo81781q();
        C6892b<Boolean> bVar = this.f82773h;
        if (bVar != null) {
            bVar.run(Boolean.valueOf(false));
        }
    }

    /* renamed from: y */
    private final void m102714y() {
        View inflate = View.inflate(getContext(), R.layout.wf, null);
        inflate.setOnClickListener(new C31602a(this));
        C7573i.m23582a((Object) inflate, "headerView");
        inflate.setBackground(C10774c.m31449e(getContext()));
        mo82595a(inflate);
    }

    /* renamed from: d */
    public final void mo81754d() {
        super.mo81754d();
        if (this.f82774i != -1) {
            ((RelationMemberListViewModel) mo82599u()).mo82585a(this.f82774i);
        }
        LinkedHashSet<IMContact> linkedHashSet = this.f82775o;
        if (linkedHashSet != null) {
            ((RelationMemberListViewModel) mo82599u()).mo82572b(C7525m.m23516h((Iterable<? extends T>) linkedHashSet));
        }
    }

    /* renamed from: m */
    public final void mo81762m() {
        super.mo81762m();
        if (((RelationMemberListViewModel) mo82599u()).mo82588m()) {
            C7052b.m21950a(getContext(), ((RelationMemberListViewModel) mo82599u()).mo82590o(), ((RelationMemberListViewModel) mo82599u()).f83131d, ((RelationMemberListViewModel) mo82599u()).f83132e, (C6892b<Boolean>) new C31606e<Boolean>(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r0 == null) goto L_0x0062;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81752a() {
        /*
            r5 = this;
            super.mo81752a()
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = "key_select_mode"
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r5.f82774i = r1
            java.lang.String r1 = "key_selected_contact"
            java.io.Serializable r1 = r0.getSerializable(r1)
            boolean r2 = r1 instanceof java.util.LinkedHashSet
            r3 = 0
            if (r2 != 0) goto L_0x001e
            r1 = r3
        L_0x001e:
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            r5.f82775o = r1
            java.lang.String r1 = "key_share_create_group_select"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            r5.f82776p = r1
            java.lang.String r1 = "share_package"
            android.os.Parcelable r1 = r0.getParcelable(r1)
            boolean r2 = r1 instanceof com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage
            if (r2 != 0) goto L_0x0036
            r1 = r3
        L_0x0036:
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r1 = (com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage) r1
            r5.f82771f = r1
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r1 = r5.f82771f
            if (r1 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.im.sdk.utils.ad r2 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103406a()
            r4 = 1
            r2.mo82716a(r1, r3, r4)
        L_0x0046:
            java.lang.String r1 = "share_content"
            java.io.Serializable r1 = r0.getSerializable(r1)
            boolean r2 = r1 instanceof com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent
            if (r2 != 0) goto L_0x0051
            r1 = r3
        L_0x0051:
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent) r1
            r5.f82772g = r1
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r5.f82772g
            java.lang.String r2 = "forward_origin_msgid"
            long r2 = r0.getLong(r2)
            com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent.wrapForward(r1, r2)
            if (r0 != 0) goto L_0x006e
        L_0x0062:
            r0 = r5
            com.ss.android.ugc.aweme.im.sdk.relations.RelationMemberSelectFragment r0 = (com.p280ss.android.ugc.aweme.p313im.sdk.relations.RelationMemberSelectFragment) r0
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x006e
            r0.finish()
        L_0x006e:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19945u()
            if (r0 == 0) goto L_0x0077
            r0 = 3
            r5.f82774i = r0
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.relations.RelationMemberSelectFragment.mo81752a():void");
    }

    /* renamed from: f */
    public final String mo81756f() {
        String str;
        if (C6399b.m19945u()) {
            String string = C6399b.m19921a().getResources().getString(R.string.bpc);
            C7573i.m23582a((Object) string, "AppContextManager.getApp…ring(R.string.im_send_to)");
            return string;
        }
        if (!((RelationMemberListViewModel) mo82599u()).mo82588m()) {
            str = C6399b.m19921a().getResources().getString(R.string.bp8);
        } else {
            str = C6399b.m19921a().getResources().getString(R.string.bp6);
        }
        C7573i.m23582a((Object) str, "if (!mMemberListViewMode…tiple_relation)\n        }");
        return str;
    }

    /* renamed from: i */
    public final void mo81758i() {
        super.mo81758i();
        if (C6399b.m19945u()) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            Activity activity2 = activity;
            C6892b<Boolean> bVar = this.f82773h;
            RelativeLayout relativeLayout = (RelativeLayout) mo81750a((int) R.id.bgt);
            C7573i.m23582a((Object) relativeLayout, "layout_bottom_share");
            ViewGroup viewGroup = relativeLayout;
            RecyclerView recyclerView = (RecyclerView) mo81750a((int) R.id.bxs);
            C7573i.m23582a((Object) recyclerView, "member_list");
            C31743c cVar = new C31743c(activity2, bVar, viewGroup, recyclerView, this.f82771f, this.f82772g, this.f82775o, this.f82776p);
            this.f82778r = cVar;
            IndexView indexView = (IndexView) mo81750a((int) R.id.b0o);
            C7573i.m23582a((Object) indexView, "index_view");
            indexView.setVisibility(8);
        }
        m102714y();
    }

    /* renamed from: l */
    public final void mo81761l() {
        super.mo81761l();
        if (this.f82778r != null) {
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) mo81750a((int) R.id.djz);
            C7573i.m23582a((Object) imTextTitleBar, "title_bar");
            DmtTextView rightTexView = imTextTitleBar.getRightTexView();
            C7573i.m23582a((Object) rightTexView, "title_bar.rightTexView");
            rightTexView.setVisibility(8);
            return;
        }
        if (((RelationMemberListViewModel) mo82599u()).mo82588m()) {
            if (((RelationMemberListViewModel) mo82599u()).mo82591p() != 0) {
                ((ImTextTitleBar) mo81750a((int) R.id.djz)).setRightText(C6399b.m19921a().getResources().getString(R.string.bpa, new Object[]{Integer.valueOf(((RelationMemberListViewModel) mo82599u()).mo82591p())}));
                ImTextTitleBar imTextTitleBar2 = (ImTextTitleBar) mo81750a((int) R.id.djz);
                C7573i.m23582a((Object) imTextTitleBar2, "title_bar");
                View rightView = imTextTitleBar2.getRightView();
                C7573i.m23582a((Object) rightView, "title_bar.rightView");
                rightView.setEnabled(true);
                ImTextTitleBar imTextTitleBar3 = (ImTextTitleBar) mo81750a((int) R.id.djz);
                C7573i.m23582a((Object) imTextTitleBar3, "title_bar");
                DmtTextView rightTexView2 = imTextTitleBar3.getRightTexView();
                C7573i.m23582a((Object) rightTexView2, "title_bar.rightTexView");
                TextPaint paint = rightTexView2.getPaint();
                C7573i.m23582a((Object) paint, "title_bar.rightTexView.paint");
                paint.setFakeBoldText(true);
                ((ImTextTitleBar) mo81750a((int) R.id.djz)).setRightTextColor(C6399b.m19921a().getResources().getColor(R.color.a79));
            } else {
                ((ImTextTitleBar) mo81750a((int) R.id.djz)).setRightText(C6399b.m19921a().getResources().getString(R.string.bp9));
                ImTextTitleBar imTextTitleBar4 = (ImTextTitleBar) mo81750a((int) R.id.djz);
                C7573i.m23582a((Object) imTextTitleBar4, "title_bar");
                View rightView2 = imTextTitleBar4.getRightView();
                C7573i.m23582a((Object) rightView2, "title_bar.rightView");
                rightView2.setEnabled(false);
                ImTextTitleBar imTextTitleBar5 = (ImTextTitleBar) mo81750a((int) R.id.djz);
                C7573i.m23582a((Object) imTextTitleBar5, "title_bar");
                DmtTextView rightTexView3 = imTextTitleBar5.getRightTexView();
                C7573i.m23582a((Object) rightTexView3, "title_bar.rightTexView");
                TextPaint paint2 = rightTexView3.getPaint();
                C7573i.m23582a((Object) paint2, "title_bar.rightTexView.paint");
                paint2.setFakeBoldText(false);
                ((ImTextTitleBar) mo81750a((int) R.id.djz)).setRightTextColor(C6399b.m19921a().getResources().getColor(R.color.a7b));
            }
        }
    }

    /* renamed from: a */
    private final void m102710a(IMContact iMContact) {
        SharePackage sharePackage = this.f82771f;
        if (sharePackage != null) {
            C31858ad.m103406a().mo82716a(sharePackage, iMContact, false);
        }
    }

    /* renamed from: a_ */
    public final void mo81778a_(List<? extends IMContact> list) {
        boolean z;
        super.mo81778a_(list);
        C31743c cVar = this.f82778r;
        if (cVar != null) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                cVar = null;
            }
            if (cVar != null) {
                cVar.mo82537b();
            }
        }
    }

    /* renamed from: b */
    public final void mo81766b(List<? extends IMContact> list) {
        boolean z;
        super.mo81766b(list);
        C31743c cVar = this.f82778r;
        if (cVar != null) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                cVar = null;
            }
            if (cVar != null) {
                cVar.mo82537b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public RelationMemberListViewModel mo81751a(C0043i iVar) {
        C0063u uVar;
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7562b bVar = new C31603b(this);
        Class<RelationMemberListViewModel> cls = RelationMemberListViewModel.class;
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

    /* renamed from: d */
    private final void m102712d(List<? extends IMContact> list) {
        List arrayList = new ArrayList();
        Collection collection = list;
        arrayList.addAll(collection);
        Iterable iterable = arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable) {
            if (!m102713x().contains((IMContact) next)) {
                arrayList2.add(next);
            }
        }
        for (IMContact a : (List) arrayList2) {
            m102710a(a);
        }
        m102713x().clear();
        m102713x().addAll(collection);
    }

    /* renamed from: a */
    public final void mo81753a(List<? extends IMContact> list) {
        if (list != null) {
            m102712d(list);
        }
        if (((RelationMemberListViewModel) mo82599u()).mo82588m()) {
            super.mo81753a(list);
        } else if (list != null) {
            for (IMContact iMContact : list) {
                C7052b.m21947a(getContext(), iMContact, ((RelationMemberListViewModel) mo82599u()).f83131d, ((RelationMemberListViewModel) mo82599u()).f83132e, (C6892b<Boolean>) new C31605d<Boolean>(this));
                BaseContent baseContent = ((RelationMemberListViewModel) mo82599u()).f83132e;
                if (baseContent != null) {
                    String a = C31863ai.m103528a(baseContent.generateSharePackage().f20181g);
                    if (!TextUtils.isEmpty(a)) {
                        if (iMContact instanceof IMUser) {
                            IMUser iMUser = (IMUser) iMContact;
                            String uid = iMUser.getUid();
                            C7573i.m23582a((Object) uid, "it.uid");
                            String a2 = C6425b.m20076a(Long.parseLong(uid));
                            C31858ad.m103406a();
                            C31858ad.m103430a(a, a2, iMUser.getUid(), baseContent);
                        } else if (iMContact instanceof IMConversation) {
                            C31858ad.m103406a();
                            C31858ad.m103430a(a, ((IMConversation) iMContact).getConversationId(), "", baseContent);
                        }
                    }
                }
            }
        }
        C31743c cVar = this.f82778r;
        if (cVar != null) {
            cVar.mo82535a(new LinkedHashSet<>(list));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 224 && intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("key_selected_contact");
            if (serializableExtra == null) {
                return;
            }
            if (serializableExtra != null) {
                ((RelationMemberListViewModel) mo82599u()).mo82573c(C7525m.m23516h((Iterable<? extends T>) (LinkedHashSet) serializableExtra));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> /* = java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> */");
            }
        }
    }
}
