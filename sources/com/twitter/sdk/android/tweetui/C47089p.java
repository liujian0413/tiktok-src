package com.twitter.sdk.android.tweetui;

import android.view.View;
import android.view.View.OnClickListener;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.TwitterApiException;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.C46959o;
import com.twitter.sdk.android.core.models.C46960p;

/* renamed from: com.twitter.sdk.android.tweetui.p */
final class C47089p extends C47036d implements OnClickListener {

    /* renamed from: b */
    final C46959o f120837b;

    /* renamed from: c */
    final C47018aj f120838c;

    /* renamed from: d */
    final C47029aq f120839d;

    /* renamed from: e */
    final C47023al f120840e;

    /* renamed from: com.twitter.sdk.android.tweetui.p$a */
    static class C47090a extends C46821b<C46959o> {

        /* renamed from: a */
        final ToggleImageButton f120841a;

        /* renamed from: b */
        final C46959o f120842b;

        /* renamed from: c */
        final C46821b<C46959o> f120843c;

        /* renamed from: a */
        public final void mo29990a(C46830i<C46959o> iVar) {
            this.f120843c.mo29990a(iVar);
        }

        /* renamed from: a */
        public final void mo29989a(TwitterException twitterException) {
            if (twitterException instanceof TwitterApiException) {
                int errorCode = ((TwitterApiException) twitterException).getErrorCode();
                if (errorCode == 139) {
                    this.f120843c.mo29990a(new C46830i<>(new C46960p().mo118093a(this.f120842b).mo118094a(true).mo118091a(), null));
                } else if (errorCode != 144) {
                    this.f120841a.setToggledOn(this.f120842b.f120433g);
                    this.f120843c.mo29989a(twitterException);
                } else {
                    this.f120843c.mo29990a(new C46830i<>(new C46960p().mo118093a(this.f120842b).mo118094a(false).mo118091a(), null));
                }
            } else {
                this.f120841a.setToggledOn(this.f120842b.f120433g);
                this.f120843c.mo29989a(twitterException);
            }
        }

        C47090a(ToggleImageButton toggleImageButton, C46959o oVar, C46821b<C46959o> bVar) {
            this.f120841a = toggleImageButton;
            this.f120842b = oVar;
            this.f120843c = bVar;
        }
    }

    /* renamed from: a */
    private void m147220a() {
        this.f120840e.mo118230b(this.f120837b);
    }

    /* renamed from: b */
    private void m147221b() {
        this.f120840e.mo118231c(this.f120837b);
    }

    public final void onClick(View view) {
        if (view instanceof ToggleImageButton) {
            ToggleImageButton toggleImageButton = (ToggleImageButton) view;
            if (this.f120837b.f120433g) {
                m147221b();
                this.f120838c.mo118223b(this.f120837b.f120435i, new C47090a(toggleImageButton, this.f120837b, this.f120680a));
                return;
            }
            m147220a();
            this.f120838c.mo118222a(this.f120837b.f120435i, (C46821b<C46959o>) new C47090a<C46959o>(toggleImageButton, this.f120837b, this.f120680a));
        }
    }

    C47089p(C46959o oVar, C47029aq aqVar, C46821b<C46959o> bVar) {
        this(oVar, aqVar, bVar, new C47024am(aqVar));
    }

    private C47089p(C46959o oVar, C47029aq aqVar, C46821b<C46959o> bVar, C47023al alVar) {
        super(bVar);
        this.f120837b = oVar;
        this.f120839d = aqVar;
        this.f120840e = alVar;
        this.f120838c = aqVar.f120676f;
    }
}
