package com.p280ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.HorizontalBusinessComponentLayout */
public final class HorizontalBusinessComponentLayout extends LinearLayout {
    public HorizontalBusinessComponentLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public HorizontalBusinessComponentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo90204a(List<C35488e> list) {
        int i = 0;
        boolean z = false;
        for (C35488e eVar : list) {
            if (i > 0) {
                LayoutParams layoutParams = new LayoutParams((int) C9738o.m28708b(getContext(), 0.5f), (int) C9738o.m28708b(getContext(), 20.0f));
                View view = new View(getContext());
                view.setBackgroundColor(352321535);
                addView(view, layoutParams);
            }
            LayoutParams layoutParams2 = new LayoutParams(-1, (int) C9738o.m28708b(getContext(), 68.0f));
            layoutParams2.weight = 1.0f;
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a0d, null);
            TextView textView = (TextView) inflate.findViewById(R.id.cd9);
            ((ImageView) inflate.findViewById(R.id.cd8)).setImageResource(eVar.f93125b);
            C7573i.m23582a((Object) textView, "txt");
            textView.setText(eVar.f93124a);
            if (eVar.f93127d != null) {
                inflate.setOnClickListener(eVar.f93127d);
            }
            addView(inflate, layoutParams2);
            i++;
            z = true;
        }
        if (z) {
            setVisibility(0);
        }
    }

    public HorizontalBusinessComponentLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ HorizontalBusinessComponentLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
