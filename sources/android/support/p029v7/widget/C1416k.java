package android.support.p029v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.p022v4.graphics.drawable.C0733f;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;

/* renamed from: android.support.v7.widget.k */
class C1416k {

    /* renamed from: b */
    private static final int[] f5514b = {16843067, 16843068};

    /* renamed from: a */
    public Bitmap f5515a;

    /* renamed from: c */
    private final ProgressBar f5516c;

    /* renamed from: a */
    private static Shape mo6549a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    C1416k(ProgressBar progressBar) {
        this.f5516c = progressBar;
    }

    /* renamed from: a */
    private Drawable m7009a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m7010a(animationDrawable.getFrame(i), true);
            a.setLevel(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
        return animationDrawable2;
    }

    /* renamed from: a */
    private Drawable m7010a(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof C0733f) {
            C0733f fVar = (C0733f) drawable;
            Drawable a = fVar.mo2904a();
            if (a != null) {
                fVar.mo2905a(m7010a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id == 16908301 || id == 16908303) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawableArr[i] = m7010a(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f5515a == null) {
                this.f5515a = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo6549a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6548a(AttributeSet attributeSet, int i) {
        C1365av a = C1365av.m6744a(this.f5516c.getContext(), attributeSet, f5514b, i, 0);
        Drawable b = a.mo6396b(0);
        if (b != null) {
            this.f5516c.setIndeterminateDrawable(m7009a(b));
        }
        Drawable b2 = a.mo6396b(1);
        if (b2 != null) {
            this.f5516c.setProgressDrawable(m7010a(b2, false));
        }
        a.mo6393a();
    }
}
