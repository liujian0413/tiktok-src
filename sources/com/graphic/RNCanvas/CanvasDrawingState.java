package com.graphic.RNCanvas;

import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint.Align;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public class CanvasDrawingState {
    public int[] fillStyle;
    public float globalAlpha;
    public float lineDashOffset;
    public LinearGradient mLinearGradient;
    public float miterLimit;
    private String primitiveLineCap;
    private float[] primitiveLineDash;
    private String primitiveLineJoin;
    private String primitiveTextAlign;
    public float shadowBlur;
    public int[] shadowColor;
    public float shadowOffsetX;
    public float shadowOffsetY;
    public Cap strokeLineCap;
    public DashPathEffect strokeLineDash;
    public Join strokeLineJoin;
    public float strokeLineWidth;
    public int[] strokeStyle;
    public Align textAlign;
    public int textBaseline;
    public float textSize;

    public CanvasDrawingState() {
        setUp();
    }

    private void setUp() {
        this.globalAlpha = 1.0f;
        this.fillStyle = new int[]{NormalGiftView.ALPHA_255, 0, 0, 0};
        this.strokeStyle = new int[]{NormalGiftView.ALPHA_255, 0, 0, 0};
        this.strokeLineWidth = 1.0f;
        this.strokeLineCap = Cap.BUTT;
        this.strokeLineJoin = Join.MITER;
        this.miterLimit = 0.0f;
        this.lineDashOffset = 0.0f;
        this.strokeLineDash = new DashPathEffect(new float[]{0.0f, 0.0f}, this.lineDashOffset);
        this.textSize = 10.0f;
        this.textBaseline = 0;
        this.textAlign = Align.LEFT;
        this.shadowColor = new int[]{0, 0, 0, 0};
        this.shadowBlur = 0.0f;
        this.shadowOffsetX = 0.0f;
        this.shadowOffsetY = 0.0f;
        this.primitiveTextAlign = "left";
        this.primitiveLineCap = "butt";
        this.primitiveLineJoin = "miter";
        this.primitiveLineDash = new float[]{0.0f, 0.0f};
        this.mLinearGradient = null;
    }

    public void setGlobalAlpha(float f) {
        this.globalAlpha = f;
    }

    public void setLinearGradient(LinearGradient linearGradient) {
        this.mLinearGradient = linearGradient;
    }

    public void setMiterLimit(float f) {
        this.miterLimit = f;
    }

    public void setShadowBlur(float f) {
        this.shadowBlur = f;
    }

    public void setShadowOffsetX(float f) {
        this.shadowOffsetX = f;
    }

    public void setShadowOffsetY(float f) {
        this.shadowOffsetY = f;
    }

    public void setStrokeLineWidth(float f) {
        this.strokeLineWidth = f;
    }

    public void setTextSize(float f) {
        this.textSize = f;
    }

    public void setFillStyle(float[] fArr) {
        this.fillStyle = CanvasConvert.convertColor(fArr);
    }

    public void setShadowColor(float[] fArr) {
        this.shadowColor = CanvasConvert.convertColor(fArr);
    }

    public void setStrokeStyle(float[] fArr) {
        this.strokeStyle = CanvasConvert.convertColor(fArr);
    }

    public void setTextBaseline(String str) {
        this.textBaseline = CanvasConvert.convertTextBaseline(str);
    }

    public CanvasDrawingState(CanvasDrawingState canvasDrawingState) {
        setUp(canvasDrawingState);
    }

    public void setLineDashOffset(float f) {
        this.lineDashOffset = f;
        this.strokeLineDash = CanvasConvert.convertLineDash(this.primitiveLineDash, this.lineDashOffset);
    }

    public void setStrokeLineCap(String str) {
        this.primitiveLineCap = str;
        this.strokeLineCap = CanvasConvert.convertLineCap(str);
    }

    public void setStrokeLineDash(float[] fArr) {
        this.primitiveLineDash = fArr;
        this.strokeLineDash = CanvasConvert.convertLineDash(fArr, this.lineDashOffset);
    }

    public void setStrokeLineJoin(String str) {
        this.primitiveLineJoin = str;
        this.strokeLineJoin = CanvasConvert.convertLineJoin(str);
    }

    public void setTextAlign(String str) {
        this.primitiveTextAlign = str;
        this.textAlign = CanvasConvert.convertTextAlign(str);
    }

    private void setUp(CanvasDrawingState canvasDrawingState) {
        this.globalAlpha = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.globalAlpha);
        this.fillStyle = CanvasDeepCopy.deepCopyIntList(canvasDrawingState.fillStyle);
        this.strokeStyle = CanvasDeepCopy.deepCopyIntList(canvasDrawingState.strokeStyle);
        this.strokeLineWidth = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.strokeLineWidth);
        this.strokeLineCap = CanvasConvert.convertLineCap(canvasDrawingState.primitiveLineCap);
        this.strokeLineJoin = CanvasConvert.convertLineJoin(canvasDrawingState.primitiveLineJoin);
        this.miterLimit = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.miterLimit);
        this.lineDashOffset = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.lineDashOffset);
        this.strokeLineDash = CanvasConvert.convertLineDash(canvasDrawingState.primitiveLineDash, this.lineDashOffset);
        this.textSize = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.textSize);
        this.textBaseline = CanvasDeepCopy.deepCopyInt(canvasDrawingState.textBaseline);
        this.textAlign = CanvasConvert.convertTextAlign(canvasDrawingState.primitiveTextAlign);
        this.shadowColor = CanvasDeepCopy.deepCopyIntList(canvasDrawingState.shadowColor);
        this.shadowBlur = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.shadowBlur);
        this.shadowOffsetX = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.shadowOffsetX);
        this.shadowOffsetY = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.shadowOffsetY);
        this.primitiveTextAlign = CanvasDeepCopy.deepCopyString(canvasDrawingState.primitiveTextAlign);
        this.primitiveLineCap = CanvasDeepCopy.deepCopyString(canvasDrawingState.primitiveLineCap);
        this.primitiveLineJoin = CanvasDeepCopy.deepCopyString(canvasDrawingState.primitiveLineJoin);
        this.primitiveLineDash = CanvasDeepCopy.deepCopyFloatList(canvasDrawingState.primitiveLineDash);
    }
}
