package com.p280ss.android.ugc.aweme.challenge.p1086ui.header;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C21647ag;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.detail.C26051c;
import com.p280ss.android.ugc.aweme.detail.DetailViewModel;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27746c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView.C33833a;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7585d;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.e */
public final class C23768e implements C0053p<Boolean>, C27746c {

    /* renamed from: a */
    public boolean f62718a;

    /* renamed from: b */
    public boolean f62719b;

    /* renamed from: c */
    public final View f62720c;

    /* renamed from: d */
    private final C27743a f62721d = new C27743a();

    /* renamed from: e */
    private Challenge f62722e;

    /* renamed from: f */
    private C23783h f62723f;

    /* renamed from: g */
    private C35481c f62724g;

    /* renamed from: h */
    private boolean f62725h;

    /* renamed from: i */
    private final CheckableImageView f62726i;

    /* renamed from: j */
    private final DmtTextView f62727j;

    /* renamed from: e */
    private final void m77920e() {
        this.f62725h = !this.f62725h;
    }

    /* renamed from: a */
    public final void mo61802a() {
        int i;
        CheckableImageView checkableImageView = this.f62726i;
        if (this.f62725h) {
            i = R.drawable.alg;
        } else {
            i = R.drawable.ali;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: b */
    public final void mo61806b() {
        int i;
        DmtTextView dmtTextView = this.f62727j;
        if (dmtTextView != null) {
            if (this.f62725h) {
                i = R.string.fg;
            } else {
                i = R.string.fd;
            }
            dmtTextView.setText(i);
        }
        C35481c cVar = this.f62724g;
        if (cVar != null && !this.f62725h && cVar.isShowing()) {
            cVar.dismiss();
        }
        if (this.f62725h) {
            this.f62719b = true;
            m77921f();
        }
    }

    /* renamed from: c */
    public final void mo61807c() {
        C27743a aVar = this.f62721d;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(3);
        Challenge challenge = this.f62722e;
        if (challenge == null) {
            C7573i.m23583a("mData");
        }
        objArr[1] = challenge.getCid();
        objArr[2] = Integer.valueOf(true ^ this.f62725h ? 1 : 0);
        aVar.mo56976a(objArr);
        m77920e();
        this.f62726i.mo86446b();
    }

    /* renamed from: f */
    private final void m77921f() {
        if (!C6399b.m19944t() && this.f62718a && this.f62719b) {
            Activity a = C23487o.m77130a(this.f62720c.getContext());
            if (a != null) {
                View view = this.f62720c;
                String str = "challenge";
                String str2 = "challenge";
                Challenge challenge = this.f62722e;
                if (challenge == null) {
                    C7573i.m23583a("mData");
                }
                String cid = challenge.getCid();
                C7573i.m23582a((Object) cid, "mData.cid");
                this.f62724g = C26051c.m85573a(view, a, str, str2, cid, false);
            }
            this.f62719b = false;
            this.f62718a = false;
        }
    }

    /* renamed from: d */
    public final void mo61808d() {
        String str;
        if (this.f62725h) {
            str = "cancel_favourite_challenge";
        } else {
            str = "favourite_challenge";
        }
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "challenge");
        String str2 = "tag_id";
        Challenge challenge = this.f62722e;
        if (challenge == null) {
            C7573i.m23583a("mData");
        }
        C22984d a2 = a.mo59973a(str2, challenge.getCid());
        String str3 = "challenge_id";
        Challenge challenge2 = this.f62722e;
        if (challenge2 == null) {
            C7573i.m23583a("mData");
        }
        C22984d a3 = a2.mo59973a(str3, challenge2.getCid());
        String str4 = "process_id";
        C23783h hVar = this.f62723f;
        if (hVar == null) {
            C7573i.m23583a("mHeaderParam");
        }
        C6907h.m21524a(str, (Map) a3.mo59973a(str4, hVar.f62783e).f60753a);
        C23783h hVar2 = this.f62723f;
        if (hVar2 == null) {
            C7573i.m23583a("mHeaderParam");
        }
        boolean equals = TextUtils.equals(hVar2.f62782d, "search_result");
        C23783h hVar3 = this.f62723f;
        if (hVar3 == null) {
            C7573i.m23583a("mHeaderParam");
        }
        boolean equals2 = TextUtils.equals(hVar3.f62782d, "general_search");
        if ((equals || equals2) && !this.f62725h) {
            C21647ag T = C6903bc.m21479T();
            String str5 = "search_favourite";
            String str6 = "challenge";
            Challenge challenge3 = this.f62722e;
            if (challenge3 == null) {
                C7573i.m23583a("mData");
            }
            T.mo57878a(str5, str6, challenge3.getCid(), equals);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(Boolean bool) {
        C35481c cVar = this.f62724g;
        if (cVar != null && cVar.isShowing()) {
            cVar.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo61803a(BaseResponse baseResponse) {
        Challenge challenge = this.f62722e;
        if (challenge == null) {
            C7573i.m23583a("mData");
        }
        challenge.setCollectStatus(this.f62725h ? 1 : 0);
        if (this.f62725h) {
            this.f62718a = true;
            m77921f();
        }
    }

    /* renamed from: a */
    public final void mo61805a(Exception exc) {
        C6921a.m21559a((Throwable) exc);
        m77920e();
        mo61802a();
        mo61806b();
    }

    /* renamed from: a */
    public final void mo61804a(Challenge challenge, C23783h hVar) {
        C7573i.m23587b(challenge, "data");
        C7573i.m23587b(hVar, "headerParam");
        this.f62722e = challenge;
        this.f62723f = hVar;
        boolean z = true;
        if (challenge.getCollectStatus() != 1) {
            z = false;
        }
        this.f62725h = z;
        mo61802a();
        mo61806b();
    }

    public C23768e(View view, CheckableImageView checkableImageView, DmtTextView dmtTextView) {
        C7573i.m23587b(view, "container");
        C7573i.m23587b(checkableImageView, "collectIv");
        this.f62720c = view;
        this.f62726i = checkableImageView;
        this.f62727j = dmtTextView;
        this.f62720c.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C23768e f62728a;

            {
                this.f62728a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f62728a.mo61808d();
                this.f62728a.f62718a = false;
                this.f62728a.f62719b = false;
                if (!C6861a.m21337f().isLogin()) {
                    C32656f.m105744a(C23487o.m77158e(this.f62728a.f62720c), "challenge", "click_favorite_challenge", (Bundle) null, (C23305g) new C23772f(new C7561a<C7581n>(this.f62728a) {
                        public final String getName() {
                            return "requestCollect";
                        }

                        public final C7585d getOwner() {
                            return C7575l.m23595a(C23768e.class);
                        }

                        public final String getSignature() {
                            return "requestCollect()V";
                        }

                        /* renamed from: a */
                        private void m77929a() {
                            ((C23768e) this.receiver).mo61807c();
                        }

                        public final /* synthetic */ Object invoke() {
                            m77929a();
                            return C7581n.f20898a;
                        }
                    }));
                } else {
                    this.f62728a.mo61807c();
                }
            }
        });
        this.f62726i.setOnStateChangeListener(new C33833a(this) {

            /* renamed from: a */
            final /* synthetic */ C23768e f62729a;

            /* renamed from: a */
            public final void mo61810a() {
            }

            {
                this.f62729a = r1;
            }

            /* renamed from: a */
            public final void mo61811a(int i) {
                if (i == 1) {
                    this.f62729a.mo61802a();
                    this.f62729a.mo61806b();
                }
            }
        });
        this.f62721d.mo66537a(this);
        Activity e = C23487o.m77158e(this.f62720c);
        if (e != null) {
            NextLiveData<Boolean> nextLiveData = ((DetailViewModel) C0069x.m159a((FragmentActivity) e).mo147a(DetailViewModel.class)).f68836a;
            Activity e2 = C23487o.m77158e(this.f62720c);
            if (e2 != null) {
                nextLiveData.observe((FragmentActivity) e2, this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
