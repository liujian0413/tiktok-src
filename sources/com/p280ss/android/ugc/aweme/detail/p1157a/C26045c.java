package com.p280ss.android.ugc.aweme.detail.p1157a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.p280ss.android.ugc.aweme.detail.C26067i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.detail.a.c */
public final class C26045c implements C26067i {

    /* renamed from: a */
    public final View f68845a;

    /* renamed from: b */
    public final Context f68846b;

    /* renamed from: c */
    public final ViewGroup f68847c;

    /* renamed from: b */
    public final void mo67578b() {
        mo67577a(C26069a.f68880a);
        this.f68847c.clearAnimation();
    }

    /* renamed from: a */
    public final void mo67576a() {
        mo67579b(C26070b.f68881a);
        this.f68847c.startAnimation(AnimationUtils.loadAnimation(this.f68846b, R.anim.co));
    }

    /* renamed from: b */
    public final void mo67579b(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "callback");
        this.f68845a.clearAnimation();
        this.f68845a.setVisibility(8);
        aVar.invoke();
    }

    /* renamed from: a */
    public final void mo67577a(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "callback");
        this.f68845a.setVisibility(0);
        if (this.f68845a.getAnimation() == null) {
            this.f68845a.startAnimation(AnimationUtils.loadAnimation(this.f68846b, R.anim.cq));
        }
        aVar.invoke();
    }

    public C26045c(Context context, ViewGroup viewGroup) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(viewGroup, "viewGroup");
        this.f68846b = context;
        this.f68847c = viewGroup;
        View findViewById = this.f68847c.findViewById(R.id.da8);
        C7573i.m23582a((Object) findViewById, "this.viewGroup.findViewB…id.start_record_out_ring)");
        this.f68845a = findViewById;
        this.f68847c.setOnTouchListener(new OnTouchListener(this) {

            /* renamed from: a */
            final /* synthetic */ C26045c f68848a;

            {
                this.f68848a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C7573i.m23582a((Object) motionEvent, "event");
                switch (motionEvent.getAction()) {
                    case 0:
                        this.f68848a.mo67576a();
                        break;
                    case 1:
                        this.f68848a.mo67578b();
                        break;
                }
                return false;
            }
        });
    }
}
