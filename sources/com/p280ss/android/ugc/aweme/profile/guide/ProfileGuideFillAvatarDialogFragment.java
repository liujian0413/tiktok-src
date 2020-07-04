package com.p280ss.android.ugc.aweme.profile.guide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1058c.C23285d;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.p280ss.android.ugc.aweme.profile.guide.ProfileGuideFillNicknameDialogFragment.C35804a;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36039m;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideFillAvatarDialogFragment */
public final class ProfileGuideFillAvatarDialogFragment extends ProfileGuideBottomSheetDialogFragment implements C36039m, C36046t {

    /* renamed from: f */
    public static final C35801a f93829f = new C35801a(null);

    /* renamed from: d */
    public final C35999a f93830d;

    /* renamed from: e */
    public final boolean f93831e;

    /* renamed from: g */
    private final int f93832g = C23486n.m77122a(341.0d);

    /* renamed from: h */
    private final String f93833h = "guide_profile_photo";

    /* renamed from: i */
    private DmtTextView f93834i;

    /* renamed from: j */
    private View f93835j;

    /* renamed from: k */
    private RemoteImageView f93836k;

    /* renamed from: l */
    private DmtTextView f93837l;

    /* renamed from: m */
    private final C36011ai f93838m;

    /* renamed from: n */
    private String f93839n;

    /* renamed from: o */
    private final int f93840o;

    /* renamed from: p */
    private HashMap f93841p;

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideFillAvatarDialogFragment$a */
    public static final class C35801a {
        private C35801a() {
        }

        /* renamed from: a */
        private static ProfileGuideFillAvatarDialogFragment m115605a() {
            return new ProfileGuideFillAvatarDialogFragment();
        }

        public /* synthetic */ C35801a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo90698a(C0608j jVar) {
            C7573i.m23587b(jVar, "fragmentManager");
            Fragment a = jVar.mo2644a("ProfileGuideFillAvatarDialogFragment");
            if (!(a instanceof ProfileGuideFillAvatarDialogFragment)) {
                a = null;
            }
            ProfileGuideFillAvatarDialogFragment profileGuideFillAvatarDialogFragment = (ProfileGuideFillAvatarDialogFragment) a;
            if (profileGuideFillAvatarDialogFragment == null) {
                profileGuideFillAvatarDialogFragment = m115605a();
            }
            if (!profileGuideFillAvatarDialogFragment.isAdded()) {
                jVar.mo2645a().mo2588a((Fragment) profileGuideFillAvatarDialogFragment, "ProfileGuideFillAvatarDialogFragment").mo2606d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideFillAvatarDialogFragment$b */
    static final class C35802b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileGuideFillAvatarDialogFragment f93842a;

        C35802b(ProfileGuideFillAvatarDialogFragment profileGuideFillAvatarDialogFragment) {
            this.f93842a = profileGuideFillAvatarDialogFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f93842a.f93831e) {
                C0612l lVar = this.f93842a.mFragmentManager;
                if (lVar != null) {
                    C35804a aVar = ProfileGuideFillNicknameDialogFragment.f93844e;
                    C7573i.m23582a((Object) lVar, "this");
                    aVar.mo90709a(lVar);
                }
            }
            this.f93842a.dismiss(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.ProfileGuideFillAvatarDialogFragment$c */
    static final class C35803c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileGuideFillAvatarDialogFragment f93843a;

        C35803c(ProfileGuideFillAvatarDialogFragment profileGuideFillAvatarDialogFragment) {
            this.f93843a = profileGuideFillAvatarDialogFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f93843a.f93818a) {
                ProfileGuideFillAvatarDialogFragment.m115593e();
                this.f93843a.f93830d.mo91614b(0);
            }
        }
    }

    /* renamed from: a */
    public final int mo90688a() {
        return this.f93832g;
    }

    /* renamed from: b */
    public final String mo90689b() {
        return this.f93833h;
    }

    /* renamed from: d */
    public final void mo90692d() {
        if (this.f93841p != null) {
            this.f93841p.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo90692d();
    }

    /* renamed from: e */
    public static void m115593e() {
        C6907h.m21524a("replace_profile_photo", (Map) C22984d.m75611a().mo59973a("enter_method", "click_head").f60753a);
    }

    /* renamed from: f */
    private final void m115594f() {
        RemoteImageView remoteImageView = this.f93836k;
        if (remoteImageView == null) {
            C7573i.m23583a("mUploadAvatarImageView");
        }
        C23323e.m76503a(remoteImageView, (int) R.drawable.b8_);
        if (this.f93831e) {
            DmtTextView dmtTextView = this.f93834i;
            if (dmtTextView == null) {
                C7573i.m23583a("mAction");
            }
            dmtTextView.setText(R.string.um);
        }
    }

    public ProfileGuideFillAvatarDialogFragment() {
        C35999a aVar = new C35999a();
        aVar.f94183c = this;
        this.f93830d = aVar;
        C36011ai aiVar = new C36011ai();
        aiVar.f94200a = this;
        this.f93838m = aiVar;
        this.f93840o = C23486n.m77122a(1.0d);
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        this.f93831e = f.getCurUser().nicknameUpdateReminder();
    }

    /* renamed from: a */
    public final void mo66089a(boolean z) {
        if (this.f93818a) {
            this.f93830d.mo91617g();
        }
    }

    /* renamed from: a */
    public final void mo61679a(AvatarUri avatarUri) {
        if (this.f93818a) {
            if (avatarUri == null) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.d0).mo25750a();
            } else {
                this.f93838m.mo91648d(avatarUri.uri);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.f93830d.mo80250b(activity, this);
        }
    }

    /* renamed from: a */
    public final void mo61680a(Exception exc) {
        mo90690b(false);
        if (this.f93818a) {
            this.f93830d.mo91617g();
            C22814a.m75245a(getActivity(), exc, R.string.d0);
        }
    }

    /* renamed from: a */
    private final void m115592a(View view) {
        View findViewById = view.findViewById(R.id.a2);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.id.action)");
        this.f93834i = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.bkl);
        C7573i.m23582a((Object) findViewById2, "rootView.findViewById(R.id.layout_upload_avatar)");
        this.f93835j = findViewById2;
        View findViewById3 = view.findViewById(R.id.ayj);
        C7573i.m23582a((Object) findViewById3, "rootView.findViewById(R.id.image_upload_avatar)");
        this.f93836k = (RemoteImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.did);
        C7573i.m23582a((Object) findViewById4, "rootView.findViewById(R.id.text_upload_avatar)");
        this.f93837l = (DmtTextView) findViewById4;
        DmtTextView dmtTextView = this.f93834i;
        if (dmtTextView == null) {
            C7573i.m23583a("mAction");
        }
        dmtTextView.setOnClickListener(new C35802b(this));
        View view2 = this.f93835j;
        if (view2 == null) {
            C7573i.m23583a("mUploadAvatarLayout");
        }
        view2.setOnTouchListener(new C34032a(0.5f, 0, null));
        View view3 = this.f93835j;
        if (view3 == null) {
            C7573i.m23583a("mUploadAvatarLayout");
        }
        view3.setOnClickListener(new C35803c(this));
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
        if (this.f93818a) {
            this.f93830d.mo91616f();
            this.f93839n = str;
            this.f93830d.mo91615e();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m115592a(view);
        m115594f();
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        UrlModel urlModel;
        mo90690b(true);
        if (this.f93818a) {
            this.f93830d.mo91617g();
            if (i == 4) {
                RemoteImageView remoteImageView = this.f93836k;
                if (remoteImageView == null) {
                    C7573i.m23583a("mUploadAvatarImageView");
                }
                if (user != null) {
                    urlModel = user.getAvatarMedium();
                } else {
                    urlModel = null;
                }
                C23323e.m76524b(remoteImageView, urlModel);
                RemoteImageView remoteImageView2 = this.f93836k;
                if (remoteImageView2 == null) {
                    C7573i.m23583a("mUploadAvatarImageView");
                }
                C13438a aVar = (C13438a) remoteImageView2.getHierarchy();
                C7573i.m23582a((Object) aVar, "mUploadAvatarImageView.hierarchy");
                RoundingParams roundingParams = aVar.f35619a;
                if (roundingParams != null) {
                    Context context = getContext();
                    if (context == null) {
                        context = C6399b.m19921a();
                    }
                    roundingParams.mo32885b(C0683b.m2912c(context, R.color.av));
                    roundingParams.mo32886c((float) this.f93840o);
                }
                DmtTextView dmtTextView = this.f93837l;
                if (dmtTextView == null) {
                    C7573i.m23583a("mUploadAvatarTextView");
                }
                dmtTextView.setText(R.string.zh);
                DmtTextView dmtTextView2 = this.f93837l;
                if (dmtTextView2 == null) {
                    C7573i.m23583a("mUploadAvatarTextView");
                }
                Context context2 = getContext();
                if (context2 == null) {
                    context2 = C6399b.m19921a();
                }
                dmtTextView2.setTextColor(C0683b.m2912c(context2, R.color.bs));
                DmtTextView dmtTextView3 = this.f93834i;
                if (dmtTextView3 == null) {
                    C7573i.m23583a("mAction");
                }
                dmtTextView3.setEnabled(true);
                Context context3 = getContext();
                if (context3 == null) {
                    context3 = C6399b.m19921a();
                }
                C10761a.m31383a(context3, (int) R.string.d7m).mo25750a();
                C42961az.m136380a(new C23285d());
            }
        }
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        mo90690b(false);
        if (this.f93818a) {
            this.f93830d.mo91617g();
            if (4 == i && (exc instanceof ApiServerException) && ((ApiServerException) exc).getErrorCode() == 20022) {
                C19282c.m63182a(getContext(), "profile_image_setting", "review_failure");
            }
            if (i != 116) {
                C22814a.m75245a(getContext(), exc, R.string.d80);
            }
        }
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
        mo90690b(false);
        if (this.f93818a) {
            this.f93830d.mo91617g();
            if (!TextUtils.isEmpty(str)) {
                Context context = getContext();
                if (context == null) {
                    context = C6399b.m19921a();
                }
                C10761a.m31403c(context, str).mo25750a();
                if (z) {
                    dismiss(false);
                }
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f93830d.mo80249a(i, i2, intent);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.l1, viewGroup, false);
    }
}
