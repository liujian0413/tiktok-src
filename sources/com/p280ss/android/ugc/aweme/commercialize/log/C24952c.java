package com.p280ss.android.ugc.aweme.commercialize.log;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24712af;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25026c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.c */
public final class C24952c implements C24712af {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f65800a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C24952c.class), "TIME_MAP", "getTIME_MAP()Ljava/util/HashMap;"))};

    /* renamed from: b */
    public static final C24952c f65801b = new C24952c();

    /* renamed from: c */
    private static final C7541d f65802c = C7546e.m23569a(C24953a.f65803a);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.c$a */
    static final class C24953a extends Lambda implements C7561a<HashMap<String, Long>> {

        /* renamed from: a */
        public static final C24953a f65803a = new C24953a();

        C24953a() {
            super(0);
        }

        /* renamed from: a */
        private static HashMap<String, Long> m81893a() {
            return new HashMap<>();
        }

        public final /* synthetic */ Object invoke() {
            return m81893a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.c$b */
    static final class C24954b<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C24951b f65804a;

        /* renamed from: b */
        final /* synthetic */ String f65805b;

        /* renamed from: c */
        final /* synthetic */ HashMap f65806c;

        C24954b(C24951b bVar, String str, HashMap hashMap) {
            this.f65804a = bVar;
            this.f65805b = str;
            this.f65806c = hashMap;
        }

        public final /* synthetic */ Object call() {
            m81894a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m81894a() {
            boolean z;
            String str;
            C24961b e = C24958f.m81905a().mo65266a("component_monitor").mo65276b(this.f65804a.f65798i).mo65283e(this.f65804a.f65797h);
            CharSequence charSequence = this.f65805b;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = "-1";
            } else {
                str = this.f65805b;
            }
            C24961b c = e.mo65280c(str);
            String str2 = this.f65804a.f65790a;
            if (str2 == null) {
                str2 = "-1";
            }
            c.mo65282d(str2).mo65286h(this.f65804a.f65792c).mo65265a((Object) this.f65806c).mo65278b();
        }
    }

    private C24952c() {
    }

    /* renamed from: a */
    private final HashMap<String, Long> m81876a() {
        return (HashMap) f65802c.getValue();
    }

    /* renamed from: a */
    public final void mo64682a(List<? extends Aweme> list) {
        m81887b(list);
        C24972q.f65846a.mo65289a(list);
        C24972q.f65846a.mo65290b(list);
        C25026c.f66008a.mo65483a(list);
    }

    /* renamed from: a */
    public final void mo65239a(String str) {
        C7573i.m23587b(str, "groupId");
        String str2 = str;
        m81884a("link", "data_received", "-1", "", str2, -1);
        m81884a("link", "preload_start", "-1", "", str2, -1);
    }

    /* renamed from: a */
    public final void mo65238a(Aweme aweme, LinkData linkData) {
        if (aweme != null && linkData != null) {
            m81884a("link", "show_result", linkData.creativeId, linkData.logExtra, aweme.getAid(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        if (r10 == null) goto L_0x000f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m81883a(java.lang.String r8, java.lang.String r9, java.lang.Long r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r7 = this;
            if (r10 == 0) goto L_0x000f
            long r0 = r10.longValue()
            java.lang.String r10 = java.lang.String.valueOf(r0)
            if (r10 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r3 = r10
            goto L_0x0012
        L_0x000f:
            java.lang.String r10 = "-1"
            goto L_0x000d
        L_0x0012:
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r0.m81884a(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.log.C24952c.m81883a(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m81884a(String str, String str2, String str3, String str4, String str5, int i) {
        C7573i.m23587b(str, "refer");
        C7573i.m23587b(str2, "label");
        mo65237a(new C24951b(str, str2, i).mo65230a(str5).mo65232b(str3).mo65233c(str4));
    }

    /* renamed from: a */
    public final void mo65237a(C24951b bVar) {
        C7573i.m23587b(bVar, "param");
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        if (a.getEnablePreloadComponent().booleanValue()) {
            String str = bVar.f65797h;
            String str2 = bVar.f65798i;
            String str3 = bVar.f65790a;
            if (str3 == null) {
                str3 = "-1";
            }
            HashMap a2 = m81877a(str, str2, str3, bVar.f65799j);
            String str4 = bVar.f65793d;
            CharSequence charSequence = str4;
            boolean z = false;
            if (!(charSequence == null || charSequence.length() == 0)) {
                a2.put("reason", str4);
            }
            String str5 = bVar.f65794e;
            CharSequence charSequence2 = str5;
            if (!(charSequence2 == null || charSequence2.length() == 0)) {
                a2.put("type", str5);
            }
            String str6 = bVar.f65795f;
            CharSequence charSequence3 = str6;
            if (charSequence3 == null || charSequence3.length() == 0) {
                z = true;
            }
            if (!z) {
                a2.put("extra_id", str6);
            }
            HashMap<String, String> hashMap = bVar.f65796g;
            if (hashMap != null) {
                a2.put("play_fun_data", hashMap);
            }
            C1592h.m7855a((Callable<TResult>) new C24954b<TResult>(bVar, bVar.f65791b, a2), (Executor) C6907h.m21516a());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x000f A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m81887b(java.util.List<? extends com.p280ss.android.ugc.aweme.feed.model.Aweme> r12) {
        /*
            if (r12 == 0) goto L_0x0079
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r12 = r12.iterator()
        L_0x000f:
            boolean r1 = r12.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r12.next()
            r3 = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r3
            boolean r4 = r3.isAd()
            if (r4 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x002d
            java.util.Map r2 = r3.getCardInfos()
        L_0x002d:
            if (r2 == 0) goto L_0x0031
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            if (r2 == 0) goto L_0x000f
            r0.add(r1)
            goto L_0x000f
        L_0x0038:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r12 = r0.iterator()
        L_0x0040:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r12.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.commercialize.log.c r3 = f65801b
            java.lang.String r4 = "card"
            java.lang.String r5 = "data_received"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r0.getAwemeRawAd()
            if (r1 == 0) goto L_0x005e
            java.lang.Long r1 = r1.getCreativeId()
            r6 = r1
            goto L_0x005f
        L_0x005e:
            r6 = r2
        L_0x005f:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r0.getAwemeRawAd()
            if (r1 == 0) goto L_0x006b
            java.lang.String r1 = r1.getLogExtra()
            r7 = r1
            goto L_0x006c
        L_0x006b:
            r7 = r2
        L_0x006c:
            java.lang.String r8 = r0.getAid()
            r9 = 0
            r10 = 32
            r11 = 0
            r3.m81883a(r4, r5, r6, r7, r8, -1)
            goto L_0x0040
        L_0x0078:
            return
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.log.C24952c.m81887b(java.util.List):void");
    }

    /* renamed from: a */
    public static void m81880a(Aweme aweme) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                f65801b.m81883a("card", "preload_start", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), -1);
            }
        }
    }

    /* renamed from: b */
    public static void m81886b(Aweme aweme, int i) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                f65801b.m81883a("card", "show_result", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), i);
            }
        }
    }

    /* renamed from: a */
    public static void m81881a(Aweme aweme, int i) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                f65801b.m81883a("card", "preload_result", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), i);
            }
        }
    }

    /* renamed from: a */
    public static void m81882a(String str, LinkData linkData) {
        C7573i.m23587b(str, "groupId");
        if (linkData != null) {
            f65801b.m81884a("link", "preload_result", linkData.creativeId, linkData.logExtra, str, 0);
        }
    }

    /* renamed from: b */
    private final int m81885b(String str, String str2, String str3) {
        if (m81876a().get(m81888c(str, str2, str3)) == null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    private static String m81888c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        sb.append('_');
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    private final long m81875a(String str, String str2, String str3) {
        String str4;
        m81876a().put(m81888c(str, str2, str3), Long.valueOf(System.currentTimeMillis()));
        int hashCode = str2.hashCode();
        if (hashCode == -1942410580) {
            if (str2.equals("preload_start")) {
                str4 = "data_received";
            }
            return 0;
        } else if (hashCode != -127128813) {
            if (hashCode == 497550239 && str2.equals("show_result")) {
                str4 = "preload_result";
            }
            return 0;
        } else {
            if (str2.equals("preload_result")) {
                str4 = "preload_start";
            }
            return 0;
        }
        Long l = (Long) m81876a().get(m81888c(str, str4, str3));
        if (l == null) {
            return -1;
        }
        return System.currentTimeMillis() - l.longValue();
    }

    /* renamed from: a */
    private final HashMap<String, Object> m81877a(String str, String str2, String str3, int i) {
        long j;
        HashMap<String, Object> hashMap = new HashMap<>();
        int b = m81885b(str, str2, str3);
        Map map = hashMap;
        map.put("is_first", Integer.valueOf(b));
        String str4 = "time_interval";
        if (b == 1) {
            j = m81875a(str, str2, str3);
        } else {
            j = 0;
        }
        map.put(str4, Long.valueOf(j));
        if (i != -1) {
            map.put("result", Integer.valueOf(i));
        }
        return hashMap;
    }
}
