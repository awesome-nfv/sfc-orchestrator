package org.project.sfc.com.OpenBaton.Messages;

/**
 * Created by mah on 3/1/16.
 */

import java.util.UUID;

/**
 * Created by maa on 09.10.15.
 */
public class SFdeleteAppResponse {

    private String appID;
    private String appName;
    private String nameSpace;
    private int code;

    public SFdeleteAppResponse() {
    }

    public SFdeleteAppResponse(String appID, String appName, String nameSpace, int deleteStatus) {
        this.appID = appID;
        this.appName = appName;
        this.nameSpace = nameSpace;
        this.code = deleteStatus;
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}