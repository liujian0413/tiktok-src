package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CdnDomainRefresh */
public final class CdnDomainRefresh extends Message<CdnDomainRefresh, Builder> {
    public static final DefaultValueProtoAdapter<CdnDomainRefresh> ADAPTER = new ProtoAdapter_CdnDomainRefresh();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer keepalive_timeout;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer refresh_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean refresh_switch;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CdnDomainRefresh$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CdnDomainRefresh, Builder> {
        public Integer keepalive_timeout;
        public Integer refresh_interval;
        public Boolean refresh_switch;

        public final CdnDomainRefresh build() {
            return new CdnDomainRefresh(this.refresh_switch, this.refresh_interval, this.keepalive_timeout, super.buildUnknownFields());
        }

        public final Builder keepalive_timeout(Integer num) {
            this.keepalive_timeout = num;
            return this;
        }

        public final Builder refresh_interval(Integer num) {
            this.refresh_interval = num;
            return this;
        }

        public final Builder refresh_switch(Boolean bool) {
            this.refresh_switch = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CdnDomainRefresh$ProtoAdapter_CdnDomainRefresh */
    static final class ProtoAdapter_CdnDomainRefresh extends DefaultValueProtoAdapter<CdnDomainRefresh> {
        public final CdnDomainRefresh redact(CdnDomainRefresh cdnDomainRefresh) {
            return cdnDomainRefresh;
        }

        public ProtoAdapter_CdnDomainRefresh() {
            super(FieldEncoding.LENGTH_DELIMITED, CdnDomainRefresh.class);
        }

        public final CdnDomainRefresh decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (CdnDomainRefresh) null);
        }

        public final int encodedSize(CdnDomainRefresh cdnDomainRefresh) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, cdnDomainRefresh.refresh_switch) + ProtoAdapter.INT32.encodedSizeWithTag(2, cdnDomainRefresh.refresh_interval) + ProtoAdapter.INT32.encodedSizeWithTag(3, cdnDomainRefresh.keepalive_timeout) + cdnDomainRefresh.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, CdnDomainRefresh cdnDomainRefresh) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, cdnDomainRefresh.refresh_switch);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, cdnDomainRefresh.refresh_interval);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, cdnDomainRefresh.keepalive_timeout);
            protoWriter.writeBytes(cdnDomainRefresh.unknownFields());
        }

        public final CdnDomainRefresh decode(ProtoReader protoReader, CdnDomainRefresh cdnDomainRefresh) throws IOException {
            Builder builder;
            CdnDomainRefresh cdnDomainRefresh2 = (CdnDomainRefresh) C10938a.m32097a().mo26425a(CdnDomainRefresh.class, cdnDomainRefresh);
            if (cdnDomainRefresh2 != null) {
                builder = cdnDomainRefresh2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.refresh_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.refresh_interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.keepalive_timeout((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (cdnDomainRefresh2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Integer getKeepaliveTimeout() throws NullValueException {
        if (this.keepalive_timeout != null) {
            return this.keepalive_timeout;
        }
        throw new NullValueException();
    }

    public final Integer getRefreshInterval() throws NullValueException {
        if (this.refresh_interval != null) {
            return this.refresh_interval;
        }
        throw new NullValueException();
    }

    public final Boolean getRefreshSwitch() throws NullValueException {
        if (this.refresh_switch != null) {
            return this.refresh_switch;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.refresh_switch = this.refresh_switch;
        builder.refresh_interval = this.refresh_interval;
        builder.keepalive_timeout = this.keepalive_timeout;
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
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.refresh_switch != null) {
            i = this.refresh_switch.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.refresh_interval != null) {
            i2 = this.refresh_interval.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.keepalive_timeout != null) {
            i4 = this.keepalive_timeout.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.refresh_switch != null) {
            sb.append(", refresh_switch=");
            sb.append(this.refresh_switch);
        }
        if (this.refresh_interval != null) {
            sb.append(", refresh_interval=");
            sb.append(this.refresh_interval);
        }
        if (this.keepalive_timeout != null) {
            sb.append(", keepalive_timeout=");
            sb.append(this.keepalive_timeout);
        }
        StringBuilder replace = sb.replace(0, 2, "CdnDomainRefresh{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CdnDomainRefresh)) {
            return false;
        }
        CdnDomainRefresh cdnDomainRefresh = (CdnDomainRefresh) obj;
        if (!unknownFields().equals(cdnDomainRefresh.unknownFields()) || !Internal.equals(this.refresh_switch, cdnDomainRefresh.refresh_switch) || !Internal.equals(this.refresh_interval, cdnDomainRefresh.refresh_interval) || !Internal.equals(this.keepalive_timeout, cdnDomainRefresh.keepalive_timeout)) {
            return false;
        }
        return true;
    }

    public CdnDomainRefresh(Boolean bool, Integer num, Integer num2) {
        this(bool, num, num2, ByteString.EMPTY);
    }

    public CdnDomainRefresh(Boolean bool, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.refresh_switch = bool;
        this.refresh_interval = num;
        this.keepalive_timeout = num2;
    }
}
