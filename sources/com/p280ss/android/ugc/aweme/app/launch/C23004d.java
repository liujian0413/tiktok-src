package com.p280ss.android.ugc.aweme.app.launch;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.statisticlogger.C10981a;
import com.bytedance.ies.ugc.statisticlogger.C10984b;
import com.bytedance.ies.ugc.statisticlogger.C10985c;
import com.bytedance.ies.ugc.statisticlogger.config.C10988b;
import com.bytedance.ies.ugc.statisticlogger.config.ConfigUpdateEvent;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.task.MonitorInitTask;
import com.p280ss.android.ugc.aweme.legoImp.task.RedBadgeUpdateTask;
import com.p280ss.android.ugc.aweme.p1156d.C26040a;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.ss.android.ugc.aweme.app.launch.d */
public final class C23004d {

    /* renamed from: com.ss.android.ugc.aweme.app.launch.d$a */
    static final class C23005a<T> implements C7328l<ConfigUpdateEvent> {

        /* renamed from: a */
        public static final C23005a f60783a = new C23005a();

        C23005a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo9283a(Object obj) {
            return m75653a((ConfigUpdateEvent) obj);
        }

        /* renamed from: a */
        private static boolean m75653a(ConfigUpdateEvent configUpdateEvent) {
            C7573i.m23587b(configUpdateEvent, "it");
            if (configUpdateEvent == ConfigUpdateEvent.Local) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.d$b */
    public static final class C23006b implements C7326g<ConfigUpdateEvent> {

        /* renamed from: a */
        private boolean f60784a;

        C23006b() {
        }

        /* renamed from: a */
        private final void m75655a() {
            if (!this.f60784a) {
                C7121a.m22248b().mo18559a(new MonitorInitTask()).mo18560a();
                this.f60784a = true;
            }
            if (!C6319n.m19593a(C10981a.m32172c()) && !C6319n.m19593a(C10981a.m32174d())) {
                C7121a.m22248b().mo18559a(new RedBadgeUpdateTask()).mo18560a();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(ConfigUpdateEvent configUpdateEvent) {
            m75655a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.d$c */
    static final class C23007c<T> implements C7326g<C10984b> {

        /* renamed from: a */
        public static final C23007c f60785a = new C23007c();

        C23007c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m75657a((C10984b) obj);
        }

        /* renamed from: a */
        private static void m75657a(C10984b bVar) {
            C7573i.m23582a((Object) bVar, "it");
            C26040a.m85518a(bVar);
        }
    }

    /* renamed from: a */
    public static final void m75652a(Context context) {
        C7573i.m23587b(context, "context");
        C10988b.m32200a().mo19291a((C7328l<? super T>) C23005a.f60783a).mo19325f((C7326g<? super T>) new C23006b<Object>());
        C10985c.m32185b().mo19325f((C7326g<? super T>) C23007c.f60785a);
    }
}
