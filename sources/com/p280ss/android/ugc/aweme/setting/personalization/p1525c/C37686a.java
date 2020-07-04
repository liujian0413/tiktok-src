package com.p280ss.android.ugc.aweme.setting.personalization.p1525c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.google.android.gms.ads.p742b.C14733a;
import com.google.android.gms.ads.p742b.C14733a.C14734a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.interest.C32196i;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.personalization.PersonalizationActivity;
import com.p280ss.android.ugc.aweme.setting.personalization.p1524b.C37681a;
import com.p280ss.android.ugc.aweme.setting.secret.C37702c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43054df;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.setting.personalization.c.a */
public final class C37686a {

    /* renamed from: a */
    public static boolean f98173a = true;

    /* renamed from: b */
    public static boolean f98174b;

    /* renamed from: c */
    public static boolean f98175c;

    /* renamed from: d */
    public static boolean f98176d;

    /* renamed from: e */
    public static boolean f98177e;

    /* renamed from: f */
    public static boolean f98178f;

    /* renamed from: g */
    public static final C37687a f98179g = new C37687a(null);

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.c.a$a */
    public static final class C37687a {

        /* renamed from: com.ss.android.ugc.aweme.setting.personalization.c.a$a$a */
        static final class C37688a<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ Context f98180a;

            C37688a(Context context) {
                this.f98180a = context;
            }

            /* renamed from: a */
            private boolean m120541a() {
                try {
                    C14734a a = C14733a.m42585a(this.f98180a);
                    C7573i.m23582a((Object) a, "AdvertisingIdClient.getAdvertisingIdInfo(context)");
                    return a.f38080b;
                } catch (Exception unused) {
                    return false;
                }
            }

            public final /* synthetic */ Object call() {
                return Boolean.valueOf(m120541a());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.personalization.c.a$a$b */
        static final class C37689b<TTaskResult, TContinuationResult> implements C1591g<Boolean, Object> {

            /* renamed from: a */
            final /* synthetic */ C37694b f98181a;

            C37689b(C37694b bVar) {
                this.f98181a = bVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<Boolean> hVar) {
                C23060u a = C23060u.m75742a();
                C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
                C22903bl J = a.mo60040J();
                C7573i.m23582a((Object) J, "CommonSharePrefCache.ins…tOutGooglePersonalizedAds");
                C7573i.m23582a((Object) hVar, "it");
                J.mo59871a(hVar.mo6890e());
                C37694b bVar = this.f98181a;
                if (bVar != null) {
                    Object e = hVar.mo6890e();
                    C7573i.m23582a(e, "it.result");
                    bVar.mo95007a(((Boolean) e).booleanValue());
                }
                return null;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.personalization.c.a$a$c */
        public static final class C37690c extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ Activity f98182a;

            /* renamed from: b */
            final /* synthetic */ String f98183b;

            /* renamed from: c */
            final /* synthetic */ int f98184c;

            /* renamed from: d */
            final /* synthetic */ int f98185d;

            /* renamed from: e */
            final /* synthetic */ String f98186e;

            /* renamed from: f */
            final /* synthetic */ int f98187f;

            /* renamed from: g */
            final /* synthetic */ int f98188g;

            public final void updateDrawState(TextPaint textPaint) {
                C7573i.m23587b(textPaint, "ds");
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                C7573i.m23587b(view, "widget");
                Intent intent = new Intent(this.f98182a, CrossPlatformActivity.class);
                intent.setData(Uri.parse(C43054df.m136597a("privacy-policy")));
                intent.putExtra("title", this.f98183b);
                this.f98182a.startActivity(intent);
            }

            C37690c(Activity activity, String str, int i, int i2, String str2, int i3, int i4) {
                this.f98182a = activity;
                this.f98183b = str;
                this.f98184c = i;
                this.f98185d = i2;
                this.f98186e = str2;
                this.f98187f = i3;
                this.f98188g = i4;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.personalization.c.a$a$d */
        public static final class C37691d extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ Activity f98189a;

            /* renamed from: b */
            final /* synthetic */ String f98190b;

            /* renamed from: c */
            final /* synthetic */ int f98191c;

            /* renamed from: d */
            final /* synthetic */ int f98192d;

            /* renamed from: e */
            final /* synthetic */ String f98193e;

            /* renamed from: f */
            final /* synthetic */ int f98194f;

            /* renamed from: g */
            final /* synthetic */ int f98195g;

            public final void updateDrawState(TextPaint textPaint) {
                C7573i.m23587b(textPaint, "ds");
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                C7573i.m23587b(view, "widget");
                Intent intent = new Intent(this.f98189a, CrossPlatformActivity.class);
                intent.setData(Uri.parse(C43054df.m136597a("cookie-policy-eu ")));
                intent.putExtra("title", this.f98193e);
                this.f98189a.startActivity(intent);
            }

            C37691d(Activity activity, String str, int i, int i2, String str2, int i3, int i4) {
                this.f98189a = activity;
                this.f98190b = str;
                this.f98191c = i;
                this.f98192d = i2;
                this.f98193e = str2;
                this.f98194f = i3;
                this.f98195g = i4;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.personalization.c.a$a$e */
        static final class C37692e implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ Activity f98196a;

            C37692e(Activity activity) {
                this.f98196a = activity;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                String str;
                Intent intent = new Intent(this.f98196a, PersonalizationActivity.class);
                intent.putExtra(C22704b.f60414c, true);
                this.f98196a.startActivityForResult(intent, 1);
                C6907h.m21524a("click_personalization_ad_dialog", (Map) new C22984d().mo59973a("dialog_style", "choice").mo59973a("action_type", "review").f60753a);
                C23060u a = C23060u.m75742a();
                C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
                C22903bl ac = a.mo60059ac();
                C7573i.m23582a((Object) ac, "CommonSharePrefCache.ins…sonalizationSettingShowed");
                ac.mo59871a(Boolean.valueOf(true));
                String str2 = "show_personalization_status";
                C22984d dVar = new C22984d();
                String str3 = "initial_status";
                SharePrefCache inst = SharePrefCache.inst();
                C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
                C22903bl personalizationMode = inst.getPersonalizationMode();
                C7573i.m23582a((Object) personalizationMode, "SharePrefCache.inst().personalizationMode");
                Integer num = (Integer) personalizationMode.mo59877d();
                if (num != null && num.intValue() == 0) {
                    str = "off";
                } else {
                    str = "on";
                }
                C6907h.m21524a(str2, (Map) dVar.mo59973a(str3, str).f60753a);
                C37687a.m120533d(true);
                C42961az.m136380a(new C37702c());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.personalization.c.a$a$f */
        static final class C37693f implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ Activity f98197a;

            C37693f(Activity activity) {
                this.f98197a = activity;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                String str;
                C37681a aVar = new C37681a(null);
                SharePrefCache inst = SharePrefCache.inst();
                C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
                C22903bl personalizationMode = inst.getPersonalizationMode();
                C7573i.m23582a((Object) personalizationMode, "SharePrefCache.inst().personalizationMode");
                Integer num = (Integer) personalizationMode.mo59877d();
                if (num != null && num.intValue() == 2) {
                    C10761a.m31384a((Context) this.f98197a, (int) R.string.d3n, 1).mo25750a();
                    C42961az.m136380a(new C32196i(false));
                    aVar.mo95032a(2, false);
                    str = "choice";
                } else {
                    aVar.mo95032a(1, false);
                    str = "notice";
                }
                C23060u a = C23060u.m75742a();
                C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
                C22903bl ac = a.mo60059ac();
                C7573i.m23582a((Object) ac, "CommonSharePrefCache.ins…sonalizationSettingShowed");
                ac.mo59871a(Boolean.valueOf(true));
                C6907h.m21524a("click_personalization_ad_dialog", (Map) new C22984d().mo59973a("dialog_style", str).mo59973a("action_type", "agree").f60753a);
                C37687a.m120533d(true);
                C42961az.m136380a(new C37702c());
                dialogInterface.dismiss();
            }
        }

        private C37687a() {
        }

        /* renamed from: f */
        private static boolean m120537f() {
            return C37686a.f98178f;
        }

        /* renamed from: a */
        public static boolean m120527a() {
            return C37686a.f98173a;
        }

        /* renamed from: b */
        public static boolean m120530b() {
            return C37686a.f98174b;
        }

        /* renamed from: c */
        public static boolean m120532c() {
            return C37686a.f98175c;
        }

        /* renamed from: d */
        public static boolean m120534d() {
            return C37686a.f98176d;
        }

        /* renamed from: e */
        public static boolean m120536e() {
            return C37686a.f98177e;
        }

        /* renamed from: a */
        public static void m120526a(boolean z) {
            C37686a.f98173a = false;
        }

        /* renamed from: b */
        public static void m120529b(boolean z) {
            C37686a.f98175c = true;
        }

        /* renamed from: c */
        public static void m120531c(boolean z) {
            C37686a.f98176d = true;
        }

        /* renamed from: d */
        public static void m120533d(boolean z) {
            C37686a.f98177e = true;
        }

        /* renamed from: e */
        public static void m120535e(boolean z) {
            C37686a.f98178f = z;
        }

        /* renamed from: g */
        private static void m120538g(boolean z) {
            C37686a.f98174b = true;
        }

        public /* synthetic */ C37687a(C7571f fVar) {
            this();
        }

        /* renamed from: b */
        private static SpannableStringBuilder m120528b(Activity activity) {
            Activity activity2 = activity;
            String string = activity2.getString(R.string.ct_);
            String string2 = activity2.getString(R.string.ct9);
            String string3 = activity2.getString(R.string.cta, new Object[]{string, string2});
            CharSequence charSequence = string3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            C7573i.m23582a((Object) string3, "terms");
            C7573i.m23582a((Object) string, "privacyPolicy");
            CharSequence charSequence2 = charSequence;
            int a = C7634n.m23730a(charSequence2, string, 0, false, 6, (Object) null);
            int length = a + string.length();
            C7573i.m23582a((Object) string2, "cookiesPolicy");
            int a2 = C7634n.m23730a(charSequence2, string2, 0, false, 6, (Object) null);
            int length2 = a2 + string2.length();
            if (!(a == -1 || length == -1 || a2 == -1 || length2 == -1)) {
                String str = string;
                int i = a;
                int i2 = length;
                String str2 = string2;
                C37690c cVar = r0;
                C37690c cVar2 = new C37690c(activity, str, i, i2, str2, a2, length2);
                spannableStringBuilder.setSpan(cVar, a, length, 18);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(activity.getResources().getColor(R.color.w4)), a, length, 18);
                C37691d dVar = r0;
                C37691d dVar2 = new C37691d(activity, str, i, i2, str2, a2, length2);
                spannableStringBuilder.setSpan(dVar, a2, length2, 18);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(activity.getResources().getColor(R.color.w4)), a2, length2, 18);
            }
            return spannableStringBuilder;
        }

        /* renamed from: a */
        public final void mo95034a(Activity activity) {
            String str;
            C7573i.m23587b(activity, "context");
            Context context = activity;
            C10741a a = new C10741a(context).mo25650a((int) R.string.fx, (OnClickListener) new C37693f(activity));
            SpannableStringBuilder b = m120528b(activity);
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl personalizationMode = inst.getPersonalizationMode();
            C7573i.m23582a((Object) personalizationMode, "SharePrefCache.inst().personalizationMode");
            Integer num = (Integer) personalizationMode.mo59877d();
            if (num == null || num.intValue() != 2) {
                b.append("\n").append(activity.getString(R.string.fl6));
                a.mo25658b((int) R.string.dh6, (OnClickListener) new C37692e(activity));
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.k_, null);
            DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(R.id.dsf);
            C7573i.m23582a((Object) dmtTextView, "textView");
            dmtTextView.setHighlightColor(activity.getResources().getColor(17170445));
            dmtTextView.setText(b);
            dmtTextView.setMovementMethod(LinkMovementMethod.getInstance());
            View findViewById = inflate.findViewById(R.id.e3f);
            if (findViewById != null) {
                ((TextView) findViewById).setText(R.string.bte);
                String str2 = "show_personalization_ad_dialog";
                C22984d dVar = new C22984d();
                String str3 = "dialog_style";
                SharePrefCache inst2 = SharePrefCache.inst();
                C7573i.m23582a((Object) inst2, "SharePrefCache.inst()");
                C22903bl personalizationMode2 = inst2.getPersonalizationMode();
                C7573i.m23582a((Object) personalizationMode2, "SharePrefCache.inst().personalizationMode");
                Integer num2 = (Integer) personalizationMode2.mo59877d();
                if (num2 != null && num2.intValue() == 2) {
                    str = "choice";
                } else {
                    str = "notice";
                }
                C6907h.m21524a(str2, (Map) dVar.mo59973a(str3, str).f60753a);
                Dialog b2 = a.mo25652a(inflate).mo25656a().mo25638b();
                b2.setCancelable(false);
                b2.setCanceledOnTouchOutside(false);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }

        /* renamed from: f */
        public final void mo95035f(boolean z) {
            C23060u a = C23060u.m75742a();
            C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
            C22903bl ad = a.mo60060ad();
            C7573i.m23582a((Object) ad, "CommonSharePrefCache.inst().isEEARegion");
            Object d = ad.mo59877d();
            C7573i.m23582a(d, "CommonSharePrefCache.inst().isEEARegion.cache");
            if (((Boolean) d).booleanValue() || m120537f()) {
                C7213d a2 = C7213d.m22500a();
                C7573i.m23582a((Object) a2, "AbTestManager.getInstance()");
                if (a2.mo18763aa()) {
                    C37681a aVar = new C37681a(null);
                    C23060u a3 = C23060u.m75742a();
                    C7573i.m23582a((Object) a3, "CommonSharePrefCache.inst()");
                    C22903bl J = a3.mo60040J();
                    C7573i.m23582a((Object) J, "CommonSharePrefCache.ins…tOutGooglePersonalizedAds");
                    Object d2 = J.mo59877d();
                    C7573i.m23582a(d2, "CommonSharePrefCache.ins…oglePersonalizedAds.cache");
                    aVar.mo95033a(((Boolean) d2).booleanValue(), z);
                    m120538g(true);
                    if (z) {
                        m120533d(true);
                    }
                } else {
                    SharePrefCache inst = SharePrefCache.inst();
                    C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
                    C22903bl personalizationMode = inst.getPersonalizationMode();
                    C7573i.m23582a((Object) personalizationMode, "SharePrefCache.inst().personalizationMode");
                    personalizationMode.mo59871a(Integer.valueOf(0));
                    m120533d(true);
                    if (!z) {
                        C42961az.m136380a(new C37702c());
                    }
                }
            } else {
                SharePrefCache inst2 = SharePrefCache.inst();
                C7573i.m23582a((Object) inst2, "SharePrefCache.inst()");
                C22903bl personalizationMode2 = inst2.getPersonalizationMode();
                C7573i.m23582a((Object) personalizationMode2, "SharePrefCache.inst().personalizationMode");
                personalizationMode2.mo59871a(Integer.valueOf(1));
                m120533d(true);
                if (!z) {
                    C42961az.m136380a(new C37702c());
                }
            }
        }

        /* renamed from: a */
        public static void m120525a(Context context, C37694b bVar) {
            C7573i.m23587b(context, "context");
            C1592h.m7853a((Callable<TResult>) new C37688a<TResult>(context)).mo6876a((C1591g<TResult, TContinuationResult>) new C37689b<TResult,TContinuationResult>(bVar), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public static final void m120524a(boolean z) {
        f98179g.mo95035f(true);
    }
}
