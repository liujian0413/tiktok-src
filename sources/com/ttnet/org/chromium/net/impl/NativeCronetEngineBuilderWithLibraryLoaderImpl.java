package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.ttnet.org.chromium.net.CronetEngine.Builder;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.LibraryLoader;

public class NativeCronetEngineBuilderWithLibraryLoaderImpl extends NativeCronetEngineBuilderImpl {
    private LibraryLoader mLibraryLoader;

    /* access modifiers changed from: 0000 */
    public LibraryLoader libraryLoader() {
        return this.mLibraryLoader;
    }

    public NativeCronetEngineBuilderWithLibraryLoaderImpl(Context context) {
        super(context);
    }

    public CronetEngineBuilderImpl setLibraryLoader(Builder.LibraryLoader libraryLoader) {
        this.mLibraryLoader = new LibraryLoader(libraryLoader);
        return this;
    }
}
