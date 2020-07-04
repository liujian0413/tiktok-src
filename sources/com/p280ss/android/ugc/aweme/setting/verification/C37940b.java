package com.p280ss.android.ugc.aweme.setting.verification;

import android.content.Context;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.setting.verification.VerificationApi.C37938a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.setting.verification.b */
public final class C37940b {

    /* renamed from: b */
    public static final C37941a f98795b = new C37941a(null);

    /* renamed from: a */
    public final C47562b f98796a = new C47562b();

    /* renamed from: com.ss.android.ugc.aweme.setting.verification.b$a */
    public static final class C37941a {
        private C37941a() {
        }

        /* renamed from: d */
        public final boolean mo95390d() {
            if (m121213e() || m121214f()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static boolean m121210a() {
            Boolean bool;
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                MtcertSettings mtcertSettings = a.getMtcertSettings();
                C7573i.m23582a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
                bool = mtcertSettings.getShowCertEntry();
                C7573i.m23582a((Object) bool, "SettingsReader.get().mtcertSettings.showCertEntry");
            } catch (NullValueException unused) {
                bool = Boolean.valueOf(false);
            }
            return bool.booleanValue();
        }

        /* renamed from: b */
        public static boolean m121211b() {
            Boolean bool;
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                MtcertSettings mtcertSettings = a.getMtcertSettings();
                C7573i.m23582a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
                bool = mtcertSettings.getEnablePrivateAccountNotice();
                C7573i.m23582a((Object) bool, "SettingsReader.get().mtc…nablePrivateAccountNotice");
            } catch (NullValueException unused) {
                bool = Boolean.valueOf(false);
            }
            return bool.booleanValue();
        }

        /* renamed from: c */
        public static boolean m121212c() {
            Boolean bool;
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                MtcertSettings mtcertSettings = a.getMtcertSettings();
                C7573i.m23582a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
                bool = mtcertSettings.getEnableChangeMobileNotice();
                C7573i.m23582a((Object) bool, "SettingsReader.get().mtc….enableChangeMobileNotice");
            } catch (NullValueException unused) {
                bool = Boolean.valueOf(false);
            }
            return bool.booleanValue();
        }

        /* renamed from: e */
        public static boolean m121213e() {
            Boolean bool;
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                MtcertSettings mtcertSettings = a.getMtcertSettings();
                C7573i.m23582a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
                bool = mtcertSettings.getEnableChangeHandleNotice();
                C7573i.m23582a((Object) bool, "SettingsReader.get().mtc….enableChangeHandleNotice");
            } catch (NullValueException unused) {
                bool = Boolean.valueOf(false);
            }
            return bool.booleanValue();
        }

        /* renamed from: f */
        public static boolean m121214f() {
            Boolean bool;
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                MtcertSettings mtcertSettings = a.getMtcertSettings();
                C7573i.m23582a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
                bool = mtcertSettings.getEnableChangeNicknameNotice();
                C7573i.m23582a((Object) bool, "SettingsReader.get().mtc…nableChangeNicknameNotice");
            } catch (NullValueException unused) {
                bool = Boolean.valueOf(false);
            }
            return bool.booleanValue();
        }

        public /* synthetic */ C37941a(C7571f fVar) {
            this();
        }

        /* renamed from: b */
        public final void mo95389b(Context context) {
            C7573i.m23587b(context, "context");
            if (m121210a()) {
                m121209a(context);
            } else {
                C10761a.m31410e(context, context.getString(R.string.e_3)).mo25750a();
            }
        }

        /* renamed from: a */
        public static void m121209a(Context context) {
            C7573i.m23587b(context, "context");
            C6907h.m21524a("enter_request_verification", (Map) new HashMap());
            try {
                C7195s a = C7195s.m22438a();
                IESSettingsProxy a2 = C30199h.m98861a();
                C7573i.m23582a((Object) a2, "SettingsReader.get()");
                MtcertSettings mtcertSettings = a2.getMtcertSettings();
                C7573i.m23582a((Object) mtcertSettings, "SettingsReader.get().mtcertSettings");
                a.mo18682a(mtcertSettings.getCertUrlSchema());
            } catch (NullValueException unused) {
                if (C6399b.m19947w()) {
                    C7195s.m22438a().mo18682a("aweme://webview/?url=https%3a%2f%2fwww.tiktok.com%2ffalcon%2fmain%2fverification%2f%3fhide_nav_bar%3d1&hide_nav_bar=1");
                } else {
                    C7195s.m22438a().mo18682a("aweme://webview/?url=https%3a%2f%2fm.tiktok.com%2ffalcon%2fmain%2fverification%2f%3fhide_nav_bar%3d1&hide_nav_bar=1");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.verification.b$b */
    public static final class C37942b implements C7498y<VerificationResponse> {

        /* renamed from: a */
        final /* synthetic */ C37940b f98797a;

        /* renamed from: b */
        final /* synthetic */ C37939a f98798b;

        public final void onComplete() {
            this.f98798b.mo95177a();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(VerificationResponse verificationResponse) {
            C7573i.m23587b(verificationResponse, "t");
            this.f98798b.mo92278a(verificationResponse);
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f98798b.mo95177a();
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
            this.f98797a.f98796a.mo119661a(cVar);
        }

        C37942b(C37940b bVar, C37939a aVar) {
            this.f98797a = bVar;
            this.f98798b = aVar;
        }
    }

    /* renamed from: a */
    public static final void m121200a(Context context) {
        C37941a.m121209a(context);
    }

    /* renamed from: b */
    public static final boolean m121202b() {
        return C37941a.m121210a();
    }

    /* renamed from: c */
    public static final boolean m121203c() {
        return C37941a.m121213e();
    }

    /* renamed from: d */
    public static final boolean m121204d() {
        return C37941a.m121214f();
    }

    /* renamed from: a */
    public final void mo95385a() {
        this.f98796a.mo119660a();
    }

    /* renamed from: a */
    public final void mo95386a(User user, C37939a aVar) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(aVar, "callback");
        m121201a(C37941a.m121212c(), user, aVar);
    }

    /* renamed from: b */
    public final void mo95387b(User user, C37939a aVar) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(aVar, "callback");
        m121201a(C37941a.m121211b(), user, aVar);
    }

    /* renamed from: c */
    public final void mo95388c(User user, C37939a aVar) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(aVar, "callback");
        m121201a(f98795b.mo95390d(), user, aVar);
    }

    /* renamed from: a */
    private void m121201a(boolean z, User user, C37939a aVar) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(aVar, "callback");
        if (z) {
            C37938a.m121197a().requestVerification(user.getSecUid()).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C37942b<Object>(this, aVar));
            return;
        }
        VerificationResponse verificationResponse = new VerificationResponse();
        verificationResponse.setMtCertStatusEnum(MtCertStatusEnum.CS_EMPTY);
        verificationResponse.setMtCertingActionEnum(MtCertingActionEnum.CA_EMPTY);
        aVar.mo92278a(verificationResponse);
        aVar.mo95177a();
    }
}
