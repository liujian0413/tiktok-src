package com.bytedance.android.live.core.rxutils;

import android.widget.TextView;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.live.core.rxutils.n */
public final class C3306n {

    /* renamed from: com.bytedance.android.live.core.rxutils.n$a */
    static final class C3307a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7498y f10040a;

        /* renamed from: b */
        final /* synthetic */ C7562b f10041b;

        C3307a(C7498y yVar, C7562b bVar) {
            this.f10040a = yVar;
            this.f10041b = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m12386a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m12386a() {
            this.f10041b.invoke(this.f10040a);
        }
    }

    /* renamed from: com.bytedance.android.live.core.rxutils.n$b */
    static final class C3308b extends Lambda implements C7562b<T, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7562b f10042a;

        C3308b(C7562b bVar) {
            this.f10042a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m12387a(obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m12387a(T t) {
            this.f10042a.invoke(t);
        }
    }

    /* renamed from: com.bytedance.android.live.core.rxutils.n$c */
    static final class C3309c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f10043a;

        C3309c(ObjectRef objectRef) {
            this.f10043a = objectRef;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<T, T> apply(T t) {
            Pair<T, T> a = C7579l.m23633a(this.f10043a.element, t);
            this.f10043a.element = t;
            return a;
        }
    }

    /* renamed from: com.bytedance.android.live.core.rxutils.n$d */
    public static final class C3310d extends C3314p<T> {

        /* renamed from: a */
        final /* synthetic */ C7562b f10044a;

        C3310d(C7562b bVar) {
            this.f10044a = bVar;
        }

        public final void onNext(T t) {
            this.f10044a.invoke(t);
        }
    }

    /* renamed from: com.bytedance.android.live.core.rxutils.n$e */
    public static final class C3311e implements C7498y<T> {

        /* renamed from: a */
        final /* synthetic */ C7498y[] f10045a;

        public final void onComplete() {
            for (C7498y onComplete : this.f10045a) {
                onComplete.onComplete();
            }
        }

        C3311e(C7498y[] yVarArr) {
            this.f10045a = yVarArr;
        }

        public final void onNext(T t) {
            for (C7498y onNext : this.f10045a) {
                onNext.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            for (C7498y onError : this.f10045a) {
                onError.onError(th);
            }
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
            for (C7498y onSubscribe : this.f10045a) {
                onSubscribe.onSubscribe(cVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.core.rxutils.n$f */
    static final class C3312f extends Lambda implements C7562b<CharSequence, C7581n> {

        /* renamed from: a */
        final /* synthetic */ TextView f10046a;

        C3312f(TextView textView) {
            this.f10046a = textView;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m12389a((CharSequence) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m12389a(CharSequence charSequence) {
            C7573i.m23587b(charSequence, "t");
            this.f10046a.setText(charSequence);
        }
    }

    /* renamed from: a */
    public static final <T> C7498y<T> m12384a(C7498y<T>... yVarArr) {
        C7573i.m23587b(yVarArr, "observers");
        return new C3311e<>(yVarArr);
    }

    /* renamed from: b */
    private static <T> C7498y<T> m12385b(C7562b<? super T, C7581n> bVar) {
        C7573i.m23587b(bVar, "f");
        return new C3310d<>(bVar);
    }

    /* renamed from: a */
    public static final <T> C7492s<Pair<T, T>> m12381a(C7492s<T> sVar) {
        C7573i.m23587b(sVar, "$this$diff");
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = null;
        C7492s<Pair<T, T>> d = sVar.mo19317d((C7327h<? super T, ? extends R>) new C3309c<Object,Object>(objectRef));
        C7573i.m23582a((Object) d, "this.map {\n        val r…     return@map ret\n    }");
        return d;
    }

    /* renamed from: a */
    public static final C7498y<CharSequence> m12382a(TextView textView) {
        C7573i.m23587b(textView, "view");
        return m12385b(new C3312f(textView));
    }

    /* renamed from: a */
    public static final <T> C7498y<T> m12383a(C7562b<? super T, C7581n> bVar) {
        C7573i.m23587b(bVar, "$this$asObserver");
        return m12385b(new C3308b(bVar));
    }

    /* renamed from: a */
    public static final <OB extends C7498y<T>, T> DisposableObserverDelegate<T> m12379a(OB ob, C7562b<? super OB, C7581n> bVar) {
        C7573i.m23587b(ob, "$this$asDisposable");
        C7573i.m23587b(bVar, "doOnDispose");
        return new DisposableObserverDelegate<>(ob, new C3307a(ob, bVar));
    }

    /* renamed from: a */
    public static final <S, T> C7321c m12380a(C7492s<S> sVar, C7498y<T> yVar, C7562b<? super S, ? extends T> bVar) {
        C7573i.m23587b(sVar, "source");
        C7573i.m23587b(yVar, "target");
        C7573i.m23587b(bVar, "transformer");
        C7498y c = sVar.mo19317d((C7327h<? super T, ? extends R>) new C3313o<Object,Object>(bVar)).mo19294a(C47549a.m148327a()).mo19312c(new DisposableObserverDelegate(yVar, null, 2, null));
        C7573i.m23582a((Object) c, "source.map(transformer).…ObserverDelegate(target))");
        return (C7321c) c;
    }
}
