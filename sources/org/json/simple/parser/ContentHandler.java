package org.json.simple.parser;

import java.io.IOException;

public interface ContentHandler {
    boolean endArray() throws ParseException, IOException;

    void endJSON() throws ParseException, IOException;

    boolean endObject() throws ParseException, IOException;

    boolean endObjectEntry() throws ParseException, IOException;

    boolean primitive(Object obj) throws ParseException, IOException;

    boolean startArray() throws ParseException, IOException;

    void startJSON() throws ParseException, IOException;

    boolean startObject() throws ParseException, IOException;

    boolean startObjectEntry(String str) throws ParseException, IOException;
}
