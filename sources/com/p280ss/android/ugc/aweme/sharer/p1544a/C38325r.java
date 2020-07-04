package com.p280ss.android.ugc.aweme.sharer.p1544a;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.provider.Telephony.Sms;
import com.p280ss.android.ugc.aweme.sharer.C38290a;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38357h;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.C38359j;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.r */
public final class C38325r extends C38290a {

    /* renamed from: a */
    public static final C38326a f99532a = new C38326a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.r$a */
    public static final class C38326a {
        private C38326a() {
        }

        public /* synthetic */ C38326a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo95736a() {
        return R.drawable.atj;
    }

    /* renamed from: b */
    public final String mo95739b() {
        return "sms";
    }

    /* renamed from: c */
    public final String mo95740c() {
        return "SMS";
    }

    /* renamed from: e */
    public final int mo95742e() {
        return R.drawable.azu;
    }

    /* renamed from: a */
    public final boolean mo95737a(Context context, C38354f fVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(fVar, C38347c.f99553h);
        return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    /* renamed from: a */
    public final boolean mo95744a(C38357h hVar, Context context) {
        Intent intent;
        C7573i.m23587b(hVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        if (VERSION.SDK_INT >= 19) {
            intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", hVar.f99567b);
            String defaultSmsPackage = Sms.getDefaultSmsPackage(context);
            if (defaultSmsPackage != null) {
                intent.setPackage(defaultSmsPackage);
            }
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.setType("vnd.android-dir/mms-sms");
            intent.putExtra("android.intent.extra.STREAM", hVar.f99567b);
        }
        return mo95934a(context, intent);
    }

    /* renamed from: a */
    public final boolean mo95745a(C38358i iVar, Context context) {
        Intent intent;
        C7573i.m23587b(iVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        if (VERSION.SDK_INT >= 19) {
            intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", iVar.f99573d);
            String defaultSmsPackage = Sms.getDefaultSmsPackage(context);
            if (defaultSmsPackage != null) {
                intent.setPackage(defaultSmsPackage);
            }
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.setType("vnd.android-dir/mms-sms");
            intent.putExtra("sms_body", iVar.f99573d);
        }
        return mo95934a(context, intent);
    }

    /* renamed from: a */
    public final boolean mo95746a(C38359j jVar, Context context) {
        Intent intent;
        C7573i.m23587b(jVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        if (VERSION.SDK_INT >= 19) {
            intent = new Intent("android.intent.action.SEND");
            intent.setType("video/*");
            intent.putExtra("android.intent.extra.STREAM", jVar.f99575b);
            String defaultSmsPackage = Sms.getDefaultSmsPackage(context);
            if (defaultSmsPackage != null) {
                intent.setPackage(defaultSmsPackage);
            }
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.setType("vnd.android-dir/mms-sms");
            intent.putExtra("android.intent.extra.STREAM", jVar.f99575b);
        }
        return mo95934a(context, intent);
    }
}
