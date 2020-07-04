package com.bytedance.android.live.wallet.viewholder;

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

/* renamed from: com.bytedance.android.live.wallet.viewholder.a */
public final class C3829a {

    /* renamed from: a */
    ImageView f11437a;

    /* renamed from: b */
    TextView f11438b;

    /* renamed from: c */
    private Context f11439c;

    /* renamed from: d */
    private C2337a f11440d;

    /* renamed from: a */
    public final void mo11337a() {
        if (this.f11440d != null && this.f11440d.f7668g != null) {
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(this.f11439c, C3979c.m13952b(this.f11440d.f7668g).mo11550a(this.f11440d.f7663b));
        }
    }

    /* renamed from: a */
    public final void mo11338a(C2337a aVar) {
        this.f11440d = aVar;
        if (aVar != null) {
            C3404s.m12659b(this.f11437a, aVar.mo8227a());
            String str = aVar.f7669h;
            if (TextUtils.isEmpty(str)) {
                this.f11438b.setVisibility(8);
            } else {
                this.f11438b.setVisibility(0);
                this.f11438b.setText(str);
            }
        }
    }

    public C3829a(View view, Context context) {
        this.f11438b = (TextView) view.findViewById(R.id.text);
        this.f11437a = (ImageView) view.findViewById(R.id.ay4);
        this.f11437a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C3829a.this.mo11337a();
            }
        });
        this.f11439c = context;
    }
}
