package com.bytedance.ies.dmt.p262ui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
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

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar */
public class NormalTitleBar extends AbstractTitleBar implements OnClickListener {

    /* renamed from: c */
    private ImageView f28983c;

    /* renamed from: d */
    private ImageView f28984d;

    /* renamed from: e */
    private C10797a f28985e;

    /* renamed from: f */
    private Drawable f28986f;

    /* renamed from: g */
    private View f28987g;

    /* renamed from: h */
    private int f28988h;

    /* renamed from: i */
    private DmtTextView f28989i;

    public ImageView getEndBtn() {
        return this.f28984d;
    }

    public ImageView getStartBtn() {
        return this.f28983c;
    }

    public void setOnTitleBarClickListener(C10797a aVar) {
        this.f28985e = aVar;
    }

    public NormalTitleBar(Context context) {
        this(context, null);
    }

    public void setDividerLineBackground(int i) {
        this.f28987g.setBackgroundColor(i);
    }

    public void setEndBtnIcon(int i) {
        this.f28984d.setImageResource(i);
    }

    public void setStartBtnIcon(int i) {
        this.f28983c.setImageResource(i);
    }

    public void setStartTextSize(float f) {
        this.f28989i.setTextSize(0, f);
    }

    /* renamed from: a */
    public final void mo25857a(boolean z) {
        int i;
        View view = this.f28987g;
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
        ImageView imageView = this.f28983c;
        if (C6394b.m19904a(i)) {
            i2 = R.drawable.cmw;
        } else {
            i2 = R.drawable.cmx;
        }
        imageView.setImageResource(i2);
    }

    public void setStartText(String str) {
        this.f28983c.setVisibility(8);
        this.f28989i.setVisibility(0);
        this.f28989i.setText(str);
    }

    public void onClick(View view) {
        if (this.f28985e != null) {
            if (view.getId() == R.id.jo || view.getId() == R.id.dhs) {
                this.f28985e.mo25895a(view);
            } else if (view.getId() == R.id.ct5) {
                this.f28985e.mo25896b(view);
            }
        }
    }

    /* renamed from: a */
    private void m31558a(Context context) {
        inflate(context, R.layout.b3p, this);
        this.f28983c = (ImageView) findViewById(R.id.jo);
        this.f28975a = (DmtTextView) findViewById(R.id.title);
        this.f28984d = (ImageView) findViewById(R.id.ct5);
        this.f28987g = findViewById(R.id.bm2);
        this.f28989i = (DmtTextView) findViewById(R.id.dhs);
        this.f28983c.setOnClickListener(this);
        this.f28984d.setOnClickListener(this);
        this.f28989i.setOnClickListener(this);
        C10804a aVar = new C10804a(0.5f, 1.0f);
        this.f28983c.setOnTouchListener(aVar);
        this.f28984d.setOnTouchListener(aVar);
        this.f28989i.setOnTouchListener(aVar);
    }

    public NormalTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m31559a(Context context, AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NormalTitleBar);
        String string = obtainStyledAttributes.getString(3);
        float dimension = obtainStyledAttributes.getDimension(5, C9738o.m28708b(context, 17.0f));
        int color = obtainStyledAttributes.getColor(4, -15329245);
        this.f28975a.setText(string);
        this.f28975a.setTextSize(0, dimension);
        this.f28975a.setTextColor(color);
        this.f28986f = obtainStyledAttributes.getDrawable(0);
        if (this.f28986f != null) {
            this.f28984d.setImageDrawable(this.f28986f);
        }
        this.f28987g.setVisibility(obtainStyledAttributes.getInt(2, 0));
        Resources resources = getResources();
        if (C6394b.m19908c()) {
            i = R.color.ax0;
        } else {
            i = R.color.awz;
        }
        this.f28988h = obtainStyledAttributes.getColor(1, resources.getColor(i));
        this.f28987g.setBackgroundColor(this.f28988h);
        obtainStyledAttributes.recycle();
    }

    public NormalTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m31558a(context);
        if (attributeSet != null) {
            m31559a(context, attributeSet);
        }
        setColorMode(C6394b.m19903a().f18686a);
    }
}
