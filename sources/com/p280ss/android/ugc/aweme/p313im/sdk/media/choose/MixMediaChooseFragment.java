package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.adapter.MediaChooseAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.C31403a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaChooseViewModel.C31417a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.GridSpacingItemDecoration;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MixMediaChooseFragment */
public final class MixMediaChooseFragment extends AmeBaseFragment {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f82170e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MixMediaChooseFragment.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/sdk/media/choose/viewmodel/MediaChooseViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MixMediaChooseFragment.class), "adapter", "getAdapter()Lcom/ss/android/ugc/aweme/im/sdk/media/choose/adapter/MediaChooseAdapter;"))};

    /* renamed from: f */
    public static final C31370a f82171f = new C31370a(null);

    /* renamed from: g */
    private final C7541d f82172g = C7546e.m23569a(new C31373d(this));

    /* renamed from: h */
    private final C7541d f82173h = C7546e.m23569a(new C31371b(this));

    /* renamed from: i */
    private HashMap f82174i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MixMediaChooseFragment$a */
    public static final class C31370a {
        private C31370a() {
        }

        public /* synthetic */ C31370a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MixMediaChooseFragment$b */
    static final class C31371b extends Lambda implements C7561a<MediaChooseAdapter> {

        /* renamed from: a */
        final /* synthetic */ MixMediaChooseFragment f82175a;

        C31371b(MixMediaChooseFragment mixMediaChooseFragment) {
            this.f82175a = mixMediaChooseFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MediaChooseAdapter invoke() {
            return new MediaChooseAdapter(this.f82175a.mo81935a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MixMediaChooseFragment$c */
    static final class C31372c<T> implements C0053p<C31403a> {

        /* renamed from: a */
        final /* synthetic */ MixMediaChooseFragment f82176a;

        C31372c(MixMediaChooseFragment mixMediaChooseFragment) {
            this.f82176a = mixMediaChooseFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C31403a aVar) {
            if (aVar != null) {
                this.f82176a.mo81936d().mo81945a(aVar.mo81983e());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MixMediaChooseFragment$d */
    static final class C31373d extends Lambda implements C7561a<MediaChooseViewModel> {

        /* renamed from: a */
        final /* synthetic */ MixMediaChooseFragment f82177a;

        C31373d(MixMediaChooseFragment mixMediaChooseFragment) {
            this.f82177a = mixMediaChooseFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MediaChooseViewModel invoke() {
            FragmentActivity activity = this.f82177a.getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            return C31417a.m102227a(activity);
        }
    }

    /* renamed from: a */
    private View m102107a(int i) {
        if (this.f82174i == null) {
            this.f82174i = new HashMap();
        }
        View view = (View) this.f82174i.get(Integer.valueOf(R.id.cqd));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.cqd);
            this.f82174i.put(Integer.valueOf(R.id.cqd), view);
        }
        return view;
    }

    /* renamed from: g */
    private void m102110g() {
        if (this.f82174i != null) {
            this.f82174i.clear();
        }
    }

    /* renamed from: a */
    public final MediaChooseViewModel mo81935a() {
        return (MediaChooseViewModel) this.f82172g.getValue();
    }

    /* renamed from: d */
    public final MediaChooseAdapter mo81936d() {
        return (MediaChooseAdapter) this.f82173h.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m102110g();
    }

    /* renamed from: e */
    private final void m102108e() {
        mo81935a().mo82001c().observe(this, new C31372c(this));
    }

    /* renamed from: f */
    private final void m102109f() {
        RecyclerView recyclerView = (RecyclerView) m102107a(R.id.cqd);
        C7573i.m23582a((Object) recyclerView, "recyclerView");
        recyclerView.setAdapter(mo81936d());
        RecyclerView recyclerView2 = (RecyclerView) m102107a(R.id.cqd);
        C7573i.m23582a((Object) recyclerView2, "recyclerView");
        recyclerView2.setLayoutManager(new WrapGridLayoutManager(getActivity(), 4));
        ((RecyclerView) m102107a(R.id.cqd)).mo5525a((C1272h) new GridSpacingItemDecoration(4, (int) C9738o.m28708b((Context) getActivity(), 1.0f), false));
        C31403a aVar = (C31403a) mo81935a().mo82001c().getValue();
        if (aVar != null) {
            mo81936d().mo81945a(aVar.mo81983e());
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m102108e();
        m102109f();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.nf, viewGroup, false);
    }
}
