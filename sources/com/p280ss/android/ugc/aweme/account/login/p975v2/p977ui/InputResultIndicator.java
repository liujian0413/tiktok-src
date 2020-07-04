package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.account.R$styleable;
import com.p280ss.android.ugc.aweme.account.util.C22333l;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator */
public final class InputResultIndicator extends LinearLayout {

    /* renamed from: a */
    public static final C22042a f58939a = new C22042a(null);

    /* renamed from: b */
    private View f58940b;

    /* renamed from: c */
    private View f58941c;

    /* renamed from: d */
    private ImageView f58942d;

    /* renamed from: e */
    private TextView f58943e;

    /* renamed from: f */
    private int f58944f;

    /* renamed from: g */
    private int f58945g;

    /* renamed from: h */
    private int f58946h;

    /* renamed from: i */
    private int f58947i;

    /* renamed from: j */
    private int f58948j;

    /* renamed from: k */
    private boolean f58949k;

    /* renamed from: l */
    private int f58950l;

    /* renamed from: m */
    private int f58951m;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator$a */
    public static final class C22042a {
        private C22042a() {
        }

        public /* synthetic */ C22042a(C7571f fVar) {
            this();
        }
    }

    public InputResultIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo58394a() {
        this.f58940b.setBackgroundColor(this.f58945g);
        this.f58941c.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo58396b() {
        this.f58940b.setVisibility(0);
        this.f58940b.setBackgroundColor(this.f58946h);
        this.f58941c.setVisibility(8);
    }

    /* renamed from: c */
    private final void m73334c() {
        if (this.f58950l != -1) {
            LayoutParams layoutParams = this.f58941c.getLayoutParams();
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).topMargin = this.f58950l;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        int i = 0;
        if (this.f58951m != -1) {
            this.f58943e.setTextSize(0, (float) this.f58951m);
        }
        C22333l.m73935a(this.f58940b, this.f58944f);
        if (m73333a(this.f58948j)) {
            this.f58942d.setImageResource(this.f58948j);
        }
        this.f58943e.setTextColor(this.f58947i);
        View view = this.f58940b;
        if (!this.f58949k) {
            i = 8;
        }
        view.setVisibility(i);
        mo58394a();
    }

    /* renamed from: a */
    private final boolean m73333a(int i) {
        try {
            return C7573i.m23585a((Object) getResources().getResourceTypeName(i), (Object) "drawable");
        } catch (NotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo58395a(String str) {
        C7573i.m23587b(str, "text");
        m73332a(str, 0, this.f58949k);
    }

    /* renamed from: a */
    private void m73332a(String str, int i, boolean z) {
        C7573i.m23587b(str, "text");
        if (m73333a(0)) {
            this.f58942d.setImageResource(0);
        }
        if (z) {
            this.f58940b.setVisibility(0);
            this.f58940b.setBackgroundColor(this.f58946h);
        } else {
            this.f58940b.setVisibility(8);
        }
        this.f58941c.setVisibility(0);
        this.f58943e.setText(str);
    }

    public InputResultIndicator(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f58949k = true;
        this.f58950l = -1;
        this.f58951m = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.InputResultIndicator);
        this.f58944f = obtainStyledAttributes.getDimensionPixelSize(1, C23486n.m77122a(0.5d));
        this.f58945g = obtainStyledAttributes.getColor(2, C0683b.m2912c(context, R.color.ai));
        this.f58946h = obtainStyledAttributes.getColor(3, C0683b.m2912c(context, R.color.a14));
        this.f58947i = obtainStyledAttributes.getColor(6, C0683b.m2912c(context, R.color.a14));
        this.f58948j = obtainStyledAttributes.getResourceId(5, R.drawable.avo);
        this.f58949k = obtainStyledAttributes.getBoolean(7, true);
        this.f58950l = obtainStyledAttributes.getDimensionPixelSize(4, -1);
        this.f58951m = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        View.inflate(context, R.layout.ahn, this);
        View findViewById = findViewById(R.id.cse);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.result_indicator_group_line)");
        this.f58940b = findViewById;
        View findViewById2 = findViewById(R.id.csc);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.result_indicator_group_content)");
        this.f58941c = findViewById2;
        View findViewById3 = findViewById(R.id.csd);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.result_indicator_group_image)");
        this.f58942d = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.csf);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.result_indicator_group_text)");
        this.f58943e = (TextView) findViewById4;
        m73334c();
    }

    public /* synthetic */ InputResultIndicator(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
