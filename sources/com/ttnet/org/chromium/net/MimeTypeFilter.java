package com.ttnet.org.chromium.net;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FileFilter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class MimeTypeFilter implements FileFilter {
    private boolean mAcceptAllMimeTypes;
    private boolean mAcceptDirectory;
    private HashSet<String> mExtensions = new HashSet<>();
    private HashSet<String> mMimeSupertypes = new HashSet<>();
    private MimeTypeMap mMimeTypeMap;
    private HashSet<String> mMimeTypes = new HashSet<>();

    private static String getMimeSupertype(String str) {
        return str.split("/", 2)[0];
    }

    private String getMimeTypeFromExtension(String str) {
        String mimeTypeFromExtension = this.mMimeTypeMap.getMimeTypeFromExtension(str);
        if (mimeTypeFromExtension != null) {
            return mimeTypeFromExtension.toLowerCase(Locale.US);
        }
        return null;
    }

    public boolean accept(File file) {
        if (file.isDirectory()) {
            return this.mAcceptDirectory;
        }
        return accept(Uri.fromFile(file), null);
    }

    public boolean accept(Uri uri, String str) {
        if (uri != null) {
            String lowerCase = MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase(Locale.US);
            if (this.mExtensions.contains(lowerCase)) {
                return true;
            }
            if (str == null) {
                str = getMimeTypeFromExtension(lowerCase);
            }
        }
        if (str == null || (!this.mAcceptAllMimeTypes && !this.mMimeTypes.contains(str) && !this.mMimeSupertypes.contains(getMimeSupertype(str)))) {
            return false;
        }
        return true;
    }

    public MimeTypeFilter(List<String> list, boolean z) {
        for (String trim : list) {
            String lowerCase = trim.trim().toLowerCase(Locale.US);
            if (lowerCase.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
                this.mExtensions.add(lowerCase.substring(1));
            } else if (lowerCase.equals("*/*")) {
                this.mAcceptAllMimeTypes = true;
            } else if (lowerCase.endsWith("/*")) {
                this.mMimeSupertypes.add(lowerCase.substring(0, lowerCase.length() - 2));
            } else if (lowerCase.contains("/")) {
                this.mMimeTypes.add(lowerCase);
            }
        }
        this.mMimeTypeMap = MimeTypeMap.getSingleton();
        this.mAcceptDirectory = z;
    }
}
