package com.p280ss.android.ugc.aweme.p313im.sdk.relations;

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
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.FloatingBarItemDecoration */
public class FloatingBarItemDecoration extends C1272h {

    /* renamed from: a */
    public int f82724a;

    /* renamed from: b */
    public int f82725b = -1;

    /* renamed from: c */
    public boolean f82726c;

    /* renamed from: d */
    private Context f82727d;

    /* renamed from: e */
    private Resources f82728e;

    /* renamed from: f */
    private float f82729f;

    /* renamed from: g */
    private Paint f82730g;

    /* renamed from: h */
    private Paint f82731h;

    /* renamed from: i */
    private int f82732i;

    /* renamed from: j */
    private int f82733j;

    /* renamed from: k */
    private float f82734k;

    /* renamed from: l */
    private float f82735l;

    /* renamed from: m */
    private float f82736m;

    /* renamed from: n */
    private Bitmap f82737n;

    /* renamed from: o */
    private Rect f82738o;

    /* renamed from: p */
    private Rect f82739p;

    /* renamed from: q */
    private boolean f82740q;

    /* renamed from: r */
    private String f82741r;

    /* renamed from: s */
    private List<String> f82742s;

    /* renamed from: t */
    private List<Integer> f82743t;

    /* renamed from: u */
    private boolean f82744u;

    /* renamed from: a */
    private String m102702a(int i) {
        String string;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= this.f82743t.size()) {
                i2 = -1;
                break;
            }
            i3 += ((Integer) this.f82743t.get(i2)).intValue();
            if (i < i3) {
                break;
            }
            i2++;
        }
        String str = null;
        if (i2 != -1) {
            str = (String) this.f82742s.get(i2);
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f82741r)) {
            str = this.f82741r;
        }
        if ("recent".equals(str)) {
            if (this.f82744u) {
                string = this.f82727d.getString(R.string.boh);
            } else {
                string = this.f82727d.getString(R.string.boi);
            }
            str = string;
        } else if ("Friend".equals(str)) {
            if (this.f82744u) {
                str = this.f82727d.getString(R.string.bjl);
            } else {
                str = this.f82727d.getString(R.string.bnf);
            }
        } else if (i == 0) {
            if (this.f82725b == 0) {
                str = this.f82727d.getString(R.string.bjl);
            } else if (this.f82725b == -1 || this.f82725b == 1) {
                str = this.f82727d.getString(R.string.bne);
            }
        }
        this.f82741r = str;
        return str;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
    }

    public FloatingBarItemDecoration(Context context, List<String> list, List<Integer> list2) {
        this.f82727d = context;
        this.f82728e = this.f82727d.getResources();
        this.f82729f = C9738o.m28708b(context, 32.0f);
        this.f82730g = new Paint();
        this.f82730g.setColor(this.f82728e.getColor(R.color.tz));
        this.f82731h = new Paint();
        this.f82731h.setColor(this.f82728e.getColor(R.color.uo));
        this.f82731h.setTextSize(C9738o.m28708b(this.f82727d, 13.0f));
        FontMetrics fontMetrics = this.f82731h.getFontMetrics();
        this.f82732i = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f82733j = (int) fontMetrics.bottom;
        this.f82734k = C9738o.m28708b(this.f82727d, 16.0f);
        this.f82738o = new Rect();
        this.f82735l = C9738o.m28708b(this.f82727d, 2.0f);
        this.f82737n = ((BitmapDrawable) this.f82728e.getDrawable(R.drawable.b6b)).getBitmap();
        this.f82736m = C9738o.m28708b(this.f82727d, 16.0f);
        this.f82739p = new Rect(0, 0, (int) this.f82736m, (int) this.f82736m);
        this.f82742s = list;
        this.f82743t = list2;
        this.f82744u = ((IIMService) C6993a.m21773a(IIMService.class)).getAbInterface().mo18356d();
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        float f;
        super.onDrawOver(canvas, recyclerView, sVar);
        this.f82726c = false;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            int j = linearLayoutManager.mo5445j();
            if (j != -1 && j >= this.f82724a) {
                C1293v f2 = recyclerView.mo5575f(j);
                if (f2 != null) {
                    int i = j - this.f82724a;
                    View view = f2.itemView;
                    String a = m102702a(i);
                    if (!TextUtils.isEmpty(a)) {
                        boolean z = true;
                        this.f82726c = true;
                        this.f82740q = false;
                        if (TextUtils.equals(this.f82727d.getString(R.string.bnf), a)) {
                            this.f82740q = true;
                        }
                        int i2 = i + 1;
                        if (m102702a(i2) == null || TextUtils.equals(m102702a(i2), a) || ((float) (view.getHeight() + view.getTop())) >= this.f82729f) {
                            z = false;
                        } else {
                            canvas.save();
                            canvas.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f82729f);
                        }
                        this.f82738o.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f82729f));
                        this.f82730g.setColor(this.f82728e.getColor(R.color.a6c));
                        canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), ((float) recyclerView.getPaddingTop()) + this.f82729f, this.f82730g);
                        canvas.drawText(a, ((float) view.getPaddingLeft()) + this.f82734k, ((((float) recyclerView.getPaddingTop()) + this.f82729f) - ((this.f82729f - ((float) this.f82732i)) / 2.0f)) - ((float) this.f82733j), this.f82731h);
                        if (this.f82740q) {
                            this.f82731h.getTextBounds(a, 0, a.length(), this.f82738o);
                            float paddingLeft = ((float) recyclerView.getPaddingLeft()) + this.f82734k + ((float) this.f82738o.width()) + this.f82735l;
                            if (C31915n.m103671a()) {
                                f = ((float) recyclerView.getPaddingTop()) + ((this.f82729f - ((float) this.f82732i)) / 2.0f) + ((float) this.f82733j);
                            } else {
                                f = ((((float) recyclerView.getPaddingTop()) + ((this.f82729f - ((float) this.f82732i)) / 2.0f)) + ((float) this.f82733j)) - this.f82735l;
                            }
                            this.f82739p.set((int) paddingLeft, (int) f, (int) (paddingLeft + this.f82736m), (int) (f + this.f82736m));
                            canvas.drawBitmap(this.f82737n, null, this.f82739p, this.f82731h);
                        }
                        if (z) {
                            canvas.restore();
                        }
                    }
                }
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
    }
}
