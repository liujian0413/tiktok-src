package com.p280ss.android.ugc.aweme.storage.exception;

import java.io.File;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.exception.IllegalPathException */
public final class IllegalPathException extends IllegalStateException {
    public static final C41944a Companion = new C41944a(null);

    /* renamed from: com.ss.android.ugc.aweme.storage.exception.IllegalPathException$a */
    public static final class C41944a {
        private C41944a() {
        }

        public /* synthetic */ C41944a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m133396a(File file) {
            StringBuilder sb = new StringBuilder("该 file 使用的路径不符合「工具线磁盘使用规范」, filePath = ");
            sb.append(file.getPath());
            sb.append(", exist = ");
            sb.append(file.exists());
            sb.append("。如果是新增的路径，需要使用规范的路径，如果是历史逻辑的路径，可能需要加白名单。出现这个错误请先咨询 @wangyong.1996");
            return sb.toString();
        }
    }

    public IllegalPathException(File file) {
        C7573i.m23587b(file, "file");
        super(C41944a.m133396a(file));
    }
}
