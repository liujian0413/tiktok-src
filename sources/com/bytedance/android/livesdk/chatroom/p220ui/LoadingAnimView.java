package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LoadingAnimView */
public class LoadingAnimView extends FrameLayout {

    /* renamed from: a */
    public Animatable f15073a;

    /* renamed from: b */
    public Animatable f15074b;

    /* renamed from: c */
    public Drawable f15075c;

    /* renamed from: d */
    public Drawable f15076d;

    /* renamed from: e */
    private HSImageView f15077e;

    /* renamed from: f */
    private HSImageView f15078f;

    /* renamed from: g */
    private TextView f15079g;

    /* renamed from: h */
    private String f15080h = "asset://com.ss.android.ies.live.sdk/ttlive_ic_loading_center.webp";

    /* renamed from: i */
    private String f15081i = "asset://com.ss.android.ies.live.sdk/ttlive_ic_loading_point.webp";

    /* renamed from: j */
    private int f15082j = -1;

    /* renamed from: k */
    private boolean f15083k;

    /* renamed from: c */
    public final void mo13377c() {
        this.f15083k = false;
        m16673f();
    }

    /* renamed from: b */
    public final void mo13376b() {
        this.f15083k = true;
        this.f15079g.setVisibility(4);
        m16672e();
    }

    /* renamed from: e */
    private void m16672e() {
        if (this.f15073a != null && !this.f15073a.isRunning()) {
            this.f15073a.start();
            this.f15079g.setVisibility(0);
        }
        if (this.f15074b != null && !this.f15074b.isRunning()) {
            this.f15074b.start();
            this.f15079g.setVisibility(0);
        }
    }

    /* renamed from: f */
    private void m16673f() {
        if (this.f15073a != null && this.f15073a.isRunning()) {
            this.f15073a.stop();
        }
        if (this.f15074b != null && this.f15074b.isRunning()) {
            this.f15074b.stop();
        }
    }

    /* renamed from: a */
    public final void mo13375a() {
        m16670a(this.f15082j);
        if (this.f15083k) {
            m16672e();
        } else {
            m16673f();
        }
    }

    /* renamed from: d */
    private void m16671d() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.axj, this, true);
        this.f15079g = (TextView) inflate.findViewById(R.id.bu4);
        this.f15077e = (HSImageView) inflate.findViewById(R.id.bte);
        this.f15077e.setController(((C13382e) C13380c.m39166a().mo32711a(this.f15080h).mo32743a((C13401d<? super INFO>) new C13400c() {
            public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
                super.onFinalImageSet(str, obj, animatable);
                LoadingAnimView.this.f15073a = animatable;
                if (animatable instanceof Drawable) {
                    LoadingAnimView.this.f15075c = (Drawable) animatable;
                }
                LoadingAnimView.this.mo13375a();
            }
        })).mo32730f());
        this.f15078f = (HSImageView) inflate.findViewById(R.id.bto);
        this.f15078f.setController(((C13382e) C13380c.m39166a().mo32711a(this.f15081i).mo32743a((C13401d<? super INFO>) new C13400c() {
            public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
                super.onFinalImageSet(str, obj, animatable);
                LoadingAnimView.this.f15074b = animatable;
                if (animatable instanceof Drawable) {
                    LoadingAnimView.this.f15076d = (Drawable) animatable;
                }
                LoadingAnimView.this.mo13375a();
            }
        })).mo32730f());
    }

    public void setColor(int i) {
        if (i != 0) {
            this.f15082j = i;
            m16670a(i);
        }
    }

    public LoadingAnimView(Context context) {
        super(context);
        m16671d();
    }

    /* renamed from: a */
    private void m16670a(int i) {
        if (this.f15075c != null) {
            this.f15075c.setColorFilter(i, Mode.SRC_ATOP);
        }
        if (this.f15076d != null) {
            this.f15076d.setColorFilter(i, Mode.SRC_ATOP);
        }
        if (this.f15079g != null) {
            this.f15079g.setTextColor(i);
        }
    }

    public LoadingAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16671d();
    }

    public LoadingAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16671d();
    }
}
