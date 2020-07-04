package kotlin.p1884io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.io.FileSystemException */
public class FileSystemException extends IOException {
    private final File file;
    private final File other;
    private final String reason;

    public final File getFile() {
        return this.file;
    }

    public final File getOther() {
        return this.other;
    }

    public final String getReason() {
        return this.reason;
    }

    public FileSystemException(File file2, File file3, String str) {
        C7573i.m23587b(file2, "file");
        super(C47974c.m148918a(file2, file3, str));
        this.file = file2;
        this.other = file3;
        this.reason = str;
    }

    public /* synthetic */ FileSystemException(File file2, File file3, String str, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            file3 = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        this(file2, file3, str);
    }
}
