package com.bytedance.android.livesdk.chatroom.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build.VERSION;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.p457i.C9477e;
import com.bytedance.common.utility.C6311g;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.p */
public final class C5358p {

    /* renamed from: a */
    public static final C5358p f15632a = new C5358p();

    /* renamed from: com.bytedance.android.livesdk.chatroom.utils.p$a */
    static final class C5359a<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ String f15633a;

        C5359a(String str) {
            this.f15633a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Bitmap apply(Integer num) {
            C7573i.m23587b(num, "it");
            try {
                C9477e eVar = (C9477e) ((INetworkService) C3596c.m13172a(INetworkService.class)).downloadFile(false, Integer.MAX_VALUE, this.f15633a, new ArrayList(), null).mo23512a();
                C7573i.m23582a((Object) eVar, "response");
                return BitmapFactory.decodeStream(new ByteArrayInputStream(eVar.f25947e));
            } catch (Exception e) {
                C3166a.m11955a(6, "NinePatchUtil", e.getStackTrace());
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.utils.p$b */
    static final class C5360b<T> implements C7326g<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ boolean f15634a;

        /* renamed from: b */
        final /* synthetic */ View f15635b;

        /* renamed from: c */
        final /* synthetic */ Runnable f15636c;

        C5360b(boolean z, View view, Runnable runnable) {
            this.f15634a = z;
            this.f15635b = view;
            this.f15636c = runnable;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Bitmap bitmap) {
            byte[] bArr;
            if (bitmap != null) {
                bArr = bitmap.getNinePatchChunk();
            } else {
                bArr = null;
            }
            Rect a = C5358p.m17089a(bArr);
            if (bitmap != null && bitmap.getNinePatchChunk() != null && a != null) {
                NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(C3358ac.m12513a(), bitmap, bitmap.getNinePatchChunk(), a, null);
                if (VERSION.SDK_INT >= 19) {
                    ninePatchDrawable.setAutoMirrored(this.f15634a);
                }
                this.f15635b.setBackground(ninePatchDrawable);
                if (!this.f15634a || !C3519c.m12965a(C3358ac.m12528e())) {
                    this.f15635b.setPadding(a.left, a.top, a.right, a.bottom);
                } else {
                    this.f15635b.setPadding(a.right, a.top, a.left, a.bottom);
                }
                Runnable runnable = this.f15636c;
                if (runnable != null) {
                    runnable.run();
                }
            } else if (bitmap != null) {
                C3166a.m11966e("NinePatchUtil", "downloaded bitmap is null.");
            } else {
                C3166a.m11966e("NinePatchUtil", "no ninepatch chunk found in bitmap.");
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.utils.p$c */
    static final class C5361c<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C5361c f15637a = new C5361c();

        C5361c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m17093a((Throwable) obj);
        }

        /* renamed from: a */
        private static void m17093a(Throwable th) {
            C7573i.m23582a((Object) th, "throwable");
            C3166a.m11955a(6, "NinePatchUtil", th.getStackTrace());
        }
    }

    private C5358p() {
    }

    /* renamed from: a */
    public static Rect m17089a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        if (order.get() == 0) {
            return null;
        }
        order.get();
        order.get();
        order.get();
        C7573i.m23582a((Object) order, "byteBuffer");
        order.getInt();
        order.getInt();
        Rect rect = new Rect();
        rect.left = order.getInt();
        rect.right = order.getInt();
        rect.top = order.getInt();
        rect.bottom = order.getInt();
        return rect;
    }

    /* renamed from: a */
    public static void m17090a(ImageModel imageModel, View view, boolean z, Runnable runnable) {
        String str;
        C7573i.m23587b(imageModel, "imageModel");
        C7573i.m23587b(view, "view");
        if (!C6311g.m19573a(imageModel.getUrls())) {
            List urls = imageModel.getUrls();
            if (urls != null) {
                str = (String) urls.get(0);
            } else {
                str = null;
            }
            C7492s.m23301b(Integer.valueOf(0)).mo19304b(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) new C5359a<Object,Object>(str)).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C5360b<Object>(z, view, runnable), (C7326g<? super Throwable>) C5361c.f15637a);
        }
    }
}
