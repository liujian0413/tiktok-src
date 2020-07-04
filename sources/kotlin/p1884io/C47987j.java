package kotlin.p1884io;

import java.io.File;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.io.j */
class C47987j extends C47986i {
    /* renamed from: c */
    public static final C47976e m148938c(File file) {
        C7573i.m23587b(file, "$this$walkBottomUp");
        return C47984g.m148937a(file, FileWalkDirection.BOTTOM_UP);
    }

    /* renamed from: a */
    public static final C47976e m148937a(File file, FileWalkDirection fileWalkDirection) {
        C7573i.m23587b(file, "$this$walk");
        C7573i.m23587b(fileWalkDirection, "direction");
        return new C47976e(file, fileWalkDirection);
    }
}
