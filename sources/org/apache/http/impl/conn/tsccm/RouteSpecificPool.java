package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.LangUtils;

public class RouteSpecificPool {
    protected final LinkedList<BasicPoolEntry> freeEntries;
    private final Log log = LogFactory.getLog(getClass());
    protected final int maxEntries;
    protected int numEntries;
    protected final HttpRoute route;
    protected final Queue<WaitingThread> waitingThreads;

    public final int getMaxEntries() {
        return this.maxEntries;
    }

    public final HttpRoute getRoute() {
        return this.route;
    }

    public int getCapacity() {
        return this.maxEntries - this.numEntries;
    }

    public boolean hasThread() {
        if (!this.waitingThreads.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isUnused() {
        if (this.numEntries > 0 || !this.waitingThreads.isEmpty()) {
            return false;
        }
        return true;
    }

    public WaitingThread nextThread() {
        return (WaitingThread) this.waitingThreads.peek();
    }

    public void dropEntry() {
        if (this.numEntries > 0) {
            this.numEntries--;
            return;
        }
        throw new IllegalStateException("There is no entry that could be dropped.");
    }

    public boolean deleteEntry(BasicPoolEntry basicPoolEntry) {
        boolean remove = this.freeEntries.remove(basicPoolEntry);
        if (remove) {
            this.numEntries--;
        }
        return remove;
    }

    public void queueThread(WaitingThread waitingThread) {
        if (waitingThread != null) {
            this.waitingThreads.add(waitingThread);
            return;
        }
        throw new IllegalArgumentException("Waiting thread must not be null.");
    }

    public void removeThread(WaitingThread waitingThread) {
        if (waitingThread != null) {
            this.waitingThreads.remove(waitingThread);
        }
    }

    public void createdEntry(BasicPoolEntry basicPoolEntry) {
        if (this.route.equals(basicPoolEntry.getPlannedRoute())) {
            this.numEntries++;
            return;
        }
        StringBuilder sb = new StringBuilder("Entry not planned for this pool.\npool: ");
        sb.append(this.route);
        sb.append("\nplan: ");
        sb.append(basicPoolEntry.getPlannedRoute());
        throw new IllegalArgumentException(sb.toString());
    }

    public void freeEntry(BasicPoolEntry basicPoolEntry) {
        if (this.numEntries <= 0) {
            StringBuilder sb = new StringBuilder("No entry created for this pool. ");
            sb.append(this.route);
            throw new IllegalStateException(sb.toString());
        } else if (this.numEntries > this.freeEntries.size()) {
            this.freeEntries.add(basicPoolEntry);
        } else {
            StringBuilder sb2 = new StringBuilder("No entry allocated from this pool. ");
            sb2.append(this.route);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public BasicPoolEntry allocEntry(Object obj) {
        if (!this.freeEntries.isEmpty()) {
            ListIterator listIterator = this.freeEntries.listIterator(this.freeEntries.size());
            while (listIterator.hasPrevious()) {
                BasicPoolEntry basicPoolEntry = (BasicPoolEntry) listIterator.previous();
                if (basicPoolEntry.getState() != null) {
                    if (LangUtils.equals(obj, basicPoolEntry.getState())) {
                    }
                }
                listIterator.remove();
                return basicPoolEntry;
            }
        }
        if (getCapacity() != 0 || this.freeEntries.isEmpty()) {
            return null;
        }
        BasicPoolEntry basicPoolEntry2 = (BasicPoolEntry) this.freeEntries.remove();
        basicPoolEntry2.shutdownEntry();
        try {
            basicPoolEntry2.getConnection().close();
        } catch (IOException e) {
            this.log.debug("I/O error closing connection", e);
        }
        return basicPoolEntry2;
    }

    public RouteSpecificPool(HttpRoute httpRoute, int i) {
        this.route = httpRoute;
        this.maxEntries = i;
        this.freeEntries = new LinkedList<>();
        this.waitingThreads = new LinkedList();
        this.numEntries = 0;
    }
}
