package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard */
public final class VideoFloatingCard extends LinearLayout {

    /* renamed from: a */
    private TextView f75836a;

    /* renamed from: b */
    private TextView f75837b;

    /* renamed from: c */
    private RemoteImageView f75838c;

    /* renamed from: d */
    private ImageView f75839d;

    /* renamed from: e */
    private FrameLayout f75840e;

    /* renamed from: f */
    private TextView f75841f;

    /* renamed from: g */
    private ImageView f75842g;

    /* renamed from: h */
    private RemoteImageView f75843h;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard$a */
    static final class C28753a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f75844a;

        C28753a(Runnable runnable) {
            this.f75844a = runnable;
        }

        public final void run() {
            Runnable runnable = this.f75844a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard$b */
    static final class C28754b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f75845a;

        C28754b(Runnable runnable) {
            this.f75845a = runnable;
        }

        public final void run() {
            Runnable runnable = this.f75845a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard$c */
    static final class C28755c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f75846a;

        C28755c(Runnable runnable) {
            this.f75846a = runnable;
        }

        public final void run() {
            Runnable runnable = this.f75846a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard$d */
    static final class C28756d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f75847a;

        C28756d(Runnable runnable) {
            this.f75847a = runnable;
        }

        public final void run() {
            Runnable runnable = this.f75847a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final FrameLayout getButton() {
        FrameLayout frameLayout = this.f75840e;
        if (frameLayout == null) {
            C7573i.m23583a("actionButton");
        }
        return frameLayout;
    }

    public final ImageView getCloseView() {
        ImageView imageView = this.f75839d;
        if (imageView == null) {
            C7573i.m23583a("closeView");
        }
        return imageView;
    }

    /* renamed from: a */
    private final void m94674a() {
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.b4u, this, true);
        View findViewById = findViewById(R.id.e3f);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.tv_title)");
        this.f75836a = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.dt5);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.tv_desc)");
        this.f75837b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.b_a);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.iv_icon)");
        this.f75838c = (RemoteImageView) findViewById3;
        View findViewById4 = findViewById(R.id.b7g);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.iv_close)");
        this.f75839d = (ImageView) findViewById4;
        View findViewById5 = findViewById(R.id.pn);
        C7573i.m23582a((Object) findViewById5, "findViewById(R.id.btn_action)");
        this.f75840e = (FrameLayout) findViewById5;
        View findViewById6 = findViewById(R.id.dr2);
        C7573i.m23582a((Object) findViewById6, "findViewById(R.id.tv_btn_title)");
        this.f75841f = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.b6b);
        C7573i.m23582a((Object) findViewById7, "findViewById(R.id.iv_background)");
        this.f75842g = (ImageView) findViewById7;
        View findViewById8 = findViewById(R.id.b6t);
        C7573i.m23582a((Object) findViewById8, "findViewById(R.id.iv_button_bg)");
        this.f75843h = (RemoteImageView) findViewById8;
    }

    /* renamed from: a */
    public final void mo73950a(long j) {
        m94675b(j, null, null);
    }

    public VideoFloatingCard(Context context) {
        C7573i.m23587b(context, "context");
        this(context, null);
    }

    public final void setButtonBackground(UrlModel urlModel) {
        RemoteImageView remoteImageView = this.f75843h;
        if (remoteImageView == null) {
            C7573i.m23583a("ivButtonBackground");
        }
        C23323e.m76524b(remoteImageView, urlModel);
    }

    public final void setButtonText(CharSequence charSequence) {
        TextView textView = this.f75841f;
        if (textView == null) {
            C7573i.m23583a("actionTitleView");
        }
        textView.setText(charSequence);
    }

    public final void setDesc(CharSequence charSequence) {
        TextView textView = this.f75837b;
        if (textView == null) {
            C7573i.m23583a("descView");
        }
        textView.setText(charSequence);
    }

    public final void setIcon(UrlModel urlModel) {
        RemoteImageView remoteImageView = this.f75838c;
        if (remoteImageView == null) {
            C7573i.m23583a("iconView");
        }
        C23323e.m76524b(remoteImageView, urlModel);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.f75836a;
        if (textView == null) {
            C7573i.m23583a("titleView");
        }
        textView.setText(charSequence);
    }

    public final void setButtonBackgroundColors(int[] iArr) {
        C7573i.m23587b(iArr, "colors");
        GradientDrawable gradientDrawable = new GradientDrawable();
        float a = (float) C23486n.m77122a(2.0d);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, a, a, a, a});
        gradientDrawable.setOrientation(Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(iArr);
        FrameLayout frameLayout = this.f75840e;
        if (frameLayout == null) {
            C7573i.m23583a("actionButton");
        }
        frameLayout.setBackground(gradientDrawable);
    }

    public VideoFloatingCard(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        m94674a();
    }

    /* renamed from: b */
    private void m94675b(long j, Runnable runnable, Runnable runnable2) {
        animate().translationX(0.0f).alpha(1.0f).withStartAction(new C28755c(null)).setDuration(j).withEndAction(new C28756d(null)).start();
    }

    /* renamed from: a */
    public final void mo73951a(long j, Runnable runnable, Runnable runnable2) {
        animate().translationX(-((float) C23487o.m77157d(this).right)).alpha(0.0f).withStartAction(new C28753a(null)).setDuration(j).withEndAction(new C28754b(runnable2)).start();
    }
}
