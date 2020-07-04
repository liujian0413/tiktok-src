package com.p280ss.android.ugc.aweme.shortvideo.cut;

import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.vesdk.ROTATE_DEGREE;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.e */
public final class C38749e {

    /* renamed from: a */
    public static final C38749e f100704a = new C38749e();

    private C38749e() {
    }

    /* renamed from: a */
    private static ROTATE_DEGREE m123750a(int i) {
        if (i == 90) {
            return ROTATE_DEGREE.ROTATE_90;
        }
        if (i == 180) {
            return ROTATE_DEGREE.ROTATE_180;
        }
        if (i != 270) {
            return ROTATE_DEGREE.ROTATE_NONE;
        }
        return ROTATE_DEGREE.ROTATE_270;
    }

    /* renamed from: a */
    public static C38748d m123749a(List<? extends VideoSegment> list, Workspace workspace, int i) {
        List<? extends VideoSegment> list2 = list;
        C7573i.m23587b(list2, "segments");
        C7573i.m23587b(workspace, "workspace");
        File c = workspace.mo96314c();
        C7573i.m23582a((Object) c, "workspace.concatVideoFile");
        String path = c.getPath();
        C7573i.m23582a((Object) path, "workspace.concatVideoFile.path");
        File d = workspace.mo96315d();
        C7573i.m23582a((Object) d, "workspace.concatAudioFile");
        C38748d dVar = new C38748d(list2, path, d.getPath(), -1, -1, i, false, null, null, null, 0, 0, 0, 8128, null);
        return dVar;
    }

    /* renamed from: a */
    public final C38748d mo96833a(List<? extends VideoSegment> list, Workspace workspace, int i, float f) {
        List<? extends VideoSegment> list2 = list;
        C7573i.m23587b(list2, "segments");
        C7573i.m23587b(workspace, "workspace");
        int i2 = ((VideoSegment) list2.get(0)).f100765g;
        int i3 = ((VideoSegment) list2.get(0)).f100766h;
        ROTATE_DEGREE a = m123750a((int) f);
        if (a == ROTATE_DEGREE.ROTATE_90 || a == ROTATE_DEGREE.ROTATE_270) {
            int i4 = i2;
            i2 = i3;
            i3 = i4;
        }
        int i5 = (i3 * 480) / i2;
        File n = workspace.mo96326n();
        C7573i.m23582a((Object) n, "workspace.newBackgroundVideoFile");
        String path = n.getPath();
        C7573i.m23582a((Object) path, "workspace.newBackgroundVideoFile.path");
        File o = workspace.mo96327o();
        C7573i.m23582a((Object) o, "workspace.newBackgroundAudioFile");
        C38748d dVar = new C38748d(list, path, o.getPath(), 480, i5, i, false, null, null, null, 0, 2, 0, 6080, null);
        return dVar;
    }
}
