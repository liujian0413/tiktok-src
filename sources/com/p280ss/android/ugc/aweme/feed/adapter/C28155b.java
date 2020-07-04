package com.p280ss.android.ugc.aweme.feed.adapter;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0070y;
import android.arch.lifecycle.C0071z;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24716aj;
import com.p280ss.android.ugc.aweme.feed.C28201af;
import com.p280ss.android.ugc.aweme.feed.event.C28308ad;
import com.p280ss.android.ugc.aweme.feed.helper.C28416d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.p931a.C21085a.C21088b;
import com.p280ss.android.ugc.playerkit.videoview.C44960f;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.b */
public abstract class C28155b implements C0053p<C23083a>, C0071z, C21088b, C28130ac {

    /* renamed from: a */
    private boolean f74251a;

    /* renamed from: h */
    public DataCenter f74252h;

    /* renamed from: i */
    public WidgetManager f74253i;

    /* renamed from: j */
    public String f74254j = "click";

    /* renamed from: A */
    public Aweme mo71542A() {
        return C28131ad.m92388a(this);
    }

    /* renamed from: B */
    public boolean mo71517B() {
        return false;
    }

    /* renamed from: C */
    public void mo71543C() {
    }

    /* renamed from: D */
    public void mo71544D() {
    }

    /* renamed from: E */
    public void mo71545E() {
    }

    /* renamed from: F */
    public C28201af mo71518F() {
        return null;
    }

    /* renamed from: G */
    public C28416d mo71546G() {
        return null;
    }

    /* renamed from: a */
    public void mo71521a() {
    }

    /* renamed from: a */
    public void mo71547a(long j) {
    }

    /* renamed from: a */
    public void mo71525a(C28308ad adVar) {
    }

    /* renamed from: a */
    public void mo71548a(Aweme aweme, int i) {
        C28131ad.m92389a(this, aweme, i);
    }

    /* renamed from: a */
    public void mo71549a(ShareCompleteEvent shareCompleteEvent) {
    }

    /* renamed from: a */
    public void mo71550a(String str, String str2) {
    }

    /* renamed from: a */
    public void mo71551a(Map map, int i) {
    }

    public void au_() {
    }

    /* renamed from: b */
    public C44960f mo71553b() {
        return null;
    }

    /* renamed from: b */
    public void mo71528b(int i) {
    }

    /* renamed from: c */
    public void mo71555c() {
    }

    /* renamed from: c */
    public void mo71530c(int i) {
    }

    /* renamed from: c */
    public void mo71531c(Aweme aweme) {
    }

    /* renamed from: c */
    public void mo67769c(boolean z) {
    }

    /* renamed from: e */
    public void mo71534e(int i) {
    }

    /* renamed from: e */
    public void mo71535e(boolean z) {
    }

    /* renamed from: f */
    public void mo71536f(boolean z) {
    }

    /* renamed from: g */
    public void mo71559g(boolean z) {
    }

    /* renamed from: i */
    public void mo71561i(boolean z) {
    }

    /* renamed from: j */
    public void mo71562j(boolean z) {
    }

    /* renamed from: o */
    public C24716aj mo71564o() {
        return null;
    }

    /* renamed from: p */
    public void mo71565p() {
    }

    /* renamed from: q */
    public C28129ab mo71566q() {
        return null;
    }

    /* renamed from: r */
    public final boolean mo71567r() {
        return this.f74251a;
    }

    /* renamed from: x */
    public void mo71573x() {
    }

    /* renamed from: y */
    public void mo71574y() {
    }

    public C0070y getViewModelStore() {
        return new C0070y();
    }

    /* renamed from: d */
    public void mo71533d(boolean z) {
        this.f74251a = z;
    }

    /* renamed from: f */
    public void mo71558f(String str) {
        this.f74254j = str;
    }
}
