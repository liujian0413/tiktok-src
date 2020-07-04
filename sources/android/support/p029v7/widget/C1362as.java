package android.support.p029v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.as */
public final class C1362as extends ContextWrapper {

    /* renamed from: a */
    private static final Object f5338a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C1362as>> f5339b;

    /* renamed from: c */
    private final Resources f5340c;

    /* renamed from: d */
    private final Theme f5341d;

    public final Resources getResources() {
        return this.f5340c;
    }

    public final AssetManager getAssets() {
        return this.f5340c.getAssets();
    }

    public final Theme getTheme() {
        if (this.f5341d == null) {
            return super.getTheme();
        }
        return this.f5341d;
    }

    public final void setTheme(int i) {
        if (this.f5341d == null) {
            super.setTheme(i);
        } else {
            this.f5341d.applyStyle(i, true);
        }
    }

    private C1362as(Context context) {
        super(context);
        if (C1371az.m6778a()) {
            this.f5340c = new C1371az(this, context.getResources());
            this.f5341d = this.f5340c.newTheme();
            this.f5341d.setTo(context.getTheme());
            return;
        }
        this.f5340c = new C1364au(this, context.getResources());
        this.f5341d = null;
    }

    /* renamed from: b */
    private static boolean m6740b(Context context) {
        if ((context instanceof C1362as) || (context.getResources() instanceof C1364au) || (context.getResources() instanceof C1371az)) {
            return false;
        }
        if (VERSION.SDK_INT < 21 || C1371az.m6778a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Context m6739a(Context context) {
        C1362as asVar;
        if (!m6740b(context)) {
            return context;
        }
        synchronized (f5338a) {
            if (f5339b == null) {
                f5339b = new ArrayList<>();
            } else {
                for (int size = f5339b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f5339b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f5339b.remove(size);
                    }
                }
                for (int size2 = f5339b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f5339b.get(size2);
                    if (weakReference2 != null) {
                        asVar = (C1362as) weakReference2.get();
                    } else {
                        asVar = null;
                    }
                    if (asVar != null && asVar.getBaseContext() == context) {
                        return asVar;
                    }
                }
            }
            C1362as asVar2 = new C1362as(context);
            f5339b.add(new WeakReference(asVar2));
            return asVar2;
        }
    }
}
