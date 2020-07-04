package com.bytedance.android.livesdk.blockword;

import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.blockword.p190a.C3944a;
import com.bytedance.android.livesdk.blockword.p190a.C3945b;
import com.bytedance.android.livesdk.blockword.p190a.C3946c;
import com.bytedance.android.livesdk.p428w.C9178j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.blockword.a */
public final class C3935a {

    /* renamed from: d */
    public static final C3937b f11771d = new C3937b(null);

    /* renamed from: a */
    public final BlockWordApi f11772a;

    /* renamed from: b */
    public List<C3944a> f11773b = new ArrayList();

    /* renamed from: c */
    public C3936a f11774c;

    /* renamed from: com.bytedance.android.livesdk.blockword.a$a */
    public interface C3936a {
        /* renamed from: a */
        void mo11493a(C3944a aVar, int i);

        /* renamed from: a */
        void mo11494a(Throwable th);

        /* renamed from: a */
        void mo11495a(List<C3944a> list);

        /* renamed from: b */
        void mo11496b(C3944a aVar, int i);

        /* renamed from: b */
        void mo11497b(Throwable th);

        /* renamed from: c */
        void mo11498c(Throwable th);
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$b */
    public static final class C3937b {
        private C3937b() {
        }

        public /* synthetic */ C3937b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$c */
    static final class C3938c<T> implements C7326g<C3479d<C3945b>> {

        /* renamed from: a */
        final /* synthetic */ C3935a f11775a;

        /* renamed from: b */
        final /* synthetic */ C3944a f11776b;

        C3938c(C3935a aVar, C3944a aVar2) {
            this.f11775a = aVar;
            this.f11776b = aVar2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C3945b> dVar) {
            Integer num = ((C3945b) dVar.data).f11786a;
            if (num != null) {
                this.f11776b.f11784a = num.intValue();
                this.f11775a.f11773b.add(0, this.f11776b);
                C3936a aVar = this.f11775a.f11774c;
                if (aVar != null) {
                    aVar.mo11493a(this.f11776b, 0);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$d */
    static final class C3939d<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C3935a f11777a;

        C3939d(C3935a aVar) {
            this.f11777a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C3936a aVar = this.f11777a.f11774c;
            if (aVar != null) {
                C7573i.m23582a((Object) th, "throwable");
                aVar.mo11494a(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$e */
    static final class C3940e<T> implements C7326g<C3479d<Object>> {

        /* renamed from: a */
        final /* synthetic */ C3935a f11778a;

        /* renamed from: b */
        final /* synthetic */ Integer f11779b;

        /* renamed from: c */
        final /* synthetic */ C3944a f11780c;

        C3940e(C3935a aVar, Integer num, C3944a aVar2) {
            this.f11778a = aVar;
            this.f11779b = num;
            this.f11780c = aVar2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<Object> dVar) {
            if (this.f11779b != null) {
                this.f11778a.f11773b.remove(this.f11779b.intValue());
                C3936a aVar = this.f11778a.f11774c;
                if (aVar != null) {
                    aVar.mo11496b(this.f11780c, this.f11779b.intValue());
                }
            } else {
                this.f11778a.f11773b.remove(this.f11780c);
                C3936a aVar2 = this.f11778a.f11774c;
                if (aVar2 != null) {
                    aVar2.mo11496b(this.f11780c, -1);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$f */
    static final class C3941f<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C3935a f11781a;

        C3941f(C3935a aVar) {
            this.f11781a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C3936a aVar = this.f11781a.f11774c;
            if (aVar != null) {
                C7573i.m23582a((Object) th, "throwable");
                aVar.mo11497b(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$g */
    static final class C3942g<T> implements C7326g<C3479d<C3946c>> {

        /* renamed from: a */
        final /* synthetic */ C3935a f11782a;

        C3942g(C3935a aVar) {
            this.f11782a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C3946c> dVar) {
            List<C3944a> list = ((C3946c) dVar.data).f11787a;
            if (list != null) {
                this.f11782a.f11773b.clear();
                this.f11782a.f11773b.addAll(list);
                C3936a aVar = this.f11782a.f11774c;
                if (aVar != null) {
                    aVar.mo11495a(list);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$h */
    static final class C3943h<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C3935a f11783a;

        C3943h(C3935a aVar) {
            this.f11783a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C3936a aVar = this.f11783a.f11774c;
            if (aVar != null) {
                C7573i.m23582a((Object) th, "throwable");
                aVar.mo11498c(th);
            }
        }
    }

    public C3935a() {
        Object a = C9178j.m27302j().mo22373b().mo10440a(BlockWordApi.class);
        C7573i.m23582a(a, "LiveInternalService.inst…BlockWordApi::class.java)");
        this.f11772a = (BlockWordApi) a;
    }

    /* renamed from: a */
    public final void mo11489a() {
        this.f11772a.getBlockWord().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C3942g<Object>(this), (C7326g<? super Throwable>) new C3943h<Object>(this));
    }

    /* renamed from: a */
    public final void mo11490a(C3936a aVar) {
        C7573i.m23587b(aVar, "callback");
        this.f11774c = aVar;
    }

    /* renamed from: a */
    public final void mo11491a(C3944a aVar) {
        C7573i.m23587b(aVar, "word");
        this.f11772a.addBlockWord(aVar.f11785b).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C3938c<Object>(this, aVar), (C7326g<? super Throwable>) new C3939d<Object>(this));
    }

    /* renamed from: a */
    public final void mo11492a(C3944a aVar, Integer num) {
        C7573i.m23587b(aVar, "word");
        this.f11772a.deleteBlockWord(aVar.f11784a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C3940e<Object>(this, num, aVar), (C7326g<? super Throwable>) new C3941f<Object>(this));
    }
}
