package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.FloatingBarItemDecoration */
public class FloatingBarItemDecoration extends C1272h {

    /* renamed from: a */
    public volatile boolean f79125a;

    /* renamed from: b */
    private Context f79126b;

    /* renamed from: c */
    private Resources f79127c;

    /* renamed from: d */
    private float f79128d;

    /* renamed from: e */
    private Paint f79129e;

    /* renamed from: f */
    private Paint f79130f;

    /* renamed from: g */
    private int f79131g;

    /* renamed from: h */
    private int f79132h;

    /* renamed from: i */
    private float f79133i;

    /* renamed from: j */
    private float f79134j;

    /* renamed from: k */
    private float f79135k;

    /* renamed from: l */
    private Bitmap f79136l;

    /* renamed from: m */
    private Bitmap f79137m;

    /* renamed from: n */
    private Rect f79138n;

    /* renamed from: o */
    private Rect f79139o;

    /* renamed from: p */
    private boolean f79140p;

    /* renamed from: q */
    private String f79141q;

    /* renamed from: r */
    private List<String> f79142r = new ArrayList();

    /* renamed from: s */
    private List<Integer> f79143s = new ArrayList();

    /* renamed from: a */
    private String m98613a(int i) {
        String str = null;
        if (this.f79125a) {
            return null;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= this.f79143s.size()) {
                i2 = -1;
                break;
            }
            i3 += ((Integer) this.f79143s.get(i2)).intValue();
            if (i < i3) {
                break;
            }
            i2++;
        }
        if (i2 != -1) {
            str = (String) this.f79142r.get(i2);
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f79141q)) {
            str = this.f79141q;
        }
        if ("Recent".equals(str)) {
            str = this.f79126b.getString(R.string.e3q);
        } else if ("Friend".equals(str)) {
            str = this.f79126b.getString(R.string.ea8);
        } else if (i == 0) {
            str = this.f79126b.getString(R.string.lm);
        }
        this.f79141q = str;
        return str;
    }

    public FloatingBarItemDecoration(Context context, List<String> list, List<Integer> list2) {
        this.f79126b = context;
        this.f79127c = this.f79126b.getResources();
        this.f79128d = C9738o.m28708b(context, 32.0f);
        this.f79129e = new Paint();
        this.f79129e.setColor(859328726);
        this.f79130f = new Paint();
        this.f79130f.setColor(this.f79127c.getColor(R.color.ab0));
        this.f79130f.setTextSize(C9738o.m28708b(this.f79126b, 13.0f));
        FontMetrics fontMetrics = this.f79130f.getFontMetrics();
        this.f79131g = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f79132h = (int) fontMetrics.bottom;
        this.f79133i = C9738o.m28708b(this.f79126b, 16.0f);
        this.f79138n = new Rect();
        this.f79134j = C9738o.m28708b(this.f79126b, 2.0f);
        this.f79136l = ((BitmapDrawable) this.f79127c.getDrawable(R.drawable.a5q)).getBitmap();
        this.f79137m = ((BitmapDrawable) this.f79127c.getDrawable(R.drawable.a9p)).getBitmap();
        this.f79135k = C9738o.m28708b(this.f79126b, 16.0f);
        this.f79139o = new Rect(0, 0, (int) this.f79135k, (int) this.f79135k);
        this.f79142r = list;
        this.f79143s = list2;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        super.onDrawOver(canvas, recyclerView, sVar);
        int j = ((LinearLayoutManager) recyclerView.getLayoutManager()).mo5445j();
        if (j != -1) {
            C1293v f = recyclerView.mo5575f(j);
            if (f != null) {
                View view = f.itemView;
                String a = m98613a(j);
                if (!TextUtils.isEmpty(a)) {
                    this.f79140p = false;
                    boolean z = true;
                    if (TextUtils.equals(this.f79126b.getString(R.string.ea8), a)) {
                        this.f79140p = true;
                    }
                    int i = j + 1;
                    if (m98613a(i) == null || TextUtils.equals(m98613a(i), a) || ((float) (view.getHeight() + view.getTop())) >= this.f79128d) {
                        z = false;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f79128d);
                    }
                    this.f79138n.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f79128d));
                    this.f79129e.setColor(this.f79127c.getColor(R.color.a6c));
                    canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), ((float) recyclerView.getPaddingTop()) + this.f79128d, this.f79129e);
                    canvas.drawText(a, ((float) view.getPaddingLeft()) + this.f79133i, ((((float) recyclerView.getPaddingTop()) + this.f79128d) - ((this.f79128d - ((float) this.f79131g)) / 2.0f)) - ((float) this.f79132h), this.f79130f);
                    if (this.f79140p) {
                        this.f79130f.getTextBounds(a, 0, a.length(), this.f79138n);
                        canvas.drawBitmap(this.f79137m, ((float) recyclerView.getPaddingLeft()) + this.f79133i + ((float) this.f79138n.width()) + this.f79134j, ((float) recyclerView.getPaddingTop()) + ((this.f79128d - ((float) this.f79131g)) / 2.0f) + ((float) this.f79132h), this.f79130f);
                    } else if (TextUtils.equals(this.f79126b.getString(R.string.e3q), a)) {
                        this.f79130f.getTextBounds(a, 0, a.length(), this.f79138n);
                        float paddingLeft = ((float) recyclerView.getPaddingLeft()) + this.f79133i + ((float) this.f79138n.width()) + this.f79134j;
                        float paddingTop = ((((float) recyclerView.getPaddingTop()) + ((this.f79128d - ((float) this.f79131g)) / 2.0f)) + ((float) this.f79132h)) - this.f79134j;
                        this.f79139o.set((int) paddingLeft, (int) paddingTop, (int) (paddingLeft + this.f79135k), (int) (paddingTop + this.f79135k));
                        canvas.drawBitmap(this.f79136l, null, this.f79139o, this.f79130f);
                    }
                    if (z) {
                        canvas.restore();
                    }
                }
            }
        }
    }
}
