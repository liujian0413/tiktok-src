package com.p280ss.caijing.globaliap;

import android.content.Context;
import android.os.Bundle;
import com.p280ss.caijing.globaliap.p1791d.C45829e;
import com.p280ss.caijing.globaliap.p1791d.C45829e.C45836b;
import com.p280ss.caijing.globaliap.p1791d.C45829e.C45837c;
import com.p280ss.caijing.globaliap.p1791d.C45829e.C45841g;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.caijing.globaliap.a */
public final class C45789a {

    /* renamed from: a */
    public C45795b f117126a;

    /* renamed from: b */
    public C45794a f117127b;

    /* renamed from: com.ss.caijing.globaliap.a$a */
    public interface C45794a {
    }

    /* renamed from: com.ss.caijing.globaliap.a$b */
    public interface C45795b {
        /* renamed from: a */
        void mo11054a();

        /* renamed from: a */
        void mo11055a(Bundle bundle);
    }

    /* renamed from: a */
    public final void mo111006a(Context context, final ArrayList<String> arrayList, C45794a aVar) {
        this.f117127b = aVar;
        final C45829e eVar = new C45829e(context.getApplicationContext());
        eVar.mo111051a(new C45836b() {
            /* renamed from: b */
            public final void mo111009b() {
                eVar.mo111050a();
            }

            /* renamed from: a */
            public final void mo111008a() {
                eVar.mo111055a(arrayList, (C45837c) new C45837c() {
                    /* renamed from: a */
                    public final void mo111012a(Map<String, Integer> map) {
                        eVar.mo111050a();
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public final void mo111007a(Context context, final ArrayList<String> arrayList, final String str, C45795b bVar) {
        this.f117126a = bVar;
        final C45829e eVar = new C45829e(context.getApplicationContext());
        eVar.mo111051a(new C45836b() {
            /* renamed from: a */
            public final void mo111008a() {
                eVar.mo111056a(arrayList, str, (C45841g) new C45841g() {
                    /* renamed from: a */
                    public final void mo111010a() {
                        if (C45789a.this.f117126a != null) {
                            C45789a.this.f117126a.mo11054a();
                            C45789a.this.f117126a = null;
                        }
                        eVar.mo111050a();
                    }

                    /* renamed from: a */
                    public final void mo111011a(Bundle bundle) {
                        if (C45789a.this.f117126a != null) {
                            C45789a.this.f117126a.mo11055a(bundle);
                            C45789a.this.f117126a = null;
                        }
                        eVar.mo111050a();
                    }
                });
            }

            /* renamed from: b */
            public final void mo111009b() {
                if (C45789a.this.f117126a != null) {
                    C45789a.this.f117126a.mo11054a();
                    C45789a.this.f117126a = null;
                }
                eVar.mo111050a();
            }
        });
    }
}
