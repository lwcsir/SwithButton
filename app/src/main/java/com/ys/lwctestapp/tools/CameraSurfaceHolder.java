package com.ys.lwctestapp.tools;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * @author lwc
 * 2019/11/28
 * 描述：$des$
 */
public class CameraSurfaceHolder {
    Context context;
    SurfaceHolder surfaceHolder;
    SurfaceView surfaceView;
    SurfaceViewCallback callback = new SurfaceViewCallback();

    /**
     * 设置相机界面SurfaceView的Holder
     * @param context 从相机所在的Activity传入的context
     * @param surfaceView Holder所绑定的响应的SurfaceView
     * */
    public void setCameraSurfaceHolder(Context context, SurfaceView surfaceView) {
        this.context = context;
        this.surfaceView = surfaceView;
        surfaceHolder = surfaceView.getHolder();
        surfaceHolder.addCallback(callback);
        surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
        callback.setContext(context);
    }
}
