package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.graphics.drawable.C0727a;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PublishSettingItem */
public class PublishSettingItem extends LinearLayout {

    /* renamed from: a */
    private RemoteImageView f107109a;

    /* renamed from: b */
    private ImageView f107110b;

    /* renamed from: c */
    TextView f107111c;

    /* renamed from: d */
    TextView f107112d;

    /* renamed from: e */
    View f107113e;

    /* renamed from: f */
    TextView f107114f;

    /* renamed from: g */
    View f107115g;

    /* renamed from: h */
    protected ImageView f107116h;

    /* renamed from: i */
    protected SmartImageView f107117i;

    /* renamed from: j */
    public boolean f107118j;

    /* renamed from: k */
    private FrameLayout f107119k;

    public ImageView getIconRight() {
        return this.f107116h;
    }

    public RemoteImageView getLeftDrawableView() {
        return this.f107109a;
    }

    /* renamed from: b */
    public void mo101627b() {
        this.f107119k.setClickable(false);
    }

    public void setEnable(boolean z) {
        this.f107118j = z;
    }

    public PublishSettingItem(Context context) {
        this(context, null);
    }

    public void setDrawableLeft(int i) {
        this.f107109a.setImageResource(i);
    }

    public void setDrawableRight(int i) {
        this.f107116h.setImageResource(i);
    }

    public void setRightIconListener(OnClickListener onClickListener) {
        this.f107119k.setOnClickListener(onClickListener);
    }

    public void setSubtitle(int i) {
        this.f107114f.setText(i);
    }

    public void setSubtitleAlpha(float f) {
        this.f107114f.setAlpha(f);
    }

    public void setTitle(int i) {
        this.f107111c.setText(i);
    }

    public void setTitleSpannable(SpannableString spannableString) {
        this.f107111c.setText(spannableString);
    }

    /* renamed from: a */
    public final void mo101659a(boolean z) {
        int i;
        ImageView imageView = this.f107110b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setDrawableLeft(Drawable drawable) {
        this.f107109a.setImageDrawable(drawable);
    }

    public void setDrawableRight(Drawable drawable) {
        this.f107116h.setImageDrawable(drawable);
    }

    public void setSubtitle(String str) {
        this.f107114f.setText(str);
    }

    public void setTitle(String str) {
        this.f107111c.setText(str);
    }

    public void setSingleLine(boolean z) {
        if (z) {
            this.f107111c.setSingleLine(true);
        } else {
            this.f107111c.setSingleLine(false);
        }
        this.f107111c.setEllipsize(TruncateAt.END);
    }

    public void setSubtitleMaxWidth(int i) {
        this.f107114f.setSingleLine();
        this.f107114f.setEllipsize(TruncateAt.END);
        this.f107114f.setMaxWidth(i);
    }

    public void setTagText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f107112d.setVisibility(0);
            this.f107112d.setText(str);
            this.f107113e.setVisibility(0);
            return;
        }
        this.f107112d.setVisibility(8);
        this.f107113e.setVisibility(8);
    }

    public void setTextHighlight(boolean z) {
        int i;
        if (z) {
            i = C0683b.m2912c(getContext(), R.color.a5d);
        } else {
            i = C0683b.m2912c(getContext(), R.color.a5h);
        }
        this.f107111c.setTextColor(i);
        this.f107114f.setTextColor(i);
    }

    /* renamed from: a */
    public static Drawable m131373a(Drawable drawable, ColorStateList colorStateList) {
        Drawable g = C0727a.m3116g(drawable);
        C0727a.m3105a(g, colorStateList);
        return g;
    }

    public PublishSettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PublishSettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f107118j = true;
        this.f107115g = LayoutInflater.from(context).inflate(R.layout.a16, this);
        this.f107109a = (RemoteImageView) findViewById(R.id.ck0);
        this.f107111c = (TextView) findViewById(R.id.cjx);
        this.f107112d = (TextView) findViewById(R.id.ck3);
        this.f107113e = findViewById(R.id.cjw);
        this.f107114f = (TextView) findViewById(R.id.ck2);
        this.f107110b = (ImageView) findViewById(R.id.cjz);
        this.f107116h = (ImageView) findViewById(R.id.axs);
        this.f107117i = (SmartImageView) findViewById(R.id.ccn);
        this.f107119k = (FrameLayout) findViewById(R.id.ct7);
    }
}
