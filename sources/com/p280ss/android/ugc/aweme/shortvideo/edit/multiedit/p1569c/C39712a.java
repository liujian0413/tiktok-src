package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1569c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.a */
public final class C39712a {

    /* renamed from: a */
    public Handler f103226a;

    /* renamed from: b */
    public C39715a f103227b;

    /* renamed from: c */
    private Handler f103228c;

    /* renamed from: d */
    private HandlerThread f103229d = new HandlerThread("multi_edit_cover_creator");

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.a$a */
    public interface C39715a {
        /* renamed from: a */
        void mo99079a(String str, Bitmap bitmap);
    }

    public C39712a() {
        this.f103229d.start();
        this.f103228c = new Handler(this.f103229d.getLooper()) {
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    String str = (String) message.obj;
                    if (C7276d.m22812b(str)) {
                        VEUtils.getVideoFrames(str, new int[]{0}, new C39716b(this, str));
                    }
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ boolean mo99096a(String str, ByteBuffer byteBuffer, int i, int i2, int i3) {
                Message message = new Message();
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                Bundle bundle = new Bundle();
                bundle.putParcelable("bitmap", createBitmap);
                bundle.putString("path", str);
                message.what = 2;
                message.setData(bundle);
                C39712a.this.f103226a.sendMessage(message);
                return false;
            }
        };
        this.f103226a = new Handler(Looper.myLooper()) {
            public final void handleMessage(Message message) {
                if (message.what == 2) {
                    Bitmap bitmap = (Bitmap) message.getData().getParcelable("bitmap");
                    String string = message.getData().getString("path");
                    if (C39712a.this.f103227b != null) {
                        C39712a.this.f103227b.mo99079a(string, bitmap);
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo99095a(String str, C39715a aVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f103227b = aVar;
            Message message = new Message();
            message.what = 1;
            message.obj = str;
            this.f103228c.sendMessage(message);
        }
    }
}
