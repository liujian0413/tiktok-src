package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity */
public class TestDependenciesActivity extends AppCompatActivity {

    /* renamed from: a */
    private ListView f98561a;

    /* renamed from: b */
    private EditText f98562b;

    /* renamed from: c */
    private Button f98563c;

    /* renamed from: d */
    private final ArrayList<String> f98564d = new ArrayList<>();

    /* renamed from: e */
    private C37816a f98565e;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity$a */
    class C37816a extends BaseAdapter {

        /* renamed from: b */
        private LayoutInflater f98567b;

        /* renamed from: c */
        private ArrayList<String> f98568c;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            if (this.f98568c == null) {
                return 0;
            }
            return this.f98568c.size();
        }

        /* renamed from: a */
        public final void mo95254a(ArrayList<String> arrayList) {
            this.f98568c = arrayList;
            notifyDataSetChanged();
        }

        public final Object getItem(int i) {
            if (this.f98568c == null) {
                return null;
            }
            return this.f98568c.get(i);
        }

        C37816a(ArrayList<String> arrayList) {
            this.f98568c = arrayList;
            this.f98567b = LayoutInflater.from(TestDependenciesActivity.this);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C37817b bVar;
            if (view == null) {
                bVar = new C37817b();
                view2 = this.f98567b.inflate(R.layout.a3o, null);
                bVar.f98569a = (TextView) view2.findViewById(R.id.dt3);
                view2.setTag(bVar);
            } else {
                view2 = view;
                bVar = (C37817b) view.getTag();
            }
            bVar.f98569a.setText((CharSequence) this.f98568c.get(i));
            return view2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity$b */
    static class C37817b {

        /* renamed from: a */
        public TextView f98569a;

        C37817b() {
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private void m121025a() {
        this.f98561a = (ListView) findViewById(R.id.bn6);
        this.f98562b = (EditText) findViewById(R.id.agm);
        this.f98563c = (Button) findViewById(R.id.rf);
        this.f98563c.setText("Search");
        this.f98563c.setOnClickListener(new C37881ah(this));
    }

    /* renamed from: b */
    private void m121026b() {
        String str = "";
        if (!TextUtils.isEmpty(str)) {
            if (str.contains(",")) {
                for (String add : str.split(",")) {
                    this.f98564d.add(add);
                }
            } else {
                this.f98564d.add(str);
            }
            this.f98565e = new C37816a(this.f98564d);
            this.f98561a.setAdapter(this.f98565e);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.hk);
        m121025a();
        m121026b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95252a(View view) {
        String obj = this.f98562b.getText().toString();
        if (this.f98564d.size() > 0) {
            if (TextUtils.isEmpty(obj)) {
                this.f98565e.mo95254a(this.f98564d);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f98564d.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.contains(obj)) {
                    arrayList.add(str);
                }
            }
            this.f98565e.mo95254a(arrayList);
        }
    }
}
