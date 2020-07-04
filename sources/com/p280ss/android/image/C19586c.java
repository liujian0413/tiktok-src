package com.p280ss.android.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.renderscript.Allocation;
import android.renderscript.Allocation.MipmapControl;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.lang.reflect.Array;

/* renamed from: com.ss.android.image.c */
public final class C19586c {
    /* renamed from: a */
    public static void m64524a(Bitmap bitmap, Bitmap bitmap2, int i) {
        int[] iArr;
        int i2 = i;
        if (i2 > 0) {
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int i3 = width * height;
            int[] iArr2 = new int[i3];
            bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
            int i4 = width - 1;
            int i5 = height - 1;
            int i6 = i2 + i2 + 1;
            int[] iArr3 = new int[i3];
            int[] iArr4 = new int[i3];
            int[] iArr5 = new int[i3];
            int[] iArr6 = new int[Math.max(width, height)];
            int i7 = (i6 + 1) >> 1;
            int i8 = i7 * i7;
            int i9 = i8 * 256;
            int[] iArr7 = new int[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                iArr7[i10] = i10 / i8;
            }
            int[][] iArr8 = (int[][]) Array.newInstance(int.class, new int[]{i6, 3});
            int i11 = i2 + 1;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < height) {
                int i15 = -i2;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i15 <= i2) {
                    int i25 = i5;
                    int i26 = height;
                    int i27 = iArr2[i13 + Math.min(i4, Math.max(i15, 0))];
                    int[] iArr9 = iArr8[i15 + i2];
                    iArr9[0] = (i27 & 16711680) >> 16;
                    iArr9[1] = (i27 & 65280) >> 8;
                    iArr9[2] = i27 & NormalGiftView.ALPHA_255;
                    int abs = i11 - Math.abs(i15);
                    i16 += iArr9[0] * abs;
                    i17 += iArr9[1] * abs;
                    i18 += iArr9[2] * abs;
                    if (i15 > 0) {
                        i19 += iArr9[0];
                        i20 += iArr9[1];
                        i21 += iArr9[2];
                    } else {
                        i22 += iArr9[0];
                        i23 += iArr9[1];
                        i24 += iArr9[2];
                    }
                    i15++;
                    height = i26;
                    i5 = i25;
                }
                int i28 = i5;
                int i29 = height;
                int i30 = i2;
                int i31 = 0;
                while (i31 < width) {
                    iArr3[i13] = iArr7[i16];
                    iArr4[i13] = iArr7[i17];
                    iArr5[i13] = iArr7[i18];
                    int i32 = i16 - i22;
                    int i33 = i17 - i23;
                    int i34 = i18 - i24;
                    int[] iArr10 = iArr8[((i30 - i2) + i6) % i6];
                    int i35 = i22 - iArr10[0];
                    int i36 = i23 - iArr10[1];
                    int i37 = i24 - iArr10[2];
                    if (i12 == 0) {
                        iArr = iArr7;
                        iArr6[i31] = Math.min(i31 + i2 + 1, i4);
                    } else {
                        iArr = iArr7;
                    }
                    int i38 = iArr2[i14 + iArr6[i31]];
                    iArr10[0] = (i38 & 16711680) >> 16;
                    iArr10[1] = (i38 & 65280) >> 8;
                    iArr10[2] = i38 & NormalGiftView.ALPHA_255;
                    int i39 = i19 + iArr10[0];
                    int i40 = i20 + iArr10[1];
                    int i41 = i21 + iArr10[2];
                    i16 = i32 + i39;
                    i17 = i33 + i40;
                    i18 = i34 + i41;
                    i30 = (i30 + 1) % i6;
                    int[] iArr11 = iArr8[i30 % i6];
                    i22 = i35 + iArr11[0];
                    i23 = i36 + iArr11[1];
                    i24 = i37 + iArr11[2];
                    i19 = i39 - iArr11[0];
                    i20 = i40 - iArr11[1];
                    i21 = i41 - iArr11[2];
                    i13++;
                    i31++;
                    iArr7 = iArr;
                }
                int[] iArr12 = iArr7;
                i14 += width;
                i12++;
                height = i29;
                i5 = i28;
            }
            int i42 = i5;
            int i43 = height;
            int[] iArr13 = iArr7;
            int i44 = 0;
            while (i44 < width) {
                int i45 = -i2;
                int i46 = i45 * width;
                int i47 = 0;
                int i48 = 0;
                int i49 = 0;
                int i50 = 0;
                int i51 = 0;
                int i52 = 0;
                int i53 = 0;
                int i54 = 0;
                int i55 = 0;
                while (i45 <= i2) {
                    int[] iArr14 = iArr6;
                    int max = Math.max(0, i46) + i44;
                    int[] iArr15 = iArr8[i45 + i2];
                    iArr15[0] = iArr3[max];
                    iArr15[1] = iArr4[max];
                    iArr15[2] = iArr5[max];
                    int abs2 = i11 - Math.abs(i45);
                    i47 += iArr3[max] * abs2;
                    i48 += iArr4[max] * abs2;
                    i49 += iArr5[max] * abs2;
                    if (i45 > 0) {
                        i50 += iArr15[0];
                        i51 += iArr15[1];
                        i52 += iArr15[2];
                    } else {
                        i53 += iArr15[0];
                        i54 += iArr15[1];
                        i55 += iArr15[2];
                    }
                    int i56 = i42;
                    if (i45 < i56) {
                        i46 += width;
                    }
                    i45++;
                    i42 = i56;
                    iArr6 = iArr14;
                }
                int[] iArr16 = iArr6;
                int i57 = i42;
                int i58 = i51;
                int i59 = i52;
                int i60 = i43;
                int i61 = 0;
                int i62 = i2;
                int i63 = i50;
                int i64 = i49;
                int i65 = i48;
                int i66 = i47;
                int i67 = i44;
                while (i61 < i60) {
                    iArr2[i67] = (iArr2[i67] & -16777216) | (iArr13[i66] << 16) | (iArr13[i65] << 8) | iArr13[i64];
                    int i68 = i66 - i53;
                    int i69 = i65 - i54;
                    int i70 = i64 - i55;
                    int[] iArr17 = iArr8[((i62 - i2) + i6) % i6];
                    int i71 = i53 - iArr17[0];
                    int i72 = i54 - iArr17[1];
                    int i73 = i55 - iArr17[2];
                    if (i44 == 0) {
                        iArr16[i61] = Math.min(i61 + i11, i57) * width;
                    }
                    int i74 = iArr16[i61] + i44;
                    iArr17[0] = iArr3[i74];
                    iArr17[1] = iArr4[i74];
                    iArr17[2] = iArr5[i74];
                    int i75 = i63 + iArr17[0];
                    int i76 = i58 + iArr17[1];
                    int i77 = i59 + iArr17[2];
                    i66 = i68 + i75;
                    i65 = i69 + i76;
                    i64 = i70 + i77;
                    i62 = (i62 + 1) % i6;
                    int[] iArr18 = iArr8[i62];
                    i53 = i71 + iArr18[0];
                    i54 = i72 + iArr18[1];
                    i55 = i73 + iArr18[2];
                    i63 = i75 - iArr18[0];
                    i58 = i76 - iArr18[1];
                    i59 = i77 - iArr18[2];
                    i67 += width;
                    i61++;
                    i2 = i;
                }
                i44++;
                i42 = i57;
                i43 = i60;
                iArr6 = iArr16;
                i2 = i;
            }
            bitmap2.setPixels(iArr2, 0, width, 0, 0, width, i43);
        }
    }

    /* renamed from: a */
    public static final void m64523a(Context context, Bitmap bitmap, Bitmap bitmap2, int i) {
        float f;
        if (VERSION.SDK_INT > 17) {
            RenderScript create = RenderScript.create(context);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createBitmap, MipmapControl.MIPMAP_NONE, 1);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            while (i > 0) {
                if (i - 10 > 0) {
                    f = 10.0f;
                } else {
                    f = (float) i;
                }
                create2.setRadius(f);
                create2.setInput(createFromBitmap);
                create2.forEach(createTyped);
                i -= 10;
                if (i <= 0) {
                    createTyped.copyTo(bitmap2);
                } else {
                    createFromBitmap.copyFrom(createTyped);
                }
            }
            createBitmap.recycle();
            return;
        }
        m64524a(bitmap, bitmap2, i);
    }
}
