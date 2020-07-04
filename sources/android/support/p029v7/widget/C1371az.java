package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.az */
public final class C1371az extends Resources {

    /* renamed from: a */
    private static boolean f5370a;

    /* renamed from: b */
    private final WeakReference<Context> f5371b;

    /* renamed from: b */
    private static boolean m6779b() {
        return f5370a;
    }

    /* renamed from: a */
    public static boolean m6778a() {
        if (!m6779b() || VERSION.SDK_INT > 20) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m6777a(boolean z) {
        f5370a = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Drawable mo6417a(int i) {
        return super.getDrawable(i);
    }

    public final Drawable getDrawable(int i) throws NotFoundException {
        Context context = (Context) this.f5371b.get();
        if (context != null) {
            return C1393g.m6901a().mo6489a(context, this, i);
        }
        return super.getDrawable(i);
    }

    public C1371az(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f5371b = new WeakReference<>(context);
    }
}
