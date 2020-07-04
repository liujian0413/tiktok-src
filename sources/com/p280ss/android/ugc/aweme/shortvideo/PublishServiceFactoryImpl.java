package com.p280ss.android.ugc.aweme.shortvideo;

import android.os.Bundle;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.photo.C34760l;
import com.p280ss.android.ugc.aweme.photo.publish.C34788e;
import com.p280ss.android.ugc.aweme.photomovie.C34926j;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoPublishService.Factory;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.PublishServiceFactoryImpl */
public class PublishServiceFactoryImpl implements Factory {
    public C40023l<? extends C38455ap> buildCallback(int i, Object obj) {
        if (i == 0 || i == 6) {
            return new C39861fc(i, obj);
        }
        return null;
    }

    public Object buildArgs(int i, Bundle bundle) {
        if (i == 0) {
            return bundle.getSerializable("args");
        }
        if (i == 5) {
            return bundle.getSerializable("args");
        }
        if (i == 6) {
            return bundle.getParcelable("args");
        }
        if (C34788e.m112192d(i)) {
            return bundle.getSerializable("args");
        }
        StringBuilder sb = new StringBuilder("video publish not surpported ");
        sb.append(i);
        C6921a.m21555a(sb.toString());
        return null;
    }

    public C39825f buildFutureFactory(int i, int i2, Bundle bundle) {
        if (i == 0) {
            if (i2 != 1) {
                return new C39821ey(new TTUploaderService(0), i, i2);
            }
            C38438af afVar = new C38438af(new TTUploaderService(0), bundle.getString("shoot_way"), bundle.getBoolean("synthetise_only"), i, i2);
            return afVar;
        } else if (i == 5) {
            return new C34760l(new TTUploaderService(0), i, i2);
        } else {
            if (i == 6) {
                return new C34926j(new TTUploaderService(0), i, i2);
            }
            StringBuilder sb = new StringBuilder("videoType == ");
            sb.append(i);
            throw new AssertionError(sb.toString());
        }
    }
}
