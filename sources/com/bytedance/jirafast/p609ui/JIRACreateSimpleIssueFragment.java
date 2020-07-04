package com.bytedance.jirafast.p609ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.bytedance.jirafast.models.C12012d;
import com.bytedance.jirafast.utils.C12068a;
import com.bytedance.jirafast.utils.C12079i;
import com.bytedance.jirafast.utils.C12081k;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.bytedance.jirafast.ui.JIRACreateSimpleIssueFragment */
public class JIRACreateSimpleIssueFragment extends Fragment {

    /* renamed from: a */
    public List<String> f32051a;

    /* renamed from: b */
    public List<String> f32052b;

    /* renamed from: c */
    public String f32053c;

    /* renamed from: d */
    public String f32054d;

    /* renamed from: e */
    public ProgressDialog f32055e;

    /* renamed from: f */
    public EditText f32056f;

    /* renamed from: g */
    public EditText f32057g;

    /* renamed from: h */
    public C12081k f32058h;

    /* renamed from: i */
    private String f32059i;

    /* renamed from: j */
    private Button f32060j;

    /* renamed from: com.bytedance.jirafast.ui.JIRACreateSimpleIssueFragment$a */
    static class C12048a extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        public final WeakReference<JIRACreateSimpleIssueFragment> f32062a;

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            if (this.f32062a.get() != null) {
                ((JIRACreateSimpleIssueFragment) this.f32062a.get()).f32055e.setTitle(R.string.bwd);
                ((JIRACreateSimpleIssueFragment) this.f32062a.get()).f32055e.setMessage("Sending...");
                ((JIRACreateSimpleIssueFragment) this.f32062a.get()).f32055e.show();
            }
        }

        public C12048a(JIRACreateSimpleIssueFragment jIRACreateSimpleIssueFragment) {
            this.f32062a = new WeakReference<>(jIRACreateSimpleIssueFragment);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (this.f32062a.get() != null) {
                C12068a.m35194a().mo29744a(C12068a.f32143r, false);
                ((JIRACreateSimpleIssueFragment) this.f32062a.get()).f32055e.dismiss();
                Context context = ((JIRACreateSimpleIssueFragment) this.f32062a.get()).getContext();
                if (!TextUtils.isEmpty(str)) {
                    C12053d.m35118a(Toast.makeText(context, str, 1));
                    return;
                }
                String trim = ((JIRACreateSimpleIssueFragment) this.f32062a.get()).f32057g.getText().toString().trim();
                int indexOf = trim.indexOf("@");
                if (indexOf > 0) {
                    trim.substring(0, indexOf);
                }
                new C1081a(context, R.style.m2).mo4240b((CharSequence) "Issue received, we've created a Lark group to follow up").mo4241b((CharSequence) "Done", (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ((JIRACreateSimpleIssueFragment) C12048a.this.f32062a.get()).getActivity().finish();
                    }
                }).mo4242b().show();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            String str = "";
            if (this.f32062a.get() == null) {
                return str;
            }
            JIRACreateSimpleIssueFragment jIRACreateSimpleIssueFragment = (JIRACreateSimpleIssueFragment) this.f32062a.get();
            String trim = jIRACreateSimpleIssueFragment.f32057g.getText().toString().trim();
            String obj = jIRACreateSimpleIssueFragment.f32056f.getText().toString();
            StringBuilder sb = new StringBuilder();
            sb.append(System.getProperty("line.separator"));
            sb.append("------ App Info ------");
            sb.append(System.getProperty("line.separator"));
            sb.append("网络状态：");
            sb.append(C12079i.m35232a(jIRACreateSimpleIssueFragment.getContext()));
            sb.append("\n\n");
            sb.append(jIRACreateSimpleIssueFragment.f32053c);
            sb.append("\n");
            sb.append(jIRACreateSimpleIssueFragment.f32054d);
            String concat = obj.concat(sb.toString());
            C12068a.m35194a().mo29743a(C12068a.f32142q, trim);
            int indexOf = trim.indexOf("@");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            C12012d dVar = new C12012d(C12068a.m35194a().mo29747d(C12068a.f32140o), trim, concat, jIRACreateSimpleIssueFragment.f32051a, jIRACreateSimpleIssueFragment.f32052b);
            return jIRACreateSimpleIssueFragment.f32058h.mo29756a(dVar);
        }
    }

    /* renamed from: a */
    private void m35109a() {
        Bundle arguments = getArguments();
        this.f32051a = arguments.getStringArrayList("imgfilepath");
        this.f32052b = arguments.getStringArrayList("txtfilepath");
        this.f32053c = arguments.getString("momorydes");
        this.f32054d = arguments.getString("sddes");
        this.f32059i = arguments.getString("email");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f32058h = C12081k.m35238a();
        m35109a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.a47, viewGroup, false);
        this.f32056f = (EditText) inflate.findViewById(R.id.a7m);
        this.f32057g = (EditText) inflate.findViewById(R.id.cs5);
        this.f32059i = C12068a.m35194a().mo29742a(C12068a.f32147v);
        if (!TextUtils.isEmpty(this.f32059i)) {
            this.f32057g.setText(this.f32059i);
        } else {
            this.f32057g.setText(C12068a.m35194a().mo29742a(C12068a.f32142q));
        }
        this.f32060j = (Button) inflate.findViewById(R.id.a_7);
        this.f32055e = new ProgressDialog(getContext());
        this.f32060j.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                String obj = JIRACreateSimpleIssueFragment.this.f32057g.getText().toString();
                if (TextUtils.isEmpty(JIRACreateSimpleIssueFragment.this.f32056f.getText().toString())) {
                    C12052c.m35117a(Toast.makeText(JIRACreateSimpleIssueFragment.this.getContext(), "Please  describe the problem", 1));
                } else if (TextUtils.isEmpty(obj)) {
                    C12052c.m35117a(Toast.makeText(JIRACreateSimpleIssueFragment.this.getContext(), "Please fill in your Bytedance Email Prefix", 1));
                } else {
                    new C12048a(JIRACreateSimpleIssueFragment.this).execute(new Void[0]);
                }
            }
        });
        return inflate;
    }
}
