package com.p280ss.android.ugc.aweme.profile.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.profile.C36102u;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.C36675j;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.util.aa */
public final class C36694aa {

    /* renamed from: a */
    private static final SimpleDateFormat f96333a = new SimpleDateFormat("yyyy-MM-dd", m118340a());

    /* renamed from: com.ss.android.ugc.aweme.profile.util.aa$a */
    public interface C36697a {
        /* renamed from: a */
        void mo75509a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.aa$b */
    public interface C36698b extends C36675j {
        /* renamed from: b */
        void mo75709b();
    }

    /* renamed from: a */
    private static Locale m118340a() {
        if (C6399b.m19944t()) {
            return ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale();
        }
        return Locale.getDefault();
    }

    /* renamed from: b */
    public static String m118348b(User user) {
        String str = "";
        if (user.getGeneralPermission() == null) {
            return str;
        }
        switch (user.getGeneralPermission().getFollowToastType()) {
            case 1:
                return "ban";
            case 2:
                return "suspend";
            case 3:
                return "viewmodeA";
            case 4:
                return "viewmodeB";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static boolean m118347a(User user) {
        return TextUtils.equals(user.getUid(), C6861a.m21337f().getCurUserId());
    }

    /* renamed from: a */
    private static void m118341a(final View view, final boolean z) {
        float f;
        boolean z2 = !z;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
        view.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{z2 ? 1.0f : 0.0f, z ? 1.0f : 0.0f});
        ofFloat.setDuration(300);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!z) {
                    view.setVisibility(8);
                }
            }
        });
        ofFloat.start();
    }

    /* renamed from: b */
    static final /* synthetic */ void m118349b(String str, User user, C36698b bVar, View view) {
        C6907h.m21524a("edit_remarks", (Map) new C22984d().mo59973a("enter_from", str).mo59973a("action_type", "click").f60753a);
        C36102u.f94392a.showRemarkEditDialog(view.getContext(), user, "", 0, null, bVar);
    }

    /* renamed from: a */
    static final /* synthetic */ void m118346a(String str, User user, C36698b bVar, View view) {
        C6907h.m21524a("edit_remarks", (Map) new C22984d().mo59973a("enter_from", str).mo59973a("action_type", "click").f60753a);
        C36102u.f94392a.showRemarkEditDialog(view.getContext(), user, "", 0, null, bVar);
    }

    /* renamed from: a */
    public static void m118343a(User user, int i, TextView textView, View view, String str, boolean z) {
        m118344a(user, i, textView, view, false, str, z);
    }

    /* renamed from: a */
    public static void m118342a(User user, int i, View view, String str, boolean z, C36698b bVar) {
        if (!C6399b.m19944t() && !C43122ff.m136783n(user) && user != null && view != null) {
            if (i != 1 && i != 2) {
                if (view.getVisibility() == 0) {
                    m118341a(view, false);
                }
                if (!TextUtils.isEmpty(user.getRemarkName())) {
                    user.setRemarkName(null);
                }
                bVar.mo75709b();
            } else if (TextUtils.isEmpty(user.getRemarkName())) {
                if (!z || view.getVisibility() == 0) {
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                } else {
                    m118341a(view, true);
                }
                view.setOnClickListener(new C36699ab(str, user, bVar));
                C6907h.m21524a("edit_remarks", (Map) new C22984d().mo59973a("enter_from", str).mo59973a("action_type", "show").f60753a);
            } else {
                view.setVisibility(0);
                view.setOnClickListener(new C36700ac(str, user, bVar));
            }
        }
    }

    /* renamed from: a */
    private static void m118344a(User user, int i, TextView textView, View view, boolean z, String str, boolean z2) {
        m118345a(user, i, textView, view, false, str, z2, null);
    }

    /* renamed from: a */
    public static void m118345a(final User user, int i, final TextView textView, View view, final boolean z, String str, boolean z2, final C36697a aVar) {
        if (!C6399b.m19944t() && !C43122ff.m136783n(user) && user != null && textView != null && view != null) {
            m118342a(user, i, view, str, z2, (C36698b) new C36698b() {
                /* renamed from: b */
                public final void mo75709b() {
                    if (z) {
                        TextView textView = textView;
                        StringBuilder sb = new StringBuilder("@");
                        sb.append(user.getNickname());
                        textView.setText(sb.toString());
                        return;
                    }
                    textView.setText(user.getNickname());
                }

                /* renamed from: a */
                public final void mo71634a() {
                    if (!TextUtils.isEmpty(user.getRemarkName())) {
                        if (aVar != null) {
                            aVar.mo75509a(user.getRemarkName());
                        }
                        textView.setText(user.getRemarkName());
                    } else if (z) {
                        TextView textView = textView;
                        StringBuilder sb = new StringBuilder("@");
                        sb.append(user.getNickname());
                        textView.setText(sb.toString());
                    } else {
                        textView.setText(user.getNickname());
                    }
                }
            });
        }
    }
}
