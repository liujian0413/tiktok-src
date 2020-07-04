package bolts;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AggregateException extends Exception {
    private static final long serialVersionUID = 1;
    private List<Throwable> innerThrowables;

    public List<Throwable> getInnerThrowables() {
        return this.innerThrowables;
    }

    public Throwable[] getCauses() {
        return (Throwable[]) this.innerThrowables.toArray(new Throwable[this.innerThrowables.size()]);
    }

    public List<Exception> getErrors() {
        ArrayList arrayList = new ArrayList();
        if (this.innerThrowables == null) {
            return arrayList;
        }
        for (Throwable th : this.innerThrowables) {
            if (th instanceof Exception) {
                arrayList.add((Exception) th);
            } else {
                arrayList.add(new Exception(th));
            }
        }
        return arrayList;
    }

    public AggregateException(List<? extends Throwable> list) {
        this("There were multiple errors.", list);
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append(Integer.toString(i));
            printStream.append(": ");
            C6497a.m20179a(th, printStream);
            printStream.append("\n");
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append(Integer.toString(i));
            printWriter.append(": ");
            C6497a.m20180a(th, printWriter);
            printWriter.append("\n");
        }
    }

    public AggregateException(String str, Throwable[] thArr) {
        this(str, Arrays.asList(thArr));
    }

    public AggregateException(String str, List<? extends Throwable> list) {
        Throwable th;
        if (list == null || list.size() <= 0) {
            th = null;
        } else {
            th = (Throwable) list.get(0);
        }
        super(str, th);
        this.innerThrowables = Collections.unmodifiableList(list);
    }
}
