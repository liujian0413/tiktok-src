package com.bytedance.jirafast.p609ui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.AppCompatAutoCompleteTextView;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.jirafast.C11999a;
import com.bytedance.jirafast.adapters.C12001a;
import com.bytedance.jirafast.adapters.JIRAPhotoAdapter;
import com.bytedance.jirafast.models.C12010b;
import com.bytedance.jirafast.models.JIRADevice;
import com.bytedance.jirafast.models.JIRAEpicLink;
import com.bytedance.jirafast.models.JIRAUser;
import com.bytedance.jirafast.models.JIRAVersion;
import com.bytedance.jirafast.p609ui.C12056f.C12058a;
import com.bytedance.jirafast.utils.C12068a;
import com.bytedance.jirafast.utils.C12069b;
import com.bytedance.jirafast.utils.C12072c;
import com.bytedance.jirafast.utils.C12079i;
import com.bytedance.jirafast.utils.C12085m;
import com.zhihu.matisse.C47321a;
import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.engine.impl.PicassoEngine;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.jirafast.ui.JIRACreateIssueFragment */
public class JIRACreateIssueFragment extends Fragment implements C12058a {

    /* renamed from: A */
    public int f31975A = -1;

    /* renamed from: B */
    public int f31976B = -1;

    /* renamed from: C */
    private List<String> f31977C;

    /* renamed from: D */
    private String f31978D;

    /* renamed from: E */
    private String f31979E;

    /* renamed from: F */
    private String f31980F;

    /* renamed from: G */
    private String f31981G;

    /* renamed from: H */
    private String f31982H;

    /* renamed from: I */
    private String f31983I;

    /* renamed from: J */
    private TextView f31984J;

    /* renamed from: K */
    private TextView f31985K;

    /* renamed from: L */
    private TextView f31986L;

    /* renamed from: M */
    private ImageButton f31987M;

    /* renamed from: N */
    private ImageButton f31988N;

    /* renamed from: O */
    private TextView f31989O;

    /* renamed from: P */
    private RecyclerView f31990P;

    /* renamed from: Q */
    private AlertDialog f31991Q;

    /* renamed from: a */
    public List<String> f31992a;

    /* renamed from: b */
    public int f31993b = 3;

    /* renamed from: c */
    public TextView f31994c;

    /* renamed from: d */
    public ProgressDialog f31995d;

    /* renamed from: e */
    public AppCompatAutoCompleteTextView f31996e;

    /* renamed from: f */
    public AppCompatAutoCompleteTextView f31997f;

    /* renamed from: g */
    public TextView f31998g;

    /* renamed from: h */
    public TextView f31999h;

    /* renamed from: i */
    public TextView f32000i;

    /* renamed from: j */
    public EditText f32001j;

    /* renamed from: k */
    public EditText f32002k;

    /* renamed from: l */
    public EditText f32003l;

    /* renamed from: m */
    public JIRAPhotoAdapter f32004m;

    /* renamed from: n */
    List<JIRAEpicLink> f32005n;

    /* renamed from: o */
    C12001a f32006o;

    /* renamed from: p */
    C12001a f32007p;

    /* renamed from: q */
    boolean[] f32008q;

    /* renamed from: r */
    List<String> f32009r = new ArrayList();

    /* renamed from: s */
    String[] f32010s;

    /* renamed from: t */
    List<String> f32011t;

    /* renamed from: u */
    String[] f32012u;

    /* renamed from: v */
    String f32013v;

    /* renamed from: w */
    String[] f32014w;

    /* renamed from: x */
    public List<String> f32015x;

    /* renamed from: y */
    public boolean f32016y;

    /* renamed from: z */
    public int f32017z = -1;

    /* renamed from: com.bytedance.jirafast.ui.JIRACreateIssueFragment$a */
    static class C12046a extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        private final WeakReference<JIRACreateIssueFragment> f32050a;

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            if (this.f32050a.get() != null) {
                ((JIRACreateIssueFragment) this.f32050a.get()).f31995d.setTitle(R.string.bwd);
                ((JIRACreateIssueFragment) this.f32050a.get()).f31995d.setMessage("发送中...");
                ((JIRACreateIssueFragment) this.f32050a.get()).f31995d.show();
            }
        }

        public C12046a(JIRACreateIssueFragment jIRACreateIssueFragment) {
            this.f32050a = new WeakReference<>(jIRACreateIssueFragment);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (this.f32050a.get() != null) {
                ((JIRACreateIssueFragment) this.f32050a.get()).f31995d.dismiss();
                C12050a.m35115a(Toast.makeText(C11999a.m35070a(), str, 1));
                C12068a.m35194a().mo29744a(C12068a.f32143r, true);
                if (str.contains("问题创建成功")) {
                    FragmentActivity activity = ((JIRACreateIssueFragment) this.f32050a.get()).getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            String str = "";
            if (this.f32050a.get() != null) {
                JIRACreateIssueFragment jIRACreateIssueFragment = (JIRACreateIssueFragment) this.f32050a.get();
                C12068a.m35194a().mo29743a(C12068a.f32129d, jIRACreateIssueFragment.f31998g.getText().toString());
                C12068a.m35194a().mo29743a(C12068a.f32130e, jIRACreateIssueFragment.f31999h.getText().toString());
                C12068a.m35194a().mo29743a(C12068a.f32127b, jIRACreateIssueFragment.f32000i.getText().toString());
                if (!jIRACreateIssueFragment.f32016y) {
                    C12068a.m35194a().mo29743a(C12068a.f32131f, jIRACreateIssueFragment.f31996e.getText().toString());
                    C12068a.m35194a().mo29743a(C12068a.f32132g, jIRACreateIssueFragment.f31997f.getText().toString());
                }
                C12010b bVar = new C12010b(jIRACreateIssueFragment.f32002k.getText().toString(), jIRACreateIssueFragment.f31996e.getText().toString(), jIRACreateIssueFragment.f31997f.getText().toString(), String.valueOf(jIRACreateIssueFragment.f31993b), jIRACreateIssueFragment.f32001j.getText().toString(), jIRACreateIssueFragment.f31998g.getText().toString(), jIRACreateIssueFragment.f31999h.getText().toString(), jIRACreateIssueFragment.f32013v, jIRACreateIssueFragment.f32003l.getText().toString(), jIRACreateIssueFragment.f32009r);
                if (jIRACreateIssueFragment.f32004m.getItemCount() > 0) {
                    bVar.f31943l = jIRACreateIssueFragment.f32004m.f31894a;
                }
                if (jIRACreateIssueFragment.f31992a != null) {
                    if (bVar.f31943l != null) {
                        bVar.f31943l.addAll(jIRACreateIssueFragment.f31992a);
                    } else {
                        bVar.f31943l = jIRACreateIssueFragment.f31992a;
                    }
                }
                str = C12069b.m35206a().mo29749a(bVar);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            return sb.toString();
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: d */
    private void m35100d() {
        this.f32000i.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                JIRACreateIssueFragment.this.mo29679b();
            }
        });
        this.f31986L.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                new C12046a(JIRACreateIssueFragment.this).execute(new Void[0]);
            }
        });
        this.f31996e.setOnItemClickListener(new OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (JIRACreateIssueFragment.this.f32006o.f31898b != null) {
                    final List<JIRAUser> list = JIRACreateIssueFragment.this.f32006o.f31898b;
                    if (!list.contains(JIRACreateIssueFragment.this.f32006o.getItem(i))) {
                        list.add(0, JIRACreateIssueFragment.this.f32006o.getItem(i));
                        if (list.size() > 20) {
                            list.remove(list.size() - 1);
                        }
                        C12085m.m35245a(new Runnable() {
                            public final void run() {
                                C12068a.m35194a();
                                C12068a.m35197b(C12068a.f32131f, list);
                            }
                        });
                    }
                }
            }
        });
        this.f31994c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                JIRACreateIssueFragment.this.mo29680c();
            }
        });
        this.f31997f.setOnItemClickListener(new OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (JIRACreateIssueFragment.this.f32007p.f31898b != null) {
                    final List<JIRAUser> list = JIRACreateIssueFragment.this.f32007p.f31898b;
                    if (!list.contains(JIRACreateIssueFragment.this.f32007p.getItem(i))) {
                        list.add(0, JIRACreateIssueFragment.this.f32007p.getItem(i));
                        if (list.size() > 20) {
                            list.remove(list.size() - 1);
                        }
                        C12085m.m35245a(new Runnable() {
                            public final void run() {
                                C12068a.m35194a();
                                C12068a.m35197b(C12068a.f32132g, list);
                            }
                        });
                    }
                }
            }
        });
        this.f31985K.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                JIRACreateIssueFragment.this.getActivity().onBackPressed();
            }
        });
        this.f31988N.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
            }
        });
        this.f31998g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                JIRACreateIssueFragment.this.mo29678a(false);
            }
        });
        this.f31999h.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                JIRACreateIssueFragment.this.mo29678a(true);
            }
        });
        this.f31984J.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C12056f fVar = new C12056f(JIRACreateIssueFragment.this.getActivity());
                fVar.f32099f = JIRACreateIssueFragment.this;
                fVar.show();
            }
        });
        this.f31987M.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (C0683b.m2909b((Context) JIRACreateIssueFragment.this.getActivity(), "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    ActivityCompat.m2241a(JIRACreateIssueFragment.this.getActivity(), new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 24);
                    return;
                }
                JIRACreateIssueFragment.this.mo29676a();
            }
        });
        C12085m.m35245a(new Runnable() {
            public final void run() {
                C12068a.m35194a();
                final List c = C12068a.m35198c(C12068a.f32131f);
                C12068a.m35194a();
                final List c2 = C12068a.m35198c(C12068a.f32132g);
                final List c3 = C12069b.m35206a().mo29752c();
                final List b = C12069b.m35206a().mo29751b();
                final ArrayList d = C12069b.m35206a().mo29753d();
                C120391 r1 = new Runnable() {
                    public final void run() {
                        JIRACreateIssueFragment.this.f32006o.f31898b = c;
                        JIRACreateIssueFragment.this.f32007p.f31898b = c2;
                        if (JIRACreateIssueFragment.this.f32015x != null && JIRACreateIssueFragment.this.f32015x.size() > 0) {
                            JIRACreateIssueFragment.this.f32011t = JIRACreateIssueFragment.this.f32015x;
                        } else if (JIRACreateIssueFragment.this.f32008q == null) {
                            JIRACreateIssueFragment jIRACreateIssueFragment = JIRACreateIssueFragment.this;
                            C12068a.m35194a();
                            jIRACreateIssueFragment.f32011t = C12068a.m35196b(C12068a.f32127b);
                        }
                        if (b == null || b.size() <= 0) {
                            JIRACreateIssueFragment.this.f32010s = null;
                            JIRACreateIssueFragment.this.f32008q = null;
                        } else {
                            JIRACreateIssueFragment.this.f32008q = new boolean[b.size()];
                            JIRACreateIssueFragment.this.f32010s = new String[b.size()];
                            for (String str : JIRACreateIssueFragment.this.f32011t) {
                                int indexOf = b.indexOf(str);
                                if (JIRACreateIssueFragment.this.f32015x == null || JIRACreateIssueFragment.this.f32015x.size() <= 0) {
                                    if (indexOf > 0) {
                                        b.remove(indexOf);
                                        b.add(0, str);
                                    }
                                } else if (indexOf >= 0) {
                                    JIRACreateIssueFragment.this.f32008q[indexOf] = true;
                                    JIRACreateIssueFragment.this.f32009r.add(str);
                                }
                            }
                            for (int i = 0; i < b.size(); i++) {
                                JIRACreateIssueFragment.this.f32010s[i] = (String) b.get(i);
                            }
                            if (JIRACreateIssueFragment.this.f32009r.size() > 0) {
                                C12085m.m35246b(new Runnable() {
                                    public final void run() {
                                        String str = "";
                                        for (int i = 0; i < JIRACreateIssueFragment.this.f32009r.size(); i++) {
                                            if (i == JIRACreateIssueFragment.this.f32009r.size() - 1) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(str);
                                                sb.append((String) JIRACreateIssueFragment.this.f32009r.get(i));
                                                str = sb.toString();
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(str);
                                                sb2.append((String) JIRACreateIssueFragment.this.f32009r.get(i));
                                                sb2.append(",");
                                                str = sb2.toString();
                                            }
                                        }
                                        JIRACreateIssueFragment.this.f32000i.setText(str);
                                    }
                                });
                            }
                        }
                        if (d == null || d.size() <= 0) {
                            JIRACreateIssueFragment.this.f32012u = null;
                            JIRACreateIssueFragment.this.f32005n = null;
                        } else {
                            JIRACreateIssueFragment.this.f32005n = d;
                            JIRACreateIssueFragment.this.f32012u = new String[d.size()];
                            for (int i2 = 0; i2 < d.size(); i2++) {
                                JIRACreateIssueFragment.this.f32012u[i2] = ((JIRAEpicLink) d.get(i2)).getName();
                            }
                        }
                        if (c3 == null || c3.size() <= 0) {
                            JIRACreateIssueFragment.this.f32014w = null;
                            return;
                        }
                        JIRACreateIssueFragment.this.f32014w = new String[c3.size()];
                        for (int i3 = 0; i3 < c3.size(); i3++) {
                            JIRACreateIssueFragment.this.f32014w[i3] = ((JIRAVersion) c3.get(i3)).getName();
                        }
                    }
                };
                C12085m.m35246b(r1);
            }
        });
    }

    /* renamed from: a */
    public final void mo29676a() {
        C47321a.m147749a((Fragment) this).mo119331a(MimeType.ofImage()).mo119336a(true).mo119340c(false).mo119338b(true).mo119337b(9).mo119341d(getResources().getDimensionPixelSize(R.dimen.hi)).mo119333a(0.85f).imageEngine(new PicassoEngine()).mo119342e(23);
    }

    /* renamed from: b */
    public final void mo29679b() {
        if (this.f32010s == null || this.f32010s.length == 0) {
            C12051b.m35116a(Toast.makeText(getContext(), "模块数据正在加载", 0));
            return;
        }
        Builder builder = new Builder(getContext(), 3);
        builder.setTitle("选择模块");
        builder.setMultiChoiceItems(this.f32010s, this.f32008q, new OnMultiChoiceClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                JIRACreateIssueFragment.this.f32008q[i] = z;
                if (z) {
                    JIRACreateIssueFragment.this.f32009r.add(JIRACreateIssueFragment.this.f32010s[i]);
                    if (!JIRACreateIssueFragment.this.f32011t.contains(JIRACreateIssueFragment.this.f32010s[i])) {
                        JIRACreateIssueFragment.this.f32011t.add(JIRACreateIssueFragment.this.f32010s[i]);
                    }
                    if (JIRACreateIssueFragment.this.f32011t.size() > 15) {
                        JIRACreateIssueFragment.this.f32011t.remove(0);
                    }
                    C12085m.m35245a(new Runnable() {
                        public final void run() {
                            C12068a.m35194a();
                            C12068a.m35195a(C12068a.f32127b, JIRACreateIssueFragment.this.f32011t);
                        }
                    });
                } else {
                    JIRACreateIssueFragment.this.f32009r.remove(JIRACreateIssueFragment.this.f32010s[i]);
                }
                String str = "";
                for (int i2 = 0; i2 < JIRACreateIssueFragment.this.f32009r.size(); i2++) {
                    if (i2 == JIRACreateIssueFragment.this.f32009r.size() - 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append((String) JIRACreateIssueFragment.this.f32009r.get(i2));
                        str = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append((String) JIRACreateIssueFragment.this.f32009r.get(i2));
                        sb2.append(",");
                        str = sb2.toString();
                    }
                }
                JIRACreateIssueFragment.this.f32000i.setText(str);
            }
        });
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.f31991Q = builder.create();
        this.f31991Q.show();
    }

    /* renamed from: c */
    public final void mo29680c() {
        if (this.f32005n == null || this.f32005n.size() == 0) {
            C12051b.m35116a(Toast.makeText(getContext(), "Epic Link数据正在加载", 0));
            return;
        }
        Builder builder = new Builder(getContext(), 3);
        builder.setTitle("选择Epic Link");
        builder.setSingleChoiceItems(this.f32012u, this.f32017z, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                JIRACreateIssueFragment.this.f32017z = i;
                JIRACreateIssueFragment.this.f32013v = ((JIRAEpicLink) JIRACreateIssueFragment.this.f32005n.get(i)).getKey();
                JIRACreateIssueFragment.this.f31994c.setText(((JIRAEpicLink) JIRACreateIssueFragment.this.f32005n.get(i)).getName());
            }
        });
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.f31991Q = builder.create();
        this.f31991Q.show();
    }

    /* renamed from: e */
    private void m35101e() {
        Bundle arguments = getArguments();
        this.f32015x = arguments.getStringArrayList("Components");
        this.f31977C = arguments.getStringArrayList("imgfilepath");
        this.f31992a = arguments.getStringArrayList("txtfilepath");
        this.f31980F = arguments.getString("des");
        if (TextUtils.isEmpty(this.f31980F)) {
            this.f31980F = C12068a.m35194a().mo29742a(C12068a.f32139n);
        }
        this.f31981G = arguments.getString("title");
        if (TextUtils.isEmpty(this.f31981G)) {
            this.f31981G = C12068a.m35194a().mo29742a(C12068a.f32138m);
        }
        this.f31978D = arguments.getString("momorydes");
        this.f31979E = arguments.getString("sddes");
        this.f31982H = arguments.getString("Assignee");
        if (TextUtils.isEmpty(this.f31982H)) {
            this.f31982H = C12068a.m35194a().mo29742a(C12068a.f32131f);
        }
        this.f31983I = arguments.getString("Reporter");
        if (TextUtils.isEmpty(this.f31983I)) {
            this.f31983I = C12068a.m35194a().mo29742a(C12068a.f32132g);
        }
        this.f32016y = arguments.getBoolean("isFromLeakCanary");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m35101e();
    }

    /* renamed from: a */
    public final void mo29678a(final boolean z) {
        int i;
        int i2 = 0;
        if (this.f32014w == null || this.f32014w.length == 0) {
            C12051b.m35116a(Toast.makeText(getContext(), "版本数据正在加载", 0));
            return;
        }
        if (z && this.f31975A == -1) {
            String charSequence = this.f31999h.getText().toString();
            int i3 = 0;
            while (true) {
                if (i3 >= this.f32014w.length) {
                    break;
                } else if (this.f32014w[i3].equals(charSequence)) {
                    this.f31975A = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!z && this.f31976B == -1) {
            String charSequence2 = this.f31998g.getText().toString();
            while (true) {
                if (i2 >= this.f32014w.length) {
                    break;
                } else if (this.f32014w[i2].equals(charSequence2)) {
                    this.f31976B = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        Builder builder = new Builder(getContext(), 3);
        builder.setTitle("选择版本");
        String[] strArr = this.f32014w;
        if (z) {
            i = this.f31975A;
        } else {
            i = this.f31976B;
        }
        builder.setSingleChoiceItems(strArr, i, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (z) {
                    JIRACreateIssueFragment.this.f31975A = i;
                    JIRACreateIssueFragment.this.f31999h.setText(JIRACreateIssueFragment.this.f32014w[i]);
                    return;
                }
                JIRACreateIssueFragment.this.f31976B = i;
                JIRACreateIssueFragment.this.f31998g.setText(JIRACreateIssueFragment.this.f32014w[i]);
            }
        });
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.f31991Q = builder.create();
        this.f31991Q.show();
    }

    /* renamed from: a */
    public final void mo29677a(String str, int i) {
        this.f31984J.setText(str);
        this.f31993b = i;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 24) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                C12051b.m35116a(Toast.makeText(getContext(), "未能获取权限", 0));
            } else {
                mo29676a();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 23) {
            List b = C47321a.m147752b(intent);
            if (!b.isEmpty()) {
                this.f31990P.setVisibility(0);
                this.f32004m.mo29609a(b);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.a46, viewGroup, false);
        this.f32006o = new C12001a(getContext(), R.layout.a4_);
        this.f31996e = (AppCompatAutoCompleteTextView) inflate.findViewById(R.id.bdz);
        this.f31996e.setText(this.f31982H);
        this.f31996e.setAdapter(this.f32006o);
        this.f32007p = new C12001a(getContext(), R.layout.a4_);
        this.f31997f = (AppCompatAutoCompleteTextView) inflate.findViewById(R.id.bf0);
        this.f31997f.setText(this.f31983I);
        this.f31997f.setAdapter(this.f32007p);
        this.f31994c = (TextView) inflate.findViewById(R.id.bee);
        this.f31998g = (TextView) inflate.findViewById(R.id.bdw);
        this.f31999h = (TextView) inflate.findViewById(R.id.bef);
        StringBuilder sb = new StringBuilder();
        sb.append(C12068a.m35194a().mo29742a(C12068a.f32144s));
        sb.append(" ");
        sb.append(C12068a.m35194a().mo29742a(C12068a.f32145t));
        String trim = sb.toString().trim();
        TextView textView = this.f31998g;
        if (this.f32016y) {
            str = trim;
        } else {
            str = C12068a.m35194a().mo29745b();
        }
        textView.setText(str);
        TextView textView2 = this.f31999h;
        if (!this.f32016y) {
            trim = C12068a.m35194a().mo29746c();
        }
        textView2.setText(trim);
        this.f32000i = (TextView) inflate.findViewById(R.id.be6);
        this.f32001j = (EditText) inflate.findViewById(R.id.bej);
        this.f32002k = (EditText) inflate.findViewById(R.id.bf4);
        this.f32003l = (EditText) inflate.findViewById(R.id.beb);
        if (this.f31980F == null) {
            this.f31980F = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31980F);
        sb2.append("\n");
        this.f31980F = sb2.toString();
        JIRADevice a = C12072c.m35215a(C11999a.m35070a());
        String str2 = this.f31980F;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(System.getProperty("line.separator"));
        sb3.append("------ App Info ------");
        sb3.append(System.getProperty("line.separator"));
        sb3.append(a.toString());
        sb3.append("\n\n网络状态：");
        sb3.append(C12079i.m35232a(getContext()));
        sb3.append("\n\n");
        sb3.append(this.f31978D);
        sb3.append("\n");
        sb3.append(this.f31979E);
        this.f31980F = str2.concat(sb3.toString());
        this.f32003l.setText(this.f31980F);
        this.f31990P = (RecyclerView) inflate.findViewById(R.id.be3);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.mo5427b(0);
        this.f31990P.setLayoutManager(linearLayoutManager);
        this.f32004m = new JIRAPhotoAdapter();
        this.f31990P.setAdapter(this.f32004m);
        this.f31985K = (TextView) inflate.findViewById(R.id.be7);
        this.f31984J = (TextView) inflate.findViewById(R.id.bev);
        this.f31984J.setText(getString(R.string.bwp));
        this.f31986L = (TextView) inflate.findViewById(R.id.be_);
        this.f31995d = new ProgressDialog(getContext());
        this.f31988N = (ImageButton) inflate.findViewById(R.id.bei);
        this.f31987M = (ImageButton) inflate.findViewById(R.id.be9);
        this.f31989O = (TextView) inflate.findViewById(R.id.bel);
        this.f32002k.setText(this.f31981G);
        if (this.f31977C != null && this.f31977C.size() > 0) {
            this.f31990P.setVisibility(0);
            this.f32004m.mo29609a(this.f31977C);
        }
        ((TextView) inflate.findViewById(R.id.bex)).setText(Html.fromHtml(getString(R.string.bwt)));
        ((TextView) inflate.findViewById(R.id.beh)).setText(Html.fromHtml(getString(R.string.bwh)));
        ((TextView) inflate.findViewById(R.id.bdy)).setText(Html.fromHtml(getString(R.string.bw4)));
        ((TextView) inflate.findViewById(R.id.bf3)).setText(Html.fromHtml(getString(R.string.bwx)));
        m35100d();
        this.f32003l.post(new Runnable() {
            public final void run() {
                JIRACreateIssueFragment.this.f32003l.setFocusable(true);
                JIRACreateIssueFragment.this.f32003l.setFocusableInTouchMode(true);
                JIRACreateIssueFragment.this.f32003l.requestFocus();
            }
        });
        if (this.f32016y) {
            this.f32002k.setEnabled(false);
        }
        return inflate;
    }
}
