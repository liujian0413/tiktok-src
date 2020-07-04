package com.p280ss.android.ugc.aweme.music.p1405a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.detail.C26067i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.music.a.b */
public final class C33680b implements C26067i {

    /* renamed from: a */
    public final View f87918a = this.f87921d.findViewById(R.id.da6);

    /* renamed from: b */
    public final TextView f87919b = ((TextView) this.f87921d.findViewById(R.id.da9));

    /* renamed from: c */
    public final Context f87920c;

    /* renamed from: d */
    public final ViewGroup f87921d;

    /* renamed from: b */
    public final void mo67579b(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "callback");
        View view = this.f87918a;
        if (view != null) {
            view.clearAnimation();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            aVar.invoke();
        }
    }

    /* renamed from: a */
    public final void mo67577a(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "callback");
        TextView textView = this.f87919b;
        if (textView != null) {
            textView.setVisibility(0);
        }
        View view = this.f87918a;
        if (view != null && view.getAnimation() == null) {
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.bt));
            aVar.invoke();
        }
    }

    public C33680b(Context context, ViewGroup viewGroup) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(viewGroup, "viewGroup");
        this.f87920c = context;
        this.f87921d = viewGroup;
    }
}
