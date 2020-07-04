package com.p280ss.android.ugc.aweme.share.p1543ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C6306c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.share.p1543ui.LiveShareCodeView.C38261b;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import java.io.File;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.share.ui.a */
public final class C38263a {

    /* renamed from: a */
    public static final C38263a f99436a = new C38263a();

    /* renamed from: b */
    private static final String f99437b = f99437b;

    /* renamed from: c */
    private static String f99438c;

    /* renamed from: d */
    private static UrlModel f99439d;

    /* renamed from: e */
    private static String f99440e;

    /* renamed from: f */
    private static String f99441f = "live_share_card.png";

    /* renamed from: com.ss.android.ugc.aweme.share.ui.a$a */
    public static final class C38264a implements C38261b {

        /* renamed from: a */
        final /* synthetic */ LiveShareCodeView f99442a;

        /* renamed from: b */
        final /* synthetic */ Context f99443b;

        /* renamed from: c */
        final /* synthetic */ C7562b f99444c;

        /* renamed from: a */
        public final void mo95888a() {
            String a = C38263a.f99436a.mo95889a(this.f99442a, this.f99443b);
            if (a != null) {
                this.f99444c.invoke(a);
            }
        }

        C38264a(LiveShareCodeView liveShareCodeView, Context context, C7562b bVar) {
            this.f99442a = liveShareCodeView;
            this.f99443b = context;
            this.f99444c = bVar;
        }
    }

    private C38263a() {
    }

    /* renamed from: a */
    private static Bitmap m122226a(View view) {
        C7573i.m23587b(view, "v");
        view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Config.ARGB_8888);
        if (createBitmap == null) {
            C7573i.m23580a();
        }
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* renamed from: a */
    public static void m122227a(Bundle bundle) {
        String str;
        Object obj = null;
        if (bundle != null) {
            str = bundle.getString("author_name");
        } else {
            str = null;
        }
        f99438c = str;
        if (bundle != null) {
            obj = bundle.get("video_cover");
        }
        if (obj != null) {
            f99439d = (UrlModel) obj;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
    }

    /* renamed from: a */
    public final String mo95889a(View view, Context context) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(context, "context");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        sb.append(C6306c.m19561a(sb2.toString()));
        sb.append(".png");
        f99441f = sb.toString();
        File cacheDir = context.getCacheDir();
        C7573i.m23582a((Object) cacheDir, "context.cacheDir");
        f99440e = cacheDir.getAbsolutePath();
        Bitmap a = m122226a(view);
        if (a == null || !BitmapUtils.saveBitmapToSD(a, f99440e, f99441f)) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f99440e);
        sb3.append('/');
        sb3.append(f99441f);
        return sb3.toString();
    }

    /* renamed from: a */
    public static void m122228a(C38343b bVar, Context context, C7562b<? super String, C7581n> bVar2) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(bVar2, "pathAction");
        LiveShareCodeView liveShareCodeView = new LiveShareCodeView(context);
        liveShareCodeView.mo95883a((C38261b) new C38264a(liveShareCodeView, context, bVar2));
        liveShareCodeView.mo95884a(f99438c, f99439d);
    }
}
