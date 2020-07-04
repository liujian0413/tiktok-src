package com.bytedance.opensdk.core.grant.web;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class WebPageStatusView extends FrameLayout {

    /* renamed from: a */
    public static final C12327a f32722a = new C12327a(null);

    /* renamed from: b */
    private HashMap f32723b;

    /* renamed from: com.bytedance.opensdk.core.grant.web.WebPageStatusView$a */
    public static final class C12327a {
        private C12327a() {
        }

        public /* synthetic */ C12327a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    private View m35791b(int i) {
        if (this.f32723b == null) {
            this.f32723b = new HashMap();
        }
        View view = (View) this.f32723b.get(Integer.valueOf(R.id.btv));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.btv);
        this.f32723b.put(Integer.valueOf(R.id.btv), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo30163a(int i) {
        switch (i) {
            case 0:
                setVisibility(0);
                LinearLayout linearLayout = (LinearLayout) m35791b(R.id.btv);
                C7573i.m23582a((Object) linearLayout, "loading_layout");
                linearLayout.setVisibility(0);
                return;
            case 1:
                setVisibility(8);
                return;
            default:
                setVisibility(8);
                return;
        }
    }

    public WebPageStatusView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, R.layout.s4, this);
    }

    public /* synthetic */ WebPageStatusView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
