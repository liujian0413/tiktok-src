package com.google.android.gms.internal.ads;

import android.view.View;

final class anz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f40807a;

    /* renamed from: b */
    private final /* synthetic */ aag f40808b;

    /* renamed from: c */
    private final /* synthetic */ int f40809c;

    /* renamed from: d */
    private final /* synthetic */ anw f40810d;

    anz(anw anw, View view, aag aag, int i) {
        this.f40810d = anw;
        this.f40807a = view;
        this.f40808b = aag;
        this.f40809c = i;
    }

    public final void run() {
        this.f40810d.m46672a(this.f40807a, this.f40808b, this.f40809c - 1);
    }
}
