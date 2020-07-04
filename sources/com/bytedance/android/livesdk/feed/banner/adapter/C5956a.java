package com.bytedance.android.livesdk.feed.banner.adapter;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.banner.C2337a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.feed.C6076m;
import com.bytedance.android.livesdk.feed.p231f.C5982b;
import com.bytedance.android.livesdkapi.C9469i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.banner.adapter.a */
public final class C5956a {

    /* renamed from: a */
    HSImageView f17680a;

    /* renamed from: b */
    TextView f17681b;

    /* renamed from: c */
    TextView f17682c;

    /* renamed from: d */
    private Context f17683d;

    /* renamed from: e */
    private C2337a f17684e;

    /* renamed from: f */
    private String f17685f;

    /* renamed from: g */
    private C6076m f17686g;

    /* renamed from: a */
    private void m18664a() {
        if (this.f17684e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", this.f17685f);
            hashMap.put("banner_id", String.valueOf(this.f17684e.getId()));
            C5982b.m18722a("banner_click", (Map<String, String>) hashMap);
            if (!TextUtils.isEmpty(this.f17684e.f7668g) && C9469i.m27992d() != null) {
                C9469i.m27993e().mo14569i().handleSchema(this.f17683d, this.f17684e.f7668g, new Bundle());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14604a(View view) {
        m18664a();
    }

    /* renamed from: a */
    public final void mo14605a(C2337a aVar) {
        this.f17684e = aVar;
        if (aVar != null) {
            this.f17682c.setVisibility(8);
            String str = aVar.f7669h;
            if (!(aVar.mo8227a() == null || aVar.mo8227a().getUrls() == null || aVar.mo8227a().getUrls().size() <= 0)) {
                this.f17680a.setImageURI((String) aVar.mo8227a().getUrls().get(0));
            }
            if (TextUtils.isEmpty(str)) {
                this.f17681b.setVisibility(8);
            } else {
                this.f17681b.setVisibility(0);
                this.f17681b.setText(str);
            }
        }
    }

    public C5956a(View view, Context context, String str, C6076m mVar) {
        this.f17680a = (HSImageView) view.findViewById(R.id.ay4);
        this.f17681b = (TextView) view.findViewById(R.id.text);
        this.f17682c = (TextView) view.findViewById(R.id.bfw);
        this.f17680a.setOnClickListener(new C5957b(this));
        this.f17683d = context;
        this.f17685f = str;
        this.f17686g = mVar;
    }
}
