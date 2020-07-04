package com.bytedance.jirafast.p609ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.jirafast.C11999a;
import com.bytedance.jirafast.utils.C12068a;
import com.bytedance.jirafast.utils.C12073d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.bytedance.jirafast.ui.JIRAReportEntryActivity */
public class JIRAReportEntryActivity extends AppCompatActivity implements OnClickListener {

    /* renamed from: a */
    private String f32067a;

    /* renamed from: a */
    private void m35113a() {
        ImageView imageView = (ImageView) findViewById(R.id.cj3);
        TextView textView = (TextView) findViewById(R.id.cs2);
        TextView textView2 = (TextView) findViewById(R.id.s3);
        findViewById(R.id.ss).setOnClickListener(this);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        if (C12068a.m35194a().mo29748e(C12068a.f32148w)) {
            textView.setVisibility(8);
            textView2.setText("Report an issue");
        }
        m35114a(imageView);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.cg);
        m35113a();
    }

    /* renamed from: a */
    private void m35114a(ImageView imageView) {
        ArrayList stringArrayListExtra = getIntent().getStringArrayListExtra("imgfilepath");
        if (!C6307b.m19566a((Collection<T>) stringArrayListExtra)) {
            this.f32067a = (String) stringArrayListExtra.get(0);
            File file = new File(this.f32067a);
            if (file.exists()) {
                imageView.setImageURI(Uri.fromFile(file));
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.cs2) {
            C12073d.m35220a().mo29754a(this, this.f32067a);
            finish();
        } else if (id == R.id.s3) {
            Intent intent = new Intent(this, JIRACreateIssueActivity.class);
            intent.putExtras(getIntent());
            intent.setFlags(268435456);
            C11999a.m35070a().startActivity(intent);
        } else {
            if (id == R.id.ss) {
                finish();
            }
        }
    }
}
