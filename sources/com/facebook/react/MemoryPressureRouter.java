package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class MemoryPressureRouter implements ComponentCallbacks2 {
    private final Set<MemoryPressureListener> mListeners = Collections.synchronizedSet(new LinkedHashSet());

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        dispatchMemoryPressure(i);
    }

    public void addMemoryPressureListener(MemoryPressureListener memoryPressureListener) {
        this.mListeners.add(memoryPressureListener);
    }

    public void destroy(Context context) {
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    public void removeMemoryPressureListener(MemoryPressureListener memoryPressureListener) {
        this.mListeners.remove(memoryPressureListener);
    }

    MemoryPressureRouter(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    private void dispatchMemoryPressure(int i) {
        for (MemoryPressureListener handleMemoryPressure : (MemoryPressureListener[]) this.mListeners.toArray(new MemoryPressureListener[this.mListeners.size()])) {
            handleMemoryPressure.handleMemoryPressure(i);
        }
    }
}
