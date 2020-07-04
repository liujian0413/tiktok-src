package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.fresco.animation.p702a.C13460a;
import com.facebook.fresco.animation.p707c.C13480a;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.splash.C41747l.C41750a;

/* renamed from: com.ss.android.ugc.aweme.views.SpecifiedNumberAnimatedImageView */
public class SpecifiedNumberAnimatedImageView extends RemoteImageView {

    /* renamed from: a */
    public int f112298a = 1;

    public SpecifiedNumberAnimatedImageView(Context context) {
        super(context);
    }

    public SpecifiedNumberAnimatedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo105214a(String str, int i) {
        this.f112298a = 1;
        setController(((C13382e) ((C13382e) C13380c.m39166a().mo32713b(Uri.parse(str)).mo32751c(true)).mo32743a((C13401d<? super INFO>) new C13400c<C13648f>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                super.onFinalImageSet(str, fVar, animatable);
                if (animatable != null) {
                    C13480a aVar = (C13480a) animatable;
                    aVar.mo33016a((C13460a) new C41750a(aVar.f35749a, SpecifiedNumberAnimatedImageView.this.f112298a));
                }
            }
        })).mo32730f());
    }

    public SpecifiedNumberAnimatedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
