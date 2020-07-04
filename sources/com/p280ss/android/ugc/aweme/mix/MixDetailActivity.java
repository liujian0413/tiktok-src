package com.p280ss.android.ugc.aweme.mix;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28506u;
import com.p280ss.android.ugc.aweme.mix.MixDetailFragment.C33480a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.MixDetailActivity */
public final class MixDetailActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C33478a f87435a = new C33478a(null);

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailActivity$a */
    public static final class C33478a {
        private C33478a() {
        }

        public /* synthetic */ C33478a(C7571f fVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
            if (r0 == null) goto L_0x003a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo85813a(android.content.Context r12, com.p280ss.android.ugc.aweme.feed.model.Aweme r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
            /*
                r11 = this;
                java.lang.String r1 = "context"
                r2 = r12
                kotlin.jvm.internal.C7573i.m23587b(r12, r1)
                java.lang.String r1 = "mixId"
                r3 = r14
                kotlin.jvm.internal.C7573i.m23587b(r14, r1)
                java.lang.String r1 = "eventType"
                r6 = r15
                kotlin.jvm.internal.C7573i.m23587b(r15, r1)
                java.lang.String r1 = "enterMethod"
                r7 = r16
                kotlin.jvm.internal.C7573i.m23587b(r7, r1)
                r1 = 0
                if (r13 == 0) goto L_0x002e
                com.ss.android.ugc.aweme.feed.model.MixStruct r4 = r13.getMixInfo()
                if (r4 == 0) goto L_0x002e
                com.ss.android.ugc.aweme.feed.model.MixStatisStruct r4 = r4.statis
                if (r4 == 0) goto L_0x002e
                long r4 = r4.currentEpisode
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r10 = r4
                goto L_0x002f
            L_0x002e:
                r10 = r1
            L_0x002f:
                if (r13 == 0) goto L_0x003a
                java.lang.String r0 = r13.getAuthorUid()
                if (r0 != 0) goto L_0x0038
                goto L_0x003a
            L_0x0038:
                r4 = r0
                goto L_0x003d
            L_0x003a:
                java.lang.String r0 = ""
                goto L_0x0038
            L_0x003d:
                java.lang.String r5 = ""
                android.os.Bundle r8 = new android.os.Bundle
                r8.<init>()
                if (r10 == 0) goto L_0x0050
                long r0 = r10.longValue()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r9 = r0
                goto L_0x0051
            L_0x0050:
                r9 = r1
            L_0x0051:
                r2 = r12
                r3 = r14
                r6 = r15
                r7 = r16
                m108255a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.MixDetailActivity.C33478a.mo85813a(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* renamed from: a */
        private static void m108255a(Context context, String str, String str2, String str3, String str4, String str5, Bundle bundle, String str6, Long l) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(str, "mixId");
            C7573i.m23587b(str2, "authorUid");
            C7573i.m23587b(str3, "authorSuid");
            C7573i.m23587b(str4, "eventType");
            C7573i.m23587b(str5, "enterMethod");
            C7573i.m23587b(bundle, "extras");
            C28506u.m93700a(null, str, str2, str4, str5);
            Intent intent = new Intent(context, MixDetailActivity.class);
            bundle.putString("mix_id", str);
            bundle.putString("event_type", str4);
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("mix_from_order", str6);
            }
            if (l != null && l.longValue() > 0) {
                bundle.putLong("mix_enter_episode_num", l.longValue());
            }
            intent.putExtras(bundle);
            context.startActivity(intent);
        }

        /* renamed from: a */
        public static /* synthetic */ void m108256a(C33478a aVar, Context context, String str, String str2, String str3, String str4, String str5, Bundle bundle, String str6, Long l, int i, Object obj) {
            Bundle bundle2;
            Long l2;
            int i2 = i;
            if ((i2 & 64) != 0) {
                bundle2 = new Bundle();
            } else {
                bundle2 = bundle;
            }
            if ((i2 & 256) != 0) {
                l2 = null;
            } else {
                l2 = l;
            }
            m108255a(context, str, str2, str3, str4, str5, bundle2, null, l2);
        }
    }

    /* renamed from: a */
    public static final void m108253a(Context context, Aweme aweme, String str, String str2, String str3) {
        f87435a.mo85813a(context, aweme, str, str2, str3);
    }

    /* renamed from: a */
    public static final void m108254a(Context context, String str, String str2, String str3, String str4, String str5) {
        C33478a.m108256a(f87435a, context, str, str2, str3, str4, str5, null, null, null, 448, null);
    }

    public final int getStatusBarColor() {
        return getResources().getColor(R.color.ayd);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.da);
        String stringExtra = getIntent().getStringExtra("mix_id");
        String stringExtra2 = getIntent().getStringExtra("uid");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        String stringExtra3 = getIntent().getStringExtra("event_type");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        String stringExtra4 = getIntent().getStringExtra("mix_from_order");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        C7573i.m23582a((Object) stringExtra, "mixId");
        getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, (Fragment) C33480a.m108296a(stringExtra, stringExtra2, stringExtra3, stringExtra4, Long.valueOf(getIntent().getLongExtra("mix_enter_episode_num", 0)))).mo2604c();
    }
}
