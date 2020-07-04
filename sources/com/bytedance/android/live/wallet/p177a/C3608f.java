package com.bytedance.android.live.wallet.p177a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.C3642b.C3643a;
import com.bytedance.android.live.wallet.api.C3634i;
import com.bytedance.android.live.wallet.api.C3634i.C3635a;
import com.bytedance.android.live.wallet.api.C3634i.C3636b;
import com.bytedance.android.live.wallet.api.C3634i.C3637c;
import com.bytedance.android.live.wallet.api.C3634i.C3638d;
import com.bytedance.android.live.wallet.api.C3634i.C3639e;
import com.bytedance.android.live.wallet.api.C3634i.C3640f;
import com.bytedance.android.livesdkapi.host.C9463e;
import com.p280ss.caijing.globaliap.C45789a;
import com.p280ss.caijing.globaliap.C45789a.C45794a;
import com.p280ss.caijing.globaliap.C45789a.C45795b;
import com.p280ss.caijing.globaliap.C45801b;
import com.p280ss.caijing.globaliap.C45804c;
import com.p280ss.caijing.globaliap.C45806d;
import com.p280ss.caijing.globaliap.C45849e;
import com.p280ss.caijing.globaliap.C45861f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.wallet.a.f */
public final class C3608f implements C3634i {

    /* renamed from: com.bytedance.android.live.wallet.a.f$a */
    public static final class C3614a implements C3643a<C3634i> {

        /* renamed from: com.bytedance.android.live.wallet.a.f$a$a */
        static class C3615a {

            /* renamed from: a */
            public static final C3634i f10800a = new C3608f();
        }

        /* renamed from: b */
        private static C3634i m13204b() {
            return C3615a.f10800a;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo11059a() {
            return m13204b();
        }
    }

    /* renamed from: b */
    public final void mo11052b() {
        C45849e.m143886a();
    }

    /* renamed from: c */
    public final void mo11053c() {
        C45861f.m143912a();
    }

    /* renamed from: a */
    public final void mo11044a() {
        C45849e.m143890a((C45801b) new C45801b() {
            /* renamed from: a */
            public final void mo11056a(String str, Map<String, String> map) {
                ((C9463e) C3596c.m13172a(C9463e.class)).mo23269a(str, map);
            }
        });
    }

    public C3608f() {
        C3640f.f10860a = "pay_result_code";
        C3640f.f10861b = "pay_result_extra";
        C3640f.f10862c = "pay_result_detail_code";
        C3640f.f10863d = "pay_result_msg";
        C3639e.f10853a = 0;
        C3639e.f10854b = 0;
        C3639e.f10855c = 1;
        C3639e.f10856d = 2;
        C3639e.f10858f = 4;
        C3639e.f10859g = 5;
    }

    /* renamed from: a */
    public final void mo11046a(Context context) {
        C45849e.m143887a(context);
    }

    /* renamed from: a */
    public final void mo11050a(final C3636b bVar) {
        C45849e.m143891a((C45804c) new C45804c() {
            /* renamed from: a */
            public final void mo11057a(String str, String str2) {
                bVar.mo11099a(str, str2);
            }
        });
    }

    /* renamed from: a */
    public final void mo11051a(final C3638d dVar) {
        C45861f.m143913a(new C45806d() {
            /* renamed from: a */
            public final void mo11058a(boolean z) {
                dVar.mo11100a(z);
            }
        });
    }

    /* renamed from: a */
    public final void mo11047a(Context context, String str) {
        C45849e.m143888a(context, str);
    }

    /* renamed from: a */
    public final void mo11048a(Context context, ArrayList<String> arrayList, C3637c cVar) {
        new C45789a().mo111006a(context, arrayList, new C45794a(null) {
        });
    }

    /* renamed from: a */
    public final void mo11049a(Context context, List<String> list, String str, final C3635a aVar) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        new C45789a().mo111007a(context, arrayList, str, new C45795b() {
            /* renamed from: a */
            public final void mo11054a() {
                aVar.mo11097a();
            }

            /* renamed from: a */
            public final void mo11055a(Bundle bundle) {
                aVar.mo11098a(bundle);
            }
        });
    }

    /* renamed from: a */
    public final void mo11045a(Activity activity, String str, Map<String, String> map, int i, Bundle bundle) {
        C45849e.m143892a(activity, str, map, 111, bundle);
    }
}
