package com.p280ss.android.ugc.effectmanager.model;

import android.net.Uri;
import com.p280ss.android.ugc.effectmanager.common.C43723d;
import java.io.File;

/* renamed from: com.ss.android.ugc.effectmanager.model.LocalModelInfo */
public class LocalModelInfo {
    private final Uri mUri;

    public Uri getUri() {
        return this.mUri;
    }

    public String getVersion() {
        return getVersionOfModel(this.mUri.getPath());
    }

    public String getName() {
        return C43723d.m138564a(new File(this.mUri.getPath()).getName());
    }

    private LocalModelInfo(Uri uri) {
        this.mUri = uri;
    }

    public static LocalModelInfo fromFile(String str) {
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        return new LocalModelInfo(Uri.parse(sb.toString()));
    }

    private static String getVersionOfModel(String str) {
        str.lastIndexOf("/");
        int lastIndexOf = str.lastIndexOf("_v");
        int lastIndexOf2 = str.lastIndexOf("_model");
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 2, lastIndexOf2).replace('_', '.');
        }
        return "v1.0";
    }
}
