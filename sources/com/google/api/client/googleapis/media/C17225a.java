package com.google.api.client.googleapis.media;

import com.google.api.client.http.C17264m;
import com.google.api.client.http.C17266o;
import com.google.api.client.http.C17269r;
import com.google.api.client.http.C17273v;
import com.google.api.client.util.C17384w;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.googleapis.media.a */
class C17225a implements C17264m, C17273v {

    /* renamed from: a */
    static final Logger f48002a = Logger.getLogger(C17225a.class.getName());

    /* renamed from: b */
    private final MediaHttpUploader f48003b;

    /* renamed from: c */
    private final C17264m f48004c;

    /* renamed from: d */
    private final C17273v f48005d;

    public C17225a(MediaHttpUploader mediaHttpUploader, C17266o oVar) {
        this.f48003b = (MediaHttpUploader) C17384w.m57847a(mediaHttpUploader);
        this.f48004c = oVar.f48110o;
        this.f48005d = oVar.f48109n;
        oVar.mo44646a((C17264m) this);
        oVar.mo44648a((C17273v) this);
    }

    /* renamed from: a */
    public final boolean mo44526a(C17266o oVar, boolean z) throws IOException {
        boolean z2;
        if (this.f48004c == null || !this.f48004c.mo44526a(oVar, z)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            try {
                this.f48003b.mo44525a();
            } catch (IOException e) {
                f48002a.log(Level.WARNING, "exception thrown while calling server callback", e);
            }
        }
        return z2;
    }

    /* renamed from: a */
    public final boolean mo44486a(C17266o oVar, C17269r rVar, boolean z) throws IOException {
        boolean z2;
        if (this.f48005d == null || !this.f48005d.mo44486a(oVar, rVar, z)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && z && rVar.f48126e / 100 == 5) {
            try {
                this.f48003b.mo44525a();
            } catch (IOException e) {
                f48002a.log(Level.WARNING, "exception thrown while calling server callback", e);
            }
        }
        return z2;
    }
}
