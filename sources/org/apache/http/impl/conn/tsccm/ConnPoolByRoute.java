package org.apache.http.impl.conn.tsccm;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;

public class ConnPoolByRoute extends AbstractConnPool {
    protected final Queue<BasicPoolEntry> freeConnections;
    private final Log log = LogFactory.getLog(getClass());
    protected final ClientConnectionOperator operator;
    private final HttpParams params;
    protected final Map<HttpRoute, RouteSpecificPool> routeToPool;
    protected final Queue<WaitingThread> waitingThreads;

    /* access modifiers changed from: protected */
    public Queue<BasicPoolEntry> createFreeConnQueue() {
        return new LinkedList();
    }

    /* access modifiers changed from: protected */
    public Map<HttpRoute, RouteSpecificPool> createRouteToPoolMap() {
        return new HashMap();
    }

    /* access modifiers changed from: protected */
    public Queue<WaitingThread> createWaitingThreadQueue() {
        return new LinkedList();
    }

    /* access modifiers changed from: protected */
    public void deleteLeastUsedEntry() {
        try {
            this.poolLock.lock();
            BasicPoolEntry basicPoolEntry = (BasicPoolEntry) this.freeConnections.remove();
            if (basicPoolEntry != null) {
                deleteEntry(basicPoolEntry);
            } else if (this.log.isDebugEnabled()) {
                this.log.debug("No free connection to delete.");
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    public void shutdown() {
        this.poolLock.lock();
        try {
            super.shutdown();
            Iterator it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry basicPoolEntry = (BasicPoolEntry) it.next();
                it.remove();
                if (this.log.isDebugEnabled()) {
                    Log log2 = this.log;
                    StringBuilder sb = new StringBuilder("Closing connection [");
                    sb.append(basicPoolEntry.getPlannedRoute());
                    sb.append("][");
                    sb.append(basicPoolEntry.getState());
                    sb.append("]");
                    log2.debug(sb.toString());
                }
                closeConnection(basicPoolEntry.getConnection());
            }
            Iterator it2 = this.waitingThreads.iterator();
            while (it2.hasNext()) {
                WaitingThread waitingThread = (WaitingThread) it2.next();
                it2.remove();
                waitingThread.wakeup();
            }
            this.routeToPool.clear();
        } finally {
            this.poolLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public RouteSpecificPool newRouteSpecificPool(HttpRoute httpRoute) {
        return new RouteSpecificPool(httpRoute, ConnManagerParams.getMaxConnectionsPerRoute(this.params).getMaxForRoute(httpRoute));
    }

    /* access modifiers changed from: protected */
    public void deleteEntry(BasicPoolEntry basicPoolEntry) {
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            StringBuilder sb = new StringBuilder("Deleting connection [");
            sb.append(plannedRoute);
            sb.append("][");
            sb.append(basicPoolEntry.getState());
            sb.append("]");
            log2.debug(sb.toString());
        }
        this.poolLock.lock();
        try {
            closeConnection(basicPoolEntry.getConnection());
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            routePool.deleteEntry(basicPoolEntry);
            this.numConnections--;
            if (routePool.isUnused()) {
                this.routeToPool.remove(plannedRoute);
            }
            this.idleConnHandler.remove(basicPoolEntry.getConnection());
        } finally {
            this.poolLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a A[Catch:{ all -> 0x0036 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool r4) {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.poolLock
            r0.lock()
            if (r4 == 0) goto L_0x0038
            boolean r0 = r4.hasThread()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0038
            org.apache.commons.logging.Log r0 = r3.log     // Catch:{ all -> 0x0036 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0031
            org.apache.commons.logging.Log r0 = r3.log     // Catch:{ all -> 0x0036 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "Notifying thread waiting on pool ["
            r1.<init>(r2)     // Catch:{ all -> 0x0036 }
            org.apache.http.conn.routing.HttpRoute r2 = r4.getRoute()     // Catch:{ all -> 0x0036 }
            r1.append(r2)     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "]"
            r1.append(r2)     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0036 }
            r0.debug(r1)     // Catch:{ all -> 0x0036 }
        L_0x0031:
            org.apache.http.impl.conn.tsccm.WaitingThread r4 = r4.nextThread()     // Catch:{ all -> 0x0036 }
            goto L_0x0068
        L_0x0036:
            r4 = move-exception
            goto L_0x0073
        L_0x0038:
            java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> r4 = r3.waitingThreads     // Catch:{ all -> 0x0036 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0036 }
            if (r4 != 0) goto L_0x0058
            org.apache.commons.logging.Log r4 = r3.log     // Catch:{ all -> 0x0036 }
            boolean r4 = r4.isDebugEnabled()     // Catch:{ all -> 0x0036 }
            if (r4 == 0) goto L_0x004f
            org.apache.commons.logging.Log r4 = r3.log     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "Notifying thread waiting on any pool"
            r4.debug(r0)     // Catch:{ all -> 0x0036 }
        L_0x004f:
            java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> r4 = r3.waitingThreads     // Catch:{ all -> 0x0036 }
            java.lang.Object r4 = r4.remove()     // Catch:{ all -> 0x0036 }
            org.apache.http.impl.conn.tsccm.WaitingThread r4 = (org.apache.http.impl.conn.tsccm.WaitingThread) r4     // Catch:{ all -> 0x0036 }
            goto L_0x0068
        L_0x0058:
            org.apache.commons.logging.Log r4 = r3.log     // Catch:{ all -> 0x0036 }
            boolean r4 = r4.isDebugEnabled()     // Catch:{ all -> 0x0036 }
            if (r4 == 0) goto L_0x0067
            org.apache.commons.logging.Log r4 = r3.log     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "Notifying no-one, there are no waiting threads"
            r4.debug(r0)     // Catch:{ all -> 0x0036 }
        L_0x0067:
            r4 = 0
        L_0x0068:
            if (r4 == 0) goto L_0x006d
            r4.wakeup()     // Catch:{ all -> 0x0036 }
        L_0x006d:
            java.util.concurrent.locks.Lock r4 = r3.poolLock
            r4.unlock()
            return
        L_0x0073:
            java.util.concurrent.locks.Lock r0 = r3.poolLock
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.tsccm.ConnPoolByRoute.notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool):void");
    }

    /* access modifiers changed from: protected */
    public WaitingThread newWaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        return new WaitingThread(condition, routeSpecificPool);
    }

    public PoolEntryRequest requestPoolEntry(final HttpRoute httpRoute, final Object obj) {
        final WaitingThreadAborter waitingThreadAborter = new WaitingThreadAborter();
        return new PoolEntryRequest() {
            public void abortRequest() {
                ConnPoolByRoute.this.poolLock.lock();
                try {
                    waitingThreadAborter.abort();
                } finally {
                    ConnPoolByRoute.this.poolLock.unlock();
                }
            }

            public BasicPoolEntry getPoolEntry(long j, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException {
                return ConnPoolByRoute.this.getEntryBlocking(httpRoute, obj, j, timeUnit, waitingThreadAborter);
            }
        };
    }

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        if (clientConnectionOperator != null) {
            this.operator = clientConnectionOperator;
            this.params = httpParams;
            this.freeConnections = createFreeConnQueue();
            this.waitingThreads = createWaitingThreadQueue();
            this.routeToPool = createRouteToPoolMap();
            return;
        }
        throw new IllegalArgumentException("Connection operator may not be null");
    }

    /* access modifiers changed from: protected */
    public RouteSpecificPool getRoutePool(HttpRoute httpRoute, boolean z) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routeSpecificPool = (RouteSpecificPool) this.routeToPool.get(httpRoute);
            if (routeSpecificPool == null && z) {
                routeSpecificPool = newRouteSpecificPool(httpRoute);
                this.routeToPool.put(httpRoute, routeSpecificPool);
            }
            return routeSpecificPool;
        } finally {
            this.poolLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public BasicPoolEntry createEntry(RouteSpecificPool routeSpecificPool, ClientConnectionOperator clientConnectionOperator) {
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            StringBuilder sb = new StringBuilder("Creating new connection [");
            sb.append(routeSpecificPool.getRoute());
            sb.append("]");
            log2.debug(sb.toString());
        }
        BasicPoolEntry basicPoolEntry = new BasicPoolEntry(clientConnectionOperator, routeSpecificPool.getRoute());
        this.poolLock.lock();
        try {
            routeSpecificPool.createdEntry(basicPoolEntry);
            this.numConnections++;
            this.leasedConnections.add(basicPoolEntry);
            return basicPoolEntry;
        } finally {
            this.poolLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public BasicPoolEntry getFreeEntry(RouteSpecificPool routeSpecificPool, Object obj) {
        this.poolLock.lock();
        boolean z = false;
        BasicPoolEntry basicPoolEntry = null;
        while (!z) {
            try {
                basicPoolEntry = routeSpecificPool.allocEntry(obj);
                if (basicPoolEntry != null) {
                    if (this.log.isDebugEnabled()) {
                        Log log2 = this.log;
                        StringBuilder sb = new StringBuilder("Getting free connection [");
                        sb.append(routeSpecificPool.getRoute());
                        sb.append("][");
                        sb.append(obj);
                        sb.append("]");
                        log2.debug(sb.toString());
                    }
                    this.freeConnections.remove(basicPoolEntry);
                    if (!this.idleConnHandler.remove(basicPoolEntry.getConnection())) {
                        if (this.log.isDebugEnabled()) {
                            Log log3 = this.log;
                            StringBuilder sb2 = new StringBuilder("Closing expired free connection [");
                            sb2.append(routeSpecificPool.getRoute());
                            sb2.append("][");
                            sb2.append(obj);
                            sb2.append("]");
                            log3.debug(sb2.toString());
                        }
                        closeConnection(basicPoolEntry.getConnection());
                        routeSpecificPool.dropEntry();
                        this.numConnections--;
                    } else {
                        this.leasedConnections.add(basicPoolEntry);
                    }
                } else if (this.log.isDebugEnabled()) {
                    Log log4 = this.log;
                    StringBuilder sb3 = new StringBuilder("No free connections [");
                    sb3.append(routeSpecificPool.getRoute());
                    sb3.append("][");
                    sb3.append(obj);
                    sb3.append("]");
                    log4.debug(sb3.toString());
                }
                z = true;
            } catch (Throwable th) {
                this.poolLock.unlock();
                throw th;
            }
        }
        this.poolLock.unlock();
        return basicPoolEntry;
    }

    public void freeEntry(BasicPoolEntry basicPoolEntry, boolean z, long j, TimeUnit timeUnit) {
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            StringBuilder sb = new StringBuilder("Releasing connection [");
            sb.append(plannedRoute);
            sb.append("][");
            sb.append(basicPoolEntry.getState());
            sb.append("]");
            log2.debug(sb.toString());
        }
        this.poolLock.lock();
        try {
            if (this.isShutDown) {
                closeConnection(basicPoolEntry.getConnection());
                return;
            }
            this.leasedConnections.remove(basicPoolEntry);
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            if (z) {
                if (this.log.isDebugEnabled()) {
                    Log log3 = this.log;
                    StringBuilder sb2 = new StringBuilder("Pooling connection [");
                    sb2.append(plannedRoute);
                    sb2.append("][");
                    sb2.append(basicPoolEntry.getState());
                    sb2.append("]; keep alive for ");
                    sb2.append(j);
                    sb2.append(" ");
                    sb2.append(timeUnit.toString());
                    log3.debug(sb2.toString());
                }
                routePool.freeEntry(basicPoolEntry);
                this.freeConnections.add(basicPoolEntry);
                this.idleConnHandler.add(basicPoolEntry.getConnection(), j, timeUnit);
            } else {
                routePool.dropEntry();
                this.numConnections--;
            }
            notifyWaitingThread(routePool);
            this.poolLock.unlock();
        } finally {
            this.poolLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public BasicPoolEntry getEntryBlocking(HttpRoute httpRoute, Object obj, long j, TimeUnit timeUnit, WaitingThreadAborter waitingThreadAborter) throws ConnectionPoolTimeoutException, InterruptedException {
        Date date;
        RouteSpecificPool routePool;
        WaitingThread waitingThread;
        boolean z;
        int maxTotalConnections = ConnManagerParams.getMaxTotalConnections(this.params);
        BasicPoolEntry basicPoolEntry = null;
        if (j > 0) {
            date = new Date(System.currentTimeMillis() + timeUnit.toMillis(j));
        } else {
            date = null;
        }
        this.poolLock.lock();
        try {
            routePool = getRoutePool(httpRoute, true);
            waitingThread = null;
            while (basicPoolEntry == null) {
                if (!this.isShutDown) {
                    if (this.log.isDebugEnabled()) {
                        Log log2 = this.log;
                        StringBuilder sb = new StringBuilder("Total connections kept alive: ");
                        sb.append(this.freeConnections.size());
                        log2.debug(sb.toString());
                        Log log3 = this.log;
                        StringBuilder sb2 = new StringBuilder("Total issued connections: ");
                        sb2.append(this.leasedConnections.size());
                        log3.debug(sb2.toString());
                        Log log4 = this.log;
                        StringBuilder sb3 = new StringBuilder("Total allocated connection: ");
                        sb3.append(this.numConnections);
                        sb3.append(" out of ");
                        sb3.append(maxTotalConnections);
                        log4.debug(sb3.toString());
                    }
                    basicPoolEntry = getFreeEntry(routePool, obj);
                    if (basicPoolEntry != null) {
                        break;
                    }
                    if (routePool.getCapacity() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.log.isDebugEnabled()) {
                        Log log5 = this.log;
                        StringBuilder sb4 = new StringBuilder("Available capacity: ");
                        sb4.append(routePool.getCapacity());
                        sb4.append(" out of ");
                        sb4.append(routePool.getMaxEntries());
                        sb4.append(" [");
                        sb4.append(httpRoute);
                        sb4.append("][");
                        sb4.append(obj);
                        sb4.append("]");
                        log5.debug(sb4.toString());
                    }
                    if (z && this.numConnections < maxTotalConnections) {
                        basicPoolEntry = createEntry(routePool, this.operator);
                    } else if (!z || this.freeConnections.isEmpty()) {
                        if (this.log.isDebugEnabled()) {
                            Log log6 = this.log;
                            StringBuilder sb5 = new StringBuilder("Need to wait for connection [");
                            sb5.append(httpRoute);
                            sb5.append("][");
                            sb5.append(obj);
                            sb5.append("]");
                            log6.debug(sb5.toString());
                        }
                        if (waitingThread == null) {
                            waitingThread = newWaitingThread(this.poolLock.newCondition(), routePool);
                            waitingThreadAborter.setWaitingThread(waitingThread);
                        }
                        routePool.queueThread(waitingThread);
                        this.waitingThreads.add(waitingThread);
                        boolean await = waitingThread.await(date);
                        routePool.removeThread(waitingThread);
                        this.waitingThreads.remove(waitingThread);
                        if (!await && date != null) {
                            if (date.getTime() <= System.currentTimeMillis()) {
                                throw new ConnectionPoolTimeoutException("Timeout waiting for connection");
                            }
                        }
                    } else {
                        deleteLeastUsedEntry();
                        basicPoolEntry = createEntry(routePool, this.operator);
                    }
                } else {
                    throw new IllegalStateException("Connection pool shut down.");
                }
            }
            this.poolLock.unlock();
            return basicPoolEntry;
        } catch (Throwable th) {
            this.poolLock.unlock();
            throw th;
        }
    }
}
