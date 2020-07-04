package com.ttnet.org.chromium.base.process_launcher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.List;

public interface ChildProcessServiceDelegate {
    SparseArray<String> getFileDescriptorsIdsToKeys();

    boolean loadNativeLibrary(Context context);

    void onBeforeMain();

    void onConnectionSetup(Bundle bundle, List<IBinder> list);

    void onServiceBound(Intent intent);

    void onServiceCreated();

    void preloadNativeLibrary(Context context);

    void runMain();
}
