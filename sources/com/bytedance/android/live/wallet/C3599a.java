package com.bytedance.android.live.wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.banner.C2337a;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.utils.C3404s;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.wallet.a */
public final class C3599a {

    /* renamed from: a */
    ImageView f10780a;

    /* renamed from: b */
    TextView f10781b;

    /* renamed from: c */
    private Context f10782c;

    /* renamed from: d */
    private C2337a f10783d;

    /* renamed from: a */
    public final void mo11035a() {
        if (this.f10783d != null && this.f10783d.f7668g != null) {
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(this.f10782c, C3979c.m13952b(this.f10783d.f7668g).mo11550a(this.f10783d.f7663b));
        }
    }

    /* renamed from: a */
    public final void mo11036a(C2337a aVar) {
        this.f10783d = aVar;
        if (aVar != null) {
            C3404s.m12659b(this.f10780a, aVar.mo8227a());
            String str = aVar.f7669h;
            if (TextUtils.isEmpty(str)) {
                this.f10781b.setVisibility(8);
            } else {
                this.f10781b.setVisibility(0);
                this.f10781b.setText(str);
            }
        }
    }

    public C3599a(View view, Context context) {
        this.f10781b = (TextView) view.findViewById(R.id.text);
        this.f10780a = (ImageView) view.findViewById(R.id.ay4);
        this.f10780a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C3599a.this.mo11035a();
            }
        });
        this.f10782c = context;
    }
}
