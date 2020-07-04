package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.l */
public final class C14064l extends AbstractList<GraphRequest> {

    /* renamed from: g */
    private static AtomicInteger f37141g = new AtomicInteger();

    /* renamed from: a */
    public Handler f37142a;

    /* renamed from: b */
    public List<GraphRequest> f37143b;

    /* renamed from: c */
    public int f37144c;

    /* renamed from: d */
    public final String f37145d;

    /* renamed from: e */
    public List<C14065a> f37146e;

    /* renamed from: f */
    public String f37147f;

    /* renamed from: com.facebook.l$a */
    public interface C14065a {
        /* renamed from: a */
        void mo32389a(C14064l lVar);
    }

    /* renamed from: com.facebook.l$b */
    public interface C14066b extends C14065a {
    }

    /* renamed from: c */
    private List<GraphResponse> m41463c() {
        return GraphRequest.m38257a(this);
    }

    /* renamed from: d */
    private C13980k m41464d() {
        return GraphRequest.m38274b(this);
    }

    /* renamed from: b */
    public final C13980k mo33715b() {
        return m41464d();
    }

    public final void clear() {
        this.f37143b.clear();
    }

    public final int size() {
        return this.f37143b.size();
    }

    /* renamed from: a */
    public final List<GraphResponse> mo33710a() {
        return m41463c();
    }

    public C14064l() {
        this.f37143b = new ArrayList();
        this.f37144c = 0;
        this.f37145d = Integer.valueOf(f37141g.incrementAndGet()).toString();
        this.f37146e = new ArrayList();
        this.f37143b = new ArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public GraphRequest remove(int i) {
        return (GraphRequest) this.f37143b.remove(i);
    }

    /* renamed from: a */
    public final GraphRequest get(int i) {
        return (GraphRequest) this.f37143b.get(i);
    }

    /* renamed from: a */
    public final void mo33711a(C14065a aVar) {
        if (!this.f37146e.contains(aVar)) {
            this.f37146e.add(aVar);
        }
    }

    public C14064l(Collection<GraphRequest> collection) {
        this.f37143b = new ArrayList();
        this.f37144c = 0;
        this.f37145d = Integer.valueOf(f37141g.incrementAndGet()).toString();
        this.f37146e = new ArrayList();
        this.f37143b = new ArrayList(collection);
    }

    /* renamed from: a */
    public final boolean add(GraphRequest graphRequest) {
        return this.f37143b.add(graphRequest);
    }

    public C14064l(GraphRequest... graphRequestArr) {
        this.f37143b = new ArrayList();
        this.f37144c = 0;
        this.f37145d = Integer.valueOf(f37141g.incrementAndGet()).toString();
        this.f37146e = new ArrayList();
        this.f37143b = Arrays.asList(graphRequestArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void add(int i, GraphRequest graphRequest) {
        this.f37143b.add(i, graphRequest);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public GraphRequest set(int i, GraphRequest graphRequest) {
        return (GraphRequest) this.f37143b.set(i, graphRequest);
    }
}
