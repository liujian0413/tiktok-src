package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39826a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.c */
public final class C39235c extends Dialog {

    /* renamed from: a */
    public Animatable f101723a;

    /* renamed from: b */
    private final RemoteImageView f101724b;

    /* renamed from: c */
    private boolean f101725c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.c$a */
    public static final class C39236a extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ C39235c f101726a;

        /* renamed from: b */
        final /* synthetic */ boolean f101727b;

        C39236a(C39235c cVar, boolean z) {
            this.f101726a = cVar;
            this.f101727b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            this.f101726a.f101723a = animatable;
            if (this.f101727b && animatable != null) {
                animatable.start();
            }
        }
    }

    public final void show() {
        m125243a();
        super.show();
    }

    /* renamed from: a */
    private final void m125243a() {
        if (!this.f101725c) {
            if (this.f101723a == null) {
                m125245a(true);
            } else {
                Animatable animatable = this.f101723a;
                if (animatable != null) {
                    animatable.start();
                }
            }
            this.f101725c = true;
        }
    }

    public final void dismiss() {
        this.f101724b.clearAnimation();
        Animatable animatable = this.f101723a;
        if (animatable != null) {
            animatable.stop();
        }
        this.f101725c = false;
        C39237d.m125247a(this);
    }

    public C39235c(Context context) {
        C7573i.m23587b(context, "context");
        super(context, R.style.hi);
        setContentView(R.layout.ab8);
        View findViewById = findViewById(R.id.b9t);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.iv_guide_animation)");
        this.f101724b = (RemoteImageView) findViewById;
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        m125245a(false);
    }

    /* renamed from: a */
    private final void m125245a(boolean z) {
        ImageRequest[] a = C39826a.m127520a("asset:///stickpoint_switch_music_loading.gif", false, Config.ARGB_8888);
        C7573i.m23582a((Object) a, "AlphaFrescoHelper.create… Bitmap.Config.ARGB_8888)");
        this.f101724b.setController(((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32751c(true)).mo32746a((REQUEST[]) a)).mo32743a((C13401d<? super INFO>) new C39236a<Object>(this, z))).mo32730f());
    }
}
