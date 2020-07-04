package com.bytedance.ies.bullet.core.kit;

import android.net.Uri;
import com.bytedance.ies.bullet.core.C10336c;
import com.bytedance.ies.bullet.core.kit.bridge.C10375f;
import com.bytedance.ies.bullet.core.kit.bridge.C10377h;
import com.bytedance.ies.bullet.core.model.pipeline.C10410d;
import java.util.List;

/* renamed from: com.bytedance.ies.bullet.core.kit.g */
public interface C10382g extends C10410d<Uri> {
    /* renamed from: a */
    C10400u mo25158a();

    /* renamed from: a */
    void mo25159a(List<String> list, C10336c cVar);

    /* renamed from: b */
    List<String> mo25160b();

    /* renamed from: c */
    C10375f mo25161c();

    /* renamed from: d */
    BulletKitType mo25162d();

    /* renamed from: e */
    void mo25163e();

    /* renamed from: f */
    void mo25164f();

    void onEvent(C10377h hVar);
}
