package org.apache.commons.net.ntp;

import java.net.DatagramPacket;

public interface NtpV3Packet {
    DatagramPacket getDatagramPacket();

    TimeStamp getOriginateTimeStamp();

    TimeStamp getReceiveTimeStamp();

    TimeStamp getTransmitTimeStamp();

    void setMode(int i);

    void setTransmitTime(TimeStamp timeStamp);

    void setVersion(int i);
}
