package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.C17882cb.C17883a;
import com.google.common.primitives.C18143c;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public final class EnumMultiset<E extends Enum<E>> extends C18032i<E> implements Serializable {
    private static final long serialVersionUID = 0;
    public transient int[] counts = new int[this.enumConstants.length];
    public transient int distinctElements;
    public transient E[] enumConstants;
    public transient long size;
    private transient Class<E> type;

    /* renamed from: com.google.common.collect.EnumMultiset$a */
    abstract class C17567a<T> implements Iterator<T> {

        /* renamed from: b */
        int f48654b;

        /* renamed from: c */
        int f48655c = -1;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo45306a(int i);

        public boolean hasNext() {
            while (this.f48654b < EnumMultiset.this.enumConstants.length) {
                if (EnumMultiset.this.counts[this.f48654b] > 0) {
                    return true;
                }
                this.f48654b++;
            }
            return false;
        }

        public T next() {
            if (hasNext()) {
                T a = mo45306a(this.f48654b);
                this.f48655c = this.f48654b;
                this.f48654b++;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            if (this.f48655c >= 0) {
                z = true;
            } else {
                z = false;
            }
            C18053v.m59703a(z);
            if (EnumMultiset.this.counts[this.f48655c] > 0) {
                EnumMultiset.this.distinctElements--;
                EnumMultiset.this.size -= (long) EnumMultiset.this.counts[this.f48655c];
                EnumMultiset.this.counts[this.f48655c] = 0;
            }
            this.f48655c = -1;
        }

        C17567a() {
        }
    }

    /* access modifiers changed from: 0000 */
    public final int distinctElements() {
        return this.distinctElements;
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<E> elementIterator() {
        return new C17567a<E>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public E mo45306a(int i) {
                return EnumMultiset.this.enumConstants[i];
            }
        };
    }

    public final /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<C17883a<E>> entryIterator() {
        return new C17567a<C17883a<E>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public C17883a<E> mo45306a(final int i) {
                return new C17886a<E>() {
                    /* access modifiers changed from: private */
                    /* renamed from: c */
                    public E mo45308b() {
                        return EnumMultiset.this.enumConstants[i];
                    }

                    /* renamed from: a */
                    public final int mo45307a() {
                        return EnumMultiset.this.counts[i];
                    }
                };
            }
        };
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public final Iterator<E> iterator() {
        return C17884cc.m59425a((C17882cb<E>) this);
    }

    public final int size() {
        return C18143c.m59970b(this.size);
    }

    public final void clear() {
        Arrays.fill(this.counts, 0);
        this.size = 0;
        this.distinctElements = 0;
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Class<E> cls) {
        return new EnumMultiset<>(cls);
    }

    public final /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.type);
        C17928cz.m59558a((C17882cb<E>) this, objectOutputStream);
    }

    private EnumMultiset(Class<E> cls) {
        this.type = cls;
        C17439m.m57968a(cls.isEnum());
        this.enumConstants = (Enum[]) cls.getEnumConstants();
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable) {
        Iterator it = iterable.iterator();
        C17439m.m57969a(it.hasNext(), (Object) "EnumMultiset constructor passed empty Iterable");
        EnumMultiset<E> enumMultiset = new EnumMultiset<>(((Enum) it.next()).getDeclaringClass());
        C17777bq.m59095a((Collection<T>) enumMultiset, iterable);
        return enumMultiset;
    }

    private boolean isActuallyE(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        E e = (Enum) obj;
        int ordinal = e.ordinal();
        if (ordinal >= this.enumConstants.length || this.enumConstants[ordinal] != e) {
            return false;
        }
        return true;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.type = (Class) objectInputStream.readObject();
        this.enumConstants = (Enum[]) this.type.getEnumConstants();
        this.counts = new int[this.enumConstants.length];
        C17928cz.m59556a((C17882cb<E>) this, objectInputStream);
    }

    public final int count(Object obj) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        return this.counts[((Enum) obj).ordinal()];
    }

    /* access modifiers changed from: 0000 */
    public final void checkIsE(Object obj) {
        C17439m.m57962a(obj);
        if (!isActuallyE(obj)) {
            StringBuilder sb = new StringBuilder("Expected an ");
            sb.append(this.type);
            sb.append(" but got ");
            sb.append(obj);
            throw new ClassCastException(sb.toString());
        }
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable, Class<E> cls) {
        EnumMultiset<E> create = create(cls);
        C17777bq.m59095a((Collection<T>) create, iterable);
        return create;
    }

    public final int add(E e, int i) {
        boolean z;
        checkIsE(e);
        C18053v.m59700a(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        int ordinal = e.ordinal();
        int i2 = this.counts[ordinal];
        long j = (long) i;
        long j2 = ((long) i2) + j;
        if (j2 <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57973a(z, "too many occurrences: %s", j2);
        this.counts[ordinal] = (int) j2;
        if (i2 == 0) {
            this.distinctElements++;
        }
        this.size += j;
        return i2;
    }

    public final int setCount(E e, int i) {
        checkIsE(e);
        C18053v.m59700a(i, "count");
        int ordinal = e.ordinal();
        int i2 = this.counts[ordinal];
        this.counts[ordinal] = i;
        this.size += (long) (i - i2);
        if (i2 == 0 && i > 0) {
            this.distinctElements++;
        } else if (i2 > 0 && i == 0) {
            this.distinctElements--;
        }
        return i2;
    }

    public final int remove(Object obj, int i) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        Enum enumR = (Enum) obj;
        C18053v.m59700a(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        int ordinal = enumR.ordinal();
        int i2 = this.counts[ordinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 <= i) {
            this.counts[ordinal] = 0;
            this.distinctElements--;
            this.size -= (long) i2;
        } else {
            this.counts[ordinal] = i2 - i;
            this.size -= (long) i;
        }
        return i2;
    }
}
