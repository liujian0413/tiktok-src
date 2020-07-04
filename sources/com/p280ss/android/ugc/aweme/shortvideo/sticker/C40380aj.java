package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39564ap;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1592a.C40362a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1592a.C40366c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1592a.C40366c.C40367a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.aj */
public final class C40380aj extends C12629j {

    /* renamed from: j */
    public static final C40381a f104967j = new C40381a(null);

    /* renamed from: i */
    public TextView f104968i;

    /* renamed from: k */
    private StickerHintTextViewModel f104969k;

    /* renamed from: l */
    private C40366c f104970l;

    /* renamed from: m */
    private final C39564ap f104971m = new C39564ap();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.aj$a */
    public static final class C40381a {
        private C40381a() {
        }

        public /* synthetic */ C40381a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.aj$b */
    static final class C40382b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40380aj f104972a;

        C40382b(C40380aj ajVar) {
            this.f104972a = ajVar;
        }

        public final void run() {
            TextView textView = this.f104972a.f104968i;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.aj$c */
    static final class C40383c<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C40380aj f104973a;

        C40383c(C40380aj ajVar) {
            this.f104973a = ajVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            this.f104973a.mo100373a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.aj$d */
    static final class C40384d<T> implements C0053p<C40379ai> {

        /* renamed from: a */
        final /* synthetic */ C40380aj f104974a;

        C40384d(C40380aj ajVar) {
            this.f104974a = ajVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C40379ai aiVar) {
            if (aiVar != null) {
                this.f104974a.mo100374a(aiVar.f104962a, aiVar.f104963b, aiVar.f104964c, aiVar.f104965d, aiVar.f104966e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.aj$e */
    public static final class C40385e implements C40367a {

        /* renamed from: a */
        final /* synthetic */ C40380aj f104975a;

        /* renamed from: b */
        public final void mo98568b() {
            this.f104975a.mo100375b();
        }

        /* renamed from: a */
        public final void mo98567a() {
            TextView textView = this.f104975a.f104968i;
            if (textView == null) {
                C7573i.m23580a();
            }
            textView.setVisibility(0);
        }

        C40385e(C40380aj ajVar) {
            this.f104975a = ajVar;
        }
    }

    /* renamed from: a */
    public final void mo100373a() {
        TextView textView = this.f104968i;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo100375b() {
        TextView textView = this.f104968i;
        if (textView != null) {
            textView.postDelayed(new C40382b(this), 3000);
        }
    }

    /* renamed from: c */
    private void m129127c() {
        StickerHintTextViewModel stickerHintTextViewModel = this.f104969k;
        if (stickerHintTextViewModel == null) {
            C7573i.m23583a("stickerHintTextViewModel");
        }
        C0052o a = stickerHintTextViewModel.mo100247a();
        if (a != null) {
            a.observe(this, new C40383c(this));
        }
        StickerHintTextViewModel stickerHintTextViewModel2 = this.f104969k;
        if (stickerHintTextViewModel2 == null) {
            C7573i.m23583a("stickerHintTextViewModel");
        }
        C0052o b = stickerHintTextViewModel2.mo100248b();
        if (b != null) {
            b.observe(this, new C40384d(this));
        }
    }

    /* renamed from: d */
    private final boolean m129128d(int i) {
        switch (i) {
            case 0:
                if (!this.f104971m.mo98505a()) {
                    return true;
                }
                return false;
            case 1:
                if (!this.f104971m.mo98507b()) {
                    return true;
                }
                return false;
            case 2:
                if (!this.f104971m.mo98509c()) {
                    return true;
                }
                return false;
            case 3:
                if (!this.f104971m.mo98511d()) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: d */
    public final void mo30944d(Bundle bundle) {
        super.mo30944d(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(StickerHintTextViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java]");
            this.f104969k = (StickerHintTextViewModel) a;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    private final void m129126a(float f, float f2) {
        LayoutParams layoutParams;
        TextView textView = this.f104968i;
        if (textView != null) {
            layoutParams = textView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = (int) f;
        }
        if (VERSION.SDK_INT >= 17 && marginLayoutParams != null) {
            marginLayoutParams.setMarginStart((int) f);
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (int) f2;
        }
        TextView textView2 = this.f104968i;
        if (textView2 != null) {
            textView2.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        this.f104968i = (TextView) mo31002b((int) R.id.e2m);
        TextView textView = this.f104968i;
        if (textView == null) {
            C7573i.m23580a();
        }
        Context context = textView.getContext();
        C7573i.m23582a((Object) context, "hintTextView!!.context");
        C40362a aVar = new C40362a(context, 200, 200, null);
        this.f104970l = aVar;
        TextView textView2 = this.f104968i;
        if (textView2 == null) {
            C7573i.m23580a();
        }
        TextPaint paint = textView2.getPaint();
        C7573i.m23582a((Object) paint, "hintTextView!!.paint");
        paint.setFakeBoldText(true);
        m129127c();
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aiz, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…t_text, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final void mo100374a(float f, float f2, int i, int i2, boolean z) {
        float f3;
        if (this.f104968i != null && m129128d(i2)) {
            TextView textView = this.f104968i;
            if (textView == null) {
                C7573i.m23580a();
            }
            textView.setText(i);
            if (z) {
                TextView textView2 = this.f104968i;
                if (textView2 == null) {
                    C7573i.m23580a();
                }
                f3 = C20505c.m68010a(textView2.getContext(), 8.0f);
            } else {
                f3 = 0.0f;
            }
            TextView textView3 = this.f104968i;
            if (textView3 == null) {
                C7573i.m23580a();
            }
            TextView textView4 = this.f104968i;
            if (textView4 == null) {
                C7573i.m23580a();
            }
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(C23482j.m77098b(textView4.getContext()), Integer.MIN_VALUE);
            TextView textView5 = this.f104968i;
            if (textView5 == null) {
                C7573i.m23580a();
            }
            textView3.measure(makeMeasureSpec, MeasureSpec.makeMeasureSpec(C23482j.m77095a(textView5.getContext()), Integer.MIN_VALUE));
            TextView textView6 = this.f104968i;
            if (textView6 == null) {
                C7573i.m23580a();
            }
            if (f - (((float) textView6.getMeasuredWidth()) / 2.0f) >= 0.0f) {
                TextView textView7 = this.f104968i;
                if (textView7 == null) {
                    C7573i.m23580a();
                }
                float measuredWidth = f - (((float) textView7.getMeasuredWidth()) / 2.0f);
                TextView textView8 = this.f104968i;
                if (textView8 == null) {
                    C7573i.m23580a();
                }
                m129126a(measuredWidth, (f2 - ((float) textView8.getMeasuredHeight())) - f3);
            } else {
                TextView textView9 = this.f104968i;
                if (textView9 == null) {
                    C7573i.m23580a();
                }
                m129126a(0.0f, (f2 - ((float) textView9.getMeasuredHeight())) - f3);
            }
            C40366c cVar = this.f104970l;
            if (cVar != null) {
                TextView textView10 = this.f104968i;
                if (textView10 == null) {
                    C7573i.m23580a();
                }
                cVar.mo100361a(textView10, 0, new C40385e(this));
            }
        }
    }
}
