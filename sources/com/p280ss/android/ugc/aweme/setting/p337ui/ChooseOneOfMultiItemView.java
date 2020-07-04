package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView */
public final class ChooseOneOfMultiItemView extends ConstraintLayout {

    /* renamed from: g */
    private String f98381g;

    /* renamed from: h */
    private String f98382h;

    /* renamed from: i */
    private boolean f98383i;

    /* renamed from: j */
    private boolean f98384j;

    /* renamed from: k */
    private HashMap f98385k;

    public ChooseOneOfMultiItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ChooseOneOfMultiItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    private View m120700b(int i) {
        if (this.f98385k == null) {
            this.f98385k = new HashMap();
        }
        View view = (View) this.f98385k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f98385k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getMDesc() {
        return this.f98382h;
    }

    public final String getMText() {
        return this.f98381g;
    }

    public final boolean getSelect() {
        return this.f98384j;
    }

    public final boolean getShowDiv() {
        return this.f98383i;
    }

    public final void setMDesc(String str) {
        this.f98382h = str;
    }

    public final void setMText(String str) {
        this.f98381g = str;
    }

    public final void setSelect(boolean z) {
        this.f98384j = z;
        if (z) {
            ((ImageView) m120700b(R.id.ax9)).setImageResource(R.drawable.ahr);
        } else {
            ((ImageView) m120700b(R.id.ax9)).setImageResource(R.drawable.amd);
        }
    }

    public final void setShowDiv(boolean z) {
        this.f98383i = z;
        if (z) {
            View b = m120700b(R.id.a9n);
            C7573i.m23582a((Object) b, "div");
            b.setVisibility(0);
            return;
        }
        View b2 = m120700b(R.id.a9n);
        C7573i.m23582a((Object) b2, "div");
        b2.setVisibility(8);
    }

    public ChooseOneOfMultiItemView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f98381g = "";
        this.f98382h = "";
        this.f98383i = true;
        ConstraintLayout.inflate(context, R.layout.tq, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ChooseOneOfMultiItemView);
            this.f98381g = obtainStyledAttributes.getString(1);
            this.f98382h = obtainStyledAttributes.getString(0);
            setShowDiv(obtainStyledAttributes.getBoolean(3, true));
            setSelect(obtainStyledAttributes.getBoolean(2, false));
            obtainStyledAttributes.recycle();
        }
        DmtTextView dmtTextView = (DmtTextView) m120700b(R.id.text);
        C7573i.m23582a((Object) dmtTextView, "text");
        dmtTextView.setText(this.f98381g);
        if (TextUtils.isEmpty(this.f98382h)) {
            DmtTextView dmtTextView2 = (DmtTextView) m120700b(R.id.a7e);
            C7573i.m23582a((Object) dmtTextView2, "desc");
            dmtTextView2.setVisibility(8);
            return;
        }
        DmtTextView dmtTextView3 = (DmtTextView) m120700b(R.id.a7e);
        C7573i.m23582a((Object) dmtTextView3, "desc");
        dmtTextView3.setVisibility(0);
        DmtTextView dmtTextView4 = (DmtTextView) m120700b(R.id.a7e);
        C7573i.m23582a((Object) dmtTextView4, "desc");
        dmtTextView4.setText(this.f98382h);
    }

    public /* synthetic */ ChooseOneOfMultiItemView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
