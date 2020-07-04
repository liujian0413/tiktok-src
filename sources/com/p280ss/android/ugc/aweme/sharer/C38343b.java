package com.p280ss.android.ugc.aweme.sharer;

import android.content.Context;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.b */
public interface C38343b {

    /* renamed from: com.ss.android.ugc.aweme.sharer.b$a */
    public static final class C38344a {
        /* renamed from: a */
        public static boolean m122505a(C38343b bVar, Context context) {
            C7573i.m23587b(context, "context");
            return true;
        }

        /* renamed from: a */
        public static int m122503a(C38343b bVar) {
            return bVar.mo95736a();
        }

        /* renamed from: a */
        public static void m122504a(C38343b bVar, RemoteImageView remoteImageView, boolean z) {
            int i;
            C7573i.m23587b(remoteImageView, "imageView");
            if (z) {
                i = bVar.mo95742e();
            } else {
                i = bVar.mo95736a();
            }
            remoteImageView.setImageResource(i);
        }
    }

    /* renamed from: a */
    int mo95736a();

    /* renamed from: a */
    void mo95741a(RemoteImageView remoteImageView, boolean z);

    /* renamed from: a */
    boolean mo95743a(Context context);

    /* renamed from: a */
    boolean mo95737a(Context context, C38354f fVar);

    /* renamed from: a */
    boolean mo71406a(C38354f fVar, Context context);

    /* renamed from: a */
    boolean mo95738a(C38356g gVar, Context context);

    /* renamed from: a */
    boolean mo95744a(C38357h hVar, Context context);

    /* renamed from: a */
    boolean mo95745a(C38358i iVar, Context context);

    /* renamed from: a */
    boolean mo95746a(C38359j jVar, Context context);

    /* renamed from: b */
    String mo95739b();

    /* renamed from: c */
    String mo95740c();

    /* renamed from: e */
    int mo95742e();

    /* renamed from: f */
    float mo95747f();

    /* renamed from: g */
    boolean mo95748g();
}
