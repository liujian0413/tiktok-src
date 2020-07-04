package com.google.common.p784io;

import com.google.common.base.C17439m;
import com.google.common.collect.C17994ds;
import com.google.common.collect.ImmutableSet;
import com.google.common.graph.C18069a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.common.io.f */
public final class C18110f {

    /* renamed from: a */
    private static final C17994ds<File> f49459a = new C17994ds<File>() {
        public final String toString() {
            return "Files.fileTreeTraverser()";
        }
    };

    /* renamed from: b */
    private static final C18069a<File> f49460b = new C18069a<File>() {
    };

    /* renamed from: com.google.common.io.f$1 */
    static class C181111 {
    }

    /* renamed from: com.google.common.io.f$a */
    static final class C18114a extends C18101a {

        /* renamed from: a */
        private final File f49461a;

        /* renamed from: b */
        private final ImmutableSet<FileWriteMode> f49462b;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public FileOutputStream mo46723a() throws IOException {
            return new FileOutputStream(this.f49461a, this.f49462b.contains(FileWriteMode.APPEND));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Files.asByteSink(");
            sb.append(this.f49461a);
            sb.append(", ");
            sb.append(this.f49462b);
            sb.append(")");
            return sb.toString();
        }

        private C18114a(File file, FileWriteMode... fileWriteModeArr) {
            this.f49461a = (File) C17439m.m57962a(file);
            this.f49462b = ImmutableSet.copyOf((E[]) fileWriteModeArr);
        }

        /* synthetic */ C18114a(File file, FileWriteMode[] fileWriteModeArr, C181111 r3) {
            this(file, fileWriteModeArr);
        }
    }

    /* renamed from: com.google.common.io.f$b */
    static final class C18115b extends C18102b {

        /* renamed from: a */
        private final File f49463a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public FileInputStream mo46725a() throws IOException {
            return new FileInputStream(this.f49463a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Files.asByteSource(");
            sb.append(this.f49463a);
            sb.append(")");
            return sb.toString();
        }

        private C18115b(File file) {
            this.f49463a = (File) C17439m.m57962a(file);
        }

        /* synthetic */ C18115b(File file, C181111 r2) {
            this(file);
        }
    }

    /* renamed from: b */
    private static C18102b m59870b(File file) {
        return new C18115b(file, null);
    }

    /* renamed from: a */
    public static void m59868a(File file) throws IOException {
        C17439m.m57962a(file);
        if (!file.createNewFile() && !file.setLastModified(System.currentTimeMillis())) {
            StringBuilder sb = new StringBuilder("Unable to update modification time of ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: a */
    private static C18101a m59867a(File file, FileWriteMode... fileWriteModeArr) {
        return new C18114a(file, fileWriteModeArr, null);
    }

    /* renamed from: a */
    public static void m59869a(File file, File file2) throws IOException {
        C17439m.m57977a(!file.equals(file2), "Source %s and destination %s must be different", (Object) file, (Object) file2);
        m59870b(file).mo46724a(m59867a(file2, new FileWriteMode[0]));
    }
}
