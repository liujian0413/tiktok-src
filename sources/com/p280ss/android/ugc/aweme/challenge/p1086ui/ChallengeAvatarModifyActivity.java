package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36039m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity */
public final class ChallengeAvatarModifyActivity extends AmeSSActivity implements C36039m {

    /* renamed from: d */
    public static final HashMap<String, Boolean> f62488d = new HashMap<>();

    /* renamed from: e */
    public static final C23706a f62489e = new C23706a(null);

    /* renamed from: a */
    public C35999a f62490a;

    /* renamed from: b */
    public Challenge f62491b;

    /* renamed from: c */
    public String f62492c = "";

    /* renamed from: f */
    private TextTitleBar f62493f;

    /* renamed from: g */
    private View f62494g;

    /* renamed from: h */
    private HashMap f62495h;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$a */
    public static final class C23706a {
        private C23706a() {
        }

        /* renamed from: a */
        public static HashMap<String, Boolean> m77708a() {
            return ChallengeAvatarModifyActivity.f62488d;
        }

        public /* synthetic */ C23706a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m77709a(Activity activity, Challenge challenge) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(challenge, "challenge");
            Intent intent = new Intent(activity, ChallengeAvatarModifyActivity.class);
            intent.putExtra("challenge_info", challenge);
            activity.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$b */
    public static final class C23707b implements C10797a {

        /* renamed from: a */
        final /* synthetic */ ChallengeAvatarModifyActivity f62496a;

        /* renamed from: b */
        public final void mo25896b(View view) {
        }

        C23707b(ChallengeAvatarModifyActivity challengeAvatarModifyActivity) {
            this.f62496a = challengeAvatarModifyActivity;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            this.f62496a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$c */
    static final class C23708c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChallengeAvatarModifyActivity f62497a;

        C23708c(ChallengeAvatarModifyActivity challengeAvatarModifyActivity) {
            this.f62497a = challengeAvatarModifyActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C6399b.m19944t()) {
                C6907h.m21524a("upload_hashtag_icon", (Map) C22984d.m75611a().mo59973a("process_id", this.f62497a.f62492c).mo59973a("tag_id", ChallengeAvatarModifyActivity.m77702a(this.f62497a).getCid()).f60753a);
            }
            if (!TextUtils.isEmpty(ChallengeAvatarModifyActivity.m77702a(this.f62497a).getChallengeProfileUrl())) {
                C10761a.m31399c((Context) this.f62497a, (int) R.string.bdg).mo25750a();
            } else if (C7573i.m23585a((Object) (Boolean) C23706a.m77708a().get(ChallengeAvatarModifyActivity.m77702a(this.f62497a).getCid()), (Object) Boolean.valueOf(true)) || !ChallengeAvatarModifyActivity.m77702a(this.f62497a).allowUploadCover()) {
                C10761a.m31399c((Context) this.f62497a, (int) R.string.bdh).mo25750a();
            } else {
                ChallengeAvatarModifyActivity.m77704b(this.f62497a).mo91611a(5);
            }
        }
    }

    /* renamed from: a */
    private View m77701a(int i) {
        if (this.f62495h == null) {
            this.f62495h = new HashMap();
        }
        View view = (View) this.f62495h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f62495h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m77703a() {
        /*
            r4 = this;
            r0 = 2131302128(0x7f0916f0, float:1.8222333E38)
            android.view.View r0 = r4.m77701a(r0)
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r0 = (com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar) r0
            java.lang.String r1 = "title_bar"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r4.f62493f = r0
            r0 = 2131302878(0x7f0919de, float:1.8223855E38)
            android.view.View r0 = r4.m77701a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r0
            java.lang.String r1 = "tv_upload_avatar"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.view.View r0 = (android.view.View) r0
            r4.f62494g = r0
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "challenge_info"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            if (r0 == 0) goto L_0x00e0
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = (com.p280ss.android.ugc.aweme.discover.model.Challenge) r0
            r4.f62491b = r0
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "process_id"
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.f62492c = r0
            android.view.View r0 = r4.f62494g
            if (r0 != 0) goto L_0x0047
            java.lang.String r1 = "mUploadBtn"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0047:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = f62488d
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = r4.f62491b
            if (r2 != 0) goto L_0x0052
            java.lang.String r3 = "mChallenge"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0052:
            java.lang.String r2 = r2.getCid()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x008f
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r4.f62491b
            if (r1 != 0) goto L_0x0071
            java.lang.String r2 = "mChallenge"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0071:
            boolean r1 = r1.allowUploadCover()
            if (r1 == 0) goto L_0x008f
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r4.f62491b
            if (r1 != 0) goto L_0x0080
            java.lang.String r2 = "mChallenge"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0080:
            java.lang.String r1 = r1.getChallengeProfileUrl()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x008f
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0091
        L_0x008f:
            r1 = 1056964608(0x3f000000, float:0.5)
        L_0x0091:
            r0.setAlpha(r1)
            com.ss.android.ugc.aweme.profile.presenter.a r0 = new com.ss.android.ugc.aweme.profile.presenter.a
            r0.<init>()
            r4.f62490a = r0
            com.ss.android.ugc.aweme.profile.presenter.a r0 = r4.f62490a
            if (r0 != 0) goto L_0x00a4
            java.lang.String r1 = "mAvatarPresenter"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00a4:
            r1 = r4
            com.ss.android.ugc.aweme.profile.presenter.m r1 = (com.p280ss.android.ugc.aweme.profile.presenter.C36039m) r1
            r0.f94183c = r1
            com.ss.android.ugc.aweme.profile.presenter.a r0 = r4.f62490a
            if (r0 != 0) goto L_0x00b2
            java.lang.String r1 = "mAvatarPresenter"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00b2:
            r1 = r4
            android.app.Activity r1 = (android.app.Activity) r1
            r2 = 0
            r0.mo80250b(r1, r2)
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r0 = r4.f62493f
            if (r0 != 0) goto L_0x00c2
            java.lang.String r1 = "mTitleBar"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00c2:
            com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$b r1 = new com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$b
            r1.<init>(r4)
            com.bytedance.ies.dmt.ui.titlebar.a.a r1 = (com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a) r1
            r0.setOnTitleBarClickListener(r1)
            android.view.View r0 = r4.f62494g
            if (r0 != 0) goto L_0x00d5
            java.lang.String r1 = "mUploadBtn"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00d5:
            com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$c r1 = new com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$c
            r1.<init>(r4)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            return
        L_0x00e0:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.Challenge"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeAvatarModifyActivity.m77703a():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ Challenge m77702a(ChallengeAvatarModifyActivity challengeAvatarModifyActivity) {
        Challenge challenge = challengeAvatarModifyActivity.f62491b;
        if (challenge == null) {
            C7573i.m23583a("mChallenge");
        }
        return challenge;
    }

    /* renamed from: b */
    public static final /* synthetic */ C35999a m77704b(ChallengeAvatarModifyActivity challengeAvatarModifyActivity) {
        C35999a aVar = challengeAvatarModifyActivity.f62490a;
        if (aVar == null) {
            C7573i.m23583a("mAvatarPresenter");
        }
        return aVar;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.c6);
        m77703a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo61679a(AvatarUri avatarUri) {
        C7573i.m23587b(avatarUri, "avatarUri");
        if (isViewValid()) {
            C35999a aVar = this.f62490a;
            if (aVar == null) {
                C7573i.m23583a("mAvatarPresenter");
            }
            aVar.mo91617g();
            Map map = f62488d;
            Challenge challenge = this.f62491b;
            if (challenge == null) {
                C7573i.m23583a("mChallenge");
            }
            String cid = challenge.getCid();
            C7573i.m23582a((Object) cid, "mChallenge.cid");
            map.put(cid, Boolean.valueOf(true));
            View view = this.f62494g;
            if (view == null) {
                C7573i.m23583a("mUploadBtn");
            }
            view.setAlpha(0.5f);
            C10761a.m31383a((Context) this, (int) R.string.bdj).mo25750a();
        }
    }

    /* renamed from: a */
    public final void mo61680a(Exception exc) {
        C7573i.m23587b(exc, "e");
        if (isViewValid()) {
            C35999a aVar = this.f62490a;
            if (aVar == null) {
                C7573i.m23583a("mAvatarPresenter");
            }
            aVar.mo91617g();
            C10761a.m31399c((Context) this, (int) R.string.fkg).mo25750a();
        }
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
        C7573i.m23587b(str, "filePath");
        if (isViewValid()) {
            C19565e[] eVarArr = new C19565e[2];
            String str2 = "challenge_id";
            Challenge challenge = this.f62491b;
            if (challenge == null) {
                C7573i.m23583a("mChallenge");
            }
            eVarArr[0] = new C19565e(str2, challenge.getCid());
            eVarArr[1] = new C19565e("source", "4");
            List c = C7525m.m23466c(eVarArr);
            C35999a aVar = this.f62490a;
            if (aVar == null) {
                C7573i.m23583a("mAvatarPresenter");
            }
            aVar.mo91613a(str, c);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C35999a aVar = this.f62490a;
        if (aVar == null) {
            C7573i.m23583a("mAvatarPresenter");
        }
        aVar.mo80249a(i, i2, intent);
    }
}
