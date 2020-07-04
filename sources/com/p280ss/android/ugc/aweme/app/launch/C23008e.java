package com.p280ss.android.ugc.aweme.app.launch;

import android.content.Context;
import android.os.AsyncTask;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C9709a;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.ugc.statisticlogger.C10981a;
import com.bytedance.ies.ugc.statisticlogger.config.C10988b;
import com.bytedance.ies.ugc.statisticlogger.config.ConfigUpdateEvent;
import com.bytedance.ttnet.utils.C13002e;
import com.p280ss.android.ugc.aweme.p1041ar.C23069a;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7705c;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.ss.android.ugc.aweme.app.launch.e */
public final class C23008e {

    /* renamed from: com.ss.android.ugc.aweme.app.launch.e$a */
    static final class C23009a<T> implements C7328l<ConfigUpdateEvent> {

        /* renamed from: a */
        public static final C23009a f60786a = new C23009a();

        C23009a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo9283a(Object obj) {
            return m75660a((ConfigUpdateEvent) obj);
        }

        /* renamed from: a */
        private static boolean m75660a(ConfigUpdateEvent configUpdateEvent) {
            C7573i.m23587b(configUpdateEvent, "it");
            if (configUpdateEvent == ConfigUpdateEvent.Local) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.e$b */
    static final class C23010b<T> implements C7326g<ConfigUpdateEvent> {

        /* renamed from: a */
        final /* synthetic */ Context f60787a;

        C23010b(Context context) {
            this.f60787a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(ConfigUpdateEvent configUpdateEvent) {
            C23008e.m75659b(this.f60787a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.e$c */
    public static final class C23011c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Context f60788a;

        C23011c(Context context) {
            this.f60788a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            C7573i.m23587b(voidArr, "params");
            C13002e.m37945a(this.f60788a, C10981a.m32175e());
            return null;
        }
    }

    /* renamed from: a */
    public static final void m75658a(Context context) {
        C7573i.m23587b(context, "context");
        C10988b.m32200a().mo19291a((C7328l<? super T>) C23009a.f60786a).mo19304b(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C23010b<Object>(context));
    }

    /* renamed from: b */
    public static final void m75659b(Context context) {
        if (C6405d.m19984g() == null) {
            System.currentTimeMillis();
        }
        if (!C6319n.m19593a(C10981a.m32172c()) && !C6319n.m19593a(C10981a.m32174d())) {
            C9709a.m28647a(new C23011c(context), new Void[0]);
        }
        C7705c.m23799a().mo20394d(new C23069a());
    }
}
