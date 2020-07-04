package com.bytedance.polaris.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.p029v7.app.AppCompatActivity;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C6312h;
import com.bytedance.polaris.depend.C12428i;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedList;

public class AbsPolarisActivity extends AppCompatActivity implements C12375a {

    /* renamed from: a */
    static final LinkedList<Activity> f32809a = new LinkedList<>();

    /* renamed from: d */
    private static int f32810d = R.anim.bi;

    /* renamed from: e */
    private static int f32811e = R.anim.bj;

    /* renamed from: f */
    private static int f32812f = R.anim.bk;

    /* renamed from: g */
    private static int f32813g = R.anim.bl;

    /* renamed from: h */
    private static int f32814h = R.anim.bm;

    /* renamed from: i */
    private static int f32815i = 0;

    /* renamed from: b */
    protected boolean f32816b;

    /* renamed from: c */
    public int f32817c = PreloadTask.BYTE_UNIT_NUMBER;

    /* renamed from: j */
    private boolean f32818j;

    /* renamed from: k */
    private long f32819k;

    /* renamed from: l */
    private boolean f32820l;

    /* renamed from: m */
    private Handler f32821m = new Handler(new Callback() {
        public final boolean handleMessage(Message message) {
            String str;
            if (message.what != 1024) {
                return false;
            }
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                StringBuilder sb = new StringBuilder("Start Activity Really: ");
                if (intent.getComponent() == null) {
                    str = "";
                } else {
                    str = intent.getComponent().getShortClassName();
                }
                sb.append(str);
                AbsPolarisActivity.this.startActivity(intent);
            }
            return true;
        }
    });

    /* renamed from: p_ */
    public final boolean mo30201p_() {
        return this.f32820l;
    }

    /* renamed from: b */
    private static boolean mo30204b() {
        if (f32815i == 0) {
            return true;
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.f32820l = false;
        C12428i.m36159i();
    }

    public void onStart() {
        super.onStart();
        f32815i++;
    }

    public void finish() {
        int i;
        super.finish();
        if (this.f32817c == 1024) {
            i = f32811e;
        } else {
            i = f32813g;
        }
        overridePendingTransition(f32814h, i);
    }

    public boolean isDestroyed() {
        if (VERSION.SDK_INT < 17) {
            return this.f32816b;
        }
        try {
            return super.isDestroyed();
        } catch (Throwable unused) {
            return this.f32816b;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f32816b = true;
        synchronized (this) {
            f32809a.remove(this);
        }
    }

    public void onResume() {
        super.onResume();
        this.f32820l = true;
        C12428i.m36159i();
        if (this.f32818j) {
            this.f32818j = true ^ this.f32818j;
        }
    }

    public void onStop() {
        super.onStop();
        this.f32820l = false;
        f32815i--;
        this.f32818j = mo30204b();
    }

    public void onBackPressed() {
        if (!isFinishing()) {
            Intent intent = null;
            try {
                if (isTaskRoot()) {
                    intent = C6776h.m20941a((Context) this, getPackageName());
                }
                super.onBackPressed();
                if (intent != null) {
                    startActivity(intent);
                }
            } catch (IllegalStateException unused) {
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f32817c == 1024) {
            i = f32810d;
        } else {
            i = f32812f;
        }
        overridePendingTransition(i, f32814h);
        this.f32819k = System.currentTimeMillis();
        synchronized (this) {
            f32809a.remove(this);
            f32809a.add(this);
        }
    }

    public void startActivity(Intent intent) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f32819k < 300) {
            Message message = new Message();
            message.what = PreloadTask.BYTE_UNIT_NUMBER;
            message.obj = intent;
            long j = 300 - (currentTimeMillis - this.f32819k);
            StringBuilder sb = new StringBuilder("Start Activity Delay: ");
            sb.append(j);
            sb.append(", ");
            if (intent.getComponent() == null) {
                str = "";
            } else {
                str = intent.getComponent().getShortClassName();
            }
            sb.append(str);
            this.f32821m.sendMessageDelayed(message, j);
            return;
        }
        super.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        try {
            super.startActivityForResult(intent, i);
        } catch (Exception e) {
            C6312h.m19577a((Throwable) e);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (((i >> 8) & NormalGiftView.ALPHA_255) == 0) {
            C12428i.m36159i();
        }
    }
}
