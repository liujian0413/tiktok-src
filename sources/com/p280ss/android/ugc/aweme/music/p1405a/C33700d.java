package com.p280ss.android.ugc.aweme.music.p1405a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import com.p280ss.android.ugc.aweme.detail.C26094j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.music.a.d */
public final class C33700d implements C26094j {

    /* renamed from: a */
    public final View f87961a;

    /* renamed from: b */
    public final Context f87962b;

    /* renamed from: c */
    public final ViewGroup f87963c;

    /* renamed from: com.ss.android.ugc.aweme.music.a.d$a */
    public static final class C33701a implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C33700d f87964a;

        /* renamed from: b */
        final /* synthetic */ C7561a f87965b;

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            this.f87964a.f87961a.setVisibility(8);
            this.f87965b.invoke();
        }

        C33701a(C33700d dVar, C7561a aVar) {
            this.f87964a = dVar;
            this.f87965b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.d$b */
    public static final class C33702b implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f87966a;

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        C33702b(C7561a aVar) {
            this.f87966a = aVar;
        }

        public final void onAnimationEnd(Animation animation) {
            this.f87966a.invoke();
        }
    }

    /* renamed from: b */
    public final void mo67579b(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "callback");
        this.f87961a.clearAnimation();
        this.f87961a.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo67577a(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "callback");
        if (this.f87961a.getAnimation() != null) {
            this.f87961a.clearAnimation();
        }
        this.f87961a.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f87962b, R.anim.cr);
        loadAnimation.setAnimationListener(new C33702b(aVar));
        this.f87961a.startAnimation(loadAnimation);
    }

    /* renamed from: c */
    public final void mo67673c(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "callback");
        if (this.f87961a.getAnimation() != null) {
            this.f87961a.clearAnimation();
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f87962b, R.anim.cs);
        loadAnimation.setAnimationListener(new C33701a(this, aVar));
        this.f87961a.startAnimation(loadAnimation);
    }

    public C33700d(Context context, ViewGroup viewGroup) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(viewGroup, "viewGroup");
        this.f87962b = context;
        this.f87963c = viewGroup;
        View findViewById = this.f87963c.findViewById(R.id.da8);
        C7573i.m23582a((Object) findViewById, "this.viewGroup.findViewB…id.start_record_out_ring)");
        this.f87961a = findViewById;
    }
}
