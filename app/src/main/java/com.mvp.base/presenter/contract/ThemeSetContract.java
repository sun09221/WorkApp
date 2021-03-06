package com.mvp.base.presenter.contract;


import com.mvp.base.base.BasePresenter;
import com.mvp.base.base.BaseView;
import com.mvp.base.model.bean.VideoType;

import java.util.List;

/**
 * Description: ThemeSetContract
 * Creator: cp
 * date: 2016/9/29 12:06
 */
public interface ThemeSetContract {

    interface View extends BaseView<Presenter> {

        boolean isActive();

        void showContent(List<VideoType> list);

    }

    interface Presenter extends BasePresenter {

        void getThemeData();

    }
}
