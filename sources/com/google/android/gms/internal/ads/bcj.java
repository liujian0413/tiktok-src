package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class bcj implements abo, Closeable, Iterator<aan> {

    /* renamed from: f */
    private static final aan f41452f = new bck("eof ");

    /* renamed from: g */
    private static bcr f41453g = bcr.m48435a(bcj.class);

    /* renamed from: a */
    protected C16169xm f41454a;

    /* renamed from: b */
    protected bcl f41455b;

    /* renamed from: c */
    long f41456c;

    /* renamed from: d */
    long f41457d;

    /* renamed from: e */
    long f41458e;

    /* renamed from: h */
    private aan f41459h;

    /* renamed from: i */
    private List<aan> f41460i = new ArrayList();

    /* renamed from: b */
    public final List<aan> mo40495b() {
        if (this.f41455b == null || this.f41459h == f41452f) {
            return this.f41460i;
        }
        return new bcp(this.f41460i, this);
    }

    /* renamed from: a */
    public void mo40492a(bcl bcl, long j, C16169xm xmVar) throws IOException {
        this.f41455b = bcl;
        long b = bcl.mo39637b();
        this.f41457d = b;
        this.f41456c = b;
        bcl.mo39636a(bcl.mo39637b() + j);
        this.f41458e = bcl.mo39637b();
        this.f41454a = xmVar;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        if (this.f41459h == f41452f) {
            return false;
        }
        if (this.f41459h != null) {
            return true;
        }
        try {
            this.f41459h = (aan) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f41459h = f41452f;
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final aan next() {
        aan a;
        if (this.f41459h != null && this.f41459h != f41452f) {
            aan aan = this.f41459h;
            this.f41459h = null;
            return aan;
        } else if (this.f41455b == null || this.f41456c >= this.f41458e) {
            this.f41459h = f41452f;
            throw new NoSuchElementException();
        } else {
            try {
                synchronized (this.f41455b) {
                    this.f41455b.mo39636a(this.f41456c);
                    a = this.f41454a.mo42033a(this.f41455b, this);
                    this.f41456c = this.f41455b.mo39637b();
                }
                return a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f41460i.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((aan) this.f41460i.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public void close() throws IOException {
        this.f41455b.close();
    }
}
