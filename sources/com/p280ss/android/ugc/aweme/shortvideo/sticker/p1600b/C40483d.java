package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1600b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.d */
public final class C40483d extends C40474a {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.d$a */
    static final class C40484a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40483d f105227a;

        C40484a(C40483d dVar) {
            this.f105227a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105227a.mo100527b();
            C40485e eVar = this.f105227a.f105216e;
            if (eVar != null) {
                eVar.mo98455b();
            }
        }
    }

    /* renamed from: c */
    public final View mo100528c() {
        LinearLayout d = mo100529d();
        LinearLayout a = mo100523a(R.drawable.el, R.string.akd);
        a.setOnClickListener(new C40484a(this));
        d.addView(a);
        return d;
    }

    public C40483d(View view, C40485e eVar) {
        C7573i.m23587b(view, "contentView");
        super(view, eVar);
    }
}
