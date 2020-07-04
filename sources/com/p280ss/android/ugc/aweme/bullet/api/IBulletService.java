package com.p280ss.android.ugc.aweme.bullet.api;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.bullet.base.C10316c;
import com.bytedance.ies.bullet.base.C10317d;
import com.bytedance.ies.bullet.core.C10331b.C10333b;
import com.bytedance.ies.bullet.core.monitor.C10425c;
import com.bytedance.ies.bullet.core.p539b.C10334a;

/* renamed from: com.ss.android.ugc.aweme.bullet.api.IBulletService */
public interface IBulletService {
    Activity getActivityById(String str);

    C10333b getBulletCoreProvider();

    void open(Context context, Class<?> cls, String str, String str2, Bundle bundle);

    void registerDefaultPackageBundle(C10317d dVar);

    void registerGlobalSettingsBundle(C10316c cVar);

    void registerPackageBundle(String str, C10317d dVar);

    void setApplication(Application application);

    void setReporter(C10425c cVar);

    void setResourceLoader(C10334a aVar);
}
