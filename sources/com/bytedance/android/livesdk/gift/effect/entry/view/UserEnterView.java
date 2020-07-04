package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.support.p022v4.graphics.C0721a;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.utils.C3404s.C3406b;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8026a;
import com.bytedance.android.livesdk.gift.effect.normal.utils.C8057a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class UserEnterView extends View {
    private static final int COLOR_ALPHA_128 = 128;
    private static final int COLOR_ALPHA_180 = 180;
    private static final int COLOR_ALPHA_240 = 240;
    private static final float COLOR_POSITION_05 = 0.5f;
    private static final int LIGHT_MASK_HEIGHT = 7;
    private static final int LIGHT_MASK_WIDTH = 30;
    private static final float LIGHT_MATRIX_TRANSLATE_STEP = 30.0f;
    private static final float LINE_MATRIX_TRANSLATE_STEP = 60.0f;
    private static final int LINE_STEP = 6;
    private static final float MATRIX_TRANSLATE_RAGE = 1.5f;
    private static final int NUM_1 = 1;
    private static final int NUM_2 = 2;
    private static final int NUM_3 = 3;
    private static final int NUM_4 = 4;
    private static final int NUM_5 = 5;
    private static final float PATH_START_ANGLE = 90.0f;
    private static final float PATH_SWEEP_ANGLE = 180.0f;
    private static final int POST_DELAY_TIME = 20;
    private static final int USER_LEVEL_32 = 32;
    private int baseLineY;
    private Bitmap bgBitmap;
    private RectF bgRectF;
    private Paint clearPaint;
    private ComposeShader composeLightShader;
    private int descTextColor;
    private String descriptionStr;
    private int grade;
    public Bitmap honorLevelBm;
    private RectF honorLevelDrawRect;
    public Rect honorLevelRect;
    private float honorPaddingLeft;
    private float honorPaddingTop;
    private boolean isPlayLight;
    private boolean isPlayLine;
    private boolean isRTL;
    private boolean isStopDraw;
    private Bitmap lightComposeBm;
    private Canvas lightComposeCanvas;
    private Shader lightMaskShader;
    private Shader lightShader;
    private Bitmap lineBitmap;
    private Shader lineBitmapShader;
    private Canvas lineCanvas;
    private int lineColor;
    private Paint linePaint;
    private Shader lineShader;
    private Matrix mGradientMatrix;
    private float mLightTranslate;
    private Matrix mLineMatrix;
    private float mLineTranslate;
    private Paint mPaint;
    private Path mPathBg;
    private NinePatch ninePatch;
    private Bitmap starBm;
    private RectF starDrawRect;
    private float starPadding;
    private Rect starRect;
    private Paint textPaint;
    private float textWidth;
    private float viewHeight;
    private float viewWidth;

    public void stopDraw() {
        this.isStopDraw = true;
    }

    private float measureViewHeight() {
        return getResources().getDimension(R.dimen.ti);
    }

    public void playAnim() {
        if (this.grade == 2) {
            playLineAnim();
        } else {
            playLightAnim();
        }
    }

    private float measureViewWidth() {
        float dimension = getResources().getDimension(R.dimen.tr);
        this.textPaint.setTextSize(getResources().getDimension(R.dimen.tl));
        float dimension2 = getResources().getDimension(R.dimen.tn) + dimension + dimension + this.textPaint.measureText(this.descriptionStr) + dimension + getResources().getDimension(R.dimen.tt) + dimension;
        if (dimension2 <= getResources().getDimension(R.dimen.tj)) {
            dimension2 = getResources().getDimension(R.dimen.tj);
        }
        this.textPaint.setTextAlign(Align.LEFT);
        FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        float f = fontMetrics.top;
        this.baseLineY = ((int) ((this.viewHeight - f) - fontMetrics.bottom)) / 2;
        this.textWidth = getResources().getDimension(R.dimen.tn) + dimension + dimension;
        return dimension2;
    }

    public void playLightAnim() {
        float f;
        if (!this.isPlayLight) {
            this.isPlayLight = true;
            int color = getResources().getColor(R.color.arm);
            int color2 = getResources().getColor(R.color.aro);
            int color3 = getResources().getColor(R.color.arn);
            this.mGradientMatrix = new Matrix();
            if (this.isRTL) {
                f = this.viewWidth;
            } else {
                f = 0.0f;
            }
            this.mLightTranslate = f;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.viewWidth, this.viewHeight, color, color, TileMode.CLAMP);
            this.lightShader = linearGradient;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, LIGHT_MATRIX_TRANSLATE_STEP, 7.0f, new int[]{color3, color2, color3}, new float[]{0.0f, COLOR_POSITION_05, 1.0f}, TileMode.CLAMP);
            this.lightMaskShader = linearGradient2;
            this.composeLightShader = new ComposeShader(this.lightShader, this.lightMaskShader, Mode.DST_ATOP);
            this.lightComposeBm = Bitmap.createBitmap((int) this.viewWidth, (int) this.viewHeight, Config.ARGB_8888);
            this.lightComposeCanvas = new Canvas(this.lightComposeBm);
            invalidate();
        }
    }

    private void initBitmap() {
        this.honorLevelBm = Bitmap.createBitmap((int) getResources().getDimension(R.dimen.tn), (int) getResources().getDimension(R.dimen.tm), Config.ARGB_8888);
        this.honorLevelRect = new Rect(0, 0, this.honorLevelBm.getWidth(), this.honorLevelBm.getHeight());
        this.starBm = BitmapFactory.decodeResource(getResources(), R.drawable.c_u);
        this.starRect = new Rect(0, 0, this.starBm.getWidth(), this.starBm.getHeight());
        this.bgBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.byh);
        byte[] ninePatchChunk = this.bgBitmap.getNinePatchChunk();
        this.bgRectF = new RectF(0.0f, 0.0f, this.viewWidth, this.viewHeight);
        if (this.isRTL) {
            this.starBm = C8057a.m24692c(this.starBm);
            this.bgBitmap = C8057a.m24692c(this.bgBitmap);
            this.starDrawRect = new RectF(this.starPadding, this.starPadding, this.starPadding + getResources().getDimension(R.dimen.tt), this.starPadding + getResources().getDimension(R.dimen.ts));
            this.honorLevelDrawRect = new RectF((this.viewWidth - this.honorPaddingLeft) - getResources().getDimension(R.dimen.tn), this.honorPaddingTop, this.viewWidth - this.honorPaddingLeft, getResources().getDimension(R.dimen.tm) + this.honorPaddingTop);
        } else {
            this.starDrawRect = new RectF((this.viewWidth - this.starPadding) - getResources().getDimension(R.dimen.tt), this.starPadding, this.viewWidth - this.starPadding, this.starPadding + getResources().getDimension(R.dimen.ts));
            this.honorLevelDrawRect = new RectF(this.honorPaddingLeft, this.honorPaddingTop, getResources().getDimension(R.dimen.tn) + this.honorPaddingLeft, getResources().getDimension(R.dimen.tm) + this.honorPaddingTop);
        }
        this.ninePatch = new NinePatch(this.bgBitmap, ninePatchChunk, null);
    }

    public void playLineAnim() {
        float f;
        if (!this.isPlayLine) {
            this.isPlayLine = true;
            this.mLineMatrix = new Matrix();
            if (this.isRTL) {
                f = this.viewWidth;
            } else {
                f = -this.viewWidth;
            }
            this.mLineTranslate = f * 3.0f;
            this.lineColor = getResources().getColor(R.color.arp);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.viewWidth * 4.0f, 0.0f, C0721a.m3067b(this.lineColor, 180), C0721a.m3067b(this.lineColor, 180), TileMode.CLAMP);
            this.lineShader = linearGradient;
            this.lineBitmap = Bitmap.createBitmap((int) (this.viewWidth * 4.0f), (int) this.viewHeight, Config.ARGB_8888);
            this.lineCanvas = new Canvas(this.lineBitmap);
            Bitmap bitmap = this.lineBitmap;
            TileMode tileMode = TileMode.CLAMP;
            this.lineBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            float f2 = this.viewWidth / 4.0f;
            float f3 = this.viewHeight / 4.0f;
            float dimension = getResources().getDimension(R.dimen.tp);
            float dimension2 = getResources().getDimension(R.dimen.to);
            float f4 = f2 * 2.0f;
            float f5 = f3 * 2.0f;
            float f6 = f4 + dimension;
            float f7 = f2 * 1.0f;
            float f8 = f3 * 3.0f;
            float f9 = 0.0f * f2;
            float f10 = f9 + dimension;
            float f11 = f2 * 3.0f;
            float f12 = f3 * 1.0f;
            float f13 = dimension + f11;
            float[] fArr = {f4, f5, f6, f5, f7, f8, f7 + dimension, f8, this.viewWidth + f9, f5, this.viewWidth + f10, f5, f4 + this.viewWidth, f8, f6 + this.viewWidth, f8, this.viewWidth + f11, f12, this.viewWidth + f13, f12, (this.viewWidth * 2.0f) + f9, f8, (this.viewWidth * 2.0f) + f10, f8, (this.viewWidth * 2.0f) + f11, f12, (this.viewWidth * 2.0f) + f13, f12, f9 + (this.viewWidth * 3.0f), f8, f10 + (this.viewWidth * 3.0f), f8, f11 + (this.viewWidth * 3.0f), f12, f13 + (this.viewWidth * 3.0f), f12};
            this.lineCanvas.drawPaint(this.clearPaint);
            this.linePaint.setShader(this.lineShader);
            this.linePaint.setStrokeWidth(dimension2);
            this.lineCanvas.drawLines(fArr, this.linePaint);
            invalidate();
        }
    }

    public UserEnterView(Context context) {
        this(context, null);
    }

    private void init(Context context) {
        this.isRTL = false;
        this.mPathBg = new Path();
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.textPaint = new Paint();
        this.textPaint.setAntiAlias(true);
        this.clearPaint = new Paint();
        this.clearPaint.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.linePaint = new Paint();
        this.linePaint.setAntiAlias(true);
        this.viewWidth = measureViewWidth();
        this.viewHeight = measureViewHeight();
        this.descTextColor = getResources().getColor(R.color.arq);
        this.honorPaddingLeft = getResources().getDimension(R.dimen.tr);
        this.starPadding = getResources().getDimension(R.dimen.tq);
        this.honorPaddingTop = (this.viewHeight - getResources().getDimension(R.dimen.tm)) / 2.0f;
        initBitmap();
        initPath(this.viewWidth, this.viewHeight);
    }

    private void initDescription(String str) {
        this.descriptionStr = str;
        this.textPaint.setTextSize(getResources().getDimension(R.dimen.tl));
        float measureText = this.textPaint.measureText(this.descriptionStr);
        float dimension = getResources().getDimension(R.dimen.tk);
        if (measureText > dimension) {
            while (measureText > dimension) {
                this.descriptionStr = subString(this.descriptionStr, 0, this.descriptionStr.codePointCount(0, this.descriptionStr.length()) - 1);
                measureText = this.textPaint.measureText(this.descriptionStr);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.descriptionStr);
            sb.append("…");
            this.descriptionStr = sb.toString();
        }
        if (this.grade == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.descriptionStr);
            sb2.append(" ");
            sb2.append(getResources().getString(R.string.eje));
            this.descriptionStr = sb2.toString();
            this.descTextColor = getResources().getColor(R.color.arp);
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.descriptionStr);
        sb3.append(" ");
        sb3.append(getResources().getString(R.string.ejf));
        this.descriptionStr = sb3.toString();
        this.descTextColor = getResources().getColor(R.color.arq);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.isStopDraw) {
            this.ninePatch.draw(canvas, this.bgRectF);
            this.mPaint.reset();
            this.mPaint.setAntiAlias(true);
            canvas.drawBitmap(this.honorLevelBm, this.honorLevelRect, this.honorLevelDrawRect, this.mPaint);
            this.textPaint.setColor(this.descTextColor);
            canvas.drawText(this.descriptionStr, this.textWidth, (float) this.baseLineY, this.textPaint);
            canvas.drawBitmap(this.starBm, this.starRect, this.starDrawRect, this.mPaint);
            if (this.isPlayLight) {
                this.lightComposeCanvas.drawPaint(this.clearPaint);
                if (this.isRTL) {
                    this.mLightTranslate -= LIGHT_MATRIX_TRANSLATE_STEP;
                } else {
                    this.mLightTranslate += LIGHT_MATRIX_TRANSLATE_STEP;
                }
                this.mGradientMatrix.setTranslate(this.mLightTranslate, 0.0f);
                this.lightMaskShader.setLocalMatrix(this.mGradientMatrix);
                this.composeLightShader = new ComposeShader(this.lightShader, this.lightMaskShader, Mode.DST_ATOP);
                this.mPaint.setShader(this.composeLightShader);
                this.lightComposeCanvas.drawPath(this.mPathBg, this.mPaint);
                this.mPaint.setAlpha(128);
                canvas.drawBitmap(this.lightComposeBm, 0.0f, 0.0f, this.mPaint);
                if (this.mLightTranslate >= this.viewWidth * MATRIX_TRANSLATE_RAGE) {
                    this.isPlayLight = false;
                    this.mLightTranslate = (-this.viewWidth) / 2.0f;
                }
            }
            if (this.isPlayLine) {
                if (this.isRTL) {
                    this.mLineTranslate -= LINE_MATRIX_TRANSLATE_STEP;
                } else {
                    this.mLineTranslate += LINE_MATRIX_TRANSLATE_STEP;
                }
                this.mLineMatrix.setTranslate(this.mLineTranslate, 0.0f);
                this.lineBitmapShader.setLocalMatrix(this.mLineMatrix);
                this.mPaint.setAlpha(COLOR_ALPHA_240);
                this.mPaint.setShader(this.lineBitmapShader);
                canvas.drawPath(this.mPathBg, this.mPaint);
                if (this.mLineTranslate >= this.viewWidth * 4.0f) {
                    this.isPlayLine = false;
                    this.mLineTranslate = -this.viewWidth;
                }
            }
            if ((this.isPlayLight || this.isPlayLine) && (this.mLightTranslate <= this.viewWidth * MATRIX_TRANSLATE_RAGE || this.mLineTranslate <= this.viewWidth * 4.0f)) {
                postInvalidateDelayed(20);
            }
        }
    }

    public void setupUI(C8026a aVar) {
        this.grade = aVar.f21787k;
        initDescription(aVar.f21778b);
        this.viewWidth = measureViewWidth();
        this.viewHeight = measureViewHeight();
        if (this.grade == 0) {
            this.bgBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.byi);
            this.starBm = BitmapFactory.decodeResource(getResources(), R.drawable.c_u);
        } else if (this.grade == 2) {
            this.bgBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.byg);
            this.starBm = BitmapFactory.decodeResource(getResources(), R.drawable.c_t);
        } else {
            this.bgBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.byh);
            this.starBm = BitmapFactory.decodeResource(getResources(), R.drawable.c_u);
        }
        byte[] ninePatchChunk = this.bgBitmap.getNinePatchChunk();
        this.bgRectF = new RectF(0.0f, 0.0f, this.viewWidth, this.viewHeight);
        if (this.isRTL) {
            this.starBm = C8057a.m24692c(this.starBm);
            this.bgBitmap = C8057a.m24692c(this.bgBitmap);
            this.starDrawRect = new RectF(this.starPadding, this.starPadding, this.starPadding + getResources().getDimension(R.dimen.tt), this.starPadding + getResources().getDimension(R.dimen.ts));
            this.honorLevelDrawRect = new RectF((this.viewWidth - this.honorPaddingLeft) - getResources().getDimension(R.dimen.tn), this.honorPaddingTop, this.viewWidth - this.honorPaddingLeft, getResources().getDimension(R.dimen.tm) + this.honorPaddingTop);
        } else {
            this.starDrawRect = new RectF((this.viewWidth - this.starPadding) - getResources().getDimension(R.dimen.tt), this.starPadding, this.viewWidth - this.starPadding, this.starPadding + getResources().getDimension(R.dimen.ts));
            this.honorLevelDrawRect = new RectF(this.honorPaddingLeft, this.honorPaddingTop, getResources().getDimension(R.dimen.tn) + this.honorPaddingLeft, getResources().getDimension(R.dimen.tm) + this.honorPaddingTop);
        }
        this.ninePatch = new NinePatch(this.bgBitmap, ninePatchChunk, null);
        if (this.grade == 0) {
            this.honorLevelBm = BitmapFactory.decodeResource(getResources(), R.drawable.cc5);
            this.honorLevelRect = new Rect(0, 0, this.honorLevelBm.getWidth(), this.honorLevelBm.getHeight());
        } else {
            C3393m.m12629a(aVar.f21785i, 0, 0, (C3406b) new C3406b() {
                /* renamed from: a */
                public final void mo10311a(Bitmap bitmap) {
                    if (bitmap != null) {
                        UserEnterView.this.honorLevelBm = bitmap;
                        UserEnterView.this.honorLevelRect = new Rect(0, 0, UserEnterView.this.honorLevelBm.getWidth(), UserEnterView.this.honorLevelBm.getHeight());
                    }
                }
            });
        }
        initPath(this.viewWidth, this.viewHeight);
        requestLayout();
    }

    public UserEnterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.viewWidth = measureViewWidth();
        this.viewHeight = measureViewHeight();
        setMeasuredDimension((int) this.viewWidth, (int) this.viewHeight);
    }

    private void initPath(float f, float f2) {
        int i = ((int) f2) / 2;
        float f3 = f2 - 1.0f;
        RectF rectF = new RectF(1.0f, 1.0f, f3, f3);
        this.mPathBg.moveTo(f, 1.0f);
        this.mPathBg.lineTo((float) i, 1.0f);
        this.mPathBg.arcTo(rectF, PATH_START_ANGLE, PATH_SWEEP_ANGLE, true);
        this.mPathBg.lineTo(f, 1.0f);
        this.mPathBg.lineTo(f, f3);
        this.mPathBg.close();
    }

    private String subString(String str, int i, int i2) {
        return str.substring(str.offsetByCodePoints(0, i), str.offsetByCodePoints(0, i2));
    }

    public UserEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.descriptionStr = "";
        init(context);
    }
}
