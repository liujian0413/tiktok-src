package com.p280ss.android.ugc.aweme.tools.beauty.adapter;

import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.beauty.C23537g;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p280ss.android.ugc.aweme.themechange.base.C42109a;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42191b;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.adapter.BeautyListViewHolder */
public final class BeautyListViewHolder extends C1293v {

    /* renamed from: c */
    public static final C42167a f109710c = new C42167a(null);

    /* renamed from: a */
    public C7563m<? super ComposerBeauty, ? super Integer, C7581n> f109711a;

    /* renamed from: b */
    public final View f109712b;

    /* renamed from: d */
    private final AVDmtImageTextView f109713d = ((AVDmtImageTextView) this.itemView.findViewById(R.id.b5f));

    /* renamed from: e */
    private final ImageView f109714e = ((ImageView) this.itemView.findViewById(R.id.b6j));

    /* renamed from: f */
    private int f109715f = -1;

    /* renamed from: g */
    private ObjectAnimator f109716g;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.adapter.BeautyListViewHolder$a */
    public static final class C42167a {
        private C42167a() {
        }

        public /* synthetic */ C42167a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static BeautyListViewHolder m134151a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gq, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…           parent, false)");
            return new BeautyListViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.adapter.BeautyListViewHolder$b */
    static final class C42168b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BeautyListViewHolder f109717a;

        /* renamed from: b */
        final /* synthetic */ UrlModel f109718b;

        /* renamed from: c */
        final /* synthetic */ ComposerBeauty f109719c;

        /* renamed from: d */
        final /* synthetic */ boolean f109720d;

        /* renamed from: e */
        final /* synthetic */ boolean f109721e;

        C42168b(BeautyListViewHolder beautyListViewHolder, UrlModel urlModel, ComposerBeauty composerBeauty, boolean z, boolean z2) {
            this.f109717a = beautyListViewHolder;
            this.f109718b = urlModel;
            this.f109719c = composerBeauty;
            this.f109720d = z;
            this.f109721e = z2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f109719c.getEnable()) {
                C10761a.m31399c(this.f109717a.f109712b.getContext(), (int) R.string.dtf).mo25750a();
                return;
            }
            if (!C42191b.f109761b.mo103631a(this.f109719c)) {
                C42191b.f109761b.m134223a(new C23537g(this.f109719c, null, 2, null), true, null);
            }
            C7563m<? super ComposerBeauty, ? super Integer, C7581n> mVar = this.f109717a.f109711a;
            if (mVar != null) {
                mVar.invoke(this.f109719c, Integer.valueOf(this.f109717a.getLayoutPosition()));
            }
        }
    }

    /* renamed from: b */
    private final void m134149b() {
        ObjectAnimator objectAnimator = this.f109716g;
        if (objectAnimator != null) {
            if (!objectAnimator.isRunning()) {
                objectAnimator = null;
            }
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
        }
        ImageView imageView = this.f109714e;
        C7573i.m23582a((Object) imageView, "ivDownload");
        imageView.setRotation(0.0f);
        this.f109714e.setImageResource(R.drawable.ep);
    }

    /* renamed from: a */
    private final void m134146a() {
        ImageView imageView = this.f109714e;
        C7573i.m23582a((Object) imageView, "ivDownload");
        imageView.setVisibility(0);
        this.f109714e.setImageResource(R.drawable.eq);
        this.f109716g = ObjectAnimator.ofFloat(this.f109714e, "rotation", new float[]{0.0f, 360.0f});
        ObjectAnimator objectAnimator = this.f109716g;
        if (objectAnimator != null) {
            objectAnimator.setDuration(800);
        }
        ObjectAnimator objectAnimator2 = this.f109716g;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatMode(1);
        }
        ObjectAnimator objectAnimator3 = this.f109716g;
        if (objectAnimator3 != null) {
            objectAnimator3.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator4 = this.f109716g;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
    }

    public BeautyListViewHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
        this.f109712b = view;
    }

    /* renamed from: a */
    private final void m134147a(ComposerBeauty composerBeauty) {
        int c = C42191b.f109761b.mo103633c(composerBeauty);
        if (this.f109715f != c) {
            this.f109715f = c;
            if (C42212g.m134306a(composerBeauty)) {
                ImageView imageView = this.f109714e;
                C7573i.m23582a((Object) imageView, "ivDownload");
                imageView.setVisibility(8);
                return;
            }
            switch (c) {
                case -1:
                case 0:
                case 4:
                    m134149b();
                    ImageView imageView2 = this.f109714e;
                    C7573i.m23582a((Object) imageView2, "ivDownload");
                    imageView2.setVisibility(0);
                    return;
                case 1:
                case 3:
                    m134149b();
                    ImageView imageView3 = this.f109714e;
                    C7573i.m23582a((Object) imageView3, "ivDownload");
                    imageView3.setVisibility(8);
                    return;
                case 2:
                    m134146a();
                    ImageView imageView4 = this.f109714e;
                    C7573i.m23582a((Object) imageView4, "ivDownload");
                    imageView4.setVisibility(0);
                    return;
                default:
                    m134149b();
                    ImageView imageView5 = this.f109714e;
                    C7573i.m23582a((Object) imageView5, "ivDownload");
                    imageView5.setVisibility(0);
                    return;
            }
        }
    }

    /* renamed from: a */
    private final void m134148a(boolean z, boolean z2) {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = (int) C42109a.m134040a();
            if (z) {
                marginLayoutParams.leftMargin = (int) C42109a.m134042b();
            } else {
                marginLayoutParams.leftMargin = 0;
            }
            if (VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginEnd((int) C42109a.m134040a());
                if (z) {
                    marginLayoutParams.setMarginStart((int) C42109a.m134042b());
                } else {
                    marginLayoutParams.setMarginStart(0);
                }
            }
            if (z2) {
                marginLayoutParams.rightMargin = (int) C42109a.m134042b();
                if (VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginEnd((int) C42109a.m134042b());
                }
            }
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            view2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    public final void mo103619a(ComposerBeauty composerBeauty, boolean z, boolean z2) {
        C7573i.m23587b(composerBeauty, "beautyBean");
        UrlModel urlModel = new UrlModel();
        Effect effect = composerBeauty.getEffect();
        if (effect.getIconUrl() != null) {
            com.p280ss.android.ugc.effectmanager.common.model.UrlModel iconUrl = composerBeauty.getEffect().getIconUrl();
            C7573i.m23582a((Object) iconUrl, "beautyBean.effect.iconUrl");
            urlModel.setUri(iconUrl.getUri());
            com.p280ss.android.ugc.effectmanager.common.model.UrlModel iconUrl2 = composerBeauty.getEffect().getIconUrl();
            C7573i.m23582a((Object) iconUrl2, "beautyBean.effect.iconUrl");
            urlModel.setUrlList(iconUrl2.getUrlList());
        }
        boolean z3 = false;
        if (composerBeauty.getSelected()) {
            this.f109713d.mo103501a(true);
        } else {
            this.f109713d.mo103501a(false);
        }
        AVDmtImageTextView aVDmtImageTextView = this.f109713d;
        if (composerBeauty.getShowDot() && C23536f.m77302e()) {
            z3 = true;
        }
        aVDmtImageTextView.mo103512e(z3);
        this.f109713d.setEnableUI(composerBeauty.getEnable());
        this.f109713d.mo103498a(urlModel);
        this.f109713d.setText(effect.getName());
        AVDmtImageTextView aVDmtImageTextView2 = this.f109713d;
        C42168b bVar = new C42168b(this, urlModel, composerBeauty, z, z2);
        aVDmtImageTextView2.setOnClickListener(bVar);
        m134147a(composerBeauty);
        m134148a(z, z2);
    }
}
