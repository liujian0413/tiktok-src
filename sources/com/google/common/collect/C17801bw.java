package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.base.Equivalence;
import com.google.common.collect.C17801bw.C17814h;
import com.google.common.collect.C17801bw.C17819m;
import com.google.common.primitives.C18143c;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.common.collect.bw */
final class C17801bw<K, V, E extends C17814h<K, V, E>, S extends C17819m<K, V, E, S>> extends AbstractMap<K, V> implements Serializable, ConcurrentMap<K, V> {

    /* renamed from: g */
    static final C17805ab<Object, Object, C17810d> f49046g = new C17805ab<Object, Object, C17810d>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public C17805ab<Object, Object, C17810d> mo46045a(ReferenceQueue<Object> referenceQueue, C17810d dVar) {
            return this;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C17814h mo46046a() {
            return null;
        }

        public final void clear() {
        }

        public final Object get() {
            return null;
        }
    };
    private static final long serialVersionUID = 5;

    /* renamed from: a */
    final transient int f49047a;

    /* renamed from: b */
    final transient int f49048b;

    /* renamed from: c */
    final transient C17819m<K, V, E, S>[] f49049c;

    /* renamed from: d */
    final int f49050d;

    /* renamed from: e */
    final Equivalence<Object> f49051e;

    /* renamed from: f */
    final transient C17815i<K, V, E, S> f49052f;

    /* renamed from: h */
    transient Set<K> f49053h;

    /* renamed from: i */
    transient Collection<V> f49054i;

    /* renamed from: j */
    transient Set<Entry<K, V>> f49055j;

    /* renamed from: com.google.common.collect.bw$a */
    static abstract class C17803a<K, V> extends C17747at<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* renamed from: a */
        final C17821o f49056a;

        /* renamed from: b */
        final C17821o f49057b;

        /* renamed from: c */
        final Equivalence<Object> f49058c;

        /* renamed from: d */
        final Equivalence<Object> f49059d;

        /* renamed from: e */
        final int f49060e;

        /* renamed from: f */
        public transient ConcurrentMap<K, V> f49061f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final ConcurrentMap<K, V> delegate() {
            return this.f49061f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo46051b(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject != null) {
                    this.f49061f.put(readObject, objectInputStream.readObject());
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17800bv mo46049a(ObjectInputStream objectInputStream) throws IOException {
            return new C17800bv().mo46013a(objectInputStream.readInt()).mo46015a(this.f49056a).mo46018b(this.f49057b).mo46014a(this.f49058c).mo46017b(this.f49060e);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo46050a(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f49061f.size());
            for (Entry entry : this.f49061f.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        C17803a(C17821o oVar, C17821o oVar2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.f49056a = oVar;
            this.f49057b = oVar2;
            this.f49058c = equivalence;
            this.f49059d = equivalence2;
            this.f49060e = i;
            this.f49061f = concurrentMap;
        }
    }

    /* renamed from: com.google.common.collect.bw$aa */
    interface C17804aa<K, V, E extends C17814h<K, V, E>> extends C17814h<K, V, E> {
        /* renamed from: e */
        C17805ab<K, V, E> mo46052e();
    }

    /* renamed from: com.google.common.collect.bw$ab */
    interface C17805ab<K, V, E extends C17814h<K, V, E>> {
        /* renamed from: a */
        C17805ab<K, V, E> mo46045a(ReferenceQueue<V> referenceQueue, E e);

        /* renamed from: a */
        E mo46046a();

        void clear();

        V get();
    }

    /* renamed from: com.google.common.collect.bw$ac */
    static final class C17806ac<K, V, E extends C17814h<K, V, E>> extends WeakReference<V> implements C17805ab<K, V, E> {

        /* renamed from: a */
        final E f49062a;

        /* renamed from: a */
        public final E mo46046a() {
            return this.f49062a;
        }

        /* renamed from: a */
        public final C17805ab<K, V, E> mo46045a(ReferenceQueue<V> referenceQueue, E e) {
            return new C17806ac(referenceQueue, get(), e);
        }

        C17806ac(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.f49062a = e;
        }
    }

    /* renamed from: com.google.common.collect.bw$ad */
    final class C17807ad extends C18027g<K, V> {

        /* renamed from: a */
        final K f49063a;

        /* renamed from: b */
        V f49064b;

        public final K getKey() {
            return this.f49063a;
        }

        public final V getValue() {
            return this.f49064b;
        }

        public final int hashCode() {
            return this.f49063a.hashCode() ^ this.f49064b.hashCode();
        }

        public final V setValue(V v) {
            V put = C17801bw.this.put(this.f49063a, v);
            this.f49064b = v;
            return put;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.f49063a.equals(entry.getKey()) || !this.f49064b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        C17807ad(K k, V v) {
            this.f49063a = k;
            this.f49064b = v;
        }
    }

    /* renamed from: com.google.common.collect.bw$b */
    static abstract class C17808b<K, V, E extends C17814h<K, V, E>> implements C17814h<K, V, E> {

        /* renamed from: a */
        final K f49066a;

        /* renamed from: b */
        final int f49067b;

        /* renamed from: c */
        final E f49068c;

        /* renamed from: a */
        public final K mo46055a() {
            return this.f49066a;
        }

        /* renamed from: b */
        public final int mo46056b() {
            return this.f49067b;
        }

        /* renamed from: c */
        public final E mo46057c() {
            return this.f49068c;
        }

        C17808b(K k, int i, E e) {
            this.f49066a = k;
            this.f49067b = i;
            this.f49068c = e;
        }
    }

    /* renamed from: com.google.common.collect.bw$c */
    static abstract class C17809c<K, V, E extends C17814h<K, V, E>> extends WeakReference<K> implements C17814h<K, V, E> {

        /* renamed from: a */
        final int f49069a;

        /* renamed from: b */
        final E f49070b;

        /* renamed from: b */
        public final int mo46056b() {
            return this.f49069a;
        }

        /* renamed from: c */
        public final E mo46057c() {
            return this.f49070b;
        }

        /* renamed from: a */
        public final K mo46055a() {
            return get();
        }

        C17809c(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
            super(k, referenceQueue);
            this.f49069a = i;
            this.f49070b = e;
        }
    }

    /* renamed from: com.google.common.collect.bw$d */
    static final class C17810d implements C17814h<Object, Object, C17810d> {
        /* renamed from: e */
        private static C17810d m59199e() {
            throw new AssertionError();
        }

        /* renamed from: a */
        public final Object mo46055a() {
            throw new AssertionError();
        }

        /* renamed from: b */
        public final int mo46056b() {
            throw new AssertionError();
        }

        /* renamed from: c */
        public final /* synthetic */ C17814h mo46057c() {
            return m59199e();
        }

        /* renamed from: d */
        public final Object mo46058d() {
            throw new AssertionError();
        }

        private C17810d() {
            throw new AssertionError();
        }
    }

    /* renamed from: com.google.common.collect.bw$e */
    final class C17811e extends C17813g<Entry<K, V>> {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public Entry<K, V> next() {
            return mo46066a();
        }

        C17811e() {
            super();
        }
    }

    /* renamed from: com.google.common.collect.bw$f */
    final class C17812f extends C17818l<Entry<K, V>> {
        public final void clear() {
            C17801bw.this.clear();
        }

        public final boolean isEmpty() {
            return C17801bw.this.isEmpty();
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C17811e();
        }

        public final int size() {
            return C17801bw.this.size();
        }

        C17812f() {
            super();
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null || !C17801bw.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null) {
                return false;
            }
            Object obj2 = C17801bw.this.get(key);
            if (obj2 == null || !C17801bw.this.mo46027b().mo44882a(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.common.collect.bw$g */
    abstract class C17813g<T> implements Iterator<T> {

        /* renamed from: b */
        int f49073b;

        /* renamed from: c */
        int f49074c = -1;

        /* renamed from: d */
        C17819m<K, V, E, S> f49075d;

        /* renamed from: e */
        AtomicReferenceArray<E> f49076e;

        /* renamed from: f */
        E f49077f;

        /* renamed from: g */
        C17807ad f49078g;

        /* renamed from: h */
        C17807ad f49079h;

        public boolean hasNext() {
            if (this.f49078g != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private boolean m59207c() {
            if (this.f49077f != null) {
                do {
                    this.f49077f = this.f49077f.mo46057c();
                    if (this.f49077f != null) {
                    }
                } while (!m59205a(this.f49077f));
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17807ad mo46066a() {
            if (this.f49078g != null) {
                this.f49079h = this.f49078g;
                m59206b();
                return this.f49079h;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            if (this.f49079h != null) {
                z = true;
            } else {
                z = false;
            }
            C18053v.m59703a(z);
            C17801bw.this.remove(this.f49079h.getKey());
            this.f49079h = null;
        }

        /* renamed from: d */
        private boolean m59208d() {
            while (this.f49074c >= 0) {
                AtomicReferenceArray<E> atomicReferenceArray = this.f49076e;
                int i = this.f49074c;
                this.f49074c = i - 1;
                E e = (C17814h) atomicReferenceArray.get(i);
                this.f49077f = e;
                if (e != null && (m59205a(this.f49077f) || m59207c())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private void m59206b() {
            this.f49078g = null;
            if (!m59207c() && !m59208d()) {
                while (this.f49073b >= 0) {
                    C17819m<K, V, E, S>[] mVarArr = C17801bw.this.f49049c;
                    int i = this.f49073b;
                    this.f49073b = i - 1;
                    this.f49075d = mVarArr[i];
                    if (this.f49075d.f49084b != 0) {
                        this.f49076e = this.f49075d.f49087e;
                        this.f49074c = this.f49076e.length() - 1;
                        if (m59208d()) {
                            return;
                        }
                    }
                }
            }
        }

        C17813g() {
            this.f49073b = C17801bw.this.f49049c.length - 1;
            m59206b();
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private boolean m59205a(E e) {
            try {
                Object a = e.mo46055a();
                Object b = C17801bw.m59176b(e);
                if (b != null) {
                    this.f49078g = new C17807ad<>(a, b);
                    this.f49075d.mo46100e();
                    return true;
                }
                this.f49075d.mo46100e();
                return false;
            } catch (Throwable th) {
                this.f49075d.mo46100e();
                throw th;
            }
        }
    }

    /* renamed from: com.google.common.collect.bw$h */
    interface C17814h<K, V, E extends C17814h<K, V, E>> {
        /* renamed from: a */
        K mo46055a();

        /* renamed from: b */
        int mo46056b();

        /* renamed from: c */
        E mo46057c();

        /* renamed from: d */
        V mo46058d();
    }

    /* renamed from: com.google.common.collect.bw$i */
    interface C17815i<K, V, E extends C17814h<K, V, E>, S extends C17819m<K, V, E, S>> {
        /* renamed from: a */
        E mo46069a(S s, E e, E e2);

        /* renamed from: a */
        E mo46070a(S s, K k, int i, E e);

        /* renamed from: a */
        S mo46071a(C17801bw<K, V, E, S> bwVar, int i, int i2);

        /* renamed from: a */
        C17821o mo46072a();

        /* renamed from: a */
        void mo46073a(S s, E e, V v);

        /* renamed from: b */
        C17821o mo46074b();
    }

    /* renamed from: com.google.common.collect.bw$j */
    final class C17816j extends C17813g<K> {
        public final K next() {
            return mo46066a().getKey();
        }

        C17816j() {
            super();
        }
    }

    /* renamed from: com.google.common.collect.bw$k */
    final class C17817k extends C17818l<K> {
        public final void clear() {
            C17801bw.this.clear();
        }

        public final boolean isEmpty() {
            return C17801bw.this.isEmpty();
        }

        public final Iterator<K> iterator() {
            return new C17816j();
        }

        public final int size() {
            return C17801bw.this.size();
        }

        C17817k() {
            super();
        }

        public final boolean contains(Object obj) {
            return C17801bw.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (C17801bw.this.remove(obj) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.bw$l */
    static abstract class C17818l<E> extends AbstractSet<E> {
        private C17818l() {
        }

        public Object[] toArray() {
            return C17801bw.m59174a((Collection<E>) this).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return C17801bw.m59174a((Collection<E>) this).toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.bw$m */
    static abstract class C17819m<K, V, E extends C17814h<K, V, E>, S extends C17819m<K, V, E, S>> extends ReentrantLock {

        /* renamed from: a */
        final C17801bw<K, V, E, S> f49083a;

        /* renamed from: b */
        volatile int f49084b;

        /* renamed from: c */
        int f49085c;

        /* renamed from: d */
        int f49086d;

        /* renamed from: e */
        volatile AtomicReferenceArray<E> f49087e;

        /* renamed from: f */
        final int f49088f;

        /* renamed from: g */
        final AtomicInteger f49089g = new AtomicInteger();

        /* renamed from: h */
        private void m59232h() {
            m59234j();
        }

        /* renamed from: i */
        private void m59233i() {
            m59234j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract S mo46084a();

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo46093b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo46098c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo46091a(K k, int i, V v, V v2) {
            lock();
            try {
                m59232h();
                AtomicReferenceArray<E> atomicReferenceArray = this.f49087e;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17814h hVar = (C17814h) atomicReferenceArray.get(length);
                C17814h hVar2 = hVar;
                while (hVar2 != null) {
                    Object a = hVar2.mo46055a();
                    if (hVar2.mo46056b() != i || a == null || !this.f49083a.f49051e.mo44882a(k, a)) {
                        hVar2 = hVar2.mo46057c();
                    } else {
                        Object d = hVar2.mo46058d();
                        if (d == null) {
                            if (m59224a((E) hVar2)) {
                                int i2 = this.f49084b;
                                this.f49085c++;
                                int i3 = this.f49084b - 1;
                                atomicReferenceArray.set(length, m59226b((E) hVar, (E) hVar2));
                                this.f49084b = i3;
                            }
                            return false;
                        } else if (this.f49083a.mo46027b().mo44882a(v, d)) {
                            this.f49085c++;
                            m59222a((E) hVar2, v2);
                            unlock();
                            return true;
                        } else {
                            unlock();
                            return false;
                        }
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo46089a(E e, int i) {
            lock();
            try {
                int i2 = this.f49084b;
                AtomicReferenceArray<E> atomicReferenceArray = this.f49087e;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = (C17814h) atomicReferenceArray.get(length);
                for (E e3 = e2; e3 != null; e3 = e3.mo46057c()) {
                    if (e3 == e) {
                        this.f49085c++;
                        C17814h b = m59226b(e2, e3);
                        int i3 = this.f49084b - 1;
                        atomicReferenceArray.set(length, b);
                        this.f49084b = i3;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo46090a(K k, int i, C17805ab<K, V, E> abVar) {
            lock();
            try {
                int i2 = this.f49084b;
                AtomicReferenceArray<E> atomicReferenceArray = this.f49087e;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17814h hVar = (C17814h) atomicReferenceArray.get(length);
                C17814h hVar2 = hVar;
                while (hVar2 != null) {
                    Object a = hVar2.mo46055a();
                    if (hVar2.mo46056b() != i || a == null || !this.f49083a.f49051e.mo44882a(k, a)) {
                        hVar2 = hVar2.mo46057c();
                    } else if (((C17804aa) hVar2).mo46052e() == abVar) {
                        this.f49085c++;
                        int i3 = this.f49084b - 1;
                        atomicReferenceArray.set(length, m59226b((E) hVar, (E) hVar2));
                        this.f49084b = i3;
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final void mo46100e() {
            if ((this.f49089g.incrementAndGet() & 63) == 0) {
                m59233i();
            }
        }

        /* renamed from: f */
        private void m59230f() {
            if (tryLock()) {
                try {
                    mo46093b();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: j */
        private void m59234j() {
            if (tryLock()) {
                try {
                    mo46093b();
                    this.f49089g.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: g */
        private void m59231g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f49087e;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.f49084b;
                AtomicReferenceArray<E> a = m59221a(length << 1);
                this.f49086d = (a.length() * 3) / 4;
                int length2 = a.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    C17814h hVar = (C17814h) atomicReferenceArray.get(i2);
                    if (hVar != null) {
                        C17814h c = hVar.mo46057c();
                        int b = hVar.mo46056b() & length2;
                        if (c == null) {
                            a.set(b, hVar);
                        } else {
                            C17814h hVar2 = hVar;
                            while (c != null) {
                                int b2 = c.mo46056b() & length2;
                                if (b2 != b) {
                                    hVar2 = c;
                                    b = b2;
                                }
                                c = c.mo46057c();
                            }
                            a.set(b, hVar2);
                            while (hVar != hVar2) {
                                int b3 = hVar.mo46056b() & length2;
                                C17814h a2 = m59220a((E) hVar, (E) (C17814h) a.get(b3));
                                if (a2 != null) {
                                    a.set(b3, a2);
                                } else {
                                    i--;
                                }
                                hVar = hVar.mo46057c();
                            }
                        }
                    }
                }
                this.f49087e = a;
                this.f49084b = i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo46099d() {
            if (this.f49084b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f49087e;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    mo46098c();
                    this.f49089g.set(0);
                    this.f49085c++;
                    this.f49084b = 0;
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: a */
        private static AtomicReferenceArray<E> m59221a(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* renamed from: c */
        static <T> void m59227c(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        /* renamed from: b */
        private E m59225b(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f49087e;
            return (C17814h) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* renamed from: a */
        private void m59223a(AtomicReferenceArray<E> atomicReferenceArray) {
            this.f49086d = (atomicReferenceArray.length() * 3) / 4;
            if (this.f49086d == this.f49088f) {
                this.f49086d++;
            }
            this.f49087e = atomicReferenceArray;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final V mo46092b(E e) {
            if (e.mo46055a() == null) {
                m59230f();
                return null;
            }
            V d = e.mo46058d();
            if (d != null) {
                return d;
            }
            m59230f();
            return null;
        }

        /* renamed from: a */
        static <K, V, E extends C17814h<K, V, E>> boolean m59224a(E e) {
            if (e.mo46058d() == null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo46094b(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference poll = referenceQueue.poll();
                if (poll != null) {
                    this.f49083a.mo46025a((C17805ab) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo46088a(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference poll = referenceQueue.poll();
                if (poll != null) {
                    this.f49083a.mo46026a((C17814h) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: e */
        private E m59229e(Object obj, int i) {
            return m59228d(obj, i);
        }

        /* renamed from: a */
        private E m59220a(E e, E e2) {
            return this.f49083a.f49052f.mo46069a(mo46084a(), e, e2);
        }

        /* renamed from: a */
        private void m59222a(E e, V v) {
            this.f49083a.f49052f.mo46073a(mo46084a(), e, v);
        }

        /* renamed from: b */
        private E m59226b(E e, E e2) {
            int i = this.f49084b;
            E c = e2.mo46057c();
            while (e != e2) {
                E a = m59220a(e, c);
                if (a != null) {
                    c = a;
                } else {
                    i--;
                }
                e = e.mo46057c();
            }
            this.f49084b = i;
            return c;
        }

        /* renamed from: d */
        private E m59228d(Object obj, int i) {
            if (this.f49084b != 0) {
                for (E b = m59225b(i); b != null; b = b.mo46057c()) {
                    if (b.mo46056b() == i) {
                        Object a = b.mo46055a();
                        if (a == null) {
                            m59230f();
                        } else if (this.f49083a.f49051e.mo44882a(obj, a)) {
                            return b;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final V mo46097c(Object obj, int i) {
            lock();
            m59232h();
            int i2 = this.f49084b;
            AtomicReferenceArray<E> atomicReferenceArray = this.f49087e;
            int length = (atomicReferenceArray.length() - 1) & i;
            C17814h hVar = (C17814h) atomicReferenceArray.get(length);
            C17814h hVar2 = hVar;
            while (hVar2 != null) {
                Object a = hVar2.mo46055a();
                if (hVar2.mo46056b() != i || a == null || !this.f49083a.f49051e.mo44882a(obj, a)) {
                    try {
                        hVar2 = hVar2.mo46057c();
                    } catch (Throwable th) {
                        unlock();
                        throw th;
                    }
                } else {
                    V d = hVar2.mo46058d();
                    if (d != null || m59224a((E) hVar2)) {
                        this.f49085c++;
                        C17814h b = m59226b((E) hVar, (E) hVar2);
                        int i3 = this.f49084b - 1;
                        atomicReferenceArray.set(length, b);
                        this.f49084b = i3;
                        unlock();
                        return d;
                    }
                    unlock();
                    return null;
                }
            }
            unlock();
            return null;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo46085a(Object obj, int i) {
            try {
                C17814h e = m59229e(obj, i);
                if (e == null) {
                    mo46100e();
                    return null;
                }
                V d = e.mo46058d();
                if (d == null) {
                    m59230f();
                }
                mo46100e();
                return d;
            } catch (Throwable th) {
                mo46100e();
                throw th;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo46095b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f49084b != 0) {
                    C17814h e = m59229e(obj, i);
                    if (!(e == null || e.mo46058d() == null)) {
                        z = true;
                    }
                    return z;
                }
                mo46100e();
                return false;
            } finally {
                mo46100e();
            }
        }

        C17819m(C17801bw<K, V, E, S> bwVar, int i, int i2) {
            this.f49083a = bwVar;
            this.f49088f = i2;
            m59223a(m59221a(i));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo46086a(K k, int i, V v) {
            lock();
            try {
                m59232h();
                AtomicReferenceArray<E> atomicReferenceArray = this.f49087e;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17814h hVar = (C17814h) atomicReferenceArray.get(length);
                C17814h hVar2 = hVar;
                while (hVar2 != null) {
                    Object a = hVar2.mo46055a();
                    if (hVar2.mo46056b() != i || a == null || !this.f49083a.f49051e.mo44882a(k, a)) {
                        hVar2 = hVar2.mo46057c();
                    } else {
                        V d = hVar2.mo46058d();
                        if (d == null) {
                            if (m59224a((E) hVar2)) {
                                int i2 = this.f49084b;
                                this.f49085c++;
                                int i3 = this.f49084b - 1;
                                atomicReferenceArray.set(length, m59226b((E) hVar, (E) hVar2));
                                this.f49084b = i3;
                            }
                            return null;
                        }
                        this.f49085c++;
                        m59222a((E) hVar2, v);
                        unlock();
                        return d;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
            if (r8.f49083a.mo46027b().mo44882a(r11, r4.mo46058d()) == false) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
            if (m59224a((E) r4) != false) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
            unlock();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r8.f49085c++;
            r10 = r8.f49084b - 1;
            r0.set(r1, m59226b((E) r3, (E) r4));
            r8.f49084b = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
            unlock();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
            return r5;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo46096b(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.m59232h()     // Catch:{ all -> 0x006b }
                int r0 = r8.f49084b     // Catch:{ all -> 0x006b }
                java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r8.f49087e     // Catch:{ all -> 0x006b }
                int r1 = r0.length()     // Catch:{ all -> 0x006b }
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x006b }
                com.google.common.collect.bw$h r3 = (com.google.common.collect.C17801bw.C17814h) r3     // Catch:{ all -> 0x006b }
                r4 = r3
            L_0x0018:
                r5 = 0
                if (r4 == 0) goto L_0x0067
                java.lang.Object r6 = r4.mo46055a()     // Catch:{ all -> 0x006b }
                int r7 = r4.mo46056b()     // Catch:{ all -> 0x006b }
                if (r7 != r10) goto L_0x0062
                if (r6 == 0) goto L_0x0062
                com.google.common.collect.bw<K, V, E, S> r7 = r8.f49083a     // Catch:{ all -> 0x006b }
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.f49051e     // Catch:{ all -> 0x006b }
                boolean r6 = r7.mo44882a(r9, r6)     // Catch:{ all -> 0x006b }
                if (r6 == 0) goto L_0x0062
                java.lang.Object r9 = r4.mo46058d()     // Catch:{ all -> 0x006b }
                com.google.common.collect.bw<K, V, E, S> r10 = r8.f49083a     // Catch:{ all -> 0x006b }
                com.google.common.base.Equivalence r10 = r10.mo46027b()     // Catch:{ all -> 0x006b }
                boolean r9 = r10.mo44882a(r11, r9)     // Catch:{ all -> 0x006b }
                if (r9 == 0) goto L_0x0043
                r5 = 1
                goto L_0x004d
            L_0x0043:
                boolean r9 = m59224a((E) r4)     // Catch:{ all -> 0x006b }
                if (r9 != 0) goto L_0x004d
                r8.unlock()
                return r5
            L_0x004d:
                int r9 = r8.f49085c     // Catch:{ all -> 0x006b }
                int r9 = r9 + r2
                r8.f49085c = r9     // Catch:{ all -> 0x006b }
                com.google.common.collect.bw$h r9 = r8.m59226b((E) r3, (E) r4)     // Catch:{ all -> 0x006b }
                int r10 = r8.f49084b     // Catch:{ all -> 0x006b }
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch:{ all -> 0x006b }
                r8.f49084b = r10     // Catch:{ all -> 0x006b }
                r8.unlock()
                return r5
            L_0x0062:
                com.google.common.collect.bw$h r4 = r4.mo46057c()     // Catch:{ all -> 0x006b }
                goto L_0x0018
            L_0x0067:
                r8.unlock()
                return r5
            L_0x006b:
                r9 = move-exception
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C17801bw.C17819m.mo46096b(java.lang.Object, int, java.lang.Object):boolean");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo46087a(K k, int i, V v, boolean z) {
            lock();
            try {
                m59232h();
                int i2 = this.f49084b + 1;
                if (i2 > this.f49086d) {
                    m59231g();
                    i2 = this.f49084b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f49087e;
                int length = (atomicReferenceArray.length() - 1) & i;
                C17814h hVar = (C17814h) atomicReferenceArray.get(length);
                C17814h hVar2 = hVar;
                while (hVar2 != null) {
                    Object a = hVar2.mo46055a();
                    if (hVar2.mo46056b() != i || a == null || !this.f49083a.f49051e.mo44882a(k, a)) {
                        hVar2 = hVar2.mo46057c();
                    } else {
                        V d = hVar2.mo46058d();
                        if (d == null) {
                            this.f49085c++;
                            m59222a((E) hVar2, v);
                            this.f49084b = this.f49084b;
                            return null;
                        } else if (z) {
                            unlock();
                            return d;
                        } else {
                            this.f49085c++;
                            m59222a((E) hVar2, v);
                            unlock();
                            return d;
                        }
                    }
                }
                this.f49085c++;
                C17814h a2 = this.f49083a.f49052f.mo46070a(mo46084a(), k, i, hVar);
                m59222a((E) a2, v);
                atomicReferenceArray.set(length, a2);
                this.f49084b = i2;
                unlock();
                return null;
            } finally {
                unlock();
            }
        }
    }

    /* renamed from: com.google.common.collect.bw$n */
    static final class C17820n<K, V> extends C17803a<K, V> {
        private static final long serialVersionUID = 3;

        private Object readResolve() {
            return this.f49061f;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            mo46050a(objectOutputStream);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f49061f = mo46049a(objectInputStream).mo46023g();
            mo46051b(objectInputStream);
        }

        C17820n(C17821o oVar, C17821o oVar2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(oVar, oVar2, equivalence, equivalence2, i, concurrentMap);
        }
    }

    /* renamed from: com.google.common.collect.bw$o */
    enum C17821o {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Equivalence<Object> mo46101a() {
                return Equivalence.m57863a();
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Equivalence<Object> mo46101a() {
                return Equivalence.m57864b();
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Equivalence<Object> mo46101a();
    }

    /* renamed from: com.google.common.collect.bw$p */
    static final class C17824p<K, V> extends C17808b<K, V, C17824p<K, V>> implements C17830t<K, V, C17824p<K, V>> {

        /* renamed from: d */
        public volatile V f49093d;

        /* renamed from: com.google.common.collect.bw$p$a */
        static final class C17825a<K, V> implements C17815i<K, V, C17824p<K, V>, C17826q<K, V>> {

            /* renamed from: a */
            private static final C17825a<?, ?> f49094a = new C17825a<>();

            C17825a() {
            }

            /* renamed from: c */
            static <K, V> C17825a<K, V> m59261c() {
                return f49094a;
            }

            /* renamed from: b */
            public final C17821o mo46074b() {
                return C17821o.STRONG;
            }

            /* renamed from: a */
            public final C17821o mo46072a() {
                return C17821o.STRONG;
            }

            /* renamed from: a */
            private static void m59259a(C17826q<K, V> qVar, C17824p<K, V> pVar, V v) {
                pVar.f49093d = v;
            }

            /* renamed from: a */
            private static C17824p<K, V> m59257a(C17826q<K, V> qVar, C17824p<K, V> pVar, C17824p<K, V> pVar2) {
                return pVar.mo46102a(pVar2);
            }

            /* renamed from: b */
            private static C17826q<K, V> m59260b(C17801bw<K, V, C17824p<K, V>, C17826q<K, V>> bwVar, int i, int i2) {
                return new C17826q<>(bwVar, i, i2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C17814h mo46069a(C17819m mVar, C17814h hVar, C17814h hVar2) {
                return m59257a((C17826q) mVar, (C17824p) hVar, (C17824p) hVar2);
            }

            /* renamed from: a */
            public final /* synthetic */ C17819m mo46071a(C17801bw bwVar, int i, int i2) {
                return m59260b(bwVar, i, i2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo46073a(C17819m mVar, C17814h hVar, Object obj) {
                m59259a((C17826q) mVar, (C17824p) hVar, (V) obj);
            }

            /* renamed from: a */
            private static C17824p<K, V> m59258a(C17826q<K, V> qVar, K k, int i, C17824p<K, V> pVar) {
                return new C17824p<>(k, i, pVar);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C17814h mo46070a(C17819m mVar, Object obj, int i, C17814h hVar) {
                return m59258a((C17826q) mVar, (K) obj, i, (C17824p) hVar);
            }
        }

        /* renamed from: d */
        public final V mo46058d() {
            return this.f49093d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17824p<K, V> mo46102a(C17824p<K, V> pVar) {
            C17824p<K, V> pVar2 = new C17824p<>(this.f49066a, this.f49067b, pVar);
            pVar2.f49093d = this.f49093d;
            return pVar2;
        }

        C17824p(K k, int i, C17824p<K, V> pVar) {
            super(k, i, pVar);
        }
    }

    /* renamed from: com.google.common.collect.bw$q */
    static final class C17826q<K, V> extends C17819m<K, V, C17824p<K, V>, C17826q<K, V>> {
        /* access modifiers changed from: private */
        /* renamed from: f */
        public C17826q<K, V> mo46084a() {
            return this;
        }

        C17826q(C17801bw<K, V, C17824p<K, V>, C17826q<K, V>> bwVar, int i, int i2) {
            super(bwVar, i, i2);
        }
    }

    /* renamed from: com.google.common.collect.bw$r */
    static final class C17827r<K, V> extends C17808b<K, V, C17827r<K, V>> implements C17804aa<K, V, C17827r<K, V>> {

        /* renamed from: d */
        public volatile C17805ab<K, V, C17827r<K, V>> f49095d = C17801bw.m59171a();

        /* renamed from: com.google.common.collect.bw$r$a */
        static final class C17828a<K, V> implements C17815i<K, V, C17827r<K, V>, C17829s<K, V>> {

            /* renamed from: a */
            private static final C17828a<?, ?> f49096a = new C17828a<>();

            C17828a() {
            }

            /* renamed from: c */
            static <K, V> C17828a<K, V> m59278c() {
                return f49096a;
            }

            /* renamed from: a */
            public final C17821o mo46072a() {
                return C17821o.STRONG;
            }

            /* renamed from: b */
            public final C17821o mo46074b() {
                return C17821o.WEAK;
            }

            /* renamed from: b */
            private static C17829s<K, V> m59277b(C17801bw<K, V, C17827r<K, V>, C17829s<K, V>> bwVar, int i, int i2) {
                return new C17829s<>(bwVar, i, i2);
            }

            /* renamed from: a */
            private static C17827r<K, V> m59274a(C17829s<K, V> sVar, C17827r<K, V> rVar, C17827r<K, V> rVar2) {
                if (C17819m.m59224a(rVar)) {
                    return null;
                }
                return rVar.mo46103a(sVar.f49097h, rVar2);
            }

            /* renamed from: a */
            private static void m59276a(C17829s<K, V> sVar, C17827r<K, V> rVar, V v) {
                rVar.mo46104a(v, sVar.f49097h);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C17814h mo46069a(C17819m mVar, C17814h hVar, C17814h hVar2) {
                return m59274a((C17829s) mVar, (C17827r) hVar, (C17827r) hVar2);
            }

            /* renamed from: a */
            public final /* synthetic */ C17819m mo46071a(C17801bw bwVar, int i, int i2) {
                return m59277b(bwVar, i, i2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo46073a(C17819m mVar, C17814h hVar, Object obj) {
                m59276a((C17829s) mVar, (C17827r) hVar, (V) obj);
            }

            /* renamed from: a */
            private static C17827r<K, V> m59275a(C17829s<K, V> sVar, K k, int i, C17827r<K, V> rVar) {
                return new C17827r<>(k, i, rVar);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C17814h mo46070a(C17819m mVar, Object obj, int i, C17814h hVar) {
                return m59275a((C17829s) mVar, (K) obj, i, (C17827r) hVar);
            }
        }

        /* renamed from: e */
        public final C17805ab<K, V, C17827r<K, V>> mo46052e() {
            return this.f49095d;
        }

        /* renamed from: d */
        public final V mo46058d() {
            return this.f49095d.get();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo46104a(V v, ReferenceQueue<V> referenceQueue) {
            C17805ab<K, V, C17827r<K, V>> abVar = this.f49095d;
            this.f49095d = new C17806ac(referenceQueue, v, this);
            abVar.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17827r<K, V> mo46103a(ReferenceQueue<V> referenceQueue, C17827r<K, V> rVar) {
            C17827r<K, V> rVar2 = new C17827r<>(this.f49066a, this.f49067b, rVar);
            rVar2.f49095d = this.f49095d.mo46045a(referenceQueue, rVar2);
            return rVar2;
        }

        C17827r(K k, int i, C17827r<K, V> rVar) {
            super(k, i, rVar);
        }
    }

    /* renamed from: com.google.common.collect.bw$s */
    static final class C17829s<K, V> extends C17819m<K, V, C17827r<K, V>, C17829s<K, V>> {

        /* renamed from: h */
        public final ReferenceQueue<V> f49097h = new ReferenceQueue<>();

        /* access modifiers changed from: private */
        /* renamed from: f */
        public C17829s<K, V> mo46084a() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo46093b() {
            mo46094b(this.f49097h);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo46098c() {
            m59227c(this.f49097h);
        }

        C17829s(C17801bw<K, V, C17827r<K, V>, C17829s<K, V>> bwVar, int i, int i2) {
            super(bwVar, i, i2);
        }
    }

    /* renamed from: com.google.common.collect.bw$t */
    interface C17830t extends C17814h {
    }

    /* renamed from: com.google.common.collect.bw$u */
    final class C17831u extends C17813g<V> {
        public final V next() {
            return mo46066a().getValue();
        }

        C17831u() {
            super();
        }
    }

    /* renamed from: com.google.common.collect.bw$v */
    final class C17832v extends AbstractCollection<V> {
        public final void clear() {
            C17801bw.this.clear();
        }

        public final boolean isEmpty() {
            return C17801bw.this.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new C17831u();
        }

        public final int size() {
            return C17801bw.this.size();
        }

        public final Object[] toArray() {
            return C17801bw.m59174a((Collection<E>) this).toArray();
        }

        C17832v() {
        }

        public final boolean contains(Object obj) {
            return C17801bw.this.containsValue(obj);
        }

        public final <T> T[] toArray(T[] tArr) {
            return C17801bw.m59174a((Collection<E>) this).toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.bw$w */
    static final class C17833w<K, V> extends C17809c<K, V, C17833w<K, V>> implements C17830t<K, V, C17833w<K, V>> {

        /* renamed from: c */
        public volatile V f49100c;

        /* renamed from: com.google.common.collect.bw$w$a */
        static final class C17834a<K, V> implements C17815i<K, V, C17833w<K, V>, C17835x<K, V>> {

            /* renamed from: a */
            private static final C17834a<?, ?> f49101a = new C17834a<>();

            C17834a() {
            }

            /* renamed from: c */
            static <K, V> C17834a<K, V> m59295c() {
                return f49101a;
            }

            /* renamed from: b */
            public final C17821o mo46074b() {
                return C17821o.STRONG;
            }

            /* renamed from: a */
            public final C17821o mo46072a() {
                return C17821o.WEAK;
            }

            /* renamed from: a */
            private static void m59293a(C17835x<K, V> xVar, C17833w<K, V> wVar, V v) {
                wVar.f49100c = v;
            }

            /* renamed from: b */
            private static C17835x<K, V> m59294b(C17801bw<K, V, C17833w<K, V>, C17835x<K, V>> bwVar, int i, int i2) {
                return new C17835x<>(bwVar, i, i2);
            }

            /* renamed from: a */
            private static C17833w<K, V> m59291a(C17835x<K, V> xVar, C17833w<K, V> wVar, C17833w<K, V> wVar2) {
                if (wVar.mo46055a() == null) {
                    return null;
                }
                return wVar.mo46113a(xVar.f49102h, wVar2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C17814h mo46069a(C17819m mVar, C17814h hVar, C17814h hVar2) {
                return m59291a((C17835x) mVar, (C17833w) hVar, (C17833w) hVar2);
            }

            /* renamed from: a */
            public final /* synthetic */ C17819m mo46071a(C17801bw bwVar, int i, int i2) {
                return m59294b(bwVar, i, i2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo46073a(C17819m mVar, C17814h hVar, Object obj) {
                m59293a((C17835x) mVar, (C17833w) hVar, (V) obj);
            }

            /* renamed from: a */
            private static C17833w<K, V> m59292a(C17835x<K, V> xVar, K k, int i, C17833w<K, V> wVar) {
                return new C17833w<>(xVar.f49102h, k, i, wVar);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C17814h mo46070a(C17819m mVar, Object obj, int i, C17814h hVar) {
                return m59292a((C17835x) mVar, (K) obj, i, (C17833w) hVar);
            }
        }

        /* renamed from: d */
        public final V mo46058d() {
            return this.f49100c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17833w<K, V> mo46113a(ReferenceQueue<K> referenceQueue, C17833w<K, V> wVar) {
            C17833w<K, V> wVar2 = new C17833w<>(referenceQueue, mo46055a(), this.f49069a, wVar);
            wVar2.f49100c = this.f49100c;
            return wVar2;
        }

        C17833w(ReferenceQueue<K> referenceQueue, K k, int i, C17833w<K, V> wVar) {
            super(referenceQueue, k, i, wVar);
        }
    }

    /* renamed from: com.google.common.collect.bw$x */
    static final class C17835x<K, V> extends C17819m<K, V, C17833w<K, V>, C17835x<K, V>> {

        /* renamed from: h */
        public final ReferenceQueue<K> f49102h = new ReferenceQueue<>();

        /* access modifiers changed from: private */
        /* renamed from: f */
        public C17835x<K, V> mo46084a() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo46093b() {
            mo46088a(this.f49102h);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo46098c() {
            m59227c(this.f49102h);
        }

        C17835x(C17801bw<K, V, C17833w<K, V>, C17835x<K, V>> bwVar, int i, int i2) {
            super(bwVar, i, i2);
        }
    }

    /* renamed from: com.google.common.collect.bw$y */
    static final class C17836y<K, V> extends C17809c<K, V, C17836y<K, V>> implements C17804aa<K, V, C17836y<K, V>> {

        /* renamed from: c */
        public volatile C17805ab<K, V, C17836y<K, V>> f49103c = C17801bw.m59171a();

        /* renamed from: com.google.common.collect.bw$y$a */
        static final class C17837a<K, V> implements C17815i<K, V, C17836y<K, V>, C17838z<K, V>> {

            /* renamed from: a */
            private static final C17837a<?, ?> f49104a = new C17837a<>();

            C17837a() {
            }

            /* renamed from: c */
            static <K, V> C17837a<K, V> m59314c() {
                return f49104a;
            }

            /* renamed from: a */
            public final C17821o mo46072a() {
                return C17821o.WEAK;
            }

            /* renamed from: b */
            public final C17821o mo46074b() {
                return C17821o.WEAK;
            }

            /* renamed from: b */
            private static C17838z<K, V> m59313b(C17801bw<K, V, C17836y<K, V>, C17838z<K, V>> bwVar, int i, int i2) {
                return new C17838z<>(bwVar, i, i2);
            }

            /* renamed from: a */
            private static void m59312a(C17838z<K, V> zVar, C17836y<K, V> yVar, V v) {
                yVar.mo46115a(v, zVar.f49106i);
            }

            /* renamed from: a */
            private static C17836y<K, V> m59310a(C17838z<K, V> zVar, C17836y<K, V> yVar, C17836y<K, V> yVar2) {
                if (yVar.mo46055a() != null && !C17819m.m59224a(yVar)) {
                    return yVar.mo46114a(zVar.f49105h, zVar.f49106i, yVar2);
                }
                return null;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C17814h mo46069a(C17819m mVar, C17814h hVar, C17814h hVar2) {
                return m59310a((C17838z) mVar, (C17836y) hVar, (C17836y) hVar2);
            }

            /* renamed from: a */
            public final /* synthetic */ C17819m mo46071a(C17801bw bwVar, int i, int i2) {
                return m59313b(bwVar, i, i2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo46073a(C17819m mVar, C17814h hVar, Object obj) {
                m59312a((C17838z) mVar, (C17836y) hVar, (V) obj);
            }

            /* renamed from: a */
            private static C17836y<K, V> m59311a(C17838z<K, V> zVar, K k, int i, C17836y<K, V> yVar) {
                return new C17836y<>(zVar.f49105h, k, i, yVar);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C17814h mo46070a(C17819m mVar, Object obj, int i, C17814h hVar) {
                return m59311a((C17838z) mVar, (K) obj, i, (C17836y) hVar);
            }
        }

        /* renamed from: e */
        public final C17805ab<K, V, C17836y<K, V>> mo46052e() {
            return this.f49103c;
        }

        /* renamed from: d */
        public final V mo46058d() {
            return this.f49103c.get();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo46115a(V v, ReferenceQueue<V> referenceQueue) {
            C17805ab<K, V, C17836y<K, V>> abVar = this.f49103c;
            this.f49103c = new C17806ac(referenceQueue, v, this);
            abVar.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17836y<K, V> mo46114a(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, C17836y<K, V> yVar) {
            C17836y<K, V> yVar2 = new C17836y<>(referenceQueue, mo46055a(), this.f49069a, yVar);
            yVar2.f49103c = this.f49103c.mo46045a(referenceQueue2, yVar2);
            return yVar2;
        }

        C17836y(ReferenceQueue<K> referenceQueue, K k, int i, C17836y<K, V> yVar) {
            super(referenceQueue, k, i, yVar);
        }
    }

    /* renamed from: com.google.common.collect.bw$z */
    static final class C17838z<K, V> extends C17819m<K, V, C17836y<K, V>, C17838z<K, V>> {

        /* renamed from: h */
        public final ReferenceQueue<K> f49105h = new ReferenceQueue<>();

        /* renamed from: i */
        public final ReferenceQueue<V> f49106i = new ReferenceQueue<>();

        /* access modifiers changed from: private */
        /* renamed from: f */
        public C17838z<K, V> mo46084a() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo46098c() {
            m59227c(this.f49105h);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo46093b() {
            mo46088a(this.f49105h);
            mo46094b(this.f49106i);
        }

        C17838z(C17801bw<K, V, C17836y<K, V>, C17838z<K, V>> bwVar, int i, int i2) {
            super(bwVar, i, i2);
        }
    }

    /* renamed from: a */
    private static int m59169a(int i) {
        int i2 = i + ((i << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* renamed from: a */
    static <K, V, E extends C17814h<K, V, E>> C17805ab<K, V, E> m59171a() {
        return f49046g;
    }

    public final void clear() {
        for (C17819m<K, V, E, S> d : this.f49049c) {
            d.mo46099d();
        }
    }

    public final Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f49055j;
        if (set != null) {
            return set;
        }
        C17812f fVar = new C17812f();
        this.f49055j = fVar;
        return fVar;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f49053h;
        if (set != null) {
            return set;
        }
        C17817k kVar = new C17817k();
        this.f49053h = kVar;
        return kVar;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f49054i;
        if (collection != null) {
            return collection;
        }
        C17832v vVar = new C17832v();
        this.f49054i = vVar;
        return vVar;
    }

    public final int size() {
        long j = 0;
        for (C17819m<K, V, E, S> mVar : this.f49049c) {
            j += (long) mVar.f49084b;
        }
        return C18143c.m59970b(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Equivalence<Object> mo46027b() {
        return this.f49052f.mo46074b().mo46101a();
    }

    public final boolean isEmpty() {
        C17819m<K, V, E, S>[] mVarArr = this.f49049c;
        long j = 0;
        for (int i = 0; i < mVarArr.length; i++) {
            if (mVarArr[i].f49084b != 0) {
                return false;
            }
            j += (long) mVarArr[i].f49085c;
        }
        if (j != 0) {
            for (int i2 = 0; i2 < mVarArr.length; i2++) {
                if (mVarArr[i2].f49084b != 0) {
                    return false;
                }
                j -= (long) mVarArr[i2].f49085c;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        C17820n nVar = new C17820n(this.f49052f.mo46072a(), this.f49052f.mo46074b(), this.f49051e, this.f49052f.mo46074b().mo46101a(), this.f49050d, this);
        return nVar;
    }

    /* renamed from: c */
    private static C17819m<K, V, E, S>[] m59177c(int i) {
        return new C17819m[i];
    }

    /* renamed from: a */
    private int m59170a(Object obj) {
        return m59169a(this.f49051e.mo44881a(obj));
    }

    /* renamed from: b */
    private C17819m<K, V, E, S> m59175b(int i) {
        return this.f49049c[(i >>> this.f49048b) & this.f49047a];
    }

    /* renamed from: b */
    static V m59176b(E e) {
        if (e.mo46055a() == null) {
            return null;
        }
        V d = e.mo46058d();
        if (d == null) {
            return null;
        }
        return d;
    }

    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int a = m59170a(obj);
        return m59175b(a).mo46095b(obj, a);
    }

    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = m59170a(obj);
        return m59175b(a).mo46085a(obj, a);
    }

    public final V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = m59170a(obj);
        return m59175b(a).mo46097c(obj, a);
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m59174a(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C17782br.m59113a((Collection<T>) arrayList, collection.iterator());
        return arrayList;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    static <K, V> C17801bw<K, V, ? extends C17814h<K, V, ?>, ?> m59173a(C17800bv bvVar) {
        if (bvVar.mo46021e() == C17821o.STRONG && bvVar.mo46022f() == C17821o.STRONG) {
            return new C17801bw<>(bvVar, C17825a.m59261c());
        }
        if (bvVar.mo46021e() == C17821o.STRONG && bvVar.mo46022f() == C17821o.WEAK) {
            return new C17801bw<>(bvVar, C17828a.m59278c());
        }
        if (bvVar.mo46021e() == C17821o.WEAK && bvVar.mo46022f() == C17821o.STRONG) {
            return new C17801bw<>(bvVar, C17834a.m59295c());
        }
        if (bvVar.mo46021e() == C17821o.WEAK && bvVar.mo46022f() == C17821o.WEAK) {
            return new C17801bw<>(bvVar, C17837a.m59314c());
        }
        throw new AssertionError();
    }

    public final boolean containsValue(Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        C17819m<K, V, E, S>[] mVarArr = this.f49049c;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (C17819m<K, V, E, S> mVar : mVarArr) {
                int i2 = mVar.f49084b;
                AtomicReferenceArray<E> atomicReferenceArray = mVar.f49087e;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (C17814h hVar = (C17814h) atomicReferenceArray.get(i3); hVar != null; hVar = hVar.mo46057c()) {
                        Object b = mVar.mo46092b(hVar);
                        if (b != null && mo46027b().mo44882a(obj2, b)) {
                            return true;
                        }
                    }
                }
                j2 += (long) mVar.f49085c;
            }
            if (j2 == j) {
                break;
            }
            i++;
            j = j2;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo46025a(C17805ab<K, V, E> abVar) {
        C17814h a = abVar.mo46046a();
        int b = a.mo46056b();
        m59175b(b).mo46090a(a.mo46055a(), b, abVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo46026a(E e) {
        int b = e.mo46056b();
        m59175b(b).mo46089a(e, b);
    }

    /* renamed from: a */
    private C17819m<K, V, E, S> m59172a(int i, int i2) {
        return this.f49052f.mo46071a(this, i, -1);
    }

    public final V put(K k, V v) {
        C17439m.m57962a(k);
        C17439m.m57962a(v);
        int a = m59170a((Object) k);
        return m59175b(a).mo46087a(k, a, v, false);
    }

    public final V putIfAbsent(K k, V v) {
        C17439m.m57962a(k);
        C17439m.m57962a(v);
        int a = m59170a((Object) k);
        return m59175b(a).mo46087a(k, a, v, true);
    }

    public final V replace(K k, V v) {
        C17439m.m57962a(k);
        C17439m.m57962a(v);
        int a = m59170a((Object) k);
        return m59175b(a).mo46086a(k, a, v);
    }

    public final boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int a = m59170a(obj);
        return m59175b(a).mo46096b(obj, a, obj2);
    }

    private C17801bw(C17800bv bvVar, C17815i<K, V, E, S> iVar) {
        this.f49050d = Math.min(bvVar.mo46019c(), 65536);
        this.f49051e = bvVar.mo46012a();
        this.f49052f = iVar;
        int min = Math.min(bvVar.mo46016b(), 1073741824);
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 < this.f49050d) {
            i3++;
            i2 <<= 1;
        }
        this.f49048b = 32 - i3;
        this.f49047a = i2 - 1;
        this.f49049c = m59177c(i2);
        int i4 = min / i2;
        if (i2 * i4 < min) {
            i4++;
        }
        while (i < i4) {
            i <<= 1;
        }
        for (int i5 = 0; i5 < this.f49049c.length; i5++) {
            this.f49049c[i5] = m59172a(i, -1);
        }
    }

    public final boolean replace(K k, V v, V v2) {
        C17439m.m57962a(k);
        C17439m.m57962a(v2);
        if (v == null) {
            return false;
        }
        int a = m59170a((Object) k);
        return m59175b(a).mo46091a(k, a, v, v2);
    }
}
