package com.bytedance.android.live.core.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.C3393m.C3397b;
import com.bytedance.android.live.core.utils.p158a.C3342a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.facebook.drawee.controller.C13401d;
import java.util.Collection;

/* renamed from: com.bytedance.android.live.core.utils.s */
public final class C3404s {

    /* renamed from: com.bytedance.android.live.core.utils.s$a */
    public interface C3405a {
        /* renamed from: a */
        void mo10308a(ImageModel imageModel);

        /* renamed from: a */
        void mo10309a(ImageModel imageModel, int i, int i2, boolean z);

        /* renamed from: a */
        void mo10310a(ImageModel imageModel, Exception exc);
    }

    /* renamed from: com.bytedance.android.live.core.utils.s$b */
    public interface C3406b {
        /* renamed from: a */
        void mo10311a(Bitmap bitmap);
    }

    /* renamed from: a */
    private static void m12656a(ImageView imageView, ImageModel imageModel, int i, C3405a aVar) {
        m12660b(imageView, imageModel, -1, -1, 0, aVar);
    }

    /* renamed from: a */
    private static boolean m12658a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                return (VERSION.SDK_INT < 17 || !activity.isDestroyed()) && !activity.isFinishing();
            } else if ((context instanceof Application) || !(context instanceof ContextWrapper)) {
                return true;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        return false;
    }

    /* renamed from: a */
    private static String m12648a(ImageModel imageModel) {
        if (imageModel == null || C6311g.m19573a(imageModel.getUrls())) {
            return "";
        }
        return (String) imageModel.getUrls().get(0);
    }

    /* renamed from: b */
    public static void m12659b(ImageView imageView, ImageModel imageModel) {
        if (imageModel != null && !C6307b.m19566a((Collection<T>) imageModel.getUrls())) {
            m12651a(imageView, imageModel, 0);
        }
    }

    /* renamed from: a */
    public static void m12650a(ImageView imageView, ImageModel imageModel) {
        if (m12658a(imageView.getContext())) {
            C3342a.m12468a(imageView.getContext()).mo10257a(imageModel).mo10252a().mo10256a(ScaleType.CENTER_CROP).mo10258a((C13401d) new C3397b(null, null)).mo10261a(imageView);
        }
    }

    /* renamed from: a */
    public static void m12657a(ImageView imageView, ImageModel imageModel, C3405a aVar) {
        m12656a(imageView, imageModel, 0, aVar);
    }

    /* renamed from: a */
    public static void m12651a(ImageView imageView, ImageModel imageModel, int i) {
        m12660b(imageView, imageModel, -1, -1, i, null);
    }

    /* renamed from: a */
    public static void m12649a(ImageView imageView, int i, int i2, int i3) {
        if (m12658a(imageView.getContext())) {
            C3342a.m12468a(imageView.getContext()).mo10253a(i).mo10252a().mo10256a(ScaleType.CENTER_CROP).mo10258a((C13401d) new C3397b(null, null)).mo10261a(imageView);
        }
    }

    /* renamed from: a */
    public static void m12654a(ImageView imageView, ImageModel imageModel, int i, int i2, C3405a aVar) {
        if (imageModel != null && !C6307b.m19566a((Collection<T>) imageModel.getUrls()) && m12658a(imageView.getContext())) {
            m12660b(imageView, imageModel, i, i2, -1, null);
        }
    }

    /* renamed from: b */
    public static void m12660b(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, C3405a aVar) {
        m12655a(imageView, imageModel, i, i2, false, i3, aVar);
    }

    /* renamed from: a */
    public static void m12653a(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, C3405a aVar) {
        if (m12658a(imageView.getContext())) {
            C3342a a = C3342a.m12468a(imageView.getContext()).mo10257a(imageModel).mo10252a().mo10256a(ScaleType.CENTER_CROP);
            if (i > 0 && i2 > 0) {
                a.mo10255a(i, i2);
            }
            if (i3 > 0) {
                a.mo10262b(i3);
            }
            a.mo10258a((C13401d) new C3397b(null, null));
            a.mo10261a(imageView);
        }
    }

    /* renamed from: a */
    public static void m12655a(ImageView imageView, ImageModel imageModel, int i, int i2, boolean z, int i3, C3405a aVar) {
        if (imageModel == null) {
            if (aVar != null) {
                aVar.mo10310a(imageModel, new IllegalArgumentException("imageModel == null"));
            }
        } else if (C6307b.m19566a((Collection<T>) imageModel.getUrls())) {
            if (aVar != null) {
                aVar.mo10310a(imageModel, new IllegalArgumentException("CollectionUtils.isEmpty(imageModel.urls)"));
            }
        } else if (!m12658a(imageView.getContext())) {
            if (aVar != null) {
                aVar.mo10310a(imageModel, new IllegalArgumentException("!isActivityOK(view.getContext())"));
            }
        } else {
            C3342a a = C3342a.m12468a(imageView.getContext()).mo10259a(m12648a(imageModel)).mo10257a(imageModel).mo10256a(ScaleType.CENTER_CROP);
            if (i > 0 && i2 > 0) {
                a.mo10255a(i, i2);
            }
            if (i3 > 0) {
                a.mo10262b(i3);
            }
            if (z) {
                a.mo10260a(true);
            }
            a.mo10258a((C13401d) new C3397b(imageModel, aVar));
            a.mo10261a(imageView);
        }
    }

    /* renamed from: a */
    public static void m12652a(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, int i4, float f, C3405a aVar) {
        if (m12658a(imageView.getContext())) {
            C3342a a = C3342a.m12468a(imageView.getContext()).mo10257a(imageModel).mo10252a().mo10254a(i4, f).mo10256a(ScaleType.CENTER_CROP);
            if (i3 > 0) {
                a.mo10262b(i3);
            }
            if (aVar != null) {
                a.mo10258a((C13401d) new C3397b(imageModel, aVar));
            } else {
                a.mo10258a((C13401d) new C3397b(null, null));
            }
            a.mo10261a(imageView);
        }
    }
}
