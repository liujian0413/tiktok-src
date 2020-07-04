package com.facebook.react.modules.clipboard;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build.VERSION;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "Clipboard")
public class ClipboardModule extends ContextBaseJavaModule {
    public String getName() {
        return "Clipboard";
    }

    private ClipboardManager getClipboardService() {
        Context context = getContext();
        getContext();
        return (ClipboardManager) context.getSystemService("clipboard");
    }

    public ClipboardModule(Context context) {
        super(context);
    }

    @ReactMethod
    public void setString(String str) {
        if (VERSION.SDK_INT >= 11) {
            getClipboardService().setPrimaryClip(ClipData.newPlainText(null, str));
            return;
        }
        getClipboardService().setText(str);
    }

    @ReactMethod
    public void getString(Promise promise) {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipData primaryClip = clipboardService.getPrimaryClip();
            if (primaryClip == null) {
                promise.resolve("");
            } else if (primaryClip.getItemCount() > 0) {
                Item itemAt = clipboardService.getPrimaryClip().getItemAt(0);
                StringBuilder sb = new StringBuilder();
                sb.append(itemAt.getText());
                promise.resolve(sb.toString());
            } else {
                promise.resolve("");
            }
        } catch (Exception e) {
            promise.reject((Throwable) e);
        }
    }
}
