package com.bytedance.boost_multidex;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Result {
    private static Result result = new Result();
    public boolean continuousInterruptHappened;
    public File dataDir;
    public File dexDir;
    public List<String> dexInfoList = new ArrayList();
    public Throwable fatalThrowable;
    public long freeSpaceAfter;
    public long freeSpaceBefore;
    public int interruptCount;
    public boolean isYunOS;
    public boolean modified;
    public File optDexDir;
    public File rootDir;
    public boolean supportFastLoadDex;
    public List<Throwable> unFatalThrowable = new ArrayList();
    public String vmLibName;
    public File zipDir;

    private Result() {
    }

    public static Result get() {
        return result != null ? result : new Result();
    }

    public void addDexInfo(String str) {
        this.dexInfoList.add(str);
    }

    public void addUnFatalThrowable(Throwable th) {
        this.unFatalThrowable.add(th);
    }

    public void setDirs(File file, File file2, File file3, File file4, File file5) {
        this.dataDir = file;
        this.rootDir = file2;
        this.dexDir = file3;
        this.optDexDir = file4;
        this.zipDir = file5;
    }

    public void setFatalThrowable(Throwable th) {
        this.fatalThrowable = th;
    }
}
