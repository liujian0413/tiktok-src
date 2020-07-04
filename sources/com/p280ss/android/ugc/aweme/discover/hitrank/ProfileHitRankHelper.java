package com.p280ss.android.ugc.aweme.discover.hitrank;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.RoundShadowLayout;
import com.p280ss.android.ugc.aweme.message.model.SimpleUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BaseProfileFragment;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.ProfileHitRankHelper */
public final class ProfileHitRankHelper implements C0042h, C0053p<C26680e> {

    /* renamed from: h */
    public static final float f70317h = ((float) C23486n.m77122a(16.0d));

    /* renamed from: i */
    public static final C26670a f70318i = new C26670a(null);

    /* renamed from: a */
    public long f70319a;

    /* renamed from: b */
    public RankViewModel f70320b;

    /* renamed from: c */
    public View f70321c;

    /* renamed from: d */
    public FrameLayout f70322d;

    /* renamed from: e */
    public C0043i f70323e;

    /* renamed from: f */
    public TextView f70324f;

    /* renamed from: g */
    public RoundShadowLayout f70325g;

    /* renamed from: j */
    private boolean f70326j;

    /* renamed from: k */
    private FragmentActivity f70327k;

    /* renamed from: l */
    private User f70328l;

    /* renamed from: com.ss.android.ugc.aweme.discover.hitrank.ProfileHitRankHelper$a */
    public static final class C26670a {
        private C26670a() {
        }

        /* renamed from: a */
        public static float m87632a() {
            return ProfileHitRankHelper.f70317h;
        }

        public /* synthetic */ C26670a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.hitrank.ProfileHitRankHelper$b */
    final class C26671b implements OnTouchListener {

        /* renamed from: a */
        public float f70329a;

        /* renamed from: b */
        public float f70330b;

        /* renamed from: c */
        public boolean f70331c;

        /* renamed from: d */
        public float f70332d = -1.0f;

        /* renamed from: e */
        public float f70333e;

        /* renamed from: f */
        public float f70334f;

        /* renamed from: g */
        public final int f70335g = C23486n.m77122a(2.0d);

        public C26671b() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C7573i.m23587b(view, "view");
            C7573i.m23587b(motionEvent, "event");
            if (motionEvent.getAction() == 0) {
                this.f70329a = motionEvent.getRawX();
                this.f70330b = motionEvent.getRawY();
                this.f70333e = motionEvent.getRawX();
                this.f70334f = motionEvent.getRawY();
                this.f70331c = false;
                if (this.f70332d != -1.0f) {
                    return false;
                }
                this.f70332d = view.getX();
                return false;
            } else if (motionEvent.getAction() == 1) {
                boolean z = this.f70331c;
                if (z) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "x", new float[]{this.f70332d});
                    float abs = (Math.abs(view.getX() - this.f70332d) / C26670a.m87632a()) * 200.0f;
                    C7573i.m23582a((Object) ofFloat, "animator");
                    ofFloat.setDuration((long) abs);
                    ofFloat.start();
                }
                return z;
            } else if (motionEvent.getAction() != 2) {
                return false;
            } else {
                if (Math.abs(motionEvent.getRawX() - this.f70333e) > ((float) this.f70335g) || Math.abs(motionEvent.getRawY() - this.f70334f) > ((float) this.f70335g)) {
                    this.f70331c = true;
                }
                float rawY = motionEvent.getRawY() - this.f70330b;
                float rawX = (motionEvent.getRawX() - this.f70329a) * (1.0f - (Math.abs(view.getX() - this.f70332d) / C26670a.m87632a()));
                if (view.getX() + rawX > this.f70332d) {
                    rawX = this.f70332d - view.getX();
                } else if (view.getX() + rawX < this.f70332d - C26670a.m87632a()) {
                    rawX = (this.f70332d - C26670a.m87632a()) - view.getX();
                }
                if (view.getY() + rawY < 0.0f) {
                    rawY = -view.getY();
                } else if (view.getY() + rawY + ((float) view.getHeight()) > ((float) ProfileHitRankHelper.m87620a(ProfileHitRankHelper.this).getHeight())) {
                    rawY = (((float) ProfileHitRankHelper.m87620a(ProfileHitRankHelper.this).getHeight()) - view.getY()) - ((float) view.getHeight());
                }
                view.setTranslationX(view.getTranslationX() + ((float) ((int) rawX)));
                view.setTranslationY(view.getTranslationY() + ((float) ((int) rawY)));
                this.f70330b = motionEvent.getRawY();
                this.f70329a = motionEvent.getRawX();
                return true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.hitrank.ProfileHitRankHelper$c */
    public static final class C26672c implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ ProfileHitRankHelper f70337a;

        /* renamed from: b */
        final /* synthetic */ BaseProfileFragment f70338b;

        /* renamed from: c */
        final /* synthetic */ FrameLayout f70339c;

        public final void onGlobalLayout() {
            View view = this.f70338b.getView();
            if (view != null) {
                View findViewById = view.findViewById(R.id.a9o);
                if (findViewById != null) {
                    ProfileHitRankHelper.m87623c(this.f70337a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int i = C23487o.m77157d(findViewById).top - C23487o.m77157d(this.f70339c).top;
                    LayoutParams layoutParams = ProfileHitRankHelper.m87623c(this.f70337a).getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = (int) (((float) (i + C23486n.m77122a(16.0d))) - (ProfileHitRankHelper.m87627e(this.f70337a).getShadowRadius() + Math.abs(ProfileHitRankHelper.m87627e(this.f70337a).getShadowDy())));
                        ProfileHitRankHelper.m87623c(this.f70337a).setLayoutParams(marginLayoutParams);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }

        C26672c(ProfileHitRankHelper profileHitRankHelper, BaseProfileFragment baseProfileFragment, FrameLayout frameLayout) {
            this.f70337a = profileHitRankHelper;
            this.f70338b = baseProfileFragment;
            this.f70339c = frameLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.hitrank.ProfileHitRankHelper$d */
    static final class C26673d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ User f70340a;

        C26673d(User user) {
            this.f70340a = user;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            String str3 = "hit_board_click";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "others_homepage");
            String str4 = "to_user_id";
            User user = this.f70340a;
            String str5 = null;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            C6907h.m21524a(str3, (Map) a.mo59973a(str4, str).f60753a);
            C7195s a2 = C7195s.m22438a();
            String str6 = "others_homepage";
            User user2 = this.f70340a;
            if (user2 != null) {
                str2 = user2.getUid();
            } else {
                str2 = null;
            }
            User user3 = this.f70340a;
            if (user3 != null) {
                str5 = user3.getSecUid();
            }
            a2.mo18682a(C26678c.m87644a(str6, str2, str5));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.hitrank.ProfileHitRankHelper$e */
    public static final class C26674e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ProfileHitRankHelper f70341a;

        /* renamed from: b */
        final /* synthetic */ float f70342b;

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Lifecycle lifecycle = ProfileHitRankHelper.m87622b(this.f70341a).getLifecycle();
            C7573i.m23582a((Object) lifecycle, "owner.lifecycle");
            if (lifecycle.mo54a().isAtLeast(State.RESUMED)) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(ProfileHitRankHelper.m87623c(this.f70341a), "translationX", new float[]{this.f70342b, 0.0f}).setDuration(300);
                C7573i.m23582a((Object) duration, "show");
                duration.setStartDelay(200);
                duration.start();
                ProfileHitRankHelper.m87625d(this.f70341a).setText(R.string.bdc);
            }
        }

        C26674e(ProfileHitRankHelper profileHitRankHelper, float f) {
            this.f70341a = profileHitRankHelper;
            this.f70342b = f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.hitrank.ProfileHitRankHelper$f */
    static final class C26675f<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ ProfileHitRankHelper f70343a;

        /* renamed from: b */
        final /* synthetic */ User f70344b;

        C26675f(ProfileHitRankHelper profileHitRankHelper, User user) {
            this.f70343a = profileHitRankHelper;
            this.f70344b = user;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            RankViewModel f = ProfileHitRankHelper.m87628f(this.f70343a);
            User user = this.f70344b;
            if (user == null) {
                C7573i.m23580a();
            }
            f.mo68409a(user.getUid(), this.f70344b.getSecUid());
            return null;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FrameLayout m87620a(ProfileHitRankHelper profileHitRankHelper) {
        FrameLayout frameLayout = profileHitRankHelper.f70322d;
        if (frameLayout == null) {
            C7573i.m23583a("parent");
        }
        return frameLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ C0043i m87622b(ProfileHitRankHelper profileHitRankHelper) {
        C0043i iVar = profileHitRankHelper.f70323e;
        if (iVar == null) {
            C7573i.m23583a("owner");
        }
        return iVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m87623c(ProfileHitRankHelper profileHitRankHelper) {
        View view = profileHitRankHelper.f70321c;
        if (view == null) {
            C7573i.m23583a("view");
        }
        return view;
    }

    /* renamed from: d */
    public static final /* synthetic */ TextView m87625d(ProfileHitRankHelper profileHitRankHelper) {
        TextView textView = profileHitRankHelper.f70324f;
        if (textView == null) {
            C7573i.m23583a("textView");
        }
        return textView;
    }

    /* renamed from: e */
    public static final /* synthetic */ RoundShadowLayout m87627e(ProfileHitRankHelper profileHitRankHelper) {
        RoundShadowLayout roundShadowLayout = profileHitRankHelper.f70325g;
        if (roundShadowLayout == null) {
            C7573i.m23583a("shadowLayout");
        }
        return roundShadowLayout;
    }

    /* renamed from: f */
    public static final /* synthetic */ RankViewModel m87628f(ProfileHitRankHelper profileHitRankHelper) {
        RankViewModel rankViewModel = profileHitRankHelper.f70320b;
        if (rankViewModel == null) {
            C7573i.m23583a("activityViewModel");
        }
        return rankViewModel;
    }

    /* renamed from: c */
    private final void m87624c(User user) {
        if (m87626d(user)) {
            if (System.currentTimeMillis() - this.f70319a > 1000) {
                C1592h.m7853a((Callable<TResult>) new C26675f<TResult>(this, user));
            }
            this.f70319a = System.currentTimeMillis();
        }
    }

    /* renamed from: d */
    private static boolean m87626d(User user) {
        if (!C6399b.m19944t()) {
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (!a.isLogin() || user == null || !user.isStar() || user.getStarBillboardRank() <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo68398a(User user) {
        View view = this.f70321c;
        if (view == null) {
            C7573i.m23583a("view");
        }
        view.setVisibility(8);
        if (user != null) {
            this.f70328l = user;
            View view2 = this.f70321c;
            if (view2 == null) {
                C7573i.m23583a("view");
            }
            view2.setOnClickListener(new C26673d(user));
            m87624c(user);
        }
    }

    /* renamed from: b */
    public final void mo68399b(User user) {
        CharSequence charSequence;
        String str = null;
        if (user != null) {
            charSequence = user.getUid();
        } else {
            charSequence = null;
        }
        CharSequence charSequence2 = charSequence;
        User user2 = this.f70328l;
        if (user2 != null) {
            str = user2.getUid();
        }
        if (!TextUtils.equals(charSequence2, str)) {
            View view = this.f70321c;
            if (view == null) {
                C7573i.m23583a("view");
            }
            view.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C26680e eVar) {
        if (eVar != null && eVar.f70353a != -2 && eVar.f70353a != -1) {
            SimpleUser simpleUser = (SimpleUser) C7525m.m23513g((List<? extends T>) eVar.f70354b.getUserList());
            if (simpleUser != null) {
                HitTaskInfo taskInfo = simpleUser.getTaskInfo();
                View view = this.f70321c;
                if (view == null) {
                    C7573i.m23583a("view");
                }
                view.setVisibility(0);
                if (taskInfo.getCompeletedTaskCnt() != taskInfo.getTotalTaskCnt()) {
                    this.f70326j = true;
                    TextView textView = this.f70324f;
                    if (textView == null) {
                        C7573i.m23583a("textView");
                    }
                    FragmentActivity fragmentActivity = this.f70327k;
                    if (fragmentActivity == null) {
                        C7573i.m23583a("activity");
                    }
                    String string = fragmentActivity.getString(R.string.e_p);
                    C7573i.m23582a((Object) string, "activity.getString(R.string.today_hitrank)");
                    String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{Integer.valueOf(taskInfo.getCompeletedTaskCnt()), Integer.valueOf(taskInfo.getTotalTaskCnt())}, 2));
                    C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
                    textView.setText(a);
                } else if (this.f70326j) {
                    this.f70326j = false;
                    View view2 = this.f70321c;
                    if (view2 == null) {
                        C7573i.m23583a("view");
                    }
                    float width = ((float) view2.getWidth()) * 1.0f;
                    View view3 = this.f70321c;
                    if (view3 == null) {
                        C7573i.m23583a("view");
                    }
                    ObjectAnimator duration = ObjectAnimator.ofFloat(view3, "translationX", new float[]{0.0f, width}).setDuration(300);
                    duration.addListener(new C26674e(this, width));
                    C7573i.m23582a((Object) duration, "hide");
                    duration.setStartDelay(600);
                    duration.start();
                } else {
                    TextView textView2 = this.f70324f;
                    if (textView2 == null) {
                        C7573i.m23583a("textView");
                    }
                    textView2.setText(R.string.bdc);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo68397a(FragmentActivity fragmentActivity, BaseProfileFragment baseProfileFragment, FrameLayout frameLayout) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(baseProfileFragment, "fragment");
        C7573i.m23587b(frameLayout, "parent");
        if (!C6399b.m19944t()) {
            this.f70327k = fragmentActivity;
            this.f70322d = frameLayout;
            View inflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.b1_, frameLayout, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(acti…w_hitrank, parent, false)");
            this.f70321c = inflate;
            View view = this.f70321c;
            if (view == null) {
                C7573i.m23583a("view");
            }
            View findViewById = view.findViewById(R.id.d4d);
            C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.shadow_layout)");
            this.f70325g = (RoundShadowLayout) findViewById;
            RoundShadowLayout roundShadowLayout = this.f70325g;
            if (roundShadowLayout == null) {
                C7573i.m23583a("shadowLayout");
            }
            float f = -(roundShadowLayout.getShadowRadius() + f70317h);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388613;
            layoutParams.rightMargin = (int) f;
            View view2 = this.f70321c;
            if (view2 == null) {
                C7573i.m23583a("view");
            }
            frameLayout.addView(view2, layoutParams);
            this.f70323e = baseProfileFragment;
            View view3 = this.f70321c;
            if (view3 == null) {
                C7573i.m23583a("view");
            }
            View findViewById2 = view3.findViewById(R.id.e9z);
            C7573i.m23582a((Object) findViewById2, "view.findViewById<TextVi…profile_hitrank_textview)");
            this.f70324f = (TextView) findViewById2;
            View view4 = this.f70321c;
            if (view4 == null) {
                C7573i.m23583a("view");
            }
            view4.setVisibility(8);
            View view5 = this.f70321c;
            if (view5 == null) {
                C7573i.m23583a("view");
            }
            view5.setOnTouchListener(new C26671b());
            View view6 = this.f70321c;
            if (view6 == null) {
                C7573i.m23583a("view");
            }
            view6.getViewTreeObserver().addOnGlobalLayoutListener(new C26672c(this, baseProfileFragment, frameLayout));
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(RankViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ankViewModel::class.java)");
            this.f70320b = (RankViewModel) a;
            RankViewModel rankViewModel = this.f70320b;
            if (rankViewModel == null) {
                C7573i.m23583a("activityViewModel");
            }
            C0052o a2 = rankViewModel.mo68407a();
            C0043i iVar = this.f70323e;
            if (iVar == null) {
                C7573i.m23583a("owner");
            }
            a2.observe(iVar, this);
        }
    }
}
