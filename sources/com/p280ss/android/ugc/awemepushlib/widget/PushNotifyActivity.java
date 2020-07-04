package com.p280ss.android.ugc.awemepushlib.widget;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.awemepushlib.model.PushMsg;
import com.p280ss.android.ugc.awemepushlib.widget.C43641a.C43647a;

/* renamed from: com.ss.android.ugc.awemepushlib.widget.PushNotifyActivity */
public class PushNotifyActivity extends Activity implements C43647a {

    /* renamed from: a */
    private FrameLayout f112936a;

    /* renamed from: a */
    public final void mo105579a() {
        this.f112936a.removeAllViews();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            finish();
            return true;
        } catch (Throwable unused) {
            finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.addFlags(32);
        window.addFlags(262144);
        LayoutParams attributes = window.getAttributes();
        attributes.gravity |= 48;
        window.setAttributes(attributes);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        int intExtra = intent.getIntExtra("message_from", -1);
        PushMsg pushMsg = (PushMsg) intent.getSerializableExtra("message_obj");
        if (pushMsg == null) {
            finish();
            return;
        }
        Intent intent2 = (Intent) intent.getParcelableExtra("__targetIntent__");
        if (intent2 == null) {
            finish();
            return;
        }
        C43641a aVar = new C43641a(this, intExtra, pushMsg, (Bitmap) intent.getParcelableExtra("__bitmap__"), intent2, intent.getLongExtra("__showTime__", 6000), false, 11);
        aVar.setDismissListener(this);
        this.f112936a = new FrameLayout(this);
        this.f112936a.addView(aVar, new FrameLayout.LayoutParams(-1, -2));
        setContentView(this.f112936a, new ViewGroup.LayoutParams(-1, -1));
    }
}
