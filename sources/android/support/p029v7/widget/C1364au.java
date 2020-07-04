package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.au */
final class C1364au extends C1349ak {

    /* renamed from: a */
    private final WeakReference<Context> f5346a;

    public final Drawable getDrawable(int i) throws NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f5346a.get();
        if (!(drawable == null || context == null)) {
            C1393g.m6901a();
            C1393g.m6907a(context, i, drawable);
        }
        return drawable;
    }

    public C1364au(Context context, Resources resources) {
        super(resources);
        this.f5346a = new WeakReference<>(context);
    }
}
