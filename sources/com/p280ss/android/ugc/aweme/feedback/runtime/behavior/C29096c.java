package com.p280ss.android.ugc.aweme.feedback.runtime.behavior;

import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29093b.C29094a;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C29100a;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C29101b;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C29103c;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C29105d;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C29107e;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C29108f;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C29110g;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C29112h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.runtime.behavior.C37295c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.c */
public final class C29096c implements C29092a {

    /* renamed from: a */
    public static C29096c f76844a = C29098b.m95453a();

    /* renamed from: b */
    public static final List<C29100a> f76845b = C7525m.m23464b((T[]) new C29100a[]{new C29105d(), new C29112h(), new C29110g(), new C29101b(), new C29103c(), new C29107e(), new C29108f()});

    /* renamed from: c */
    public static final C29097a f76846c = new C29097a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.c$a */
    public static final class C29097a {
        private C29097a() {
        }

        /* renamed from: a */
        public static C29096c m95452a() {
            return C29096c.f76844a;
        }

        public /* synthetic */ C29097a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.c$b */
    static final class C29098b {

        /* renamed from: a */
        public static final C29098b f76847a = new C29098b();

        /* renamed from: b */
        private static final C29096c f76848b = new C29096c(null);

        private C29098b() {
        }

        /* renamed from: a */
        public static C29096c m95453a() {
            return f76848b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.c$c */
    static final class C29099c<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C29096c f76849a;

        /* renamed from: b */
        final /* synthetic */ String f76850b;

        /* renamed from: c */
        final /* synthetic */ String f76851c;

        /* renamed from: d */
        final /* synthetic */ long f76852d;

        /* renamed from: e */
        final /* synthetic */ C29100a f76853e;

        C29099c(C29096c cVar, String str, String str2, long j, C29100a aVar) {
            this.f76849a = cVar;
            this.f76850b = str;
            this.f76851c = str2;
            this.f76852d = j;
            this.f76853e = aVar;
        }

        public final /* synthetic */ Object call() {
            m95454a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m95454a() {
            this.f76849a.mo74533a(this.f76850b, this.f76851c, this.f76852d);
            this.f76849a.mo74532a(this.f76850b, this.f76852d - this.f76853e.mo74560b());
        }
    }

    private C29096c() {
    }

    /* renamed from: c */
    private static C29093b m95446c() {
        return C29094a.m95441a();
    }

    /* renamed from: a */
    public static Map<String, String> m95443a() {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        for (C29100a aVar : f76845b) {
            String c = aVar.mo74561c();
            if (!TextUtils.isEmpty(c)) {
                linkedHashMap.put(aVar.mo74558a(), c);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public static boolean m95445b() {
        Boolean bool;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            bool = a.getFeedbackRecordEnable();
            C7573i.m23582a((Object) bool, "SettingsReader.get().feedbackRecordEnable");
        } catch (Exception unused) {
            bool = Boolean.valueOf(false);
        }
        return bool.booleanValue();
    }

    public /* synthetic */ C29096c(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public final void mo74527a(String str) {
        C7573i.m23587b(str, "type");
        mo74528a(str, "");
    }

    /* renamed from: b */
    private static C29100a m95444b(String str) {
        for (C29100a aVar : f76845b) {
            if (aVar.mo74559a(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo74532a(String str, long j) {
        m95446c().mo74531b(str, j);
    }

    /* renamed from: b */
    public final List<C37295c> mo74534b(String str, long j) {
        C7573i.m23587b(str, "type");
        return m95446c().mo74529a(str, j);
    }

    /* renamed from: a */
    public final void mo74528a(String str, String str2) {
        C7573i.m23587b(str, "type");
        C7573i.m23587b(str2, "msg");
        if (m95445b()) {
            long currentTimeMillis = System.currentTimeMillis();
            C29100a b = m95444b(str);
            if (b != null) {
                C29099c cVar = new C29099c(this, str, str2, currentTimeMillis, b);
                C1592h.m7855a((Callable<TResult>) cVar, (Executor) C1592h.f5957a);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" 是不支持的运行时动作上报类型，请检查你的代码或联系 zhaoxuan.li");
            throw new Exception(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo74533a(String str, String str2, long j) {
        m95446c().mo74530a(new C37295c(str, j, str2));
    }
}
