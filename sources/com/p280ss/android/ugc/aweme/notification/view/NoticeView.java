package com.p280ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.C10778e;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.p280ss.android.ugc.aweme.awemenotice.R$styleable;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.notification.view.NoticeView */
public final class NoticeView extends LinearLayout implements OnClickListener, C10778e {

    /* renamed from: a */
    RemoteImageView f90390a;

    /* renamed from: b */
    ImageView f90391b;

    /* renamed from: c */
    TextView f90392c;

    /* renamed from: d */
    View f90393d;

    /* renamed from: e */
    View f90394e;

    /* renamed from: f */
    private C34640a f90395f;

    /* renamed from: g */
    private int f90396g;

    /* renamed from: com.ss.android.ugc.aweme.notification.view.NoticeView$a */
    public interface C34640a {
        /* renamed from: a */
        void mo87935a();

        /* renamed from: b */
        void mo87936b();
    }

    /* renamed from: a */
    public final void mo25766a(int i) {
    }

    public final TextView getTitleTextView() {
        return this.f90392c;
    }

    public final void setOnInternalClickListener(C34640a aVar) {
        this.f90395f = aVar;
    }

    public NoticeView(Context context) {
        this(context, null);
    }

    public final void setCloseImage(int i) {
        this.f90391b.setImageResource(i);
    }

    public final void setIconImage(int i) {
        this.f90390a.setImageResource(i);
    }

    public final void setTitleText(CharSequence charSequence) {
        this.f90392c.setText(charSequence);
    }

    public final void setTitleTextColor(int i) {
        this.f90392c.setTextColor(i);
    }

    private void setColorMode(int i) {
        if (this.f90396g != i) {
            this.f90396g = i;
            mo25766a(this.f90396g);
        }
    }

    public final void setCloseImage(Bitmap bitmap) {
        this.f90391b.setImageBitmap(bitmap);
    }

    public final void setIconImage(Bitmap bitmap) {
        this.f90390a.setImageBitmap(bitmap);
    }

    public final void setTitleText(String str) {
        this.f90392c.setText(str);
    }

    public final void setIconImage(UrlModel urlModel) {
        C23323e.m76524b(this.f90390a, urlModel);
    }

    public final void setTitleText(int i) {
        this.f90392c.setText(getContext().getResources().getText(i));
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f90395f != null) {
            if (view.getId() == R.id.b7g) {
                this.f90395f.mo87936b();
                return;
            }
            if (view.getId() == R.id.dk9) {
                this.f90395f.mo87935a();
            }
        }
    }

    public NoticeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m111905a(Context context, AttributeSet attributeSet) {
        inflate(context, R.layout.a9h, this);
        this.f90390a = (RemoteImageView) findViewById(R.id.b_a);
        this.f90391b = (ImageView) findViewById(R.id.b7g);
        this.f90392c = (TextView) findViewById(R.id.e3f);
        this.f90393d = findViewById(R.id.dk9);
        this.f90394e = findViewById(R.id.c5c);
        this.f90391b.setOnTouchListener(new C34032a(0.5f, 150, null));
        this.f90393d.setOnTouchListener(new C34032a(0.5f, 150, null));
        this.f90391b.setOnClickListener(this);
        this.f90393d.setOnClickListener(this);
        setColorMode(C6394b.m19903a().f18686a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NoticeView);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            this.f90390a.setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            this.f90391b.setImageDrawable(drawable2);
        }
        this.f90392c.setText(obtainStyledAttributes.getString(3));
        this.f90392c.setTextColor(obtainStyledAttributes.getColor(4, getResources().getColor(R.color.sk)));
        this.f90394e.setBackgroundColor(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.a3z)));
        obtainStyledAttributes.recycle();
    }

    public NoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f90396g = -1;
        m111905a(context, attributeSet);
    }
}
