package com.bytedance.ies.dmt.p262ui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.C10804a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.TextTitleBar */
public class TextTitleBar extends AbstractTitleBar implements OnClickListener {

    /* renamed from: c */
    public boolean f28990c;

    /* renamed from: d */
    private DmtTextView f28991d;

    /* renamed from: e */
    private DmtTextView f28992e;

    /* renamed from: f */
    private C10797a f28993f;

    /* renamed from: g */
    private ImageView f28994g;

    /* renamed from: h */
    private View f28995h;

    /* renamed from: i */
    private int f28996i;

    public ImageView getBackBtn() {
        return this.f28994g;
    }

    public DmtTextView getEndText() {
        return this.f28992e;
    }

    public DmtTextView getStartText() {
        return this.f28991d;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f28975a.setMaxWidth((int) Math.max((float) (((C9738o.m28691a(getContext()) / 2) - Math.max(this.f28991d.getMeasuredWidth(), this.f28992e.getMeasuredWidth())) * 2), C9738o.m28708b(getContext(), 112.0f)));
    }

    public void setOnTitleBarClickListener(C10797a aVar) {
        this.f28993f = aVar;
    }

    public TextTitleBar(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public final void mo25878b(boolean z) {
        this.f28995h.setVisibility(8);
    }

    public void setDividerLineBackground(int i) {
        this.f28995h.setBackgroundColor(i);
    }

    public void setEndText(int i) {
        this.f28992e.setText(i);
    }

    public void setEndTextColor(int i) {
        this.f28992e.setTextColor(i);
    }

    public void setEndTextSize(float f) {
        this.f28992e.setTextSize(f);
    }

    public void setLineBackground(int i) {
        this.f28995h.setBackgroundColor(i);
    }

    public void setStartText(int i) {
        this.f28991d.setText(i);
    }

    public void setStartTextColor(int i) {
        this.f28991d.setTextColor(i);
    }

    public void setStartTextSize(float f) {
        this.f28991d.setTextSize(f);
    }

    /* renamed from: a */
    public final void mo25857a(boolean z) {
        int i;
        View view = this.f28995h;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setEndText(CharSequence charSequence) {
        this.f28992e.setText(charSequence);
    }

    public void setStartText(CharSequence charSequence) {
        this.f28991d.setText(charSequence);
    }

    /* renamed from: a */
    public final void mo25766a(int i) {
        int i2;
        ImageView imageView = this.f28994g;
        if (C6394b.m19904a(i)) {
            i2 = R.drawable.cmw;
        } else {
            i2 = R.drawable.cmx;
        }
        imageView.setImageResource(i2);
    }

    public void onClick(View view) {
        if (this.f28993f != null) {
            if (view.getId() == R.id.jo || view.getId() == R.id.dhs) {
                this.f28993f.mo25895a(view);
            } else if (view.getId() == R.id.di4) {
                this.f28993f.mo25896b(view);
            }
        }
    }

    public void setUseBackIcon(boolean z) {
        int i;
        if (this.f28990c != z) {
            this.f28990c = z;
            ImageView imageView = this.f28994g;
            int i2 = 8;
            if (this.f28990c) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            DmtTextView dmtTextView = this.f28991d;
            if (!this.f28990c) {
                i2 = 0;
            }
            dmtTextView.setVisibility(i2);
        }
    }

    /* renamed from: a */
    private void m31562a(Context context) {
        inflate(context, R.layout.b4m, this);
        this.f28991d = (DmtTextView) findViewById(R.id.dhs);
        this.f28975a = (DmtTextView) findViewById(R.id.title);
        this.f28992e = (DmtTextView) findViewById(R.id.di4);
        this.f28994g = (ImageView) findViewById(R.id.jo);
        this.f28995h = findViewById(R.id.bm2);
        this.f28994g.setOnClickListener(this);
        this.f28991d.setOnClickListener(this);
        this.f28992e.setOnClickListener(this);
        C10804a aVar = new C10804a(0.5f, 1.0f);
        this.f28994g.setOnTouchListener(aVar);
        this.f28991d.setOnTouchListener(aVar);
        this.f28992e.setOnTouchListener(aVar);
    }

    /* renamed from: a */
    private static void m31564a(DmtTextView dmtTextView, int i) {
        dmtTextView.setVisibility(i);
    }

    public TextTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m31563a(Context context, AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TextTitleBar);
        String string = obtainStyledAttributes.getString(10);
        float dimension = obtainStyledAttributes.getDimension(12, C9738o.m28708b(context, 17.0f));
        int color = obtainStyledAttributes.getColor(11, -15329245);
        this.f28975a.setText(string);
        this.f28975a.setTextSize(0, dimension);
        this.f28975a.setTextColor(color);
        this.f28990c = obtainStyledAttributes.getBoolean(13, false);
        if (this.f28990c) {
            this.f28994g.setVisibility(0);
            this.f28991d.setVisibility(8);
        } else {
            String string2 = obtainStyledAttributes.getString(7);
            float dimension2 = obtainStyledAttributes.getDimension(9, C9738o.m28708b(context, 15.0f));
            int color2 = obtainStyledAttributes.getColor(8, -15329245);
            this.f28994g.setVisibility(8);
            this.f28991d.setVisibility(0);
            this.f28991d.setText(string2);
            this.f28991d.setTextSize(0, dimension2);
            this.f28991d.setTextColor(color2);
        }
        String string3 = obtainStyledAttributes.getString(1);
        float dimension3 = obtainStyledAttributes.getDimension(3, C9738o.m28708b(context, 15.0f));
        int color3 = obtainStyledAttributes.getColor(2, -15329245);
        int i2 = obtainStyledAttributes.getInt(4, 0);
        this.f28992e.setText(string3);
        this.f28992e.setTextSize(0, dimension3);
        this.f28992e.setTextColor(color3);
        m31564a(this.f28992e, i2);
        if (obtainStyledAttributes.getInt(0, 1) == 1) {
            this.f28992e.setTypeface(Typeface.defaultFromStyle(1));
            this.f28992e.setTextColor(getResources().getColor(R.color.auk));
        } else {
            this.f28992e.setTypeface(Typeface.defaultFromStyle(0));
            this.f28992e.setTextColor(getResources().getColor(R.color.axf));
        }
        this.f28995h.setVisibility(obtainStyledAttributes.getInt(6, 0));
        Resources resources = getResources();
        if (C6394b.m19908c()) {
            i = R.color.ax0;
        } else {
            i = R.color.awz;
        }
        this.f28996i = obtainStyledAttributes.getColor(5, resources.getColor(i));
        this.f28995h.setBackgroundColor(this.f28996i);
        obtainStyledAttributes.recycle();
    }

    public TextTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m31562a(context);
        if (attributeSet != null) {
            m31563a(context, attributeSet);
        }
        setColorMode(C6394b.m19903a().f18686a);
    }
}
