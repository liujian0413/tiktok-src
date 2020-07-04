package com.p280ss.android.ugc.trill.language;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.trill.language.ContentLanguageGuideViewHolder */
public final class ContentLanguageGuideViewHolder extends C1293v {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f115704a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ContentLanguageGuideViewHolder.class), "mTvLocalName", "getMTvLocalName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ContentLanguageGuideViewHolder.class), "mTvEnName", "getMTvEnName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ContentLanguageGuideViewHolder.class), "mImgIcon", "getMImgIcon()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ContentLanguageGuideViewHolder.class), "mImgSelected", "getMImgSelected()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ContentLanguageGuideViewHolder.class), "mBackground", "getMBackground()Landroid/view/View;"))};

    /* renamed from: b */
    private final C7541d f115705b;

    /* renamed from: c */
    private final C7541d f115706c;

    /* renamed from: d */
    private final C7541d f115707d;

    /* renamed from: e */
    private final C7541d f115708e;

    /* renamed from: f */
    private final C7541d f115709f;

    /* renamed from: com.ss.android.ugc.trill.language.ContentLanguageGuideViewHolder$a */
    static final class C45010a extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ View f115710a;

        C45010a(View view) {
            this.f115710a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f115710a.findViewById(R.id.bgp);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.ContentLanguageGuideViewHolder$b */
    static final class C45011b extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ View f115711a;

        C45011b(View view) {
            this.f115711a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f115711a.findViewById(R.id.ax9);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.ContentLanguageGuideViewHolder$c */
    static final class C45012c extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ View f115712a;

        C45012c(View view) {
            this.f115712a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f115712a.findViewById(R.id.b01);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.ContentLanguageGuideViewHolder$d */
    static final class C45013d extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f115713a;

        C45013d(View view) {
            this.f115713a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f115713a.findViewById(R.id.aeg);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.ContentLanguageGuideViewHolder$e */
    static final class C45014e extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f115714a;

        C45014e(View view) {
            this.f115714a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f115714a.findViewById(R.id.bug);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.ContentLanguageGuideViewHolder$f */
    public static final class C45015f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ContentLanguageGuideViewHolder f115715a;

        C45015f(ContentLanguageGuideViewHolder contentLanguageGuideViewHolder) {
            this.f115715a = contentLanguageGuideViewHolder;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f115715a.mo107526c().setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.ContentLanguageGuideViewHolder$g */
    public static final class C45016g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ContentLanguageGuideViewHolder f115716a;

        C45016g(ContentLanguageGuideViewHolder contentLanguageGuideViewHolder) {
            this.f115716a = contentLanguageGuideViewHolder;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f115716a.mo107527d().setVisibility(8);
        }
    }

    /* renamed from: a */
    public final DmtTextView mo107524a() {
        return (DmtTextView) this.f115705b.getValue();
    }

    /* renamed from: b */
    public final DmtTextView mo107525b() {
        return (DmtTextView) this.f115706c.getValue();
    }

    /* renamed from: c */
    public final RemoteImageView mo107526c() {
        return (RemoteImageView) this.f115707d.getValue();
    }

    /* renamed from: d */
    public final ImageView mo107527d() {
        return (ImageView) this.f115708e.getValue();
    }

    /* renamed from: e */
    public final View mo107528e() {
        return (View) this.f115709f.getValue();
    }

    /* renamed from: f */
    public final void mo107529f() {
        Drawable background = mo107528e().getBackground();
        if (background != null) {
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            if (mo107527d().getVisibility() == 8) {
                if (VERSION.SDK_INT >= 21) {
                    View view = this.itemView;
                    C7573i.m23582a((Object) view, "itemView");
                    View view2 = this.itemView;
                    C7573i.m23582a((Object) view2, "itemView");
                    ObjectAnimator.ofArgb(mo107525b(), "textColor", new int[]{view.getResources().getColor(R.color.lx), view2.getResources().getColor(R.color.lt)}).setDuration(150).start();
                    View view3 = this.itemView;
                    C7573i.m23582a((Object) view3, "itemView");
                    View view4 = this.itemView;
                    C7573i.m23582a((Object) view4, "itemView");
                    ObjectAnimator.ofArgb(mo107524a(), "textColor", new int[]{view3.getResources().getColor(R.color.l_), view4.getResources().getColor(R.color.lt)}).setDuration(150).start();
                    ObjectAnimator.ofArgb(gradientDrawable, "color", new int[]{0, Color.parseColor(mo107528e().getTag().toString())}).setDuration(150).start();
                } else {
                    DmtTextView b = mo107525b();
                    View view5 = this.itemView;
                    C7573i.m23582a((Object) view5, "itemView");
                    b.setTextColor(view5.getResources().getColor(R.color.lt));
                    DmtTextView a = mo107524a();
                    View view6 = this.itemView;
                    C7573i.m23582a((Object) view6, "itemView");
                    a.setTextColor(view6.getResources().getColor(R.color.lt));
                    gradientDrawable.setColor(Color.parseColor(mo107528e().getTag().toString()));
                }
                mo107527d().setVisibility(0);
                ObjectAnimator.ofFloat(mo107527d(), "alpha", new float[]{0.0f, 1.0f}).setDuration(150).start();
                ObjectAnimator duration = ObjectAnimator.ofFloat(mo107526c(), "alpha", new float[]{1.0f, 0.0f}).setDuration(150);
                duration.addListener(new C45015f(this));
                duration.start();
                return;
            }
            if (VERSION.SDK_INT >= 21) {
                View view7 = this.itemView;
                C7573i.m23582a((Object) view7, "itemView");
                View view8 = this.itemView;
                C7573i.m23582a((Object) view8, "itemView");
                ObjectAnimator.ofArgb(mo107525b(), "textColor", new int[]{view7.getResources().getColor(R.color.lt), view8.getResources().getColor(R.color.lx)}).setDuration(150).start();
                View view9 = this.itemView;
                C7573i.m23582a((Object) view9, "itemView");
                View view10 = this.itemView;
                C7573i.m23582a((Object) view10, "itemView");
                ObjectAnimator.ofArgb(mo107524a(), "textColor", new int[]{view9.getResources().getColor(R.color.lt), view10.getResources().getColor(R.color.l_)}).setDuration(150).start();
                ObjectAnimator.ofArgb(gradientDrawable, "color", new int[]{Color.parseColor(mo107528e().getTag().toString()), 0}).setDuration(150).start();
            } else {
                DmtTextView b2 = mo107525b();
                View view11 = this.itemView;
                C7573i.m23582a((Object) view11, "itemView");
                b2.setTextColor(view11.getResources().getColor(R.color.lx));
                DmtTextView a2 = mo107524a();
                View view12 = this.itemView;
                C7573i.m23582a((Object) view12, "itemView");
                a2.setTextColor(view12.getResources().getColor(R.color.l_));
                gradientDrawable.setColor(0);
            }
            mo107526c().setVisibility(0);
            ObjectAnimator.ofFloat(mo107526c(), "alpha", new float[]{0.0f, 1.0f}).setDuration(150).start();
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(mo107527d(), "alpha", new float[]{1.0f, 0.0f}).setDuration(150);
            duration2.addListener(new C45016g(this));
            duration2.start();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
    }

    public ContentLanguageGuideViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f115705b = C7546e.m23569a(new C45014e(view));
        this.f115706c = C7546e.m23569a(new C45013d(view));
        this.f115707d = C7546e.m23569a(new C45011b(view));
        this.f115708e = C7546e.m23569a(new C45012c(view));
        this.f115709f = C7546e.m23569a(new C45010a(view));
    }
}
