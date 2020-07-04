package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.C9379p;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.d */
public final class C5798d extends FrameLayout {

    /* renamed from: A */
    private boolean f17080A;

    /* renamed from: B */
    private Rect f17081B = new Rect();

    /* renamed from: C */
    private Rect f17082C = new Rect();

    /* renamed from: a */
    public C9379p f17083a;

    /* renamed from: b */
    public TextView f17084b;

    /* renamed from: c */
    public int[] f17085c;

    /* renamed from: d */
    public int f17086d;

    /* renamed from: e */
    public int f17087e;

    /* renamed from: f */
    public int f17088f;

    /* renamed from: g */
    public int f17089g;

    /* renamed from: h */
    public int f17090h;

    /* renamed from: i */
    public int f17091i;

    /* renamed from: j */
    public String f17092j;

    /* renamed from: k */
    public boolean f17093k;

    /* renamed from: l */
    public C5800a f17094l;

    /* renamed from: m */
    int[] f17095m = new int[2];

    /* renamed from: n */
    int[] f17096n = new int[2];

    /* renamed from: o */
    private ImageView f17097o;

    /* renamed from: p */
    private Button f17098p;

    /* renamed from: q */
    private View f17099q;

    /* renamed from: r */
    private View f17100r;

    /* renamed from: s */
    private View f17101s;

    /* renamed from: t */
    private View f17102t;

    /* renamed from: u */
    private float f17103u;

    /* renamed from: v */
    private float f17104v;

    /* renamed from: w */
    private float f17105w;

    /* renamed from: x */
    private float f17106x;

    /* renamed from: y */
    private boolean f17107y;

    /* renamed from: z */
    private int f17108z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.d$a */
    public interface C5800a {
        /* renamed from: a */
        void mo13739a(C9379p pVar);

        /* renamed from: a */
        void mo13741a(String str, int i);

        /* renamed from: a */
        void mo13742a(boolean z);

        /* renamed from: g */
        void mo13744g();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final int getType() {
        return this.f17083a.f25752g;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m18250c();
    }

    public final C9379p getRoomDecoration() {
        this.f17083a.f25756k = this.f17090h;
        this.f17083a.f25757l = this.f17091i;
        return this.f17083a;
    }

    /* renamed from: b */
    private boolean m18248b() {
        if (!this.f17093k || ((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo10240a()).intValue() <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m18251d() {
        if (this.f17099q != null) {
            this.f17099q.setVisibility(4);
            this.f17099q.setAlpha(1.0f);
        }
    }

    /* renamed from: e */
    private void m18252e() {
        if (this.f17094l != null) {
            this.f17094l.mo13739a(this.f17083a);
            this.f17094l.mo13744g();
        }
    }

    public final JSONObject getDecorationInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", String.valueOf(this.f17083a.f25753h));
            jSONObject.put(C38347c.f99553h, this.f17092j);
            jSONObject.put("x", this.f17083a.f25754i);
            jSONObject.put("y", this.f17083a.f25755j);
            jSONObject.put("w", this.f17090h);
            jSONObject.put("h", this.f17091i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: c */
    private void m18250c() {
        if (this.f17083a.f25746a != null && this.f17083a.f25746a.getUrls() != null && this.f17083a.f25746a.getUrls().size() != 0) {
            CharSequence charSequence = null;
            Iterator it = this.f17083a.f25746a.getUrls().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str)) {
                    charSequence = str;
                    break;
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                C5343e.m17035a(this.f17097o, this.f17083a.f25746a, (C3405a) new C3405a() {

                    /* renamed from: b */
                    private boolean f17110b;

                    /* renamed from: a */
                    public final void mo10308a(ImageModel imageModel) {
                    }

                    /* renamed from: a */
                    public final void mo10310a(ImageModel imageModel, Exception exc) {
                    }

                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final /* synthetic */ void mo14305a(View view) {
                        if (C5798d.this.f17094l != null) {
                            C5798d.this.f17094l.mo13741a(C5798d.this.f17092j, C5798d.this.f17083a.f25750e);
                        }
                    }

                    /* renamed from: a */
                    public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                        int i3;
                        int i4;
                        float f;
                        if (!this.f17110b) {
                            this.f17110b = true;
                            C5798d.this.f17086d = (int) C9738o.m28708b(C5798d.this.getContext(), ((float) i) / 2.0f);
                            C5798d.this.f17087e = (int) C9738o.m28708b(C5798d.this.getContext(), ((float) i2) / 2.0f);
                            C5798d.this.f17088f = C5798d.this.f17086d / 2;
                            C5798d.this.f17089g = C5798d.this.f17087e / 2;
                            LayoutParams layoutParams = C5798d.this.getLayoutParams();
                            layoutParams.width = C5798d.this.f17086d;
                            layoutParams.height = C5798d.this.f17087e;
                            C5798d.this.setLayoutParams(layoutParams);
                            if (C5798d.this.f17083a.f25754i != -1 || C5798d.this.f17083a.f25755j != -1) {
                                float f2 = 1.0f;
                                if (C5798d.this.f17083a.f25756k > 0) {
                                    f = ((float) C5798d.this.f17090h) / ((float) C5798d.this.f17083a.f25756k);
                                } else {
                                    f = 1.0f;
                                }
                                if (C5798d.this.f17083a.f25757l > 0) {
                                    f2 = ((float) C5798d.this.f17091i) / ((float) C5798d.this.f17083a.f25757l);
                                }
                                i3 = ((int) (((float) C5798d.this.f17083a.f25754i) * f)) - C5798d.this.f17088f;
                                i4 = ((int) (((float) C5798d.this.f17083a.f25755j) * f2)) - C5798d.this.f17089g;
                            } else if (C5798d.this.f17083a.f25760o == null || C5798d.this.f17083a.f25760o.size() <= 1) {
                                i3 = (C5798d.this.f17090h / 2) - C5798d.this.f17088f;
                                i4 = (C5798d.this.f17091i / 3) - C5798d.this.f17089g;
                            } else {
                                double d = (double) C5798d.this.f17090h;
                                double doubleValue = ((Double) C5798d.this.f17083a.f25760o.get(0)).doubleValue();
                                Double.isNaN(d);
                                i3 = (int) (d * doubleValue);
                                double d2 = (double) C5798d.this.f17091i;
                                double doubleValue2 = ((Double) C5798d.this.f17083a.f25760o.get(1)).doubleValue();
                                Double.isNaN(d2);
                                i4 = (int) (d2 * doubleValue2);
                            }
                            if (i3 < C5798d.this.f17085c[2]) {
                                i3 = C5798d.this.f17085c[2];
                            } else if (layoutParams.width + i3 > C5798d.this.f17085c[3]) {
                                i3 = C5798d.this.f17085c[3] - layoutParams.width;
                            }
                            if (i4 < C5798d.this.f17085c[0]) {
                                i4 = C5798d.this.f17085c[0];
                            } else if (layoutParams.height + i4 > C5798d.this.f17085c[1]) {
                                i4 = C5798d.this.f17085c[1] - layoutParams.height;
                            }
                            C5798d.this.setX((float) i3);
                            C5798d.this.setY((float) i4);
                            C5798d.this.f17083a.f25754i = i3 + C5798d.this.f17088f;
                            C5798d.this.f17083a.f25755j = i4 + C5798d.this.f17089g;
                            if (C5798d.this.f17093k && C5798d.this.f17094l != null) {
                                C5798d.this.f17094l.mo13744g();
                            }
                            if (1 == C5798d.this.f17083a.f25752g) {
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) C5798d.this.f17084b.getLayoutParams();
                                if (C5798d.this.f17083a.f25751f != null && C5798d.this.f17083a.f25751f.length == 4) {
                                    layoutParams2.leftMargin = (int) C9738o.m28708b(C5798d.this.getContext(), ((float) C5798d.this.f17083a.f25751f[0]) / 2.0f);
                                    layoutParams2.topMargin = (int) C9738o.m28708b(C5798d.this.getContext(), ((float) C5798d.this.f17083a.f25751f[1]) / 2.0f);
                                    layoutParams2.width = (int) C9738o.m28708b(C5798d.this.getContext(), ((float) C5798d.this.f17083a.f25751f[2]) / 2.0f);
                                    layoutParams2.height = (int) C9738o.m28708b(C5798d.this.getContext(), ((float) C5798d.this.f17083a.f25751f[3]) / 2.0f);
                                }
                                C5798d.this.f17084b.setLayoutParams(layoutParams2);
                                C5798d.this.f17084b.setTextSize(2, (float) (C5798d.this.f17083a.f25748c / 2));
                                C5798d.this.f17084b.setTextColor(Color.parseColor(C5798d.this.f17083a.f25747b));
                                String str = "";
                                if (!TextUtils.isEmpty(C5798d.this.f17092j)) {
                                    str = C5798d.this.f17092j;
                                } else if (!TextUtils.isEmpty(C5798d.this.f17083a.f25749d)) {
                                    str = C5798d.this.f17083a.f25749d;
                                }
                                C5798d.this.f17084b.setText(str);
                                C5798d.this.f17084b.setOnClickListener(new C5801e(this));
                                C5798d.this.f17084b.setVisibility(0);
                            } else {
                                C5798d.this.f17084b.setVisibility(8);
                            }
                            C5798d.this.setVisibility(0);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo14295a() {
        this.f17092j = this.f17083a.f25749d;
        this.f17084b.setText(this.f17092j);
    }

    public final void setText(String str) {
        this.f17092j = str;
        this.f17084b.setText(str);
    }

    /* renamed from: a */
    private void m18247a(boolean z) {
        if (this.f17094l != null && C3358ac.m12529f()) {
            this.f17094l.mo13742a(z);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f17093k || !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m18243a(float f) {
        if (this.f17099q != null) {
            this.f17099q.setAlpha(1.0f);
            if (this.f17099q.getVisibility() != 0) {
                this.f17099q.setVisibility(0);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f17103u = motionEvent.getRawX();
                this.f17104v = motionEvent.getRawY();
                this.f17105w = this.f17103u;
                this.f17106x = this.f17104v;
                return true;
            case 1:
                if (m18249b(this, this.f17100r)) {
                    m18252e();
                } else if (this.f17084b.getVisibility() == 0 && !this.f17107y) {
                    this.f17084b.performClick();
                } else if (this.f17107y) {
                    this.f17083a.f25754i = (int) (getX() + ((float) this.f17088f));
                    this.f17083a.f25755j = (int) (getY() + ((float) this.f17089g));
                    if (this.f17094l != null) {
                        this.f17094l.mo13744g();
                    }
                    this.f17107y = false;
                }
                m18251d();
                m18247a(false);
                return true;
            case 2:
                float abs = Math.abs(motionEvent.getRawX() - this.f17105w);
                float abs2 = Math.abs(motionEvent.getRawY() - this.f17106x);
                if (abs > ((float) this.f17108z) || abs2 > ((float) this.f17108z)) {
                    this.f17107y = true;
                }
                float rawX = motionEvent.getRawX() - this.f17103u;
                float rawY = motionEvent.getRawY() - this.f17104v;
                if (getX() + rawX >= ((float) this.f17085c[2]) && getX() + ((float) this.f17086d) + rawX <= ((float) this.f17085c[3])) {
                    this.f17103u = motionEvent.getRawX();
                    setX(getX() + rawX);
                }
                if (getY() + rawY >= ((float) this.f17085c[0]) && getY() + ((float) this.f17087e) + rawY <= ((float) this.f17085c[1])) {
                    this.f17104v = motionEvent.getRawY();
                    setY(getY() + rawY);
                }
                m18246a((View) this, this.f17100r);
                m18247a(true);
                m18243a(1.0f);
                return true;
            case 3:
                m18251d();
                m18247a(false);
                return true;
            default:
                return true;
        }
    }

    /* renamed from: a */
    public final void mo14296a(int[] iArr) {
        this.f17085c = iArr;
        if (getX() < ((float) this.f17085c[2])) {
            setX((float) this.f17085c[2]);
        } else if (getX() + ((float) this.f17086d) > ((float) this.f17085c[3])) {
            setX((float) this.f17085c[3]);
        }
        if (getY() < ((float) this.f17085c[0])) {
            setY((float) this.f17085c[0]);
            return;
        }
        if (getY() + ((float) this.f17087e) > ((float) this.f17085c[1])) {
            setY((float) (this.f17085c[1] - this.f17087e));
        }
    }

    /* renamed from: b */
    private boolean m18249b(View view, View view2) {
        view.getLocationOnScreen(this.f17096n);
        view2.getLocationOnScreen(this.f17095m);
        m18245a(view, this.f17081B, this.f17096n);
        m18245a(view2, this.f17082C, this.f17095m);
        return this.f17081B.intersect(this.f17082C);
    }

    /* renamed from: a */
    private void m18244a(Context context, ViewGroup viewGroup) {
        inflate(context, R.layout.amg, viewGroup);
        this.f17099q = viewGroup.findViewById(R.id.bja);
        this.f17100r = viewGroup.findViewById(R.id.a77);
        this.f17101s = viewGroup.findViewById(R.id.by_);
        this.f17102t = viewGroup.findViewById(R.id.o6);
        this.f17098p = (Button) viewGroup.findViewById(R.id.a78);
        if (m18248b()) {
            C9738o.m28702a((View) this.f17098p, -3, (int) C9738o.m28708b(C3358ac.m12528e(), 34.0f), -3, -3);
            C9738o.m28701a(this.f17100r, -3, (int) C9738o.m28708b(C3358ac.m12528e(), 86.0f));
            C9738o.m28701a(this.f17101s, -3, (int) C9738o.m28708b(C3358ac.m12528e(), 197.0f));
        }
    }

    /* renamed from: a */
    private void m18246a(View view, View view2) {
        boolean b = m18249b(view, view2);
        if (!b || this.f17080A) {
            if (this.f17080A && !b) {
                this.f17080A = false;
                this.f17098p.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).start();
            }
            return;
        }
        this.f17080A = true;
        this.f17098p.animate().scaleX(1.2f).scaleY(1.2f).setDuration(200).start();
    }

    /* renamed from: a */
    private static void m18245a(View view, Rect rect, int[] iArr) {
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getMeasuredWidth();
        rect.bottom = rect.top + view.getMeasuredHeight();
    }

    public C5798d(Context context, C9379p pVar, boolean z, int[] iArr, C5800a aVar, ViewGroup viewGroup) {
        super(context);
        inflate(context, R.layout.ami, this);
        this.f17083a = pVar;
        this.f17093k = z;
        this.f17085c = iArr;
        this.f17094l = aVar;
        this.f17090h = C9738o.m28691a(getContext());
        this.f17091i = C9738o.m28709b(getContext());
        this.f17097o = (ImageView) findViewById(R.id.cw6);
        this.f17084b = (TextView) findViewById(R.id.cw7);
        this.f17108z = new ViewConfiguration().getScaledTouchSlop();
        m18244a(context, viewGroup);
    }
}
