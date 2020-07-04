package com.facebook.fbui.textlayoutbuilder.p699a;

import android.graphics.Picture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import com.facebook.fbui.textlayoutbuilder.C13451a;
import com.facebook.fbui.textlayoutbuilder.p701c.C13459a;

/* renamed from: com.facebook.fbui.textlayoutbuilder.a.a */
public final class C13452a implements C13451a {

    /* renamed from: a */
    private static C13453a f35668a;

    /* renamed from: com.facebook.fbui.textlayoutbuilder.a.a$a */
    static class C13453a extends Handler {

        /* renamed from: a */
        private final Picture f35669a = new Picture();

        public C13453a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Layout layout = (Layout) message.obj;
            try {
                layout.draw(this.f35669a.beginRecording(C13459a.m39554a(layout), C13459a.m39555b(layout)));
                this.f35669a.endRecording();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static C13453a m39527a() {
        if (f35668a == null) {
            HandlerThread handlerThread = new HandlerThread("GlyphWarmer");
            handlerThread.start();
            f35668a = new C13453a(handlerThread.getLooper());
        }
        return f35668a;
    }

    /* renamed from: a */
    public final void mo32964a(Layout layout) {
        C13453a a = m39527a();
        a.sendMessage(a.obtainMessage(1, layout));
    }
}
