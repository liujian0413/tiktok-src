package com.p280ss.android.ugc.aweme.p313im.sdk.p314d;

import android.text.TextUtils;
import com.bytedance.p263im.core.p586b.C11209d;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C6944i;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C31474d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.ImApi;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.g */
public final class C6967g {

    /* renamed from: a */
    public static final C6968a f19681a = new C6968a(null);

    /* renamed from: b */
    private final C47562b f19682b;

    /* renamed from: c */
    private int f19683c;

    /* renamed from: d */
    private boolean f19684d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.g$a */
    public static final class C6968a {
        private C6968a() {
        }

        /* renamed from: a */
        public static C6967g m21708a() {
            return C6969b.f19685a;
        }

        public /* synthetic */ C6968a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.g$b */
    static final class C6969b {

        /* renamed from: a */
        public static final C6967g f19685a = new C6967g(null);

        /* renamed from: b */
        public static final C6969b f19686b = new C6969b();

        private C6969b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.g$c */
    static final class C6970c<T> implements C7326g<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C6967g f19687a;

        C6970c(C6967g gVar) {
            this.f19687a = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f19687a.mo18040b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.g$d */
    static final class C6971d<T> implements C7326g<C31474d> {

        /* renamed from: a */
        final /* synthetic */ C6967g f19688a;

        /* renamed from: b */
        final /* synthetic */ int f19689b;

        C6971d(C6967g gVar, int i) {
            this.f19688a = gVar;
            this.f19689b = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C31474d dVar) {
            C6967g gVar = this.f19688a;
            String str = dVar.f82424c;
            int i = this.f19689b;
            String dVar2 = dVar.toString();
            C7573i.m23582a((Object) dVar2, "it.toString()");
            gVar.mo18039a(true, str, null, i, 1, dVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.g$e */
    static final class C6972e<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C6967g f19690a;

        /* renamed from: b */
        final /* synthetic */ int f19691b;

        C6972e(C6967g gVar, int i) {
            this.f19690a = gVar;
            this.f19691b = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            this.f19690a.mo18039a(true, null, th, this.f19691b, 1, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.g$f */
    static final class C6973f<T> implements C7326g<Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f19692a;

        C6973f(boolean z) {
            this.f19692a = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Boolean bool) {
            C6956a.m21632a();
            C6956a.m21634c();
            if (this.f19692a) {
                C31863ai.m103534c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.g$g */
    static final class C6974g<T> implements C7326g<C31474d> {

        /* renamed from: a */
        final /* synthetic */ C6967g f19693a;

        /* renamed from: b */
        final /* synthetic */ boolean f19694b;

        /* renamed from: c */
        final /* synthetic */ int f19695c;

        /* renamed from: d */
        final /* synthetic */ boolean f19696d;

        C6974g(C6967g gVar, boolean z, int i, boolean z2) {
            this.f19693a = gVar;
            this.f19694b = z;
            this.f19695c = i;
            this.f19696d = z2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C31474d dVar) {
            C6967g.m21698a(dVar.f82422a);
            C6967g.m21699a(dVar.f82423b);
            C6967g gVar = this.f19693a;
            boolean z = this.f19694b;
            String str = dVar.f82424c;
            int i = this.f19695c;
            int a = C6967g.m21694a(this.f19696d);
            String dVar2 = dVar.toString();
            C7573i.m23582a((Object) dVar2, "it.toString()");
            gVar.mo18039a(z, str, null, i, a, dVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.g$h */
    static final class C6975h<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C6967g f19697a;

        /* renamed from: b */
        final /* synthetic */ boolean f19698b;

        /* renamed from: c */
        final /* synthetic */ int f19699c;

        /* renamed from: d */
        final /* synthetic */ boolean f19700d;

        C6975h(C6967g gVar, boolean z, int i, boolean z2) {
            this.f19697a = gVar;
            this.f19698b = z;
            this.f19699c = i;
            this.f19700d = z2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            this.f19697a.mo18039a(this.f19698b, null, th, this.f19699c, C6967g.m21694a(this.f19700d), "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.g$i */
    static final class C6976i<T> implements C7326g<C31474d> {

        /* renamed from: a */
        final /* synthetic */ C6967g f19701a;

        C6976i(C6967g gVar) {
            this.f19701a = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C31474d dVar) {
            int i;
            C7076p a = C7076p.m22077a();
            C7573i.m23582a((Object) a, "IMSPUtils.get()");
            String n = a.mo18330n();
            if (TextUtils.isEmpty(dVar.f82424c)) {
                C6967g.m21700a((Throwable) null);
                i = 0;
            } else {
                C7076p a2 = C7076p.m22077a();
                C7573i.m23582a((Object) a2, "IMSPUtils.get()");
                a2.mo18307c(dVar.f82424c);
                C31863ai.m103537d();
                i = 1;
            }
            C6967g gVar = this.f19701a;
            C7573i.m23582a((Object) n, "localToken");
            String dVar2 = dVar.toString();
            C7573i.m23582a((Object) dVar2, "it.toString()");
            gVar.mo18037a(2, n, 1, i, "", dVar2, dVar.f82424c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.g$j */
    static final class C6977j<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C6967g f19702a;

        C6977j(C6967g gVar) {
            this.f19702a = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C6967g.m21700a(th);
            C6967g gVar = this.f19702a;
            C7076p a = C7076p.m22077a();
            C7573i.m23582a((Object) a, "IMSPUtils.get()");
            String n = a.mo18330n();
            C7573i.m23582a((Object) n, "IMSPUtils.get().token");
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            gVar.mo18037a(2, n, 1, 0, message, "", null);
        }
    }

    /* renamed from: a */
    public static int m21694a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: d */
    public static final C6967g m21701d() {
        return C6968a.m21708a();
    }

    /* renamed from: a */
    public final void mo18038a(boolean z, int i) {
        boolean z2;
        Boolean bool;
        this.f19683c = 0;
        this.f19682b.mo119660a();
        if (C7074e.m22066a()) {
            C7076p a = C7076p.m22077a();
            C7573i.m23582a((Object) a, "IMSPUtils.get()");
            boolean isEmpty = TextUtils.isEmpty(a.mo18330n());
            if (!isEmpty) {
                this.f19682b.mo119661a(C7319aa.m22930a(Boolean.valueOf(true)).mo19127a(C47549a.m148327a()).mo19140d((C7326g<? super T>) new C6973f<Object>(z)));
            }
            if (z) {
                boolean z3 = isEmpty || C7076p.m22077a().mo18334r();
                if (C7063bg.m22048a()) {
                    C7076p a2 = C7076p.m22077a();
                    C7573i.m23582a((Object) a2, "IMSPUtils.get()");
                    if (!a2.mo18311d()) {
                        z2 = true;
                        IESSettingsProxy a3 = C30199h.m98861a();
                        C7573i.m23582a((Object) a3, "SettingsReader.get()");
                        FlipChatSettings flipchatSettings = a3.getFlipchatSettings();
                        C7573i.m23582a((Object) flipchatSettings, "SettingsReader.get().flipchatSettings");
                        bool = flipchatSettings.getMainSwitch();
                        C47562b bVar = this.f19682b;
                        ImApi a4 = C7077s.m22142a();
                        C7573i.m23582a((Object) bool, "needRChat");
                        bVar.mo119661a(a4.fetchMixInit(m21694a(bool.booleanValue()), m21694a(z2), m21694a(z3)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C6974g<Object>(this, isEmpty, i, z3), (C7326g<? super Throwable>) new C6975h<Object>(this, isEmpty, i, z3)));
                        this.f19684d = true;
                    }
                }
                z2 = false;
                try {
                    IESSettingsProxy a32 = C30199h.m98861a();
                    C7573i.m23582a((Object) a32, "SettingsReader.get()");
                    FlipChatSettings flipchatSettings2 = a32.getFlipchatSettings();
                    C7573i.m23582a((Object) flipchatSettings2, "SettingsReader.get().flipchatSettings");
                    bool = flipchatSettings2.getMainSwitch();
                } catch (Exception unused) {
                    bool = Boolean.valueOf(false);
                }
                C47562b bVar2 = this.f19682b;
                ImApi a42 = C7077s.m22142a();
                C7573i.m23582a((Object) bool, "needRChat");
                bVar2.mo119661a(a42.fetchMixInit(m21694a(bool.booleanValue()), m21694a(z2), m21694a(z3)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C6974g<Object>(this, isEmpty, i, z3), (C7326g<? super Throwable>) new C6975h<Object>(this, isEmpty, i, z3)));
                this.f19684d = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18039a(boolean r11, java.lang.String r12, java.lang.Throwable r13, int r14, int r15, java.lang.String r16) {
        /*
            r10 = this;
            r8 = r10
            r9 = r12
            r0 = r9
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x004f
            int r0 = r8.f19683c
            if (r0 != 0) goto L_0x0039
            com.ss.android.ugc.aweme.im.sdk.utils.p r0 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()
            java.lang.String r1 = "IMSPUtils.get()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r2 = r0.mo18330n()
            java.lang.String r0 = "IMSPUtils.get().token"
            kotlin.jvm.internal.C7573i.m23582a(r2, r0)
            r4 = 0
            if (r13 == 0) goto L_0x002d
            java.lang.String r0 = r13.getMessage()
            if (r0 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r5 = r0
            goto L_0x0030
        L_0x002d:
            java.lang.String r0 = ""
            goto L_0x002b
        L_0x0030:
            r0 = r10
            r1 = r14
            r3 = r15
            r6 = r16
            r7 = r12
            r0.mo18037a(r1, r2, r3, r4, r5, r6, r7)
        L_0x0039:
            if (r11 == 0) goto L_0x004b
            int r0 = r8.f19683c
            r1 = 50
            if (r0 > r1) goto L_0x004b
            int r0 = r8.f19683c
            int r0 = r0 + 1
            r8.f19683c = r0
            r1 = r14
            r10.m21696a(r14)
        L_0x004b:
            m21700a(r13)
            return
        L_0x004f:
            r1 = r14
            com.ss.android.ugc.aweme.im.sdk.utils.p r0 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()
            java.lang.String r2 = "IMSPUtils.get()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.String r2 = r0.mo18330n()
            java.lang.String r0 = "IMSPUtils.get().token"
            kotlin.jvm.internal.C7573i.m23582a(r2, r0)
            r4 = 1
            java.lang.String r5 = ""
            r0 = r10
            r3 = r15
            r6 = r16
            r7 = r12
            r0.mo18037a(r1, r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.im.sdk.utils.p r0 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()
            java.lang.String r1 = "IMSPUtils.get()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r0.mo18307c(r12)
            if (r11 == 0) goto L_0x0084
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a.m21632a()
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a.m21634c()
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai.m103534c()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6967g.mo18039a(boolean, java.lang.String, java.lang.Throwable, int, int, java.lang.String):void");
    }

    private C6967g() {
        this.f19682b = new C47562b();
    }

    /* renamed from: b */
    public final void mo18040b() {
        C6967g gVar;
        if (!this.f19684d) {
            gVar = this;
        } else {
            gVar = null;
        }
        C6967g gVar2 = gVar;
        if (gVar2 != null) {
            gVar2.mo18038a(true, 3);
        }
    }

    /* renamed from: c */
    public final void mo18041c() {
        if (C7074e.m22066a()) {
            this.f19682b.mo119661a(C7077s.m22142a().fetchMixInit(0, 0, 1).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C6976i<Object>(this), (C7326g<? super Throwable>) new C6977j<Object>(this)));
        }
    }

    /* renamed from: a */
    public final void mo18036a() {
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        C7103h f = a.mo18009f();
        C7573i.m23582a((Object) f, "AwemeImManager.instance().proxy");
        long springApiLimitedTime = f.getSpringApiLimitedTime();
        if (springApiLimitedTime > 0) {
            mo18038a(false, 0);
            this.f19682b.mo119661a(C7319aa.m22930a(Boolean.valueOf(true)).mo19132b(springApiLimitedTime, TimeUnit.MILLISECONDS).mo19127a(C47549a.m148327a()).mo19140d((C7326g<? super T>) new C6970c<Object>(this)));
            return;
        }
        mo18038a(true, 0);
    }

    public /* synthetic */ C6967g(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public static void m21700a(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("service", "fetch_token_failed");
            if (th != null) {
                jSONObject.put("error", th.toString());
            }
            C11209d.m32829a("chat_room", "fetch_token_failed", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private final void m21696a(int i) {
        if (C7074e.m22066a()) {
            this.f19682b.mo119661a(C7077s.m22142a().fetchMixInit(0, 0, 1).mo19286a(5, TimeUnit.SECONDS, true).mo19304b(C7333a.m23044b()).mo19295a(C47549a.m148327a(), true).mo19280a((C7326g<? super T>) new C6971d<Object>(this, i), (C7326g<? super Throwable>) new C6972e<Object>(this, i)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (r2 == r0) goto L_0x003c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21698a(com.p280ss.android.ugc.aweme.p313im.sdk.model.C31475e r8) {
        /*
            if (r8 == 0) goto L_0x007a
            com.ss.android.ugc.aweme.im.sdk.utils.p r0 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()
            java.lang.String r1 = "IMSPUtils.get()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            long r0 = r0.mo18320g()
            long r2 = r8.f82425a
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x007a
            java.lang.String r4 = "im_flip_chat"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "fetchRebootMiscState-delTime="
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.p280ss.android.agilelogger.ALog.m20871e(r4, r5)
            r4 = 0
            r5 = 1
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x003e
            com.ss.android.ugc.aweme.im.sdk.utils.p r4 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()
            java.lang.String r6 = "IMSPUtils.get()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r6)
            r4.mo18292a(r2)
        L_0x003c:
            r4 = 1
            goto L_0x0043
        L_0x003e:
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0043
            goto L_0x003c
        L_0x0043:
            long r6 = r8.f82426b
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0056
            com.ss.android.ugc.aweme.im.sdk.utils.p r8 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()
            java.lang.String r0 = "IMSPUtils.get()"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            r8.mo18292a(r2)
            r4 = 1
        L_0x0056:
            if (r4 == 0) goto L_0x007a
            com.ss.android.ugc.aweme.im.sdk.utils.p r8 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()
            java.lang.String r0 = "IMSPUtils.get()"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            boolean r8 = r8.mo18318f()
            if (r8 != 0) goto L_0x007a
            com.ss.android.ugc.aweme.im.sdk.utils.p r8 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()
            java.lang.String r0 = "IMSPUtils.get()"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            r8.mo18303b(r5)
            com.ss.android.ugc.aweme.im.sdk.d.j r8 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6978j.m21717a()
            r8.mo18059j()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6967g.m21698a(com.ss.android.ugc.aweme.im.sdk.model.e):void");
    }

    /* renamed from: a */
    public static void m21699a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            C7076p a = C7076p.m22077a();
            C7573i.m23582a((Object) a, "IMSPUtils.get()");
            if (!a.mo18311d()) {
                C7076p a2 = C7076p.m22077a();
                C7573i.m23582a((Object) a2, "IMSPUtils.get()");
                a2.mo18297a(true);
            }
        }
    }

    /* renamed from: a */
    private static HashMap<String, Object> m21695a(int i, String str, int i2, int i3, String str2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        Map map = hashMap;
        map.put("reason", Integer.valueOf(i));
        map.put("local_token", str);
        map.put("need_token", Integer.valueOf(i2));
        map.put("status", Integer.valueOf(i3));
        map.put("error_msg", str2);
        return hashMap;
    }

    /* renamed from: a */
    public final void mo18037a(int i, String str, int i2, int i3, String str2, String str3, String str4) {
        HashMap a = m21695a(i, str, i2, i3, str2);
        if (i3 == 0) {
            C7074e.m22070b("im_reboot_misc_query", a);
        }
        C6944i.f19642b.mo17976a(str, str4, i, i3);
        Map map = a;
        String str5 = "token";
        if (str4 == null) {
            str4 = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        map.put(str5, str4);
        map.put("resp", str3);
        StringBuilder sb = new StringBuilder("im_reboot_misc_query ");
        sb.append(a);
        C6921a.m21555a(sb.toString());
    }
}
