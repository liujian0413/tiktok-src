package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ARTTextShadowNode extends ARTShapeShadowNode {
    private ReadableMap mFrame;
    private int mTextAlignment;

    public ARTTextShadowNode() {
    }

    public ARTShapeShadowNode mutableCopy() {
        return new ARTTextShadowNode(this);
    }

    @ReactProp(defaultInt = 0, name = "alignment")
    public void setAlignment(int i) {
        this.mTextAlignment = i;
    }

    @ReactProp(name = "frame")
    public void setFrame(ReadableMap readableMap) {
        this.mFrame = readableMap;
    }

    public ARTTextShadowNode(ARTTextShadowNode aRTTextShadowNode) {
        super(aRTTextShadowNode);
        this.mTextAlignment = aRTTextShadowNode.mTextAlignment;
        this.mFrame = aRTTextShadowNode.mFrame;
    }

    private void applyTextPropertiesToPaint(Paint paint) {
        boolean z;
        boolean z2;
        switch (this.mTextAlignment) {
            case 0:
                paint.setTextAlign(Align.LEFT);
                break;
            case 1:
                paint.setTextAlign(Align.RIGHT);
                break;
            case 2:
                paint.setTextAlign(Align.CENTER);
                break;
        }
        if (this.mFrame != null && this.mFrame.hasKey("font")) {
            ReadableMap map = this.mFrame.getMap("font");
            if (map != null) {
                float f = 12.0f;
                if (map.hasKey("fontSize")) {
                    f = (float) map.getDouble("fontSize");
                }
                paint.setTextSize(f * this.mScale);
                int i = 1;
                if (!map.hasKey("fontWeight") || !"bold".equals(map.getString("fontWeight"))) {
                    z = false;
                } else {
                    z = true;
                }
                if (!map.hasKey("fontStyle") || !"italic".equals(map.getString("fontStyle"))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z && z2) {
                    i = 3;
                } else if (!z) {
                    if (z2) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                }
                paint.setTypeface(Typeface.create(map.getString("fontFamily"), i));
            }
        }
    }

    public void draw(Canvas canvas, Paint paint, float f) {
        if (this.mFrame != null) {
            float f2 = f * this.mOpacity;
            if (f2 > 0.01f && this.mFrame.hasKey("lines")) {
                ReadableArray array = this.mFrame.getArray("lines");
                if (array != null && array.size() != 0) {
                    saveAndSetupCanvas(canvas);
                    String[] strArr = new String[array.size()];
                    for (int i = 0; i < strArr.length; i++) {
                        strArr[i] = array.getString(i);
                    }
                    String join = TextUtils.join("\n", strArr);
                    if (setupStrokePaint(paint, f2)) {
                        applyTextPropertiesToPaint(paint);
                        if (this.mPath == null) {
                            canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                        } else {
                            canvas.drawTextOnPath(join, this.mPath, 0.0f, 0.0f, paint);
                        }
                    }
                    if (setupFillPaint(paint, f2)) {
                        applyTextPropertiesToPaint(paint);
                        if (this.mPath == null) {
                            canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                        } else {
                            canvas.drawTextOnPath(join, this.mPath, 0.0f, 0.0f, paint);
                        }
                    }
                    restoreCanvas(canvas);
                    markUpdateSeen();
                }
            }
        }
    }
}
