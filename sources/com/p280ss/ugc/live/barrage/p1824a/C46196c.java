package com.p280ss.ugc.live.barrage.p1824a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.RectF;
import android.view.View;
import com.p280ss.ugc.live.barrage.p1824a.C46187a.C46188a;
import com.p280ss.ugc.live.barrage.p1824a.C46187a.C46188a.C46191c;
import com.p280ss.ugc.live.barrage.p1824a.C46187a.C46188a.C46192d;
import com.p280ss.ugc.live.barrage.p1826c.C46207a;
import com.p280ss.ugc.live.barrage.p1826c.C46207a.C46208a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.ugc.live.barrage.a.c */
public final class C46196c extends C46187a {

    /* renamed from: a */
    public Bitmap f118769a;

    /* renamed from: b */
    public View f118770b;

    /* renamed from: c */
    private final Context f118771c;

    /* renamed from: d */
    private int f118772d;

    /* renamed from: e */
    private final C46197a f118773e = new C46197a(this);

    /* renamed from: com.ss.ugc.live.barrage.a.c$a */
    public static final class C46197a implements C46208a {

        /* renamed from: a */
        final /* synthetic */ C46196c f118774a;

        C46197a(C46196c cVar) {
            this.f118774a = cVar;
        }

        /* renamed from: a */
        public final void mo114144a(View view, Bitmap bitmap) {
            int i;
            C7573i.m23587b(view, "view");
            C7573i.m23587b(bitmap, "bitmap");
            this.f118774a.f118770b = view;
            int i2 = 0;
            if (bitmap.isRecycled()) {
                this.f118774a.f118769a = Bitmap.createBitmap(0, 0, Config.ARGB_4444);
            } else {
                this.f118774a.f118769a = bitmap.copy(Config.ARGB_8888, true);
            }
            View view2 = this.f118774a.f118770b;
            if (view2 != null) {
                view2.destroyDrawingCache();
            }
            RectF rectF = this.f118774a.f118761k;
            float f = this.f118774a.f118761k.left;
            Bitmap bitmap2 = this.f118774a.f118769a;
            if (bitmap2 != null) {
                i = bitmap2.getWidth();
            } else {
                i = 0;
            }
            rectF.right = f + ((float) i);
            RectF rectF2 = this.f118774a.f118761k;
            float f2 = this.f118774a.f118761k.top;
            Bitmap bitmap3 = this.f118774a.f118769a;
            if (bitmap3 != null) {
                i2 = bitmap3.getHeight();
            }
            rectF2.bottom = f2 + ((float) i2);
            this.f118774a.mo114142e();
        }
    }

    /* renamed from: b */
    public final Bitmap mo114139b() {
        return this.f118769a;
    }

    /* renamed from: c */
    public final void mo114140c() {
        super.mo114140c();
        View view = this.f118770b;
        if (view != null) {
            C46207a.m145109a(view, this.f118773e);
        } else {
            C46207a.f118800a.mo114155a(this.f118771c, this.f118772d, this.f118773e);
        }
    }

    /* renamed from: d */
    public final void mo114141d() {
        super.mo114141d();
        View view = this.f118770b;
        if (view != null) {
            view.destroyDrawingCache();
        }
        this.f118770b = null;
        Bitmap bitmap = this.f118769a;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f118769a = null;
    }

    /* renamed from: a */
    public final void mo114143a(View view) {
        C7573i.m23587b(view, "view");
        m145077a(view, -1);
    }

    public C46196c(View view) {
        C7573i.m23587b(view, "view");
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "view.context");
        this.f118771c = context;
        mo114143a(view);
    }

    /* renamed from: a */
    private final void m145077a(View view, int i) {
        this.f118770b = view;
        this.f118772d = -1;
        C46188a aVar = this.f118762l;
        if (C7573i.m23585a((Object) aVar, (Object) C46191c.f118765a) || C7573i.m23585a((Object) aVar, (Object) C46192d.f118766a)) {
            View view2 = this.f118770b;
            if (view2 != null) {
                C46207a.m145109a(view2, this.f118773e);
                return;
            }
            C46207a.f118800a.mo114155a(this.f118771c, this.f118772d, this.f118773e);
        }
    }
}
