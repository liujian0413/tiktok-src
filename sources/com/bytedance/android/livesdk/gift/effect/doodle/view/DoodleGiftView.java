package com.bytedance.android.livesdk.gift.effect.doodle.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.gift.effect.doodle.p377a.C7980a;
import com.bytedance.android.livesdk.gift.effect.doodle.p378b.C7983a;
import com.bytedance.android.livesdk.gift.effect.doodle.p378b.C7984b;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DoodleGiftView extends View {

    /* renamed from: A */
    private float f21681A;

    /* renamed from: B */
    private float f21682B;

    /* renamed from: C */
    private int f21683C;

    /* renamed from: D */
    private Matrix f21684D;

    /* renamed from: E */
    private Bitmap f21685E;

    /* renamed from: F */
    private long f21686F;

    /* renamed from: G */
    private int f21687G;

    /* renamed from: a */
    private float f21688a;

    /* renamed from: b */
    private float f21689b;

    /* renamed from: c */
    private C7984b f21690c;

    /* renamed from: d */
    private List<C7983a> f21691d;

    /* renamed from: e */
    private DoodleType f21692e;

    /* renamed from: f */
    private HashMap<String, Bitmap> f21693f;

    /* renamed from: g */
    private Paint f21694g;

    /* renamed from: h */
    private float f21695h;

    /* renamed from: i */
    private float f21696i;

    /* renamed from: j */
    private float f21697j;

    /* renamed from: k */
    private float f21698k;

    /* renamed from: l */
    private float f21699l;

    /* renamed from: m */
    private float f21700m;

    /* renamed from: n */
    private long f21701n;

    /* renamed from: o */
    private long f21702o;

    /* renamed from: p */
    private long f21703p;

    /* renamed from: q */
    private long f21704q;

    /* renamed from: r */
    private long f21705r;

    /* renamed from: s */
    private long f21706s;

    /* renamed from: t */
    private C7980a f21707t;

    /* renamed from: u */
    private boolean f21708u;

    /* renamed from: v */
    private boolean f21709v;

    /* renamed from: w */
    private int f21710w;

    /* renamed from: x */
    private float f21711x;

    /* renamed from: y */
    private float f21712y;

    /* renamed from: z */
    private float f21713z;

    public enum DoodleType {
        play,
        draw
    }

    /* renamed from: d */
    public final void mo20902d() {
        this.f21708u = true;
    }

    public int getDrawPointNum() {
        return this.f21691d.size();
    }

    /* renamed from: f */
    private void m24516f() {
        this.f21690c = null;
        if (this.f21707t != null) {
            this.f21707t.mo20873a();
        }
    }

    /* renamed from: b */
    public final void mo20900b() {
        if (this.f21692e == DoodleType.draw && !this.f21691d.isEmpty()) {
            this.f21691d.remove(getDrawPointNum() - 1);
            invalidate();
        }
    }

    /* renamed from: c */
    public final void mo20901c() {
        if (this.f21692e == DoodleType.draw && !this.f21691d.isEmpty()) {
            this.f21691d.clear();
            invalidate();
        }
    }

    /* renamed from: e */
    private void m24515e() {
        float f;
        int c = C3358ac.m12523c();
        int b = C3358ac.m12520b();
        this.f21699l = this.f21690c.f21664f;
        this.f21700m = this.f21690c.f21665g;
        float f2 = this.f21690c.f21662d;
        float f3 = this.f21690c.f21663e;
        float f4 = (float) c;
        float f5 = this.f21690c.f21659a / f4;
        this.f21695h = f2 / f5;
        this.f21696i = f3 / f5;
        if (this.f21687G == 1) {
            f = 0.8f;
        } else {
            f = 0.5f;
        }
        this.f21688a = f;
        float f6 = this.f21695h / this.f21696i;
        if (this.f21695h > this.f21688a * f4) {
            this.f21695h = this.f21688a * f4;
            this.f21696i = this.f21695h / f6;
        }
        float f7 = (float) b;
        if (this.f21696i > this.f21688a * f7) {
            this.f21696i = this.f21688a * f7;
            this.f21695h = this.f21696i * f6;
        }
        this.f21697j = (f4 - this.f21695h) / 2.0f;
        this.f21698k = (f7 - this.f21696i) / 2.0f;
        if (this.f21690c.f21661c.size() > 30) {
            this.f21702o = 1500 / ((long) this.f21690c.f21661c.size());
        } else {
            this.f21702o = 64;
        }
        this.f21701n = 1200;
        this.f21704q = (this.f21702o * ((long) this.f21690c.f21661c.size())) + 60;
        this.f21705r = this.f21704q + this.f21701n;
        this.f21703p = this.f21704q + this.f21701n + 300;
        for (int i = 0; i < this.f21690c.f21661c.size(); i++) {
            ((C7983a) this.f21690c.f21661c.get(i)).f21657d = ((long) i) * this.f21702o;
            m24512a(((C7983a) this.f21690c.f21661c.get(i)).f21656c);
        }
    }

    /* renamed from: a */
    public final void mo20898a() {
        if (this.f21692e == DoodleType.play) {
            this.f21708u = false;
            this.f21709v = false;
            this.f21706s = 0;
            if (this.f21707t != null) {
                this.f21707t.mo20875a(300, this.f21698k);
            }
            invalidate();
        }
    }

    /* renamed from: a */
    public final DoodleGiftView mo20895a(C7980a aVar) {
        this.f21707t = aVar;
        return this;
    }

    public DoodleGiftView(Context context) {
        super(context);
        m24509a(context);
    }

    /* renamed from: a */
    public final DoodleGiftView mo20897a(DoodleType doodleType) {
        this.f21692e = doodleType;
        return this;
    }

    /* renamed from: a */
    private void m24512a(String str) {
        if (!this.f21693f.containsKey(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            if (decodeFile != null) {
                this.f21693f.put(str, Bitmap.createBitmap(decodeFile));
            }
        }
    }

    /* renamed from: a */
    private void m24509a(Context context) {
        this.f21691d = new ArrayList();
        this.f21693f = new HashMap<>();
        this.f21692e = DoodleType.draw;
        this.f21684D = new Matrix();
        this.f21694g = new Paint();
        this.f21689b = getResources().getDimension(R.dimen.ol);
        this.f21687G = context.getResources().getConfiguration().orientation;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (this.f21692e) {
            case play:
                m24510a(canvas);
                return;
            case draw:
                m24513b(canvas);
                break;
        }
    }

    /* renamed from: a */
    private void m24510a(Canvas canvas) {
        if (!this.f21708u && this.f21690c != null && !this.f21690c.f21661c.isEmpty()) {
            List<C7983a> list = this.f21690c.f21661c;
            if (this.f21706s <= this.f21705r) {
                m24511a(canvas, list);
            } else {
                m24514b(canvas, list);
            }
            this.f21706s += 20;
            if (this.f21706s < this.f21703p) {
                postInvalidateDelayed(20);
                return;
            }
            this.f21708u = true;
            m24516f();
        }
    }

    /* renamed from: b */
    private void m24513b(Canvas canvas) {
        if (!this.f21691d.isEmpty()) {
            int drawPointNum = getDrawPointNum();
            for (int i = 0; i < drawPointNum; i++) {
                C7983a aVar = (C7983a) this.f21691d.get(i);
                Bitmap bitmap = (Bitmap) this.f21693f.get(aVar.f21656c);
                if (bitmap != null) {
                    int width = aVar.f21654a - (bitmap.getWidth() / 2);
                    int height = aVar.f21655b - (bitmap.getHeight() / 2);
                    this.f21682B = m24508a(bitmap.getWidth(), bitmap.getHeight()) * 0.9f;
                    this.f21684D.setScale(this.f21682B, this.f21682B, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
                    this.f21684D.postTranslate((float) width, (float) height);
                    canvas.drawBitmap(bitmap, this.f21684D, this.f21694g);
                }
            }
        }
    }

    /* renamed from: a */
    public final DoodleGiftView mo20896a(C7984b bVar) {
        if (bVar == null) {
            return this;
        }
        this.f21690c = bVar;
        m24515e();
        return this;
    }

    public DoodleGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24509a(context);
    }

    /* renamed from: a */
    private float m24508a(int i, int i2) {
        return this.f21689b / ((float) Math.max(i, i2));
    }

    /* renamed from: b */
    private void m24514b(Canvas canvas, List<C7983a> list) {
        if (this.f21707t != null && !this.f21709v) {
            this.f21707t.mo20874a(300);
            this.f21709v = true;
        }
        this.f21710w = list.size();
        for (int i = 0; i < this.f21710w; i++) {
            this.f21685E = (Bitmap) this.f21693f.get(((C7983a) list.get(i)).f21656c);
            if (this.f21685E != null) {
                this.f21711x = ((this.f21695h * (((float) ((C7983a) list.get(i)).f21654a) - this.f21699l)) / this.f21690c.f21662d) + this.f21697j;
                this.f21712y = ((this.f21696i * (((float) ((C7983a) list.get(i)).f21655b) - this.f21700m)) / this.f21690c.f21663e) + this.f21698k;
                this.f21713z = this.f21711x - ((float) (this.f21685E.getWidth() / 2));
                this.f21681A = this.f21712y - ((float) (this.f21685E.getHeight() / 2));
                this.f21686F = this.f21703p - this.f21706s;
                this.f21682B = m24508a(this.f21685E.getWidth(), this.f21685E.getHeight()) * 0.9f;
                this.f21682B += (1.0f - (((float) this.f21686F) / 300.0f)) * 0.5f;
                this.f21683C = (int) ((((float) this.f21686F) / 300.0f) * 255.0f);
                this.f21684D.setScale(this.f21682B, this.f21682B, (float) (this.f21685E.getWidth() / 2), (float) (this.f21685E.getHeight() / 2));
                this.f21684D.postTranslate(this.f21713z, this.f21681A);
                this.f21694g.setAlpha(this.f21683C);
                canvas.drawBitmap(this.f21685E, this.f21684D, this.f21694g);
            }
        }
    }

    /* renamed from: a */
    private void m24511a(Canvas canvas, List<C7983a> list) {
        this.f21710w = list.size();
        for (int i = 0; i < this.f21710w; i++) {
            this.f21685E = (Bitmap) this.f21693f.get(((C7983a) list.get(i)).f21656c);
            if (this.f21685E != null) {
                if (((C7983a) list.get(i)).f21657d <= this.f21706s) {
                    this.f21711x = ((this.f21695h * (((float) ((C7983a) list.get(i)).f21654a) - this.f21699l)) / this.f21690c.f21662d) + this.f21697j;
                    this.f21712y = ((this.f21696i * (((float) ((C7983a) list.get(i)).f21655b) - this.f21700m)) / this.f21690c.f21663e) + this.f21698k;
                    this.f21713z = this.f21711x - ((float) (this.f21685E.getWidth() / 2));
                    this.f21681A = this.f21712y - ((float) (this.f21685E.getHeight() / 2));
                    this.f21682B = m24508a(this.f21685E.getWidth(), this.f21685E.getHeight()) * 0.9f;
                    this.f21683C = NormalGiftView.ALPHA_255;
                    if (!((C7983a) list.get(i)).f21658e) {
                        this.f21686F = this.f21706s - ((C7983a) list.get(i)).f21657d;
                        if (this.f21686F > 60) {
                            ((C7983a) list.get(i)).f21658e = true;
                        } else {
                            this.f21682B = (((float) this.f21686F) / 60.0f) * this.f21682B;
                            this.f21683C = (int) ((((float) this.f21686F) / 60.0f) * 255.0f);
                        }
                    }
                    this.f21684D.setScale(this.f21682B, this.f21682B, (float) (this.f21685E.getWidth() / 2), (float) (this.f21685E.getHeight() / 2));
                    this.f21684D.postTranslate(this.f21713z, this.f21681A);
                    this.f21694g.setAlpha(this.f21683C);
                    canvas.drawBitmap(this.f21685E, this.f21684D, this.f21694g);
                } else {
                    return;
                }
            }
        }
    }

    public DoodleGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24509a(context);
    }

    /* renamed from: a */
    public final void mo20899a(int i, int i2, String str) {
        if (this.f21692e == DoodleType.draw && str != null) {
            this.f21691d.add(new C7983a(i, i2, str));
            m24512a(str);
            invalidate();
        }
    }
}
