package com.p280ss.android.ugc.aweme.account.login.p975v2.network;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.ArrayMap;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p645a.p646a.C12713h;
import com.bytedance.sdk.account.p645a.p647b.C12717a;
import com.bytedance.sdk.account.p645a.p647b.C12718b;
import com.bytedance.sdk.account.p645a.p647b.C12721e;
import com.bytedance.sdk.account.p645a.p649d.C12729a;
import com.bytedance.sdk.account.p645a.p649d.C12730b;
import com.bytedance.sdk.account.p645a.p649d.C12734f;
import com.bytedance.sdk.account.p662f.p663a.C12819b;
import com.bytedance.sdk.account.p662f.p663a.C12820c;
import com.bytedance.sdk.account.p662f.p663a.C12822e;
import com.bytedance.sdk.account.p662f.p663a.C12823f;
import com.bytedance.sdk.account.p662f.p663a.C12824g;
import com.bytedance.sdk.account.p662f.p663a.C12825h;
import com.bytedance.sdk.account.p662f.p663a.C12830m;
import com.bytedance.sdk.account.p662f.p663a.C12831n;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p662f.p663a.C12837t;
import com.bytedance.sdk.account.p662f.p664b.C12878t.C12879a;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12841b;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12842c;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12844e;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12845f;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12846g;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12847h;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12850k;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12851l;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12856q;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12857r;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12859t;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.api.p937b.C21112b;
import com.p280ss.android.ugc.aweme.account.api.p937b.C21112b.C21113a;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21335l;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.NetworkException.C21911a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a.C21913a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.EmailSignUpFragment.C22074a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.PhoneLoginFragment.C22118a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.PhoneSignUpFragment.C22127a;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import com.p280ss.android.ugc.aweme.account.network.C22208c;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p950k.C21229c;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d.C21232a;
import com.p280ss.android.ugc.aweme.account.p950k.C21235f;
import com.p280ss.android.ugc.aweme.account.p951l.C21241d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONObject;
import org.p361a.C48294d;
import org.p361a.C7704b;
import p346io.reactivex.C47855m;
import p346io.reactivex.C47857o;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7490k;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e */
public final class C21931e {

    /* renamed from: a */
    public static final C21931e f58668a = new C21931e();

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$a */
    static final class C21932a<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ Scene f58669a;

        /* renamed from: b */
        final /* synthetic */ Step f58670b;

        /* renamed from: c */
        final /* synthetic */ BaseAccountFlowFragment f58671c;

        /* renamed from: d */
        final /* synthetic */ String f58672d;

        /* renamed from: e */
        final /* synthetic */ String f58673e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$a$a */
        public static final class C21933a extends C12841b {

            /* renamed from: a */
            final /* synthetic */ C21932a f58674a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58675b;

            public final void onSuccess(C12710e<C12819b> eVar) {
                C7573i.m23587b(eVar, "response");
                this.f58675b.mo119769a(eVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12819b> eVar) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58675b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58674a.f58669a, this.f58674a.f58670b, null);
                mVar.mo119770a((Throwable) networkException);
            }

            C21933a(C21932a aVar, C47855m mVar) {
                this.f58674a = aVar;
                this.f58675b = mVar;
            }

            public final void onError(C12710e<C12819b> eVar, int i) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58675b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58674a.f58669a, this.f58674a.f58670b, null);
                mVar.mo119770a((Throwable) networkException);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12710e<C12819b> eVar, String str) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58675b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58674a.f58669a, this.f58674a.f58670b, null);
                mVar.mo119770a((Throwable) networkException);
            }
        }

        C21932a(Scene scene, Step step, BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2) {
            this.f58669a = scene;
            this.f58670b = step;
            this.f58671c = baseAccountFlowFragment;
            this.f58672d = str;
            this.f58673e = str2;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12710e<C12819b>> mVar) {
            C7573i.m23587b(mVar, "it");
            C21933a aVar = new C21933a(this, mVar);
            this.f58671c.mo58337a((C12706a<T>) aVar);
            this.f58671c.mo58343i().mo31195a(this.f58672d, this.f58673e, "", 0, (C12841b) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$aa */
    static final class C21934aa<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f58676a;

        /* renamed from: b */
        final /* synthetic */ BaseAccountFlowFragment f58677b;

        C21934aa(String str, BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58676a = str;
            this.f58677b = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                if (C7573i.m23585a((Object) this.f58676a, (Object) "phone")) {
                    C21232a aVar = C21231d.f57039b;
                    int errorCode = networkException.getErrorCode();
                    String errorMsg = networkException.getErrorMsg();
                    if (errorMsg == null) {
                        errorMsg = "";
                    }
                    aVar.mo57163a(false, errorCode, errorMsg);
                } else {
                    C21232a aVar2 = C21231d.f57039b;
                    int errorCode2 = networkException.getErrorCode();
                    String errorMsg2 = networkException.getErrorMsg();
                    if (errorMsg2 == null) {
                        errorMsg2 = "";
                    }
                    aVar2.mo57161a(1, errorCode2, errorMsg2);
                }
                C21930d.m73150a(false, networkException.getErrorCode(), this.f58676a, this.f58677b);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ab */
    static final class C21935ab<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ boolean f58678a;

        /* renamed from: b */
        final /* synthetic */ BaseAccountFlowFragment f58679b;

        /* renamed from: c */
        final /* synthetic */ Scene f58680c;

        /* renamed from: d */
        final /* synthetic */ Step f58681d;

        /* renamed from: e */
        final /* synthetic */ PhoneNumber f58682e;

        /* renamed from: f */
        final /* synthetic */ String f58683f;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ab$a */
        public static final class C21936a extends C12850k {

            /* renamed from: a */
            final /* synthetic */ C21935ab f58684a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58685b;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12830m> eVar) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58685b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58684a.f58680c, this.f58684a.f58681d, null);
                mVar.mo119770a((Throwable) networkException);
            }

            public final void onSuccess(C12710e<C12830m> eVar) {
                C7573i.m23587b(eVar, "response");
                if (eVar.f33709g == null || ((C12830m) eVar.f33709g).f33976c == null) {
                    this.f58685b.mo119770a((Throwable) C21911a.m73128a(this.f58684a.f58680c, this.f58684a.f58681d));
                } else {
                    this.f58685b.mo119769a(eVar);
                }
            }

            C21936a(C21935ab abVar, C47855m mVar) {
                this.f58684a = abVar;
                this.f58685b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12710e<C12830m> eVar, String str) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58685b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58684a.f58680c, this.f58684a.f58681d, null);
                mVar.mo119770a((Throwable) networkException);
            }

            public final void onError(C12710e<C12830m> eVar, int i) {
                String str;
                JSONObject jSONObject;
                C47855m mVar = this.f58685b;
                if (eVar != null) {
                    str = eVar.f33703c;
                } else {
                    str = null;
                }
                Scene scene = this.f58684a.f58680c;
                Step step = this.f58684a.f58681d;
                if (eVar != null) {
                    C12830m mVar2 = (C12830m) eVar.f33709g;
                    if (mVar2 != null) {
                        JSONObject jSONObject2 = mVar2.f33964l;
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2.getJSONObject("data");
                            NetworkException networkException = new NetworkException(i, str, scene, step, jSONObject);
                            mVar.mo119770a((Throwable) networkException);
                        }
                    }
                }
                jSONObject = null;
                NetworkException networkException2 = new NetworkException(i, str, scene, step, jSONObject);
                mVar.mo119770a((Throwable) networkException2);
            }
        }

        C21935ab(boolean z, BaseAccountFlowFragment baseAccountFlowFragment, Scene scene, Step step, PhoneNumber phoneNumber, String str) {
            this.f58678a = z;
            this.f58679b = baseAccountFlowFragment;
            this.f58680c = scene;
            this.f58681d = step;
            this.f58682e = phoneNumber;
            this.f58683f = str;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12710e<C12830m>> mVar) {
            C7573i.m23587b(mVar, "it");
            if (!this.f58678a) {
                C21930d.m73153a(this.f58678a, "sms_verification", this.f58679b, false);
            }
            C21936a aVar = new C21936a(this, mVar);
            this.f58679b.mo58337a((C12706a<T>) aVar);
            this.f58679b.mo58343i().mo31192a(PhoneNumberUtil.m73058a(this.f58682e), this.f58683f, (C12850k) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ac */
    static final class C21937ac<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ boolean f58686a;

        /* renamed from: b */
        final /* synthetic */ BaseAccountFlowFragment f58687b;

        C21937ac(boolean z, BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58686a = z;
            this.f58687b = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                C21930d.m73150a(this.f58686a, networkException.getErrorCode(), "sms_verification", this.f58687b);
                C21231d.f57039b.mo57165b(false, networkException.getErrorCode(), networkException.getErrorMsg());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ad */
    static final class C21938ad<T> implements C7326g<C12710e<C12830m>> {

        /* renamed from: a */
        final /* synthetic */ boolean f58688a;

        /* renamed from: b */
        final /* synthetic */ BaseAccountFlowFragment f58689b;

        C21938ad(boolean z, BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58688a = z;
            this.f58689b = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12830m> eVar) {
            C21930d.m73152a(this.f58688a, "sms_verification", this.f58689b);
            C21913a aVar = C21913a.f58632a;
            BaseAccountFlowFragment baseAccountFlowFragment = this.f58689b;
            Scene scene = Scene.SIGN_UP;
            Step d = this.f58689b.mo58339d();
            C12898b bVar = ((C12830m) eVar.f33709g).f33976c;
            C7573i.m23582a((Object) bVar, "it.mobileObj.mUserInfo");
            aVar.mo58367a(baseAccountFlowFragment, scene, d, null, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ae */
    static final class C21939ae<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ Scene f58690a;

        /* renamed from: b */
        final /* synthetic */ BaseAccountFlowFragment f58691b;

        /* renamed from: c */
        final /* synthetic */ Step f58692c;

        /* renamed from: d */
        final /* synthetic */ PhoneNumber f58693d;

        /* renamed from: e */
        final /* synthetic */ String f58694e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ae$a */
        public static final class C21940a extends C12851l {

            /* renamed from: a */
            final /* synthetic */ C21939ae f58695a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58696b;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12831n> eVar) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58696b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58695a.f58690a, this.f58695a.f58692c, null);
                mVar.mo119770a((Throwable) networkException);
            }

            public final void onSuccess(C12710e<C12831n> eVar) {
                C7573i.m23587b(eVar, "response");
                if (eVar.f33709g == null || ((C12831n) eVar.f33709g).f33981e == null) {
                    C47855m mVar = this.f58696b;
                    NetworkException networkException = new NetworkException(-1, "no data", this.f58695a.f58690a, this.f58695a.f58692c, null);
                    mVar.mo119770a((Throwable) networkException);
                    return;
                }
                this.f58696b.mo119769a(eVar.f33709g);
            }

            C21940a(C21939ae aeVar, C47855m mVar) {
                this.f58695a = aeVar;
                this.f58696b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12710e<C12831n> eVar, String str) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58696b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58695a.f58690a, this.f58695a.f58692c, null);
                mVar.mo119770a((Throwable) networkException);
            }

            public final void onError(C12710e<C12831n> eVar, int i) {
                String str;
                JSONObject jSONObject;
                C47855m mVar = this.f58696b;
                if (eVar != null) {
                    str = eVar.f33703c;
                } else {
                    str = null;
                }
                Scene scene = this.f58695a.f58690a;
                Step step = this.f58695a.f58692c;
                if (eVar != null) {
                    C12831n nVar = (C12831n) eVar.f33709g;
                    if (nVar != null) {
                        JSONObject jSONObject2 = nVar.f33964l;
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2.getJSONObject("data");
                            NetworkException networkException = new NetworkException(i, str, scene, step, jSONObject);
                            mVar.mo119770a((Throwable) networkException);
                        }
                    }
                }
                jSONObject = null;
                NetworkException networkException2 = new NetworkException(i, str, scene, step, jSONObject);
                mVar.mo119770a((Throwable) networkException2);
            }
        }

        C21939ae(Scene scene, BaseAccountFlowFragment baseAccountFlowFragment, Step step, PhoneNumber phoneNumber, String str) {
            this.f58690a = scene;
            this.f58691b = baseAccountFlowFragment;
            this.f58692c = step;
            this.f58693d = phoneNumber;
            this.f58694e = str;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12831n> mVar) {
            boolean z;
            C7573i.m23587b(mVar, "emitter");
            C21930d dVar = C21930d.f58667a;
            if (this.f58690a == Scene.SIGN_UP) {
                z = true;
            } else {
                z = false;
            }
            C21930d.m73153a(z, "sms_verification", this.f58691b, false);
            C21940a aVar = new C21940a(this, mVar);
            this.f58691b.mo58337a((C12706a<T>) aVar);
            this.f58691b.mo58343i().mo31201a(PhoneNumberUtil.m73058a(this.f58693d), this.f58694e, "", (C12851l) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$af */
    static final class C21941af<T> implements C7326g<C12831n> {

        /* renamed from: a */
        final /* synthetic */ boolean f58697a;

        /* renamed from: b */
        final /* synthetic */ boolean f58698b;

        /* renamed from: c */
        final /* synthetic */ BaseAccountFlowFragment f58699c;

        C21941af(boolean z, boolean z2, BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58697a = z;
            this.f58698b = z2;
            this.f58699c = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12831n nVar) {
            String str;
            boolean z = this.f58697a;
            if (this.f58698b) {
                str = "whatsapp";
            } else {
                str = "sms_verification";
            }
            C21930d.m73152a(z, str, this.f58699c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ag */
    static final class C21942ag<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ boolean f58700a;

        /* renamed from: b */
        final /* synthetic */ boolean f58701b;

        /* renamed from: c */
        final /* synthetic */ BaseAccountFlowFragment f58702c;

        C21942ag(boolean z, boolean z2, BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58700a = z;
            this.f58701b = z2;
            this.f58702c = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            String str;
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                if (!this.f58700a || networkException.getErrorCode() != 1011) {
                    C21231d.f57039b.mo57165b(false, networkException.getErrorCode(), networkException.getErrorMsg());
                    boolean z = this.f58700a;
                    int errorCode = networkException.getErrorCode();
                    if (this.f58701b) {
                        str = "whatsapp";
                    } else {
                        str = "sms_verification";
                    }
                    C21930d.m73150a(z, errorCode, str, this.f58702c);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ah */
    static final class C21943ah<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ Scene f58703a;

        /* renamed from: b */
        final /* synthetic */ Step f58704b;

        /* renamed from: c */
        final /* synthetic */ BaseAccountFlowFragment f58705c;

        /* renamed from: d */
        final /* synthetic */ String f58706d;

        /* renamed from: e */
        final /* synthetic */ int f58707e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ah$a */
        public static final class C21944a extends C12859t {

            /* renamed from: a */
            final /* synthetic */ C21943ah f58708a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58709b;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C12713h hVar) {
                C7573i.m23587b(hVar, "response");
                this.f58709b.mo119769a(hVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void onNeedSecureCaptcha(C12713h hVar) {
                C7573i.m23587b(hVar, "response");
                C47855m mVar = this.f58709b;
                NetworkException networkException = new NetworkException(hVar.f33702b, hVar.f33703c, this.f58708a.f58703a, this.f58708a.f58704b, null);
                mVar.mo119770a((Throwable) networkException);
            }

            C21944a(C21943ah ahVar, C47855m mVar) {
                this.f58708a = ahVar;
                this.f58709b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onError(C12713h hVar, int i) {
                C7573i.m23587b(hVar, "response");
                C47855m mVar = this.f58709b;
                NetworkException networkException = new NetworkException(hVar.f33702b, hVar.f33703c, this.f58708a.f58703a, this.f58708a.f58704b, null);
                mVar.mo119770a((Throwable) networkException);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12713h hVar, String str) {
                C7573i.m23587b(hVar, "response");
                C47855m mVar = this.f58709b;
                NetworkException networkException = new NetworkException(hVar.f33702b, hVar.f33703c, this.f58708a.f58703a, this.f58708a.f58704b, null);
                mVar.mo119770a((Throwable) networkException);
            }
        }

        C21943ah(Scene scene, Step step, BaseAccountFlowFragment baseAccountFlowFragment, String str, int i) {
            this.f58703a = scene;
            this.f58704b = step;
            this.f58705c = baseAccountFlowFragment;
            this.f58706d = str;
            this.f58707e = i;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12713h> mVar) {
            C7573i.m23587b(mVar, "it");
            C21944a aVar = new C21944a(this, mVar);
            this.f58705c.mo58337a((C12706a<T>) aVar);
            this.f58705c.mo58343i().mo31180a(this.f58706d, this.f58707e, true, 1, "", (C12859t) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ai */
    static final class C21945ai<T> implements C7326g<C12713h> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58710a;

        C21945ai(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58710a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12713h hVar) {
            C22024h.m73305a(true, this.f58710a.mo58340e(), "change_bind_phone_click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$aj */
    static final class C21946aj<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58711a;

        C21946aj(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58711a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C22024h.m73305a(false, this.f58711a.mo58340e(), "change_bind_phone_click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ak */
    static final class C21947ak<T> implements C47857o<C12734f> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58712a;

        /* renamed from: b */
        final /* synthetic */ String f58713b;

        /* renamed from: c */
        final /* synthetic */ String f58714c;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ak$a */
        public static final class C21948a extends C12721e {

            /* renamed from: a */
            final /* synthetic */ C21947ak f58715a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58716b;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C12734f fVar) {
                C7573i.m23587b(fVar, "response");
                if (fVar.f33711g == null) {
                    C21911a.m73128a(Scene.MODIFY_PASSWORD, this.f58715a.f58712a.mo58339d());
                } else {
                    this.f58716b.mo119769a(fVar);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void onNeedSecureCaptcha(C12734f fVar) {
                C7573i.m23587b(fVar, "response");
                C47855m mVar = this.f58716b;
                NetworkException networkException = new NetworkException(fVar.f33702b, fVar.f33703c, Scene.MODIFY_PASSWORD, this.f58715a.f58712a.mo58339d(), null);
                mVar.mo119770a((Throwable) networkException);
            }

            C21948a(C21947ak akVar, C47855m mVar) {
                this.f58715a = akVar;
                this.f58716b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onError(C12734f fVar, int i) {
                String str;
                C47855m mVar = this.f58716b;
                if (fVar != null) {
                    str = fVar.f33703c;
                } else {
                    str = null;
                }
                NetworkException networkException = new NetworkException(i, str, Scene.MODIFY_PASSWORD, this.f58715a.f58712a.mo58339d(), null);
                mVar.mo119770a((Throwable) networkException);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12734f fVar, String str) {
                C7573i.m23587b(fVar, "response");
                C47855m mVar = this.f58716b;
                NetworkException networkException = new NetworkException(fVar.f33702b, fVar.f33703c, Scene.MODIFY_PASSWORD, this.f58715a.f58712a.mo58339d(), null);
                mVar.mo119770a((Throwable) networkException);
            }
        }

        C21947ak(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2) {
            this.f58712a = baseAccountFlowFragment;
            this.f58713b = str;
            this.f58714c = str2;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12734f> mVar) {
            C7573i.m23587b(mVar, "it");
            C21930d.m73153a(false, "sms_verification", this.f58712a, true);
            C21948a aVar = new C21948a(this, mVar);
            this.f58712a.mo58337a((C12706a<T>) aVar);
            this.f58712a.mo58343i().mo31190a(this.f58713b, this.f58714c, (C12721e) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$al */
    static final class C21949al<T> implements C7326g<C12734f> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58717a;

        C21949al(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58717a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12734f fVar) {
            C21930d.m73152a(false, "sms_verification", this.f58717a);
            C21913a aVar = C21913a.f58632a;
            BaseAccountFlowFragment baseAccountFlowFragment = this.f58717a;
            Scene scene = Scene.MODIFY_PASSWORD;
            Step d = this.f58717a.mo58339d();
            C12898b bVar = fVar.f33711g;
            C7573i.m23582a((Object) bVar, "it.userInfo");
            aVar.mo58367a(baseAccountFlowFragment, scene, d, null, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$am */
    static final class C21950am<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58718a;

        C21950am(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58718a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th instanceof NetworkException) {
                NetworkException networkException = (NetworkException) th;
                C21930d.m73150a(false, networkException.getErrorCode(), "sms_verification", this.f58718a);
                if (this.f58718a.mo58339d() == Step.RESET_PASSWORD_FOR_PHONE) {
                    C21671bd.m72522a(8, 3, (Object) networkException.getErrorMsg());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$an */
    static final class C21951an<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ String f58719a;

        /* renamed from: b */
        final /* synthetic */ int f58720b;

        /* renamed from: c */
        final /* synthetic */ String f58721c;

        /* renamed from: d */
        final /* synthetic */ BaseAccountFlowFragment f58722d;

        /* renamed from: e */
        final /* synthetic */ Scene f58723e;

        /* renamed from: f */
        final /* synthetic */ Step f58724f;

        /* renamed from: g */
        final /* synthetic */ String f58725g;

        /* renamed from: h */
        final /* synthetic */ String f58726h;

        /* renamed from: i */
        final /* synthetic */ int f58727i;

        /* renamed from: j */
        final /* synthetic */ String f58728j;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$an$a */
        public static final class C21952a extends C21335l {

            /* renamed from: a */
            final /* synthetic */ C21951an f58729a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58730b;

            public final void onSuccess(C12710e<C12836s> eVar) {
                C47855m mVar = this.f58730b;
                if (eVar == null) {
                    C7573i.m23580a();
                }
                mVar.mo119769a(eVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12836s> eVar) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58730b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58729a.f58723e, this.f58729a.f58724f, null);
                mVar.mo119770a((Throwable) networkException);
            }

            C21952a(C21951an anVar, C47855m mVar) {
                this.f58729a = anVar;
                this.f58730b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12710e<C12836s> eVar, String str) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58730b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58729a.f58723e, this.f58729a.f58724f, null);
                mVar.mo119770a((Throwable) networkException);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
                if (r1 == null) goto L_0x0013;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p645a.p646a.C12710e<com.bytedance.sdk.account.p662f.p663a.C12836s> r9, int r10) {
                /*
                    r8 = this;
                    org.json.JSONObject r5 = new org.json.JSONObject
                    r5.<init>()
                    java.lang.String r0 = "next_url"
                    if (r9 == 0) goto L_0x0013
                    T r1 = r9.f33709g
                    com.bytedance.sdk.account.f.a.s r1 = (com.bytedance.sdk.account.p662f.p663a.C12836s) r1
                    if (r1 == 0) goto L_0x0013
                    java.lang.String r1 = r1.f34000d
                    if (r1 != 0) goto L_0x0015
                L_0x0013:
                    java.lang.String r1 = ""
                L_0x0015:
                    r5.put(r0, r1)
                    r0 = 2030(0x7ee, float:2.845E-42)
                    if (r10 != r0) goto L_0x003c
                    if (r9 == 0) goto L_0x0035
                    T r0 = r9.f33709g
                    com.bytedance.sdk.account.f.a.s r0 = (com.bytedance.sdk.account.p662f.p663a.C12836s) r0
                    if (r0 == 0) goto L_0x0035
                    org.json.JSONObject r0 = r0.f33964l
                    if (r0 == 0) goto L_0x0035
                    java.lang.String r1 = "data"
                    org.json.JSONObject r0 = r0.optJSONObject(r1)
                    if (r0 == 0) goto L_0x0035
                    java.lang.String r1 = "data"
                    r5.put(r1, r0)
                L_0x0035:
                    java.lang.String r0 = com.p280ss.android.ugc.aweme.account.login.C21578r.f57927o
                    java.lang.String r1 = "/passport/mobile/send_code/v1/"
                    r5.put(r0, r1)
                L_0x003c:
                    io.reactivex.m r6 = r8.f58730b
                    com.ss.android.ugc.aweme.account.login.v2.network.NetworkException r7 = new com.ss.android.ugc.aweme.account.login.v2.network.NetworkException
                    if (r9 == 0) goto L_0x0046
                    java.lang.String r9 = r9.f33703c
                L_0x0044:
                    r2 = r9
                    goto L_0x0048
                L_0x0046:
                    r9 = 0
                    goto L_0x0044
                L_0x0048:
                    com.ss.android.ugc.aweme.account.login.v2.network.e$an r9 = r8.f58729a
                    com.ss.android.ugc.aweme.account.login.v2.base.Scene r3 = r9.f58723e
                    com.ss.android.ugc.aweme.account.login.v2.network.e$an r9 = r8.f58729a
                    com.ss.android.ugc.aweme.account.login.v2.base.Step r4 = r9.f58724f
                    r0 = r7
                    r1 = r10
                    r0.<init>(r1, r2, r3, r4, r5)
                    java.lang.Throwable r7 = (java.lang.Throwable) r7
                    r6.mo119770a(r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e.C21951an.C21952a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }
        }

        C21951an(String str, int i, String str2, BaseAccountFlowFragment baseAccountFlowFragment, Scene scene, Step step, String str3, String str4, int i2, String str5) {
            this.f58719a = str;
            this.f58720b = i;
            this.f58721c = str2;
            this.f58722d = baseAccountFlowFragment;
            this.f58723e = scene;
            this.f58724f = step;
            this.f58725g = str3;
            this.f58726h = str4;
            this.f58727i = i2;
            this.f58728j = str5;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12710e<C12836s>> mVar) {
            C7573i.m23587b(mVar, "emitter");
            C6907h.m21524a("send_sms", (Map) new C21102b().mo56946a("send_method", this.f58719a).mo56944a("send_reason", this.f58720b).mo56946a("enter_method", this.f58721c).mo56946a("enter_from", this.f58722d.mo58340e()).f56672a);
            boolean a = C21241d.m71496a();
            C21952a aVar = new C21952a(this, mVar);
            this.f58722d.mo58337a((C12706a<T>) aVar);
            String str = this.f58728j;
            C12855p pVar = aVar;
            this.f58722d.mo58343i().mo31185a(this.f58725g, "", this.f58720b, 0, this.f58726h, this.f58727i, a ? 1 : 0, "", str, pVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ao */
    static final class C21953ao<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ int f58731a;

        C21953ao(int i) {
            this.f58731a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            C21235f.f57047d.mo57168a(0, this.f58731a, 0, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ap */
    static final class C21954ap<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ int f58732a;

        C21954ap(int i) {
            this.f58732a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                C21235f.f57047d.mo57168a(1, this.f58732a, networkException.getErrorCode(), networkException.getErrorMsg());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$aq */
    static final class C21955aq<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ boolean f58733a;

        /* renamed from: b */
        final /* synthetic */ BaseAccountFlowFragment f58734b;

        /* renamed from: c */
        final /* synthetic */ String f58735c;

        /* renamed from: d */
        final /* synthetic */ String f58736d;

        /* renamed from: e */
        final /* synthetic */ int f58737e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$aq$a */
        public static final class C21956a extends C12847h {

            /* renamed from: a */
            final /* synthetic */ C47855m f58738a;

            C21956a(C47855m mVar) {
                this.f58738a = mVar;
            }

            public final void onSuccess(C12710e<C12825h> eVar) {
                C7573i.m23587b(eVar, "response");
                this.f58738a.mo119769a(eVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12825h> eVar) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58738a;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, Scene.LOGIN, Step.INPUT_EMAIL_FIND_PASSWORD, null);
                mVar.mo119770a((Throwable) networkException);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12710e<C12825h> eVar, String str) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58738a;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, Scene.LOGIN, Step.INPUT_EMAIL_FIND_PASSWORD, null);
                mVar.mo119770a((Throwable) networkException);
            }

            public final void onError(C12710e<C12825h> eVar, int i) {
                int i2;
                String str;
                JSONObject jSONObject;
                C47855m mVar = this.f58738a;
                if (eVar != null) {
                    i2 = eVar.f33702b;
                } else {
                    i2 = -10000;
                }
                if (eVar != null) {
                    str = eVar.f33703c;
                } else {
                    str = null;
                }
                Scene scene = Scene.LOGIN;
                Step step = Step.INPUT_EMAIL_FIND_PASSWORD;
                if (eVar != null) {
                    C12825h hVar = (C12825h) eVar.f33709g;
                    if (hVar != null) {
                        JSONObject jSONObject2 = hVar.f33964l;
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2.getJSONObject("data");
                            NetworkException networkException = new NetworkException(i2, str, scene, step, jSONObject);
                            mVar.mo119770a((Throwable) networkException);
                        }
                    }
                }
                jSONObject = null;
                NetworkException networkException2 = new NetworkException(i2, str, scene, step, jSONObject);
                mVar.mo119770a((Throwable) networkException2);
            }
        }

        C21955aq(boolean z, BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2, int i) {
            this.f58733a = z;
            this.f58734b = baseAccountFlowFragment;
            this.f58735c = str;
            this.f58736d = str2;
            this.f58737e = i;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12710e<C12825h>> mVar) {
            String str;
            String str2;
            C7573i.m23587b(mVar, "it");
            String str3 = "send_email_code";
            C21102b bVar = new C21102b();
            String str4 = "send_method";
            if (this.f58733a) {
                str = "resend";
            } else {
                str = "auto_system";
            }
            C21102b a = bVar.mo56946a(str4, str);
            String str5 = "send_reason";
            if (this.f58734b.mo58339d() == Step.RESET_PASSWORD_FOR_EMAIL) {
                str2 = "reset_password";
            } else {
                str2 = "trigger_verification";
            }
            C6907h.m21524a(str3, (Map) a.mo56946a(str5, str2).f56672a);
            C21956a aVar = new C21956a(mVar);
            this.f58734b.mo58337a((C12706a<T>) aVar);
            this.f58734b.mo58343i().mo31196a(this.f58735c, (String) null, this.f58736d, this.f58737e, (String) null, (Map) null, (String) null, (C12847h) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ar */
    static final class C21957ar<T> implements C47857o<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ String f58739a;

        /* renamed from: b */
        final /* synthetic */ int f58740b;

        /* renamed from: c */
        final /* synthetic */ BaseAccountFlowFragment f58741c;

        /* renamed from: d */
        final /* synthetic */ Step f58742d;

        /* renamed from: e */
        final /* synthetic */ PhoneNumber f58743e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ar$a */
        public static final class C21958a extends C21335l {

            /* renamed from: a */
            final /* synthetic */ C21957ar f58744a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58745b;

            public final void onSuccess(C12710e<C12836s> eVar) {
                super.onSuccess(eVar);
                C47855m mVar = this.f58745b;
                if (eVar == null) {
                    C7573i.m23580a();
                }
                mVar.mo119769a(eVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12836s> eVar) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58745b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, Scene.LOGIN, this.f58744a.f58742d, null);
                mVar.mo119770a((Throwable) networkException);
            }

            C21958a(C21957ar arVar, C47855m mVar) {
                this.f58744a = arVar;
                this.f58745b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12710e<C12836s> eVar, String str) {
                C7573i.m23587b(eVar, "response");
                C7573i.m23587b(str, "captcha");
                C47855m mVar = this.f58745b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, Scene.LOGIN, this.f58744a.f58742d, null);
                mVar.mo119770a((Throwable) networkException);
            }

            public final void onError(C12710e<C12836s> eVar, int i) {
                int i2;
                String str;
                JSONObject jSONObject;
                super.onError(eVar, i);
                C47855m mVar = this.f58745b;
                if (eVar != null) {
                    i2 = eVar.f33702b;
                } else {
                    i2 = -10000;
                }
                if (eVar != null) {
                    str = eVar.f33703c;
                } else {
                    str = null;
                }
                Scene scene = Scene.LOGIN;
                Step step = this.f58744a.f58742d;
                if (eVar != null) {
                    C12836s sVar = (C12836s) eVar.f33709g;
                    if (sVar != null) {
                        JSONObject jSONObject2 = sVar.f33964l;
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2.getJSONObject("data");
                            NetworkException networkException = new NetworkException(i2, str, scene, step, jSONObject);
                            mVar.mo119770a((Throwable) networkException);
                        }
                    }
                }
                jSONObject = null;
                NetworkException networkException2 = new NetworkException(i2, str, scene, step, jSONObject);
                mVar.mo119770a((Throwable) networkException2);
            }
        }

        C21957ar(String str, int i, BaseAccountFlowFragment baseAccountFlowFragment, Step step, PhoneNumber phoneNumber) {
            this.f58739a = str;
            this.f58740b = i;
            this.f58741c = baseAccountFlowFragment;
            this.f58742d = step;
            this.f58743e = phoneNumber;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12710e<C12836s>> mVar) {
            C7573i.m23587b(mVar, "it");
            C6907h.m21524a("send_sms", (Map) new C21102b().mo56946a("send_method", this.f58739a).mo56944a("send_reason", this.f58740b).mo56946a("enter_method", this.f58741c.mo58341f()).mo56946a("enter_from", this.f58741c.mo58340e()).f56672a);
            C21958a aVar = new C21958a(this, mVar);
            this.f58741c.mo58337a((C12706a<T>) aVar);
            this.f58741c.mo58343i().mo31187a(PhoneNumberUtil.m73058a(this.f58743e), (String) null, this.f58740b, (C12855p) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$as */
    static final class C21959as<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ int f58746a;

        C21959as(int i) {
            this.f58746a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            C21235f.f57047d.mo57168a(0, this.f58746a, 0, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$at */
    static final class C21960at<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ int f58747a;

        C21960at(int i) {
            this.f58747a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                C21235f.f57047d.mo57168a(1, this.f58747a, networkException.getErrorCode(), networkException.getMessage());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$au */
    static final class C21961au<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ String f58748a;

        /* renamed from: b */
        final /* synthetic */ int f58749b;

        /* renamed from: c */
        final /* synthetic */ BaseAccountFlowFragment f58750c;

        /* renamed from: d */
        final /* synthetic */ Scene f58751d;

        /* renamed from: e */
        final /* synthetic */ Step f58752e;

        /* renamed from: f */
        final /* synthetic */ String f58753f;

        /* renamed from: g */
        final /* synthetic */ String f58754g;

        /* renamed from: h */
        final /* synthetic */ int f58755h;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$au$a */
        public static final class C21962a extends C21335l {

            /* renamed from: a */
            final /* synthetic */ C21961au f58756a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58757b;

            public final void onSuccess(C12710e<C12836s> eVar) {
                C47855m mVar = this.f58757b;
                if (eVar == null) {
                    C7573i.m23580a();
                }
                mVar.mo119769a(eVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12836s> eVar) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58757b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58756a.f58751d, this.f58756a.f58752e, null);
                mVar.mo119770a((Throwable) networkException);
            }

            C21962a(C21961au auVar, C47855m mVar) {
                this.f58756a = auVar;
                this.f58757b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12710e<C12836s> eVar, String str) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58757b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58756a.f58751d, this.f58756a.f58752e, null);
                mVar.mo119770a((Throwable) networkException);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
                if (r1 == null) goto L_0x0013;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p645a.p646a.C12710e<com.bytedance.sdk.account.p662f.p663a.C12836s> r9, int r10) {
                /*
                    r8 = this;
                    org.json.JSONObject r5 = new org.json.JSONObject
                    r5.<init>()
                    java.lang.String r0 = "next_url"
                    if (r9 == 0) goto L_0x0013
                    T r1 = r9.f33709g
                    com.bytedance.sdk.account.f.a.s r1 = (com.bytedance.sdk.account.p662f.p663a.C12836s) r1
                    if (r1 == 0) goto L_0x0013
                    java.lang.String r1 = r1.f34000d
                    if (r1 != 0) goto L_0x0015
                L_0x0013:
                    java.lang.String r1 = ""
                L_0x0015:
                    r5.put(r0, r1)
                    r0 = 2030(0x7ee, float:2.845E-42)
                    if (r10 != r0) goto L_0x003c
                    if (r9 == 0) goto L_0x0035
                    T r0 = r9.f33709g
                    com.bytedance.sdk.account.f.a.s r0 = (com.bytedance.sdk.account.p662f.p663a.C12836s) r0
                    if (r0 == 0) goto L_0x0035
                    org.json.JSONObject r0 = r0.f33964l
                    if (r0 == 0) goto L_0x0035
                    java.lang.String r1 = "data"
                    org.json.JSONObject r0 = r0.optJSONObject(r1)
                    if (r0 == 0) goto L_0x0035
                    java.lang.String r1 = "data"
                    r5.put(r1, r0)
                L_0x0035:
                    java.lang.String r0 = com.p280ss.android.ugc.aweme.account.login.C21578r.f57927o
                    java.lang.String r1 = "/passport/mobile/send_code/v1/"
                    r5.put(r0, r1)
                L_0x003c:
                    io.reactivex.m r6 = r8.f58757b
                    com.ss.android.ugc.aweme.account.login.v2.network.NetworkException r7 = new com.ss.android.ugc.aweme.account.login.v2.network.NetworkException
                    if (r9 == 0) goto L_0x0046
                    java.lang.String r9 = r9.f33703c
                L_0x0044:
                    r2 = r9
                    goto L_0x0048
                L_0x0046:
                    r9 = 0
                    goto L_0x0044
                L_0x0048:
                    com.ss.android.ugc.aweme.account.login.v2.network.e$au r9 = r8.f58756a
                    com.ss.android.ugc.aweme.account.login.v2.base.Scene r3 = r9.f58751d
                    com.ss.android.ugc.aweme.account.login.v2.network.e$au r9 = r8.f58756a
                    com.ss.android.ugc.aweme.account.login.v2.base.Step r4 = r9.f58752e
                    r0 = r7
                    r1 = r10
                    r0.<init>(r1, r2, r3, r4, r5)
                    java.lang.Throwable r7 = (java.lang.Throwable) r7
                    r6.mo119770a(r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e.C21961au.C21962a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }
        }

        C21961au(String str, int i, BaseAccountFlowFragment baseAccountFlowFragment, Scene scene, Step step, String str2, String str3, int i2) {
            this.f58748a = str;
            this.f58749b = i;
            this.f58750c = baseAccountFlowFragment;
            this.f58751d = scene;
            this.f58752e = step;
            this.f58753f = str2;
            this.f58754g = str3;
            this.f58755h = i2;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12710e<C12836s>> mVar) {
            C7573i.m23587b(mVar, "emitter");
            C6907h.m21524a("send_sms", (Map) new C21102b().mo56946a("send_method", this.f58748a).mo56944a("send_reason", this.f58749b).mo56946a("enter_method", this.f58750c.mo58341f()).mo56946a("enter_from", this.f58750c.mo58340e()).f56672a);
            boolean a = C21241d.m71496a();
            C21962a aVar = new C21962a(this, mVar);
            this.f58750c.mo58337a((C12706a<T>) aVar);
            this.f58750c.mo58343i().mo31184a(this.f58753f, "", this.f58749b, 0, this.f58754g, this.f58755h, a ? 1 : 0, (C12855p) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$av */
    static final class C21963av<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ int f58758a;

        /* renamed from: b */
        final /* synthetic */ String f58759b;

        /* renamed from: c */
        final /* synthetic */ Step f58760c;

        /* renamed from: d */
        final /* synthetic */ BaseAccountFlowFragment f58761d;

        C21963av(int i, String str, Step step, BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58758a = i;
            this.f58759b = str;
            this.f58760c = step;
            this.f58761d = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                C21235f.f57047d.mo57169a(1, this.f58758a, networkException.getErrorCode(), networkException.getMessage(), this.f58759b);
                if (this.f58760c == Step.INPUT_PHONE_SIGN_UP) {
                    C22127a.m73568a(Integer.valueOf(networkException.getErrorCode()), this.f58761d.mo58341f());
                    return;
                }
                if (this.f58760c == Step.INPUT_PHONE_LOGIN) {
                    C22118a.m73550a(false, this.f58761d.mo58341f());
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$aw */
    static final class C21964aw<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ int f58762a;

        /* renamed from: b */
        final /* synthetic */ String f58763b;

        C21964aw(int i, String str) {
            this.f58762a = i;
            this.f58763b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            C21235f.f57047d.mo57169a(0, this.f58762a, 0, "", this.f58763b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ax */
    static final class C21965ax<T> implements C47857o<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ int f58764a;

        /* renamed from: b */
        final /* synthetic */ String f58765b;

        /* renamed from: c */
        final /* synthetic */ Scene f58766c;

        /* renamed from: d */
        final /* synthetic */ Step f58767d;

        /* renamed from: e */
        final /* synthetic */ BaseAccountFlowFragment f58768e;

        /* renamed from: f */
        final /* synthetic */ String f58769f;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ax$a */
        public static final class C21966a extends C12855p {

            /* renamed from: a */
            final /* synthetic */ C21965ax f58770a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58771b;

            public final void onSuccess(C12710e<C12836s> eVar) {
                C7573i.m23587b(eVar, "response");
                this.f58771b.mo119769a(eVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12836s> eVar) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58771b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58770a.f58766c, this.f58770a.f58767d, null);
                mVar.mo119770a((Throwable) networkException);
            }

            C21966a(C21965ax axVar, C47855m mVar) {
                this.f58770a = axVar;
                this.f58771b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12710e<C12836s> eVar, String str) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58771b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58770a.f58766c, this.f58770a.f58767d, null);
                mVar.mo119770a((Throwable) networkException);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
                if (r9 == null) goto L_0x0025;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p645a.p646a.C12710e<com.bytedance.sdk.account.p662f.p663a.C12836s> r9, int r10) {
                /*
                    r8 = this;
                    io.reactivex.m r0 = r8.f58771b
                    if (r9 == 0) goto L_0x0008
                    java.lang.String r1 = r9.f33703c
                L_0x0006:
                    r4 = r1
                    goto L_0x000a
                L_0x0008:
                    r1 = 0
                    goto L_0x0006
                L_0x000a:
                    com.ss.android.ugc.aweme.account.login.v2.network.e$ax r1 = r8.f58770a
                    com.ss.android.ugc.aweme.account.login.v2.base.Scene r5 = r1.f58766c
                    com.ss.android.ugc.aweme.account.login.v2.network.e$ax r1 = r8.f58770a
                    com.ss.android.ugc.aweme.account.login.v2.base.Step r6 = r1.f58767d
                    org.json.JSONObject r7 = new org.json.JSONObject
                    r7.<init>()
                    java.lang.String r1 = "next_url"
                    if (r9 == 0) goto L_0x0025
                    T r9 = r9.f33709g
                    com.bytedance.sdk.account.f.a.s r9 = (com.bytedance.sdk.account.p662f.p663a.C12836s) r9
                    if (r9 == 0) goto L_0x0025
                    java.lang.String r9 = r9.f34000d
                    if (r9 != 0) goto L_0x0027
                L_0x0025:
                    java.lang.String r9 = ""
                L_0x0027:
                    r7.put(r1, r9)
                    com.ss.android.ugc.aweme.account.login.v2.network.NetworkException r9 = new com.ss.android.ugc.aweme.account.login.v2.network.NetworkException
                    r2 = r9
                    r3 = r10
                    r2.<init>(r3, r4, r5, r6, r7)
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    r0.mo119770a(r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e.C21965ax.C21966a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }
        }

        C21965ax(int i, String str, Scene scene, Step step, BaseAccountFlowFragment baseAccountFlowFragment, String str2) {
            this.f58764a = i;
            this.f58765b = str;
            this.f58766c = scene;
            this.f58767d = step;
            this.f58768e = baseAccountFlowFragment;
            this.f58769f = str2;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12710e<C12836s>> mVar) {
            C7573i.m23587b(mVar, "it");
            C6907h.m21524a("send_voice_verification_code", (Map) new C21102b().mo56946a("send_reason", String.valueOf(this.f58764a)).mo56946a("send_method", this.f58765b).f56672a);
            C21966a aVar = new C21966a(this, mVar);
            this.f58768e.mo58337a((C12706a<T>) aVar);
            this.f58768e.mo58343i().mo31214b(this.f58769f, "", this.f58764a, (C12855p) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ay */
    static final class C21967ay<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ int f58772a;

        C21967ay(int i) {
            this.f58772a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                C21235f.f57047d.mo57168a(1, this.f58772a, networkException.getErrorCode(), networkException.getMessage());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$az */
    static final class C21968az<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ int f58773a;

        /* renamed from: b */
        final /* synthetic */ BaseAccountFlowFragment f58774b;

        /* renamed from: c */
        final /* synthetic */ String f58775c;

        C21968az(int i, BaseAccountFlowFragment baseAccountFlowFragment, String str) {
            this.f58773a = i;
            this.f58774b = baseAccountFlowFragment;
            this.f58775c = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            C21235f.f57047d.mo57168a(0, this.f58773a, 0, "");
            FragmentActivity activity = this.f58774b.getActivity();
            if (activity != null) {
                Boolean.valueOf(!activity.isFinishing());
            }
            FragmentActivity activity2 = this.f58774b.getActivity();
            if (activity2 == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity2, "fragment.activity!!");
            new C10741a(activity2).mo25653a(activity2.getString(R.string.adq, new Object[]{this.f58775c})).mo25650a((int) R.string.ag4, (OnClickListener) null).mo25656a().mo25638b().setCancelable(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$b */
    static final class C21969b<T> implements C7326g<C12710e<C12819b>> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58776a;

        C21969b(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58776a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12819b> eVar) {
            C21229c.f57037d.mo57159a(0, "bindPhone", 0, "");
            C22024h.m73305a(true, this.f58776a.mo58340e(), "first_bind_phone_click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$ba */
    static final class C21970ba<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ String f58777a;

        /* renamed from: b */
        final /* synthetic */ int f58778b;

        /* renamed from: c */
        final /* synthetic */ BaseAccountFlowFragment f58779c;

        /* renamed from: d */
        final /* synthetic */ PhoneNumber f58780d;

        /* renamed from: e */
        final /* synthetic */ String f58781e;

        /* renamed from: f */
        final /* synthetic */ int f58782f;

        /* renamed from: g */
        final /* synthetic */ Scene f58783g;

        /* renamed from: h */
        final /* synthetic */ Step f58784h;

        C21970ba(String str, int i, BaseAccountFlowFragment baseAccountFlowFragment, PhoneNumber phoneNumber, String str2, int i2, Scene scene, Step step) {
            this.f58777a = str;
            this.f58778b = i;
            this.f58779c = baseAccountFlowFragment;
            this.f58780d = phoneNumber;
            this.f58781e = str2;
            this.f58782f = i2;
            this.f58783g = scene;
            this.f58784h = step;
        }

        /* renamed from: a */
        public final void mo58382a(final C47855m<C12710e<C12836s>> mVar) {
            C7573i.m23587b(mVar, "emitter");
            C6907h.m21524a("send_whatsapp_code", (Map) new C21102b().mo56946a("send_method", this.f58777a).mo56944a("send_reason", this.f58778b).mo56946a("enter_method", this.f58779c.mo58341f()).mo56946a("enter_from", this.f58779c.mo58340e()).f56672a);
            C21113a aVar = C21112b.f56686f;
            Context context = this.f58779c.getContext();
            if (context == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) context, "fragment.context!!");
            String a = PhoneNumberUtil.m73058a(this.f58780d);
            C7573i.m23582a((Object) a, "PhoneNumberUtil.formatNumber(phoneNumber)");
            int i = this.f58778b;
            String str = this.f58781e;
            int i2 = this.f58782f;
            boolean a2 = C21241d.m71496a();
            aVar.mo56964a(context, a, "", i, 0, str, i2, a2 ? 1 : 0, new C12855p(this) {

                /* renamed from: a */
                final /* synthetic */ C21970ba f58785a;

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNeedSecureCaptcha(C12710e<C12836s> eVar) {
                    C7573i.m23587b(eVar, "response");
                    C47855m mVar = mVar;
                    NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58785a.f58783g, this.f58785a.f58784h, null);
                    mVar.mo119770a((Throwable) networkException);
                }

                public final void onSuccess(C12710e<C12836s> eVar) {
                    if (eVar != null) {
                        mVar.mo119769a(eVar);
                        return;
                    }
                    C47855m mVar = mVar;
                    NetworkException networkException = new NetworkException(-1, "no data", this.f58785a.f58783g, this.f58785a.f58784h, null);
                    mVar.mo119770a((Throwable) networkException);
                }

                {
                    this.f58785a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNeedCaptcha(C12710e<C12836s> eVar, String str) {
                    C7573i.m23587b(eVar, "response");
                    C47855m mVar = mVar;
                    NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58785a.f58783g, this.f58785a.f58784h, null);
                    mVar.mo119770a((Throwable) networkException);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
                    if (r1 == null) goto L_0x0013;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onError(com.bytedance.sdk.account.p645a.p646a.C12710e<com.bytedance.sdk.account.p662f.p663a.C12836s> r9, int r10) {
                    /*
                        r8 = this;
                        org.json.JSONObject r5 = new org.json.JSONObject
                        r5.<init>()
                        java.lang.String r0 = "next_url"
                        if (r9 == 0) goto L_0x0013
                        T r1 = r9.f33709g
                        com.bytedance.sdk.account.f.a.s r1 = (com.bytedance.sdk.account.p662f.p663a.C12836s) r1
                        if (r1 == 0) goto L_0x0013
                        java.lang.String r1 = r1.f34000d
                        if (r1 != 0) goto L_0x0015
                    L_0x0013:
                        java.lang.String r1 = ""
                    L_0x0015:
                        r5.put(r0, r1)
                        r0 = 2030(0x7ee, float:2.845E-42)
                        if (r10 != r0) goto L_0x003c
                        if (r9 == 0) goto L_0x0035
                        T r0 = r9.f33709g
                        com.bytedance.sdk.account.f.a.s r0 = (com.bytedance.sdk.account.p662f.p663a.C12836s) r0
                        if (r0 == 0) goto L_0x0035
                        org.json.JSONObject r0 = r0.f33964l
                        if (r0 == 0) goto L_0x0035
                        java.lang.String r1 = "data"
                        org.json.JSONObject r0 = r0.optJSONObject(r1)
                        if (r0 == 0) goto L_0x0035
                        java.lang.String r1 = "data"
                        r5.put(r1, r0)
                    L_0x0035:
                        java.lang.String r0 = com.p280ss.android.ugc.aweme.account.login.C21578r.f57927o
                        java.lang.String r1 = "/passport/mobile/send_code/v1/"
                        r5.put(r0, r1)
                    L_0x003c:
                        io.reactivex.m r6 = r13
                        com.ss.android.ugc.aweme.account.login.v2.network.NetworkException r7 = new com.ss.android.ugc.aweme.account.login.v2.network.NetworkException
                        if (r9 == 0) goto L_0x0046
                        java.lang.String r9 = r9.f33703c
                    L_0x0044:
                        r2 = r9
                        goto L_0x0048
                    L_0x0046:
                        r9 = 0
                        goto L_0x0044
                    L_0x0048:
                        com.ss.android.ugc.aweme.account.login.v2.network.e$ba r9 = r8.f58785a
                        com.ss.android.ugc.aweme.account.login.v2.base.Scene r3 = r9.f58783g
                        com.ss.android.ugc.aweme.account.login.v2.network.e$ba r9 = r8.f58785a
                        com.ss.android.ugc.aweme.account.login.v2.base.Step r4 = r9.f58784h
                        r0 = r7
                        r1 = r10
                        r0.<init>(r1, r2, r3, r4, r5)
                        java.lang.Throwable r7 = (java.lang.Throwable) r7
                        r6.mo119770a(r7)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e.C21970ba.C219711.onError(com.bytedance.sdk.account.a.a.e, int):void");
                }
            }).mo31357d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$bb */
    static final class C21972bb<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ int f58787a;

        /* renamed from: b */
        final /* synthetic */ Step f58788b;

        /* renamed from: c */
        final /* synthetic */ BaseAccountFlowFragment f58789c;

        C21972bb(int i, Step step, BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58787a = i;
            this.f58788b = step;
            this.f58789c = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                C21235f.f57047d.mo57170b(1, this.f58787a, networkException.getErrorCode(), networkException.getMessage());
                if (this.f58788b == Step.INPUT_PHONE_SIGN_UP) {
                    C22127a.m73568a(Integer.valueOf(networkException.getErrorCode()), this.f58789c.mo58341f());
                    return;
                }
                if (this.f58788b == Step.INPUT_PHONE_LOGIN) {
                    C22118a.m73550a(false, this.f58789c.mo58341f());
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$bc */
    static final class C21973bc<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ int f58790a;

        C21973bc(int i) {
            this.f58790a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            C21235f.f57047d.mo57170b(0, this.f58790a, 0, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$bd */
    static final class C21974bd<T> implements C47857o<C12710e<C12879a>> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58791a;

        /* renamed from: b */
        final /* synthetic */ String f58792b;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$bd$a */
        public static final class C21975a extends C12856q {

            /* renamed from: a */
            final /* synthetic */ C21974bd f58793a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58794b;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onResponse(C12710e<C12879a> eVar) {
                if (eVar == null) {
                    C47855m mVar = this.f58794b;
                    NetworkException networkException = new NetworkException(-1, "no data", Scene.SIGN_UP, this.f58793a.f58791a.mo58339d(), null);
                    mVar.mo119770a((Throwable) networkException);
                } else if (eVar.f33702b != 0) {
                    C47855m mVar2 = this.f58794b;
                    NetworkException networkException2 = new NetworkException(eVar.f33702b, eVar.f33703c, Scene.SIGN_UP, this.f58793a.f58791a.mo58339d(), null);
                    mVar2.mo119770a((Throwable) networkException2);
                } else {
                    this.f58794b.mo119769a(eVar);
                }
            }

            C21975a(C21974bd bdVar, C47855m mVar) {
                this.f58793a = bdVar;
                this.f58794b = mVar;
            }
        }

        C21974bd(BaseAccountFlowFragment baseAccountFlowFragment, String str) {
            this.f58791a = baseAccountFlowFragment;
            this.f58792b = str;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12710e<C12879a>> mVar) {
            C7573i.m23587b(mVar, "it");
            C21975a aVar = new C21975a(this, mVar);
            this.f58791a.mo58337a((C12706a<T>) aVar);
            this.f58791a.mo58343i().mo31193a(this.f58792b, (String) null, (C12856q) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$be */
    static final class C21976be<T> implements C7326g<C12710e<C12879a>> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58795a;

        C21976be(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58795a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12879a> eVar) {
            C21930d.m73154a(true, "phone", "register", this.f58795a.mo58341f(), 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$bf */
    static final class C21977bf<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58796a;

        C21977bf(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58796a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            String str = "phone";
            String str2 = "register";
            String f = this.f58796a.mo58341f();
            if (th != null) {
                C21930d.m73154a(false, str, str2, f, ((NetworkException) th).getErrorCode());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$bg */
    static final class C21978bg<T> implements C47857o<C12734f> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58797a;

        /* renamed from: b */
        final /* synthetic */ String f58798b;

        /* renamed from: c */
        final /* synthetic */ String f58799c;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$bg$a */
        public static final class C21979a extends C12721e {

            /* renamed from: a */
            final /* synthetic */ C21978bg f58800a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58801b;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C12734f fVar) {
                C7573i.m23587b(fVar, "response");
                this.f58801b.mo119769a(fVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void onNeedSecureCaptcha(C12734f fVar) {
                C7573i.m23587b(fVar, "response");
                C47855m mVar = this.f58801b;
                NetworkException networkException = new NetworkException(fVar.f33702b, fVar.f33703c, Scene.MODIFY_PASSWORD, this.f58800a.f58797a.mo58339d(), null);
                mVar.mo119770a((Throwable) networkException);
            }

            C21979a(C21978bg bgVar, C47855m mVar) {
                this.f58800a = bgVar;
                this.f58801b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onError(C12734f fVar, int i) {
                C7573i.m23587b(fVar, "response");
                C47855m mVar = this.f58801b;
                NetworkException networkException = new NetworkException(i, fVar.f33703c, Scene.MODIFY_PASSWORD, this.f58800a.f58797a.mo58339d(), null);
                mVar.mo119770a((Throwable) networkException);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12734f fVar, String str) {
                C7573i.m23587b(fVar, "response");
                C47855m mVar = this.f58801b;
                NetworkException networkException = new NetworkException(fVar.f33702b, fVar.f33703c, Scene.MODIFY_PASSWORD, this.f58800a.f58797a.mo58339d(), null);
                mVar.mo119770a((Throwable) networkException);
            }
        }

        C21978bg(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2) {
            this.f58797a = baseAccountFlowFragment;
            this.f58798b = str;
            this.f58799c = str2;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12734f> mVar) {
            C7573i.m23587b(mVar, "it");
            C21930d.m73153a(false, "email", this.f58797a, true);
            C21979a aVar = new C21979a(this, mVar);
            this.f58797a.mo58337a((C12706a<T>) aVar);
            C12728d i = this.f58797a.mo58343i();
            String str = this.f58798b;
            if (str != null) {
                i.mo31211a(C7634n.m23762b(str).toString(), this.f58799c, (Map) null, (String) null, (C12721e) aVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$bh */
    static final class C21980bh<T> implements C7326g<C12734f> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58802a;

        C21980bh(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58802a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12734f fVar) {
            C21930d.m73154a(true, "email", "reset_password", this.f58802a.mo58341f(), 0);
            C21930d.m73152a(false, "email", this.f58802a);
            C21913a aVar = C21913a.f58632a;
            BaseAccountFlowFragment baseAccountFlowFragment = this.f58802a;
            Scene scene = Scene.MODIFY_PASSWORD;
            Step d = this.f58802a.mo58339d();
            C12898b bVar = fVar.f33711g;
            C7573i.m23582a((Object) bVar, "it.userInfo");
            aVar.mo58367a(baseAccountFlowFragment, scene, d, null, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$bi */
    static final class C21981bi<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58803a;

        C21981bi(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58803a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                C21930d.m73154a(false, "email", "reset_password", this.f58803a.mo58341f(), networkException.getErrorCode());
                C21930d.m73150a(false, networkException.getErrorCode(), "email", this.f58803a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$bj */
    static final class C21982bj<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58804a;

        /* renamed from: b */
        final /* synthetic */ Scene f58805b;

        /* renamed from: c */
        final /* synthetic */ Step f58806c;

        /* renamed from: d */
        final /* synthetic */ String f58807d;

        /* renamed from: e */
        final /* synthetic */ String f58808e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$bj$a */
        public static final class C21983a extends C12846g {

            /* renamed from: a */
            final /* synthetic */ C21982bj f58809a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58810b;

            public final void onSuccess(C12710e<C12824g> eVar) {
                C7573i.m23587b(eVar, "response");
                this.f58810b.mo119769a(eVar.f33709g);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12824g> eVar) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58810b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58809a.f58805b, this.f58809a.f58806c, null);
                mVar.mo119770a((Throwable) networkException);
            }

            C21983a(C21982bj bjVar, C47855m mVar) {
                this.f58809a = bjVar;
                this.f58810b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12710e<C12824g> eVar, String str) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58810b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58809a.f58805b, this.f58809a.f58806c, null);
                mVar.mo119770a((Throwable) networkException);
            }

            public final void onError(C12710e<C12824g> eVar, int i) {
                String str;
                JSONObject jSONObject;
                C47855m mVar = this.f58810b;
                if (eVar != null) {
                    str = eVar.f33703c;
                } else {
                    str = null;
                }
                Scene scene = this.f58809a.f58805b;
                Step step = this.f58809a.f58806c;
                if (eVar != null) {
                    C12824g gVar = (C12824g) eVar.f33709g;
                    if (gVar != null) {
                        JSONObject jSONObject2 = gVar.f33964l;
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2.getJSONObject("data");
                            NetworkException networkException = new NetworkException(i, str, scene, step, jSONObject);
                            mVar.mo119770a((Throwable) networkException);
                        }
                    }
                }
                jSONObject = null;
                NetworkException networkException2 = new NetworkException(i, str, scene, step, jSONObject);
                mVar.mo119770a((Throwable) networkException2);
            }
        }

        C21982bj(BaseAccountFlowFragment baseAccountFlowFragment, Scene scene, Step step, String str, String str2) {
            this.f58804a = baseAccountFlowFragment;
            this.f58805b = scene;
            this.f58806c = step;
            this.f58807d = str;
            this.f58808e = str2;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12824g> mVar) {
            C7573i.m23587b(mVar, "it");
            C21930d.m73153a(true, "email", this.f58804a, false);
            C21983a aVar = new C21983a(this, mVar);
            this.f58804a.mo58337a((C12706a<T>) aVar);
            this.f58804a.mo58343i().mo31189a(this.f58807d, this.f58808e, 1, (Map) null, (String) null, (C12846g) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$bk */
    static final class C21984bk<T> implements C7326g<C12824g> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58811a;

        C21984bk(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58811a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12824g gVar) {
            C21231d.f57039b.mo57161a(0, 0, "");
            C21930d.m73147a(0, "register", this.f58811a.mo58341f());
            C21930d.m73152a(true, "email", this.f58811a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$bl */
    static final class C21985bl<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58812a;

        C21985bl(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58812a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                C21231d.f57039b.mo57161a(1, networkException.getErrorCode(), networkException.getErrorMsg());
                C21930d.m73147a(networkException.getErrorCode(), "register", this.f58812a.mo58341f());
                C21930d.m73150a(true, networkException.getErrorCode(), "email", this.f58812a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$c */
    static final class C21986c<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58813a;

        C21986c(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58813a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                C21229c.f57037d.mo57159a(1, "bindPhone", networkException.getErrorCode(), networkException.getErrorMsg());
                C22024h.m73305a(false, this.f58813a.mo58340e(), "first_bind_phone_click");
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$d */
    static final class C21987d<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ Scene f58814a;

        /* renamed from: b */
        final /* synthetic */ Step f58815b;

        /* renamed from: c */
        final /* synthetic */ BaseAccountFlowFragment f58816c;

        /* renamed from: d */
        final /* synthetic */ String f58817d;

        /* renamed from: e */
        final /* synthetic */ String f58818e;

        /* renamed from: f */
        final /* synthetic */ String f58819f;

        /* renamed from: g */
        final /* synthetic */ ArrayMap f58820g;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$d$a */
        public static final class C21988a extends C12842c {

            /* renamed from: a */
            final /* synthetic */ C21987d f58821a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58822b;

            public final void onSuccess(C12710e<C12820c> eVar) {
                C7573i.m23587b(eVar, "response");
                this.f58822b.mo119769a(eVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12820c> eVar) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58822b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58821a.f58814a, this.f58821a.f58815b, null);
                mVar.mo119770a((Throwable) networkException);
            }

            C21988a(C21987d dVar, C47855m mVar) {
                this.f58821a = dVar;
                this.f58822b = mVar;
            }

            public final void onError(C12710e<C12820c> eVar, int i) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58822b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58821a.f58814a, this.f58821a.f58815b, null);
                mVar.mo119770a((Throwable) networkException);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12710e<C12820c> eVar, String str) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58822b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58821a.f58814a, this.f58821a.f58815b, null);
                mVar.mo119770a((Throwable) networkException);
            }
        }

        C21987d(Scene scene, Step step, BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2, String str3, ArrayMap arrayMap) {
            this.f58814a = scene;
            this.f58815b = step;
            this.f58816c = baseAccountFlowFragment;
            this.f58817d = str;
            this.f58818e = str2;
            this.f58819f = str3;
            this.f58820g = arrayMap;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12710e<C12820c>> mVar) {
            C7573i.m23587b(mVar, "it");
            C21988a aVar = new C21988a(this, mVar);
            this.f58816c.mo58337a((C12706a<T>) aVar);
            this.f58816c.mo58343i().mo31210a(this.f58817d, this.f58818e, "", this.f58819f, (Map) this.f58820g, (C12842c) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$e */
    static final class C21989e<T> implements C7326g<C12710e<C12820c>> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58823a;

        C21989e(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58823a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12820c> eVar) {
            C21229c.f57037d.mo57160b(0, "changePhone", 0, "");
            C22024h.m73305a(true, this.f58823a.mo58340e(), "rebind_phone_click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$f */
    static final class C21990f<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58824a;

        C21990f(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58824a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                C21229c.f57037d.mo57160b(1, "changePhone", networkException.getErrorCode(), networkException.getErrorMsg());
                C22024h.m73305a(false, this.f58824a.mo58340e(), "rebind_phone_click");
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$g */
    static final class C21991g<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ Scene f58825a;

        /* renamed from: b */
        final /* synthetic */ Step f58826b;

        /* renamed from: c */
        final /* synthetic */ BaseAccountFlowFragment f58827c;

        /* renamed from: d */
        final /* synthetic */ PhoneNumber f58828d;

        /* renamed from: e */
        final /* synthetic */ String f58829e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$g$a */
        public static final class C21992a extends C12717a {

            /* renamed from: a */
            final /* synthetic */ C21991g f58830a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58831b;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C12729a aVar) {
                C7573i.m23587b(aVar, "response");
                this.f58831b.mo119769a(aVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void onNeedSecureCaptcha(C12729a aVar) {
                C7573i.m23587b(aVar, "response");
                C47855m mVar = this.f58831b;
                NetworkException networkException = new NetworkException(aVar.f33702b, aVar.f33703c, this.f58830a.f58825a, this.f58830a.f58826b, null);
                mVar.mo119770a((Throwable) networkException);
            }

            C21992a(C21991g gVar, C47855m mVar) {
                this.f58830a = gVar;
                this.f58831b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onError(C12729a aVar, int i) {
                String str;
                C47855m mVar = this.f58831b;
                if (aVar != null) {
                    str = aVar.f33703c;
                } else {
                    str = null;
                }
                NetworkException networkException = new NetworkException(i, str, this.f58830a.f58825a, this.f58830a.f58826b, null);
                mVar.mo119770a((Throwable) networkException);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12729a aVar, String str) {
                C7573i.m23587b(aVar, "response");
                C47855m mVar = this.f58831b;
                NetworkException networkException = new NetworkException(aVar.f33702b, aVar.f33703c, this.f58830a.f58825a, this.f58830a.f58826b, null);
                mVar.mo119770a((Throwable) networkException);
            }
        }

        C21991g(Scene scene, Step step, BaseAccountFlowFragment baseAccountFlowFragment, PhoneNumber phoneNumber, String str) {
            this.f58825a = scene;
            this.f58826b = step;
            this.f58827c = baseAccountFlowFragment;
            this.f58828d = phoneNumber;
            this.f58829e = str;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12729a> mVar) {
            C7573i.m23587b(mVar, "it");
            C21992a aVar = new C21992a(this, mVar);
            this.f58827c.mo58337a((C12706a<T>) aVar);
            this.f58827c.mo58343i().mo31186a(PhoneNumberUtil.m73058a(this.f58828d), this.f58829e, 4, (C12717a) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$h */
    static final class C21993h<T> implements C7326g<C12729a> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58832a;

        C21993h(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58832a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12729a aVar) {
            C21930d.m73151a(true, this.f58832a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$i */
    static final class C21994i<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58833a;

        C21994i(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58833a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th instanceof NetworkException) {
                C21930d.m73151a(false, this.f58833a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$j */
    static final class C21995j<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ Scene f58834a;

        /* renamed from: b */
        final /* synthetic */ Step f58835b;

        /* renamed from: c */
        final /* synthetic */ BaseAccountFlowFragment f58836c;

        /* renamed from: d */
        final /* synthetic */ String f58837d;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$j$a */
        public static final class C21996a extends C12844e {

            /* renamed from: a */
            final /* synthetic */ C21995j f58838a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58839b;

            public final void onSuccess(C12710e<C12822e> eVar) {
                C7573i.m23587b(eVar, "response");
                this.f58839b.mo119769a(eVar.f33709g);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12822e> eVar) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58839b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58838a.f58834a, this.f58838a.f58835b, null);
                mVar.mo119770a((Throwable) networkException);
            }

            C21996a(C21995j jVar, C47855m mVar) {
                this.f58838a = jVar;
                this.f58839b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12710e<C12822e> eVar, String str) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58839b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, this.f58838a.f58834a, this.f58838a.f58835b, null);
                mVar.mo119770a((Throwable) networkException);
            }

            public final void onError(C12710e<C12822e> eVar, int i) {
                int i2;
                String str;
                C47855m mVar = this.f58839b;
                if (eVar != null) {
                    i2 = eVar.f33702b;
                } else {
                    i2 = -10000;
                }
                if (eVar != null) {
                    str = eVar.f33703c;
                } else {
                    str = null;
                }
                NetworkException networkException = new NetworkException(i2, str, this.f58838a.f58834a, this.f58838a.f58835b, null);
                mVar.mo119770a((Throwable) networkException);
            }
        }

        C21995j(Scene scene, Step step, BaseAccountFlowFragment baseAccountFlowFragment, String str) {
            this.f58834a = scene;
            this.f58835b = step;
            this.f58836c = baseAccountFlowFragment;
            this.f58837d = str;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12822e> mVar) {
            C7573i.m23587b(mVar, "emitter");
            C21996a aVar = new C21996a(this, mVar);
            this.f58836c.mo58337a((C12706a<T>) aVar);
            this.f58836c.mo58343i().mo31213a(this.f58837d, C7507ae.m23387a(), "", (C12844e) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$k */
    static final class C21997k<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58840a;

        C21997k(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58840a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                C22074a.m73428a(Integer.valueOf(networkException.getErrorCode()), this.f58840a.mo58341f());
                C21232a aVar = C21231d.f57039b;
                int errorCode = networkException.getErrorCode();
                StringBuilder sb = new StringBuilder("CheckEmail:");
                sb.append(networkException.getErrorMsg());
                aVar.mo57161a(1, errorCode, sb.toString());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$l */
    static final class C21998l<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58841a;

        /* renamed from: b */
        final /* synthetic */ String f58842b;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$l$a */
        public static final class C21999a extends C12718b {

            /* renamed from: a */
            final /* synthetic */ C21998l f58843a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58844b;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C12730b bVar) {
                C7573i.m23587b(bVar, "response");
                this.f58844b.mo119769a(bVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void onNeedSecureCaptcha(C12730b bVar) {
                C7573i.m23587b(bVar, "response");
                C47855m mVar = this.f58844b;
                NetworkException networkException = new NetworkException(bVar.f33702b, bVar.f33703c, Scene.SIGN_UP, this.f58843a.f58841a.mo58339d(), null);
                mVar.mo119770a((Throwable) networkException);
            }

            C21999a(C21998l lVar, C47855m mVar) {
                this.f58843a = lVar;
                this.f58844b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onError(C12730b bVar, int i) {
                C7573i.m23587b(bVar, "response");
                C47855m mVar = this.f58844b;
                NetworkException networkException = new NetworkException(i, bVar.f33703c, Scene.SIGN_UP, this.f58843a.f58841a.mo58339d(), null);
                mVar.mo119770a((Throwable) networkException);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12730b bVar, String str) {
                C7573i.m23587b(bVar, "response");
                C47855m mVar = this.f58844b;
                NetworkException networkException = new NetworkException(bVar.f33702b, bVar.f33703c, Scene.SIGN_UP, this.f58843a.f58841a.mo58339d(), null);
                mVar.mo119770a((Throwable) networkException);
            }
        }

        C21998l(BaseAccountFlowFragment baseAccountFlowFragment, String str) {
            this.f58841a = baseAccountFlowFragment;
            this.f58842b = str;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12730b> mVar) {
            C7573i.m23587b(mVar, "it");
            C21999a aVar = new C21999a(this, mVar);
            this.f58841a.mo58337a((C12706a<T>) aVar);
            this.f58841a.mo58343i().mo31182a(this.f58842b, (C12718b) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$m */
    static final class C22000m<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58845a;

        C22000m(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58845a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            switch (C22018f.f58880a[this.f58845a.mo58339d().ordinal()]) {
                case 1:
                    if (th != null) {
                        NetworkException networkException = (NetworkException) th;
                        C21930d.m73154a(false, "phone", "reset_password", this.f58845a.mo58341f(), networkException.getErrorCode());
                        C21930d.m73153a(false, "phone", this.f58845a, false);
                        C21930d.m73150a(false, networkException.getErrorCode(), "phone", this.f58845a);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
                case 2:
                    if (th != null) {
                        NetworkException networkException2 = (NetworkException) th;
                        C21930d.m73154a(false, "email", "register", this.f58845a.mo58341f(), networkException2.getErrorCode());
                        C21930d.m73153a(false, "email", this.f58845a, false);
                        C21930d.m73150a(true, networkException2.getErrorCode(), "email", this.f58845a);
                        break;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
                    }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$n */
    static final class C22001n<T, R> implements C7327h<String, C7704b<C21929c>> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58846a;

        C22001n(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58846a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7704b<C21929c> apply(final String str) {
            C7573i.m23587b(str, "response");
            return new C7704b<C21929c>(this) {

                /* renamed from: a */
                final /* synthetic */ C22001n f58847a;

                {
                    this.f58847a = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
                /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo19155a(org.p361a.C48293c<? super com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21929c> r9) {
                    /*
                        r8 = this;
                        com.ss.android.ugc.aweme.account.network.c r0 = com.p280ss.android.ugc.aweme.account.network.C22208c.f59306b
                        com.google.gson.e r0 = r0.mo58581a()
                        java.lang.String r1 = r2
                        java.lang.Class<com.ss.android.ugc.aweme.account.login.v2.network.c> r2 = com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21929c.class
                        java.lang.Object r0 = r0.mo15974a(r1, r2)
                        com.ss.android.ugc.aweme.account.login.v2.network.c r0 = (com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21929c) r0
                        java.lang.String r1 = r0.f58665a
                        java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                        java.lang.String r2 = "success"
                        java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                        boolean r1 = android.text.TextUtils.equals(r1, r2)
                        if (r1 == 0) goto L_0x0022
                        r9.onNext(r0)
                        goto L_0x0052
                    L_0x0022:
                        com.ss.android.ugc.aweme.account.login.v2.network.NetworkException r1 = new com.ss.android.ugc.aweme.account.login.v2.network.NetworkException
                        com.ss.android.ugc.aweme.account.login.v2.network.b r2 = r0.f58666b
                        if (r2 == 0) goto L_0x0032
                        java.lang.Integer r2 = r2.f58662a
                        if (r2 == 0) goto L_0x0032
                        int r2 = r2.intValue()
                        r3 = r2
                        goto L_0x0034
                    L_0x0032:
                        r2 = -1
                        r3 = -1
                    L_0x0034:
                        com.ss.android.ugc.aweme.account.login.v2.network.b r0 = r0.f58666b
                        if (r0 == 0) goto L_0x003c
                        java.lang.String r0 = r0.f58663b
                    L_0x003a:
                        r4 = r0
                        goto L_0x003e
                    L_0x003c:
                        r0 = 0
                        goto L_0x003a
                    L_0x003e:
                        com.ss.android.ugc.aweme.account.login.v2.base.Scene r5 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene.SIGN_UP
                        com.ss.android.ugc.aweme.account.login.v2.network.e$n r0 = r8.f58847a
                        com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment r0 = r0.f58846a
                        com.ss.android.ugc.aweme.account.login.v2.base.Step r6 = r0.mo58339d()
                        r7 = 0
                        r2 = r1
                        r2.<init>(r3, r4, r5, r6, r7)
                        java.lang.Throwable r1 = (java.lang.Throwable) r1
                        r9.onError(r1)
                    L_0x0052:
                        r9.onComplete()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e.C22001n.C220021.mo19155a(org.a.c):void");
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$o */
    static final class C22003o<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58849a;

        /* renamed from: b */
        final /* synthetic */ String f58850b;

        C22003o(BaseAccountFlowFragment baseAccountFlowFragment, String str) {
            this.f58849a = baseAccountFlowFragment;
            this.f58850b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C6907h.m21524a("set_username_response", (Map) new C21102b().mo56946a("enter_from", this.f58849a.mo58340e()).mo56946a("enter_method", this.f58849a.mo58341f()).mo56946a("platform", this.f58850b).mo56944a("is_success", 0).f56672a);
            if (th instanceof NetworkException) {
                NetworkException networkException = (NetworkException) th;
                if (networkException.getErrorCode() == 4) {
                    FragmentActivity activity = this.f58849a.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } else {
                    BaseAccountFlowFragment baseAccountFlowFragment = this.f58849a;
                    int errorCode = networkException.getErrorCode();
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C21913a.m73131a(baseAccountFlowFragment, errorCode, message, networkException.getScene(), networkException.getStep(), networkException.getExtra());
                }
            } else {
                BaseAccountFlowFragment baseAccountFlowFragment2 = this.f58849a;
                String string = this.f58849a.getString(R.string.cjs);
                C7573i.m23582a((Object) string, "fragment.getString(R.string.network_unavailable)");
                baseAccountFlowFragment2.mo58335a(0, string);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$p */
    static final class C22004p<T> implements C7326g<C21929c> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58851a;

        /* renamed from: b */
        final /* synthetic */ String f58852b;

        C22004p(BaseAccountFlowFragment baseAccountFlowFragment, String str) {
            this.f58851a = baseAccountFlowFragment;
            this.f58852b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C21929c cVar) {
            C6907h.m21524a("set_username_response", (Map) new C21102b().mo56946a("enter_from", this.f58851a.mo58340e()).mo56946a("enter_method", this.f58851a.mo58341f()).mo56946a("platform", this.f58852b).mo56944a("is_success", 1).f56672a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$q */
    static final class C22005q implements C7323a {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58853a;

        C22005q(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58853a = baseAccountFlowFragment;
        }

        /* renamed from: a */
        public final void mo8975a() {
            this.f58853a.mo58334a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$r */
    static final class C22006r<T> implements C7326g<C48294d> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58854a;

        C22006r(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58854a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C48294d dVar) {
            this.f58854a.mo58334a(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$s */
    static final class C22007s<T> implements C47857o<T> {

        /* renamed from: a */
        final /* synthetic */ Scene f58855a;

        /* renamed from: b */
        final /* synthetic */ Step f58856b;

        /* renamed from: c */
        final /* synthetic */ BaseAccountFlowFragment f58857c;

        /* renamed from: d */
        final /* synthetic */ String f58858d;

        /* renamed from: e */
        final /* synthetic */ String f58859e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$s$a */
        public static final class C22008a extends C12717a {

            /* renamed from: a */
            final /* synthetic */ C22007s f58860a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58861b;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C12729a aVar) {
                C7573i.m23587b(aVar, "response");
                this.f58861b.mo119769a(aVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void onNeedSecureCaptcha(C12729a aVar) {
                C7573i.m23587b(aVar, "response");
                C47855m mVar = this.f58861b;
                NetworkException networkException = new NetworkException(aVar.f33702b, aVar.f33703c, this.f58860a.f58855a, this.f58860a.f58856b, null);
                mVar.mo119770a((Throwable) networkException);
            }

            C22008a(C22007s sVar, C47855m mVar) {
                this.f58860a = sVar;
                this.f58861b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onError(C12729a aVar, int i) {
                String str;
                C47855m mVar = this.f58861b;
                if (aVar != null) {
                    str = aVar.f33703c;
                } else {
                    str = null;
                }
                NetworkException networkException = new NetworkException(i, str, this.f58860a.f58855a, this.f58860a.f58856b, null);
                mVar.mo119770a((Throwable) networkException);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12729a aVar, String str) {
                C7573i.m23587b(aVar, "response");
                C47855m mVar = this.f58861b;
                NetworkException networkException = new NetworkException(aVar.f33702b, aVar.f33703c, this.f58860a.f58855a, this.f58860a.f58856b, null);
                mVar.mo119770a((Throwable) networkException);
            }
        }

        C22007s(Scene scene, Step step, BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2) {
            this.f58855a = scene;
            this.f58856b = step;
            this.f58857c = baseAccountFlowFragment;
            this.f58858d = str;
            this.f58859e = str2;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12729a> mVar) {
            C7573i.m23587b(mVar, "it");
            C22008a aVar = new C22008a(this, mVar);
            this.f58857c.mo58337a((C12706a<T>) aVar);
            this.f58857c.mo58343i().mo31188a(this.f58858d, this.f58859e, 4, (Map) null, (String) null, (C12717a) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$t */
    static final class C22009t<T> implements C7326g<C12729a> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58862a;

        C22009t(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58862a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12729a aVar) {
            C21930d.m73147a(0, "forget_password", this.f58862a.mo58341f());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$u */
    static final class C22010u<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58863a;

        C22010u(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58863a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                C21930d.m73147a(((NetworkException) th).getErrorCode(), "forget_password", this.f58863a.mo58341f());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$v */
    static final class C22011v<T> implements C47857o<C12710e<C12823f>> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58864a;

        /* renamed from: b */
        final /* synthetic */ String f58865b;

        /* renamed from: c */
        final /* synthetic */ String f58866c;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$v$a */
        public static final class C22012a extends C12845f {

            /* renamed from: a */
            final /* synthetic */ C22011v f58867a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58868b;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12823f> eVar) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58868b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, Scene.SIGN_UP, this.f58867a.f58864a.mo58339d(), null);
                mVar.mo119770a((Throwable) networkException);
            }

            public final void onSuccess(C12710e<C12823f> eVar) {
                C7573i.m23587b(eVar, "response");
                if (eVar.f33709g == null || ((C12823f) eVar.f33709g).f33942e == null) {
                    C47855m mVar = this.f58868b;
                    NetworkException networkException = new NetworkException(-1, "no data", Scene.SIGN_UP, Step.CREATE_PASSWORD_FOR_EMAIL, null);
                    mVar.mo119770a((Throwable) networkException);
                    return;
                }
                this.f58868b.mo119769a(eVar);
            }

            C22012a(C22011v vVar, C47855m mVar) {
                this.f58867a = vVar;
                this.f58868b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12710e<C12823f> eVar, String str) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58868b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, Scene.SIGN_UP, this.f58867a.f58864a.mo58339d(), null);
                mVar.mo119770a((Throwable) networkException);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
                if (r8 == null) goto L_0x0038;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
                if (r0 == null) goto L_0x0017;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p645a.p646a.C12710e<com.bytedance.sdk.account.p662f.p663a.C12823f> r8, int r9) {
                /*
                    r7 = this;
                    io.reactivex.m r9 = r7.f58868b
                    com.ss.android.ugc.aweme.account.login.v2.network.NetworkException r6 = new com.ss.android.ugc.aweme.account.login.v2.network.NetworkException
                    if (r8 == 0) goto L_0x000a
                    int r0 = r8.f33702b
                    r1 = r0
                    goto L_0x000e
                L_0x000a:
                    r0 = -10000(0xffffffffffffd8f0, float:NaN)
                    r1 = -10000(0xffffffffffffd8f0, float:NaN)
                L_0x000e:
                    if (r8 == 0) goto L_0x0017
                    java.lang.String r0 = r8.f33703c
                    if (r0 != 0) goto L_0x0015
                    goto L_0x0017
                L_0x0015:
                    r2 = r0
                    goto L_0x001a
                L_0x0017:
                    java.lang.String r0 = ""
                    goto L_0x0015
                L_0x001a:
                    com.ss.android.ugc.aweme.account.login.v2.base.Scene r3 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene.SIGN_UP
                    com.ss.android.ugc.aweme.account.login.v2.network.e$v r0 = r7.f58867a
                    com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment r0 = r0.f58864a
                    com.ss.android.ugc.aweme.account.login.v2.base.Step r4 = r0.mo58339d()
                    if (r8 == 0) goto L_0x0038
                    T r8 = r8.f33709g
                    com.bytedance.sdk.account.f.a.f r8 = (com.bytedance.sdk.account.p662f.p663a.C12823f) r8
                    if (r8 == 0) goto L_0x0038
                    org.json.JSONObject r8 = r8.f33964l
                    if (r8 == 0) goto L_0x0038
                    java.lang.String r0 = "data"
                    org.json.JSONObject r8 = r8.getJSONObject(r0)
                    if (r8 != 0) goto L_0x003d
                L_0x0038:
                    org.json.JSONObject r8 = new org.json.JSONObject
                    r8.<init>()
                L_0x003d:
                    java.lang.String r0 = "password"
                    com.ss.android.ugc.aweme.account.login.v2.network.e$v r5 = r7.f58867a
                    java.lang.String r5 = r5.f58865b
                    org.json.JSONObject r8 = r8.put(r0, r5)
                    java.lang.String r0 = "email"
                    com.ss.android.ugc.aweme.account.login.v2.network.e$v r5 = r7.f58867a
                    java.lang.String r5 = r5.f58866c
                    org.json.JSONObject r5 = r8.put(r0, r5)
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    java.lang.Throwable r6 = (java.lang.Throwable) r6
                    r9.mo119770a(r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e.C22011v.C22012a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }
        }

        C22011v(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2) {
            this.f58864a = baseAccountFlowFragment;
            this.f58865b = str;
            this.f58866c = str2;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12710e<C12823f>> mVar) {
            C7573i.m23587b(mVar, "it");
            C21930d.m73153a(true, "email", this.f58864a, false);
            C22012a aVar = new C22012a(this, mVar);
            this.f58864a.mo58337a((C12706a<T>) aVar);
            this.f58864a.mo58343i().mo31206a(this.f58866c, this.f58865b, "", "", (C12845f) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$w */
    static final class C22013w<T> implements C7326g<C12710e<C12823f>> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58869a;

        C22013w(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58869a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12823f> eVar) {
            C21930d.m73154a(true, "email", "register", this.f58869a.mo58341f(), 0);
            C21930d.m73152a(true, "email", this.f58869a);
            C21913a aVar = C21913a.f58632a;
            BaseAccountFlowFragment baseAccountFlowFragment = this.f58869a;
            Scene scene = Scene.SIGN_UP;
            Step d = this.f58869a.mo58339d();
            C12898b bVar = ((C12823f) eVar.f33709g).f33942e;
            C7573i.m23582a((Object) bVar, "it.mobileObj.mUserInfo");
            aVar.mo58367a(baseAccountFlowFragment, scene, d, null, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$x */
    static final class C22014x<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58870a;

        C22014x(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58870a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            if (th != null) {
                NetworkException networkException = (NetworkException) th;
                C21930d.m73154a(false, "email", "register", this.f58870a.mo58341f(), networkException.getErrorCode());
                C21930d.m73150a(true, networkException.getErrorCode(), "email", this.f58870a);
                C21231d.f57039b.mo57161a(1, networkException.getErrorCode(), networkException.getErrorMsg());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$y */
    static final class C22015y<T> implements C47857o<C12710e<C12837t>> {

        /* renamed from: a */
        final /* synthetic */ String f58871a;

        /* renamed from: b */
        final /* synthetic */ BaseAccountFlowFragment f58872b;

        /* renamed from: c */
        final /* synthetic */ String f58873c;

        /* renamed from: d */
        final /* synthetic */ String f58874d;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$y$a */
        public static final class C22016a extends C12857r {

            /* renamed from: a */
            final /* synthetic */ C22015y f58875a;

            /* renamed from: b */
            final /* synthetic */ C47855m f58876b;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12837t> eVar) {
                C7573i.m23587b(eVar, "response");
                C47855m mVar = this.f58876b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, Scene.LOGIN, this.f58875a.f58872b.mo58339d(), null);
                mVar.mo119770a((Throwable) networkException);
            }

            public final void onSuccess(C12710e<C12837t> eVar) {
                C7573i.m23587b(eVar, "response");
                if (eVar.f33709g == null || ((C12837t) eVar.f33709g).f34020t == null) {
                    C47855m mVar = this.f58876b;
                    NetworkException networkException = new NetworkException(-1, "no data", Scene.LOGIN, Step.INPUT_PHONE_FIND_PASSWORD, null);
                    mVar.mo119770a((Throwable) networkException);
                    return;
                }
                this.f58876b.mo119769a(eVar);
            }

            C22016a(C22015y yVar, C47855m mVar) {
                this.f58875a = yVar;
                this.f58876b = mVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedCaptcha(C12710e<C12837t> eVar, String str) {
                C7573i.m23587b(eVar, "response");
                C7573i.m23587b(str, "captcha");
                C47855m mVar = this.f58876b;
                NetworkException networkException = new NetworkException(eVar.f33702b, eVar.f33703c, Scene.LOGIN, this.f58875a.f58872b.mo58339d(), null);
                mVar.mo119770a((Throwable) networkException);
            }

            public final void onError(C12710e<C12837t> eVar, int i) {
                int i2;
                String str;
                JSONObject jSONObject;
                C47855m mVar = this.f58876b;
                if (eVar != null) {
                    i2 = eVar.f33702b;
                } else {
                    i2 = -10000;
                }
                if (eVar != null) {
                    str = eVar.f33703c;
                } else {
                    str = null;
                }
                Scene scene = Scene.LOGIN;
                Step d = this.f58875a.f58872b.mo58339d();
                if (eVar != null) {
                    C12837t tVar = (C12837t) eVar.f33709g;
                    if (tVar != null) {
                        JSONObject jSONObject2 = tVar.f33964l;
                        if (jSONObject2 != null) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                            if (jSONObject3 != null) {
                                jSONObject3.put("loginType", this.f58875a.f58871a);
                                jSONObject3.put("pwd", this.f58875a.f58873c);
                                jSONObject3.put("handle", this.f58875a.f58874d);
                                jSONObject = jSONObject3;
                                NetworkException networkException = new NetworkException(i2, str, scene, d, jSONObject);
                                mVar.mo119770a((Throwable) networkException);
                            }
                        }
                    }
                }
                jSONObject = null;
                NetworkException networkException2 = new NetworkException(i2, str, scene, d, jSONObject);
                mVar.mo119770a((Throwable) networkException2);
            }
        }

        C22015y(String str, BaseAccountFlowFragment baseAccountFlowFragment, String str2, String str3) {
            this.f58871a = str;
            this.f58872b = baseAccountFlowFragment;
            this.f58873c = str2;
            this.f58874d = str3;
        }

        /* renamed from: a */
        public final void mo58382a(C47855m<C12710e<C12837t>> mVar) {
            C7573i.m23587b(mVar, "it");
            C21930d.m73153a(false, this.f58871a, this.f58872b, false);
            C22016a aVar = new C22016a(this, mVar);
            this.f58872b.mo58337a((C12706a<T>) aVar);
            String str = this.f58871a;
            int hashCode = str.hashCode();
            if (hashCode != 96619420) {
                if (hashCode == 106642798 && str.equals("phone")) {
                    this.f58872b.mo58343i().mo31217c(this.f58874d, this.f58873c, "", aVar);
                    return;
                }
            } else if (str.equals("email")) {
                this.f58872b.mo58343i().mo31215b(this.f58874d, this.f58873c, "", (C12857r) aVar);
                return;
            }
            this.f58872b.mo58343i().mo31202a(this.f58874d, this.f58873c, "", (C12857r) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.e$z */
    static final class C22017z<T> implements C7326g<C12710e<C12837t>> {

        /* renamed from: a */
        final /* synthetic */ String f58877a;

        /* renamed from: b */
        final /* synthetic */ BaseAccountFlowFragment f58878b;

        /* renamed from: c */
        final /* synthetic */ String f58879c;

        C22017z(String str, BaseAccountFlowFragment baseAccountFlowFragment, String str2) {
            this.f58877a = str;
            this.f58878b = baseAccountFlowFragment;
            this.f58879c = str2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12837t> eVar) {
            if (!C7573i.m23585a((Object) this.f58877a, (Object) "phone")) {
                C21903c.m73115a((Fragment) this.f58878b, this.f58879c);
            }
            C21930d.m73152a(false, this.f58877a, this.f58878b);
            C21913a aVar = C21913a.f58632a;
            BaseAccountFlowFragment baseAccountFlowFragment = this.f58878b;
            Scene scene = Scene.LOGIN;
            Step d = this.f58878b.mo58339d();
            C12898b bVar = ((C12837t) eVar.f33709g).f34020t;
            C7573i.m23582a((Object) bVar, "it.mobileObj.mUserInfo");
            aVar.mo58367a(baseAccountFlowFragment, scene, d, null, bVar);
        }
    }

    private C21931e() {
    }

    /* renamed from: a */
    public static C7490k<C12734f> m73164a(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "pwd");
        C7573i.m23587b(str2, "ticket");
        C7490k a = C7490k.m23237a((C47857o<T>) new C21978bg<T>(baseAccountFlowFragment, str, str2)).mo19278c((C7326g<? super T>) new C21980bh<Object>(baseAccountFlowFragment)).mo19265a((C7326g<? super Throwable>) new C21981bi<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create(MaybeOnSubs…MAIL, fragment)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: a */
    public static C7490k<C12710e<C12837t>> m73166a(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2, String str3) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "account");
        C7573i.m23587b(str2, "pwd");
        C7573i.m23587b(str3, "type");
        C7490k a = C7490k.m23237a((C47857o<T>) new C22015y<T>(str3, baseAccountFlowFragment, str2, str)).mo19278c((C7326g<? super T>) new C22017z<Object>(str3, baseAccountFlowFragment, str)).mo19265a((C7326g<? super Throwable>) new C21934aa<Object>(str3, baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create(MaybeOnSubs…type, fragment)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: a */
    public static C7490k<C12822e> m73162a(BaseAccountFlowFragment baseAccountFlowFragment, String str, Scene scene, Step step) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "email");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        C7490k a = C7490k.m23237a((C47857o<T>) new C21995j<T>(scene, step, baseAccountFlowFragment, str)).mo19265a((C7326g<? super Throwable>) new C21997k<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create<EmailCheckR…nse.errorMsg}\")\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: a */
    public final C7490k<C12710e<C12836s>> mo58380a(BaseAccountFlowFragment baseAccountFlowFragment, String str, Scene scene, Step step, String str2, String str3, String str4) {
        BaseAccountFlowFragment baseAccountFlowFragment2 = baseAccountFlowFragment;
        Step step2 = step;
        String str5 = str4;
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        Scene scene2 = scene;
        C7573i.m23587b(scene2, "scene");
        C7573i.m23587b(step2, "step");
        String str6 = str2;
        C7573i.m23587b(str6, "ticket");
        String str7 = str3;
        C7573i.m23587b(str7, "sendMethod");
        int a = m73155a(scene);
        int a2 = m73156a(step);
        C21961au auVar = new C21961au(str7, a2, baseAccountFlowFragment, scene2, step, str, str6, a);
        C7490k c = C7490k.m23237a((C47857o<T>) auVar).mo19265a((C7326g<? super Throwable>) new C21963av<Object>(a2, str5, step2, baseAccountFlowFragment)).mo19278c((C7326g<? super T>) new C21964aw<Object>(a2, str5));
        C7573i.m23582a((Object) c, "Maybe.create<MobileApiRe…, \"\", sendFrom)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, c);
    }

    /* renamed from: a */
    public final C7490k<C12710e<C12836s>> mo58377a(BaseAccountFlowFragment baseAccountFlowFragment, PhoneNumber phoneNumber, Scene scene, Step step, String str, String str2) {
        BaseAccountFlowFragment baseAccountFlowFragment2 = baseAccountFlowFragment;
        Step step2 = step;
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        Scene scene2 = scene;
        C7573i.m23587b(scene2, "scene");
        C7573i.m23587b(step2, "step");
        String str3 = str;
        C7573i.m23587b(str3, "sendMethod");
        String str4 = str2;
        C7573i.m23587b(str4, "ticket");
        int a = m73155a(scene);
        int a2 = m73156a(step);
        C21970ba baVar = new C21970ba(str3, a2, baseAccountFlowFragment, phoneNumber, str4, a, scene2, step);
        C7490k c = C7490k.m23237a((C47857o<T>) baVar).mo19265a((C7326g<? super Throwable>) new C21972bb<Object>(a2, step2, baseAccountFlowFragment)).mo19278c((C7326g<? super T>) new C21973bc<Object>(a2));
        C7573i.m23582a((Object) c, "Maybe.create<MobileApiRe…cenario, 0, \"\")\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, c);
    }

    /* renamed from: a */
    public static C7490k<C12824g> m73165a(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2, Scene scene, Step step) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "email");
        C7573i.m23587b(str2, "codes");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        C21982bj bjVar = new C21982bj(baseAccountFlowFragment, scene, step, str, str2);
        C7490k a = C7490k.m23237a((C47857o<T>) bjVar).mo19278c((C7326g<? super T>) new C21984bk<Object>(baseAccountFlowFragment)).mo19265a((C7326g<? super Throwable>) new C21985bl<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create<EmailRegist…MAIL, fragment)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: a */
    public final C7490k<C12710e<C12836s>> mo58376a(BaseAccountFlowFragment baseAccountFlowFragment, PhoneNumber phoneNumber, Scene scene, Step step, String str) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(phoneNumber, "phoneNumber");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        C7573i.m23587b(str, "sendMethod");
        int a = m73156a(step);
        String a2 = PhoneNumberUtil.m73058a(phoneNumber);
        C7573i.m23582a((Object) a2, "PhoneNumberUtil.formatNumber(phoneNumber)");
        C21965ax axVar = new C21965ax(a, str, scene, step, baseAccountFlowFragment, a2);
        C7490k c = C7490k.m23237a((C47857o<T>) axVar).mo19265a((C7326g<? super Throwable>) new C21967ay<Object>(a)).mo19278c((C7326g<? super T>) new C21968az<Object>(a, baseAccountFlowFragment, a2));
        C7573i.m23582a((Object) c, "Maybe.create(MaybeOnSubs…)\n            }\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, c);
    }

    /* renamed from: a */
    public final C7490k<C12710e<C12836s>> mo58378a(BaseAccountFlowFragment baseAccountFlowFragment, PhoneNumber phoneNumber, Step step, String str) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(phoneNumber, "phoneNumber");
        C7573i.m23587b(step, "step");
        C7573i.m23587b(str, "sendMethod");
        int a = m73156a(step);
        C21957ar arVar = new C21957ar(str, a, baseAccountFlowFragment, step, phoneNumber);
        C7490k a2 = C7490k.m23237a((C47857o<T>) arVar).mo19278c((C7326g<? super T>) new C21959as<Object>(a)).mo19265a((C7326g<? super Throwable>) new C21960at<Object>(a));
        C7573i.m23582a((Object) a2, "Maybe.create(MaybeOnSubs…sponse.message)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a2);
    }

    /* renamed from: a */
    public static C7490k<C12710e<C12819b>> m73163a(BaseAccountFlowFragment baseAccountFlowFragment, String str, Scene scene, Step step, String str2) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        C7573i.m23587b(str2, "codes");
        C21932a aVar = new C21932a(scene, step, baseAccountFlowFragment, str, str2);
        C7490k a = C7490k.m23237a((C47857o<T>) aVar).mo19278c((C7326g<? super T>) new C21969b<Object>(baseAccountFlowFragment)).mo19265a((C7326g<? super Throwable>) new C21986c<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create<MobileApiRe…ND_PHONE_CLICK)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: a */
    public final C7490k<C12713h> mo58379a(BaseAccountFlowFragment baseAccountFlowFragment, Scene scene, Step step, String str) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        C7573i.m23587b(str, "codes");
        C21943ah ahVar = new C21943ah(scene, step, baseAccountFlowFragment, str, m73156a(step));
        C7490k a = C7490k.m23237a((C47857o<T>) ahVar).mo19278c((C7326g<? super T>) new C21945ai<Object>(baseAccountFlowFragment)).mo19265a((C7326g<? super Throwable>) new C21946aj<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create<ValidateCod…ND_PHONE_CLICK)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: a */
    private static int m73155a(Scene scene) {
        switch (C22018f.f58882c[scene.ordinal()]) {
            case 1:
                return 0;
            case 2:
            case 3:
            case 4:
                return 1;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    private static int m73156a(Step step) {
        switch (C22018f.f58881b[step.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return C21169e.f56936u;
            case 4:
            case 5:
                return C21169e.f56919d;
            case 6:
                return C21169e.f56923h;
            case 7:
                return C21169e.f56941z;
            case 8:
                return C21169e.f56932q;
            default:
                return C21169e.f56936u;
        }
    }

    /* renamed from: b */
    public static C7490k<C12710e<C12879a>> m73171b(BaseAccountFlowFragment baseAccountFlowFragment, String str) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "pwd");
        C7490k a = C7490k.m23237a((C47857o<T>) new C21974bd<T>(baseAccountFlowFragment, str)).mo19278c((C7326g<? super T>) new C21976be<Object>(baseAccountFlowFragment)).mo19265a((C7326g<? super Throwable>) new C21977bf<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create(MaybeOnSubs…ion).errorCode)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: a */
    public static C7490k<C12730b> m73160a(BaseAccountFlowFragment baseAccountFlowFragment, String str) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "pwd");
        C7490k a = C7490k.m23237a((C47857o<T>) new C21998l<T>(baseAccountFlowFragment, str)).mo19265a((C7326g<? super Throwable>) new C22000m<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create<CheckPwdRes…}\n            }\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: c */
    public static C7490k<C12710e<C12823f>> m73175c(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "email");
        C7573i.m23587b(str2, "pwd");
        C7490k a = C7490k.m23237a((C47857o<T>) new C22011v<T>(baseAccountFlowFragment, str2, str)).mo19278c((C7326g<? super T>) new C22013w<Object>(baseAccountFlowFragment)).mo19265a((C7326g<? super Throwable>) new C22014x<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create(MaybeOnSubs…e, it.errorMsg)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: a */
    public static C7329e<C21929c> m73157a(BaseAccountFlowFragment baseAccountFlowFragment, Map<String, String> map, String str) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(map, "params");
        C7573i.m23587b(str, "platForm");
        C7329e<C21929c> c = C22208c.m73677b("/passport/login_name/register/", map).mo19149a((C7327h<? super T, ? extends C7704b<? extends R>>) new C22001n<Object,Object>(baseAccountFlowFragment)).mo19152a(C47549a.m148327a()).mo19148a((C7326g<? super Throwable>) new C22003o<Object>(baseAccountFlowFragment, str)).mo19157b((C7326g<? super T>) new C22004p<Object>(baseAccountFlowFragment, str)).mo19147a((C7323a) new C22005q(baseAccountFlowFragment)).mo19161c((C7326g<? super C48294d>) new C22006r<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) c, "NetworkProxyAccount.exec…MATIOM)\n                }");
        return c;
    }

    /* renamed from: b */
    public static C7490k<C12734f> m73172b(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "pwd");
        C7573i.m23587b(str2, "ticket");
        C7490k a = C7490k.m23237a((C47857o<T>) new C21947ak<T>(baseAccountFlowFragment, str, str2)).mo19278c((C7326g<? super T>) new C21949al<Object>(baseAccountFlowFragment)).mo19265a((C7326g<? super Throwable>) new C21950am<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create(MaybeOnSubs…}\n            }\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: b */
    public static C7490k<C12729a> m73170b(BaseAccountFlowFragment baseAccountFlowFragment, PhoneNumber phoneNumber, String str, Scene scene, Step step) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "codes");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        C21991g gVar = new C21991g(scene, step, baseAccountFlowFragment, phoneNumber, str);
        C7490k a = C7490k.m23237a((C47857o<T>) gVar).mo19278c((C7326g<? super T>) new C21993h<Object>(baseAccountFlowFragment)).mo19265a((C7326g<? super Throwable>) new C21994i<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create<CheckCodeRe…)\n            }\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: a */
    public static C7490k<C12710e<C12830m>> m73158a(BaseAccountFlowFragment baseAccountFlowFragment, PhoneNumber phoneNumber, String str, Scene scene, Step step) {
        boolean z;
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "smsCodeKey");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        if (scene == Scene.SIGN_UP) {
            z = true;
        } else {
            z = false;
        }
        C21935ab abVar = new C21935ab(z, baseAccountFlowFragment, scene, step, phoneNumber, str);
        C7490k c = C7490k.m23237a((C47857o<T>) abVar).mo19265a((C7326g<? super Throwable>) new C21937ac<Object>(z, baseAccountFlowFragment)).mo19278c((C7326g<? super T>) new C21938ad<Object>(z, baseAccountFlowFragment));
        C7573i.m23582a((Object) c, "Maybe.create<MobileApiRe…eObj.mUserInfo)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, c);
    }

    /* renamed from: b */
    public static C7490k<C12729a> m73173b(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2, Scene scene, Step step) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "email");
        C7573i.m23587b(str2, "codes");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        C22007s sVar = new C22007s(scene, step, baseAccountFlowFragment, str, str2);
        C7490k a = C7490k.m23237a((C47857o<T>) sVar).mo19278c((C7326g<? super T>) new C22009t<Object>(baseAccountFlowFragment)).mo19265a((C7326g<? super Throwable>) new C22010u<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create<CheckCodeRe…nt.enterMethod)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: a */
    public static C7490k<C12710e<C12825h>> m73161a(BaseAccountFlowFragment baseAccountFlowFragment, String str, int i, boolean z, String str2) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "email");
        C21955aq aqVar = new C21955aq(z, baseAccountFlowFragment, str, str2, i);
        C7490k a = C7490k.m23237a((C47857o<T>) aqVar);
        C7573i.m23582a((Object) a, "Maybe.create {\n         …null, callBack)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: a */
    public static C7490k<C12831n> m73159a(BaseAccountFlowFragment baseAccountFlowFragment, PhoneNumber phoneNumber, String str, Scene scene, Step step, boolean z) {
        boolean z2;
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "codes");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        if (scene == Scene.SIGN_UP) {
            z2 = true;
        } else {
            z2 = false;
        }
        C21939ae aeVar = new C21939ae(scene, baseAccountFlowFragment, step, phoneNumber, str);
        C7490k a = C7490k.m23237a((C47857o<T>) aeVar).mo19278c((C7326g<? super T>) new C21941af<Object>(z2, z, baseAccountFlowFragment)).mo19265a((C7326g<? super Throwable>) new C21942ag<Object>(z2, z, baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create<QuickLoginO…TION, fragment)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: c */
    public static C7490k<C12710e<C12820c>> m73174c(BaseAccountFlowFragment baseAccountFlowFragment, String str, Scene scene, Step step, String str2, String str3, String str4) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        C7573i.m23587b(str2, "codes");
        C7573i.m23587b(str3, "ticket");
        C7573i.m23587b(str4, "mUnusableMobileTicket");
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("unusable_mobile_ticket", str4);
        C21987d dVar = new C21987d(scene, step, baseAccountFlowFragment, str, str2, str3, arrayMap);
        C7490k a = C7490k.m23237a((C47857o<T>) dVar).mo19278c((C7326g<? super T>) new C21989e<Object>(baseAccountFlowFragment)).mo19265a((C7326g<? super Throwable>) new C21990f<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) a, "Maybe.create<MobileApiRe…ND_PHONE_CLICK)\n        }");
        return C22019g.m73300a(baseAccountFlowFragment, a);
    }

    /* renamed from: b */
    public final C7490k<C12710e<C12836s>> mo58381b(BaseAccountFlowFragment baseAccountFlowFragment, String str, Scene scene, Step step, String str2, String str3, String str4) {
        String str5;
        BaseAccountFlowFragment baseAccountFlowFragment2 = baseAccountFlowFragment;
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(scene, "scene");
        C7573i.m23587b(step, "step");
        int a = m73155a(scene);
        int a2 = m73156a(step);
        switch (C22018f.f58883d[step.ordinal()]) {
            case 1:
                str5 = "first_bind_phone_click";
                break;
            case 2:
                str5 = "first_bind_phone_click";
                break;
            case 3:
                str5 = "change_bind_phone_click";
                break;
            case 4:
                str5 = "rebind_phone_click";
                break;
            case 5:
                str5 = "rebind_phone_click";
                break;
            default:
                str5 = "";
                break;
        }
        C21951an anVar = new C21951an(str4, a2, str5, baseAccountFlowFragment, scene, step, str, str2, a, str3);
        C7490k c = C7490k.m23237a((C47857o<T>) anVar).mo19278c((C7326g<? super T>) new C21953ao<Object>(a2));
        C7573i.m23582a((Object) c, "Maybe.create<MobileApiRe…cenario, 0, \"\")\n        }");
        C7490k<C12710e<C12836s>> a3 = C22019g.m73300a(baseAccountFlowFragment, c).mo19265a((C7326g<? super Throwable>) new C21954ap<Object>(a2));
        C7573i.m23582a((Object) a3, "request(fragment, Maybe.…rInfo.errorMsg)\n        }");
        return a3;
    }
}
