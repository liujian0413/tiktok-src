package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.an */
public final class C39562an extends Dialog {

    /* renamed from: a */
    private ImageView f102729a;

    public final void onBackPressed() {
    }

    public final void dismiss() {
        C39563ao.m126380a(this);
        m126379a(false);
    }

    public final void show() {
        super.show();
        m126379a(true);
    }

    public C39562an(Context context) {
        C7573i.m23587b(context, "context");
        super(context, R.style.hi);
    }

    /* renamed from: a */
    private final void m126379a(boolean z) {
        Context context;
        if (z) {
            ImageView imageView = this.f102729a;
            if (imageView != null) {
                ImageView imageView2 = this.f102729a;
                if (imageView2 != null) {
                    context = imageView2.getContext();
                } else {
                    context = null;
                }
                imageView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.av));
            }
        } else {
            ImageView imageView3 = this.f102729a;
            if (imageView3 != null) {
                imageView3.clearAnimation();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aaw);
        this.f102729a = (ImageView) findViewById(R.id.b_w);
        Window window = getWindow();
        if (window == null) {
            C7573i.m23580a();
        }
        LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        Window window2 = getWindow();
        if (window2 == null) {
            C7573i.m23580a();
        }
        window2.setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        Paint paint = shapeDrawable.getPaint();
        C7573i.m23582a((Object) paint, "drawable.paint");
        paint.setColor(0);
        Window window3 = getWindow();
        if (window3 == null) {
            C7573i.m23580a();
        }
        window3.setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(false);
    }
}
