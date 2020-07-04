package com.p280ss.android.ugc.aweme.profile.fansshake;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.p022v4.view.C0991u;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.profile.model.UrgeStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.profile.fansshake.c */
public class C35787c extends FrameLayout implements C35793f {

    /* renamed from: a */
    public ViewGroup f93798a;

    /* renamed from: b */
    public ImageView f93799b;

    /* renamed from: c */
    public ImageView f93800c;

    /* renamed from: d */
    public boolean f93801d;

    /* renamed from: e */
    private View f93802e;

    /* renamed from: f */
    private ViewStub f93803f;

    /* renamed from: g */
    private TextView f93804g;

    /* renamed from: h */
    private AnimatorSet f93805h;

    /* renamed from: i */
    private ObjectAnimator f93806i;

    /* renamed from: j */
    private C35780a f93807j;

    /* renamed from: k */
    private List<View> f93808k;

    /* renamed from: l */
    private boolean f93809l;

    /* renamed from: m */
    private int f93810m;

    /* renamed from: n */
    private User f93811n;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42961az.m136382c(this);
    }

    /* renamed from: b */
    public final void mo90669b() {
        C9738o.m28712b((View) this.f93804g, 8);
        m115564e();
    }

    /* renamed from: e */
    private void m115564e() {
        int i;
        if (this.f93804g.getVisibility() == 0) {
            i = (int) C9738o.m28708b(getContext(), 4.0f);
        } else {
            i = 0;
        }
        LayoutParams layoutParams = (LayoutParams) this.f93799b.getLayoutParams();
        layoutParams.leftMargin = i;
        this.f93799b.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo90663a() {
        if (!this.f93801d && this.f93805h != null && this.f93802e != null && C0991u.m4170G(this.f93802e)) {
            if (this.f93806i != null && this.f93806i.isRunning()) {
                this.f93806i.end();
            }
            this.f93810m = this.f93802e.getWidth();
            this.f93805h.start();
        }
    }

    /* renamed from: c */
    public final void mo90670c() {
        if (!C6311g.m19573a(this.f93808k) && this.f93802e != null && C0991u.m4170G(this.f93802e)) {
            for (View view : this.f93808k) {
                if (view != null) {
                    view.setRotation(0.0f);
                    view.setTranslationX(0.0f);
                    view.setAlpha(1.0f);
                    C9738o.m28712b(view, 8);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f93806i != null && this.f93806i.isRunning()) {
            this.f93806i.end();
        }
        if (this.f93805h != null && this.f93805h.isRunning()) {
            this.f93805h.end();
        }
        C42961az.m136383d(this);
    }

    /* renamed from: d */
    private void m115563d() {
        if (!this.f93809l) {
            this.f93802e = this.f93803f.inflate();
            this.f93809l = true;
            this.f93798a = (ViewGroup) this.f93802e.findViewById(R.id.d4h);
            this.f93800c = (ImageView) this.f93802e.findViewById(R.id.b7r);
            this.f93799b = (ImageView) this.f93802e.findViewById(R.id.bc6);
            this.f93804g = (TextView) this.f93802e.findViewById(R.id.dt5);
            this.f93808k.add(this.f93799b);
            this.f93808k.add(this.f93798a);
            this.f93808k.add(this.f93800c);
            setOnClickListener(new C35791d(this));
        }
    }

    /* renamed from: f */
    private void m115565f() {
        if (this.f93802e != null && this.f93806i == null) {
            this.f93806i = ObjectAnimator.ofFloat(this.f93799b, "translationX", new float[]{0.0f, (float) (-((int) C9738o.m28708b(this.f93802e.getContext(), 4.0f))), 0.0f}).setDuration(700);
            this.f93806i.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    C35787c.this.f93799b.setTranslationX(0.0f);
                }
            });
            this.f93806i.setRepeatCount(-1);
        }
    }

    /* renamed from: g */
    private void m115566g() {
        if (this.f93802e != null && this.f93805h == null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f93798a, "alpha", new float[]{1.0f, 0.0f}).setDuration(800);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f93799b, "rotation", new float[]{0.0f, -90.0f}).setDuration(800);
            ValueAnimator duration3 = ValueAnimator.ofInt(new int[]{100, 0}).setDuration(800);
            duration3.addUpdateListener(new C35792e(this));
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.f93800c, "alpha", new float[]{0.0f, 1.0f}).setDuration(600);
            ObjectAnimator duration5 = ObjectAnimator.ofFloat(this.f93800c, "rotation", new float[]{-45.0f, 0.0f}).setDuration(600);
            duration5.setStartDelay(200);
            duration4.setStartDelay(200);
            duration4.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    C35787c.this.f93800c.setVisibility(0);
                }
            });
            this.f93805h = new AnimatorSet();
            this.f93805h.playTogether(new Animator[]{duration3, duration, duration2, duration4, duration5});
            this.f93805h.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    C35787c.this.f93801d = true;
                    C35787c.this.f93798a.setVisibility(0);
                }

                public final void onAnimationEnd(Animator animator) {
                    C35787c.this.f93801d = false;
                    C35787c.this.f93798a.setVisibility(8);
                    C35787c.this.f93798a.getLayoutParams().width = -2;
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo90665a(View view) {
        this.f93807j.mo90654a();
    }

    /* renamed from: a */
    public final void mo90666a(User user) {
        m115560a(user, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo90664a(ValueAnimator valueAnimator) {
        this.f93798a.getLayoutParams().width = (((Integer) valueAnimator.getAnimatedValue()).intValue() * this.f93810m) / 100;
        this.f93798a.requestLayout();
    }

    /* renamed from: b */
    private static boolean m115561b(User user) {
        if (TextUtils.equals(user.getUid(), C6861a.m21337f().getCurUserId())) {
            return false;
        }
        int followStatus = user.getFollowStatus();
        if (followStatus == 1 || followStatus == 2) {
            return false;
        }
        return true;
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onProfileFollowEvent(C23661d dVar) {
        Object obj = dVar.f62380b;
        if (obj != null && (obj instanceof User) && this.f93811n != null && TextUtils.equals(((User) obj).getUid(), this.f93811n.getUid())) {
            this.f93811n.setFollowStatus(dVar.f62379a);
            mo90666a(this.f93811n);
        }
    }

    /* renamed from: c */
    private void m115562c(User user) {
        if (user != null && user.getUrgeDetail() != null) {
            String curUserId = C6861a.m21337f().getCurUserId();
            UrgeStruct urgeDetail = user.getUrgeDetail();
            C9738o.m28712b((View) this.f93798a, 0);
            C9738o.m28712b((View) this.f93799b, 0);
            if (TextUtils.equals(curUserId, user.getUid())) {
                if (urgeDetail.shouldHostShowTip()) {
                    this.f93804g.setText(getResources().getString(R.string.b42, new Object[]{C30537o.m99738a(urgeDetail.getUrgeUnreadCount())}));
                    this.f93804g.setVisibility(0);
                } else {
                    this.f93804g.setVisibility(8);
                }
            } else if (urgeDetail.getUserUrged() == 0) {
                this.f93804g.setText(getResources().getString(R.string.b45));
                this.f93804g.setVisibility(0);
            } else {
                this.f93798a.setVisibility(8);
                this.f93800c.setVisibility(0);
                this.f93804g.setVisibility(8);
            }
            m115564e();
        }
    }

    /* renamed from: a */
    public final void mo90667a(boolean z) {
        if (this.f93806i != null && this.f93802e != null && C0991u.m4170G(this.f93802e)) {
            if (z) {
                if (!this.f93806i.isRunning()) {
                    this.f93806i.start();
                }
            } else if (this.f93806i.isRunning()) {
                this.f93806i.end();
            }
        }
    }

    /* renamed from: a */
    private void m115560a(User user, int i) {
        if (!C6399b.m19944t()) {
            int i2 = 8;
            if (user == null || user.getUrgeDetail() == null) {
                mo90670c();
                setVisibility(8);
                return;
            }
            this.f93811n = user;
            if (m115561b(user)) {
                mo90670c();
                setVisibility(8);
                return;
            }
            m115563d();
            m115565f();
            m115566g();
            mo90670c();
            m115562c(user);
            this.f93807j.mo90656a(user, i);
            if (!TimeLockRuler.isTeenModeON()) {
                i2 = 0;
            }
            setVisibility(i2);
        }
    }

    /* renamed from: a */
    public final void mo90668a(boolean z, User user) {
        if (z) {
            if (!(this.f93802e == null || user == null)) {
                m115560a(user, 1);
            }
        } else if (this.f93802e != null) {
            if (this.f93806i != null && this.f93806i.isRunning()) {
                this.f93806i.end();
            }
            if (this.f93805h != null && this.f93805h.isRunning()) {
                this.f93805h.end();
            }
        }
    }
}
