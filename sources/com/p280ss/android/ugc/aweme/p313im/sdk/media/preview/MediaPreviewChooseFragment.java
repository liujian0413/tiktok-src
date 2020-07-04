package com.p280ss.android.ugc.aweme.p313im.sdk.media.preview;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.PagerSnapHelper;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.C31072c;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.ListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.p1331b.C31393a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.p1328a.C31342b;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.adapter.MediaPreviewAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewmodel.MediaPreviewViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewmodel.MediaPreviewViewModel.C31467a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.AutoRTLImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewChooseFragment */
public final class MediaPreviewChooseFragment extends AmeBaseFragment {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f82326e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaPreviewChooseFragment.class), "adapter", "getAdapter()Lcom/ss/android/ugc/aweme/im/sdk/media/preview/adapter/MediaPreviewAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaPreviewChooseFragment.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/sdk/media/preview/viewmodel/MediaPreviewViewModel;"))};

    /* renamed from: f */
    public boolean f82327f;

    /* renamed from: g */
    private final C7541d f82328g = C7546e.m23569a(new C31436a(this));

    /* renamed from: h */
    private final C7541d f82329h = C7546e.m23569a(new C31447l(this));

    /* renamed from: i */
    private HashMap f82330i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewChooseFragment$a */
    static final class C31436a extends Lambda implements C7561a<MediaPreviewAdapter> {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewChooseFragment f82331a;

        C31436a(MediaPreviewChooseFragment mediaPreviewChooseFragment) {
            this.f82331a = mediaPreviewChooseFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MediaPreviewAdapter invoke() {
            return new MediaPreviewAdapter(this.f82331a.mo82042d());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewChooseFragment$b */
    static final class C31437b implements OnClickListener {

        /* renamed from: a */
        public static final C31437b f82332a = new C31437b();

        C31437b() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewChooseFragment$c */
    static final class C31438c implements OnClickListener {

        /* renamed from: a */
        public static final C31438c f82333a = new C31438c();

        C31438c() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewChooseFragment$d */
    static final class C31439d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewChooseFragment f82334a;

        C31439d(MediaPreviewChooseFragment mediaPreviewChooseFragment) {
            this.f82334a = mediaPreviewChooseFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82334a.mo82045g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewChooseFragment$e */
    static final class C31440e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewChooseFragment f82335a;

        C31440e(MediaPreviewChooseFragment mediaPreviewChooseFragment) {
            this.f82335a = mediaPreviewChooseFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7573i.m23582a((Object) view, "it");
            view.setSelected(!view.isSelected());
            this.f82335a.mo82042d().f82289d = view.isSelected();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewChooseFragment$f */
    static final class C31441f extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewChooseFragment f82336a;

        C31441f(MediaPreviewChooseFragment mediaPreviewChooseFragment) {
            this.f82336a = mediaPreviewChooseFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102263a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102263a(View view) {
            C7573i.m23587b(view, "it");
            this.f82336a.mo82041a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewChooseFragment$g */
    static final class C31442g extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewChooseFragment f82337a;

        C31442g(MediaPreviewChooseFragment mediaPreviewChooseFragment) {
            this.f82337a = mediaPreviewChooseFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102264a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102264a(View view) {
            C7573i.m23587b(view, "it");
            this.f82337a.mo82041a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewChooseFragment$h */
    static final class C31443h extends Lambda implements C7563m<List<MediaModel>, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewChooseFragment f82338a;

        C31443h(MediaPreviewChooseFragment mediaPreviewChooseFragment) {
            this.f82338a = mediaPreviewChooseFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m102265a((List) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102265a(List<MediaModel> list, boolean z) {
            if (list != null) {
                if (!this.f82338a.isViewValid()) {
                    list = null;
                }
                if (list != null) {
                    this.f82338a.mo82040a().mo82055a(list);
                    this.f82338a.mo82040a().mo82054a((MediaModel) this.f82338a.mo82042d().mo82089o().getValue());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewChooseFragment$i */
    static final class C31444i<T> implements C0053p<List<MediaModel>> {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewChooseFragment f82339a;

        C31444i(MediaPreviewChooseFragment mediaPreviewChooseFragment) {
            this.f82339a = mediaPreviewChooseFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(List<MediaModel> list) {
            this.f82339a.mo82043e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewChooseFragment$j */
    static final class C31445j<T> implements C0053p<MediaModel> {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewChooseFragment f82340a;

        C31445j(MediaPreviewChooseFragment mediaPreviewChooseFragment) {
            this.f82340a = mediaPreviewChooseFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(MediaModel mediaModel) {
            this.f82340a.mo82044f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewChooseFragment$k */
    static final class C31446k extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ boolean f82341a;

        /* renamed from: b */
        final /* synthetic */ MediaPreviewChooseFragment f82342b;

        C31446k(boolean z, MediaPreviewChooseFragment mediaPreviewChooseFragment) {
            this.f82341a = z;
            this.f82342b = mediaPreviewChooseFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102268a(((Number) obj).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102268a(int i) {
            if (!this.f82341a || i > 0) {
                FrameLayout frameLayout = (FrameLayout) this.f82342b.mo82039a((int) R.id.bjo);
                C7573i.m23582a((Object) frameLayout, "layout_select");
                View view = frameLayout;
                ImageView imageView = (ImageView) this.f82342b.mo82039a((int) R.id.bc0);
                C7573i.m23582a((Object) imageView, "iv_select");
                DmtTextView dmtTextView = (DmtTextView) this.f82342b.mo82039a((int) R.id.e1l);
                C7573i.m23582a((Object) dmtTextView, "tv_select");
                C31393a.m102160a(null, null, view, imageView, dmtTextView, i);
            }
            this.f82342b.f82327f = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewChooseFragment$l */
    static final class C31447l extends Lambda implements C7561a<MediaPreviewViewModel> {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewChooseFragment f82343a;

        C31447l(MediaPreviewChooseFragment mediaPreviewChooseFragment) {
            this.f82343a = mediaPreviewChooseFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MediaPreviewViewModel invoke() {
            FragmentActivity activity = this.f82343a.getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            return C31467a.m102346a(activity);
        }
    }

    /* renamed from: k */
    private void m102254k() {
        if (this.f82330i != null) {
            this.f82330i.clear();
        }
    }

    /* renamed from: a */
    public final View mo82039a(int i) {
        if (this.f82330i == null) {
            this.f82330i = new HashMap();
        }
        View view = (View) this.f82330i.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f82330i.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final MediaPreviewAdapter mo82040a() {
        return (MediaPreviewAdapter) this.f82328g.getValue();
    }

    /* renamed from: d */
    public final MediaPreviewViewModel mo82042d() {
        return (MediaPreviewViewModel) this.f82329h.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m102254k();
    }

    public final void onStart() {
        super.onStart();
        mo82042d().mo82003l();
    }

    /* renamed from: g */
    public final void mo82045g() {
        MediaModel mediaModel = (MediaModel) mo82042d().mo82089o().getValue();
        if (mediaModel != null) {
            if (!isViewValid()) {
                mediaModel = null;
            }
            if (mediaModel != null) {
                this.f82327f = true;
                MediaPreviewViewModel d = mo82042d();
                C7573i.m23582a((Object) mediaModel, "it");
                boolean a = true ^ d.mo81998a(mediaModel);
                mo82042d().mo81997a(mediaModel, a, new C31446k(a, this));
            }
        }
    }

    /* renamed from: i */
    private final void m102252i() {
        C0043i iVar = this;
        ListViewModel.m101340a(mo82042d(), iVar, C31072c.m101360a(null, new C31443h(this), null, 5, null), null, null, 12, null);
        mo82042d().mo82000b().observe(iVar, new C31444i(this));
        mo82042d().mo82089o().observe(iVar, new C31445j(this));
    }

    /* renamed from: e */
    public final void mo82043e() {
        boolean z;
        if (isViewValid()) {
            List list = (List) mo82042d().mo82000b().getValue();
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                DmtButton dmtButton = (DmtButton) mo82039a((int) R.id.rg);
                C7573i.m23582a((Object) dmtButton, "btn_send");
                dmtButton.setText(getResources().getString(R.string.bp9));
                return;
            }
            DmtButton dmtButton2 = (DmtButton) mo82039a((int) R.id.rg);
            C7573i.m23582a((Object) dmtButton2, "btn_send");
            dmtButton2.setText(getResources().getString(R.string.bpa, new Object[]{Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: j */
    private final void m102253j() {
        ((FrameLayout) mo82039a((int) R.id.bkj)).setOnClickListener(C31437b.f82332a);
        ((FrameLayout) mo82039a((int) R.id.bgs)).setOnClickListener(C31438c.f82333a);
        ((FrameLayout) mo82039a((int) R.id.bjo)).setOnClickListener(new C31439d(this));
        DmtTextView dmtTextView = (DmtTextView) mo82039a((int) R.id.ri);
        C7573i.m23582a((Object) dmtTextView, "btn_send_raw");
        dmtTextView.setSelected(mo82042d().f82289d);
        ((DmtTextView) mo82039a((int) R.id.ri)).setOnClickListener(new C31440e(this));
        DmtButton dmtButton = (DmtButton) mo82039a((int) R.id.rg);
        C7573i.m23582a((Object) dmtButton, "btn_send");
        C31342b.m102053a(dmtButton, new C31441f(this));
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo82039a((int) R.id.b6a);
        C7573i.m23582a((Object) autoRTLImageView, "iv_back");
        C31342b.m102053a(autoRTLImageView, new C31442g(this));
        RecyclerView recyclerView = (RecyclerView) mo82039a((int) R.id.cqb);
        C7573i.m23582a((Object) recyclerView, "recycle_view");
        recyclerView.setAdapter(mo82040a());
        RecyclerView recyclerView2 = (RecyclerView) mo82039a((int) R.id.cqb);
        C7573i.m23582a((Object) recyclerView2, "recycle_view");
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        ((RecyclerView) mo82039a((int) R.id.cqb)).setItemViewCacheSize(3);
        new PagerSnapHelper().mo6007a((RecyclerView) mo82039a((int) R.id.cqb));
        mo82044f();
        C31882a.m103579n().mo82725a((DmtTextView) mo82039a((int) R.id.ri), (DmtButton) mo82039a((int) R.id.rg));
    }

    /* renamed from: f */
    public final void mo82044f() {
        boolean z;
        MediaModel mediaModel = (MediaModel) mo82042d().mo82089o().getValue();
        int i = -1;
        if (mediaModel != null) {
            if (!isViewValid() || this.f82327f) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                mediaModel = null;
            }
            if (mediaModel != null) {
                List list = (List) mo82042d().mo82000b().getValue();
                if (list == null) {
                    list = new ArrayList();
                }
                C7573i.m23582a((Object) list, "viewModel.selectedMediaL….value ?: mutableListOf()");
                if (!list.contains(mediaModel)) {
                    list = null;
                }
                if (list != null) {
                    i = list.indexOf(mediaModel) + 1;
                }
                ImageView imageView = (ImageView) mo82039a((int) R.id.bc0);
                C7573i.m23582a((Object) imageView, "iv_select");
                DmtTextView dmtTextView = (DmtTextView) mo82039a((int) R.id.e1l);
                C7573i.m23582a((Object) dmtTextView, "tv_select");
                C31393a.m102162a(null, null, imageView, dmtTextView, i);
                return;
            }
        }
        ImageView imageView2 = (ImageView) mo82039a((int) R.id.bc0);
        C7573i.m23582a((Object) imageView2, "iv_select");
        DmtTextView dmtTextView2 = (DmtTextView) mo82039a((int) R.id.e1l);
        C7573i.m23582a((Object) dmtTextView2, "tv_select");
        C31393a.m102162a(null, null, imageView2, dmtTextView2, -1);
    }

    /* renamed from: a */
    public final void mo82041a(boolean z) {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof MediaPreviewActivity)) {
            activity = null;
        }
        MediaPreviewActivity mediaPreviewActivity = (MediaPreviewActivity) activity;
        if (mediaPreviewActivity != null) {
            mediaPreviewActivity.mo82037a(z);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m102252i();
        m102253j();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.ov, viewGroup, false);
    }
}
