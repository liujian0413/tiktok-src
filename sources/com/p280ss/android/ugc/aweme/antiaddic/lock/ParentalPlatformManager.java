package com.p280ss.android.ugc.aweme.antiaddic.lock;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.p982ui.FullScreenLoginActivity.C22254a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role;
import com.p280ss.android.ugc.aweme.antiaddic.lock.api.C22592a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.C22599a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.p1358l.C32270a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.DmtStatusViewDialog;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.setting.p337ui.DigitalWellbeingActivity;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a.C37704a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;
import kotlin.text.C7634n;
import kotlinx.coroutines.C48056ad;
import kotlinx.coroutines.C48093bb;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager */
public final class ParentalPlatformManager implements C37704a {

    /* renamed from: a */
    public static final ParentalPlatformManager f60137a;

    /* renamed from: b */
    private static final List<C22573a> f60138b = new ArrayList();

    /* renamed from: c */
    private static volatile boolean f60139c;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$a */
    public interface C22573a {
        /* renamed from: a */
        void mo59222a(C37723b bVar, boolean z);

        /* renamed from: a */
        void mo59223a(Exception exc);
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$b */
    public static final class C22574b implements C22573a {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f60140a;

        /* renamed from: b */
        final /* synthetic */ Activity f60141b;

        /* renamed from: a */
        public final void mo59223a(Exception exc) {
            C7573i.m23587b(exc, "e");
            ((DmtStatusViewDialog) this.f60140a.element).dismiss();
            C22814a.m75244a((Context) this.f60141b, (Throwable) exc);
        }

        C22574b(ObjectRef objectRef, Activity activity) {
            this.f60140a = objectRef;
            this.f60141b = activity;
        }

        /* renamed from: a */
        public final void mo59222a(C37723b bVar, boolean z) {
            C7573i.m23587b(bVar, "settings");
            ((DmtStatusViewDialog) this.f60140a.element).dismiss();
            if (z) {
                if (ParentalPlatformConfig.f60133a.mo59214b() == Role.UNLINK_LOCKED) {
                    this.f60141b.startActivity(new Intent(this.f60141b, DigitalWellbeingActivity.class));
                }
            } else if (ParentalPlatformConfig.f60133a.mo59214b() == Role.CHILD) {
                C7195s.m22438a().mo18682a(ParentalPlatformConfig.m74615g());
            } else {
                this.f60141b.startActivity(new Intent(this.f60141b, DigitalWellbeingActivity.class));
            }
        }
    }

    @C7540d(mo19421b = "ParentalPlatformManager.kt", mo19422c = {180}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$getDynamicPassword$1")
    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$c */
    static final class C22575c extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        Object f60142a;

        /* renamed from: b */
        int f60143b;

        /* renamed from: c */
        final /* synthetic */ C18253l f60144c;

        /* renamed from: d */
        final /* synthetic */ Context f60145d;

        /* renamed from: e */
        private C48056ad f60146e;

        C22575c(C18253l lVar, Context context, C47919b bVar) {
            this.f60144c = lVar;
            this.f60145d = context;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C22575c cVar = new C22575c(this.f60144c, this.f60145d, bVar);
            cVar.f60146e = (C48056ad) obj;
            return cVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22575c) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            Object a = C47948a.m148881a();
            switch (this.f60143b) {
                case 0:
                    C48056ad adVar = this.f60146e;
                    try {
                        C18253l lVar = this.f60144c;
                        this.f60142a = adVar;
                        this.f60143b = 1;
                        obj = C22592a.m74662a(lVar, this);
                        if (obj == a) {
                            return a;
                        }
                    } catch (Exception e) {
                        C22814a.m75244a(this.f60145d, (Throwable) e);
                        break;
                    }
                case 1:
                    String str = ((C22599a) obj).f60173a;
                    Context context = this.f60145d;
                    C7573i.m23582a((Object) str, "password");
                    ParentalPlatformManager.m74626a(context, str);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$d */
    static final class C22576d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        public static final C22576d f60147a = new C22576d();

        C22576d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m74639a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public static void m74639a() {
            new Handler(Looper.myLooper()).post(C225771.f60148a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$e */
    static final class C22578e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        public static final C22578e f60149a = new C22578e();

        C22578e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m74640a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public static void m74640a() {
            new Handler(Looper.myLooper()).post(C225791.f60150a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$f */
    static final class C22580f implements OnClickListener {

        /* renamed from: a */
        public static final C22580f f60151a = new C22580f();

        C22580f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    private ParentalPlatformManager() {
    }

    /* renamed from: a */
    public final void mo59220a(Exception exc) {
        C7573i.m23587b(exc, "e");
        for (C22573a a : f60138b) {
            a.mo59223a(exc);
        }
        f60138b.clear();
        f60139c = false;
    }

    static {
        ParentalPlatformManager parentalPlatformManager = new ParentalPlatformManager();
        f60137a = parentalPlatformManager;
        C42961az.m136382c(parentalPlatformManager);
    }

    /* renamed from: a */
    public static void m74627a(C22573a aVar) {
        if (aVar != null && !f60138b.contains(aVar)) {
            f60138b.add(aVar);
        }
        if (!f60139c) {
            f60139c = true;
            C37703a.f98219b.mo95049a(null, false);
        }
    }

    /* renamed from: b */
    public static boolean m74632b(String str) {
        C7573i.m23587b(str, "result");
        return C7634n.m23776c((CharSequence) str, (CharSequence) "/falcon/rn/guardian_child", true);
    }

    /* renamed from: a */
    public static final void m74625a(Activity activity) {
        if (activity != null) {
            Context context = activity;
            if (!C22597d.m74674a(context)) {
                C10761a.m31403c(context, activity.getString(R.string.b23)).mo25750a();
                return;
            }
            ObjectRef objectRef = new ObjectRef();
            objectRef.element = new DmtStatusViewDialog(activity);
            ((DmtStatusViewDialog) objectRef.element).show();
            m74627a((C22573a) new C22574b(objectRef, activity));
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onParentalModeChanged(C27994k kVar) {
        C7573i.m23587b(kVar, "event");
        if (TextUtils.equals("guardian_platform_open", kVar.f73730b.getString("eventName")) || TextUtils.equals("guardian_platform_close", kVar.f73730b.getString("eventName"))) {
            m74627a((C22573a) null);
            return;
        }
        if (TextUtils.equals("guardian_platform_child_unlink", kVar.f73730b.getString("eventName"))) {
            Activity g = C6405d.m19984g();
            if (g != null) {
                m74625a(g);
                g.finish();
            }
        }
    }

    /* renamed from: b */
    private static boolean m74631b(C37723b bVar) {
        boolean z;
        C37723b bVar2;
        int i;
        int i2;
        int i3;
        C7573i.m23587b(bVar, "setting");
        C37723b a = ParentalPlatformConfig.m74612a();
        ParentalPlatformConfig.f60133a.mo59213a(bVar);
        if (ParentalPlatformConfig.m74613b(bVar) == Role.CHILD || ParentalPlatformConfig.m74613b(bVar) == Role.PARENT) {
            C23060u a2 = C23060u.m75742a();
            C7573i.m23582a((Object) a2, "CommonSharePrefCache.inst()");
            C22903bl k = a2.mo60081k();
            C7573i.m23582a((Object) k, "CommonSharePrefCache.inst().hadOpenParentCare");
            k.mo59871a(Boolean.valueOf(true));
        }
        if (ParentalPlatformConfig.m74613b(bVar) == Role.CHILD) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bVar2 = bVar;
        } else {
            bVar2 = null;
        }
        if (bVar2 != null) {
            TimeLockRuler.removeUserSettingWithoutNotify();
        }
        if (ParentalPlatformConfig.m74613b(a) != Role.CHILD || ParentalPlatformConfig.m74613b(bVar) == Role.CHILD) {
            if (ParentalPlatformConfig.m74613b(a) == Role.CHILD || ParentalPlatformConfig.m74613b(bVar) != Role.CHILD) {
                if (ParentalPlatformConfig.m74613b(a) == Role.CHILD && ParentalPlatformConfig.m74613b(bVar) == Role.CHILD) {
                    if (a != null) {
                        i = a.f98259Q;
                    } else {
                        i = 0;
                    }
                    if (i == 0 || bVar.f98259Q != 0) {
                        if (a != null) {
                            i2 = a.f98259Q;
                        } else {
                            i2 = 0;
                        }
                        if (i2 == 0 && bVar.f98259Q != 0) {
                            C22578e.m74640a();
                            return true;
                        }
                    } else {
                        C22576d.m74639a();
                        return true;
                    }
                }
            } else if (bVar.f98259Q != 0 && !TimeLockRuler.sLastContentFilterState) {
                C22578e.m74640a();
                return true;
            } else if (bVar.f98259Q == 0 && TimeLockRuler.sLastContentFilterState) {
                C22576d.m74639a();
            }
        } else if (ParentalPlatformConfig.m74613b(bVar) == Role.UNLINK_LOCKED) {
            return true;
        } else {
            if (a != null) {
                i3 = a.f98259Q;
            } else {
                i3 = 0;
            }
            if (i3 != 0) {
                C22576d.m74639a();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m74630a(String str) {
        Context context;
        if (TextUtils.isEmpty(str) || str == null || !m74632b(str)) {
            return false;
        }
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin()) {
            Activity g = C6405d.m19984g();
            if (g != null) {
                context = g;
            } else {
                context = C6399b.m19921a();
            }
            C22254a.m73769a(context, "qr_code_detail", "auto");
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.c5q).mo25750a();
            return true;
        } else if (ParentalPlatformConfig.f60133a.mo59214b() == Role.CLOSE) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.buz).mo25750a();
            return true;
        } else {
            C23060u a2 = C23060u.m75742a();
            C7573i.m23582a((Object) a2, "CommonSharePrefCache.inst()");
            C22903bl i = a2.mo60079i();
            C7573i.m23582a((Object) i, "CommonSharePrefCache.inst().isForceMinor");
            Object d = i.mo59877d();
            C7573i.m23582a(d, "CommonSharePrefCache.inst().isForceMinor.cache");
            if (!((Boolean) d).booleanValue()) {
                return false;
            }
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.b9p).mo25750a();
            return true;
        }
    }

    /* renamed from: a */
    public final void mo59219a(C37723b bVar) {
        C7573i.m23587b(bVar, "settings");
        boolean b = m74631b(bVar);
        for (C22573a a : f60138b) {
            a.mo59222a(bVar, b);
        }
        f60138b.clear();
        f60139c = false;
        TimeLockUserSetting timeLockUserSetting = new TimeLockUserSetting();
        timeLockUserSetting.setNotifyParentModeOnly(true);
        C42961az.m136380a(timeLockUserSetting);
    }

    /* renamed from: a */
    public static void m74626a(Context context, String str) {
        new C11030a(context).mo26640a((CharSequence) String.valueOf(context.getString(R.string.awz))).mo26647b((CharSequence) String.valueOf(str)).mo26635a((int) R.string.afn, (OnClickListener) C22580f.f60151a).mo26649b();
    }

    /* renamed from: a */
    public static void m74628a(C22573a aVar, C37723b bVar) {
        C7573i.m23587b(bVar, "pushSettings");
        if (!f60138b.contains(aVar)) {
            f60138b.add(aVar);
        }
        if (!f60139c) {
            f60139c = true;
            C37703a.m120567a(bVar);
        }
    }

    /* renamed from: a */
    public static void m74629a(String str, Context context) {
        C7573i.m23587b(str, "uid");
        C7573i.m23587b(context, "context");
        C18253l b = ParentalPlatformApi.m74660b(str);
        if (b != null) {
            C48145g.m149385a(C48093bb.f122957a, C32270a.m104791a(), null, new C22575c(b, context, null), 2, null);
        }
    }
}
