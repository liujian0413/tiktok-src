package com.p280ss.android.ugc.aweme.share.p1543ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.p612c.C12106d;
import com.bytedance.lighten.core.p612c.C12115m;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.ui.LiveShareCodeView */
public final class LiveShareCodeView extends LinearLayout {

    /* renamed from: b */
    public static final C38260a f99429b = new C38260a(null);

    /* renamed from: a */
    public C38261b f99430a;

    /* renamed from: c */
    private String f99431c;

    /* renamed from: d */
    private UrlModel f99432d;

    /* renamed from: e */
    private Context f99433e;

    /* renamed from: f */
    private HashMap f99434f;

    /* renamed from: com.ss.android.ugc.aweme.share.ui.LiveShareCodeView$a */
    public static final class C38260a {
        private C38260a() {
        }

        public /* synthetic */ C38260a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ui.LiveShareCodeView$b */
    public interface C38261b {
        /* renamed from: a */
        void mo95888a();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ui.LiveShareCodeView$c */
    public static final class C38262c extends C12106d {

        /* renamed from: a */
        final /* synthetic */ LiveShareCodeView f99435a;

        C38262c(LiveShareCodeView liveShareCodeView) {
            this.f99435a = liveShareCodeView;
        }

        /* renamed from: a */
        public final void mo29817a(Throwable th) {
            if (th != null) {
                C6497a.m20185b(th);
            }
            ((SmartCircleImageView) this.f99435a.mo95882a((int) R.id.bpv)).setImageBitmap(this.f99435a.getDefaultBitmap());
        }

        /* renamed from: a */
        public final void mo29816a(Bitmap bitmap) {
            if (bitmap != null) {
                ((SmartCircleImageView) this.f99435a.mo95882a((int) R.id.bpv)).setImageBitmap(LiveShareCodeView.m122218a(bitmap));
                C38261b bVar = this.f99435a.f99430a;
                if (bVar != null) {
                    bVar.mo95888a();
                }
            } else {
                ((SmartCircleImageView) this.f99435a.mo95882a((int) R.id.bpv)).setImageBitmap(this.f99435a.getDefaultBitmap());
                C38261b bVar2 = this.f99435a.f99430a;
                if (bVar2 != null) {
                    bVar2.mo95888a();
                }
            }
        }
    }

    /* renamed from: a */
    public final View mo95882a(int i) {
        if (this.f99434f == null) {
            this.f99434f = new HashMap();
        }
        View view = (View) this.f99434f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f99434f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Context getMContext() {
        return this.f99433e;
    }

    /* renamed from: a */
    private final void m122219a() {
        View.inflate(this.f99433e, R.layout.b3h, this);
    }

    public final Bitmap getDefaultBitmap() {
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f99433e.getResources(), R.drawable.b_k);
        if (decodeResource == null) {
            C7573i.m23580a();
        }
        return m122218a(decodeResource);
    }

    /* renamed from: a */
    public final LiveShareCodeView mo95883a(C38261b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f99430a = bVar;
        return this;
    }

    public final void setMContext(Context context) {
        C7573i.m23587b(context, "<set-?>");
        this.f99433e = context;
    }

    public LiveShareCodeView(Context context) {
        C7573i.m23587b(context, "context");
        this(context, null);
    }

    /* renamed from: a */
    public static Bitmap m122218a(Bitmap bitmap) {
        C7573i.m23587b(bitmap, "bmp");
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        TileMode tileMode = TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f = ((float) min) / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        C7573i.m23582a((Object) createBitmap, "newBitmap");
        return createBitmap;
    }

    public LiveShareCodeView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo95884a(String str, UrlModel urlModel) {
        this.f99431c = str;
        this.f99432d = urlModel;
        if (this.f99431c != null) {
            DmtTextView dmtTextView = (DmtTextView) mo95882a((int) R.id.bpw);
            C7573i.m23582a((Object) dmtTextView, "live_share_user_name");
            StringBuilder sb = new StringBuilder("@");
            sb.append(this.f99431c);
            dmtTextView.setText(sb.toString());
        }
        C12133n.m35299a(C23400r.m76741a(this.f99432d)).mo29845a("LiveShareCodeView").mo29839a(this.f99433e).mo29840a(Config.ARGB_8888).mo29850a((C12115m) new C38262c(this));
    }

    public LiveShareCodeView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "mContext");
        super(context);
        this.f99433e = context;
        m122219a();
    }
}
