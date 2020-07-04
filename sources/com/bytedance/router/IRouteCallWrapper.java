package com.bytedance.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public interface IRouteCallWrapper {
    boolean call(Context context, Uri uri, Intent intent, boolean z);
}
