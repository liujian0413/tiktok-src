package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevSupportManager;

public class DevSupportManagerFactory {
    public static DevSupportManager create(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper, String str, boolean z, int i) {
        return create(context, reactInstanceManagerDevHelper, str, z, null, null, i);
    }

    public static DevSupportManager create(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper, String str, boolean z, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i) {
        if (!z) {
            return new DisabledDevSupportManager();
        }
        try {
            StringBuilder sb = new StringBuilder("com.facebook.react.devsupport.");
            sb.append("DevSupportManagerImpl");
            return (DevSupportManager) Class.forName(sb.toString()).getConstructor(new Class[]{Context.class, ReactInstanceManagerDevHelper.class, String.class, Boolean.TYPE, RedBoxHandler.class, DevBundleDownloadListener.class, Integer.TYPE}).newInstance(new Object[]{context, reactInstanceManagerDevHelper, str, Boolean.valueOf(true), redBoxHandler, devBundleDownloadListener, Integer.valueOf(i)});
        } catch (Exception e) {
            throw new RuntimeException("Requested enabled DevSupportManager, but DevSupportManagerImpl class was not found or could not be created", e);
        }
    }
}
