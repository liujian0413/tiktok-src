package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.p263im.core.p586b.C11209d;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.framework.services.IFollowService;
import com.p280ss.android.ugc.aweme.framework.services.IFollowService.IFollowCallback;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.UserExtra;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C7007f;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31851b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7705c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.e */
public final class C30743e {

    /* renamed from: a */
    public int f80494a = 120;

    /* renamed from: b */
    public String f80495b = "";

    /* renamed from: c */
    public int f80496c = 8;

    /* renamed from: d */
    public View f80497d;

    /* renamed from: e */
    public View f80498e;

    /* renamed from: f */
    public TextView f80499f;

    /* renamed from: g */
    public IMUser f80500g;

    /* renamed from: h */
    public String f80501h;

    /* renamed from: i */
    public boolean f80502i;

    /* renamed from: j */
    public int f80503j;

    /* renamed from: k */
    private OnClickListener f80504k;

    /* renamed from: l */
    private View f80505l;

    /* renamed from: f */
    private void m100154f() {
        if (this.f80504k == null) {
            this.f80504k = new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (view.equals(C30743e.this.f80499f)) {
                        C30743e.this.mo80522b();
                        return;
                    }
                    if (view.equals(C30743e.this.f80498e)) {
                        C31851b.m103384a().mo82689a(new UserExtra(C30743e.this.f80500g.getUid(), true, false));
                        C30743e.this.mo80520a(8);
                    }
                }
            };
        }
    }

    /* renamed from: a */
    public final void mo80519a() {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                C30743e.this.f80499f.setText(R.string.bjm);
                C30743e.this.mo80520a(8);
                C7705c.m23799a().mo20394d(new C7007f(C30743e.this.f80495b));
            }
        });
    }

    /* renamed from: c */
    private void m100151c() {
        this.f80494a = (int) C9738o.m28708b(this.f80505l.getContext(), 60.0f);
        m100152d();
        m100153e();
    }

    /* renamed from: e */
    private void m100153e() {
        m100154f();
        this.f80499f.setOnClickListener(this.f80504k);
        this.f80498e.setOnClickListener(this.f80504k);
        C31878ax.m103576a(this.f80499f);
    }

    /* renamed from: d */
    private void m100152d() {
        this.f80497d = this.f80505l.findViewById(R.id.ant);
        this.f80499f = (TextView) this.f80497d.findViewById(R.id.ank);
        this.f80498e = this.f80497d.findViewById(R.id.xl);
    }

    /* renamed from: b */
    public final void mo80522b() {
        if (this.f80502i) {
            if (!C31915n.m103672b()) {
                C31858ad.m103406a();
                C31858ad.m103467e(this.f80501h);
            }
            C31858ad.m103406a();
            C31858ad.m103461d(this.f80501h);
        } else {
            if (!C31915n.m103672b()) {
                C31858ad.m103406a();
                C31858ad.m103477g(this.f80495b);
            }
            C31858ad.m103406a();
            C31858ad.m103472f(this.f80495b);
        }
        ((IFollowService) ServiceManager.get().getService(IFollowService.class)).sendRequest(this.f80495b, 1, new IFollowCallback() {
            public final void onFollowSuccess() {
                C30743e.this.mo80519a();
            }

            public final void onFollowFailed(Exception exc) {
                Context context = C30743e.this.f80497d.getContext();
                String string = context.getString(R.string.bj9);
                if (!C30751f.m100159a(C30743e.this.f80497d.getContext())) {
                    string = context.getString(R.string.cjs);
                } else if (exc instanceof ApiServerException) {
                    ApiServerException apiServerException = (ApiServerException) exc;
                    if (!TextUtils.isEmpty(apiServerException.getErrorMsg())) {
                        string = apiServerException.getErrorMsg();
                    }
                }
                C9738o.m28697a(C30743e.this.f80497d.getContext(), string);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("service", "follow_failed");
                    jSONObject.put("error", exc.toString());
                    C11209d.m32829a("chat_room", "follow_failed", jSONObject);
                } catch (JSONException unused) {
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo80521a(String str) {
        this.f80495b = str;
        this.f80499f.setText(R.string.bji);
    }

    /* renamed from: a */
    public final void mo80520a(int i) {
        if (this.f80496c != i) {
            this.f80496c = i;
            if (i == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) this.f80494a});
                ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int i = (int) floatValue;
                        C30743e.this.f80503j = i;
                        C30743e.this.f80497d.getLayoutParams().height = i;
                        C30743e.this.f80497d.setAlpha(floatValue / ((float) C30743e.this.f80494a));
                        C30743e.this.f80497d.requestLayout();
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        C30743e.this.f80497d.setAlpha(0.0f);
                        C30743e.this.f80497d.setVisibility(0);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C30743e.this.f80503j = C30743e.this.f80494a;
                        C30743e.this.f80497d.setAlpha(1.0f);
                        C30743e.this.f80497d.getLayoutParams().height = C30743e.this.f80494a;
                        C30743e.this.f80497d.requestLayout();
                    }
                });
                ofFloat.start();
                return;
            }
            if (i == 8) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(float) this.f80494a, 0.0f});
                ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int i = (int) floatValue;
                        C30743e.this.f80503j = i;
                        C30743e.this.f80497d.getLayoutParams().height = i;
                        C30743e.this.f80497d.setAlpha(floatValue / ((float) C30743e.this.f80494a));
                        C30743e.this.f80497d.requestLayout();
                    }
                });
                ofFloat2.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        C30743e.this.f80497d.setAlpha(1.0f);
                        C30743e.this.f80497d.setVisibility(0);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C30743e.this.f80497d.setAlpha(0.0f);
                        C30743e.this.f80497d.getLayoutParams().height = 0;
                        C30743e.this.f80503j = 0;
                        C30743e.this.f80497d.setVisibility(8);
                    }
                });
                ofFloat2.start();
            }
        }
    }

    public C30743e(View view, IMUser iMUser) {
        this.f80505l = view;
        m100151c();
        this.f80500g = iMUser;
    }
}
