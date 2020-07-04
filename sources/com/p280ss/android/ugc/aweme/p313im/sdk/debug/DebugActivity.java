package com.p280ss.android.ugc.aweme.p313im.sdk.debug;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.model.Message.C6416a;
import com.bytedance.p263im.core.p584a.C11198c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.TextContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity */
public class DebugActivity extends AppCompatActivity implements OnClickListener, OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public TextView f81585a;

    /* renamed from: b */
    public TextView f81586b;

    /* renamed from: c */
    public EditText f81587c;

    /* renamed from: d */
    public CheckBox f81588d;

    /* renamed from: e */
    public String f81589e;

    /* renamed from: f */
    public String f81590f;

    /* renamed from: g */
    private TextView f81591g;

    /* renamed from: h */
    private TextView f81592h;

    /* renamed from: i */
    private TextView f81593i;

    /* renamed from: j */
    private Button f81594j;

    /* renamed from: k */
    private Button f81595k;

    /* renamed from: l */
    private Button f81596l;

    /* renamed from: m */
    private Button f81597m;

    /* renamed from: n */
    private EditText f81598n;

    /* renamed from: o */
    private EditText f81599o;

    /* renamed from: p */
    private EditText f81600p;

    /* renamed from: q */
    private RadioGroup f81601q;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private void m101398a() {
        this.f81591g.setText(C7074e.m22069b());
        C1592h.m7853a((Callable<TResult>) new Callable<Pair<Integer, Integer>>() {
            public final /* synthetic */ Object call() throws Exception {
                return m101411a();
            }

            /* JADX WARNING: Removed duplicated region for block: B:21:0x0030 A[SYNTHETIC, Splitter:B:21:0x0030] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static android.util.Pair<java.lang.Integer, java.lang.Integer> m101411a() throws java.lang.Exception {
                /*
                    r0 = 0
                    r1 = 0
                    java.lang.String r2 = "select * from conversation_list"
                    com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33206a()     // Catch:{ Exception -> 0x0020, all -> 0x001b }
                    com.bytedance.im.core.internal.db.b.b r2 = com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33207a(r2, r0)     // Catch:{ Exception -> 0x0020, all -> 0x001b }
                    if (r2 == 0) goto L_0x0016
                    int r3 = r2.mo27355b()     // Catch:{ Exception -> 0x0021, all -> 0x0012 }
                    goto L_0x0017
                L_0x0012:
                    r0 = move-exception
                    r1 = r0
                    r0 = r2
                    goto L_0x001c
                L_0x0016:
                    r3 = 0
                L_0x0017:
                    com.bytedance.p263im.core.internal.p590db.C11378t.m33468a(r2)
                    goto L_0x0025
                L_0x001b:
                    r1 = move-exception
                L_0x001c:
                    com.bytedance.p263im.core.internal.p590db.C11378t.m33468a(r0)
                    throw r1
                L_0x0020:
                    r2 = r0
                L_0x0021:
                    com.bytedance.p263im.core.internal.p590db.C11378t.m33468a(r2)
                    r3 = 0
                L_0x0025:
                    java.lang.String r4 = "select * from msg"
                    com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33206a()     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
                    com.bytedance.im.core.internal.db.b.b r0 = com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33207a(r4, r0)     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
                    if (r0 == 0) goto L_0x003f
                    int r2 = r0.mo27355b()     // Catch:{ Exception -> 0x003f, all -> 0x0036 }
                    r1 = r2
                    goto L_0x003f
                L_0x0036:
                    r1 = move-exception
                    r2 = r0
                    goto L_0x003a
                L_0x0039:
                    r1 = move-exception
                L_0x003a:
                    com.bytedance.p263im.core.internal.p590db.C11378t.m33468a(r2)
                    throw r1
                L_0x003e:
                    r0 = r2
                L_0x003f:
                    com.bytedance.p263im.core.internal.p590db.C11378t.m33468a(r0)
                    android.util.Pair r0 = new android.util.Pair
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r0.<init>(r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.debug.DebugActivity.C310933.m101411a():android.util.Pair");
            }
        }).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<Pair<Integer, Integer>, Object>() {
            public final Object then(C1592h<Pair<Integer, Integer>> hVar) throws Exception {
                if (hVar.mo6882b() && hVar.mo6890e() != null) {
                    DebugActivity.this.f81585a.setText(String.valueOf(((Pair) hVar.mo6890e()).first));
                    DebugActivity.this.f81586b.setText(String.valueOf(((Pair) hVar.mo6890e()).second));
                }
                return null;
            }
        }, C1592h.f5958b);
    }

    /* renamed from: c */
    private void m101405c() {
        Conversation a = C6417a.m20015a().mo15530a(this.f81589e);
        if (a != null) {
            this.f81587c.setText(C31913m.m103668a(a));
        } else {
            this.f81587c.setText("会话不存在或还没有被加入内存中");
        }
    }

    /* renamed from: g */
    private void m101409g() {
        String str = C11198c.m32777a().mo27248b().f30406f;
        if (!TextUtils.isEmpty(str)) {
            this.f81600p.setText(str);
        }
    }

    /* renamed from: d */
    private void m101406d() {
        this.f81598n.setHint("7");
        this.f81599o.setHint(C31913m.m103668a(TextContent.obtain("这是一条测试消息")));
        if (!TextUtils.isEmpty(this.f81590f)) {
            C1592h.m7853a((Callable<TResult>) new Callable<Message>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Message call() throws Exception {
                    C11375q.m33429a();
                    return C11375q.m33447d(DebugActivity.this.f81590f);
                }
            }).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<Message, Object>() {
                public final Object then(C1592h<Message> hVar) throws Exception {
                    if (hVar.mo6882b() && hVar.mo6890e() != null) {
                        DebugActivity.this.f81587c.setText(C31913m.m103668a(hVar.mo6890e()));
                    }
                    return null;
                }
            }, C1592h.f5958b);
        }
    }

    /* renamed from: e */
    private void m101407e() {
        Message message;
        try {
            message = (Message) C31913m.m103667a(this.f81587c.getText().toString(), Message.class);
        } catch (Exception unused) {
            message = null;
        }
        if (message != null) {
            this.f81598n.setText(String.valueOf(message.getMsgType()));
            this.f81599o.setText(String.valueOf(message.getContent()));
            return;
        }
        C31099a.m101413a(Toast.makeText(this, "解析失败", 0));
    }

    /* renamed from: h */
    private void m101410h() {
        String obj = this.f81600p.getText().toString();
        try {
            Uri.parse(obj);
            C11198c.m32777a().mo27248b().f30406f = obj;
            C31099a.m101413a(Toast.makeText(this, "修改成功，下个请求生效，冷重启会重置", 0));
        } catch (Exception unused) {
            C31099a.m101413a(Toast.makeText(this, "填的Host似乎不合法吧？", 0));
        }
    }

    /* renamed from: b */
    private void m101404b() {
        if (!TextUtils.isEmpty(this.f81589e)) {
            long a = C6425b.m20074a(this.f81589e);
            this.f81592h.setText(String.valueOf(a));
            if (a != -1) {
                IMUser b = C6961d.m21657a().mo18029b(String.valueOf(a));
                if (b != null) {
                    switch (b.getFollowStatus()) {
                        case 0:
                            this.f81593i.setText("没有互相关注或状态未知");
                            return;
                        case 1:
                            this.f81593i.setText("当前用户单向关注对方");
                            return;
                        case 2:
                            this.f81593i.setText("双向关注");
                            break;
                    }
                    return;
                }
            }
            this.f81593i.setText("用户不存在或本地没有数据");
        }
    }

    /* renamed from: f */
    private void m101408f() {
        final int i;
        final String str;
        try {
            if (TextUtils.isEmpty(this.f81598n.getText())) {
                i = Integer.valueOf(this.f81598n.getHint().toString()).intValue();
            } else {
                i = Integer.valueOf(this.f81598n.getText().toString()).intValue();
            }
            if (TextUtils.isEmpty(this.f81599o.getText())) {
                str = this.f81599o.getHint().toString();
            } else {
                str = this.f81599o.getText().toString();
            }
            if (!this.f81588d.isChecked()) {
                m101402a(new Runnable() {
                    public final void run() {
                        C31863ai.m103535c(new C6416a().mo15526a(C6417a.m20015a().mo15530a(DebugActivity.this.f81589e)).mo15525a(i).mo15527a(str).mo15528a());
                    }
                });
                return;
            }
            if (m101403a(i, str)) {
                C31863ai.m103535c(new C6416a().mo15526a(C6417a.m20015a().mo15530a(this.f81589e)).mo15525a(i).mo15527a(str).mo15528a());
            }
        } catch (Exception unused) {
            C31099a.m101413a(Toast.makeText(this, "哪一步错了，仔细检查一下", 0));
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view == this.f81594j) {
            m101405c();
        } else if (view == this.f81595k) {
            m101407e();
        } else if (view == this.f81596l) {
            m101408f();
        } else {
            if (view == this.f81597m) {
                m101410h();
            }
        }
    }

    /* renamed from: a */
    private void m101402a(final Runnable runnable) {
        new C1081a(this).mo4233a((CharSequence) "想清楚你在干什么！！").mo4240b((CharSequence) "去掉严格模式，意味着不会对消息内容进行检查，如果将错误的消息发出去，可能会导致严重的后果！！").mo4235a(false).mo4241b((CharSequence) "好好好，我怂了", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                DebugActivity.this.f81588d.setChecked(true);
            }
        }).mo4234a((CharSequence) "我不怕死，来吧", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }).mo4245c();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.s7);
        this.f81589e = getIntent().getStringExtra("EXTRA_CONVERSATION_ID");
        this.f81590f = getIntent().getStringExtra("EXTRA_MSG_UUID");
        this.f81591g = (TextView) findViewById(R.id.dt0);
        this.f81585a = (TextView) findViewById(R.id.e1p);
        this.f81586b = (TextView) findViewById(R.id.dy5);
        this.f81592h = (TextView) findViewById(R.id.e3o);
        this.f81593i = (TextView) findViewById(R.id.dur);
        this.f81594j = (Button) findViewById(R.id.r8);
        this.f81595k = (Button) findViewById(R.id.q0);
        this.f81596l = (Button) findViewById(R.id.rh);
        this.f81597m = (Button) findViewById(R.id.qd);
        this.f81587c = (EditText) findViewById(R.id.agf);
        this.f81598n = (EditText) findViewById(R.id.ag9);
        this.f81599o = (EditText) findViewById(R.id.ag8);
        this.f81600p = (EditText) findViewById(R.id.ag4);
        this.f81588d = (CheckBox) findViewById(R.id.to);
        this.f81601q = (RadioGroup) findViewById(R.id.css);
        this.f81594j.setOnClickListener(this);
        this.f81595k.setOnClickListener(this);
        this.f81596l.setOnClickListener(this);
        this.f81597m.setOnClickListener(this);
        this.f81588d.setOnCheckedChangeListener(this);
        this.f81601q.setOnCheckedChangeListener(this);
        m101398a();
        m101404b();
        m101406d();
        m101409g();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.debug.DebugActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m101400a(View view, Message message) {
        if (message != null) {
            m101401a(view, message.getConversationId(), message.getUuid());
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == this.f81588d && !z) {
            m101402a(null);
        }
    }

    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (radioGroup == this.f81601q) {
            if (i == R.id.co3) {
                C11198c.m32777a().mo27248b().f30410j = 0;
            } else if (i == R.id.co5) {
                C11198c.m32777a().mo27248b().f30410j = 1;
            } else if (i == R.id.co4) {
                C11198c.m32777a().mo27248b().f30410j = 2;
            }
        }
    }

    /* renamed from: a */
    private boolean m101403a(int i, String str) {
        if (C6425b.m20074a(this.f81589e) < 0 || TextUtils.isEmpty(str)) {
            C31099a.m101413a(Toast.makeText(this, "消息检查没通过，再看看？", 0));
            return false;
        } else if (i != 7) {
            C31099a.m101413a(Toast.makeText(this, "严格模式下，该消息类型暂不支持", 0));
            return false;
        } else {
            BaseContent content = MessageViewType.content(i, str, false, 0);
            if (C31863ai.m103526a(content) != i) {
                C31099a.m101413a(Toast.makeText(this, "消息内容和消息类型不匹配", 0));
                return false;
            } else if (content.isValid()) {
                return true;
            } else {
                C31099a.m101413a(Toast.makeText(this, "消息内容数据非法", 0));
                return false;
            }
        }
    }

    /* renamed from: a */
    public static void m101399a(Context context, String str, String str2) {
        Intent intent = new Intent(context, DebugActivity.class);
        intent.putExtra("EXTRA_CONVERSATION_ID", str);
        intent.putExtra("EXTRA_MSG_UUID", str2);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private static void m101401a(View view, final String str, final String str2) {
        if (C6956a.m21632a().f19661a.f19931a && view != null) {
            view.setOnLongClickListener(new OnLongClickListener() {
                public final boolean onLongClick(View view) {
                    DebugActivity.m101399a(view.getContext(), str, str2);
                    return false;
                }
            });
        }
    }
}
