package com.p280ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.abmock.ABModel;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.C6386d;
import com.bytedance.ies.abmock.C6390h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6709k;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.setting.C37528a;
import com.p280ss.android.ugc.aweme.setting.C37586c;
import com.p280ss.android.ugc.aweme.setting.C7211b;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ABTask */
public class ABTask implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ABTask$a */
    static class C7154a implements C6386d {

        /* renamed from: a */
        private Boolean f20062a;

        /* renamed from: b */
        private Boolean f20063b;

        C7154a() {
        }

        /* renamed from: a */
        public final boolean mo15309a() {
            return m22323c() || (C37528a.f97902a.f97903b && m22322b());
        }

        /* renamed from: a */
        public final boolean mo15310a(String str, boolean z) {
            return C37586c.f98012a.mo94893a(str, z);
        }

        /* renamed from: a */
        public final void mo15307a(String str, C6709k kVar) {
            C37586c.f98012a.mo94891a(str, (String[]) C37586c.f98012a.mo94884a().mo15970a(kVar, String[].class));
        }

        /* renamed from: a */
        public final void mo15308a(boolean z, boolean z2, String str) {
            C37586c.f98012a.mo94892a(z, z2, str);
        }

        /* renamed from: a */
        public final void mo15306a(Object obj, Object obj2, String str) {
            C37586c.f98012a.mo94890a(obj, obj2, str);
        }

        /* renamed from: b */
        private boolean m22322b() {
            if (this.f20062a == null) {
                this.f20062a = Boolean.valueOf(mo15310a("abmock_saved", false));
            }
            return this.f20062a.booleanValue();
        }

        /* renamed from: c */
        private boolean m22323c() {
            if (this.f20063b == null) {
                this.f20063b = Boolean.valueOf("local_test".equals(C6399b.m19941q()));
            }
            return this.f20063b.booleanValue();
        }

        /* renamed from: a */
        public final C6709k mo15300a(String str) {
            return C7211b.m22488a(str);
        }

        /* renamed from: b */
        public final String[] mo15316b(String str) {
            return C37586c.f98012a.mo94894a(str);
        }

        /* renamed from: a */
        public final double mo15297a(String str, double d) {
            return C37586c.f98012a.mo94881a(str, d);
        }

        /* renamed from: b */
        public final void mo15311b(String str, double d) {
            C37586c.f98012a.mo94895b(str, d);
        }

        /* renamed from: a */
        public final int mo15298a(String str, int i) {
            return C37586c.f98012a.mo94882a(str, i);
        }

        /* renamed from: b */
        public final void mo15312b(String str, int i) {
            C37586c.f98012a.mo94896b(str, i);
        }

        /* renamed from: a */
        public final long mo15299a(String str, long j) {
            return C37586c.f98012a.mo94883a(str, j);
        }

        /* renamed from: b */
        public final void mo15313b(String str, long j) {
            C37586c.f98012a.mo94897b(str, j);
        }

        /* renamed from: a */
        public final Object mo15301a(String str, Class cls) {
            return C37586c.f98012a.mo94885a(str, cls);
        }

        /* renamed from: b */
        public final void mo15314b(String str, String str2) {
            C37586c.f98012a.mo94898b(str, str2);
        }

        /* renamed from: a */
        public final String mo15302a(String str, String str2) {
            return C37586c.f98012a.mo94886a(str, str2);
        }

        /* renamed from: b */
        public final void mo15315b(String str, boolean z) {
            C37586c.f98012a.mo94899b(str, z);
        }

        /* renamed from: a */
        public final void mo15303a(double d, double d2, String str) {
            C37586c.f98012a.mo94887a(d, d2, str);
        }

        /* renamed from: a */
        public final void mo15304a(int i, int i2, String str) {
            C37586c.f98012a.mo94888a(i, i2, str);
        }

        /* renamed from: a */
        public final void mo15305a(long j, long j2, String str) {
            C37586c.f98012a.mo94889a(j, j2, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ABTask$b */
    static class C7155b implements C6390h {
        C7155b() {
        }

        /* renamed from: a */
        public final IESSettingsProxy mo15321a() {
            return C30199h.m98861a();
        }

        /* renamed from: c */
        public final boolean mo15323c() {
            return C7211b.m22490a();
        }

        /* renamed from: b */
        public final ABModel mo15322b() {
            return C6903bc.m21494m().mo18803bo();
        }
    }

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        C6384b.m19835a().mo15291a((Application) C6399b.m19921a(), (C6390h) new C7155b(), (C6386d) new C7154a());
    }
}
