package com.facebook.imagepipeline.animated.p713b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.BlendOperation;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.DisposalMethod;
import com.facebook.imagepipeline.animated.base.C13538a;

/* renamed from: com.facebook.imagepipeline.animated.b.d */
public final class C13534d {

    /* renamed from: a */
    private final C13538a f35886a;

    /* renamed from: b */
    private final C13536a f35887b;

    /* renamed from: c */
    private final Paint f35888c = new Paint();

    /* renamed from: com.facebook.imagepipeline.animated.b.d$a */
    public interface C13536a {
        /* renamed from: a */
        C13326a<Bitmap> mo33014a(int i);
    }

    /* renamed from: com.facebook.imagepipeline.animated.b.d$b */
    enum C13537b {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    /* renamed from: a */
    private C13537b m39818a(int i) {
        AnimatedDrawableFrameInfo a = this.f35886a.mo33061a(i);
        DisposalMethod disposalMethod = a.f35901g;
        if (disposalMethod == DisposalMethod.DISPOSE_DO_NOT) {
            return C13537b.REQUIRED;
        }
        if (disposalMethod == DisposalMethod.DISPOSE_TO_BACKGROUND) {
            if (m39820a(a)) {
                return C13537b.NOT_REQUIRED;
            }
            return C13537b.REQUIRED;
        } else if (disposalMethod == DisposalMethod.DISPOSE_TO_PREVIOUS) {
            return C13537b.SKIP;
        } else {
            return C13537b.ABORT;
        }
    }

    /* renamed from: b */
    private boolean m39821b(int i) {
        if (i == 0) {
            return true;
        }
        AnimatedDrawableFrameInfo a = this.f35886a.mo33061a(i);
        AnimatedDrawableFrameInfo a2 = this.f35886a.mo33061a(i - 1);
        if (a.f35900f == BlendOperation.NO_BLEND && m39820a(a)) {
            return true;
        }
        if (a2.f35901g != DisposalMethod.DISPOSE_TO_BACKGROUND || !m39820a(a2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m39820a(AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        if (animatedDrawableFrameInfo.f35896b == 0 && animatedDrawableFrameInfo.f35897c == 0 && animatedDrawableFrameInfo.f35898d == this.f35886a.mo33068e() && animatedDrawableFrameInfo.f35899e == this.f35886a.mo33069f()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m39819a(Canvas canvas, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        canvas.drawRect((float) animatedDrawableFrameInfo.f35896b, (float) animatedDrawableFrameInfo.f35897c, (float) (animatedDrawableFrameInfo.f35896b + animatedDrawableFrameInfo.f35898d), (float) (animatedDrawableFrameInfo.f35897c + animatedDrawableFrameInfo.f35899e), this.f35888c);
    }

    public C13534d(C13538a aVar, C13536a aVar2) {
        this.f35886a = aVar;
        this.f35887b = aVar2;
        this.f35888c.setColor(0);
        this.f35888c.setStyle(Style.FILL);
        this.f35888c.setXfermode(new PorterDuffXfermode(Mode.SRC));
    }

    /* renamed from: a */
    private int m39817a(int i, Canvas canvas) {
        while (i >= 0) {
            switch (m39818a(i)) {
                case REQUIRED:
                    AnimatedDrawableFrameInfo a = this.f35886a.mo33061a(i);
                    C13326a a2 = this.f35887b.mo33014a(i);
                    if (a2 == null) {
                        if (!m39821b(i)) {
                            break;
                        } else {
                            return i;
                        }
                    } else {
                        try {
                            canvas.drawBitmap((Bitmap) a2.mo32609a(), 0.0f, 0.0f, null);
                            if (a.f35901g == DisposalMethod.DISPOSE_TO_BACKGROUND) {
                                m39819a(canvas, a);
                            }
                            return i + 1;
                        } finally {
                            a2.close();
                        }
                    }
                case NOT_REQUIRED:
                    return i + 1;
                case ABORT:
                    return i;
            }
            i--;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo33077a(int i, Bitmap bitmap) {
        int i2;
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, Mode.SRC);
        if (!m39821b(i)) {
            i2 = m39817a(i - 1, canvas);
        } else {
            i2 = i;
        }
        while (i2 < i) {
            AnimatedDrawableFrameInfo a = this.f35886a.mo33061a(i2);
            DisposalMethod disposalMethod = a.f35901g;
            if (disposalMethod != DisposalMethod.DISPOSE_TO_PREVIOUS) {
                if (a.f35900f == BlendOperation.NO_BLEND) {
                    m39819a(canvas, a);
                }
                this.f35886a.mo33063a(i2, canvas);
                if (disposalMethod == DisposalMethod.DISPOSE_TO_BACKGROUND) {
                    m39819a(canvas, a);
                }
            }
            i2++;
        }
        AnimatedDrawableFrameInfo a2 = this.f35886a.mo33061a(i);
        if (a2.f35900f == BlendOperation.NO_BLEND) {
            m39819a(canvas, a2);
        }
        this.f35886a.mo33063a(i, canvas);
    }
}
