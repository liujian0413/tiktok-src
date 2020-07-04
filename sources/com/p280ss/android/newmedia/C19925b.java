package com.p280ss.android.newmedia;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.util.C6776h;
import java.io.File;

/* renamed from: com.ss.android.newmedia.b */
public final class C19925b extends ContextWrapper {
    public final File getCacheDir() {
        return super.getCacheDir();
    }

    public C19925b(Context context) {
        super(context);
    }

    public final File getDir(String str, int i) {
        String c = C6776h.m20949c(this);
        if (!C6319n.m19593a(c) && !C6319n.m19593a(str) && c.endsWith(":ad")) {
            StringBuilder sb = new StringBuilder("ad_");
            sb.append(str);
            str = sb.toString();
        }
        return super.getDir(str, i);
    }

    public final SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory) {
        String c = C6776h.m20949c(this);
        if (!C6319n.m19593a(c) && !C6319n.m19593a(str) && c.endsWith(":ad")) {
            StringBuilder sb = new StringBuilder("ad_");
            sb.append(str);
            str = sb.toString();
        }
        return super.openOrCreateDatabase(str, i, cursorFactory);
    }
}
