package com.facebook.react.modules.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.common.ModuleDataCleaner.Cleanable;
import java.util.HashSet;
import java.util.Iterator;

@ReactModule(name = "AsyncSQLiteDBStorage")
public final class AsyncStorageModule extends ReactContextBaseJavaModule implements Cleanable {
    public ReactDatabaseSupplier mReactDatabaseSupplier;
    private boolean mShuttingDown;

    public final String getName() {
        return "AsyncSQLiteDBStorage";
    }

    public final void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }

    public final void clearSensitiveData() {
        this.mReactDatabaseSupplier.clearAndCloseDatabase();
    }

    public final void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    public final boolean ensureDatabase() {
        if (this.mShuttingDown || !this.mReactDatabaseSupplier.ensureDatabase()) {
            return false;
        }
        return true;
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactDatabaseSupplier = ReactDatabaseSupplier.getInstance(reactApplicationContext);
    }

    @ReactMethod
    public final void clear(final Callback callback) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                if (!AsyncStorageModule.this.mReactDatabaseSupplier.ensureDatabase()) {
                    callback.invoke(AsyncStorageErrorUtil.getDBError(null));
                    return;
                }
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.clear();
                    callback.invoke(new Object[0]);
                } catch (Exception e) {
                    C13286a.m38854b("ReactNative", e.getMessage(), (Throwable) e);
                    callback.invoke(AsyncStorageErrorUtil.getError(null, e.getMessage()));
                }
            }
        }.execute(new Void[0]);
    }

    @ReactMethod
    public final void getAllKeys(final Callback callback) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    callback.invoke(AsyncStorageErrorUtil.getDBError(null), null);
                    return;
                }
                WritableArray createArray = Arguments.createArray();
                Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.get().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
                try {
                    if (query.moveToFirst()) {
                        do {
                            createArray.pushString(query.getString(0));
                        } while (query.moveToNext());
                    }
                    query.close();
                    callback.invoke(null, createArray);
                } catch (Exception e) {
                    C13286a.m38854b("ReactNative", e.getMessage(), (Throwable) e);
                    callback.invoke(AsyncStorageErrorUtil.getError(null, e.getMessage()), null);
                    query.close();
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
        }.execute(new Void[0]);
    }

    @ReactMethod
    public final void multiMerge(final ReadableArray readableArray, final Callback callback) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                WritableMap writableMap = null;
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    callback.invoke(AsyncStorageErrorUtil.getDBError(null));
                    return;
                }
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.get().beginTransaction();
                    int i = 0;
                    while (i < readableArray.size()) {
                        if (readableArray.getArray(i).size() != 2) {
                            WritableMap invalidValueError = AsyncStorageErrorUtil.getInvalidValueError(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                                return;
                            } catch (Exception e) {
                                C13286a.m38854b("ReactNative", e.getMessage(), (Throwable) e);
                                if (invalidValueError == null) {
                                    AsyncStorageErrorUtil.getError(null, e.getMessage());
                                }
                                return;
                            }
                        } else if (readableArray.getArray(i).getString(0) == null) {
                            WritableMap invalidKeyError = AsyncStorageErrorUtil.getInvalidKeyError(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                                return;
                            } catch (Exception e2) {
                                C13286a.m38854b("ReactNative", e2.getMessage(), (Throwable) e2);
                                if (invalidKeyError == null) {
                                    AsyncStorageErrorUtil.getError(null, e2.getMessage());
                                }
                                return;
                            }
                        } else if (readableArray.getArray(i).getString(1) == null) {
                            WritableMap invalidValueError2 = AsyncStorageErrorUtil.getInvalidValueError(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                                return;
                            } catch (Exception e3) {
                                C13286a.m38854b("ReactNative", e3.getMessage(), (Throwable) e3);
                                if (invalidValueError2 == null) {
                                    AsyncStorageErrorUtil.getError(null, e3.getMessage());
                                }
                                return;
                            }
                        } else if (!AsyncLocalStorageUtil.mergeImpl(AsyncStorageModule.this.mReactDatabaseSupplier.get(), readableArray.getArray(i).getString(0), readableArray.getArray(i).getString(1))) {
                            WritableMap dBError = AsyncStorageErrorUtil.getDBError(null);
                            try {
                                return;
                            } catch (Exception e4) {
                                C13286a.m38854b("ReactNative", e4.getMessage(), (Throwable) e4);
                                if (dBError == null) {
                                    AsyncStorageErrorUtil.getError(null, e4.getMessage());
                                }
                                return;
                            }
                        } else {
                            i++;
                        }
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.get().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                    } catch (Exception e5) {
                        C13286a.m38854b("ReactNative", e5.getMessage(), (Throwable) e5);
                        writableMap = AsyncStorageErrorUtil.getError(null, e5.getMessage());
                    }
                } catch (Exception e6) {
                    C13286a.m38854b("ReactNative", e6.getMessage(), (Throwable) e6);
                    WritableMap error = AsyncStorageErrorUtil.getError(null, e6.getMessage());
                    try {
                    } catch (Exception e7) {
                        C13286a.m38854b("ReactNative", e7.getMessage(), (Throwable) e7);
                        if (error == null) {
                            error = AsyncStorageErrorUtil.getError(null, e7.getMessage());
                        }
                    }
                    writableMap = error;
                } finally {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                    } catch (Exception e8) {
                        C13286a.m38854b("ReactNative", e8.getMessage(), (Throwable) e8);
                        AsyncStorageErrorUtil.getError(null, e8.getMessage());
                    }
                }
                if (writableMap != null) {
                    callback.invoke(writableMap);
                    return;
                }
                callback.invoke(new Object[0]);
            }
        }.execute(new Void[0]);
    }

    @ReactMethod
    public final void multiGet(final ReadableArray readableArray, final Callback callback) {
        if (readableArray == null) {
            callback.invoke(AsyncStorageErrorUtil.getInvalidKeyError(null), null);
            return;
        }
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    callback.invoke(AsyncStorageErrorUtil.getDBError(null), null);
                    return;
                }
                String[] strArr = {"key", "value"};
                HashSet hashSet = new HashSet();
                WritableArray createArray = Arguments.createArray();
                int i = 0;
                while (i < readableArray.size()) {
                    int min = Math.min(readableArray.size() - i, 999);
                    int i2 = min;
                    int i3 = i;
                    Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.get().query("catalystLocalStorage", strArr, AsyncLocalStorageUtil.buildKeySelection(min), AsyncLocalStorageUtil.buildKeySelectionArgs(readableArray, i, min), null, null, null);
                    hashSet.clear();
                    try {
                        if (query.getCount() != readableArray.size()) {
                            for (int i4 = i3; i4 < i3 + i2; i4++) {
                                hashSet.add(readableArray.getString(i4));
                            }
                        }
                        if (query.moveToFirst()) {
                            do {
                                WritableArray createArray2 = Arguments.createArray();
                                createArray2.pushString(query.getString(0));
                                createArray2.pushString(query.getString(1));
                                createArray.pushArray(createArray2);
                                hashSet.remove(query.getString(0));
                            } while (query.moveToNext());
                        }
                        query.close();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            WritableArray createArray3 = Arguments.createArray();
                            createArray3.pushString(str);
                            createArray3.pushNull();
                            createArray.pushArray(createArray3);
                        }
                        hashSet.clear();
                        i = i3 + 999;
                    } catch (Exception e) {
                        C13286a.m38854b("ReactNative", e.getMessage(), (Throwable) e);
                        callback.invoke(AsyncStorageErrorUtil.getError(null, e.getMessage()), null);
                        query.close();
                        return;
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                callback.invoke(null, createArray);
            }
        }.execute(new Void[0]);
    }

    @ReactMethod
    public final void multiRemove(final ReadableArray readableArray, final Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(AsyncStorageErrorUtil.getInvalidKeyError(null));
            return;
        }
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                WritableMap writableMap = null;
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    callback.invoke(AsyncStorageErrorUtil.getDBError(null));
                    return;
                }
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.get().beginTransaction();
                    for (int i = 0; i < readableArray.size(); i += 999) {
                        int min = Math.min(readableArray.size() - i, 999);
                        AsyncStorageModule.this.mReactDatabaseSupplier.get().delete("catalystLocalStorage", AsyncLocalStorageUtil.buildKeySelection(min), AsyncLocalStorageUtil.buildKeySelectionArgs(readableArray, i, min));
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.get().setTransactionSuccessful();
                    try {
                    } catch (Exception e) {
                        C13286a.m38854b("ReactNative", e.getMessage(), (Throwable) e);
                        writableMap = AsyncStorageErrorUtil.getError(null, e.getMessage());
                    }
                } catch (Exception e2) {
                    C13286a.m38854b("ReactNative", e2.getMessage(), (Throwable) e2);
                    WritableMap error = AsyncStorageErrorUtil.getError(null, e2.getMessage());
                    try {
                    } catch (Exception e3) {
                        C13286a.m38854b("ReactNative", e3.getMessage(), (Throwable) e3);
                        if (error == null) {
                            error = AsyncStorageErrorUtil.getError(null, e3.getMessage());
                        }
                    }
                    writableMap = error;
                } finally {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                    } catch (Exception e4) {
                        C13286a.m38854b("ReactNative", e4.getMessage(), (Throwable) e4);
                        AsyncStorageErrorUtil.getError(null, e4.getMessage());
                    }
                }
                if (writableMap != null) {
                    callback.invoke(writableMap);
                    return;
                }
                callback.invoke(new Object[0]);
            }
        }.execute(new Void[0]);
    }

    @ReactMethod
    public final void multiSet(final ReadableArray readableArray, final Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(AsyncStorageErrorUtil.getInvalidKeyError(null));
            return;
        }
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                WritableMap writableMap = null;
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    callback.invoke(AsyncStorageErrorUtil.getDBError(null));
                    return;
                }
                SQLiteStatement compileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.get().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.get().beginTransaction();
                    int i = 0;
                    while (i < readableArray.size()) {
                        if (readableArray.getArray(i).size() != 2) {
                            WritableMap invalidValueError = AsyncStorageErrorUtil.getInvalidValueError(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                                return;
                            } catch (Exception e) {
                                C13286a.m38854b("ReactNative", e.getMessage(), (Throwable) e);
                                if (invalidValueError == null) {
                                    AsyncStorageErrorUtil.getError(null, e.getMessage());
                                }
                                return;
                            }
                        } else if (readableArray.getArray(i).getString(0) == null) {
                            WritableMap invalidKeyError = AsyncStorageErrorUtil.getInvalidKeyError(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                                return;
                            } catch (Exception e2) {
                                C13286a.m38854b("ReactNative", e2.getMessage(), (Throwable) e2);
                                if (invalidKeyError == null) {
                                    AsyncStorageErrorUtil.getError(null, e2.getMessage());
                                }
                                return;
                            }
                        } else if (readableArray.getArray(i).getString(1) == null) {
                            WritableMap invalidValueError2 = AsyncStorageErrorUtil.getInvalidValueError(null);
                            try {
                                return;
                            } catch (Exception e3) {
                                C13286a.m38854b("ReactNative", e3.getMessage(), (Throwable) e3);
                                if (invalidValueError2 == null) {
                                    AsyncStorageErrorUtil.getError(null, e3.getMessage());
                                }
                                return;
                            }
                        } else {
                            compileStatement.clearBindings();
                            compileStatement.bindString(1, readableArray.getArray(i).getString(0));
                            compileStatement.bindString(2, readableArray.getArray(i).getString(1));
                            compileStatement.execute();
                            i++;
                        }
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.get().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                    } catch (Exception e4) {
                        C13286a.m38854b("ReactNative", e4.getMessage(), (Throwable) e4);
                        writableMap = AsyncStorageErrorUtil.getError(null, e4.getMessage());
                    }
                } catch (Exception e5) {
                    C13286a.m38854b("ReactNative", e5.getMessage(), (Throwable) e5);
                    WritableMap error = AsyncStorageErrorUtil.getError(null, e5.getMessage());
                    try {
                    } catch (Exception e6) {
                        C13286a.m38854b("ReactNative", e6.getMessage(), (Throwable) e6);
                        if (error == null) {
                            error = AsyncStorageErrorUtil.getError(null, e6.getMessage());
                        }
                    }
                    writableMap = error;
                } finally {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.get().endTransaction();
                    } catch (Exception e7) {
                        C13286a.m38854b("ReactNative", e7.getMessage(), (Throwable) e7);
                        AsyncStorageErrorUtil.getError(null, e7.getMessage());
                    }
                }
                if (writableMap != null) {
                    callback.invoke(writableMap);
                    return;
                }
                callback.invoke(new Object[0]);
            }
        }.execute(new Void[0]);
    }
}
