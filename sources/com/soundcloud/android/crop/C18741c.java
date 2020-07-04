package com.soundcloud.android.crop;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.soundcloud.android.crop.c */
abstract class C18741c extends Activity {

    /* renamed from: a */
    private final ArrayList<C18743b> f50640a = new ArrayList<>();

    /* renamed from: com.soundcloud.android.crop.c$a */
    public static class C18742a implements C18743b {
        /* renamed from: a */
        public void mo49265a(C18741c cVar) {
        }

        /* renamed from: b */
        public void mo49266b(C18741c cVar) {
        }

        /* renamed from: c */
        public void mo49267c(C18741c cVar) {
        }
    }

    /* renamed from: com.soundcloud.android.crop.c$b */
    public interface C18743b {
        /* renamed from: a */
        void mo49265a(C18741c cVar);

        /* renamed from: b */
        void mo49266b(C18741c cVar);

        /* renamed from: c */
        void mo49267c(C18741c cVar);
    }

    C18741c() {
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Iterator it = this.f50640a.iterator();
        while (it.hasNext()) {
            ((C18743b) it.next()).mo49265a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Iterator it = this.f50640a.iterator();
        while (it.hasNext()) {
            ((C18743b) it.next()).mo49267c(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        Iterator it = this.f50640a.iterator();
        while (it.hasNext()) {
            ((C18743b) it.next()).mo49266b(this);
        }
    }

    /* renamed from: a */
    public void mo49229a(C18743b bVar) {
        this.f50640a.remove(bVar);
    }

    /* renamed from: b */
    public void mo49230b(C18743b bVar) {
        if (!this.f50640a.contains(bVar)) {
            this.f50640a.add(bVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator it = this.f50640a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
