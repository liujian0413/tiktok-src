package com.ttnet.org.chromium.base.library_loader;

import android.content.pm.ApplicationInfo;

public abstract class NativeLibraryPreloader {
    public abstract int loadLibrary(ApplicationInfo applicationInfo);
}
