package com.p280ss.android.ugc.aweme.update;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.sdk.activity.SSActivity;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.update.UpdateActivity */
public class UpdateActivity extends SSActivity implements C6310a {

    /* renamed from: a */
    UpdateHelper f111099a;

    /* renamed from: b */
    Handler f111100b;

    /* renamed from: c */
    C42771a f111101c;

    /* renamed from: d */
    String f111102d;

    /* renamed from: e */
    Button f111103e;

    /* renamed from: f */
    Button f111104f;

    /* renamed from: g */
    Button f111105g;

    /* renamed from: h */
    Button f111106h;

    /* renamed from: i */
    Button f111107i;

    /* renamed from: j */
    TextView f111108j;

    /* renamed from: m */
    View f111109m;

    /* renamed from: n */
    ProgressBar f111110n;

    /* renamed from: o */
    TextView f111111o;

    /* renamed from: p */
    View f111112p;

    /* renamed from: q */
    View f111113q;

    /* renamed from: r */
    TextView f111114r;

    /* renamed from: s */
    String f111115s = "";

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateActivity$a */
    class C42771a extends Thread {

        /* renamed from: a */
        C42781a f111121a = new C42781a();

        /* renamed from: b */
        volatile boolean f111122b = false;

        /* renamed from: a */
        public final synchronized void mo104382a() {
            this.f111122b = true;
        }

        public final void run() {
            while (true) {
                try {
                    Thread.sleep(1500);
                } catch (Exception unused) {
                }
                if (!UpdateActivity.this.f111099a.mo104397h()) {
                    break;
                }
                UpdateActivity.this.f111099a.mo104389a(this.f111121a);
                Message obtainMessage = UpdateActivity.this.f111100b.obtainMessage(1);
                obtainMessage.obj = this.f111121a;
                synchronized (this) {
                    if (!this.f111122b) {
                        UpdateActivity.this.f111100b.sendMessage(obtainMessage);
                    }
                }
            }
            if (!this.f111122b) {
                UpdateActivity.this.f111100b.sendEmptyMessage(2);
            }
        }

        C42771a() {
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f111101c != null) {
            this.f111101c.mo104382a();
        }
    }

    /* renamed from: c */
    private void m135721c() {
        this.f111105g.setVisibility(8);
        this.f111106h.setVisibility(8);
        this.f111107i.setVisibility(8);
        this.f111104f.setVisibility(8);
        this.f111103e.setVisibility(8);
    }

    /* renamed from: d */
    private void m135722d() {
        String a = UpdateHelper.m135747a(this.f111099a.mo104396g());
        if (a == null) {
            a = "";
        }
        this.f111114r.setText(a);
    }

    /* renamed from: b */
    private void m135720b() {
        if (this.f111099a.mo104397h()) {
            if (this.f111101c != null) {
                this.f111101c.mo104382a();
            }
            this.f111101c = new C42771a();
            this.f111101c.start();
            m135726h();
        } else if (!this.f111099a.mo104398i()) {
            m135724f();
        } else if (this.f111099a.mo104406q() != null) {
            m135725g();
        } else {
            m135723e();
        }
    }

    /* renamed from: f */
    private void m135724f() {
        String string = getString(R.string.dzj);
        this.f111108j.setText(C1642a.m8034a(string, new Object[]{this.f111102d}));
        this.f111112p.setVisibility(8);
        this.f111109m.setVisibility(8);
        this.f111113q.setVisibility(4);
        m135721c();
        this.f111103e.setVisibility(0);
    }

    /* renamed from: e */
    private void m135723e() {
        String f = this.f111099a.mo104395f();
        if (f == null) {
            f = "";
        }
        String string = getString(R.string.dzf);
        this.f111108j.setText(C1642a.m8034a(string, new Object[]{this.f111102d, f}));
        this.f111112p.setVisibility(0);
        this.f111109m.setVisibility(8);
        this.f111113q.setVisibility(0);
        m135722d();
        m135721c();
        this.f111105g.setVisibility(0);
        this.f111104f.setVisibility(0);
    }

    /* renamed from: g */
    private void m135725g() {
        String f = this.f111099a.mo104395f();
        String string = getString(R.string.dzk);
        this.f111108j.setText(C1642a.m8034a(string, new Object[]{this.f111102d, f}));
        this.f111112p.setVisibility(0);
        this.f111109m.setVisibility(8);
        this.f111113q.setVisibility(0);
        m135722d();
        m135721c();
        this.f111106h.setVisibility(0);
        this.f111104f.setVisibility(0);
    }

    /* renamed from: h */
    private void m135726h() {
        String f = this.f111099a.mo104395f();
        String string = getString(R.string.dzf);
        this.f111108j.setText(C1642a.m8034a(string, new Object[]{this.f111102d, f}));
        this.f111113q.setVisibility(0);
        m135722d();
        m135721c();
        this.f111107i.setVisibility(0);
        this.f111103e.setVisibility(0);
        this.f111112p.setVisibility(0);
        this.f111109m.setVisibility(0);
        this.f111110n.setProgress(0);
        this.f111111o.setText(" ");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo53821a() {
        if (!this.f111099a.mo104398i()) {
            m135724f();
            return;
        }
        this.f111099a.mo104392c();
        File q = this.f111099a.mo104406q();
        if (q != null) {
            this.f111099a.mo104393d();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(1);
            intent.setDataAndType(C19929d.m65754a((Context) this, q), "application/vnd.android.package-archive");
            startActivity(intent);
            finish();
            return;
        }
        this.f111099a.mo104412w();
        if (this.f111101c != null) {
            this.f111101c.mo104382a();
        }
        this.f111101c = new C42771a();
        this.f111101c.start();
        m135726h();
    }

    public void handleMsg(Message message) {
        C42781a aVar;
        if (isViewValid()) {
            switch (message.what) {
                case 1:
                    if (message.obj == null || !(message.obj instanceof C42781a)) {
                        aVar = new C42781a();
                    } else {
                        aVar = (C42781a) message.obj;
                    }
                    m135719a(aVar.f111198a, aVar.f111199b);
                    break;
                case 2:
                    m135720b();
                    return;
            }
        }
    }

    /* renamed from: a */
    private static String m135718a(long j) {
        if (j >= 1048576) {
            return C1642a.m8034a("%.2f MB", new Object[]{Float.valueOf(((float) j) / 1048576.0f)});
        } else if (j >= 1024) {
            return C1642a.m8034a("%.2f KB", new Object[]{Float.valueOf(((float) j) / 1024.0f)});
        } else {
            return C1642a.m8034a("%d B", new Object[]{Long.valueOf(j)});
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.ss.android.ugc.aweme.R.layout.update_activity);
        this.f111099a = UpdateHelper.m135755b();
        this.f111100b = new C6309f(this);
        this.f111102d = C6399b.f18694b.mo15328d();
        this.f111115s = getString(R.string.dzo);
        this.f111108j = (TextView) findViewById(com.ss.android.ugc.aweme.R.id.update_title);
        this.f111112p = findViewById(com.ss.android.ugc.aweme.R.id.parting_line);
        this.f111109m = findViewById(com.ss.android.ugc.aweme.R.id.progress_container);
        this.f111110n = (ProgressBar) findViewById(R.id.cky);
        this.f111111o = (TextView) findViewById(R.id.cla);
        this.f111113q = findViewById(com.ss.android.ugc.aweme.R.id.whatsnew_container);
        this.f111114r = (TextView) findViewById(com.ss.android.ugc.aweme.R.id.whatsnew);
        this.f111103e = (Button) findViewById(R.id.jo);
        this.f111103e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                UpdateActivity.this.finish();
            }
        });
        this.f111104f = (Button) findViewById(R.id.ss);
        this.f111104f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                UpdateActivity.this.f111099a.mo104392c();
                UpdateActivity.this.f111099a.mo104393d();
                UpdateActivity.this.finish();
            }
        });
        this.f111105g = (Button) findViewById(com.ss.android.ugc.aweme.R.id.update_btn);
        this.f111105g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                UpdateActivity.this.mo53821a();
            }
        });
        this.f111107i = (Button) findViewById(com.ss.android.ugc.aweme.R.id.stop_btn);
        this.f111107i.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (UpdateActivity.this.f111101c != null) {
                    UpdateActivity.this.f111101c.mo104382a();
                }
                UpdateActivity.this.f111101c = null;
                UpdateActivity.this.f111099a.mo104413x();
                UpdateActivity.this.finish();
            }
        });
        this.f111106h = (Button) findViewById(com.ss.android.ugc.aweme.R.id.install_btn);
        this.f111106h.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                UpdateActivity.this.mo53821a();
            }
        });
        m135720b();
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.getBoolean("from_update_avail")) {
                C6906g.m21511a(this, "more_tab", "notify_version_click");
            }
        }
    }

    /* renamed from: a */
    private void m135719a(long j, long j2) {
        int i;
        String str = this.f111115s;
        if (j > 0) {
            i = 10;
        } else {
            i = 0;
        }
        if (j2 > 0) {
            str = m135718a(j2);
            i = (int) ((100 * j) / j2);
            if (i > 99) {
                i = 99;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m135718a(j));
        sb.append(" / ");
        sb.append(str);
        this.f111110n.setProgress(i);
        this.f111111o.setText(sb.toString());
    }
}
