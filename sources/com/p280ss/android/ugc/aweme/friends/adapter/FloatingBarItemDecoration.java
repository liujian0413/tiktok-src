package com.p280ss.android.ugc.aweme.friends.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.FloatingBarItemDecoration */
public class FloatingBarItemDecoration extends C1272h {

    /* renamed from: a */
    private final boolean f78901a;

    /* renamed from: b */
    private Context f78902b;

    /* renamed from: c */
    private Resources f78903c = this.f78902b.getResources();

    /* renamed from: d */
    private float f78904d;

    /* renamed from: e */
    private Paint f78905e;

    /* renamed from: f */
    private Paint f78906f;

    /* renamed from: g */
    private int f78907g;

    /* renamed from: h */
    private int f78908h;

    /* renamed from: i */
    private float f78909i;

    /* renamed from: j */
    private Rect f78910j;

    /* renamed from: k */
    private String f78911k;

    /* renamed from: l */
    private C30022a f78912l;

    /* renamed from: a */
    private String m98401a(int i) {
        String str;
        int a = this.f78912l.mo76245a(i);
        if (a != -1) {
            str = (String) this.f78912l.getSections()[a];
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f78911k)) {
            str = this.f78911k;
        }
        this.f78911k = str;
        return str;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
    }

    public FloatingBarItemDecoration(Context context, C30022a aVar, boolean z) {
        this.f78902b = context;
        this.f78904d = C9738o.m28708b(context, 32.0f);
        this.f78905e = new Paint();
        this.f78905e.setColor(this.f78903c.getColor(R.color.a6c));
        this.f78906f = new Paint();
        this.f78906f.setColor(this.f78903c.getColor(R.color.vv));
        this.f78906f.setTextSize(C9738o.m28708b(this.f78902b, 14.0f));
        FontMetrics fontMetrics = this.f78906f.getFontMetrics();
        this.f78907g = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f78908h = (int) fontMetrics.bottom;
        this.f78909i = C9738o.m28708b(this.f78902b, 16.0f);
        this.f78910j = new Rect();
        this.f78912l = aVar;
        this.f78901a = z;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        super.onDrawOver(canvas, recyclerView, sVar);
        int j = ((LinearLayoutManager) recyclerView.getLayoutManager()).mo5445j();
        int k = ((LinearLayoutManager) recyclerView.getLayoutManager()).mo5446k() - (this.f78901a ? 1 : 0);
        if (j != -1 && k > 0) {
            C1293v f = recyclerView.mo5575f(j);
            if (f != null) {
                if (this.f78901a) {
                    j--;
                }
                View view = f.itemView;
                String a = m98401a(j);
                if (!TextUtils.isEmpty(a)) {
                    boolean z = true;
                    int i = j + 1;
                    if (m98401a(i) == null || TextUtils.equals(m98401a(i), a) || ((float) (view.getHeight() + view.getTop())) >= this.f78904d) {
                        z = false;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f78904d);
                    }
                    this.f78910j.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f78904d));
                    this.f78905e.setColor(this.f78903c.getColor(R.color.a6c));
                    canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), ((float) recyclerView.getPaddingTop()) + this.f78904d, this.f78905e);
                    canvas.drawText(a, ((float) view.getPaddingLeft()) + this.f78909i, ((((float) recyclerView.getPaddingTop()) + this.f78904d) - ((this.f78904d - ((float) this.f78907g)) / 2.0f)) - ((float) this.f78908h), this.f78906f);
                    if (z) {
                        canvas.restore();
                    }
                }
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
    }
}
