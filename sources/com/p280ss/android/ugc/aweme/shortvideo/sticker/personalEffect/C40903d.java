package com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect;

import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40368aa;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40369ab;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40934t;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.d */
public final class C40903d implements C40934t {

    /* renamed from: a */
    private C40904e f106377a;

    /* renamed from: b */
    private boolean f106378b;

    /* renamed from: a */
    public final boolean mo100381a() {
        return this.f106378b;
    }

    /* renamed from: c */
    public final void mo100383c() {
        mo101183d();
    }

    /* renamed from: b */
    public final void mo100382b() {
        this.f106378b = true;
        this.f106377a.mo101184a();
    }

    /* renamed from: d */
    public final void mo101183d() {
        this.f106378b = false;
        this.f106377a.mo101187b();
    }

    /* renamed from: a */
    public final void mo101181a(int i) {
        this.f106378b = true;
        this.f106377a.mo101185a(i);
    }

    /* renamed from: a */
    public final void mo101182a(List<? extends StickerWrapper> list) {
        C7573i.m23587b(list, "list");
        this.f106377a.mo101186a(list);
    }

    public C40903d(AppCompatActivity appCompatActivity, View view, C40369ab abVar, C40368aa aaVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(view, "rootView");
        this.f106377a = new C40904e(appCompatActivity, view, abVar, aaVar);
    }
}
