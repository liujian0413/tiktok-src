package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39172j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView */
public final class StickPointVideoSegView extends FrameLayout {

    /* renamed from: a */
    public C39172j f101663a;

    /* renamed from: b */
    private View f101664b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView$a */
    static final class C39220a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointVideoSegView f101665a;

        C39220a(StickPointVideoSegView stickPointVideoSegView) {
            this.f101665a = stickPointVideoSegView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C39172j jVar = this.f101665a.f101663a;
            if (jVar != null) {
                jVar.mo96997a(view);
            }
        }
    }

    public StickPointVideoSegView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StickPointVideoSegView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setStickPointVideoSegListener(C39172j jVar) {
        C7573i.m23587b(jVar, "listener");
        this.f101663a = jVar;
    }

    /* renamed from: a */
    private final void m125221a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.ab3, this);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…int_video_seg_view, this)");
        this.f101664b = inflate;
        View view = this.f101664b;
        if (view == null) {
            C7573i.m23583a("contentView");
        }
        view.findViewById(R.id.ddn).setOnClickListener(new C39220a(this));
    }

    public final void setButtonClickable(boolean z) {
        View view = this.f101664b;
        if (view == null) {
            C7573i.m23583a("contentView");
        }
        if (view != null) {
            View view2 = this.f101664b;
            if (view2 == null) {
                C7573i.m23583a("contentView");
            }
            View findViewById = view2.findViewById(R.id.ddn);
            C7573i.m23582a((Object) findViewById, "contentView.findViewById<View>(R.id.sure_view)");
            findViewById.setClickable(z);
        }
    }

    public StickPointVideoSegView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m125221a(context);
    }

    public /* synthetic */ StickPointVideoSegView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
