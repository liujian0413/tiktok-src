package com.bytedance.ies.bullet.p551ui.common.view;

import android.content.Context;
import android.content.res.Resources;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.bullet.p551ui.common.params.C10697a;
import com.bytedance.ies.bullet.p551ui.common.params.C10699c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.ui.common.view.BulletTitleBar */
public final class BulletTitleBar extends FrameLayout {

    /* renamed from: a */
    private HashMap f28599a;

    /* renamed from: a */
    private View m31253a(int i) {
        if (this.f28599a == null) {
            this.f28599a = new HashMap();
        }
        View view = (View) this.f28599a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f28599a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setTitle(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "title");
        TextView textView = (TextView) m31253a((int) R.id.e3f);
        C7573i.m23582a((Object) textView, "tv_title");
        textView.setText(charSequence);
    }

    /* renamed from: a */
    public final void mo25580a(C10697a aVar) {
        if (aVar != null) {
            TextView textView = (TextView) m31253a((int) R.id.e3f);
            C7573i.m23582a((Object) textView, "tv_title");
            String str = (String) aVar.f28590w.mo25251b();
            if (str == null) {
                str = getContext().getString(R.string.v1);
            }
            textView.setText(str);
            if (C7573i.m23585a((Object) (Boolean) aVar.f28593z.mo25251b(), (Object) Boolean.valueOf(true))) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) m31253a((int) R.id.b7h);
                C7573i.m23582a((Object) autoRTLImageView, "iv_close_all");
                autoRTLImageView.setVisibility(0);
            }
            C10699c cVar = (C10699c) aVar.f28591x.mo25251b();
            if (cVar != null) {
                ((TextView) m31253a((int) R.id.e3f)).setBackgroundColor(cVar.f28594a);
                setBackgroundColor(cVar.f28594a);
            }
            C10699c cVar2 = (C10699c) aVar.f28592y.mo25251b();
            if (cVar2 != null) {
                ((TextView) m31253a((int) R.id.e3f)).setTextColor(cVar2.f28594a);
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) m31253a((int) R.id.b6a);
                Context context = getContext();
                C7573i.m23582a((Object) context, "context");
                Resources resources = context.getResources();
                Context context2 = getContext();
                C7573i.m23582a((Object) context2, "context");
                VectorDrawableCompat a = VectorDrawableCompat.m1855a(resources, (int) R.drawable.akr, context2.getTheme());
                if (a != null) {
                    a.setTint(cVar2.f28594a);
                } else {
                    a = null;
                }
                autoRTLImageView2.setImageDrawable(a);
            }
        }
    }

    public BulletTitleBar(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.hy, this, true);
    }

    public /* synthetic */ BulletTitleBar(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
