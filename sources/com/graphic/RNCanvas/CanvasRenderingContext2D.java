package com.graphic.RNCanvas;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.HashMap;

public class CanvasRenderingContext2D {
    private final String COLOR = "_color";
    private final String COLOR_PROPS = "_color_steps";
    private final String END_POS = "_end_pos";
    private final String POS = "_pos";
    private final String START_POS = "_start_pos";

    /* renamed from: X */
    private final String f49900X = "_x";

    /* renamed from: Y */
    private final String f49901Y = "_y";
    private Canvas canvas;
    private CanvasDrawingState currentState;
    private float[] lastPoint;
    private final Matrix matrix = new Matrix();
    private final Paint paint = new Paint();
    private final Path path = new Path();
    private float scale;
    private final CanvasDrawingStateManager stateManager = new CanvasDrawingStateManager();

    private float modulus(float f, float f2) {
        float f3 = f % f2;
        return f3 < 0.0f ? f3 + f2 : f3;
    }

    public void createImageData() {
    }

    public void createLinearGradient(float f, float f2, float f3, float f4) {
    }

    public void createPattern() {
    }

    public void createRadialGradient(float f, float f2, float f3, float f4, float f5, float f6) {
    }

    public void drawFocusIfNeeded() {
    }

    public void drawImage() {
    }

    public void getImageData() {
    }

    public void isPointInPath() {
    }

    public void isPointInStroke() {
    }

    public void putImageData() {
    }

    public void scrollPathIntoView() {
    }

    public void closePath() {
        this.path.close();
    }

    public DashPathEffect getLineDash() {
        return this.currentState.strokeLineDash;
    }

    private void setUpCurrentState() {
        this.currentState = this.stateManager.getCurrentState();
    }

    public void beginPath() {
        this.path.reset();
        resetLastPoint();
    }

    public void clip() {
        this.path.setFillType(FillType.WINDING);
        this.canvas.clipPath(this.path);
    }

    public void fill() {
        setUpFillPaint();
        this.canvas.drawPath(this.path, this.paint);
    }

    public void resetTransform() {
        this.matrix.reset();
        this.canvas.setMatrix(this.matrix);
    }

    public void restore() {
        this.stateManager.restore();
        setUpCurrentState();
        this.canvas.restore();
    }

    public void save() {
        this.stateManager.save();
        setUpCurrentState();
        this.canvas.save();
    }

    public void stroke() {
        setUpStrokePaint();
        this.canvas.drawPath(this.path, this.paint);
    }

    private void resetLastPoint() {
        this.lastPoint = new float[]{0.0f, 0.0f};
    }

    private void setUpFillPaint() {
        resetPaint();
        setPaintStyle(Style.FILL, this.currentState.fillStyle);
        if (this.currentState.mLinearGradient != null) {
            this.paint.setShader(this.currentState.mLinearGradient);
        }
    }

    private float getTextVerticalOffset() {
        if (this.currentState.textBaseline == 0) {
            return 0.0f;
        }
        FontMetrics fontMetrics = this.paint.getFontMetrics();
        float f = fontMetrics.ascent + fontMetrics.descent;
        if (this.currentState.textBaseline == 1) {
            return -f;
        }
        if (this.currentState.textBaseline == 2) {
            return -(f / 2.0f);
        }
        return 0.0f;
    }

    private void resetPaint() {
        this.paint.reset();
        this.paint.setFlags(1);
        this.paint.setTextSize(this.currentState.textSize);
        this.paint.setTextAlign(this.currentState.textAlign);
        this.paint.clearShadowLayer();
    }

    private void setUpStrokePaint() {
        resetPaint();
        setPaintStyle(Style.STROKE, this.currentState.strokeStyle);
        this.paint.setStrokeCap(this.currentState.strokeLineCap);
        this.paint.setStrokeWidth(this.currentState.strokeLineWidth * this.scale);
        this.paint.setStrokeJoin(this.currentState.strokeLineJoin);
        this.paint.setStrokeMiter(this.currentState.miterLimit);
        this.paint.setPathEffect(this.currentState.strokeLineDash);
        if (this.currentState.mLinearGradient != null) {
            this.paint.setShader(this.currentState.mLinearGradient);
        }
    }

    public void setDevicePixelRatio(float f) {
        this.scale = f;
    }

    public void rotate(float f) {
        this.canvas.rotate(f);
    }

    public void setFillStyle(float[] fArr) {
        this.currentState.setFillStyle(fArr);
    }

    public void setGlobalAlpha(float f) {
        this.currentState.setGlobalAlpha(f);
    }

    public void setLineCap(String str) {
        this.currentState.setStrokeLineCap(str);
    }

    public void setLineDashOffset(float f) {
        this.currentState.setLineDashOffset(f);
    }

    public void setLineJoin(String str) {
        this.currentState.setStrokeLineJoin(str);
    }

    public void setLineWidth(float f) {
        this.currentState.setStrokeLineWidth(f);
    }

    public void setMiterLimit(float f) {
        this.currentState.setMiterLimit(f);
    }

    public void setShadowBlur(float f) {
        this.currentState.setShadowBlur(f);
    }

    public void setShadowColor(float[] fArr) {
        this.currentState.setShadowColor(fArr);
    }

    public void setShadowOffsetX(float f) {
        this.currentState.setShadowOffsetX(f);
    }

    public void setShadowOffsetY(float f) {
        this.currentState.setShadowOffsetY(f);
    }

    public void setStrokeStyle(float[] fArr) {
        try {
            this.currentState.setStrokeStyle(fArr);
        } catch (Exception unused) {
        }
    }

    public void setTextAlign(String str) {
        this.currentState.setTextAlign(str);
    }

    public void setTextBaseline(String str) {
        this.currentState.setTextBaseline(str);
    }

    public void setLineDash(float[] fArr) {
        if (fArr.length != 0) {
            this.currentState.setStrokeLineDash(fArr);
        }
    }

    public HashMap measureText(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("width", Float.valueOf(this.paint.measureText(str)));
        return hashMap;
    }

    public void setCanvas(Canvas canvas2) {
        this.canvas = canvas2;
        this.stateManager.reset();
        setUpCurrentState();
        resetLastPoint();
        this.path.reset();
        resetPaint();
    }

    public void clip(String str) {
        if (str.equals("nonzero")) {
            clip();
            return;
        }
        if (str.equals("evenodd")) {
            this.path.setFillType(FillType.EVEN_ODD);
            this.canvas.clipPath(this.path);
        }
    }

    public void setFont(HashMap hashMap) {
        double doubleValue = ((Double) hashMap.get("fontSize")).doubleValue();
        double d = (double) this.scale;
        Double.isNaN(d);
        Double valueOf = Double.valueOf(doubleValue * d);
        this.paint.setTypeface(Typeface.SANS_SERIF);
        this.currentState.setTextSize(valueOf.floatValue());
    }

    public void setGradientStyle(HashMap hashMap) {
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        HashMap hashMap2 = hashMap;
        if (hashMap2 != null && hashMap.size() > 0 && hashMap2.containsKey("_start_pos") && hashMap2.containsKey("_end_pos") && hashMap2.containsKey("_color_steps")) {
            HashMap hashMap3 = (HashMap) hashMap2.get("_start_pos");
            HashMap hashMap4 = (HashMap) hashMap2.get("_end_pos");
            double doubleValue = ((Double) hashMap3.get("_x")).doubleValue();
            double doubleValue2 = ((Double) hashMap3.get("_y")).doubleValue();
            double doubleValue3 = ((Double) hashMap4.get("_x")).doubleValue();
            double doubleValue4 = ((Double) hashMap4.get("_y")).doubleValue();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) hashMap2.get("_color_steps");
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                try {
                    HashMap hashMap5 = (HashMap) arrayList3.get(i2);
                    if (hashMap5.containsKey("_pos") && hashMap5.containsKey("_color")) {
                        arrayList.add(Integer.valueOf(Color.parseColor((String) hashMap5.get("_color"))));
                        arrayList2.add(Float.valueOf((float) ((Double) hashMap5.get("_pos")).doubleValue()));
                    }
                } catch (Exception unused) {
                }
            }
            if (arrayList.size() > 0 && arrayList2.size() > 0) {
                int[] iArr = new int[arrayList.size()];
                float[] fArr = new float[arrayList.size()];
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
                    fArr[i3] = ((Float) arrayList2.get(i3)).floatValue();
                }
                if (!(this.canvas.getClipBounds() == null || this.canvas.getClipBounds().left == 0 || this.canvas.getClipBounds().top == 0)) {
                    if (doubleValue == doubleValue3) {
                        CanvasDrawingState canvasDrawingState = this.currentState;
                        float f5 = ((float) doubleValue) + ((float) this.canvas.getClipBounds().left);
                        if (doubleValue2 > doubleValue4) {
                            f3 = ((float) doubleValue4) + ((float) (this.canvas.getClipBounds().top * 3));
                        } else {
                            double d = (double) ((float) doubleValue4);
                            double d2 = (double) this.canvas.getClipBounds().top;
                            Double.isNaN(d2);
                            double d3 = d2 * 0.6d;
                            Double.isNaN(d);
                            f3 = (float) (d - d3);
                        }
                        float f6 = ((float) doubleValue3) + ((float) this.canvas.getClipBounds().left);
                        if (doubleValue4 > doubleValue2) {
                            f4 = ((float) doubleValue4) + ((float) (this.canvas.getClipBounds().top * 2));
                        } else {
                            double d4 = (double) ((float) doubleValue4);
                            double d5 = (double) this.canvas.getClipBounds().top;
                            Double.isNaN(d5);
                            double d6 = d5 * 1.2d;
                            Double.isNaN(d4);
                            f4 = (float) (d4 + d6);
                        }
                        float[] fArr2 = fArr;
                        LinearGradient linearGradient = new LinearGradient(f5, f3, f6, f4, iArr, fArr2, TileMode.CLAMP);
                        canvasDrawingState.setLinearGradient(linearGradient);
                        return;
                    }
                    float[] fArr3 = fArr;
                    CanvasDrawingState canvasDrawingState2 = this.currentState;
                    if (doubleValue > doubleValue3) {
                        f = ((float) doubleValue) + ((float) (this.canvas.getClipBounds().left * 3));
                    } else {
                        f = (float) doubleValue;
                    }
                    float f7 = f;
                    float f8 = ((float) doubleValue2) + ((float) this.canvas.getClipBounds().top);
                    if (doubleValue3 > doubleValue) {
                        f2 = (float) doubleValue3;
                        i = this.canvas.getClipBounds().left * 2;
                    } else {
                        f2 = (float) doubleValue3;
                        i = this.canvas.getClipBounds().left;
                    }
                    LinearGradient linearGradient2 = new LinearGradient(f7, f8, f2 + ((float) i), ((float) doubleValue4) + ((float) this.canvas.getClipBounds().top), iArr, fArr3, TileMode.CLAMP);
                    canvasDrawingState2.setLinearGradient(linearGradient2);
                }
            }
        }
    }

    public void scale(float f, float f2) {
        this.canvas.scale(f, f2);
    }

    private void trackPoint(float f, float f2) {
        this.lastPoint[0] = f;
        this.lastPoint[1] = f2;
    }

    public void translate(float f, float f2) {
        this.canvas.translate(f * this.scale, f2 * this.scale);
    }

    public void lineTo(float f, float f2) {
        float f3 = f * this.scale;
        float f4 = f2 * this.scale;
        trackPoint(f3, f4);
        this.path.lineTo(f3, f4);
    }

    public void moveTo(float f, float f2) {
        float f3 = f * this.scale;
        float f4 = f2 * this.scale;
        trackPoint(f3, f4);
        this.path.moveTo(f3, f4);
    }

    private void setPaintStyle(Style style, int[] iArr) {
        this.paint.setStyle(style);
        this.paint.setARGB((int) (((float) iArr[0]) * this.currentState.globalAlpha), iArr[1], iArr[2], iArr[3]);
        this.paint.setShadowLayer(this.currentState.shadowBlur, this.currentState.shadowOffsetX, this.currentState.shadowOffsetY, CanvasConvert.convertColorListToColor(this.currentState.shadowColor));
    }

    public void fillText(String str, float f, float f2) {
        setUpFillPaint();
        drawText(str, f, f2);
    }

    public void strokeText(String str, float f, float f2) {
        setUpStrokePaint();
        drawText(str, f, f2);
    }

    private void drawText(String str, float f, float f2) {
        this.canvas.drawText(str, f * this.scale, (f2 * this.scale) + getTextVerticalOffset(), this.paint);
    }

    public void quadraticCurveTo(float f, float f2, float f3, float f4) {
        float f5 = f * this.scale;
        float f6 = f2 * this.scale;
        float f7 = f3 * this.scale;
        float f8 = f4 * this.scale;
        trackPoint(f7, f8);
        this.path.quadTo(f5, f6, f7, f8);
    }

    public void rect(float f, float f2, float f3, float f4) {
        float f5 = f * this.scale;
        float f6 = f2 * this.scale;
        this.path.addRect(new RectF(f5, f6, (f3 * this.scale) + f5, (f4 * this.scale) + f6), Direction.CW);
    }

    public void clearRect(float f, float f2, float f3, float f4) {
        float f5 = f * this.scale;
        float f6 = f2 * this.scale;
        float f7 = f3 * this.scale;
        float f8 = f4 * this.scale;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.canvas.drawRect(f5, f6, f5 + f7, f6 + f8, paint2);
    }

    public void fillRect(float f, float f2, float f3, float f4) {
        float f5 = f * this.scale;
        float f6 = f2 * this.scale;
        RectF rectF = new RectF(f5, f6, (f3 * this.scale) + f5, (f4 * this.scale) + f6);
        setUpFillPaint();
        this.canvas.drawRect(rectF, this.paint);
    }

    public void strokeRect(float f, float f2, float f3, float f4) {
        float f5 = f * this.scale;
        float f6 = f2 * this.scale;
        RectF rectF = new RectF(f5, f6, (f3 * this.scale) + f5, (f4 * this.scale) + f6);
        setUpStrokePaint();
        this.canvas.drawRect(rectF, this.paint);
    }

    public void arc(float f, float f2, float f3, float f4, float f5) {
        arc(f, f2, f3, f4, f5, false);
    }

    public void arcTo(float f, float f2, float f3, float f4, float f5) {
        float f6;
        boolean z;
        boolean z2;
        float f7 = this.lastPoint[0] * this.scale;
        float f8 = this.lastPoint[1] * this.scale;
        float f9 = this.scale * f;
        float f10 = this.scale * f2;
        float f11 = this.scale * f3;
        float f12 = this.scale * f4;
        float f13 = this.scale * f5;
        if ((f9 == f7 && f10 == f8) || ((f9 == f11 && f10 == f12) || f13 == 0.0f)) {
            lineTo(f9, f10);
            return;
        }
        float[] fArr = {f7 - f9, f8 - f10};
        float[] fArr2 = {f11 - f9, f12 - f10};
        double d = (double) fArr[0];
        double d2 = (double) fArr[0];
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) (fArr[1] * fArr[1]);
        Double.isNaN(d4);
        float sqrt = (float) Math.sqrt(d3 + d4);
        double d5 = (double) fArr2[0];
        double d6 = (double) fArr2[0];
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = d5 * d6;
        double d8 = (double) (fArr2[1] * fArr2[1]);
        Double.isNaN(d8);
        float sqrt2 = (float) Math.sqrt(d7 + d8);
        double d9 = (double) (((fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1])) / (sqrt * sqrt2));
        if (d9 == -1.0d) {
            lineTo(f9, f10);
        } else if (d9 == 1.0d) {
            float f14 = 65535.0f / sqrt;
            lineTo(f7 + (fArr[0] * f14), f8 + (f14 * fArr[1]));
        } else {
            float tan = f13 / ((float) Math.tan(Math.acos(d9) / 2.0d));
            float f15 = tan / sqrt;
            float[] fArr3 = {(fArr[0] * f15) + f9, (f15 * fArr[1]) + f10};
            float[] fArr4 = {fArr[1], -fArr[0]};
            double d10 = (double) fArr4[0];
            double d11 = (double) fArr4[0];
            Double.isNaN(d10);
            Double.isNaN(d11);
            double d12 = d10 * d11;
            double d13 = (double) (fArr4[1] * fArr4[1]);
            Double.isNaN(d13);
            float sqrt3 = (float) Math.sqrt(d12 + d13);
            float f16 = f13 / sqrt3;
            if (((double) (((fArr4[0] * fArr2[0]) + (fArr4[1] * fArr2[1])) / (sqrt3 * sqrt2))) < 0.0d) {
                fArr4[0] = -fArr4[0];
                fArr4[1] = -fArr4[1];
            }
            float[] fArr5 = {fArr3[0] + (fArr4[0] * f16), fArr3[1] + (f16 * fArr4[1])};
            fArr4[0] = -fArr4[0];
            fArr4[1] = -fArr4[1];
            float acos = (float) ((Math.acos((double) (fArr4[0] / sqrt3)) * 180.0d) / 3.141592653589793d);
            if (fArr4[1] < 0.0f) {
                acos = 360.0f - acos;
            }
            float f17 = tan / sqrt2;
            float[] fArr6 = {f9 + (fArr2[0] * f17), f10 + (f17 * fArr2[1])};
            float[] fArr7 = {fArr6[0] - fArr5[0], fArr6[1] - fArr5[1]};
            double d14 = (double) fArr7[0];
            double d15 = (double) fArr7[0];
            Double.isNaN(d14);
            Double.isNaN(d15);
            double d16 = d14 * d15;
            double d17 = (double) (fArr7[1] * fArr7[1]);
            Double.isNaN(d17);
            float acos2 = (float) ((Math.acos((double) (fArr7[0] / ((float) Math.sqrt(d16 + d17)))) * 180.0d) / 3.141592653589793d);
            if (fArr7[1] < 0.0f) {
                f6 = 360.0f - acos2;
            } else {
                f6 = acos2;
            }
            if (acos <= f6 || acos - f6 >= 180.0f) {
                z = false;
            } else {
                z = true;
            }
            if (acos >= f6 || f6 - acos <= 180.0f) {
                z2 = z;
            } else {
                z2 = true;
            }
            lineTo(fArr3[0], fArr3[1]);
            arc(fArr5[0], fArr5[1], f13, acos, f6, z2);
        }
    }

    public void setTransform(float f, float f2, float f3, float f4, float f5, float f6) {
        resetTransform();
        transform(f, f2, f3, f4, f5, f6);
    }

    public void bezierCurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f * this.scale;
        float f8 = f2 * this.scale;
        float f9 = f3 * this.scale;
        float f10 = f4 * this.scale;
        float f11 = f5 * this.scale;
        float f12 = f6 * this.scale;
        trackPoint(f11, f12);
        this.path.cubicTo(f7, f8, f9, f10, f11, f12);
    }

    public void transform(float f, float f2, float f3, float f4, float f5, float f6) {
        this.matrix.reset();
        this.matrix.setValues(new float[]{f, f3, f5 * this.scale, f2, f4, f6 * this.scale, 0.0f, 0.0f, 1.0f});
        this.canvas.concat(this.matrix);
    }

    public void arc(float f, float f2, float f3, float f4, float f5, boolean z) {
        Direction direction;
        float f6 = f * this.scale;
        float f7 = f2 * this.scale;
        float f8 = f3 * this.scale;
        float degrees = (float) Math.toDegrees((double) f4);
        float degrees2 = ((float) Math.toDegrees((double) f5)) - degrees;
        if (Math.abs(degrees2) >= 360.0f) {
            Path path2 = this.path;
            if (z) {
                direction = Direction.CCW;
            } else {
                direction = Direction.CW;
            }
            path2.addCircle(f6, f7, f8, direction);
            return;
        }
        float modulus = modulus(degrees2, 360.0f);
        if (z && modulus < 360.0f) {
            modulus = (360.0f - modulus) * -1.0f;
        }
        this.path.arcTo(new RectF(f6 - f8, f7 - f8, f6 + f8, f7 + f8), degrees, modulus);
    }
}
