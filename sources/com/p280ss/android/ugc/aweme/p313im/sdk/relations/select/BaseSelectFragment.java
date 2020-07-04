package com.p280ss.android.ugc.aweme.p313im.sdk.relations.select;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1280l;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.C31774e;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.FloatingBarItemDecoration;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.IndexView;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.IndexView.C31601a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.SearchHeadListView;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.BaseSelectListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31864aj;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment */
public abstract class BaseSelectFragment<VM extends BaseMemberListViewModel<?>> extends AmeBaseFragment implements C31797d {

    /* renamed from: j */
    static final /* synthetic */ C7595j[] f83150j = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BaseSelectFragment.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BaseSelectFragment.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;"))};

    /* renamed from: n */
    public static final C31780a f83151n = new C31780a(null);

    /* renamed from: e */
    private View f83152e;

    /* renamed from: f */
    private final C31774e f83153f = new C31774e();

    /* renamed from: g */
    private final C7541d f83154g = C7546e.m23569a(new C31790k(this));

    /* renamed from: h */
    private final C31795b f83155h = new C31795b();

    /* renamed from: i */
    private final C7541d f83156i = C7546e.m23569a(new C31792m(this));

    /* renamed from: k */
    public View f83157k;

    /* renamed from: l */
    public FloatingBarItemDecoration f83158l;

    /* renamed from: m */
    public int f83159m;

    /* renamed from: o */
    private final C31791l f83160o = new C31791l(this);

    /* renamed from: p */
    private HashMap f83161p;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$a */
    public static final class C31780a {
        private C31780a() {
        }

        public /* synthetic */ C31780a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$b */
    static final class C31781b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseSelectFragment f83162a;

        C31781b(BaseSelectFragment baseSelectFragment) {
            this.f83162a = baseSelectFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6956a a = C6956a.m21632a();
            C7573i.m23582a((Object) a, "AwemeImManager.instance()");
            a.mo18009f().enterAddFriendsActivity(this.f83162a.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$c */
    static final class C31782c<T> implements C0053p<List<? extends IMContact>> {

        /* renamed from: a */
        final /* synthetic */ BaseSelectFragment f83163a;

        C31782c(BaseSelectFragment baseSelectFragment) {
            this.f83163a = baseSelectFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(List<? extends IMContact> list) {
            this.f83163a.mo81766b(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$d */
    static final class C31783d<T> implements C0053p<List<? extends IMContact>> {

        /* renamed from: a */
        final /* synthetic */ BaseSelectFragment f83164a;

        C31783d(BaseSelectFragment baseSelectFragment) {
            this.f83164a = baseSelectFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(List<? extends IMContact> list) {
            this.f83164a.mo81753a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$e */
    static final class C31784e<T> implements C0053p<List<? extends IMContact>> {

        /* renamed from: a */
        final /* synthetic */ BaseSelectFragment f83165a;

        C31784e(BaseSelectFragment baseSelectFragment) {
            this.f83165a = baseSelectFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(List<? extends IMContact> list) {
            this.f83165a.mo81778a_(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$f */
    static final class C31785f<T> implements C0053p<Pair<? extends List<? extends String>, ? extends List<? extends Integer>>> {

        /* renamed from: a */
        final /* synthetic */ BaseSelectFragment f83166a;

        C31785f(BaseSelectFragment baseSelectFragment) {
            this.f83166a = baseSelectFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Pair<? extends List<String>, ? extends List<Integer>> pair) {
            boolean z;
            if (pair != null) {
                Collection collection = (Collection) pair.getFirst();
                boolean z2 = true;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Collection collection2 = (Collection) pair.getSecond();
                    if (collection2 != null && !collection2.isEmpty()) {
                        z2 = false;
                    }
                    if (!z2) {
                        ((IndexView) this.f83166a.mo81750a((int) R.id.b0o)).mo82368a((List) pair.getFirst(), (List) pair.getSecond());
                        if (this.f83166a.mo82597s().mo80347j() == 0) {
                            ((IndexView) this.f83166a.mo81750a((int) R.id.b0o)).setCurrentIndex(0);
                        }
                        FloatingBarItemDecoration floatingBarItemDecoration = this.f83166a.f83158l;
                        if (floatingBarItemDecoration != null) {
                            ((RecyclerView) this.f83166a.mo81750a((int) R.id.bxs)).mo5542b((C1272h) floatingBarItemDecoration);
                        }
                        BaseSelectFragment baseSelectFragment = this.f83166a;
                        FloatingBarItemDecoration floatingBarItemDecoration2 = new FloatingBarItemDecoration(this.f83166a.getContext(), (List) pair.getFirst(), (List) pair.getSecond());
                        floatingBarItemDecoration2.f82725b = this.f83166a.f83159m;
                        floatingBarItemDecoration2.f82724a = this.f83166a.mo82597s().mo80347j();
                        ((RecyclerView) this.f83166a.mo81750a((int) R.id.bxs)).mo5525a((C1272h) floatingBarItemDecoration2);
                        baseSelectFragment.f83158l = floatingBarItemDecoration2;
                        return;
                    }
                }
            }
            IndexView indexView = (IndexView) this.f83166a.mo81750a((int) R.id.b0o);
            C7573i.m23582a((Object) indexView, "index_view");
            indexView.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$g */
    static final class C31786g<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ BaseSelectFragment f83167a;

        C31786g(BaseSelectFragment baseSelectFragment) {
            this.f83167a = baseSelectFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                if (num != null && num.intValue() == 0 && this.f83167a.mo82381r()) {
                    IndexView indexView = (IndexView) this.f83167a.mo81750a((int) R.id.b0o);
                    C7573i.m23582a((Object) indexView, "index_view");
                    indexView.setVisibility(0);
                } else {
                    IndexView indexView2 = (IndexView) this.f83167a.mo81750a((int) R.id.b0o);
                    C7573i.m23582a((Object) indexView2, "index_view");
                    indexView2.setVisibility(8);
                    FloatingBarItemDecoration floatingBarItemDecoration = this.f83167a.f83158l;
                    if (floatingBarItemDecoration != null) {
                        ((RecyclerView) this.f83167a.mo81750a((int) R.id.bxs)).mo5542b((C1272h) floatingBarItemDecoration);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$h */
    static final class C31787h<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ BaseSelectFragment f83168a;

        C31787h(BaseSelectFragment baseSelectFragment) {
            this.f83168a = baseSelectFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            boolean z;
            if (num != null) {
                this.f83168a.mo81761l();
                BaseSelectFragment baseSelectFragment = this.f83168a;
                if (num != null && num.intValue() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                baseSelectFragment.mo82596b(z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$i */
    public static final class C31788i implements C31980a {

        /* renamed from: a */
        final /* synthetic */ BaseSelectFragment f83169a;

        /* renamed from: a */
        public final void mo18096a() {
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) this.f83169a.mo81750a((int) R.id.djz);
            C7573i.m23582a((Object) imTextTitleBar, "title_bar");
            if (!C31864aj.m103545a(imTextTitleBar.getLeftView(), 500)) {
                this.f83169a.mo81781q();
            }
        }

        /* renamed from: b */
        public final void mo18097b() {
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) this.f83169a.mo81750a((int) R.id.djz);
            C7573i.m23582a((Object) imTextTitleBar, "title_bar");
            if (!C31864aj.m103545a(imTextTitleBar.getRightView(), 500)) {
                this.f83169a.mo81762m();
            }
        }

        C31788i(BaseSelectFragment baseSelectFragment) {
            this.f83169a = baseSelectFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$j */
    static final class C31789j implements C31601a {

        /* renamed from: a */
        final /* synthetic */ BaseSelectFragment f83170a;

        C31789j(BaseSelectFragment baseSelectFragment) {
            this.f83170a = baseSelectFragment;
        }

        /* renamed from: a */
        public final void mo82379a(String str, int i) {
            int i2;
            if (!C7573i.m23585a((Object) str, (Object) "search")) {
                i2 = ((IndexView) this.f83170a.mo81750a((int) R.id.b0o)).mo82367a(i) + this.f83170a.mo82597s().mo80347j();
            } else {
                i2 = 0;
            }
            RecyclerView recyclerView = (RecyclerView) this.f83170a.mo81750a((int) R.id.bxs);
            C7573i.m23582a((Object) recyclerView, "member_list");
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                RecyclerView recyclerView2 = (RecyclerView) this.f83170a.mo81750a((int) R.id.bxs);
                C7573i.m23582a((Object) recyclerView2, "member_list");
                C1273i layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    ((LinearLayoutManager) layoutManager).mo5417a(i2, 0);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$k */
    static final class C31790k extends Lambda implements C7561a<BaseSelectListAdapter<IMContact>> {

        /* renamed from: a */
        final /* synthetic */ BaseSelectFragment f83171a;

        C31790k(BaseSelectFragment baseSelectFragment) {
            this.f83171a = baseSelectFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public BaseSelectListAdapter<IMContact> invoke() {
            FragmentActivity activity = this.f83171a.getActivity();
            if (activity != null) {
                return C31774e.m103150a(activity, this.f83171a.f83159m);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$l */
    public static final class C31791l implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ BaseSelectFragment f83172a;

        public final void onAnimationCancel(Animator animator) {
            C7573i.m23587b(animator, "animation");
        }

        public final void onAnimationRepeat(Animator animator) {
            C7573i.m23587b(animator, "animation");
        }

        public final void onAnimationStart(Animator animator) {
            C7573i.m23587b(animator, "animation");
        }

        C31791l(BaseSelectFragment baseSelectFragment) {
            this.f83172a = baseSelectFragment;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            this.f83172a.mo82597s().notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$m */
    static final class C31792m extends Lambda implements C7561a<VM> {

        /* renamed from: a */
        final /* synthetic */ BaseSelectFragment f83173a;

        C31792m(BaseSelectFragment baseSelectFragment) {
            this.f83173a = baseSelectFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public VM invoke() {
            BaseSelectFragment baseSelectFragment = this.f83173a;
            FragmentActivity activity = this.f83173a.getActivity();
            if (activity != null) {
                return baseSelectFragment.mo81751a((C0043i) activity);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
        }
    }

    /* renamed from: a */
    public int mo81749a(boolean z) {
        return z ? R.drawable.b5m : R.drawable.cmw;
    }

    /* renamed from: a */
    public View mo81750a(int i) {
        if (this.f83161p == null) {
            this.f83161p = new HashMap();
        }
        View view = (View) this.f83161p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f83161p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public abstract VM mo81751a(C0043i iVar);

    /* renamed from: e */
    public boolean mo81755e() {
        return true;
    }

    /* renamed from: f */
    public abstract String mo81756f();

    /* renamed from: g */
    public void mo81757g() {
        if (this.f83161p != null) {
            this.f83161p.clear();
        }
    }

    /* renamed from: j */
    public int mo81759j() {
        return R.layout.ox;
    }

    /* renamed from: k */
    public boolean mo81760k() {
        return true;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo81757g();
    }

    /* renamed from: r */
    public boolean mo82381r() {
        return true;
    }

    /* renamed from: s */
    public final BaseSelectListAdapter<IMContact> mo82597s() {
        return (BaseSelectListAdapter) this.f83154g.getValue();
    }

    /* renamed from: t */
    public final C31795b mo82598t() {
        return this.f83155h;
    }

    /* renamed from: u */
    public final VM mo82599u() {
        return (BaseMemberListViewModel) this.f83156i.getValue();
    }

    public void onDestroy() {
        super.onDestroy();
        C31864aj.m103544a();
        mo82599u().onCleared();
    }

    public void onResume() {
        super.onResume();
        mo82599u().mo81882a();
    }

    /* renamed from: a */
    public void mo81752a() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f83159m = arguments.getInt("key_member_list_type");
            if (arguments != null) {
                return;
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: m */
    public void mo81762m() {
        if (!mo82599u().mo82588m() && mo81755e()) {
            mo82599u().mo82585a(3);
        }
    }

    /* renamed from: w */
    public final void mo82601w() {
        DmtStatusView dmtStatusView = (DmtStatusView) mo81750a((int) R.id.dav);
        if (dmtStatusView != null) {
            dmtStatusView.mo25939d();
            dmtStatusView.setVisibility(8);
        }
    }

    public boolean be_() {
        if (!mo82599u().mo82588m() || !mo81760k()) {
            ((SearchHeadListView) mo81750a((int) R.id.d0z)).mo82385b();
            return false;
        }
        mo82599u().mo82594s();
        mo82599u().mo82585a(2);
        return true;
    }

    /* renamed from: n */
    public View mo81767n() {
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setStatus(new C10806a(getContext()).mo25990b((int) R.string.bjk).mo25993c(R.string.bjj).mo25986a(ButtonStyle.SOLID, R.string.bjf, new C31781b(this)).f29135a);
        return dmtDefaultView;
    }

    /* renamed from: q */
    public void mo81781q() {
        if (!mo82599u().mo82588m() || !mo81760k()) {
            ((SearchHeadListView) mo81750a((int) R.id.d0z)).mo82385b();
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        mo82599u().mo82594s();
        mo82599u().mo82585a(2);
    }

    /* renamed from: v */
    public final void mo82600v() {
        DmtStatusView dmtStatusView = (DmtStatusView) mo81750a((int) R.id.dav);
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10803a.m31631a(dmtStatusView.getContext()).mo25953a());
            dmtStatusView.mo25939d();
            dmtStatusView.mo25942f();
            dmtStatusView.setVisibility(0);
        }
    }

    /* renamed from: x */
    private final void m103181x() {
        AnimatorSet animatorSet = new AnimatorSet();
        RecyclerView recyclerView = (RecyclerView) mo81750a((int) R.id.bxs);
        C7573i.m23582a((Object) recyclerView, "member_list");
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int s = linearLayoutManager.mo5800s();
            Builder builder = null;
            for (int i = 0; i < s; i++) {
                View g = linearLayoutManager.mo5788g(i);
                if (g != null) {
                    C7573i.m23582a((Object) g, "linearLayoutManager.getChildAt(i) ?: continue");
                    C1293v b = ((RecyclerView) mo81750a((int) R.id.bxs)).mo5539b(g);
                    if (!(b instanceof BaseSelectViewHolder)) {
                        b = null;
                    }
                    BaseSelectViewHolder baseSelectViewHolder = (BaseSelectViewHolder) b;
                    if (baseSelectViewHolder != null) {
                        if (builder == null) {
                            builder = animatorSet.play(baseSelectViewHolder.mo82608c());
                        } else {
                            builder.with(baseSelectViewHolder.mo82608c());
                        }
                    }
                }
            }
            animatorSet.setDuration(300);
            animatorSet.addListener(this.f83160o);
            animatorSet.start();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    /* renamed from: y */
    private final void m103182y() {
        AnimatorSet animatorSet = new AnimatorSet();
        RecyclerView recyclerView = (RecyclerView) mo81750a((int) R.id.bxs);
        C7573i.m23582a((Object) recyclerView, "member_list");
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int s = linearLayoutManager.mo5800s();
            Builder builder = null;
            for (int i = 0; i < s; i++) {
                View g = linearLayoutManager.mo5788g(i);
                if (g != null) {
                    C7573i.m23582a((Object) g, "linearLayoutManager.getChildAt(i) ?: continue");
                    C1293v b = ((RecyclerView) mo81750a((int) R.id.bxs)).mo5539b(g);
                    if (!(b instanceof BaseSelectViewHolder)) {
                        b = null;
                    }
                    BaseSelectViewHolder baseSelectViewHolder = (BaseSelectViewHolder) b;
                    if (baseSelectViewHolder != null) {
                        if (builder == null) {
                            builder = animatorSet.play(baseSelectViewHolder.mo82609d());
                        } else {
                            builder.with(baseSelectViewHolder.mo82609d());
                        }
                    }
                }
            }
            animatorSet.setDuration(300);
            animatorSet.addListener(this.f83160o);
            animatorSet.start();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    /* renamed from: d */
    public void mo81754d() {
        C0043i iVar = this;
        mo82599u().f83143k.observe(iVar, new C31782c(this));
        mo82599u().f83148p.observe(iVar, new C31783d(this));
        mo82599u().f83144l.observe(iVar, new C31784e(this));
        mo82599u().f83145m.observe(iVar, new C31785f(this));
        mo82599u().f83147o.observe(iVar, new C31786g(this));
        mo82599u().f83146n.observe(iVar, new C31787h(this));
        mo82599u().mo82585a(2);
        mo82599u().mo82587b(0);
    }

    /* renamed from: i */
    public void mo81758i() {
        ((ImTextTitleBar) mo81750a((int) R.id.djz)).setOnTitlebarClickListener(new C31788i(this));
        SearchHeadListView searchHeadListView = (SearchHeadListView) mo81750a((int) R.id.d0z);
        C7573i.m23582a((Object) searchHeadListView, "search_head_list");
        searchHeadListView.setVisibility(0);
        ((SearchHeadListView) mo81750a((int) R.id.d0z)).setListViewModel(mo82599u());
        RecyclerView recyclerView = (RecyclerView) mo81750a((int) R.id.bxs);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(mo82597s());
        recyclerView.mo5528a((C1281m) new BaseSelectFragment$initViews$$inlined$apply$lambda$1(recyclerView, recyclerView.getContext(), this));
        recyclerView.mo5527a((C1280l) new BaseSelectFragment$initViews$$inlined$apply$lambda$2(this));
        ((IndexView) mo81750a((int) R.id.b0o)).setOnLetterTouchListener(new C31789j(this));
        ((IndexView) mo81750a((int) R.id.b0o)).setIndexLetterTv((TextView) mo81750a((int) R.id.b0m));
    }

    /* renamed from: o */
    public void mo81768o() {
        if (mo82599u().mo82589n()) {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
            dmtDefaultView.setStatus(new C10806a(getContext()).mo25990b((int) R.string.bp0).mo25993c(R.string.boz).mo25985a((int) R.drawable.b7c).f29135a);
            ((DmtStatusView) mo81750a((int) R.id.dav)).setBuilder(new C10803a(getContext()).mo25963b((View) dmtDefaultView));
        } else {
            ((DmtStatusView) mo81750a((int) R.id.dav)).setBuilder(new C10803a(getContext()).mo25963b(mo81767n()));
        }
        ((DmtStatusView) mo81750a((int) R.id.dav)).mo25939d();
        ((DmtStatusView) mo81750a((int) R.id.dav)).mo25943g();
        DmtStatusView dmtStatusView = (DmtStatusView) mo81750a((int) R.id.dav);
        C7573i.m23582a((Object) dmtStatusView, "status_view");
        dmtStatusView.setVisibility(0);
    }

    /* renamed from: l */
    public void mo81761l() {
        ((ImTextTitleBar) mo81750a((int) R.id.djz)).setTitle(mo81756f());
        if (!mo82599u().mo82588m()) {
            ((ImTextTitleBar) mo81750a((int) R.id.djz)).setLeftIcon(mo81749a(false));
            if (mo81755e()) {
                ((ImTextTitleBar) mo81750a((int) R.id.djz)).setRightText((int) R.string.bp5);
                ((ImTextTitleBar) mo81750a((int) R.id.djz)).setRightTextColor(C6399b.m19921a().getResources().getColor(R.color.a5e));
                ImTextTitleBar imTextTitleBar = (ImTextTitleBar) mo81750a((int) R.id.djz);
                C7573i.m23582a((Object) imTextTitleBar, "title_bar");
                DmtTextView rightTexView = imTextTitleBar.getRightTexView();
                C7573i.m23582a((Object) rightTexView, "title_bar.rightTexView");
                TextPaint paint = rightTexView.getPaint();
                C7573i.m23582a((Object) paint, "title_bar.rightTexView.paint");
                paint.setFakeBoldText(false);
                ImTextTitleBar imTextTitleBar2 = (ImTextTitleBar) mo81750a((int) R.id.djz);
                C7573i.m23582a((Object) imTextTitleBar2, "title_bar");
                View rightView = imTextTitleBar2.getRightView();
                C7573i.m23582a((Object) rightView, "title_bar.rightView");
                rightView.setEnabled(true);
                return;
            }
            ImTextTitleBar imTextTitleBar3 = (ImTextTitleBar) mo81750a((int) R.id.djz);
            C7573i.m23582a((Object) imTextTitleBar3, "title_bar");
            View rightView2 = imTextTitleBar3.getRightView();
            C7573i.m23582a((Object) rightView2, "title_bar.rightView");
            rightView2.setVisibility(8);
            return;
        }
        int p = mo82599u().mo82591p();
        ((ImTextTitleBar) mo81750a((int) R.id.djz)).setLeftIcon(mo81749a(true));
        if (p != 0) {
            ImTextTitleBar imTextTitleBar4 = (ImTextTitleBar) mo81750a((int) R.id.djz);
            StringBuilder sb = new StringBuilder();
            sb.append(C6399b.m19921a().getResources().getString(R.string.bjh));
            sb.append("(");
            sb.append(p);
            sb.append(")");
            imTextTitleBar4.setRightText(sb.toString());
            ImTextTitleBar imTextTitleBar5 = (ImTextTitleBar) mo81750a((int) R.id.djz);
            C7573i.m23582a((Object) imTextTitleBar5, "title_bar");
            View rightView3 = imTextTitleBar5.getRightView();
            C7573i.m23582a((Object) rightView3, "title_bar.rightView");
            rightView3.setEnabled(true);
            ImTextTitleBar imTextTitleBar6 = (ImTextTitleBar) mo81750a((int) R.id.djz);
            C7573i.m23582a((Object) imTextTitleBar6, "title_bar");
            DmtTextView rightTexView2 = imTextTitleBar6.getRightTexView();
            C7573i.m23582a((Object) rightTexView2, "title_bar.rightTexView");
            TextPaint paint2 = rightTexView2.getPaint();
            C7573i.m23582a((Object) paint2, "title_bar.rightTexView.paint");
            paint2.setFakeBoldText(true);
            ((ImTextTitleBar) mo81750a((int) R.id.djz)).setRightTextColor(C6399b.m19921a().getResources().getColor(R.color.a79));
            return;
        }
        ((ImTextTitleBar) mo81750a((int) R.id.djz)).setRightText((int) R.string.bjh);
        ImTextTitleBar imTextTitleBar7 = (ImTextTitleBar) mo81750a((int) R.id.djz);
        C7573i.m23582a((Object) imTextTitleBar7, "title_bar");
        View rightView4 = imTextTitleBar7.getRightView();
        C7573i.m23582a((Object) rightView4, "title_bar.rightView");
        rightView4.setEnabled(false);
        ImTextTitleBar imTextTitleBar8 = (ImTextTitleBar) mo81750a((int) R.id.djz);
        C7573i.m23582a((Object) imTextTitleBar8, "title_bar");
        DmtTextView rightTexView3 = imTextTitleBar8.getRightTexView();
        C7573i.m23582a((Object) rightTexView3, "title_bar.rightTexView");
        TextPaint paint3 = rightTexView3.getPaint();
        C7573i.m23582a((Object) paint3, "title_bar.rightTexView.paint");
        paint3.setFakeBoldText(false);
        ((ImTextTitleBar) mo81750a((int) R.id.djz)).setRightTextColor(C6399b.m19921a().getResources().getColor(R.color.a7b));
    }

    /* renamed from: b */
    public final void mo82596b(boolean z) {
        if (z) {
            m103181x();
        } else {
            m103182y();
        }
    }

    /* renamed from: a_ */
    public void mo81778a_(List<? extends IMContact> list) {
        boolean z;
        if (this.f83157k != null) {
            mo82597s().mo82500m();
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo81768o();
        } else {
            DmtStatusView dmtStatusView = (DmtStatusView) mo81750a((int) R.id.dav);
            C7573i.m23582a((Object) dmtStatusView, "status_view");
            dmtStatusView.setVisibility(8);
        }
        mo82597s().mo80345e(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo82595a(View view) {
        C7573i.m23587b(view, "headerView");
        this.f83157k = view;
        mo82597s().mo82499c(view);
    }

    /* renamed from: b */
    public void mo81766b(List<? extends IMContact> list) {
        boolean z;
        View view = this.f83157k;
        if (view != null) {
            mo82597s().mo82499c(view);
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo81768o();
            SearchHeadListView searchHeadListView = (SearchHeadListView) mo81750a((int) R.id.d0z);
            C7573i.m23582a((Object) searchHeadListView, "search_head_list");
            searchHeadListView.setVisibility(8);
            return;
        }
        SearchHeadListView searchHeadListView2 = (SearchHeadListView) mo81750a((int) R.id.d0z);
        C7573i.m23582a((Object) searchHeadListView2, "search_head_list");
        searchHeadListView2.setVisibility(0);
        DmtStatusView dmtStatusView = (DmtStatusView) mo81750a((int) R.id.dav);
        C7573i.m23582a((Object) dmtStatusView, "status_view");
        dmtStatusView.setVisibility(8);
        mo82597s().mo80345e(list);
    }

    /* renamed from: a */
    public void mo81753a(List<? extends IMContact> list) {
        List list2;
        SearchHeadListView searchHeadListView = (SearchHeadListView) mo81750a((int) R.id.d0z);
        if (list != null) {
            list2 = C7525m.m23512f((Iterable<? extends T>) list);
        } else {
            list2 = null;
        }
        searchHeadListView.mo82384a(list2);
        mo82597s().notifyDataSetChanged();
        mo81761l();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        mo81752a();
        mo81758i();
        mo81754d();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(mo81759j(), viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(getLayo…esId(), container, false)");
        this.f83152e = inflate;
        View view = this.f83152e;
        if (view == null) {
            C7573i.m23583a("mRootView");
        }
        return view;
    }
}
