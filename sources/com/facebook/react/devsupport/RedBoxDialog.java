package com.facebook.react.devsupport;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.common.p686c.C13286a;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.devsupport.RedBoxHandler.ReportCompletedListener;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import org.json.JSONObject;

class RedBoxDialog extends Dialog implements OnItemClickListener {
    public boolean isReporting;
    private Button mCopyToClipboardButton;
    public final DevSupportManager mDevSupportManager;
    private Button mDismissButton;
    private final DoubleTapReloadRecognizer mDoubleTapReloadRecognizer;
    public View mLineSeparator;
    public ProgressBar mLoadingIndicator;
    public final RedBoxHandler mRedBoxHandler;
    private Button mReloadJsButton;
    public Button mReportButton;
    private OnClickListener mReportButtonOnClickListener = new OnClickListener() {
        public void onClick(View view) {
            if (RedBoxDialog.this.mRedBoxHandler != null && RedBoxDialog.this.mRedBoxHandler.isReportEnabled() && !RedBoxDialog.this.isReporting) {
                RedBoxDialog.this.isReporting = true;
                ((TextView) C13854a.m40916b(RedBoxDialog.this.mReportTextView)).setText("Reporting...");
                ((TextView) C13854a.m40916b(RedBoxDialog.this.mReportTextView)).setVisibility(0);
                ((ProgressBar) C13854a.m40916b(RedBoxDialog.this.mLoadingIndicator)).setVisibility(0);
                ((View) C13854a.m40916b(RedBoxDialog.this.mLineSeparator)).setVisibility(0);
                ((Button) C13854a.m40916b(RedBoxDialog.this.mReportButton)).setEnabled(false);
                RedBoxDialog.this.mRedBoxHandler.reportRedbox(view.getContext(), (String) C13854a.m40916b(RedBoxDialog.this.mDevSupportManager.getLastErrorTitle()), (StackFrame[]) C13854a.m40916b(RedBoxDialog.this.mDevSupportManager.getLastErrorStack()), RedBoxDialog.this.mDevSupportManager.getSourceUrl(), (ReportCompletedListener) C13854a.m40916b(RedBoxDialog.this.mReportCompletedListener));
            }
        }
    };
    public ReportCompletedListener mReportCompletedListener = new ReportCompletedListener() {
        public void onReportError(SpannedString spannedString) {
            RedBoxDialog.this.isReporting = false;
            ((Button) C13854a.m40916b(RedBoxDialog.this.mReportButton)).setEnabled(true);
            ((ProgressBar) C13854a.m40916b(RedBoxDialog.this.mLoadingIndicator)).setVisibility(8);
            ((TextView) C13854a.m40916b(RedBoxDialog.this.mReportTextView)).setText(spannedString);
        }

        public void onReportSuccess(SpannedString spannedString) {
            RedBoxDialog.this.isReporting = false;
            ((Button) C13854a.m40916b(RedBoxDialog.this.mReportButton)).setEnabled(true);
            ((ProgressBar) C13854a.m40916b(RedBoxDialog.this.mLoadingIndicator)).setVisibility(8);
            ((TextView) C13854a.m40916b(RedBoxDialog.this.mReportTextView)).setText(spannedString);
        }
    };
    public TextView mReportTextView;
    private ListView mStackView;

    static class CopyToHostClipBoardTask extends AsyncTask<String, Void, Void> {
        private final DevSupportManager mDevSupportManager;

        private CopyToHostClipBoardTask(DevSupportManager devSupportManager) {
            this.mDevSupportManager = devSupportManager;
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(String... strArr) {
            try {
                String uri = Uri.parse(this.mDevSupportManager.getSourceUrl()).buildUpon().path("/copy-to-clipboard").query(null).build().toString();
                for (String create : strArr) {
                    new OkHttpClient().newCall(new Builder().url(uri).post(RequestBody.create((MediaType) null, create)).build()).execute();
                }
            } catch (Exception e) {
                C13286a.m38861c("ReactNative", "Could not copy to the host clipboard", (Throwable) e);
            }
            return null;
        }
    }

    static class OpenStackFrameTask extends AsyncTask<StackFrame, Void, Void> {
        private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        private final DevSupportManager mDevSupportManager;

        private OpenStackFrameTask(DevSupportManager devSupportManager) {
            this.mDevSupportManager = devSupportManager;
        }

        private static JSONObject stackFrameToJson(StackFrame stackFrame) {
            return new JSONObject(MapBuilder.m41791of("file", stackFrame.getFile(), "methodName", stackFrame.getMethod(), "lineNumber", Integer.valueOf(stackFrame.getLine()), "column", Integer.valueOf(stackFrame.getColumn())));
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(StackFrame... stackFrameArr) {
            try {
                String uri = Uri.parse(this.mDevSupportManager.getSourceUrl()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                OkHttpClient okHttpClient = new OkHttpClient();
                for (StackFrame stackFrameToJson : stackFrameArr) {
                    okHttpClient.newCall(new Builder().url(uri).post(RequestBody.create(JSON, stackFrameToJson(stackFrameToJson).toString())).build()).execute();
                }
            } catch (Exception e) {
                C13286a.m38861c("ReactNative", "Could not open stack frame", (Throwable) e);
            }
            return null;
        }
    }

    static class StackAdapter extends BaseAdapter {
        private final StackFrame[] mStack;
        private final String mTitle;

        static class FrameViewHolder {
            public final TextView mFileView;
            public final TextView mMethodView;

            private FrameViewHolder(View view) {
                this.mMethodView = (TextView) view.findViewById(R.id.cvi);
                this.mFileView = (TextView) view.findViewById(R.id.cvh);
            }
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        public int getViewTypeCount() {
            return 2;
        }

        public boolean isEnabled(int i) {
            return i > 0;
        }

        public int getCount() {
            return this.mStack.length + 1;
        }

        public Object getItem(int i) {
            if (i == 0) {
                return this.mTitle;
            }
            return this.mStack[i - 1];
        }

        public StackAdapter(String str, StackFrame[] stackFrameArr) {
            this.mTitle = str;
            this.mStack = stackFrameArr;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView;
            if (i == 0) {
                if (view != null) {
                    textView = (TextView) view;
                } else {
                    textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ahk, viewGroup, false);
                }
                textView.setText(this.mTitle);
                return textView;
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ahj, viewGroup, false);
                view.setTag(new FrameViewHolder(view));
            }
            StackFrame stackFrame = this.mStack[i - 1];
            FrameViewHolder frameViewHolder = (FrameViewHolder) view.getTag();
            frameViewHolder.mMethodView.setText(stackFrame.getMethod());
            frameViewHolder.mFileView.setText(StackTraceHelper.formatFrameSource(stackFrame));
            return view;
        }
    }

    public void resetReporting() {
        if (this.mRedBoxHandler != null && this.mRedBoxHandler.isReportEnabled()) {
            this.isReporting = false;
            ((TextView) C13854a.m40916b(this.mReportTextView)).setVisibility(8);
            ((ProgressBar) C13854a.m40916b(this.mLoadingIndicator)).setVisibility(8);
            ((View) C13854a.m40916b(this.mLineSeparator)).setVisibility(8);
            ((Button) C13854a.m40916b(this.mReportButton)).setVisibility(0);
            ((Button) C13854a.m40916b(this.mReportButton)).setEnabled(true);
        }
    }

    public void setExceptionDetails(String str, StackFrame[] stackFrameArr) {
        this.mStackView.setAdapter(new StackAdapter(str, stackFrameArr));
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 82) {
            this.mDevSupportManager.showDevOptionsDialog();
            return true;
        }
        if (this.mDoubleTapReloadRecognizer.didDoubleTapR(i, getCurrentFocus())) {
            this.mDevSupportManager.handleReloadJS();
        }
        return super.onKeyUp(i, keyEvent);
    }

    protected RedBoxDialog(Context context, DevSupportManager devSupportManager, RedBoxHandler redBoxHandler) {
        super(context, R.style.mc);
        requestWindowFeature(1);
        setContentView(R.layout.ahl);
        this.mDevSupportManager = devSupportManager;
        this.mDoubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
        this.mRedBoxHandler = redBoxHandler;
        this.mStackView = (ListView) findViewById(R.id.cvq);
        this.mStackView.setOnItemClickListener(this);
        this.mReloadJsButton = (Button) findViewById(R.id.cvn);
        this.mReloadJsButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                RedBoxDialog.this.mDevSupportManager.handleReloadJS();
            }
        });
        this.mDismissButton = (Button) findViewById(R.id.cvk);
        this.mDismissButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                RedBoxDialog.this.dismiss();
            }
        });
        this.mCopyToClipboardButton = (Button) findViewById(R.id.cvj);
        this.mCopyToClipboardButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                String lastErrorTitle = RedBoxDialog.this.mDevSupportManager.getLastErrorTitle();
                StackFrame[] lastErrorStack = RedBoxDialog.this.mDevSupportManager.getLastErrorStack();
                C13854a.m40916b(lastErrorTitle);
                C13854a.m40916b(lastErrorStack);
                new CopyToHostClipBoardTask(RedBoxDialog.this.mDevSupportManager).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[]{StackTraceHelper.formatStackTrace(lastErrorTitle, lastErrorStack)});
            }
        });
        if (this.mRedBoxHandler != null && this.mRedBoxHandler.isReportEnabled()) {
            this.mLoadingIndicator = (ProgressBar) findViewById(R.id.cvm);
            this.mLineSeparator = findViewById(R.id.cvl);
            this.mReportTextView = (TextView) findViewById(R.id.cvp);
            this.mReportTextView.setMovementMethod(LinkMovementMethod.getInstance());
            this.mReportTextView.setHighlightColor(0);
            this.mReportButton = (Button) findViewById(R.id.cvo);
            this.mReportButton.setOnClickListener(this.mReportButtonOnClickListener);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        new OpenStackFrameTask(this.mDevSupportManager).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new StackFrame[]{(StackFrame) this.mStackView.getAdapter().getItem(i)});
    }
}
