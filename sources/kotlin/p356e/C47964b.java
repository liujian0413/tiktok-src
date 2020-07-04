package kotlin.p356e;

import java.util.NoSuchElementException;
import kotlin.collections.C7506ac;

/* renamed from: kotlin.e.b */
public final class C47964b extends C7506ac {

    /* renamed from: a */
    public final int f122800a;

    /* renamed from: b */
    private final int f122801b;

    /* renamed from: c */
    private boolean f122802c;

    /* renamed from: d */
    private int f122803d;

    public final boolean hasNext() {
        return this.f122802c;
    }

    /* renamed from: a */
    public final int mo19392a() {
        int i = this.f122803d;
        if (i != this.f122801b) {
            this.f122803d += this.f122800a;
        } else if (this.f122802c) {
            this.f122802c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public C47964b(int i, int i2, int i3) {
        this.f122800a = i3;
        this.f122801b = i2;
        boolean z = false;
        if (this.f122800a <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f122802c = z;
        if (!this.f122802c) {
            i = this.f122801b;
        }
        this.f122803d = i;
    }
}
