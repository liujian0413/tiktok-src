package com.p280ss.android.ugc.asve.recorder;

import com.p280ss.android.vesdk.runtime.C45362d;
import java.io.File;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.k */
public final class C20778k extends C45362d {

    /* renamed from: a */
    private final C20733d f56076a;

    /* renamed from: b */
    public final String mo56151b() {
        String absolutePath = this.f56076a.mo38986c().getAbsolutePath();
        C7573i.m23582a((Object) absolutePath, "workspaceProvider.concat…entVideoPath.absolutePath");
        return absolutePath;
    }

    /* renamed from: c */
    public final String mo56153c() {
        String absolutePath = this.f56076a.mo38987d().getAbsolutePath();
        C7573i.m23582a((Object) absolutePath, "workspaceProvider.concat…entAudioPath.absolutePath");
        return absolutePath;
    }

    /* renamed from: a */
    public final String mo56149a() {
        String absolutePath = this.f56076a.mo38984b().getAbsolutePath();
        new File(absolutePath).mkdirs();
        C7573i.m23582a((Object) absolutePath, "path");
        return absolutePath;
    }

    public C20778k(C20733d dVar) {
        C7573i.m23587b(dVar, "workspaceProvider");
        super(dVar.mo38982a().getAbsolutePath());
        this.f56076a = dVar;
    }

    /* renamed from: b */
    public final String mo56152b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo56149a());
        sb.append(File.separator);
        sb.append(this.f56076a.mo38985b(i));
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo56150a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo56149a());
        sb.append(File.separator);
        sb.append(this.f56076a.mo38983a(i));
        return sb.toString();
    }
}
