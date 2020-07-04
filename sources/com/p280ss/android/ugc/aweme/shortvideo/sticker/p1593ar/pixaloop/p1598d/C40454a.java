package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1598d;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.a */
public final class C40454a extends Dialog {

    /* renamed from: a */
    private DmtLoadingLayout f105169a;

    /* renamed from: b */
    private DmtTextView f105170b;

    /* renamed from: c */
    private View f105171c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.a$a */
    static final class C40455a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40454a f105172a;

        C40455a(C40454a aVar) {
            this.f105172a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C10761a.m31383a(this.f105172a.getContext(), (int) R.string.cue).mo25750a();
        }
    }

    public final void dismiss() {
        C40456b.m129369a(this);
        if (this.f105169a != null) {
            DmtLoadingLayout dmtLoadingLayout = this.f105169a;
            if (dmtLoadingLayout == null) {
                C7573i.m23580a();
            }
            dmtLoadingLayout.setVisibility(8);
        }
    }

    public final void show() {
        super.show();
        if (this.f105169a != null) {
            DmtLoadingLayout dmtLoadingLayout = this.f105169a;
            if (dmtLoadingLayout == null) {
                C7573i.m23580a();
            }
            dmtLoadingLayout.setVisibility(0);
        }
    }

    public C40454a(Context context) {
        C7573i.m23587b(context, "context");
        super(context, R.style.hi);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aax);
        this.f105169a = (DmtLoadingLayout) findViewById(R.id.bu9);
        this.f105170b = (DmtTextView) findViewById(R.id.a2f);
        this.f105171c = findViewById(R.id.cq8);
        Window window = getWindow();
        if (window == null) {
            C7573i.m23580a();
        }
        LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        Window window2 = getWindow();
        if (window2 == null) {
            C7573i.m23580a();
        }
        window2.setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        Paint paint = shapeDrawable.getPaint();
        C7573i.m23582a((Object) paint, "drawable.paint");
        paint.setColor(0);
        Window window3 = getWindow();
        if (window3 == null) {
            C7573i.m23580a();
        }
        window3.setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(false);
        View view = this.f105171c;
        if (view == null) {
            C7573i.m23580a();
        }
        view.setOnClickListener(new C40455a(this));
    }
}
