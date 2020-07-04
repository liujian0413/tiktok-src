package com.p280ss.android.ttvecamera.p915b;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera.Area;
import android.hardware.Camera.Parameters;
import android.os.Build;
import com.facebook.ads.AdError;
import com.p280ss.android.ttvecamera.C20642j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.b.b */
public final class C20565b {

    /* renamed from: e */
    public static final List<String> f55558e;

    /* renamed from: a */
    protected final int f55559a = 90;

    /* renamed from: b */
    protected final float f55560b = 1.0f;

    /* renamed from: c */
    protected final float f55561c = 2.0f;

    /* renamed from: d */
    int f55562d;

    /* renamed from: f */
    private int f55563f = 1;

    /* renamed from: g */
    private List<Area> f55564g = new ArrayList();

    /* renamed from: h */
    private List<Area> f55565h = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        f55558e = arrayList;
        arrayList.add("multilaser");
        f55558e.add("ms40");
    }

    /* renamed from: a */
    private static boolean m68080a(Parameters parameters) {
        if (parameters == null || f55558e.contains(Build.BRAND.toLowerCase()) || parameters.getMaxNumFocusAreas() <= 0) {
            return false;
        }
        return true;
    }

    public C20565b(int i) {
    }

    /* renamed from: b */
    public static boolean m68081b(int i, Parameters parameters) {
        if (parameters == null || parameters.getMaxNumMeteringAreas() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final String mo55653a(int i, Parameters parameters) {
        if (parameters == null) {
            return "";
        }
        String str = "";
        this.f55562d = i;
        List supportedFocusModes = parameters.getSupportedFocusModes();
        if (i == 1) {
            if (supportedFocusModes.contains("macro")) {
                str = "macro";
            } else if (supportedFocusModes.contains("auto")) {
                str = "auto";
            }
        } else if (supportedFocusModes.contains("continuous-video")) {
            str = "continuous-video";
        } else if (supportedFocusModes.contains("continuous-picture")) {
            str = "continuous-picture";
        } else if (supportedFocusModes.contains("auto")) {
            str = "auto";
        }
        return str;
    }

    /* renamed from: a */
    public final boolean mo55655a(Parameters parameters, String str) {
        if (!m68080a(parameters)) {
            return false;
        }
        return parameters.getSupportedFocusModes().contains(str);
    }

    /* renamed from: a */
    public final List<Area> mo55654a(int i, int i2, float f, int i3, int i4, int i5) {
        Rect a = m68079a(i, i2, f, 90.0f, i3, i4, i5);
        if (this.f55564g.size() > 0) {
            this.f55564g.clear();
        }
        this.f55564g.add(new Area(a, 1000));
        return this.f55564g;
    }

    /* renamed from: b */
    public final List<Area> mo55656b(int i, int i2, float f, int i3, int i4, int i5) {
        Rect a = m68079a(i, i2, f, 180.0f, i3, i4, i5);
        if (this.f55565h.size() > 0) {
            this.f55565h.clear();
        }
        this.f55565h.add(new Area(a, 1000));
        return this.f55565h;
    }

    /* renamed from: a */
    private Rect m68079a(int i, int i2, float f, float f2, int i3, int i4, int i5) {
        int intValue = Float.valueOf((f * f2) + 0.5f).intValue();
        int i6 = ((int) ((((float) (i3 * AdError.SERVER_ERROR_CODE)) * 1.0f) / ((float) i))) - 1000;
        int i7 = ((int) ((((float) (i4 * AdError.SERVER_ERROR_CODE)) * 1.0f) / ((float) i2))) - 1000;
        if (this.f55562d == 1) {
            i6 = -i6;
        }
        int i8 = intValue / 2;
        int a = C20642j.m68407a(i6 - i8, -1000, 1000);
        int a2 = C20642j.m68407a(i7 - i8, -1000, 1000);
        RectF rectF = new RectF((float) a, (float) a2, (float) C20642j.m68406a(a + intValue), (float) C20642j.m68406a(a2 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        C20642j.m68413a(i5, new Rect(-1000, -1000, 1000, 1000), rect);
        Rect rect2 = new Rect(rect.left - 1000, rect.top - 1000, rect.right - 1000, rect.bottom - 1000);
        rect2.left = C20642j.m68406a(rect2.left);
        rect2.right = C20642j.m68406a(rect2.right);
        rect2.top = C20642j.m68406a(rect2.top);
        rect2.bottom = C20642j.m68406a(rect2.bottom);
        return rect2;
    }
}
