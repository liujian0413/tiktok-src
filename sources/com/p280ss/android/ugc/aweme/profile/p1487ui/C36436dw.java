package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.translation.C42616a;
import com.p280ss.android.ugc.aweme.translation.p1680a.C42618b;
import com.p280ss.android.ugc.aweme.translation.p1680a.C42620c;
import com.p280ss.android.ugc.aweme.translation.p1680a.C42621d;
import com.p280ss.android.ugc.aweme.translation.p1681b.C42622a;
import com.p280ss.android.ugc.aweme.translation.p1682ui.C42628a;
import com.p280ss.android.ugc.aweme.translation.p1682ui.TranslationStatusView;
import com.p280ss.android.ugc.aweme.translation.p1682ui.TranslationStatusView.C42627b;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.dw */
public final class C36436dw implements C42628a {

    /* renamed from: a */
    public TranslationStatusView f95596a;

    /* renamed from: b */
    public TextView f95597b;

    /* renamed from: c */
    public User f95598c;

    /* renamed from: d */
    public C42622a f95599d = new C42622a(new C42618b(), this);

    /* renamed from: e */
    public String f95600e;

    /* renamed from: f */
    private Context f95601f;

    /* renamed from: a */
    public final void mo74052a(Exception exc) {
        C22814a.m75244a(this.f95601f, (Throwable) exc);
        this.f95596a.setStatus(0);
    }

    /* renamed from: a */
    public final void mo74048a(C42620c cVar) {
        this.f95596a.setStatus(2);
        C42621d dVar = new C42621d();
        dVar.f110778b = 2;
        dVar.f110777a = cVar.f110775a;
        dVar.f110779c = new ArrayList();
        C42616a.m135409a().mo104211a(this.f95600e, dVar);
        mo92510a(this.f95597b, dVar.f110777a);
    }

    /* renamed from: a */
    public final void mo92511a(User user) {
        final String str;
        this.f95598c = user;
        if (this.f95596a == null || !C6399b.m19944t()) {
            if (this.f95596a != null) {
                this.f95596a.setVisibility(8);
            }
            return;
        }
        this.f95596a.mo104220d();
        this.f95600e = this.f95598c.getSignature();
        C42621d a = C42616a.m135409a().mo104210a(this.f95600e);
        final String appLanguage = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage();
        if (TextUtils.isEmpty(this.f95598c.getSignatureLanguage()) || TextUtils.equals("un", this.f95598c.getSignatureLanguage())) {
            str = this.f95598c.getLanguage();
        } else {
            str = this.f95598c.getSignatureLanguage();
        }
        final String signature = this.f95598c.getSignature();
        if (a != null) {
            this.f95596a.setVisibility(0);
            this.f95596a.setStatusWithoutAnim(a.f110778b);
            if (a.f110778b == 2) {
                this.f95597b.setText(a.f110777a);
            }
        } else if (TextUtils.isEmpty(signature) || TextUtils.isEmpty(str) || appLanguage.equals(str)) {
            this.f95596a.setVisibility(8);
            return;
        } else {
            this.f95596a.setVisibility(0);
        }
        this.f95596a.setOnTranslationViewClickListener(new C42627b() {
            /* renamed from: a */
            public final void mo74055a(View view) {
                C42616a.m135409a().mo104210a(C36436dw.this.f95600e).f110778b = 0;
                C36436dw.this.mo92510a(C36436dw.this.f95597b, C36436dw.this.f95598c.getSignature());
            }

            /* renamed from: a */
            public final void mo74056a(View view, boolean z) {
                C42621d a = C42616a.m135409a().mo104210a(C36436dw.this.f95600e);
                if (a != null) {
                    C36436dw.this.f95596a.setStatus(2);
                    a.f110778b = 2;
                    C36436dw.this.mo92510a(C36436dw.this.f95597b, a.f110777a);
                    return;
                }
                C36436dw.this.f95599d.mo104216a(signature, str, appLanguage, "", 3);
            }
        });
    }

    /* renamed from: a */
    public final void mo92510a(final TextView textView, final String str) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView, "alpha", new float[]{0.0f}).setDuration(150);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, "alpha", new float[]{0.0f, 1.0f}).setDuration(150);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                textView.setText(str);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2});
        animatorSet.start();
    }

    public C36436dw(Context context, TranslationStatusView translationStatusView, TextView textView) {
        this.f95601f = context;
        this.f95596a = translationStatusView;
        this.f95597b = textView;
    }
}
