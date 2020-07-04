package com.bytedance.common.wschannel.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Frame extends Message<Frame, Builder> {
    public static final ProtoAdapter<Frame> ADAPTER = new ProtoAdapter_Frame();
    public static final Long DEFAULT_LOGID = Long.valueOf(0);
    public static final Integer DEFAULT_METHOD = Integer.valueOf(0);
    public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
    public static final Long DEFAULT_SEQID = Long.valueOf(0);
    public static final Integer DEFAULT_SERVICE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.article.wschannel.model.Frame$ExtendedEntry#ADAPTER", label = Label.REPEATED, tag = 5)
    public final List<ExtendedEntry> headers;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = Label.REQUIRED, tag = 2)
    public final Long logid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = Label.REQUIRED, tag = 4)
    public final Integer method;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 8)
    public final ByteString payload;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String payload_encoding;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String payload_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = Label.REQUIRED, tag = 1)
    public final Long seqid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = Label.REQUIRED, tag = 3)
    public final Integer service;

    public static final class Builder extends com.squareup.wire.Message.Builder<Frame, Builder> {
        public List<ExtendedEntry> headers = Internal.newMutableList();
        public Long logid;
        public Integer method;
        public ByteString payload;
        public String payload_encoding;
        public String payload_type;
        public Long seqid;
        public Integer service;

        public final Frame build() {
            if (this.seqid == null || this.logid == null || this.service == null || this.method == null) {
                throw Internal.missingRequiredFields(this.seqid, "seqid", this.logid, "logid", this.service, "service", this.method, "method");
            }
            Frame frame = new Frame(this.seqid, this.logid, this.service, this.method, this.headers, this.payload_encoding, this.payload_type, this.payload, super.buildUnknownFields());
            return frame;
        }

        public final Builder logid(Long l) {
            this.logid = l;
            return this;
        }

        public final Builder method(Integer num) {
            this.method = num;
            return this;
        }

        public final Builder payload(ByteString byteString) {
            this.payload = byteString;
            return this;
        }

        public final Builder payload_encoding(String str) {
            this.payload_encoding = str;
            return this;
        }

        public final Builder payload_type(String str) {
            this.payload_type = str;
            return this;
        }

        public final Builder seqid(Long l) {
            this.seqid = l;
            return this;
        }

        public final Builder service(Integer num) {
            this.service = num;
            return this;
        }

        public final Builder headers(List<ExtendedEntry> list) {
            Internal.checkElementsNotNull(list);
            this.headers = list;
            return this;
        }
    }

    public static final class ExtendedEntry extends Message<ExtendedEntry, Builder> {
        public static final ProtoAdapter<ExtendedEntry> ADAPTER = new ProtoAdapter_ExtendedEntry();
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REQUIRED, tag = 1)
        public final String key;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REQUIRED, tag = 2)
        public final String value;

        public static final class Builder extends com.squareup.wire.Message.Builder<ExtendedEntry, Builder> {
            public String key;
            public String value;

            public final ExtendedEntry build() {
                if (this.key != null && this.value != null) {
                    return new ExtendedEntry(this.key, this.value, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(this.key, "key", this.value, "value");
            }

            public final Builder key(String str) {
                this.key = str;
                return this;
            }

            public final Builder value(String str) {
                this.value = str;
                return this;
            }
        }

        static final class ProtoAdapter_ExtendedEntry extends ProtoAdapter<ExtendedEntry> {
            public ProtoAdapter_ExtendedEntry() {
                super(FieldEncoding.LENGTH_DELIMITED, ExtendedEntry.class);
            }

            public final ExtendedEntry redact(ExtendedEntry extendedEntry) {
                Builder newBuilder = extendedEntry.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final int encodedSize(ExtendedEntry extendedEntry) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, extendedEntry.key) + ProtoAdapter.STRING.encodedSizeWithTag(2, extendedEntry.value) + extendedEntry.unknownFields().size();
            }

            public final ExtendedEntry decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return builder.build();
                    } else if (nextTag == 1) {
                        builder.key((String) ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 2) {
                        builder.value((String) ProtoAdapter.STRING.decode(protoReader));
                    } else {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    }
                }
            }

            public final void encode(ProtoWriter protoWriter, ExtendedEntry extendedEntry) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, extendedEntry.key);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, extendedEntry.value);
                protoWriter.writeBytes(extendedEntry.unknownFields());
            }
        }

        public final Builder newBuilder() {
            Builder builder = new Builder();
            builder.key = this.key;
            builder.value = this.value;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = (((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.value.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", key=");
            sb.append(this.key);
            sb.append(", value=");
            sb.append(this.value);
            StringBuilder replace = sb.replace(0, 2, "ExtendedEntry{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExtendedEntry)) {
                return false;
            }
            ExtendedEntry extendedEntry = (ExtendedEntry) obj;
            if (!unknownFields().equals(extendedEntry.unknownFields()) || !this.key.equals(extendedEntry.key) || !this.value.equals(extendedEntry.value)) {
                return false;
            }
            return true;
        }

        public ExtendedEntry(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public ExtendedEntry(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.key = str;
            this.value = str2;
        }
    }

    static final class ProtoAdapter_Frame extends ProtoAdapter<Frame> {
        public ProtoAdapter_Frame() {
            super(FieldEncoding.LENGTH_DELIMITED, Frame.class);
        }

        public final Frame redact(Frame frame) {
            Builder newBuilder = frame.newBuilder();
            Internal.redactElements(newBuilder.headers, ExtendedEntry.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(Frame frame) {
            return ProtoAdapter.UINT64.encodedSizeWithTag(1, frame.seqid) + ProtoAdapter.UINT64.encodedSizeWithTag(2, frame.logid) + ProtoAdapter.INT32.encodedSizeWithTag(3, frame.service) + ProtoAdapter.INT32.encodedSizeWithTag(4, frame.method) + ExtendedEntry.ADAPTER.asRepeated().encodedSizeWithTag(5, frame.headers) + ProtoAdapter.STRING.encodedSizeWithTag(6, frame.payload_encoding) + ProtoAdapter.STRING.encodedSizeWithTag(7, frame.payload_type) + ProtoAdapter.BYTES.encodedSizeWithTag(8, frame.payload) + frame.unknownFields().size();
        }

        public final Frame decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.seqid((Long) ProtoAdapter.UINT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.logid((Long) ProtoAdapter.UINT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.service((Integer) ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.method((Integer) ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 5) {
                    builder.headers.add(ExtendedEntry.ADAPTER.decode(protoReader));
                } else if (nextTag == 6) {
                    builder.payload_encoding((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 7) {
                    builder.payload_type((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 8) {
                    builder.payload((ByteString) ProtoAdapter.BYTES.decode(protoReader));
                } else {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, Frame frame) throws IOException {
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, frame.seqid);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, frame.logid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, frame.service);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, frame.method);
            ExtendedEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, frame.headers);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, frame.payload_encoding);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, frame.payload_type);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 8, frame.payload);
            protoWriter.writeBytes(frame.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.seqid = this.seqid;
        builder.logid = this.logid;
        builder.service = this.service;
        builder.method = this.method;
        builder.headers = Internal.copyOf("headers", this.headers);
        builder.payload_encoding = this.payload_encoding;
        builder.payload_type = this.payload_type;
        builder.payload = this.payload;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = ((((((((((unknownFields().hashCode() * 37) + this.seqid.hashCode()) * 37) + this.logid.hashCode()) * 37) + this.service.hashCode()) * 37) + this.method.hashCode()) * 37) + this.headers.hashCode()) * 37;
        int i4 = 0;
        if (this.payload_encoding != null) {
            i = this.payload_encoding.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.payload_type != null) {
            i2 = this.payload_type.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.payload != null) {
            i4 = this.payload.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", seqid=");
        sb.append(this.seqid);
        sb.append(", logid=");
        sb.append(this.logid);
        sb.append(", service=");
        sb.append(this.service);
        sb.append(", method=");
        sb.append(this.method);
        if (!this.headers.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.payload_encoding != null) {
            sb.append(", payload_encoding=");
            sb.append(this.payload_encoding);
        }
        if (this.payload_type != null) {
            sb.append(", payload_type=");
            sb.append(this.payload_type);
        }
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        StringBuilder replace = sb.replace(0, 2, "Frame{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) obj;
        if (!unknownFields().equals(frame.unknownFields()) || !this.seqid.equals(frame.seqid) || !this.logid.equals(frame.logid) || !this.service.equals(frame.service) || !this.method.equals(frame.method) || !this.headers.equals(frame.headers) || !Internal.equals(this.payload_encoding, frame.payload_encoding) || !Internal.equals(this.payload_type, frame.payload_type) || !Internal.equals(this.payload, frame.payload)) {
            return false;
        }
        return true;
    }

    public Frame(Long l, Long l2, Integer num, Integer num2, List<ExtendedEntry> list, String str, String str2, ByteString byteString) {
        this(l, l2, num, num2, list, str, str2, byteString, ByteString.EMPTY);
    }

    public Frame(Long l, Long l2, Integer num, Integer num2, List<ExtendedEntry> list, String str, String str2, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.seqid = l;
        this.logid = l2;
        this.service = num;
        this.method = num2;
        this.headers = Internal.immutableCopyOf("headers", list);
        this.payload_encoding = str;
        this.payload_type = str2;
        this.payload = byteString;
    }
}
