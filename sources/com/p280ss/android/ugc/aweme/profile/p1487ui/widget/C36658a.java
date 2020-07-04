package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView.C26926a;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35666d;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.a */
public final class C36658a {

    /* renamed from: a */
    public NoticeView f96268a;

    /* renamed from: b */
    public boolean f96269b;

    /* renamed from: c */
    public boolean f96270c;

    /* renamed from: d */
    private Context f96271d = this.f96268a.getContext();

    /* renamed from: e */
    private String f96272e;

    /* renamed from: f */
    private String f96273f;

    /* renamed from: g */
    private void m118298g() {
        C7285c.m22838a(this.f96271d, "perfect_user_info", 0).edit().putLong("last_guide_close_time", System.currentTimeMillis()).apply();
    }

    /* renamed from: c */
    public final void mo93007c() {
        if (this.f96269b) {
            SharePrefCache.inst().getHasEnterBindPhone().mo59871a(Boolean.valueOf(true));
        } else {
            m118298g();
        }
    }

    /* renamed from: e */
    private void m118296e() {
        if (!this.f96269b) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("show_from", this.f96273f);
            } catch (Exception unused) {
            }
            C6907h.onEvent(MobClick.obtain().setEventName("profile_tip_show").setLabelName("profile_edit_link").setJsonObject(jSONObject));
        }
    }

    /* renamed from: f */
    private void m118297f() {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f96268a, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(150);
        ofFloat.setInterpolator(decelerateInterpolator);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C36658a.this.f96268a.setVisibility(8);
                C36658a.this.f96268a.setAlpha(1.0f);
            }
        });
        ofFloat.start();
    }

    /* renamed from: h */
    private boolean m118299h() {
        if (System.currentTimeMillis() - C7285c.m22838a(this.f96271d, "perfect_user_info", 0).getLong("last_guide_close_time", 0) > TimeUnit.DAYS.toMillis(7)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo93003a() {
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f96268a, "translationY", new float[]{(float) this.f96268a.getHeight(), 0.0f});
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(accelerateInterpolator);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                C36658a.this.f96268a.setVisibility(0);
            }
        });
        ofFloat.start();
    }

    /* renamed from: b */
    public final void mo93006b() {
        if (this.f96269b) {
            String str = "";
            if (TextUtils.equals("personal_homepage", this.f96273f)) {
                str = "personal_home";
            }
            C6861a.m21335d().bindMobile((Activity) this.f96271d, str, null, null);
            C6907h.onEvent(MobClick.obtain().setEventName("tip_click").setLabelName("mobile_link"));
            SharePrefCache.inst().getHasEnterBindPhone().mo59871a(Boolean.valueOf(true));
            return;
        }
        C7195s.m22438a().mo18682a("aweme://profile_edit");
        m118298g();
    }

    /* renamed from: d */
    public final boolean mo93008d() {
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser == null || !C21115b.m71197a().isLogin()) {
            return false;
        }
        if (TextUtils.isEmpty(curUser.getBindPhone())) {
            if (!((Boolean) SharePrefCache.inst().getHasEnterBindPhone().mo59877d()).booleanValue()) {
                this.f96269b = true;
                return true;
            }
        } else if (curUser.getGender() == 0 || TextUtils.isEmpty(curUser.getBirthday())) {
            return m118299h();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo93004a(String str) {
        m118294a(str, false);
    }

    public C36658a(NoticeView noticeView) {
        this.f96268a = noticeView;
        this.f96268a.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo93005a(boolean z) {
        if (this.f96268a != null && this.f96270c) {
            this.f96270c = false;
            if (z) {
                m118297f();
            } else {
                this.f96268a.setVisibility(8);
            }
            if (!this.f96269b) {
                m118298g();
            }
            this.f96268a.setOnClickListener(null);
        }
    }

    /* renamed from: a */
    private void m118294a(String str, boolean z) {
        m118295a(str, false, 0);
    }

    /* renamed from: a */
    private void m118295a(final String str, final boolean z, long j) {
        if (!C30538p.m99745a()) {
            this.f96273f = str;
            if (!this.f96270c) {
                if (mo93008d()) {
                    this.f96270c = true;
                    if (this.f96269b) {
                        this.f96268a.setTitleText((int) R.string.sw);
                    } else {
                        m118296e();
                        if (TextUtils.isEmpty(this.f96272e)) {
                            this.f96268a.setTitleText((int) R.string.csx);
                        } else {
                            this.f96268a.setTitleText(this.f96272e);
                        }
                    }
                    if (z) {
                        this.f96268a.postDelayed(new Runnable() {
                            public final void run() {
                                C36658a.this.mo93003a();
                            }
                        }, 0);
                    } else {
                        this.f96268a.setVisibility(0);
                    }
                    this.f96268a.setOnInternalClickListener(new C26926a() {
                        /* renamed from: b */
                        public final void mo69647b() {
                            C36658a.this.mo93007c();
                            C36658a.this.mo93005a(z);
                            C42961az.m136380a(new C35666d(0));
                        }

                        /* renamed from: a */
                        public final void mo69646a() {
                            if (!C36658a.this.f96269b) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("click_from", str);
                                } catch (JSONException unused) {
                                }
                                C6907h.onEvent(MobClick.obtain().setEventName("profile_tip_click").setLabelName("profile_edit_link").setJsonObject(jSONObject));
                            }
                            C36658a.this.mo93006b();
                            C36658a.this.mo93005a(z);
                            C42961az.m136380a(new C35666d(0));
                        }
                    });
                    return;
                }
                this.f96268a.setVisibility(8);
            }
        }
    }
}
