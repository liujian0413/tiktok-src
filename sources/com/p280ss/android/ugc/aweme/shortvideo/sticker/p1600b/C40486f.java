package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1600b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.f */
public final class C40486f extends C40474a {

    /* renamed from: g */
    public boolean f105228g = true;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.f$a */
    static final class C40487a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40486f f105229a;

        C40487a(C40486f fVar) {
            this.f105229a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105229a.mo100527b();
            C40485e eVar = this.f105229a.f105216e;
            if (eVar != null) {
                eVar.mo98454a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.f$b */
    static final class C40488b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40486f f105230a;

        C40488b(C40486f fVar) {
            this.f105230a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105230a.mo100527b();
            C40485e eVar = this.f105230a.f105216e;
            if (eVar != null) {
                eVar.mo98455b();
            }
        }
    }

    /* renamed from: c */
    public final View mo100528c() {
        LinearLayout d = mo100529d();
        LinearLayout a = mo100523a(R.drawable.en, R.string.ajs);
        LinearLayout a2 = mo100523a(R.drawable.el, R.string.akd);
        a.setOnClickListener(new C40487a(this));
        a2.setOnClickListener(new C40488b(this));
        if (this.f105228g) {
            d.addView(a);
            d.addView(mo100530e());
        }
        d.addView(a2);
        return d;
    }

    public C40486f(View view, C40485e eVar) {
        C7573i.m23587b(view, "contentView");
        super(view, eVar);
    }
}
