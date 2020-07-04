package com.facebook.keyframes.model.keyframedmodels;

import android.graphics.Color;
import com.facebook.keyframes.model.C14037d;
import com.facebook.keyframes.model.C14050i;
import java.util.List;

public final class KeyFramedGradient extends C14060d<C14037d, C14055a> {

    /* renamed from: a */
    private final Position f37128a;

    public enum Position {
        START,
        END
    }

    /* renamed from: com.facebook.keyframes.model.keyframedmodels.KeyFramedGradient$a */
    public static class C14055a {

        /* renamed from: a */
        public int f37129a;

        /* renamed from: b */
        public int f37130b;
    }

    /* renamed from: a */
    public static KeyFramedGradient m41431a(C14050i iVar, Position position) {
        return new KeyFramedGradient(iVar.f37112a, iVar.f37113b, position);
    }

    private KeyFramedGradient(List<C14037d> list, float[][][] fArr, Position position) {
        super(list, fArr);
        this.f37128a = position;
    }

    /* renamed from: a */
    private static int m41430a(float f, int i, int i2) {
        int alpha = Color.alpha(i);
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        return ((alpha + ((int) (((float) (Color.alpha(i2) - alpha)) * f))) << 24) | ((red + ((int) (((float) (Color.red(i2) - red)) * f))) << 16) | ((green + ((int) (((float) (Color.green(i2) - green)) * f))) << 8) | (blue + ((int) (f * ((float) (Color.blue(i2) - blue)))));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo33704a(C14037d dVar, C14037d dVar2, float f, C14055a aVar) {
        if (dVar2 == null) {
            if (this.f37128a == Position.START) {
                aVar.f37129a = dVar.f37067a;
            } else {
                aVar.f37130b = dVar.f37067a;
            }
        } else if (this.f37128a == Position.START) {
            aVar.f37129a = m41430a(f, dVar.f37067a, dVar2.f37067a);
        } else {
            aVar.f37130b = m41430a(f, dVar.f37067a, dVar2.f37067a);
        }
    }
}
