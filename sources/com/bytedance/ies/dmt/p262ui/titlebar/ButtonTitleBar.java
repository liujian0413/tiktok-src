package com.bytedance.ies.dmt.p262ui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
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

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar */
public class ButtonTitleBar extends AbstractTitleBar implements OnClickListener {

    /* renamed from: c */
    private ImageView f28977c;

    /* renamed from: d */
    private DmtTextView f28978d;

    /* renamed from: e */
    private C10797a f28979e;

    /* renamed from: f */
    private Drawable f28980f;

    /* renamed from: g */
    private View f28981g;

    /* renamed from: h */
    private int f28982h;

    public DmtTextView getEndBtn() {
        return this.f28978d;
    }

    public ImageView getStartBtn() {
        return this.f28977c;
    }

    public void setOnTitleBarClickListener(C10797a aVar) {
        this.f28979e = aVar;
    }

    public ButtonTitleBar(Context context) {
        this(context, null);
    }

    public void setDividerLineBackground(int i) {
        this.f28981g.setBackgroundColor(i);
    }

    /* renamed from: a */
    public final void mo25857a(boolean z) {
        int i;
        View view = this.f28981g;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo25766a(int i) {
        int i2;
        ImageView imageView = this.f28977c;
        if (C6394b.m19904a(i)) {
            i2 = R.drawable.cmw;
        } else {
            i2 = R.drawable.cmx;
        }
        imageView.setImageResource(i2);
    }

    public void onClick(View view) {
        if (this.f28979e != null) {
            if (view.getId() == R.id.jo) {
                this.f28979e.mo25895a(view);
            } else if (view.getId() == R.id.ct5) {
                this.f28979e.mo25896b(view);
            }
        }
    }

    /* renamed from: a */
    private void m31554a(Context context) {
        inflate(context, R.layout.b2n, this);
        this.f28977c = (ImageView) findViewById(R.id.jo);
        this.f28975a = (DmtTextView) findViewById(R.id.title);
        this.f28978d = (DmtTextView) findViewById(R.id.ct5);
        this.f28981g = findViewById(R.id.bm2);
        this.f28977c.setOnClickListener(this);
        this.f28978d.setOnClickListener(this);
        C10804a aVar = new C10804a(0.5f, 1.0f);
        this.f28977c.setOnTouchListener(aVar);
        this.f28978d.setOnTouchListener(aVar);
    }

    public ButtonTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m31555a(Context context, AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ButtonTitleBar);
        String string = obtainStyledAttributes.getString(8);
        float dimension = obtainStyledAttributes.getDimension(10, C9738o.m28708b(context, 17.0f));
        int color = obtainStyledAttributes.getColor(9, -15329245);
        this.f28975a.setText(string);
        this.f28975a.setTextSize(0, dimension);
        this.f28975a.setTextColor(color);
        String string2 = obtainStyledAttributes.getString(0);
        int i2 = obtainStyledAttributes.getInt(4, 1);
        float dimension2 = obtainStyledAttributes.getDimension(3, C9738o.m28708b(context, 17.0f));
        int color2 = obtainStyledAttributes.getColor(2, 0);
        this.f28980f = obtainStyledAttributes.getDrawable(1);
        int i3 = obtainStyledAttributes.getInt(5, 0);
        this.f28978d.setText(string2);
        if (i2 == 1) {
            this.f28978d.setTypeface(Typeface.defaultFromStyle(1));
            this.f28978d.setTextColor(getResources().getColor(R.color.auk));
        } else {
            this.f28978d.setTypeface(Typeface.defaultFromStyle(0));
            this.f28978d.setTextColor(getResources().getColor(R.color.axf));
        }
        this.f28978d.setTextSize(0, dimension2);
        if (color2 != 0) {
            this.f28978d.setTextColor(color2);
        }
        if (this.f28980f != null) {
            this.f28978d.setBackground(this.f28980f);
        }
        this.f28978d.setVisibility(i3);
        this.f28981g.setVisibility(obtainStyledAttributes.getInt(7, 0));
        Resources resources = getResources();
        if (C6394b.m19908c()) {
            i = R.color.ax0;
        } else {
            i = R.color.awz;
        }
        this.f28982h = obtainStyledAttributes.getColor(6, resources.getColor(i));
        this.f28981g.setBackgroundColor(this.f28982h);
        obtainStyledAttributes.recycle();
    }

    public ButtonTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m31554a(context);
        if (attributeSet != null) {
            m31555a(context, attributeSet);
        }
        setColorMode(C6394b.m19903a().f18686a);
    }
}
