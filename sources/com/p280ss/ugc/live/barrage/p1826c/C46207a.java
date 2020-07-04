package com.p280ss.ugc.live.barrage.p1826c;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.ugc.live.barrage.c.a */
public final class C46207a {

    /* renamed from: a */
    public static final C46207a f118800a = new C46207a();

    /* renamed from: com.ss.ugc.live.barrage.c.a$a */
    public interface C46208a {
        /* renamed from: a */
        void mo114144a(View view, Bitmap bitmap);
    }

    private C46207a() {
    }

    /* renamed from: a */
    public static void m145109a(View view, C46208a aVar) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(aVar, "listener");
        view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.setDrawingCacheEnabled(true);
        try {
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null && !drawingCache.isRecycled()) {
                aVar.mo114144a(view, drawingCache);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo114155a(Context context, int i, C46208a aVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "listener");
        View inflate = LayoutInflater.from(context).inflate(i, null);
        C7573i.m23582a((Object) inflate, "view");
        m145109a(inflate, aVar);
    }
}
