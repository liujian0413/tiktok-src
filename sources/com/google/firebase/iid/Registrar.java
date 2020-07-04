package com.google.firebase.iid;

import com.google.firebase.C18272b;
import com.google.firebase.components.C18279a;
import com.google.firebase.components.C18284d;
import com.google.firebase.components.C18285e;
import com.google.firebase.iid.p787a.C18302a;
import com.google.firebase.p785a.C18265d;
import java.util.Arrays;
import java.util.List;

public final class Registrar implements C18284d {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    static class C18300a implements C18302a {

        /* renamed from: a */
        private final FirebaseInstanceId f49749a;

        public C18300a(FirebaseInstanceId firebaseInstanceId) {
            this.f49749a = firebaseInstanceId;
        }
    }

    public final List<C18279a<?>> getComponents() {
        return Arrays.asList(new C18279a[]{C18279a.m60266a(FirebaseInstanceId.class).mo47159a(C18285e.m60286a(C18272b.class)).mo47159a(C18285e.m60286a(C18265d.class)).mo47158a(C18349s.f49844a).mo47157a().mo47161c(), C18279a.m60266a(C18302a.class).mo47159a(C18285e.m60286a(FirebaseInstanceId.class)).mo47158a(C18350t.f49845a).mo47161c()});
    }
}
