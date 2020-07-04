package dmt.p1861av.video.p1863b;

import com.p280ss.android.ugc.asve.recorder.C20733d;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import java.io.File;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.b.a */
public final class C47442a implements C20733d {

    /* renamed from: a */
    private final File f121807a;

    /* renamed from: b */
    private final File f121808b;

    /* renamed from: c */
    private final File f121809c;

    /* renamed from: d */
    private final File f121810d;

    /* renamed from: e */
    private final File f121811e = new File(mo38982a(), "photo");

    /* renamed from: a */
    public final File mo38982a() {
        return this.f121807a;
    }

    /* renamed from: b */
    public final File mo38984b() {
        return this.f121808b;
    }

    /* renamed from: c */
    public final File mo38986c() {
        return this.f121809c;
    }

    /* renamed from: d */
    public final File mo38987d() {
        return this.f121810d;
    }

    /* renamed from: e */
    public final File mo38988e() {
        return this.f121811e;
    }

    /* renamed from: a */
    public final String mo38983a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(File.separator);
        sb.append(i);
        sb.append(".mp4");
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo38985b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(File.separator);
        sb.append(i);
        sb.append(".wav");
        return sb.toString();
    }

    public C47442a(Workspace workspace) {
        C7573i.m23587b(workspace, "workspaceIMP");
        File g = workspace.mo96319g();
        g.mkdirs();
        this.f121807a = g;
        this.f121808b = workspace.mo96319g();
        this.f121809c = workspace.mo96314c();
        this.f121810d = workspace.mo96315d();
    }
}
