package com.howell.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.howell.action.ClientManager;
import com.howell.litenademo.R;
import com.howell.server.MyHttpServer;
import com.howell.utils.Constant;
import com.howell.utils.Utils;

import org.json.JSONException;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 使用iotnorthsdk model中自行封装
 */
public class MainActivity extends AppCompatActivity {

    ClientManager mMgr = ClientManager.getInstance();
    ImageView iv;
    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        iv = findViewById(R.id.imageView);
        Intent intent = new Intent(this, MyHttpServer.class);
        bindService(intent,conn,BIND_AUTO_CREATE);

    }

    @Override
    protected void onDestroy() {
        unbindService(conn);
        super.onDestroy();
    }

    @OnClick(R.id.btn_login)
    void login(){
        mMgr.init(MainActivity.this,true,Constant.SELFCERTPATH,Constant.SELFCERTPWD,Constant.BASE_URL);
        mMgr.login(Constant.APPID,Constant.SECRET);
    }
    @OnClick(R.id.btn_query)
    void query(){
        mMgr.queryDevices(Constant.APPID);
    }

    @OnClick(R.id.btn_send)
    void sendTestMsg(){
        String myIp = Utils.getIpAddressString();
        mMgr.init(MainActivity.this,false,null,null,"http://"+myIp+":8743");
        mMgr.testNotify();
    }

    @OnClick(R.id.btn_scribe)
    void scribe(){
        mMgr.subcribeNotify(Constant.APPID);
    }

    @OnClick(R.id.btn_discovery)
    void discovery(){
        try {
            mMgr.discoveryDevice(Constant.APPID);
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    @OnClick(R.id.btn_pic)
    void getPic(){
        mMgr.queryPicHistory(Constant.APPID,iv);
    }


    @OnClick(R.id.btn_test)
    void test(){
//        mMgr.queryDeviceStatus(Constant.APPID);
//        mMgr.queryDevice(Constant.APPID);
        mMgr.queryHistory(Constant.APPID);
//        mMgr.queryCapability(Constant.APPID);
//        mMgr.queryDeviceCmd(Constant.APPID);
    }

    @OnClick(R.id.btn_next)
    void nextPage(){
        startActivity(new Intent(this,ApiActivity.class));
    }

}
