package com.zhihu.matisse.internal.p1856ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.ListPopupWindow;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CursorAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.p1855a.C47331e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.zhihu.matisse.internal.ui.widget.a */
public final class C47364a {

    /* renamed from: a */
    public CursorAdapter f121563a;

    /* renamed from: b */
    public ListPopupWindow f121564b;

    /* renamed from: c */
    public OnItemSelectedListener f121565c;

    /* renamed from: d */
    private TextView f121566d;

    /* renamed from: a */
    public final void mo119446a(View view) {
        this.f121564b.f4814n = view;
    }

    /* renamed from: a */
    public final void mo119447a(CursorAdapter cursorAdapter) {
        this.f121564b.mo5249a((ListAdapter) cursorAdapter);
        this.f121563a = cursorAdapter;
    }

    public C47364a(Context context) {
        this.f121564b = new ListPopupWindow(context, null, R.attr.sf);
        this.f121564b.mo5481a(true);
        float f = context.getResources().getDisplayMetrics().density;
        this.f121564b.mo5487c((int) (216.0f * f));
        this.f121564b.f4807g = (int) (16.0f * f);
        this.f121564b.mo5484b((int) (f * -48.0f));
    }

    /* renamed from: a */
    public final void mo119448a(TextView textView) {
        this.f121566d = textView;
        Drawable drawable = this.f121566d.getCompoundDrawables()[2];
        TypedArray obtainStyledAttributes = this.f121566d.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.aj});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        drawable.setColorFilter(color, Mode.SRC_IN);
        this.f121566d.setVisibility(8);
        this.f121566d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                int i;
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.bn);
                ListPopupWindow listPopupWindow = C47364a.this.f121564b;
                if (C47364a.this.f121563a.getCount() > 6) {
                    i = dimensionPixelSize * 6;
                } else {
                    i = dimensionPixelSize * C47364a.this.f121563a.getCount();
                }
                listPopupWindow.mo5488d(i);
                C47364a.this.f121564b.mo4892d();
            }
        });
        this.f121566d.setOnTouchListener(this.f121564b.mo5483b((View) this.f121566d));
    }

    /* renamed from: a */
    public final void mo119445a(Context context, int i) {
        this.f121564b.mo5490f(i);
        mo119449b(context, i);
    }

    /* renamed from: b */
    public final void mo119449b(Context context, int i) {
        this.f121564b.dismiss();
        Cursor cursor = this.f121563a.getCursor();
        cursor.moveToPosition(i);
        String a = Album.m147787a(cursor).mo119345a(context);
        if (this.f121566d.getVisibility() == 0) {
            this.f121566d.setText(a);
        } else if (C47331e.m147784a()) {
            this.f121566d.setAlpha(0.0f);
            this.f121566d.setVisibility(0);
            this.f121566d.setText(a);
            this.f121566d.animate().alpha(1.0f).setDuration((long) context.getResources().getInteger(17694722)).start();
        } else {
            this.f121566d.setVisibility(0);
            this.f121566d.setText(a);
        }
    }
}
