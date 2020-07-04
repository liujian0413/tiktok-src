package com.p280ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p280ss.android.ugc.aweme.tools.C42341f;
import com.p280ss.android.ugc.aweme.tools.extract.C42320g.C42321a;
import java.io.File;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.a */
public abstract class C42312a implements C42320g {

    /* renamed from: a */
    protected ExtractFramesModel f110075a = new ExtractFramesModel(mo103802f());

    /* renamed from: b */
    protected volatile boolean f110076b;

    /* renamed from: c */
    protected C42322h f110077c = new C42322h();

    /* renamed from: d */
    protected String f110078d = UUID.randomUUID().toString();

    /* renamed from: e */
    public final ExtractFramesModel mo103798e() {
        return this.f110075a;
    }

    /* renamed from: b */
    public static boolean m134573b() {
        if (C35563c.f93230L.mo93343b(Property.CloseUploadExtractFrames) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo103796c() {
        if (this.f110075a != null) {
            this.f110075a.removeLastSegment();
        }
    }

    /* renamed from: d */
    public final void mo103797d() {
        if (this.f110075a != null) {
            this.f110075a.removeStickerFace();
        }
    }

    /* renamed from: a */
    public void mo103790a() {
        this.f110076b = false;
        this.f110075a = new ExtractFramesModel(mo103802f());
        this.f110078d = UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public void mo103794a(boolean z) {
        this.f110076b = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo103789a(C1592h hVar) throws Exception {
        String str = (String) hVar.mo6890e();
        if (!TextUtils.isEmpty(str)) {
            this.f110075a.addStickFace(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo103791a(ExtractFramesModel extractFramesModel) {
        if (extractFramesModel != null) {
            this.f110075a = extractFramesModel;
            if (this.f110077c != null) {
                this.f110077c.f110088a = this.f110075a.extractFramesDir;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ String mo103795b(String str) throws Exception {
        if (!new File(str).exists()) {
            return null;
        }
        if (!this.f110077c.f110088a.contains(mo103802f())) {
            this.f110077c.mo103804a(mo103802f(), this.f110078d);
            this.f110075a.extractFramesDir = this.f110077c.f110088a;
        }
        String a = this.f110077c.mo88162a();
        C42341f.m134636a(C42341f.m134633a(str, C42319f.f110087a), new File(a), 70, CompressFormat.JPEG);
        return a;
    }

    /* renamed from: a */
    public void mo103792a(C42321a aVar) {
        if (!m134573b()) {
            aVar.mo96560a(false);
            return;
        }
        this.f110076b = true;
        this.f110077c.mo103804a(mo103802f(), this.f110078d);
        this.f110075a.extractFramesDir = this.f110077c.f110088a;
        this.f110075a.addFrameSegment(new ArrayList());
    }

    /* renamed from: a */
    public final void mo103793a(String str) {
        if (this.f110075a != null && !TextUtils.isEmpty(str)) {
            C1592h.m7853a((Callable<TResult>) new C42313b<TResult>(this, str)).mo6876a((C1591g<TResult, TContinuationResult>) new C42314c<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }
}
