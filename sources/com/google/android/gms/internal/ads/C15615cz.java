package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15349d;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.cz */
public final class C15615cz extends RelativeLayout {

    /* renamed from: a */
    private static final float[] f44261a = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: b */
    private AnimationDrawable f44262b;

    public C15615cz(Context context, C15612cw cwVar, LayoutParams layoutParams) {
        super(context);
        C15267r.m44384a(cwVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f44261a, null, null));
        shapeDrawable.getPaint().setColor(cwVar.f44246b);
        setLayoutParams(layoutParams);
        C14793ay.m42896b().mo39197a((View) this, (Drawable) shapeDrawable);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(cwVar.mo41472a())) {
            LayoutParams layoutParams3 = new LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(cwVar.mo41472a());
            textView.setTextColor(cwVar.f44247c);
            textView.setTextSize((float) cwVar.f44248d);
            textView.setPadding(afb.m45721a(context, 4), 0, afb.m45721a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<C15620dd> list = cwVar.f44245a;
        if (list != null && list.size() > 1) {
            this.f44262b = new AnimationDrawable();
            for (C15620dd a : list) {
                try {
                    this.f44262b.addFrame((Drawable) C15349d.m44669a(a.mo41491a()), cwVar.f44249e);
                } catch (Exception e) {
                    acd.m45778b("Error while getting drawable.", e);
                }
            }
            C14793ay.m42896b().mo39197a((View) imageView, (Drawable) this.f44262b);
        } else if (list.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) C15349d.m44669a(((C15620dd) list.get(0)).mo41491a()));
            } catch (Exception e2) {
                acd.m45778b("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        if (this.f44262b != null) {
            this.f44262b.start();
        }
        super.onAttachedToWindow();
    }
}
