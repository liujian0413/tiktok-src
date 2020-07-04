package com.p280ss.android.ugc.aweme.discover.hotspot.feed;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.HotSpotFeedMaskViewHolder */
public final class HotSpotFeedMaskViewHolder extends C1293v {

    /* renamed from: a */
    public Aweme f70370a;

    /* renamed from: b */
    public View f70371b;

    /* renamed from: c */
    public FragmentActivity f70372c;

    /* renamed from: d */
    private TextView f70373d;

    /* renamed from: e */
    private TextView f70374e;

    /* renamed from: f */
    private final SpotCurSpotChangeCallBack f70375f;

    /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.HotSpotFeedMaskViewHolder$a */
    public static final class C26694a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ HotSpotFeedMaskViewHolder f70377a;

        C26694a(HotSpotFeedMaskViewHolder hotSpotFeedMaskViewHolder) {
            this.f70377a = hotSpotFeedMaskViewHolder;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f70377a.f70371b.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.HotSpotFeedMaskViewHolder$b */
    static final class C26695b implements AnimatorUpdateListener {

        /* renamed from: a */
        public static final C26695b f70378a = new C26695b();

        C26695b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.HotSpotFeedMaskViewHolder$c */
    static final class C26696c extends Lambda implements C7563m<Aweme, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ HotSpotFeedMaskViewHolder f70379a;

        C26696c(HotSpotFeedMaskViewHolder hotSpotFeedMaskViewHolder) {
            this.f70379a = hotSpotFeedMaskViewHolder;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m87683a((Aweme) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87683a(Aweme aweme, boolean z) {
            if (aweme != null && !(!C7573i.m23585a((Object) this.f70379a.f70370a, (Object) aweme))) {
                this.f70379a.mo68423a(z);
            }
        }
    }

    /* renamed from: b */
    private void m87679b() {
        SpotCurSpotChangeCallBack.f70380c.mo68428a(this.f70372c, this.f70372c, new C26696c(this));
    }

    /* renamed from: a */
    public final void mo68421a() {
        if (this.f70371b.getVisibility() != 8) {
            ViewPropertyAnimator animate = this.f70371b.animate();
            animate.setDuration(200);
            animate.setStartDelay(1000);
            animate.alpha(0.0f);
            animate.start();
            animate.setListener(new C26694a(this)).setUpdateListener(C26695b.f70378a);
        }
    }

    /* renamed from: a */
    public final void mo68422a(Aweme aweme) {
        boolean z;
        if (aweme != null) {
            this.f70370a = aweme;
            int a = this.f70375f.mo68427a(aweme);
            if (a != 0) {
                if (a == -1) {
                    z = true;
                } else {
                    z = false;
                }
                mo68423a(z);
                return;
            }
            this.f70371b.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo68423a(boolean z) {
        String str;
        CharSequence charSequence;
        StringBuilder sb = new StringBuilder("SpotWork() called with: isPre = [");
        Aweme aweme = this.f70370a;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getDesc();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(']');
        this.f70371b.setVisibility(0);
        this.f70371b.setAlpha(1.0f);
        TextView textView = this.f70373d;
        if (z) {
            charSequence = "上一个热点";
        } else {
            charSequence = "下一个热点";
        }
        textView.setText(charSequence);
        TextView textView2 = this.f70374e;
        Aweme aweme2 = this.f70370a;
        if (aweme2 != null) {
            str2 = aweme2.getHotSpot();
        }
        textView2.setText(str2);
    }

    public HotSpotFeedMaskViewHolder(View view, FragmentActivity fragmentActivity) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(fragmentActivity, "context");
        super(view);
        this.f70372c = fragmentActivity;
        View findViewById = view.findViewById(R.id.d9k);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.spot_back_guide)");
        this.f70371b = findViewById;
        View findViewById2 = view.findViewById(R.id.d9l);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.spot_back_guide_pre)");
        this.f70373d = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.d9m);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.spot_back_guide_title)");
        this.f70374e = (TextView) findViewById3;
        C0063u a = C0069x.m159a(this.f70372c).mo147a(SpotCurSpotChangeCallBack.class);
        C7573i.m23582a((Object) a, "ViewModelProviders\n     …angeCallBack::class.java)");
        this.f70375f = (SpotCurSpotChangeCallBack) a;
        m87679b();
        this.f70371b.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ HotSpotFeedMaskViewHolder f70376a;

            {
                this.f70376a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f70376a.f70371b.setVisibility(8);
            }
        });
    }
}
