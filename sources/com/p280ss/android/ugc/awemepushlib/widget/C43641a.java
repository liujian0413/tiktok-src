package com.p280ss.android.ugc.awemepushlib.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p022v4.app.C0581aa;
import android.support.p022v4.view.C0978j;
import android.support.p022v4.widget.C1060q;
import android.support.p022v4.widget.C1060q.C1063a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.awemepushlib.interaction.C43603d;
import com.p280ss.android.ugc.awemepushlib.manager.C43633a;
import com.p280ss.android.ugc.awemepushlib.model.PushMsg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.widget.a */
public final class C43641a extends RelativeLayout implements OnClickListener {

    /* renamed from: a */
    final C1060q f112937a;

    /* renamed from: b */
    final ViewConfiguration f112938b;

    /* renamed from: c */
    View f112939c;

    /* renamed from: d */
    final Handler f112940d;

    /* renamed from: e */
    final int f112941e;

    /* renamed from: f */
    final int f112942f;

    /* renamed from: g */
    final long f112943g;

    /* renamed from: h */
    final boolean f112944h;

    /* renamed from: i */
    final ImageView f112945i;

    /* renamed from: j */
    final boolean f112946j;

    /* renamed from: k */
    int f112947k;

    /* renamed from: l */
    JSONObject f112948l;

    /* renamed from: m */
    final Runnable f112949m;

    /* renamed from: n */
    final Runnable f112950n;

    /* renamed from: o */
    C43647a f112951o;

    /* renamed from: p */
    private boolean f112952p;

    /* renamed from: q */
    private final Intent f112953q;

    /* renamed from: r */
    private final PushMsg f112954r;

    /* renamed from: s */
    private float f112955s;

    /* renamed from: t */
    private float f112956t;

    /* renamed from: u */
    private C43648b f112957u;

    /* renamed from: com.ss.android.ugc.awemepushlib.widget.a$a */
    public interface C43647a {
        /* renamed from: a */
        void mo105579a();
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.widget.a$b */
    final class C43648b implements Runnable {
        public final void run() {
            if (!C43641a.this.f112944h || !C43641a.this.f112946j) {
                C43641a.this.performClick();
            } else {
                LayoutParams layoutParams = C43641a.this.getLayoutParams();
                if (layoutParams instanceof WindowManager.LayoutParams) {
                    try {
                        ((WindowManager.LayoutParams) layoutParams).flags = PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                        ((WindowManager) C43641a.this.getContext().getSystemService("window")).updateViewLayout(C43641a.this, layoutParams);
                        C43641a.this.f112940d.post(new Runnable() {
                            public final void run() {
                                C43641a.this.performClick();
                            }
                        });
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        private C43648b() {
        }
    }

    public final void computeScroll() {
        if (this.f112937a.mo4158a(true)) {
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        try {
            this.f112937a.mo4160b();
        } catch (Throwable unused) {
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f112952p) {
            this.f112940d.post(new Runnable() {
                public final void run() {
                    C43641a.this.f112939c.setTranslationY((float) (-C43641a.this.f112939c.getHeight()));
                    C43641a.this.f112939c.animate().translationY(0.0f).setInterpolator(new OvershootInterpolator()).setDuration(300).start();
                    C43641a.this.f112940d.postDelayed(C43641a.this.f112949m, C43641a.this.f112943g);
                    C43603d.m138176a(C43641a.this.getContext(), "news_notify_anim_push_show", (long) C43641a.this.f112941e, (long) C43641a.this.f112942f, C43641a.this.f112948l);
                }
            });
            this.f112952p = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo105583a() {
        this.f112939c.animate().translationY((float) (-this.f112939c.getHeight())).setDuration(300).start();
        this.f112940d.postDelayed(this.f112950n, 300);
    }

    public final void setDismissListener(C43647a aVar) {
        this.f112951o = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f112937a.mo4156a(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo105584a(int i) {
        C0581aa.m2444a(getContext()).mo2560a("app_notify_ame", i);
    }

    /* renamed from: b */
    private static String m138289b(int i) {
        if (i > 9) {
            return String.valueOf(i);
        }
        StringBuilder sb = new StringBuilder("0");
        sb.append(i);
        return sb.toString();
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        getContext().startActivity(this.f112953q);
        mo105584a(this.f112941e);
        this.f112940d.removeCallbacks(this.f112949m);
        mo105583a();
        C43603d.m138176a(getContext(), "news_notify_anim_push_click", (long) this.f112941e, (long) this.f112942f, this.f112948l);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f112940d.removeCallbacks(this.f112949m);
        this.f112937a.mo4161b(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (C0978j.m4129a(motionEvent)) {
            case 0:
                this.f112955s = x;
                this.f112956t = y;
                this.f112957u = new C43648b();
                break;
            case 1:
                if (Math.abs(x - this.f112955s) >= ((float) this.f112938b.getScaledTouchSlop()) || Math.abs(y - this.f112956t) >= ((float) this.f112938b.getScaledTouchSlop())) {
                    this.f112957u = null;
                } else if (this.f112957u != null) {
                    this.f112957u.run();
                }
                this.f112957u = null;
                break;
            case 2:
                if (Math.abs(x - this.f112955s) >= ((float) this.f112938b.getScaledTouchSlop()) || Math.abs(y - this.f112956t) >= ((float) this.f112938b.getScaledTouchSlop())) {
                    this.f112957u = null;
                    break;
                }
            case 3:
                this.f112957u = null;
                break;
        }
        return true;
    }

    public C43641a(Context context, int i, PushMsg pushMsg, Bitmap bitmap, Intent intent, long j, int i2) {
        this(context, i, pushMsg, bitmap, intent, j, true, i2);
    }

    public C43641a(Context context, int i, PushMsg pushMsg, Bitmap bitmap, Intent intent, long j, boolean z, int i2) {
        int i3;
        super(context);
        this.f112952p = true;
        this.f112940d = new C6309f(Looper.getMainLooper(), new C6310a() {
            public final void handleMsg(Message message) {
            }
        });
        this.f112949m = new Runnable() {
            public final void run() {
                C43641a.this.mo105583a();
            }
        };
        this.f112950n = new Runnable() {
            /* JADX WARNING: Can't wrap try/catch for region: R(7:(3:0|1|(1:3))|4|(2:7|8)|9|10|(1:12)|13) */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
                return;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[Catch:{ Throwable -> 0x0039 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r2 = this;
                    com.ss.android.ugc.awemepushlib.widget.a r0 = com.p280ss.android.ugc.awemepushlib.widget.C43641a.this     // Catch:{ Throwable -> 0x000e }
                    android.widget.ImageView r0 = r0.f112945i     // Catch:{ Throwable -> 0x000e }
                    if (r0 == 0) goto L_0x000e
                    com.ss.android.ugc.awemepushlib.widget.a r0 = com.p280ss.android.ugc.awemepushlib.widget.C43641a.this     // Catch:{ Throwable -> 0x000e }
                    android.widget.ImageView r0 = r0.f112945i     // Catch:{ Throwable -> 0x000e }
                    r1 = 0
                    r0.setImageDrawable(r1)     // Catch:{ Throwable -> 0x000e }
                L_0x000e:
                    com.ss.android.ugc.awemepushlib.widget.a r0 = com.p280ss.android.ugc.awemepushlib.widget.C43641a.this
                    boolean r0 = r0.f112946j
                    if (r0 == 0) goto L_0x002b
                    com.ss.android.ugc.awemepushlib.widget.a r0 = com.p280ss.android.ugc.awemepushlib.widget.C43641a.this     // Catch:{ Throwable -> 0x002b }
                    android.content.Context r0 = r0.getContext()     // Catch:{ Throwable -> 0x002b }
                    android.content.Context r0 = r0.getApplicationContext()     // Catch:{ Throwable -> 0x002b }
                    java.lang.String r1 = "window"
                    java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Throwable -> 0x002b }
                    android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ Throwable -> 0x002b }
                    com.ss.android.ugc.awemepushlib.widget.a r1 = com.p280ss.android.ugc.awemepushlib.widget.C43641a.this     // Catch:{ Throwable -> 0x002b }
                    r0.removeView(r1)     // Catch:{ Throwable -> 0x002b }
                L_0x002b:
                    com.ss.android.ugc.awemepushlib.widget.a r0 = com.p280ss.android.ugc.awemepushlib.widget.C43641a.this     // Catch:{ Throwable -> 0x0039 }
                    com.ss.android.ugc.awemepushlib.widget.a$a r0 = r0.f112951o     // Catch:{ Throwable -> 0x0039 }
                    if (r0 == 0) goto L_0x0038
                    com.ss.android.ugc.awemepushlib.widget.a r0 = com.p280ss.android.ugc.awemepushlib.widget.C43641a.this     // Catch:{ Throwable -> 0x0039 }
                    com.ss.android.ugc.awemepushlib.widget.a$a r0 = r0.f112951o     // Catch:{ Throwable -> 0x0039 }
                    r0.mo105579a()     // Catch:{ Throwable -> 0x0039 }
                L_0x0038:
                    return
                L_0x0039:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.awemepushlib.widget.C43641a.C436465.run():void");
            }
        };
        this.f112953q = intent;
        this.f112942f = i;
        this.f112954r = pushMsg;
        this.f112947k = i2;
        this.f112941e = pushMsg.f112935id;
        if (j <= 0) {
            j = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
        }
        this.f112943g = j;
        this.f112944h = "oppo".equalsIgnoreCase(Build.BRAND);
        this.f112946j = z;
        try {
            this.f112948l = new JSONObject();
            this.f112948l.put("isWindowMode", z ? 1 : 0);
            this.f112948l.put("with_pic", intent.getBooleanExtra("message_with_pic", false) ? 1 : 0);
            this.f112948l.put("download_pic", intent.getBooleanExtra("message_download_pic", false) ? 1 : 0);
        } catch (Throwable unused) {
        }
        String str = pushMsg.title;
        if (TextUtils.isEmpty(str)) {
            str = context.getString(R.string.jf);
        }
        if (this.f112944h && !C43633a.m138259c().mo105552a()) {
            this.f112939c = LayoutInflater.from(context).inflate(R.layout.ag8, this, false);
            ((TextView) this.f112939c.findViewById(R.id.time)).setText(new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date()));
            ((TextView) this.f112939c.findViewById(R.id.title)).setText(str);
            ((TextView) this.f112939c.findViewById(R.id.a7e)).setText(pushMsg.text);
        } else if ((this.f112947k == 11 || this.f112947k == 21) && bitmap != null && !pushMsg.functionalPush) {
            Calendar instance = Calendar.getInstance();
            LayoutInflater from = LayoutInflater.from(context);
            if (this.f112947k == 11) {
                i3 = R.layout.ahc;
            } else {
                i3 = R.layout.ahe;
            }
            this.f112939c = from.inflate(i3, this, false);
            if (this.f112947k == 21) {
                ((TextView) this.f112939c.findViewById(R.id.title)).setText(str);
            }
            TextView textView = (TextView) this.f112939c.findViewById(R.id.time);
            StringBuilder sb = new StringBuilder();
            sb.append(m138289b(instance.get(11)));
            sb.append(":");
            sb.append(m138289b(instance.get(12)));
            textView.setText(sb.toString());
            ((TextView) this.f112939c.findViewById(R.id.e6c)).setText(pushMsg.text);
            ((TextView) this.f112939c.findViewById(R.id.title)).setText(str);
        } else {
            this.f112939c = LayoutInflater.from(context).inflate(R.layout.f124317afu, this, false);
            ((TextView) this.f112939c.findViewById(R.id.title)).setText(str);
            ((TextView) this.f112939c.findViewById(R.id.a7e)).setText(pushMsg.text);
        }
        addView(this.f112939c);
        this.f112945i = (ImageView) findViewById(R.id.ayn);
        if (bitmap != null) {
            this.f112945i.setImageBitmap(bitmap);
        } else {
            this.f112945i.setScaleType(ScaleType.CENTER_INSIDE);
            this.f112945i.setImageResource(R.drawable.bka);
        }
        this.f112937a = C1060q.m4591a((ViewGroup) this, (C1063a) new C1063a() {
            /* renamed from: b */
            public final int mo1368b(View view, int i, int i2) {
                return i;
            }

            /* renamed from: b */
            public final int mo1578b(View view) {
                return view.getWidth();
            }

            /* renamed from: a */
            public final boolean mo1367a(View view, int i) {
                if (view == C43641a.this.f112939c) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public final void mo1365a(View view, float f, float f2) {
                int i;
                if (Math.abs(f) > ((float) (C43641a.this.f112938b.getScaledMaximumFlingVelocity() / 5)) || ((float) Math.abs(view.getLeft())) >= ((float) C43641a.this.getWidth()) * 0.2f) {
                    C1060q qVar = C43641a.this.f112937a;
                    if (f > 0.0f) {
                        i = C43641a.this.getWidth();
                    } else {
                        i = -C43641a.this.getWidth();
                    }
                    qVar.mo4157a(view, i, 0);
                    C43641a.this.mo105584a(C43641a.this.f112941e);
                    C43641a.this.f112940d.postDelayed(C43641a.this.f112950n, 300);
                } else {
                    C43641a.this.f112937a.mo4157a(view, 0, 0);
                    C43641a.this.f112940d.postDelayed(C43641a.this.f112949m, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                }
                C43641a.this.postInvalidate();
            }

            /* renamed from: a */
            public final void mo1366a(View view, int i, int i2, int i3, int i4) {
                C43641a.this.setAlpha(1.0f - (((float) Math.abs(i)) / ((float) C43641a.this.getWidth())));
            }
        });
        this.f112938b = ViewConfiguration.get(context);
        setOnClickListener(this);
    }
}
