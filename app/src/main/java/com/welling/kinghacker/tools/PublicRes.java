package com.welling.kinghacker.tools;


import android.os.Environment;

import java.io.File;

/**
 * Created by KingHacker on 3/11/2016.
 *
 */
public class PublicRes{
    private static PublicRes publicRes = null;
//    int overflow参数
    public int
                overFlowItemOffset = 100,//item偏移量
                marginLeft = 10,marginTop = 30,marginRight = 10,marginBottom = 30;
//    int
    static public final int OK = 1;
    static public final int ERROR = 0;

//String
    static public final String preferencesName = "NetMT";
    static public final String ACCOUNT = "account";
    static public final String PASSWORD = "password";
    static public final String AUTOLOGIN = "autoLogin";

    static public final String STATE = "state";
    static public final String COOKIE = "cookie";
    static public final String EXCEPTION = "exception";

    static public final String ROOTPATH = Environment.getExternalStorageDirectory() + "/NetMT";
    static public final String ECGPATH = ROOTPATH + "/ECG";

    static public final String IP = "http://172.18.43.83:8080/QYYLZLPT/";


    public String electrocarDiogram,
                    bloodSuger,
                    bloodFat,
                    bloodPresure,
                    bloodOxygen,
                    bloodSugerItem1,
                    bloodSugerItem2,
                    bloodSugerItem3;


    private PublicRes(){
        electrocarDiogram = "心电";
        bloodSuger = "血糖";
        bloodFat = "血脂";
        bloodOxygen = "血氧";
        bloodPresure = "血压";
        bloodSugerItem1 = "单次";
        bloodSugerItem2 = "全部";
        bloodSugerItem3 = "筛选";
        File file = new File(ROOTPATH);
        if (!file.exists()){
            file.mkdir();
        }

    }
    static public PublicRes getInstance(){
        if (publicRes == null){
            publicRes = new PublicRes();
        }
        return publicRes;
    }


}
