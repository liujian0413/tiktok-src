package com.p280ss.android.ugc.aweme.shortvideo.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.a */
public final class C41647a extends AlertDialog implements OnKeyListener {

    /* renamed from: a */
    public boolean f108226a = true;

    /* renamed from: b */
    public C41651a f108227b;

    /* renamed from: c */
    public TextView f108228c;

    /* renamed from: d */
    public View f108229d;

    /* renamed from: e */
    private boolean f108230e;

    /* renamed from: f */
    private CharSequence f108231f;

    /* renamed from: g */
    private boolean f108232g;

    /* renamed from: h */
    private int f108233h;

    /* renamed from: i */
    private Drawable f108234i;

    /* renamed from: j */
    private String f108235j;

    /* renamed from: k */
    private long f108236k;

    /* renamed from: l */
    private int f108237l = 100;

    /* renamed from: m */
    private CircularProgressView f108238m;

    /* renamed from: n */
    private TextView f108239n;

    /* renamed from: o */
    private ImageView f108240o;

    /* renamed from: p */
    private TextView f108241p;

    /* renamed from: q */
    private C38267a f108242q;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.a$a */
    public interface C41651a {
        /* renamed from: a */
        void mo102300a();
    }

    /* renamed from: c */
    private void m132575c() {
        if (this.f108230e) {
            if (this.f108226a) {
                this.f108241p.setVisibility(0);
                return;
            }
            this.f108241p.setVisibility(4);
        }
    }

    public final void dismiss() {
        C41652b bVar = new C41652b(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            bVar.run();
        } else {
            C6726a.m20844b(bVar);
        }
        this.f108242q.mo95894a(false);
    }

    /* renamed from: b */
    private void m132574b() {
        this.f108229d = findViewById(R.id.cwi);
        this.f108228c = (TextView) findViewById(R.id.by6);
        this.f108238m = (CircularProgressView) findViewById(R.id.b_w);
        this.f108239n = (TextView) findViewById(R.id.djk);
        this.f108240o = (ImageView) findViewById(R.id.sq);
        this.f108241p = (TextView) findViewById(R.id.cky);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo102286a() {
        if (this.f108238m == null) {
            this.f108238m = (CircularProgressView) findViewById(R.id.b_w);
        }
        this.f108238m.mo61115b();
        super.dismiss();
    }

    /* renamed from: c */
    private void m132576c(int i) {
        if (this.f108230e) {
            this.f108238m.setMaxProgress((float) i);
        }
        this.f108237l = i;
    }

    /* renamed from: a */
    private void m132572a(String str) {
        if (this.f108230e && this.f108239n != null && !C6319n.m19593a(str)) {
            this.f108239n.setText(str);
            C9738o.m28712b((View) this.f108239n, 0);
        }
        this.f108235j = str;
    }

    public final void setMessage(CharSequence charSequence) {
        int i;
        if (this.f108230e) {
            this.f108228c.setText(charSequence);
            TextView textView = this.f108228c;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.f108231f = charSequence;
    }

    /* renamed from: a */
    private void m132570a(Drawable drawable) {
        if (this.f108230e) {
            this.f108229d.setBackground(new LayerDrawable(new Drawable[]{drawable, C0683b.m2903a(getContext(), (int) R.drawable.hk)}));
        }
        this.f108234i = drawable;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.a58);
        m132574b();
        this.f108230e = true;
        this.f108242q = C38267a.m122239a(getContext());
        this.f108242q.mo95894a(true);
        setMessage(this.f108231f);
        m132573a(this.f108232g);
        m132576c(this.f108237l);
        mo102287a(this.f108233h);
        m132572a(this.f108235j);
        m132575c();
        if (this.f108234i != null) {
            m132570a(this.f108234i);
        }
        setOnKeyListener(this);
        this.f108236k = System.currentTimeMillis();
    }

    /* renamed from: a */
    private void m132573a(boolean z) {
        int i;
        if (this.f108230e) {
            this.f108238m.setIndeterminate(z);
            TextView textView = this.f108241p;
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.f108232g = z;
    }

    /* renamed from: b */
    public final void mo102289b(int i) {
        ValueAnimator valueAnimator;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        if (this.f108230e) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f108229d = findViewById(R.id.cwi);
            ObjectAnimator objectAnimator3 = null;
            if (this.f108229d != null) {
                valueAnimator = ValueAnimator.ofInt(new int[]{this.f108229d.getWidth(), i});
                valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C41647a.this.f108229d.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        C41647a.this.f108229d.requestLayout();
                    }
                });
                valueAnimator.setInterpolator(new LinearInterpolator());
                valueAnimator.setDuration(200);
                valueAnimator.setTarget(this.f108229d);
            } else {
                valueAnimator = null;
            }
            this.f108240o = (ImageView) findViewById(R.id.sq);
            if (this.f108240o != null) {
                objectAnimator = ObjectAnimator.ofFloat(this.f108240o, "alpha", new float[]{0.0f, 1.0f});
                objectAnimator.setDuration(200);
            } else {
                objectAnimator = null;
            }
            this.f108228c = (TextView) findViewById(R.id.by6);
            if (this.f108228c != null) {
                objectAnimator3 = ObjectAnimator.ofFloat(this.f108228c, "alpha", new float[]{1.0f, 0.0f});
                objectAnimator3.setDuration(100);
                objectAnimator3.addListener(new AnimatorListener() {
                    public final void onAnimationCancel(Animator animator) {
                    }

                    public final void onAnimationRepeat(Animator animator) {
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationEnd(Animator animator) {
                        C41647a.this.f108228c.setText(R.string.aw0);
                    }
                });
                objectAnimator2 = ObjectAnimator.ofFloat(this.f108228c, "alpha", new float[]{0.0f, 1.0f});
                objectAnimator2.setDuration(100);
            } else {
                objectAnimator2 = null;
            }
            animatorSet.play(valueAnimator).with(objectAnimator);
            animatorSet.play(objectAnimator).before(objectAnimator3);
            animatorSet.play(objectAnimator3).before(objectAnimator2);
            animatorSet.start();
        }
    }

    /* renamed from: a */
    public final void mo102287a(int i) {
        if (this.f108230e) {
            TextView textView = this.f108241p;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("%");
            textView.setText(sb.toString());
            this.f108238m.setProgress((float) i);
        }
        this.f108233h = i;
    }

    private C41647a(Context context, int i) {
        super(context, 3);
    }

    /* renamed from: a */
    public static C41647a m132569a(Context context, String str, String str2) {
        C41647a aVar = new C41647a(context, 3);
        aVar.setCancelable(false);
        aVar.m132573a(false);
        aVar.m132576c(100);
        aVar.setMessage(str);
        aVar.m132572a(str2);
        aVar.m132575c();
        if ((context instanceof Activity) && ((!(context instanceof AbsActivity) || ((AbsActivity) context).isActive()) && !((Activity) context).isFinishing())) {
            aVar.show();
        }
        return aVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time", (currentTimeMillis - this.f108236k) / 1000);
            } catch (JSONException unused) {
            }
            C6893q.m21447a("ug_save_video_click_back", jSONObject);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo102288a(boolean z, float f, Context context) {
        if (this.f108230e) {
            final ImageView imageView = (ImageView) findViewById(R.id.sq);
            if (imageView != null) {
                imageView.setAlpha(f);
                imageView.setVisibility(0);
                View findViewById = findViewById(R.id.a5o);
                if (findViewById != null) {
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.gravity = 1;
                    layoutParams.setMargins(0, 0, 0, (int) C9738o.m28708b(context, 10.0f));
                    findViewById.setLayoutParams(layoutParams);
                }
                imageView.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        imageView.setAlpha(0.5f);
                        if (C41647a.this.f108227b != null) {
                            C41647a.this.f108227b.mo102300a();
                        }
                    }
                });
            }
        }
    }
}
