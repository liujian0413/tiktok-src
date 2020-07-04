package com.p280ss.android.ugc.aweme.discover.p1185ui;

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
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.legacy.common.R$styleable;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.NoticeView */
public final class NoticeView extends LinearLayout implements OnClickListener, C10778e {

    /* renamed from: a */
    RemoteImageView f71065a;

    /* renamed from: b */
    ImageView f71066b;

    /* renamed from: c */
    TextView f71067c;

    /* renamed from: d */
    View f71068d;

    /* renamed from: e */
    View f71069e;

    /* renamed from: f */
    private C26926a f71070f;

    /* renamed from: g */
    private int f71071g;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.NoticeView$a */
    public interface C26926a {
        /* renamed from: a */
        void mo69646a();

        /* renamed from: b */
        void mo69647b();
    }

    /* renamed from: a */
    public final void mo25766a(int i) {
    }

    public final TextView getTitleTextView() {
        return this.f71067c;
    }

    public final void setOnInternalClickListener(C26926a aVar) {
        this.f71070f = aVar;
    }

    public NoticeView(Context context) {
        this(context, null);
    }

    public final void setCloseImage(int i) {
        this.f71066b.setImageResource(i);
    }

    public final void setIconImage(int i) {
        this.f71065a.setImageResource(i);
    }

    public final void setNoticeBackgroundColor(int i) {
        this.f71069e.setBackgroundColor(i);
    }

    public final void setTitleText(CharSequence charSequence) {
        this.f71067c.setText(charSequence);
    }

    public final void setTitleTextColor(int i) {
        this.f71067c.setTextColor(i);
    }

    private void setColorMode(int i) {
        if (this.f71071g != i) {
            this.f71071g = i;
            mo25766a(this.f71071g);
        }
    }

    public final void setCloseImage(Bitmap bitmap) {
        this.f71066b.setImageBitmap(bitmap);
    }

    public final void setIconImage(Bitmap bitmap) {
        this.f71065a.setImageBitmap(bitmap);
    }

    public final void setTitleText(String str) {
        this.f71067c.setText(str);
    }

    public final void setIconImage(UrlModel urlModel) {
        C23323e.m76524b(this.f71065a, urlModel);
    }

    public final void setTitleText(int i) {
        this.f71067c.setText(getContext().getResources().getText(i));
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f71070f != null) {
            if (view.getId() == R.id.b7g) {
                this.f71070f.mo69647b();
                return;
            }
            if (view.getId() == R.id.dk9) {
                this.f71070f.mo69646a();
            }
        }
    }

    public NoticeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m88458a(Context context, AttributeSet attributeSet) {
        inflate(context, R.layout.a9h, this);
        this.f71065a = (RemoteImageView) findViewById(R.id.b_a);
        this.f71066b = (ImageView) findViewById(R.id.b7g);
        this.f71067c = (TextView) findViewById(R.id.e3f);
        this.f71068d = findViewById(R.id.dk9);
        this.f71069e = findViewById(R.id.c5c);
        this.f71066b.setOnTouchListener(new C34032a(0.5f, 150, null));
        this.f71068d.setOnTouchListener(new C34032a(0.5f, 150, null));
        this.f71066b.setOnClickListener(this);
        this.f71068d.setOnClickListener(this);
        setColorMode(C6394b.m19903a().f18686a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NoticeView);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            this.f71065a.setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            this.f71066b.setImageDrawable(drawable2);
        }
        this.f71067c.setText(obtainStyledAttributes.getString(3));
        this.f71067c.setTextColor(obtainStyledAttributes.getColor(4, getResources().getColor(R.color.sk)));
        this.f71069e.setBackgroundColor(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.a3z)));
        obtainStyledAttributes.recycle();
    }

    public NoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f71071g = -1;
        m88458a(context, attributeSet);
    }
}
