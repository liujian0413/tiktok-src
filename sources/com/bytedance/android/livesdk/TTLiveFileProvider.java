package com.bytedance.android.livesdk;

import android.content.Context;
import android.net.Uri;
import android.support.p022v4.content.FileProvider;
import java.io.File;

public class TTLiveFileProvider extends FileProvider {
    public static final String NAME = ".ttlive_provider";

    public static Uri getUri(Context context, String str, File file) {
        return getUriForFile(context, str, file);
    }
}
