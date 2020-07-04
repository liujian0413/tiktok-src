package com.graphic.RNCanvas;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint.Align;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.HashMap;

public class CanvasConvert {
    public static int convertColorListToColor(int[] iArr) {
        return Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public static Cap convertLineCap(String str) {
        Cap cap = Cap.BUTT;
        if (str.equals("round")) {
            return Cap.ROUND;
        }
        if (str.equals("square")) {
            return Cap.SQUARE;
        }
        return cap;
    }

    public static Join convertLineJoin(String str) {
        Join join = Join.MITER;
        if (str.equals("bevel")) {
            return Join.BEVEL;
        }
        if (str.equals("round")) {
            return Join.ROUND;
        }
        return join;
    }

    public static Align convertTextAlign(String str) {
        Align align = Align.LEFT;
        if (str.equals("right")) {
            return Align.RIGHT;
        }
        if (str.equals("center")) {
            return Align.CENTER;
        }
        return align;
    }

    public static int convertTextBaseline(String str) {
        if (str.equals("top")) {
            return 1;
        }
        if (str.equals("middle")) {
            return 2;
        }
        return 0;
    }

    public static ArrayList<HashMap> convertActions(ReadableArray readableArray) {
        int size = readableArray.size();
        ArrayList<HashMap> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            try {
                ReadableMap map = readableArray.getMap(i);
                arrayList.add(createAction(map.getString("method"), map.getArray("arguments").toArrayList().toArray()));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static int[] convertColor(float[] fArr) {
        if (fArr.length != 4) {
            return new int[]{NormalGiftView.ALPHA_255, 0, 0, 0};
        }
        return new int[]{(int) (fArr[3] * 255.0f), (int) (fArr[0] * 255.0f), (int) (fArr[1] * 255.0f), (int) (fArr[2] * 255.0f)};
    }

    public static HashMap createAction(String str, Object[] objArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("method", str);
        hashMap.put("arguments", objArr);
        return hashMap;
    }

    public static DashPathEffect convertLineDash(float[] fArr, float f) {
        boolean z;
        float[] fArr2;
        float length = (float) fArr.length;
        if (length % 2.0f != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fArr2 = new float[(fArr.length * 2)];
        } else {
            fArr2 = new float[fArr.length];
        }
        for (int i = 0; i < fArr2.length; i++) {
            fArr2[i] = fArr[(int) (((float) i) % length)];
        }
        if (f <= 0.0f) {
            f = 0.0f;
        }
        return new DashPathEffect(fArr2, f);
    }
}
