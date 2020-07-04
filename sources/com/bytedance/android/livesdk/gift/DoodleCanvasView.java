package com.bytedance.android.livesdk.gift;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.p022v4.util.C0893e;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3390j;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView.DoodleType;
import com.bytedance.android.livesdk.gift.p371a.C7860a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.host.C9456c;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DoodleCanvasView extends View {

    /* renamed from: a */
    public boolean f21225a;

    /* renamed from: b */
    private int f21226b;

    /* renamed from: c */
    private Paint f21227c;

    /* renamed from: d */
    private List<C8283t> f21228d;

    /* renamed from: e */
    private C0893e<Bitmap> f21229e;

    /* renamed from: f */
    private int f21230f;

    /* renamed from: g */
    private long f21231g;

    /* renamed from: h */
    private int f21232h;

    /* renamed from: i */
    private ImageModel f21233i;

    /* renamed from: j */
    private int f21234j;

    /* renamed from: k */
    private DoodleGiftView f21235k;

    /* renamed from: l */
    private int f21236l;

    /* renamed from: m */
    private Stack<Integer> f21237m;

    /* renamed from: n */
    private int f21238n;

    /* renamed from: o */
    private C7856a f21239o;

    /* renamed from: p */
    private Runnable f21240p;

    /* renamed from: com.bytedance.android.livesdk.gift.DoodleCanvasView$a */
    public interface C7856a {
        /* renamed from: a */
        void mo20592a(List<C8283t> list, int i, int i2, int i3);
    }

    public List<C8283t> getMoveActions() {
        return this.f21228d;
    }

    public int getTotalCostDiamondCount() {
        return this.f21234j;
    }

    /* renamed from: c */
    public final boolean mo20582c() {
        if (!C6311g.m19573a(this.f21237m)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f21229e != null) {
            this.f21229e.mo3335c();
        }
        removeCallbacks(this.f21240p);
    }

    /* renamed from: e */
    private void m24092e() {
        if (this.f21238n < this.f21228d.size()) {
            this.f21237m.push(Integer.valueOf(this.f21228d.size() - this.f21238n));
            this.f21238n = this.f21228d.size();
        }
    }

    /* renamed from: a */
    public final void mo20579a() {
        if (this.f21228d != null && this.f21228d.size() > 0) {
            this.f21228d.clear();
            this.f21234j = 0;
            if (this.f21235k != null) {
                this.f21235k.mo20901c();
            }
        }
    }

    /* renamed from: d */
    private void m24091d() {
        this.f21227c = new Paint();
        this.f21227c.setAntiAlias(true);
        this.f21227c.setStyle(Style.FILL);
        this.f21228d = new ArrayList();
        this.f21229e = new C0893e<>();
        this.f21230f = (int) C9738o.m28708b(getContext(), 40.0f);
        this.f21226b = ((Integer) C5864b.f17251F.mo10240a()).intValue();
        this.f21236l = Color.parseColor("#51000000");
    }

    /* renamed from: b */
    public final void mo20581b() {
        if (mo20582c()) {
            int min = Math.min(((Integer) this.f21237m.pop()).intValue(), this.f21228d.size());
            int i = 0;
            for (int i2 = 0; i2 < min; i2++) {
                int size = this.f21228d.size() - 1;
                i += ((C8283t) this.f21228d.get(size)).f22756d;
                this.f21228d.remove(size);
                if (this.f21235k != null) {
                    this.f21235k.mo20900b();
                }
            }
            this.f21238n = this.f21228d.size();
            this.f21234j -= i;
            if (this.f21239o != null) {
                this.f21239o.mo20592a(this.f21228d, getWidth(), getHeight(), this.f21234j);
            }
            C9097a.m27146a().mo22267a((Object) new C7860a(this.f21228d.size(), this.f21234j));
        }
    }

    public void setDoodleCanvasBackground(int i) {
        this.f21236l = i;
    }

    public void setDoodleCanvasListener(C7856a aVar) {
        this.f21239o = aVar;
    }

    public DoodleCanvasView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.drawColor(this.f21236l);
    }

    public void setDrawDoodleGiftView(DoodleGiftView doodleGiftView) {
        this.f21235k = doodleGiftView;
        if (this.f21235k != null) {
            this.f21235k.mo20897a(DoodleType.draw);
        }
    }

    /* renamed from: a */
    private void m24090a(C8283t tVar) {
        if (this.f21235k != null) {
            if (this.f21228d.size() < this.f21226b) {
                this.f21228d.add(tVar);
                this.f21234j += this.f21232h;
                String b = ((C9456c) C3596c.m13172a(C9456c.class)).mo23196b(this.f21233i);
                if (!TextUtils.isEmpty(b)) {
                    this.f21235k.mo20899a(tVar.f22753a, tVar.f22754b, b);
                }
            } else if (!this.f21225a) {
                C9049ap.m27028a(C3390j.m12609a(C3358ac.m12515a((int) R.string.em1), Integer.valueOf(this.f21226b)));
                postDelayed(this.f21240p, 3000);
                this.f21225a = true;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        if (this.f21231g == 0) {
            C3166a.m11966e("DoodleCanvasView", "doodle gift id invalid, skip doodle.");
            return true;
        }
        switch (motionEvent.getAction()) {
            case 0:
                C8283t tVar = new C8283t((int) motionEvent.getX(), (int) motionEvent.getY(), this.f21231g, this.f21232h);
                m24090a(tVar);
                if (this.f21239o != null) {
                    this.f21239o.mo20592a(this.f21228d, getWidth(), getHeight(), this.f21234j);
                }
                C9097a.m27146a().mo22267a((Object) new C7860a(this.f21228d.size(), this.f21234j));
                break;
            case 1:
                m24092e();
                if (this.f21239o != null) {
                    this.f21239o.mo20592a(this.f21228d, getWidth(), getHeight(), this.f21234j);
                }
                C9097a.m27146a().mo22267a((Object) new C7860a(this.f21228d.size(), this.f21234j));
                break;
            case 2:
                if (this.f21228d.size() > 0) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int i3 = ((C8283t) this.f21228d.get(this.f21228d.size() - 1)).f22753a;
                    int i4 = ((C8283t) this.f21228d.get(this.f21228d.size() - 1)).f22754b;
                    int a = m24089a(i3, i4, x, y);
                    if (a > this.f21230f) {
                        int round = Math.round(((float) a) / ((float) this.f21230f));
                        int i5 = y - i4;
                        double abs = (double) Math.abs(i5);
                        int i6 = x - i3;
                        double abs2 = (double) Math.abs(i6);
                        Double.isNaN(abs);
                        Double.isNaN(abs2);
                        double atan = Math.atan(abs / abs2);
                        double d = (double) this.f21230f;
                        double cos = Math.cos(atan);
                        Double.isNaN(d);
                        int i7 = (int) (d * cos);
                        double d2 = (double) this.f21230f;
                        double sin = Math.sin(atan);
                        Double.isNaN(d2);
                        int i8 = (int) (d2 * sin);
                        for (int i9 = 1; i9 <= round; i9++) {
                            if (i6 > 0) {
                                i = (i7 * i9) + i3;
                            } else {
                                i = i3 - (i7 * i9);
                            }
                            int i10 = i;
                            if (i5 > 0) {
                                i2 = (i8 * i9) + i4;
                            } else {
                                i2 = i4 - (i8 * i9);
                            }
                            C8283t tVar2 = new C8283t(i10, i2, this.f21231g, this.f21232h);
                            m24090a(tVar2);
                        }
                        if (this.f21239o != null) {
                            this.f21239o.mo20592a(this.f21228d, getWidth(), getHeight(), this.f21234j);
                        }
                        C9097a.m27146a().mo22267a((Object) new C7860a(this.f21228d.size(), this.f21234j));
                        break;
                    }
                } else {
                    C8283t tVar3 = new C8283t((int) motionEvent.getX(), (int) motionEvent.getY(), this.f21231g, this.f21232h);
                    m24090a(tVar3);
                    if (this.f21239o != null) {
                        this.f21239o.mo20592a(this.f21228d, getWidth(), getHeight(), this.f21234j);
                    }
                    C9097a.m27146a().mo22267a((Object) new C7860a(this.f21228d.size(), this.f21234j));
                    return true;
                }
                break;
        }
        return true;
    }

    public DoodleCanvasView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo20580a(long j, int i, ImageModel imageModel) {
        this.f21231g = j;
        this.f21232h = i;
        this.f21233i = imageModel;
    }

    public DoodleCanvasView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21237m = new Stack<>();
        this.f21238n = 0;
        this.f21225a = false;
        this.f21240p = new Runnable() {
            public final void run() {
                DoodleCanvasView.this.f21225a = false;
            }
        };
        m24091d();
    }

    /* renamed from: a */
    private static int m24089a(int i, int i2, int i3, int i4) {
        return (int) Math.pow(Math.pow((double) (i3 - i), 2.0d) + Math.pow((double) (i4 - i2), 2.0d), 0.5d);
    }
}
