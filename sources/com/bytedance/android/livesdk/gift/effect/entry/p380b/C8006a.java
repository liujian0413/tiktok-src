package com.bytedance.android.livesdk.gift.effect.entry.p380b;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p147c.C3166a;
import com.facebook.cache.common.C13265a;
import com.facebook.common.p685b.C13285i;
import com.facebook.datasource.C13345b;
import com.facebook.datasource.C13346c;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.p716c.C13577j;
import com.facebook.imagepipeline.p717d.C13622l;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.b.a */
public final class C8006a {

    /* renamed from: a */
    public static final C8007a f21730a = new C8007a(null);

    /* renamed from: com.bytedance.android.livesdk.gift.effect.entry.b.a$a */
    public static final class C8007a {
        private C8007a() {
        }

        public /* synthetic */ C8007a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m24542a(ImageModel imageModel) {
            Object obj;
            C7573i.m23587b(imageModel, "imageModel");
            List urls = imageModel.getUrls();
            C7573i.m23582a((Object) urls, "imageModel.urls");
            Iterator it = urls.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str = (String) obj;
                C7573i.m23582a((Object) str, "it");
                if (m24544a(str)) {
                    break;
                }
            }
            return (String) obj;
        }

        /* renamed from: a */
        private static boolean m24544a(String str) {
            C13265a c = C13577j.m39966a().mo33116c(ImageRequest.fromUri(str), null);
            C13622l a = C13622l.m40095a();
            C7573i.m23582a((Object) a, "ImagePipelineFactory.getInstance()");
            return a.mo33207c().mo32467d(c);
        }

        /* renamed from: a */
        public static void m24543a(ImageModel imageModel, C8009c cVar) {
            C7573i.m23587b(imageModel, "imageModel");
            C7573i.m23587b(cVar, "callback");
            new C8008b(imageModel, cVar).mo20920a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.effect.entry.b.a$b */
    public static final class C8008b extends C13345b<Void> {

        /* renamed from: a */
        public final ImageModel f21731a;

        /* renamed from: b */
        public final C8009c f21732b;

        /* renamed from: c */
        private final List<String> f21733c;

        /* renamed from: a */
        public final void mo20920a() {
            if (this.f21733c.isEmpty()) {
                StringBuilder sb = new StringBuilder("Failed to fetch resource ");
                sb.append(this.f21731a.getUri());
                C3166a.m11966e("LocalImageProvider", sb.toString());
                return;
            }
            String str = (String) this.f21733c.remove(0);
            StringBuilder sb2 = new StringBuilder("Trying alternative ");
            sb2.append(str);
            sb2.append(" of resource ");
            sb2.append(this.f21731a.getUri());
            C3166a.m11964c("LocalImageProvider", sb2.toString());
            C13380c.m39172c().mo33185d(ImageRequest.fromUri(str), null).mo32633a(this, C13285i.m38830b());
        }

        public final void onFailureImpl(C13346c<Void> cVar) {
            if (cVar == null || cVar.mo32642e() == null) {
                C3166a.m11965d("LocalImageProvider", "Alternative failed");
            } else {
                C3166a.m11957a("LocalImageProvider", "Alternative failed", cVar.mo32642e());
            }
            mo20920a();
        }

        public final void onNewResultImpl(C13346c<Void> cVar) {
            if (cVar == null) {
                C7573i.m23580a();
            }
            if (cVar.mo32639b()) {
                StringBuilder sb = new StringBuilder("Resource ");
                sb.append(this.f21731a.getUri());
                sb.append(" fetched from network");
                C3166a.m11964c("LocalImageProvider", sb.toString());
                this.f21732b.mo13752a(this.f21731a);
            }
        }

        public C8008b(ImageModel imageModel, C8009c cVar) {
            C7573i.m23587b(imageModel, "imageModel");
            C7573i.m23587b(cVar, "callback");
            this.f21731a = imageModel;
            this.f21732b = cVar;
            List urls = this.f21731a.getUrls();
            C7573i.m23582a((Object) urls, "imageModel.urls");
            this.f21733c = C7525m.m23509d((Collection<? extends T>) urls);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.effect.entry.b.a$c */
    public interface C8009c {
        /* renamed from: a */
        void mo13752a(ImageModel imageModel);
    }
}
