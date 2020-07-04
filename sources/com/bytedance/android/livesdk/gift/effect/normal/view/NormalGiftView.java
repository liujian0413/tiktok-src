package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.support.p022v4.graphics.C0721a;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage;
import com.bytedance.android.livesdk.gift.effect.normal.utils.C8057a;
import com.bytedance.android.livesdk.gift.effect.p375a.C7962a;
import com.bytedance.android.livesdk.gift.p373c.C7887f;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class NormalGiftView extends View implements C7962a {
    public static final int ALPHA_00 = 0;
    public static final int ALPHA_180 = 180;
    public static final int ALPHA_255 = 255;
    public static final int INVALIDATE_DELAYED_TIME = 25;
    public static final float MASK_TRANSLATE_MARGIN = 0.2f;
    public static final float MASK_TRANSLATE_STEP = 45.0f;
    public static final int MASK_TRANSLATE_VALUE = 150;
    public static final float SHADER_ANCHOR_09F = 0.9f;
    private Paint alphaPaint;
    private float bgHeight;
    private float bgMarginStart;
    private Paint clearPaint;
    private ComposeShader composeGiftShader;
    private ComposeShader composeLightShader;
    private int endColor;
    private Bitmap giftComposeBm;
    private Canvas giftComposeCanvas;
    private Shader giftMaskShader;
    private NormalGiftMessage giftMsg;
    private BitmapShader giftShader;
    private RectF grayBackgroundRectF;
    private Shader grayShader;
    private boolean isNeedDrawGrayLayer;
    private boolean isPlayLight;
    private boolean isRTL;
    private boolean isStopDraw;
    private Bitmap lightComposeBm;
    private Canvas lightComposeCanvas;
    private Shader lightMaskShader;
    private Shader lightShader;
    private C8061a mBaseGiftView;
    private Matrix mDefaultTranslateMatrix;
    private Bitmap mGiftBaseViewBitmap;
    private float mGiftTranslate;
    private Matrix mGradientMatrix;
    private float mLightTranslate;
    private Paint mPaint;
    private float rectRadio;
    private int startColor;
    private float viewHeight;
    private float viewWidth;
    private RectF wholeBackgroundRectF;

    public NormalGiftMessage getGiftMsg() {
        return this.giftMsg;
    }

    public void stopDraw() {
        this.isStopDraw = true;
    }

    public void playAnimation() {
        if (this.isPlayLight) {
            initLightCanvas();
        }
        invalidate();
    }

    public void resetUI() {
        this.isPlayLight = false;
        this.isStopDraw = false;
        this.isRTL = false;
        this.isNeedDrawGrayLayer = false;
        this.mLightTranslate = 0.0f;
        this.mGiftTranslate = 0.0f;
        if (this.giftComposeCanvas != null) {
            this.giftComposeCanvas.drawPaint(this.clearPaint);
        }
        if (this.lightComposeCanvas != null) {
            this.lightComposeCanvas.drawPaint(this.clearPaint);
        }
        this.mBaseGiftView.mo20984b();
    }

    private void init() {
        this.isRTL = false;
        this.mBaseGiftView = new C8061a(getContext());
        this.mBaseGiftView.setDrawingCacheListener(this);
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.clearPaint = new Paint();
        this.clearPaint.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.alphaPaint = new Paint();
        this.alphaPaint.setAlpha(ALPHA_180);
        this.mGradientMatrix = new Matrix();
        this.mDefaultTranslateMatrix = new Matrix();
        this.mDefaultTranslateMatrix.setTranslate(1.0f, 0.0f);
        this.bgMarginStart = getResources().getDimension(R.dimen.pf);
        this.bgHeight = getResources().getDimension(R.dimen.pe);
        this.rectRadio = getResources().getDimension(R.dimen.pg);
        this.viewWidth = (float) this.mBaseGiftView.getWidth();
        this.viewHeight = (float) this.mBaseGiftView.getHeight();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.viewWidth, this.viewHeight, getResources().getColor(R.color.ajc), getResources().getColor(R.color.ajc), TileMode.CLAMP);
        this.grayShader = linearGradient;
        this.grayShader.setLocalMatrix(this.mDefaultTranslateMatrix);
    }

    private void initLightCanvas() {
        int color;
        int color2;
        if (this.isRTL) {
            this.mLightTranslate = this.viewWidth + 150.0f;
            this.mGiftTranslate = this.viewWidth + 150.0f;
        } else {
            this.mLightTranslate = -(this.viewWidth + 150.0f);
            this.mGiftTranslate = -(this.viewWidth + 150.0f);
        }
        this.giftComposeBm = Bitmap.createBitmap((int) this.viewWidth, (int) this.viewHeight, Config.ARGB_8888);
        this.lightComposeBm = Bitmap.createBitmap((int) this.viewWidth, (int) this.viewHeight, Config.ARGB_8888);
        this.giftComposeCanvas = new Canvas(this.giftComposeBm);
        this.lightComposeCanvas = new Canvas(this.lightComposeBm);
        float f = this.viewHeight / 2.0f;
        float f2 = this.viewWidth;
        float f3 = this.viewHeight / 2.0f;
        if (this.isRTL) {
            color = getResources().getColor(R.color.ajq);
        } else {
            color = getResources().getColor(R.color.ajr);
        }
        int i = color;
        if (this.isRTL) {
            color2 = getResources().getColor(R.color.ajr);
        } else {
            color2 = getResources().getColor(R.color.ajq);
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, f, f2, f3, i, color2, TileMode.CLAMP);
        this.giftMaskShader = linearGradient;
        float f4 = this.viewWidth;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, f4, this.viewHeight, C0721a.m3067b(this.startColor, ALPHA_255), C0721a.m3067b(this.endColor, ALPHA_255), TileMode.CLAMP);
        this.lightShader = linearGradient2;
        float f5 = this.viewHeight / 2.0f;
        float f6 = this.viewWidth;
        LinearGradient linearGradient3 = new LinearGradient(0.0f, f5, f6, this.viewHeight / 2.0f, new int[]{getResources().getColor(R.color.ajq), getResources().getColor(R.color.ajr), getResources().getColor(R.color.ajq)}, new float[]{0.0f, 0.9f, 1.0f}, TileMode.CLAMP);
        this.lightMaskShader = linearGradient3;
        Bitmap bitmap = this.mGiftBaseViewBitmap;
        TileMode tileMode = TileMode.CLAMP;
        this.giftShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.composeGiftShader = new ComposeShader(this.giftShader, this.giftMaskShader, Mode.DST_ATOP);
        this.composeLightShader = new ComposeShader(this.lightShader, this.lightMaskShader, Mode.DST_ATOP);
        this.giftShader.setLocalMatrix(this.mDefaultTranslateMatrix);
        this.lightShader.setLocalMatrix(this.mDefaultTranslateMatrix);
        this.composeGiftShader.setLocalMatrix(this.mDefaultTranslateMatrix);
        this.composeLightShader.setLocalMatrix(this.mDefaultTranslateMatrix);
    }

    public NormalGiftView(Context context) {
        this(context, null);
    }

    private void drawNormalGift(Canvas canvas) {
        canvas.drawBitmap(this.mGiftBaseViewBitmap, 0.0f, 0.0f, this.mPaint);
    }

    public void setOrientation(int i) {
        if (this.mBaseGiftView != null) {
            this.mBaseGiftView.setOrientation(i);
        }
    }

    public void updateDrawingCache(View view) {
        this.mGiftBaseViewBitmap = C8057a.m24689a((View) this.mBaseGiftView);
        if (this.mGiftBaseViewBitmap != null) {
            Bitmap bitmap = this.mGiftBaseViewBitmap;
            TileMode tileMode = TileMode.CLAMP;
            this.giftShader = new BitmapShader(bitmap, tileMode, tileMode);
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.isStopDraw && this.mGiftBaseViewBitmap != null && !this.mGiftBaseViewBitmap.isRecycled()) {
            if (this.isPlayLight) {
                try {
                    drawLightGift(canvas);
                    return;
                } catch (Exception unused) {
                }
            }
            drawNormalGift(canvas);
        }
    }

    private void drawLightGift(Canvas canvas) {
        this.giftComposeCanvas.drawPaint(this.clearPaint);
        this.lightComposeCanvas.drawPaint(this.clearPaint);
        if (this.isRTL) {
            this.mLightTranslate -= 45.0f;
            if (this.mGiftTranslate - this.mLightTranslate >= this.viewWidth * 0.2f) {
                this.mGiftTranslate = this.mLightTranslate + (this.viewWidth * 0.2f);
            }
        } else {
            this.mLightTranslate += 45.0f;
            if (this.mLightTranslate - this.mGiftTranslate >= this.viewWidth * 0.2f) {
                this.mGiftTranslate = this.mLightTranslate - (this.viewWidth * 0.2f);
            }
        }
        if (this.isNeedDrawGrayLayer) {
            this.mPaint.setShader(this.grayShader);
            canvas.drawRoundRect(this.grayBackgroundRectF, this.rectRadio, this.rectRadio, this.mPaint);
        }
        this.mGradientMatrix.setTranslate(this.mGiftTranslate, 0.0f);
        this.giftMaskShader.setLocalMatrix(this.mGradientMatrix);
        this.composeGiftShader = new ComposeShader(this.giftShader, this.giftMaskShader, Mode.DST_IN);
        this.composeGiftShader.setLocalMatrix(this.mDefaultTranslateMatrix);
        this.mPaint.setShader(this.composeGiftShader);
        this.giftComposeCanvas.drawRoundRect(this.wholeBackgroundRectF, this.rectRadio, this.rectRadio, this.mPaint);
        canvas.drawBitmap(this.giftComposeBm, 0.0f, 0.0f, this.alphaPaint);
        this.mGradientMatrix.setTranslate(this.mLightTranslate, 0.0f);
        this.lightMaskShader.setLocalMatrix(this.mGradientMatrix);
        this.composeLightShader = new ComposeShader(this.lightShader, this.lightMaskShader, Mode.DST_ATOP);
        this.composeLightShader.setLocalMatrix(this.mDefaultTranslateMatrix);
        this.mPaint.setShader(this.composeLightShader);
        this.lightComposeCanvas.drawRoundRect(this.grayBackgroundRectF, this.rectRadio, this.rectRadio, this.mPaint);
        canvas.drawBitmap(this.lightComposeBm, 0.0f, 0.0f, this.mPaint);
        if (this.isRTL) {
            if (this.mGiftTranslate >= (-this.viewWidth)) {
                postInvalidateDelayed(25);
            }
        } else if (this.mGiftTranslate <= this.viewWidth) {
            postInvalidateDelayed(25);
        }
    }

    public NormalGiftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.viewWidth = (float) this.mBaseGiftView.getWidth();
        this.viewHeight = (float) this.mBaseGiftView.getHeight();
        setMeasuredDimension((int) this.viewWidth, (int) this.viewHeight);
    }

    public void settingUi(NormalGiftMessage normalGiftMessage, boolean z) {
        this.isRTL = z;
        this.giftMsg = normalGiftMessage;
        if (this.giftMsg.f21929o * this.giftMsg.f21911a > 60) {
            this.isPlayLight = true;
        }
        int[] b = C7887f.m24171a().mo20671b(this.giftMsg.f21929o * this.giftMsg.f21911a);
        this.startColor = getResources().getColor(b[0]);
        this.endColor = getResources().getColor(b[1]);
        this.mBaseGiftView.setUI(normalGiftMessage);
        this.mGiftBaseViewBitmap = C8057a.m24689a((View) this.mBaseGiftView);
        this.viewWidth = (float) this.mBaseGiftView.getWidth();
        this.viewHeight = (float) this.mBaseGiftView.getHeight();
        this.wholeBackgroundRectF = new RectF(0.0f, 0.0f, this.viewWidth, this.viewHeight);
        float f = (this.viewHeight - this.bgHeight) / 2.0f;
        this.grayBackgroundRectF = new RectF(this.bgMarginStart, f, this.viewWidth, this.viewHeight - f);
        requestLayout();
    }

    public NormalGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
