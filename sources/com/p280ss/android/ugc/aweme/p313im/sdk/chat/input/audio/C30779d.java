package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30931f.C30933a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C6946a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d */
public final class C30779d implements C30796m {

    /* renamed from: b */
    public static final C30781b f80567b = new C30781b(null);

    /* renamed from: a */
    public Message f80568a;

    /* renamed from: c */
    private C30782e f80569c;

    /* renamed from: d */
    private List<Message> f80570d;

    /* renamed from: e */
    private C30795l f80571e;

    /* renamed from: f */
    private Message f80572f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d$a */
    public final class C30780a implements C30933a {

        /* renamed from: a */
        public final Message f80573a;

        /* renamed from: b */
        final /* synthetic */ C30779d f80574b;

        /* renamed from: a */
        public final void mo80606a(Throwable th) {
        }

        public C30780a(C30779d dVar, Message message) {
            C7573i.m23587b(message, "message");
            this.f80574b = dVar;
            this.f80573a = message;
        }

        /* renamed from: a */
        public final void mo80605a(String str, UrlModel urlModel) {
            boolean z;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && this.f80574b.f80568a != null) {
                C30779d.m100251a(this.f80573a, str);
                if (C7573i.m23585a((Object) this.f80573a, (Object) this.f80574b.f80568a)) {
                    this.f80574b.mo80600a(this.f80573a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d$b */
    public static final class C30781b {
        private C30781b() {
        }

        public /* synthetic */ C30781b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: e */
    public final void mo80604e() {
        this.f80572f = null;
        C30795l lVar = this.f80571e;
        if (lVar == null) {
            C7573i.m23583a("callback");
        }
        lVar.mo80584f();
    }

    /* renamed from: a */
    public final void mo80596a() {
        C30782e eVar = this.f80569c;
        if (eVar == null) {
            C7573i.m23583a("playManager");
        }
        eVar.mo80613e();
    }

    /* renamed from: b */
    public final void mo80601b() {
        C30782e eVar = this.f80569c;
        if (eVar == null) {
            C7573i.m23583a("playManager");
        }
        eVar.mo80614f();
    }

    /* renamed from: c */
    public final void mo80602c() {
        C30782e eVar = this.f80569c;
        if (eVar == null) {
            C7573i.m23583a("playManager");
        }
        eVar.mo80612d();
        List<Message> list = this.f80570d;
        if (list == null) {
            C7573i.m23583a("messageQueue");
        }
        list.clear();
    }

    /* renamed from: d */
    public final void mo80603d() {
        C30795l lVar = this.f80571e;
        if (lVar == null) {
            C7573i.m23583a("callback");
        }
        lVar.mo80584f();
        Message f = m100259f();
        if (f != null) {
            mo80600a(f);
        } else {
            this.f80572f = null;
        }
    }

    /* renamed from: f */
    private final Message m100259f() {
        if (this.f80572f == null) {
            return null;
        }
        List<Message> list = this.f80570d;
        if (list == null) {
            C7573i.m23583a("messageQueue");
        }
        Message message = this.f80572f;
        if (message == null) {
            C7573i.m23580a();
        }
        int indexOf = list.indexOf(message);
        if (indexOf >= 0) {
            List<Message> list2 = this.f80570d;
            if (list2 == null) {
                C7573i.m23583a("messageQueue");
            }
            if (indexOf < list2.size()) {
                for (int i = indexOf - 1; i >= 0; i--) {
                    List<Message> list3 = this.f80570d;
                    if (list3 == null) {
                        C7573i.m23583a("messageQueue");
                    }
                    Message message2 = (Message) list3.get(i);
                    if (m100258e(message2)) {
                        return message2;
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    private final void m100255b(Message message) {
        C6946a.m21606a().mo18000a(null, message, new C30780a(this, message));
    }

    /* renamed from: d */
    private static boolean m100257d(Message message) {
        if (message.isDeleted() || message.isRecalled()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m100260f(Message message) {
        if (message.getMsgType() != 17 || message.isSelf()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static File m100256c(Message message) {
        boolean z;
        String str = (String) message.getLocalExt().get("localpath");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        return file;
    }

    /* renamed from: e */
    private static boolean m100258e(Message message) {
        if (message.isDeleted() || message.isRecalled() || TextUtils.equals((CharSequence) message.getLocalExt().get("isPlayed"), "1")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80598a(java.util.List<com.bytedance.p263im.core.model.Message> r7) {
        /*
            r6 = this;
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x0014
            return
        L_0x0014:
            com.bytedance.im.core.model.Message r0 = r6.f80572f
            if (r0 == 0) goto L_0x0030
            java.util.List<com.bytedance.im.core.model.Message> r0 = r6.f80570d
            if (r0 != 0) goto L_0x0021
            java.lang.String r3 = "messageQueue"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0021:
            com.bytedance.im.core.model.Message r3 = r6.f80572f
            if (r3 != 0) goto L_0x0028
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0028:
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            java.util.List<com.bytedance.im.core.model.Message> r3 = r6.f80570d
            if (r3 != 0) goto L_0x003a
            java.lang.String r4 = "messageQueue"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x003a:
            r3.clear()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0043:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r7.next()
            com.bytedance.im.core.model.Message r3 = (com.bytedance.p263im.core.model.Message) r3
            if (r3 == 0) goto L_0x0043
            boolean r4 = m100260f(r3)
            if (r4 == 0) goto L_0x0043
            java.util.List<com.bytedance.im.core.model.Message> r4 = r6.f80570d
            if (r4 != 0) goto L_0x0060
            java.lang.String r5 = "messageQueue"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x0060:
            r4.add(r3)
            goto L_0x0043
        L_0x0064:
            com.bytedance.im.core.model.Message r7 = r6.f80572f
            if (r7 != 0) goto L_0x0069
            return
        L_0x0069:
            java.util.List<com.bytedance.im.core.model.Message> r7 = r6.f80570d
            if (r7 != 0) goto L_0x0072
            java.lang.String r3 = "messageQueue"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0072:
            com.bytedance.im.core.model.Message r3 = r6.f80572f
            if (r3 != 0) goto L_0x0079
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0079:
            int r7 = r7.indexOf(r3)
            r3 = 0
            if (r0 == 0) goto L_0x0086
            if (r7 >= 0) goto L_0x0086
            r6.mo80599a(false)
            return
        L_0x0086:
            if (r7 < 0) goto L_0x00ae
            java.util.List<com.bytedance.im.core.model.Message> r0 = r6.f80570d
            if (r0 != 0) goto L_0x0091
            java.lang.String r4 = "messageQueue"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0091:
            java.lang.Object r7 = r0.get(r7)
            com.bytedance.im.core.model.Message r7 = (com.bytedance.p263im.core.model.Message) r7
            r6.f80572f = r7
            com.bytedance.im.core.model.Message r7 = r6.f80572f
            if (r7 != 0) goto L_0x00a0
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00a0:
            boolean r0 = m100257d(r7)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r7 = r3
        L_0x00a9:
            if (r7 == 0) goto L_0x00ae
            r6.mo80599a(false)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.C30779d.mo80598a(java.util.List):void");
    }

    /* renamed from: a */
    public final void mo80599a(boolean z) {
        this.f80572f = null;
        C30782e eVar = this.f80569c;
        if (eVar == null) {
            C7573i.m23583a("playManager");
        }
        eVar.mo80609a(z);
    }

    /* renamed from: a */
    public final boolean mo80600a(Message message) {
        if (message == null) {
            return false;
        }
        if (C7573i.m23585a((Object) message, (Object) this.f80572f)) {
            mo80599a(false);
            return false;
        }
        C30795l lVar = this.f80571e;
        if (lVar == null) {
            C7573i.m23583a("callback");
        }
        lVar.mo80579b(message);
        File c = m100256c(message);
        if (c == null) {
            this.f80568a = message;
            m100255b(message);
            return false;
        }
        C30782e eVar = this.f80569c;
        if (eVar == null) {
            C7573i.m23583a("playManager");
        }
        eVar.mo80608a(c);
        this.f80572f = message;
        this.f80568a = null;
        m100252a(message, true);
        C30795l lVar2 = this.f80571e;
        if (lVar2 == null) {
            C7573i.m23583a("callback");
        }
        lVar2.mo80581c(message);
        return true;
    }

    /* renamed from: a */
    public static void m100251a(Message message, String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                Map localExt = message.getLocalExt();
                C7573i.m23582a((Object) localExt, "localExt");
                localExt.put("localpath", str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m100252a(Message message, boolean z) {
        if (!C7573i.m23585a((Object) "1", (Object) (String) message.getLocalExt().get("isPlayed"))) {
            Map localExt = message.getLocalExt();
            C7573i.m23582a((Object) localExt, "localExt");
            localExt.put("isPlayed", "1");
            if (!z) {
                message = null;
            }
            if (message != null) {
                C31863ai.m103533b(message);
            }
        }
    }

    /* renamed from: a */
    public final void mo80597a(Context context, C30795l lVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(lVar, "callback");
        this.f80569c = new C30782e(context);
        C30782e eVar = this.f80569c;
        if (eVar == null) {
            C7573i.m23583a("playManager");
        }
        eVar.f80577c = this;
        this.f80570d = new ArrayList();
        this.f80572f = null;
        this.f80571e = lVar;
    }
}
