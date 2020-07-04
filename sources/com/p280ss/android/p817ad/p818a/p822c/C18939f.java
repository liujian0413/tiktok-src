package com.p280ss.android.p817ad.p818a.p822c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ad.a.c.f */
public final class C18939f extends Toast {

    /* renamed from: a */
    private Context f51045a;

    private C18939f(Context context) {
        super(context);
        this.f51045a = context;
    }

    /* renamed from: a */
    public final void mo50326a(int i) {
        super.setGravity(17, 0, 0);
    }

    /* renamed from: a */
    public final void mo50327a(Drawable drawable) {
        int i;
        View view = getView();
        if (view != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.ax9);
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                if (drawable == null) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
                return;
            }
            throw new RuntimeException("This Toast was not created with Toast.makeText()");
        }
        throw new RuntimeException("This Toast was not created with Toast.makeText()");
    }

    /* renamed from: a */
    public static C18939f m61805a(Context context, CharSequence charSequence, int i) {
        C18939f fVar = new C18939f(context);
        View inflate = View.inflate(context, R.layout.ajf, null);
        inflate.setBackgroundResource(R.drawable.bjg);
        inflate.findViewById(R.id.ax9).setVisibility(8);
        fVar.setView(inflate);
        ((TextView) inflate.findViewById(R.id.text)).setText(charSequence);
        fVar.setDuration(i);
        return fVar;
    }
}
