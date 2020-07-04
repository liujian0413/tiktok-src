package android.support.design.p015a;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.WeakHashMap;

/* renamed from: android.support.design.a.e */
public final class C0238e extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final Property<Drawable, Integer> f879a = new C0238e();

    /* renamed from: b */
    private final WeakHashMap<Drawable, Integer> f880b = new WeakHashMap<>();

    private C0238e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f880b.containsKey(drawable)) {
            return (Integer) this.f880b.get(drawable);
        }
        return Integer.valueOf(NormalGiftView.ALPHA_255);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void set(Drawable drawable, Integer num) {
        if (VERSION.SDK_INT < 19) {
            this.f880b.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
