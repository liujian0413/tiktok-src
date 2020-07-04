package com.bytedance.jirafast.p609ui;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.jirafast.C11999a;
import com.bytedance.jirafast.utils.C12068a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.jirafast.ui.JIRACreateIssueActivity */
public class JIRACreateIssueActivity extends AppCompatActivity {

    /* renamed from: a */
    private ArrayList<String> f31960a;

    /* renamed from: b */
    private ArrayList<String> f31961b;

    /* renamed from: c */
    private String f31962c;

    /* renamed from: d */
    private String f31963d;

    /* renamed from: e */
    private View f31964e;

    /* renamed from: f */
    private View f31965f;

    /* renamed from: g */
    private String f31966g;

    /* renamed from: h */
    private String f31967h;

    /* renamed from: i */
    private String f31968i;

    /* renamed from: j */
    private String f31969j;

    /* renamed from: k */
    private String f31970k;

    /* renamed from: l */
    private ArrayList<String> f31971l;

    /* renamed from: m */
    private boolean f31972m;

    public void onPause() {
        super.onPause();
        C12054e.m35120b();
    }

    public void onResume() {
        super.onResume();
        C12054e.m35119a();
    }

    /* renamed from: a */
    public final void mo29672a() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a("fragment_major");
        if (a == null) {
            a = new JIRACreateIssueFragment();
            a.setArguments(m35096c());
        }
        supportFragmentManager.mo2645a().mo2600b(R.id.aow, a, "fragment_major").mo2606d();
        this.f31965f.setEnabled(false);
        this.f31964e.setEnabled(true);
    }

    /* renamed from: b */
    public final void mo29673b() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a("fragment_simple");
        if (a == null) {
            a = new JIRACreateSimpleIssueFragment();
            a.setArguments(m35096c());
        }
        supportFragmentManager.mo2645a().mo2600b(R.id.aow, a, "fragment_simple").mo2606d();
        this.f31964e.setEnabled(false);
        this.f31965f.setEnabled(true);
    }

    /* renamed from: c */
    private Bundle m35096c() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("imgfilepath", this.f31960a);
        bundle.putStringArrayList("txtfilepath", this.f31961b);
        bundle.putString("Assignee", this.f31968i);
        bundle.putString("Reporter", this.f31969j);
        bundle.putString("des", this.f31966g);
        bundle.putString("email", this.f31970k);
        bundle.putString("title", this.f31967h);
        bundle.putString("momorydes", this.f31962c);
        bundle.putString("sddes", this.f31963d);
        bundle.putStringArrayList("Components", this.f31971l);
        bundle.putBoolean("isFromLeakCanary", this.f31972m);
        return bundle;
    }

    /* renamed from: d */
    private void m35097d() {
        this.f31960a = getIntent().getStringArrayListExtra("imgfilepath");
        this.f31961b = getIntent().getStringArrayListExtra("txtfilepath");
        this.f31968i = getIntent().getStringExtra("Assignee");
        this.f31969j = getIntent().getStringExtra("Reporter");
        this.f31962c = getIntent().getStringExtra("momorydes");
        this.f31963d = getIntent().getStringExtra("sddes");
        this.f31966g = getIntent().getStringExtra("des");
        this.f31970k = getIntent().getStringExtra("email");
        this.f31967h = getIntent().getStringExtra("title");
        this.f31971l = getIntent().getStringArrayListExtra("Components");
        this.f31972m = getIntent().getBooleanExtra("isFromLeakCanary", false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C11999a.m35071a(getApplicationContext());
        setContentView((int) R.layout.a44);
        m35097d();
        this.f31964e = findViewById(R.id.bf2);
        this.f31965f = findViewById(R.id.bek);
        this.f31964e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                JIRACreateIssueActivity.this.mo29673b();
            }
        });
        this.f31965f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                JIRACreateIssueActivity.this.mo29672a();
            }
        });
        if (this.f31972m || C12068a.m35194a().mo29748e(C12068a.f32143r)) {
            mo29672a();
        } else {
            mo29673b();
        }
    }
}
