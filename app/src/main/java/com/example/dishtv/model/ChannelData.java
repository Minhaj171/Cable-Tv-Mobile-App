package com.example.dishtv;

/**
 * Created by MD Minhajul Islam on 6/13/2021.
 */
public class ChannelData {
    Integer channelLogo;
    String channelName;
    String channelType;

    public ChannelData(Integer channelLogo, String channelName, String channelType) {
        this.channelLogo = channelLogo;
        this.channelName = channelName;
        this.channelType = channelType;
    }

    public Integer getChannelLogo() {
        return channelLogo;
    }

    public void setChannelLogo(Integer channelLogo) {
        this.channelLogo = channelLogo;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    @Override
    public String toString() {
        return "ChannelData{" +
                "channelLogo=" + channelLogo +
                ", channelName='" + channelName + '\'' +
                ", channelType='" + channelType + '\'' +
                '}';
    }
}
